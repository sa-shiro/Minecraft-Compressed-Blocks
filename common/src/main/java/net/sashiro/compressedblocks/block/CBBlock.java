package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.util.Compression;

public class CBBlock extends Block implements CompressedBlock {
    private final Compression compressor = new Compression();
    private final String block_name;

    public CBBlock(ResourceKey<Block> id, Properties properties, int compressionLevel, boolean hasSmallerCompression) {
        super(properties.setId(id));
        this.block_name = id.identifier().getPath();
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
