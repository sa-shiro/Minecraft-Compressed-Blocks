package net.sashiro.compressedblocks.compression;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.serialization.JsonOps;
import net.minecraft.resources.ResourceLocation;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.Services;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * CompressionCatalog is a utility class that holds the catalog of compression entries for blocks and items.
 * Each entry defines the properties of a block or item that can be compressed, including its ID, kind, hardness/resistance multiplier,
 * maximum compression level, and whether it is enabled by default.
 */
public class CompressionCatalog {

    // BLOCKS
    /**
     * A list of compression entries for blocks, loaded from the "blocks.jsonc" file.
     * Each entry defines the properties of a block that can be compressed.
     */
    public static final List<CompressionEntry> BLOCK_ENTRIES = loadEntries("blocks.jsonc");

    // CRATES
    /**
     * A list of compression entries for crates, loaded from the "crates.jsonc" file.
     * Each entry defines the properties of a crate item or block that can be compressed.
     */
    public static final List<CompressionEntry> CRATE_ENTRIES = loadEntries("crates.jsonc");

    /**
     * Retrieves a compression entry by its ID from the catalog.
     *
     * @param entryId The ID of the compression entry to retrieve.
     * @return The CompressionEntry object with the specified ID, or null if not found.
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
     * Loads compression entries from a JSON file located in the mod's resources.
     * If a custom configuration file exists in the config directory, it will also load entries from that file and merge them with the default entries.
     *
     * @param fileName The name of the JSON file to load entries from.
     * @return A list of CompressionEntry objects loaded from the specified file and any custom configuration.
     */
    private static List<CompressionEntry> loadEntries(String fileName) {
        ResourceLocation location = new ResourceLocation(Constants.MOD_ID, "entries/" + fileName);
        List<CompressionEntry> entries;

        try (InputStream stream = CompressionEntry.class.getResourceAsStream("/data/" + location.getNamespace() + "/" + location.getPath())) {

            if (stream == null) {
                throw new IllegalStateException("Could not find entry file: " + location);
            }

            JsonElement json = JsonParser.parseReader(new InputStreamReader(stream, StandardCharsets.UTF_8));

            entries = new ArrayList<>(CompressionEntry.CODEC.listOf()
                    .parse(JsonOps.INSTANCE, json)
                    .getOrThrow(false, error -> new IllegalStateException(
                            "Failed to parse entry file " + location + ": " + error
                    )));

        } catch (IOException e) {
            throw new RuntimeException("Failed to load entry file: " + location, e);
        }

        // Load optional custom entries from config
        Path customFile = Services.PLATFORM.getConfigDirectory().resolve(Constants.MOD_ID).resolve("custom_" + fileName);

        if (Files.exists(customFile) && !"Forge".equals(Services.PLATFORM.getPlatformName())) {
            List<CompressionEntry> customEntries = loadEntries(customFile);

            for (CompressionEntry customEntry : customEntries) {
                boolean replaced = false;

                for (int i = 0; i < entries.size(); i++) {
                    if (entries.get(i).id().equals(customEntry.id())) {
                        entries.set(i, customEntry);
                        replaced = true;
                        break;
                    }
                }

                if (!replaced) {
                    entries.add(customEntry);
                }
            }
        }

        return entries;
    }

    /**
     * Loads compression entries from a custom JSON file located in the config directory.
     *
     * @param file The path to the custom JSON file.
     * @return A list of CompressionEntry objects loaded from the specified file.
     */
    private static List<CompressionEntry> loadEntries(Path file) {
        try (Reader reader = Files.newBufferedReader(file, StandardCharsets.UTF_8)) {
            JsonElement json = JsonParser.parseReader(reader);

            return CompressionEntry.CODEC.listOf()
                    .parse(JsonOps.INSTANCE, json)
                    .getOrThrow(false, error -> new IllegalStateException(
                            "Failed to parse custom entry file " + file + ": " + error
                    ));

        } catch (IOException e) {
            throw new RuntimeException("Failed to load custom entry file: " + file, e);
        }
    }
}