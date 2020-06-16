package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;

public class ItemGroup {
    public static net.minecraft.item.ItemGroup compressedGroup = new net.minecraft.item.ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack((IItemProvider) DeferredRegistryEvent.BLOCK_REGISTRY.get(3).get());
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
}
