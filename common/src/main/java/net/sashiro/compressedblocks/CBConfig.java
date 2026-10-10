package net.sashiro.compressedblocks;


import net.neoforged.neoforge.common.ModConfigSpec;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.util.VersionUtils;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CBConfig is a configuration class for the Compressed Blocks mod on the Fabric platform.
 * It defines various configuration options for compressed blocks and crates, including enabling/disabling
 * specific blocks and crates, as well as their hardness resistance multipliers and compression levels.
 */
public class CBConfig {

    public static final CBConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<CBConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(CBConfig::new);

        //Store the resulting values
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final ModConfigSpec.BooleanValue CONFIG_BLOCKS_ENABLED;
    public final ModConfigSpec.BooleanValue CONFIG_CRATES_ENABLED;

    public final ModConfigSpec.IntValue CONFIG_MAX_COMPRESSION_LEVEL;
    public final ModConfigSpec.IntValue CONFIG_MAX_CRATE_COMPRESSION_LEVEL;

    public final ModConfigSpec.ConfigValue<List<? extends Double>> CONFIG_HARDNESS_LEVELS;
    public final ModConfigSpec.ConfigValue<List<? extends Double>> CONFIG_RESISTANCE_LEVELS;
    public final Map<String, CompressionSettings> COMPRESSED_BLOCKS = new HashMap<>();
    public final Map<String, CompressionSettings> CRATES = new HashMap<>();

    /**
     * Initializes the configuration settings for compressed blocks and crates.
     *
     * @param builder The ModConfigSpec.Builder used to define configuration options.
     */
    private CBConfig(ModConfigSpec.Builder builder) {
        // Compressed Blocks Configuration
        // ----------------------------------------------------------------------------------
        // IMPORTANT:
        // These configuration options are loaded at client startup and are not synchronized
        // with the server. Any discrepancy between the client and server settings will prevent
        // the client from connecting to the server.
        //
        // Note:
        // - Changes to these settings require a game restart to take effect.
        // - Ensure that both the client and server have identical configuration values to
        //   avoid connection issues.
        // - Any modifications here will also spam the log with invalid and missing entries
        // ----------------------------------------------------------------------------------
        builder.comment("Compressed Blocks configuration");
        builder.comment("Changes require a game restart to take effect.");
        builder.comment("WARNING: These settings are loaded on startup and not synced with the server.");
        builder.comment("Ensure identical configuration on both client and server to prevent connection issues.");
        builder.comment("Any changes will log warnings for invalid or missing files.");
        builder.comment("----------------------------------------");

        builder.comment("Enable compressed blocks");
        CONFIG_BLOCKS_ENABLED = builder.define("blocksEnabled", true);
        builder.comment("Enable crates");
        CONFIG_CRATES_ENABLED = builder.define("cratesEnabled", true);
        builder.comment("Maximum compression level for all blocks");
        CONFIG_MAX_COMPRESSION_LEVEL = builder.defineInRange("maxCompressionLevel", 10, 1, 10);
        builder.comment("Maximum compression level for all crates");
        CONFIG_MAX_CRATE_COMPRESSION_LEVEL = builder.defineInRange("maxCrateCompressionLevel", 10, 1, 10);

        builder.comment("Hardness levels for each compression level");
        CONFIG_HARDNESS_LEVELS = builder.defineList("hardnessLevels", Arrays.asList(5.0D, 6.5D, 8.5D, 12.5D, 15.0D, 20.5D, 25.5D, 30.5D, 40.0D, 50.0D), o -> o instanceof Double);
        builder.comment("Resistance levels for each compression level");
        CONFIG_RESISTANCE_LEVELS = builder.defineList("resistanceLevels", Arrays.asList(35.5D, 75.0D, 150.0D, 300.0D, 600.0D, 800.0D, 1250.0D, 2000.0D, 5000.0D, 7500.0D), o -> o instanceof Double);


        builder.comment("Enabled blocks:");
        builder.comment("Note: Stone can not be disabled as it is required for the creative inventory icon.");
        for (CompressionEntry entry : CompressionCatalog.BLOCK_ENTRIES) {
            builder.push(entry.id());
            COMPRESSED_BLOCKS.put(entry.id(), new CompressionSettings(builder, entry));
            builder.pop();
        }

        builder.comment("Enabled crates:");
        builder.comment("Note: Golden Apple can not be disabled as it is required for the creative inventory icon.");
        for (CompressionEntry entry : CompressionCatalog.CRATE_ENTRIES) {
            builder.push(entry.id());
            CRATES.put(entry.id(), new CompressionSettings(builder, entry));
            builder.pop();
        }
    }

