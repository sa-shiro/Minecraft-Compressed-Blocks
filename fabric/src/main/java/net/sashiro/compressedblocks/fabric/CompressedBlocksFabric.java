package net.sashiro.compressedblocks.fabric;

import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ConfigTracker;
import net.neoforged.fml.config.ModConfig;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

/**
 * Fabric entry point for Compressed Blocks.
 *
 * <p>Initializes the common mod infrastructure, registers the startup configuration,
 * and registers all compressed blocks and crates when Fabric loads the mod.</p>
 *
 * @see CompressedBlocks
 * @see CBConfig
 * @see BlockRegistration
 * @see CrateRegistration
 * @see <a href="https://docs.fabricmc.net/develop">Fabric Developer Documentation</a>
 */
@SuppressWarnings({"UnstableApiUsage"})
public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CompressedBlocks.init();
        ConfigTracker.INSTANCE.registerConfig(ModConfig.Type.STARTUP, CBConfig.CONFIG_SPEC, CompressedBlocks.MOD_ID);

        BlockRegistration.registerBlocks();
        CrateRegistration.registerCrates();

        CompressedBlocks.LOGGER.info("Compressed Blocks Fabric mod initialized successfully. Registered {} Blocks and {} Crates.", CompressedBlocks.COMPRESSED_BLOCKS.size(), CompressedBlocks.CRATE_BLOCKS.size() + CompressedBlocks.CRATE_ITEMS.size());
    }
}
