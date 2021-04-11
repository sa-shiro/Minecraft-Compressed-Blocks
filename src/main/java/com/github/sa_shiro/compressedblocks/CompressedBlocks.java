package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import com.github.sa_shiro.compressedblocks.util.ConfigManager;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;

import java.io.File;
import java.io.IOException;

@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() throws IOException {
        Lists.populate();
        Lists.populateMekanism();
        File file = new File(Minecraft.getInstance().gameDir.getAbsolutePath() + "\\config\\compressedblocks.json");
        if (!file.exists()) ConfigManager.init();

        DeferredRegistryEvent.register();
    }
}
