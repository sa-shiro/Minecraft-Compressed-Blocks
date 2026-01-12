package net.sashiro.compressedblocks.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.sashiro.compressedblocks.util.CommonUtils;
import net.sashiro.compressedblocks.util.Compression;

public class CrateItem extends Item {
    private final Compression compressor = new Compression();
    private final int compressionLevel;

    public CrateItem(int compressionLevel, ResourceKey<Item> id) {
        super(CommonUtils.setRarity(new Item.Properties().stacksTo(64).setId(id), compressionLevel));
        compressor.setCompressionLevel(compressionLevel);
        this.compressionLevel = compressionLevel;
    }

    /**
     * Function to get the compressor of the block
     *
     * @return Compressor
     */
    public Compression getCompressor() {
        return compressor;
    }

    /**
     * Function to get the compression level of the item
     *
     * @return Compression level
     */
    public int getCompressionLevel() {
        return compressionLevel;
    }
}
