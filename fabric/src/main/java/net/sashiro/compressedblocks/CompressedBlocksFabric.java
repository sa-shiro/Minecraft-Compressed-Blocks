package net.sashiro.compressedblocks;

import net.fabricmc.api.ModInitializer;

public class CompressedBlocksFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        CompressedBlocksCommon.init();
    }
}
