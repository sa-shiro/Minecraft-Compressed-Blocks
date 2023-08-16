package net.sashiro.compressedblocks;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;
import net.sashiro.compressedblocks.config.CBConfig;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

@Mod(Constants.MOD_ID)
public class CompressedBlocksForge {
    
    private static final String CONFIG = "compressed_blocks.toml";
    
    public CompressedBlocksForge() {
        CommonClass.init();
        
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, CBConfig.FORGE_CONFIG_SPEC, CONFIG);
        CBConfig.loadConfig(CBConfig.FORGE_CONFIG_SPEC, FMLPaths.CONFIGDIR.get().resolve(CONFIG).toString());
        
        CBRegistryEvent.register();
    }
    
}