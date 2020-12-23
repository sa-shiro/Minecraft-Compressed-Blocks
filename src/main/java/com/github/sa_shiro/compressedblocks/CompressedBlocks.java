package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import net.minecraftforge.fml.common.Mod;


@Mod("compressedblocks")
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() {
        DeferredRegistryEvent.register();
    }
}
