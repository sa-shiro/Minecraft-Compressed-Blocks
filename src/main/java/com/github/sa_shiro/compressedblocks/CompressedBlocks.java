package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import com.github.sa_shiro.compressedblocks.util.ForgeConfigManager;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;


@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() {
        Lists.populate();

        String config1 = "compressedblocks_compression.toml";
        String config2 = "compressedblocks_blocks.toml";

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ForgeConfigManager.configMaxCompressionLevel, config1);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, ForgeConfigManager.configEnabledBlocks, config2);

        ForgeConfigManager.loadConfig(ForgeConfigManager.configMaxCompressionLevel, FMLPaths.CONFIGDIR.get().resolve(config1).toString());
        ForgeConfigManager.loadConfig(ForgeConfigManager.configEnabledBlocks, FMLPaths.CONFIGDIR.get().resolve(config2).toString());

        RegistryEvent.register();
    }
}
