package net.sashiro.compressedblocks.world.level.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomBlock {

    public static class CustomDefaultBlock extends Block {
        private final Compression compressor = new Compression();
        public CustomDefaultBlock(Properties p_55057_, int compressionLevel) {
            super(p_55057_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomNyliumBlock extends NyliumBlock {
        private final Compression compressor = new Compression();
        public CustomNyliumBlock(Properties p_55057_, int compressionLevel) {
            super(p_55057_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomSandBlock extends SandBlock {
        private final Compression compressor = new Compression();
        public CustomSandBlock(int p_55967_, Properties p_55968_, int compressionLevel) {
            super(p_55967_, p_55968_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomGravelBlock extends GravelBlock {
        private final Compression compressor = new Compression();
        public CustomGravelBlock(Properties p_53736_, int compressionLevel) {
            super(p_53736_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomOreBlock extends OreBlock {
        private final Compression compressor = new Compression();
        public CustomOreBlock(Properties p_55140_, int compressionLevel) {
            super(p_55140_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomRedstoneTorchBlock extends RedstoneTorchBlock {
        private final Compression compressor = new Compression();
        public CustomRedstoneTorchBlock(Properties p_55678_, int compressionLevel) {
            super(p_55678_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomSlimeBlock extends SlimeBlock {
        private final Compression compressor = new Compression();
        public CustomSlimeBlock(Properties p_56402_, int compressionLevel) {
            super(p_56402_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    public static class CustomSoulSandBlock extends SoulSandBlock {
        private final Compression compressor = new Compression();
        public CustomSoulSandBlock(Properties p_56672_, int compressionLevel) {
            super(p_56672_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    // fixme: missing rotation
    public static class CustomRotatedPillarBlock extends RotatedPillarBlock {
        private final Compression compressor = new Compression();
        public CustomRotatedPillarBlock(Properties p_55926_, int compressionLevel) {
            super(p_55926_);
            compressor.setCompressionLevel(compressionLevel);
        }
        @Override
        public void appendHoverText(ItemStack is, @Nullable BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
            super.appendHoverText(is, bg, lC, ttf);
            lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
}
