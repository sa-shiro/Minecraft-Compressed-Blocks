package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.compression.Compression;
import org.jetbrains.annotations.NotNull;

import java.util.List;

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
        super(properties);
        this.block_name = id.location().getPath();
        compressor.setCompressionLevel(compressionLevel, hasSmallerCompression);
    }

    @Override
    public Compression getCompressor() {
        return compressor;
    }

    @Override
    public String blockName() {
        return this.block_name;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack is, Item.@NotNull TooltipContext tc, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
        super.appendHoverText(is, tc, lC, ttf);
        lC.add(Component.literal(compressor.getQuantity() + " Blocks").withStyle(compressor.getStyle()));
    }
}
