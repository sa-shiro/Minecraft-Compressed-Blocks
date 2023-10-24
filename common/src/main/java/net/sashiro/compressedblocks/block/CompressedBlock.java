package net.sashiro.compressedblocks.block;

import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.MapColor;
import net.sashiro.compressedblocks.util.Compression;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public class CompressedBlock {


    public static class CustomDefaultBlock extends Block {
        private final Compression compressor = new Compression();

        public CustomDefaultBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomMudBlock extends MudBlock {
        private final Compression compressor = new Compression();

        public CustomMudBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomNyliumBlock extends NyliumBlock {
        private final Compression compressor = new Compression();

        public CustomNyliumBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomSandBlock extends SandBlock {
        private final Compression compressor = new Compression();

        public CustomSandBlock(int dustColor, Properties properties, int compressionLevel) {
            super(dustColor, properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomGravelBlock extends GravelBlock {
        private final Compression compressor = new Compression();

        public CustomGravelBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomDropExperienceBlock extends DropExperienceBlock {
        private final Compression compressor = new Compression();

        public CustomDropExperienceBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomRedstoneOreBlock extends RedStoneOreBlock {
        private final Compression compressor = new Compression();

        public CustomRedstoneOreBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomRedstoneTorchBlock extends RedstoneTorchBlock {
        private final Compression compressor = new Compression();

        public CustomRedstoneTorchBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomSlimeBlock extends SlimeBlock {
        private final Compression compressor = new Compression();

        public CustomSlimeBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomSoulSandBlock extends SoulSandBlock {
        private final Compression compressor = new Compression();

        public CustomSoulSandBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }

    public static class CustomRotatedPillarBlock extends RotatedPillarBlock {
        private final Compression compressor = new Compression();

        public CustomRotatedPillarBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }

        public CustomRotatedPillarBlock(MapColor innerColor, MapColor outerColor, float hardness, float resistance, int compressionLevel) {
            super(Properties.of().mapColor((color) -> color.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? innerColor : outerColor).sound(SoundType.WOOD).strength(hardness, resistance));
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
        public BlockState getStateForPlacement(@NotNull BlockPlaceContext blockPlaceContext) {
            return super.getStateForPlacement(blockPlaceContext);
        }

        @Override
        public void appendHoverText(@NotNull ItemStack is, @Nullable BlockGetter bg, @NotNull List<Component> lC, @NotNull TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(Component.literal(compressor.getBlockCount() + " Blocks").withStyle(compressor.getStyle()));
        }
    }
}