    /**
     * Checks if a block or crate is enabled based on the configuration settings.
     *
     * @param blockName The name of the block or crate to check.
     * @return true if the block or crate is enabled, false otherwise.
     */
    public boolean isEnabled(String blockName) {

        if ("STONE".equals(blockName)) return true;
        if ("GOLDEN_APPLE".equals(blockName)) return true;

        CompressionEntry entry = CompressionCatalog.getEntryById(blockName);
        if (entry == null) return false;
        if (!VersionUtils.isCompatibleWithCurrentVersion(entry)) return false;


        CompressionSettings block = COMPRESSED_BLOCKS.get(blockName);
        if (block != null) {
            if (!CONFIG_BLOCKS_ENABLED.get()) return false;
            return block.enabled.get();
        }

        CompressionSettings crate = CRATES.get(blockName);
        if (crate != null) {
            if (!CONFIG_CRATES_ENABLED.get()) return false;
            return crate.enabled.get();
        }

        return false;
    }

    /**
     * Retrieves the hardness values for each compression level from the configuration.
     *
     * @return An array of hardness values corresponding to each compression level.
     */
    public float[] getHardnessArray() {
        List<? extends Double> hardnessList = CONFIG_HARDNESS_LEVELS.get();
        float[] hardnessArray = new float[hardnessList.size()];

        if (hardnessArray.length < 10) {
            throw new IllegalStateException(
                    "Hardness levels configuration must contain at least 10 values."
            );
        }

        for (int i = 0; i < hardnessList.size(); i++) {
            hardnessArray[i] = hardnessList.get(i).floatValue();
        }

        return hardnessArray;
    }

    /**
     * Checks if a block or crate is enabled based on the configuration settings.
     *
     * @param blockName The name of the block or crate to check.
     * @return true if the block or crate is enabled, false otherwise.
     */
    public boolean isBlockEnabled(String blockName) {

        CompressionSettings block = COMPRESSED_BLOCKS.get(blockName);
        if (block != null) {
            if (!CONFIG_BLOCKS_ENABLED.get()) return false;
            if ("STONE".equals(blockName)) return true;
            return block.enabled.get();
        }

        CompressionSettings crate = CRATES.get(blockName);
        if (crate != null) {
            if (!CONFIG_CRATES_ENABLED.get()) return false;
            if ("GOLDEN_APPLE".equals(blockName)) return true;
            return crate.enabled.get();
        }

        return false;
    }

    /**
     * Retrieves the resistance values for each compression level from the configuration.
     *
     * @return An array of resistance values corresponding to each compression level.
     */
    public float[] getResistanceArray() {
        List<? extends Double> resistanceList = CONFIG_RESISTANCE_LEVELS.get();
        float[] resistanceArray = new float[resistanceList.size()];

        if (resistanceArray.length < 10) {
            throw new IllegalStateException(
                    "Resistance levels configuration must contain at least 10 values."
            );
        }

        for (int i = 0; i < resistanceList.size(); i++) {
            resistanceArray[i] = resistanceList.get(i).floatValue();
        }

        return resistanceArray;
    }

    /**
     * Retrieves the hardness resistance multiplier for a given block or crate.
     *
     * @param blockName The name of the block or crate.
     * @return The hardness resistance multiplier, or 1.0F if not found.
     */
    public float getHardnessResistanceMultiplier(String blockName) {

        CompressionSettings block = COMPRESSED_BLOCKS.get(blockName);
        if (block != null) {
            return block.hardnessResistanceMultiplier.get().floatValue();
        }

        CompressionSettings crate = CRATES.get(blockName);
        if (crate != null) {
            return crate.hardnessResistanceMultiplier.get().floatValue();
        }

        return 1.0F;
    }

    /**
     * Retrieves the maximum compression level for a given block or crate.
     *
     * @param blockName The name of the block or crate.
     * @return The maximum compression level, or 9 if not found.
     */
    public int getCompressionLevel(String blockName) {

        CompressionSettings block = COMPRESSED_BLOCKS.get(blockName);
        if (block != null) {
            return block.compressionLevel.get();
        }

        CompressionSettings crate = CRATES.get(blockName);
        if (crate != null) {
            return crate.compressionLevel.get();
        }

        return 10; // Default to 10 if not found
    }

    /**
     * CompressionSettings is a nested class that holds configuration settings for a specific block or crate.
     * It includes options for enabling/disabling the block, hardness resistance multiplier, compression level,
     * and whether smaller compression is allowed.
     */
    public static final class CompressionSettings {
        public final ModConfigSpec.BooleanValue enabled;
        public final ModConfigSpec.DoubleValue hardnessResistanceMultiplier;
        public final ModConfigSpec.IntValue compressionLevel;
        //public final ModConfigSpec.BooleanValue hasSmallerCompression;

        public CompressionSettings(ModConfigSpec.Builder builder, CompressionEntry entry) {
            enabled = builder.define("enabled", entry.enabledByDefault());

            double multiplier = entry.hardnessResistanceMultiplier();

            hardnessResistanceMultiplier = builder.defineInRange(
                    "hardnessResistanceMultiplier",
                    multiplier,
                    0.0D,
                    10000.0D
            );

            compressionLevel = builder.defineInRange("compressionLevel", entry.maxCompressionLevel(), 1, 10);
        }
    }
}
