package net.sashiro.compressedblocks.fabric;

import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ConfigTracker;
import net.neoforged.fml.config.ModConfig;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

@SuppressWarnings({"UnstableApiUsage"})
public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CompressedBlocks.init();
        ConfigTracker.INSTANCE.registerConfig(ModConfig.Type.STARTUP, CBConfig.CONFIG_SPEC, CompressedBlocks.MOD_ID);

        BlockRegistration.registerBlocks();
        CrateRegistration.registerCrates();

        CompressedBlocks.LOGGER.info("Compressed Blocks Fabric mod initialized successfully. Registered {} Blocks and {} Crates.", Constants.BLOCKS.size(), Constants.CRATE_BLOCKS.size() + Constants.CRATE_ITEMS.size());
    }
}
