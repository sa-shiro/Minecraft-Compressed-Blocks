package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.block.ICompressedBlock;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class is used to register new Compressed Blocks.<br>
 * New custom Compressed Blocks need to extend {@link ICompressedBlock}<br>
 */
public class RegisterBlock {
    private static final Item.Properties PROPERTIES = new Item.Properties().group(ItemGroups.compressedBlockGroup);
    private static int INDEX = 0;

    /**
     * Function to register new Compressed Blocks.<br>
     * See {@link DeferredRegistryEvent} for an example.<br>
     * @param blockIn          the Block you want to register
     * @param registryName     the Block's registry name
     * @param compressionLevel refers to a loop variable for the compression (0 - 9)
     */
    @ParametersAreNonnullByDefault
    public static void registerNewBlock(ICompressedBlock blockIn, String registryName, int compressionLevel) {
        registerBlock(blockIn, registryName, compressionLevel, PROPERTIES);
    }

    /**
     * Function to register new Compressed Blocks.<br>
     * See {@link DeferredRegistryEvent} for an example.<br>
     * @param blockIn          the Block you want to register
     * @param registryName     the Block's registry name
     * @param compressionLevel refers to a loop variable for the compression (0 - 9)
     * @param properties Item Properties such as Item Group
     */
    @ParametersAreNonnullByDefault
    public static void registerNewBlock(ICompressedBlock blockIn, String registryName, int compressionLevel, Item.Properties properties) {
        registerBlock(blockIn, registryName, compressionLevel, properties);
    }

    @ParametersAreNonnullByDefault
    private static void registerBlock(ICompressedBlock iBlock, String blockName, int compressionLevel, Item.Properties properties) {
        int index2 = INDEX; // required for ITEMS.register()

        DeferredRegistryEvent.BLOCK_REGISTRY.add(INDEX, DeferredRegistryEvent.BLOCKS.register("c" + compressionLevel + "_" + blockName, iBlock::getBlock));
        DeferredRegistryEvent.ITEMS.register("c" + compressionLevel + "_" + blockName, () -> new BlockItem(DeferredRegistryEvent.BLOCK_REGISTRY.get(index2).get(), properties));
        INDEX++;
    }
}
