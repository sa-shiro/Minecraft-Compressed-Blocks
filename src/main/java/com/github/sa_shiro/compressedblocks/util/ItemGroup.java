package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.block.Blocks;
import net.minecraft.item.ItemStack;

public class ItemGroup {
    public static net.minecraft.item.ItemGroup compressedGroup = new net.minecraft.item.ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.Single.COMPRESSED_STONE);
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
}
