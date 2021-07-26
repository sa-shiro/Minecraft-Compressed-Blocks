package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.ModRegistryObjects;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ItemGroups {
    public static CreativeModeTab compressedBlockGroup = new CreativeModeTab("compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            Block icon = ModRegistryObjects.LOGO_BLOCK.getBlock();
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}