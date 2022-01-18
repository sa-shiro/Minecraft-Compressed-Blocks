package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.ModRegistryEvent;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ItemGroups {
    @MethodsReturnNonnullByDefault
    public static CreativeModeTab compressedBlockGroup = new CreativeModeTab("compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            Block icon = ModRegistryEvent.LOGO_BLOCK.get();
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}