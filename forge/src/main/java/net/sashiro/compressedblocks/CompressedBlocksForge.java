package net.sashiro.compressedblocks;

import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

@Mod(Constants.MOD_ID)
public class CompressedBlocksForge {

    public CompressedBlocksForge() {
        CommonClass.init();

        CBRegistryEvent.register();
    }
}