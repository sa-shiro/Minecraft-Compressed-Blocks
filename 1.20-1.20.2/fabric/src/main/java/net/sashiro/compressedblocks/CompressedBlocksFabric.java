package net.sashiro.compressedblocks;

import net.fabricmc.api.ModInitializer;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CompressedBlocksCommon.init();
        CBBlockRegistry.registerBlocks();
        CBCrateRegistry.registerCrates();
    }
}
