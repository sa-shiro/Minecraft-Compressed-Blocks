package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.block.ICompressedBlock;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import javax.annotation.ParametersAreNonnullByDefault;

public class RegisterBlock {
    private static final Item.Properties PROPERTIES = new Item.Properties().tab(ItemGroups.compressedBlockGroup);
    private static int INDEX = 0;

    @ParametersAreNonnullByDefault
    public static void registerNewBlock(ICompressedBlock blockIn, String registryName, int compressionLevel, boolean isEnabled) {
        if (isEnabled) registerBlock(blockIn, registryName, compressionLevel, PROPERTIES);
    }

    @ParametersAreNonnullByDefault
    private static void registerBlock(ICompressedBlock iBlock, String blockName, int compressionLevel, Item.Properties properties) {
        int index2 = INDEX; // required for ITEMS.register()

        RegistryEvent.BLOCK_REGISTRY.add(INDEX, RegistryEvent.BLOCKS.register("c" + compressionLevel + "_" + blockName, iBlock::getBlock));
        RegistryEvent.ITEMS.register("c" + compressionLevel + "_" + blockName, () -> new BlockItem(RegistryEvent.BLOCK_REGISTRY.get(index2).get(), properties));
        INDEX++;
    }
}
