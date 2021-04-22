package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroups {
    public static ItemGroup compressedBlockGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryEvent.BLOCK_REGISTRY.get(6).get());
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
/*
    public static ItemGroup compressedCustomBlockGroup = new ItemGroup("compressed_custom_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryEvent.BLOCK_REGISTRY.get(9).get());
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };*/
}
