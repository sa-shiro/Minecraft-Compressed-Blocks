package com.github.sa_shiro.compressedblocks.block;

import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import com.github.sa_shiro.compressedblocks.event.RegisterBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Random;

/**
 * This class is not intended for the creation of custom Compressed Blocks.<br>
 * Create your own Block class and extend {@link ICompressedBlock} or use {@link CompressedBlock#createBlock}.<br>
 * You can register your custom compressed blocks using {@link RegisterBlock#registerNewBlock}.<br>
 * For an example, see {@link DeferredRegistryEvent}
 */
class CompressedSoulSandBlock extends SoulSandBlock implements ICompressedBlock {
    private static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);
    private final Compression comp = new Compression();

    /**
     * @param material Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param sound Minecraft {@link SoundType}
     * @param compression  Compression Level ( 0 - 9 )
     * @param hardness     Block hardness               https://minecraftmodcustomstuff.fandom.com/wiki/Hardness
     * @param resistance   Block resistance             https://minecraftmodcustomstuff.fandom.com/wiki/Resistance
     * @param harvestLevel Block harvest level          0: Wood, 1: Stone/Gold, 2: Iron, 3: Diamond
     */
    @ParametersAreNonnullByDefault
    protected CompressedSoulSandBlock(Material material, MaterialColor materialColor, SoundType sound, int compression, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
                .variableOpacity()
                .harvestTool(ToolType.SHOVEL)
        );
        comp.setCompressionLevel(compression);
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(comp.blockCount + " Blocks").applyTextStyle(comp.textFormatting));
    }

    @Override
    public Block getBlock() { return this; }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.setMotion(entityIn.getMotion().mul(0.4D, 1.0D, 0.4D));
    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        BubbleColumnBlock.placeBubbleColumn(worldIn, pos.up(), false);
    }

    @Override
    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
    }

    @Override
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return true;
    }

    @Override
    public int tickRate(IWorldReader worldIn) {
        return 20;
    }

    @Override
    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        worldIn.getPendingBlockTicks().scheduleTick(pos, this, this.tickRate(worldIn));
    }

    @Override
    public boolean allowsMovement(BlockState state, IBlockReader worldIn, BlockPos pos, PathType type) {
        return false;
    }

    @Override
    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return true;
    }
}