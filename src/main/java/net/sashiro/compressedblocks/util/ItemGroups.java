package net.sashiro.compressedblocks.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.sashiro.compressedblocks.event.ModRegistryEvent;

public class ItemGroups {
    public static ItemGroup compressedBlockGroup = new ItemGroup("compressed_blocks") {
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