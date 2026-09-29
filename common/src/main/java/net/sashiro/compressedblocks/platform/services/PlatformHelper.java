package net.sashiro.compressedblocks.platform.services;

import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.item.CrateItem;

@SuppressWarnings("unused")
public interface PlatformHelper {

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName() {
        return isDevelopmentEnvironment() ? "development" : "production";
    }

    /**
     * Function for platform-dependent registration of Blocks
     *
     * @param block the Block to be registered
     */
    void registerBlock(Block block);

    /**
     * Function for platform-dependent registration of Crates
     *
     * @param crateItem the CrateItem to be registered
     */
    void registerCrate(CrateItem crateItem);

    /**
     * Function for platform-dependent registration of Crates
     *
     * @param crateBlock the CrateBlock to be registered
     */
    void registerCrate(CrateBlock crateBlock);

    /**
     * Check if compressed blocks are enabled
     *
     * @return True if compressed blocks are enabled, false otherwise.
     */
    boolean areBlocksEnabled();

    /**
     * Check if crates are enabled
     *
     * @return True if crates are enabled, false otherwise.
     */
    boolean areCratesEnabled();

    /**
     * Get the maximum compression level supported
     *
     * @return The maximum compression level supported.
     */
    int maxCompressionLevel();

    /**
     * Get the hardness values for each compression level
     *
     * @return An array of hardness values.
     */
    float[] getHardnessArray();

    /**
     * Get the resistance values for each compression level
     *
     * @return An array of resistance values.
     */
    float[] getResistanceArray();

    /**
     * Get the maximum crate compression level supported
     *
     * @return The maximum crate compression level supported.
     */
    int maxCrateCompressionLevel();

    /**
     * Check if compression is enabled for a specific block/item name
     *
     * @param name The name of the block/item to check.
     * @return True if compression is enabled for the block/item, false otherwise.
     */
    boolean isBlockEnabled(String name);

    /**
     * Get the hardness and resistance multiplier for a specific block/item
     *
     * @param id The ID of the block/item to get the multiplier for.
     * @return The hardness and resistance multiplier.
     */
    float getHardnessResistanceMultiplier(String id);

    /**
     * Get the maximum compression level for a specific block/item
     *
     * @param id The ID of the block/item to get the maximum compression level for.
     * @return The maximum compression level.
     */
    int getMaxCompressionLevel(String id);
}