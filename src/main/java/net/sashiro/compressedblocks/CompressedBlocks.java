package net.sashiro.compressedblocks;

import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.event.ModRegistryEvent;
import net.sashiro.compressedblocks.world.level.item.CrateItems;

@Mod(CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";

    public CompressedBlocks() {
        CrateItems.populate();
        ModRegistryEvent.register();
    }
}

