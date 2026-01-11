package net.sashiro.compressedblocks.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.util.Compression;

@SuppressWarnings("NullableProblems")
public class CrateBlock extends HorizontalDirectionalBlock {
    private final Compression compressor = new Compression();

    protected CrateBlock(Properties properties, int compressionLevel, ResourceKey<Block> name) {
        super(properties.setId(name));
        compressor.setCompressionLevel(compressionLevel);
        this.registerDefaultState(super.stateDefinition.any().setValue(FACING, Direction.NORTH));
        String name1 = name.identifier().getPath();
        this.properties().overrideDescription(String.valueOf(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle())));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rot) {
        return super.rotate(state, rot);
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return super.mirror(state, mirror);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockStateBuilder) {
        blockStateBuilder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
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
