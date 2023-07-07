package net.sashiro.compressedblocks;

import net.fabricmc.api.ModInitializer;
import net.sashiro.compressedblocks.registry.CBBlocksRegister;
import net.sashiro.compressedblocks.registry.CBCratesRegister;

public class CompressedBlocksFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CommonClass.init();
        
        CBBlocksRegister.register();
        CBCratesRegister.register();
    }
}
