package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("compressedblocks")
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";
    private static final Logger logger = LogManager.getLogger();

    public CompressedBlocks() {
        DeferredRegistryEvent.register();
    }
}
