package net.sashiro.compressedblocks.fabric;

import fuzs.forgeconfigapiport.api.config.v2.ForgeConfigRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraftforge.fml.config.ModConfig;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

import static net.sashiro.compressedblocks.Constants.LOG;

@SuppressWarnings({"UnstableApiUsage"})
public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ForgeConfigRegistry.INSTANCE.register(Constants.MOD_ID, ModConfig.Type.CLIENT, CBConfig.CONFIG_SPEC);
        Constants.LOG.info("Is config loaded: {}", CBConfig.CONFIG_SPEC.isLoaded());

        CompressedBlocks.init();
        BlockRegistration.registerBlocks();
        CrateRegistration.registerCrates();

        LOG.info("Compressed Blocks Fabric mod initialized successfully. Registered {} Blocks and {} Crates.", Constants.BLOCKS.size(), Constants.CRATE_ITEMS.size() + Constants.CRATE_BLOCKS.size());
    }
}
