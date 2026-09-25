package net.sashiro.compressedblocks.platform.registry;

import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.platform.Services;

import static net.sashiro.compressedblocks.block.BlockList.BLOCK_LIST;
import static net.sashiro.compressedblocks.block.BlockList.createBlockList;

public class CBBlockRegistry {
    public static void registerBlocks() {
        if (Services.PLATFORM.areBlocksEnabled()) {

            createBlockList();

            for (Block entry : BLOCK_LIST) {
                Services.PLATFORM.registerBlock(entry);
            }
        }
    }
}
