package net.sashiro.compressedblocks.block;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.util.Compression;

@SuppressWarnings("NullableProblems")
public class CrateBlock extends HorizontalDirectionalBlock implements CompressedBlock {
    public static final MapCodec<CrateBlock> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(BlockBehaviour.Properties.CODEC.fieldOf("properties").forGetter(BlockBehaviour::properties), Codec.INT.fieldOf("compression_level").forGetter(b -> b.getCompressor().getCompressionLevel()), ResourceKey.codec(Registries.BLOCK).fieldOf("name").forGetter(CrateBlock::getBlockName)).apply(instance, (properties1, compressionLevel, name1) -> new CrateBlock(name1, properties1, compressionLevel, false)));

    private final Compression compressor = new Compression();
    private final ResourceKey<Block> name;

    /**
     * Constructor for the CrateBlock class
     *
     * @param id                    ResourceKey<Block> of the block
     * @param properties            BlockBehaviour.Properties of the block
     * @param compressionLevel      Compression level of the block
     * @param hasSmallerCompression Whether the block has smaller compression
     */
    public CrateBlock(ResourceKey<Block> id, Properties properties, int compressionLevel, boolean hasSmallerCompression) {
        super(properties.setId(id));
        this.name = id;
        compressor.setCompressionLevel(compressionLevel, hasSmallerCompression);
        this.registerDefaultState(super.stateDefinition.any().setValue(FACING, Direction.NORTH));
        this.properties().overrideDescription(String.valueOf(Component.literal(compressor.getQuantity() + " Blocks").withStyle(compressor.getStyle())));
    }

    public String getBlockNameString() {
        return name.identifier().getPath();
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
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

    @Override
    public String blockName() {
        return getBlockNameString();
    }

    /**
     * Function to get the compressor of the block
     *
     * @return Compressor
     */
    @Override
    public Compression getCompressor() {
        return compressor;
    }

    /**
     * Function to get the resource key name of the block
     *
     * @return ResourceKey<Block>
     */
    public ResourceKey<Block> getBlockName() {
        return name;
    }
}
