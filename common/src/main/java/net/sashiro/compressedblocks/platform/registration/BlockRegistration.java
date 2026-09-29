package net.sashiro.compressedblocks.platform.registration;

import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.platform.Services;

import static net.sashiro.compressedblocks.block.CompressedBlockFactory.BLOCK_LIST;
import static net.sashiro.compressedblocks.block.CompressedBlockFactory.createBlockList;

public class BlockRegistration {
    public static void registerBlocks() {
        if (Services.PLATFORM.areBlocksEnabled()) {

            createBlockList();

            for (Block entry : BLOCK_LIST) {
                Services.PLATFORM.registerBlock(entry);
            }
        }
    }
}
