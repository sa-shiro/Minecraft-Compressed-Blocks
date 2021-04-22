package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import com.github.sa_shiro.compressedblocks.util.ConfigManager;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;

import java.io.File;
import java.io.IOException;

@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";
    public static final String CONFIG_ENABLED_BLOCKS = Minecraft.getInstance().gameDir.getAbsolutePath() + "\\config\\compressedblocks.json";
    public static final String CONFIG_COMPRESSION_LEVEL = Minecraft.getInstance().gameDir.getAbsolutePath() + "\\config\\compressedblocks_compression_level.json";

    // Required for the runData task
    // !!! before running the runData task, comment out the above and uncomment this and change the path to a existing and working config file !!!
    // to generate the latest configs, run the game (runClient task) first before running the runData task
    //public static final String CONFIG_ENABLED_BLOCKS = "D:\\Projects\\Java\\_run\\1.16.3\\config\\compressedblocks.json";
    //public static final String CONFIG_COMPRESSION_LEVEL = "D:\\Projects\\Java\\_run\\1.16.3\\config\\compressedblocks_compression_level.json";

    public CompressedBlocks() throws IOException {
        Lists.populate();
        //Lists.populateMekanism();
        File config1 = new File(CONFIG_ENABLED_BLOCKS);
        File config2 = new File(CONFIG_COMPRESSION_LEVEL);
        if (!config1.exists() || !config2.exists()) ConfigManager.init();

        RegistryEvent.register();
    }
}
