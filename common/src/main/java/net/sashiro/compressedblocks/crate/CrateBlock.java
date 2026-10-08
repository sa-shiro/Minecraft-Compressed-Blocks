package net.sashiro.compressedblocks.crate;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.compression.Compression;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("NullableProblems")
public class CrateBlock extends HorizontalDirectionalBlock implements CompressedBlock {
    public static final MapCodec<CrateBlock> CODEC = RecordCodecBuilder.mapCodec(instance -> instance.group(BlockBehaviour.Properties.CODEC.fieldOf("properties").forGetter(BlockBehaviour::properties), Codec.INT.fieldOf("compression_level").forGetter(b -> b.getCompressor().getCompressionLevel()), ResourceKey.codec(Registries.BLOCK).fieldOf("name").forGetter(CrateBlock::getBlockName)).apply(instance, (properties1, compressionLevel, name1) -> new CrateBlock(name1, properties1, compressionLevel, false)));

    private final Compression compressor = new Compression();
    private final ResourceKey<Block> name;

    /**
     * Constructs a new CrateBlock instance with the specified properties and compression settings.
     *
     * @param id                    The resource key for the block.
     * @param properties            The block properties.
     * @param compressionLevel      The compression level for the block.
     * @param hasSmallerCompression Whether the block allows smaller compression.
     */
    public CrateBlock(ResourceKey<Block> id, Properties properties, int compressionLevel, boolean hasSmallerCompression) {
        super(properties);
        this.name = id;
        compressor.setCompressionLevel(compressionLevel, hasSmallerCompression);
        this.registerDefaultState(super.stateDefinition.any().setValue(FACING, Direction.NORTH));
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
        return this.name.location().getPath();
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

    @Override
    public void appendHoverText(@NotNull ItemStack is, Item.@NotNull TooltipContext tc, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
        super.appendHoverText(is, tc, lC, ttf);
        lC.add(Component.literal(compressor.getQuantity() + " Blocks").withStyle(compressor.getStyle()));
    }
}
