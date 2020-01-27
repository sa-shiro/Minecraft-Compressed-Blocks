package com.github.sa_shiro.compressedblocks.init;

import com.github.sa_shiro.compressedblocks.blocks.CompressedBlocksInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Init {
    public static ItemGroup compressedGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CompressedBlocksInit.COMPRESSED_STONE);
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };

    public void init() {
    }
}
