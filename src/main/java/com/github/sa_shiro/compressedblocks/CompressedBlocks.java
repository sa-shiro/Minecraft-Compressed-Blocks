package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.init.Init;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("compressedblocks")
public class CompressedBlocks {
    public static final Init INIT = new Init();
    public static final String MOD_ID = "compressedblocks";
    private static final Logger logger = LogManager.getLogger();

    public CompressedBlocks() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
    }

    private void setup(final FMLCommonSetupEvent event) {
        INIT.init();
    }
}
