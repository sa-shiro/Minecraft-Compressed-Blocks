package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.util.Compression;
import org.jetbrains.annotations.NotNull;

public class CBRotationalBlock extends RotatedPillarBlock {
    private final Compression compressor = new Compression();

    public CBRotationalBlock(Properties properties, int compressionLevel, ResourceKey<Block> id) {
        super(properties.setId(id));
        compressor.setCompressionLevel(compressionLevel);
        this.properties().overrideDescription(String.valueOf(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle())));
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
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext blockPlaceContext) {
        return super.getStateForPlacement(blockPlaceContext);
    }

    /**
     * Function to get the compressor of the block
     *
     * @return Compressor
     */
    public Compression getCompressor() {
        return compressor;
    }
}
