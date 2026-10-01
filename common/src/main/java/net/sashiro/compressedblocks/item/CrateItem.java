package net.sashiro.compressedblocks.item;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.sashiro.compressedblocks.compression.Compression;
import net.sashiro.compressedblocks.util.ResourceUtils;

public class CrateItem extends Item {
    private final Compression compressor = new Compression();
    private final int compressionLevel;
    private final String name;

    /**
     * Constructor for the CrateItem class
     *
     * @param id                    ResourceKey<Item> of the item
     * @param compressionLevel      Compression level of the item
     * @param hasSmallerCompression Whether the item has smaller compression
     */
    public CrateItem(ResourceKey<Item> id, Item.Properties properties, int compressionLevel, boolean hasSmallerCompression) {
        super(ResourceUtils.setRarity(properties.setId(id), compressionLevel));
        compressor.setCompressionLevel(compressionLevel, hasSmallerCompression);
        this.compressionLevel = compressionLevel;
        this.name = id.location().getPath();
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

    /**
     * Function to get the name of the item
     *
     * @return Name
     */
    public String getCrateName() {
        return name;
    }
}
