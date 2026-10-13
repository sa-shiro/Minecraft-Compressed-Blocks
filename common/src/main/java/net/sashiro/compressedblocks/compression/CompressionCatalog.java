package net.sashiro.compressedblocks.compression;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.platform.Services;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static net.sashiro.compressedblocks.CompressedBlocks.LOGGER;

public final class CompressionCatalog {

    public static final List<CompressionEntry> BLOCK_ENTRIES = loadEntries("blocks.jsonc");
    public static final List<CompressionEntry> CRATE_ENTRIES = loadEntries("crates.jsonc");

    // Utility class.
    private CompressionCatalog() {
    }

    /**
     * Retrieves a compression entry by its ID.
     *
     * @param entryId the ID of the entry to retrieve
     * @return the matching entry, or null if not found
     */
    public static CompressionEntry getEntryById(String entryId) {
        for (CompressionEntry entry : BLOCK_ENTRIES) {
            if (entry.id().equals(entryId)) {
                return entry;
            }
        }

        for (CompressionEntry entry : CRATE_ENTRIES) {
            if (entry.id().equals(entryId)) {
                return entry;
            }
        }

        return null;
    }

    /**
     * Loads the default catalog from the config directory, creating it
     * from the packaged resource when it does not exist.
     * <p>
     * Optional custom entries are loaded separately and merged afterward.
     */
    private static List<CompressionEntry> loadEntries(String fileName) {
        Path configDirectory = Services.PLATFORM.getConfigDirectory().resolve(CompressedBlocks.MOD_ID);

        Path defaultFile = configDirectory.resolve(fileName);
        Path customFile = configDirectory.resolve("custom_" + fileName);

        List<CompressionEntry> defaults;

        try {
            Files.createDirectories(configDirectory);

            if (Files.notExists(defaultFile)) {
                copyDefaultToConfig(fileName, defaultFile);
            }

            defaults = loadFileEntries(defaultFile);
        } catch (IOException | RuntimeException e) {
            LOGGER.warn("Could not load default catalog from {}. Falling back to the packaged resource.", defaultFile, e);

            // Do not overwrite an existing file if it is malformed.
            defaults = loadResourceEntries(fileName);
        }

        if (Files.notExists(customFile)) {
            return defaults;
        }

        try {
            List<CompressionEntry> customEntries = loadFileEntries(customFile);

            List<CompressionEntry> merged = new ArrayList<>(defaults);

            for (CompressionEntry entry : customEntries) {
                upsertEntry(merged, entry, customFile.toString());
            }

            LOGGER.warn("Loaded {} custom entries from {}. Total entries: {}.", customEntries.size(), customFile, merged.size());

            return merged;
        } catch (IOException | RuntimeException e) {
            LOGGER.warn("Could not load custom entries from {}. Ignoring the custom file.", customFile, e);

            return defaults;
        }
    }

    /**
     * Copies a packaged default resource into the config directory.
     * Existing files are never overwritten.
     */
    private static void copyDefaultToConfig(String fileName, Path target) throws IOException {
        String resourcePath = "/data/" + CompressedBlocks.MOD_ID + "/entries/" + fileName;

        try (InputStream stream = CompressionCatalog.class.getResourceAsStream(resourcePath)) {
            if (stream == null) {
                throw new IOException("Required resource is missing: " + resourcePath);
            }

            try {
                Files.copy(stream, target);
            } catch (FileAlreadyExistsException ignored) {
                // Preserve a file created by another operation.
            }
        }

        LOGGER.info("Created default compression catalog: {}", target);
    }

    /**
     * Loads and parses an existing JSONC file.
     */
    private static List<CompressionEntry> loadFileEntries(Path file) throws IOException {
        try (Reader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            JsonElement json = JsonParser.parseReader(reader);

            List<CompressionEntry> entries = CompressionEntry.CODEC.listOf()
                    .parse(JsonOps.INSTANCE, json)
                    .getOrThrow(error -> new IllegalArgumentException("Invalid compression entries in " + file + ": " + error));

            return normalizeEntries(entries, file.toString());
        }
    }

    /**
     * Loads the required built-in resource directly from the JAR.
     */
    private static List<CompressionEntry> loadResourceEntries(String fileName) {
        String resourcePath = "/data/" + CompressedBlocks.MOD_ID + "/entries/" + fileName;

        try (InputStream stream = CompressionCatalog.class.getResourceAsStream(resourcePath)) {
            if (stream == null) {
                throw new IllegalStateException("Required compression resource is missing: " + resourcePath);
            }

            try (Reader reader = new InputStreamReader(stream, StandardCharsets.UTF_8)) {
                JsonElement json = JsonParser.parseReader(reader);

                List<CompressionEntry> entries = CompressionEntry.CODEC.listOf()
                        .parse(JsonOps.INSTANCE, json)
                        .getOrThrow(error -> new IllegalStateException("Invalid built-in entries in " + resourcePath + ": " + error));

                return normalizeEntries(entries, resourcePath);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Could not read required resource: " + resourcePath, e);
        }
    }

    /**
     * Normalizes entries so duplicate IDs use the last definition.
     * The original list position is retained.
     */
    private static List<CompressionEntry> normalizeEntries(List<CompressionEntry> entries, String source) {
        List<CompressionEntry> normalized = new ArrayList<>();

        for (CompressionEntry entry : entries) {
            validateEntry(entry, source);
            upsertEntry(normalized, entry, source);
        }

        return normalized;
    }

    /**
     * Replaces an existing entry with the same ID, or appends a new one.
     */
    private static void upsertEntry(List<CompressionEntry> entries, CompressionEntry newEntry, String source) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).id().equals(newEntry.id())) {
                LOGGER.warn("Duplicate compression entry ID '{}' in {}; the later definition overrides the earlier one.", newEntry.id(), source);

                entries.set(i, newEntry);
                return;
            }
        }

        entries.add(newEntry);
    }

    /**
     * Validates constraints not enforced by the entry codec.
     */
    private static void validateEntry(CompressionEntry entry, String source) {
        if (entry.id() == null || entry.id().isBlank()) {
            throw new IllegalArgumentException("Empty entry ID in " + source);
        }

        if (entry.maxCompressionLevel() < 1) {
            throw new IllegalArgumentException("max_compression_level must be positive for '" + entry.id() + "' in " + source);
        }

        float multiplier = entry.hardnessResistanceMultiplier();

        if (!Float.isFinite(multiplier) || multiplier < 0.0f) {
            throw new IllegalArgumentException("Invalid hardness_resistance_multiplier for '" + entry.id() + "' in " + source);
        }

        if (entry.minecraftVersion() == null || entry.minecraftVersion().isBlank()) {
            throw new IllegalArgumentException("Empty minecraft_version for '" + entry.id() + "' in " + source);
        }
    }
}