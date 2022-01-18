package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.ModRegistryEvent;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraftforge.fml.common.Mod;


@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() {
        Lists.populate();
        ModRegistryEvent.populate();
        ModRegistryEvent.register();
    }
}

