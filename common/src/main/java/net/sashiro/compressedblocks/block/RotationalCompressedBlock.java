package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.compression.Compression;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RotationalCompressedBlock extends RotatedPillarBlock implements CompressedBlock {
    private final Compression compressor = new Compression();
    private final String block_name;

    /**
     * Constructs a new RotationalCompressedBlock instance with the specified properties and compression settings.
     *
     * @param properties       The block properties.
     * @param compressionLevel The compression level for the block.
     * @param id               The resource key for the block.
     */
    public RotationalCompressedBlock(Properties properties, int compressionLevel, ResourceKey<Block> id) {
        super(properties);
        this.block_name = id.location().getPath();
        compressor.setCompressionLevel(compressionLevel);
    }

    @Override
    public @NotNull BlockState rotate(@NotNull BlockState blockState, @NotNull Rotation rotation) {
        return super.rotate(blockState, rotation);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> blockBlockStateBuilder) {
        super.createBlockStateDefinition(blockBlockStateBuilder);
    }

    @Override
    public @NotNull BlockState getStateForPlacement(@NotNull BlockPlaceContext blockPlaceContext) {
        return super.getStateForPlacement(blockPlaceContext);
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
