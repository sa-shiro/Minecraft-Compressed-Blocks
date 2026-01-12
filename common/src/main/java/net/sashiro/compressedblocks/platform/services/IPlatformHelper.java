package net.sashiro.compressedblocks.platform.services;

import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.item.CrateItem;

@SuppressWarnings("unused")
public interface IPlatformHelper {

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
     * @param name   the registry name of the Block
     * @param blocks the Blocks to be registered
     */
    void registerBlock(String name, Block... blocks);

    /**
     * Function for platform-dependent registration of Crates
     *
     * @param name        the registry name of the Block
     * @param crateBlocks the Crate Blocks to be registered
     */
    void registerCrate(String name, CrateItem... crateBlocks);

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
    boolean isCompressionEnabled(String name);
}