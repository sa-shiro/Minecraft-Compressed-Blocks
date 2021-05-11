package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class CompressedBlock extends Block implements ICompressedBlock {
    protected static final Compression compressor = new Compression();

    private CompressedBlock(Properties p) {
        super(p);
    }

    /**
     * @param type          {@link BlockType}
     * @param compression   Compression Level ( 0 - 9 )
     * @param material      Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param soundType     Minecraft {@link SoundType}
     * @param hardness      Block hardness               https://minecraftmodcustomstuff.fandom.com/wiki/Hardness
     * @param resistance    Block resistance             https://minecraftmodcustomstuff.fandom.com/wiki/Resistance
     * @param harvestLevel  Block harvest level          0: Wood, 1: Stone/Gold, 2: Iron, 3: Diamond
     */
    @ParametersAreNonnullByDefault
    public static ICompressedBlock createBlock(BlockType type, int compression, Material material, @Nullable MaterialColor materialColor, SoundType soundType, float hardness, float resistance, int harvestLevel) {
        if (materialColor == null) materialColor = material.getColor();
        Properties p0 = Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel);
        Properties p1 = Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(5.0F).harvestLevel(0);
        Properties p2 = Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(0.5F).harvestLevel(0).notSolid().slipperiness(0.85F);
        Properties p3 = Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(5.0F).harvestLevel(0).slipperiness(0.85F);
        Properties p4 = Properties.create(material, materialColor).sound(soundType).hardnessAndResistance(0.3F).harvestLevel(0).notSolid().setOpaque(CompressedBlock::isNotTransparent).setSuffocates(CompressedBlock::isNotTransparent).setBlocksVision(CompressedBlock::isNotTransparent);
        switch (type) {
            default:
            case DEFAULT:
                compressor.setCompressionLevel(compression);
                return new CompressedBlock(p0);
            case SAND:
                compressor.setCompressionLevel(compression);
                return new CompressedSandBlock(14406560, p0);
            case RED_SAND:
                compressor.setCompressionLevel(compression);
                return new CompressedSandBlock(11098145, p0);
            case GRAVEL:
                compressor.setCompressionLevel(compression);
                return new CompressedGravelBlock(p0);
            case REDSTONE:
                compressor.setCompressionLevel(compression);
                return new CompressedRedstoneBlock(p0);
            case SOUL_SAND:
                compressor.setCompressionLevel(compression);
                return new CompressedSoulSandBlock(p0);
            case WOOL:
                compressor.setCompressionLevel(compression);
                return new CompressedBlock(p1);
            case SLIME:
                compressor.setCompressionLevel(compression);
                return new CompressedSlimeBlock(p2);
            case FLESH:
                compressor.setCompressionLevel(compression);
                return new CompressedBlock(p3);
            case GLASS:
                compressor.setCompressionLevel(compression);
                return new CompressedTransparentBlock(p4);
        }
    }

    @ParametersAreNonnullByDefault
    public static ICompressedBlock createRotationalBlock(int compression, Material material, MaterialColor materialColorTop, MaterialColor materialColorEnd, SoundType soundType, float hardness, float resistance, int harvestLevel) {
        Properties p = Properties.create(material, (state) -> state.get(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? materialColorTop : materialColorEnd).sound(soundType).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel);
        compressor.setCompressionLevel(compression);
        return new CompressedRotationalBlock(p);
    }

    @ParametersAreNonnullByDefault
    public static ICompressedBlock createRotationalBlock(int compression, Material material, MaterialColor materialColor, SoundType soundType, float hardness, float resistance, int harvestLevel) {
        Properties p = Properties.create(material, (state) -> materialColor).sound(soundType).hardnessAndResistance(hardness, resistance).harvestLevel(harvestLevel);
        compressor.setCompressionLevel(compression);
        return new CompressedRotationalBlock(p);
    }

    private static boolean isNotTransparent(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }

    @Override
    @ParametersAreNonnullByDefault
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }

    @Override
    public Block getBlock() {
        return this;
    }

    protected static class CompressedGravelBlock extends GravelBlock implements ICompressedBlock {
        protected CompressedGravelBlock(Properties p) {
            super(p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedRedstoneBlock extends RedstoneBlock implements ICompressedBlock {
        protected CompressedRedstoneBlock(Properties p) {
            super(p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSandBlock extends SandBlock implements ICompressedBlock {
        protected CompressedSandBlock(int dustColor, Properties p) {
            super(dustColor, p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSlimeBlock extends SlimeBlock implements ICompressedBlock {
        protected CompressedSlimeBlock(Properties p) {
            super(p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSoulSandBlock extends SoulSandBlock implements ICompressedBlock {
        protected CompressedSoulSandBlock(Properties p) {
            super(p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedRotationalBlock extends RotatedPillarBlock implements ICompressedBlock {
        protected CompressedRotationalBlock(Properties p) {
            super(p);
            this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedTransparentBlock extends GlassBlock implements ICompressedBlock {
        protected CompressedTransparentBlock(Properties p) {
            super(p);
        }

        @Override
        public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
            super.addInformation(stack, worldIn, tooltip, flagIn);
            tooltip.add(new StringTextComponent(compressor.blockCount + " Blocks").setStyle(compressor.style));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }
}