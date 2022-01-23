package net.sashiro.compressedblocks;

import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.event.ModRegistryEvent;
import net.sashiro.compressedblocks.util.Lists;


@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() {
        Lists.populate();
        ModRegistryEvent.populate();
        ModRegistryEvent.register();
    }
}

