package com.github.sa_shiro.compressedblocks.init;

import com.github.sa_shiro.compressedblocks.blocks.CompressedBlocksInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Init {
    public static ItemGroup doubleCompressedGroup = new ItemGroup("double_compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CompressedBlocksInit.DOUBLE_COMPRESSED_STONE);
        }
    };

    public void init() {
    }
}
