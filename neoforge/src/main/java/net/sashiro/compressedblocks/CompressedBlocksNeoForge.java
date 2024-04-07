package net.sashiro.compressedblocks;

import net.neoforged.fml.common.Mod;
import net.sashiro.compressedblocks.event.CBRegistryEvent;


@Mod(Constants.MOD_ID)
public class CompressedBlocksNeoForge {

    public CompressedBlocksNeoForge() {
        CompressedBlocksCommon.init();

        CBRegistryEvent.register();
    }
}