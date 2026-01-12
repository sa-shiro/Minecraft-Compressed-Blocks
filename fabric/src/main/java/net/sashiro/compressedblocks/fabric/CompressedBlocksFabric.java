package net.sashiro.compressedblocks.fabric;

import net.fabricmc.api.ModInitializer;
import net.neoforged.fml.config.ConfigTracker;
import net.neoforged.fml.config.ModConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

@SuppressWarnings({"UnstableApiUsage"})
public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ConfigTracker.INSTANCE.registerConfig(ModConfig.Type.STARTUP, CBFabricConfig.CONFIG_SPEC, Constants.MOD_ID);
        Constants.LOG.info("Is config loaded: {}", CBFabricConfig.CONFIG_SPEC.isLoaded());

        CompressedBlocks.init();
        CBBlockRegistry.registerBlocks();
        CBCrateRegistry.registerCrates();
    }
}
