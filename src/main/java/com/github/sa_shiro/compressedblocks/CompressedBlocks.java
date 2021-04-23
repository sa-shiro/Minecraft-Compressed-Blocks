package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";
    private static final Logger LOGGER = LogManager.getLogger();

    public CompressedBlocks() {
        Lists.populate();
        RegistryEvent.register();

        //DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> CompressedBlocks::runOnClient);
        //DistExecutor.unsafeRunWhenOn(Dist.DEDICATED_SERVER, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(CompressedBlocks::runOnServer));
    }

    /**
     * =============================<br>
     * Required for the runData task<br>
     * =============================<br>
     * !!! before running the runData task, comment out the part below DATA GENERATOR, uncomment this and change the path to a existing and working config file !!!<br>
     * to generate the latest configs, run the game (runClient task) first before running the runData task<br>
     **/
    // DATA GENERATOR
    /* // comment this line for the data generator
    public static final String CONFIG_ENABLED_BLOCKS = "D:\\Projects\\Java\\_run\\1.16.3\\config\\compressedblocks.json";
    public static final String CONFIG_COMPRESSION_LEVEL = "D:\\Projects\\Java\\_run\\1.16.3\\config\\compressedblocks_compression_level.json";
    private void runOnClient() {
        ConfigManager.init(CONFIG_ENABLED_BLOCKS, CONFIG_COMPRESSION_LEVEL);

        try {
            if (!(new File(CONFIG_ENABLED_BLOCKS).exists()) || !(new File(CONFIG_COMPRESSION_LEVEL).exists())) {
                ConfigManager.createConfig();
            }
            RegistryEvent.register();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    */ // comment this line for the data generator

    // /* uncomment this line for the data generator

/*
    public static final String CONFIG_ENABLED_BLOCKS = "config\\compressedblocks.json";
    public static final String CONFIG_COMPRESSION_LEVEL = "config\\compressedblocks_compression_level.json";

    private static void runOnClient() {
        String str = Minecraft.getInstance().gameDir.getAbsolutePath() + CONFIG_ENABLED_BLOCKS;
        String str2 = Minecraft.getInstance().gameDir.getAbsolutePath() + CONFIG_COMPRESSION_LEVEL;
        File config1 = new File(str.replace(".config", "config"));
        File config2 = new File(str2.replace(".config", "config"));
        ConfigManager.init(config1.toString(), config2.toString());

        try {
            if (!config1.exists() || !config2.exists()) {
                ConfigManager.createConfig();
            }
            RegistryEvent.register();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
     // /* uncomment this line for the data generator

    public static void runOnServer(final FMLCommonSetupEvent e) {
        e.setPhase(EventPriority.HIGHEST);
        String path = FMLPaths.GAMEDIR.get().toString();
        LOGGER.info("Config Path " + path);
        File config1 = new File(path + "/" + CONFIG_ENABLED_BLOCKS);
        File config2 = new File(path + "/" + CONFIG_COMPRESSION_LEVEL);
        ConfigManager.init(config1.toString(), config2.toString());

        try {
            if (!config1.exists() || !config2.exists()) {
                ConfigManager.createConfig();
            }
            RegistryEvent.register();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/
}
