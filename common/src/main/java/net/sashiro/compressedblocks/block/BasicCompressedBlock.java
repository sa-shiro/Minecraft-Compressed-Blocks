package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.compression.Compression;

public class BasicCompressedBlock extends Block implements CompressedBlock {
    private final Compression compressor = new Compression();
    private final String block_name;

    /**
     * Constructs a new BasicCompressedBlock instance with the specified properties and compression settings.
     *
     * @param id                    The resource key for the block.
     * @param properties            The block properties.
     * @param compressionLevel      The compression level for the block.
     * @param hasSmallerCompression Whether the block allows smaller compression.
     */
    public BasicCompressedBlock(ResourceKey<Block> id, Properties properties, int compressionLevel, boolean hasSmallerCompression) {
        super(properties.setId(id));
        this.block_name = id.location().getPath();
        compressor.setCompressionLevel(compressionLevel, hasSmallerCompression);
        this.properties().overrideDescription(String.valueOf(Component.literal(compressor.getQuantity() + " Blocks").withStyle(compressor.getStyle())));
    }

    @Override
    public Compression getCompressor() {
        return compressor;
    }

    @Override
    public String blockName() {
        return this.block_name;
    }
}
