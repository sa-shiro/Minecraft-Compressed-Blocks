package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class CompressedBlock extends Block implements ICompressedBlock {
    private final Compression compressor = new Compression();

    protected CompressedBlock(Properties p, int l) {
        super(p);
        compressor.setCompressionLevel(l);
    }

    public CompressedBlock() {
        super(Properties.of(Material.STONE));
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
        Properties p0 = Properties.of(material, materialColor).sound(soundType).strength(hardness, resistance).harvestLevel(harvestLevel);
        Properties p1 = Properties.of(material, materialColor).sound(soundType).strength(5.0F).harvestLevel(0);
        Properties p2 = Properties.of(material, materialColor).sound(soundType).strength(0.5F).harvestLevel(0).noOcclusion().friction(0.85F);
        Properties p3 = Properties.of(material, materialColor).sound(soundType).strength(5.0F).harvestLevel(0).friction(0.85F);
        Properties p4 = Properties.of(material, materialColor).sound(soundType).strength(0.3F).harvestLevel(0).noOcclusion().noOcclusion().isSuffocating(CompressedBlock::nil).isViewBlocking(CompressedBlock::nil).isRedstoneConductor(CompressedBlock::nil).isValidSpawn(CompressedBlock::nil);
        Properties p5 = Properties.of(material, materialColor).sound(soundType).strength(hardness, resistance).harvestLevel(harvestLevel).lightLevel((s) -> 4);
        return switch (type) {
            case DEFAULT -> new CompressedBlock(p0, compression);
            case SAND -> new CompressedSandBlock(14406560, p0, compression);
            case RED_SAND -> new CompressedSandBlock(11098145, p0, compression);
            case GRAVEL -> new CompressedGravelBlock(p0, compression);
            case REDSTONE -> new CompressedRedstoneBlock(p0, compression);
            case SOUL_SAND -> new CompressedSoulSandBlock(p0, compression);
            case WOOL -> new CompressedBlock(p1, compression);
            case SLIME -> new CompressedSlimeBlock(p2, compression);
            case FLESH -> new CompressedBlock(p3, compression);
            case GLASS -> new CompressedTransparentBlock(p4, compression);
            case MAGMA -> new CompressedMagmaBlock(p5, compression);
        };
    }

    @ParametersAreNonnullByDefault
    public static ICompressedBlock createRotationalBlock(int compression, Material material, MaterialColor materialColorTop, MaterialColor materialColorEnd, SoundType soundType, float hardness, float resistance, int harvestLevel) {
        Properties p = Properties.of(material, (s) -> s.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? materialColorTop : materialColorEnd).sound(soundType).strength(hardness, resistance).harvestLevel(harvestLevel);
        return new CompressedRotationalBlock(p, compression);
    }

    @ParametersAreNonnullByDefault
    public static ICompressedBlock createRotationalBlock(int compression, Material material, MaterialColor materialColor, SoundType soundType, float hardness, float resistance, int harvestLevel) {
        Properties p = Properties.of(material, (state) -> materialColor).sound(soundType).strength(hardness, resistance).harvestLevel(harvestLevel);
        return new CompressedRotationalBlock(p, compression);
    }

    private static boolean nil(BlockState s, BlockGetter g, BlockPos p) {
        return false;
    }

    private static boolean nil(BlockState s, BlockGetter g, BlockPos b, EntityType<?> e) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
        super.appendHoverText(s, g, c, t);
        c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }

    @Override
    public Block getBlock() {
        return this;
    }

    protected static class CompressedGravelBlock extends GravelBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedGravelBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedRedstoneBlock extends RedStoneWireBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedRedstoneBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSandBlock extends SandBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedSandBlock(int d, Properties p, int l) {
            super(d, p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSlimeBlock extends SlimeBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedSlimeBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedSoulSandBlock extends SoulSandBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedSoulSandBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedRotationalBlock extends RotatedPillarBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedRotationalBlock(Properties p, int l) {
            super(p);
            this.registerDefaultState(this.defaultBlockState().setValue(AXIS, Direction.Axis.Y));
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedTransparentBlock extends GlassBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedTransparentBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }

    protected static class CompressedMagmaBlock extends MagmaBlock implements ICompressedBlock {
        private final Compression compressor = new Compression();

        protected CompressedMagmaBlock(Properties p, int l) {
            super(p);
            compressor.setCompressionLevel(l);
        }

        @Override
        public void appendHoverText(ItemStack s, @Nullable BlockGetter g, List<Component> c, TooltipFlag t) {
            super.appendHoverText(s, g, c, t);
            c.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }

        @Override
        public Block getBlock() {
            return this;
        }
    }
}