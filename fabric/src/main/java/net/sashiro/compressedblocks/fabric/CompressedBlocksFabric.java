package net.sashiro.compressedblocks.fabric;

import net.fabricmc.api.ModInitializer;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

@SuppressWarnings("unused")
public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CompressedBlocks.init();
        CBBlockRegistry.registerBlocks();
        CBCrateRegistry.registerCrates();
    }
}
