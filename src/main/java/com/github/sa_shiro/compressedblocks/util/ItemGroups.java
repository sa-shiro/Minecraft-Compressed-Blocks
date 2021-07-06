package com.github.sa_shiro.compressedblocks.util;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.RegistryObject;

import java.util.Objects;

public class ItemGroups {
    public static ItemGroup compressedBlockGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            Block icon = null;
            for (RegistryObject<Block> block : RegistryEvent.BLOCK_REGISTRY) {
                if (Objects.requireNonNull(block.get().getRegistryName()).toString().equals("compressedblocks:c9_stone")) {
                    icon = block.get();
                }
            }
            return new ItemStack(icon);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}
