package net.sashiro.compressedblocks.block;

import net.minecraft.block.*;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;


@SuppressWarnings("ALL")
public class ForgeCompressedBlock {
    
    
    public static class CustomDefaultBlock extends Block {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomDefaultBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomNyliumBlock extends NyliumBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomNyliumBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomSandBlock extends SandBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomSandBlock(int dustColor, Properties properties, int compressionLevel) {
            super(dustColor, properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomGravelBlock extends GravelBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomGravelBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomRedstoneOreBlock extends RedstoneOreBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomRedstoneOreBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    @SuppressWarnings("NullableProblems")
    public static class CustomRedstoneTorchBlock extends RedstoneTorchBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomRedstoneTorchBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomSlimeBlock extends SlimeBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomSlimeBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    public static class CustomSoulSandBlock extends SoulSandBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomSoulSandBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
    
    @SuppressWarnings({"NullableProblems", "deprecation"})
    public static class CustomRotatedPillarBlock extends RotatedPillarBlock {
        private final ForgeCompression compressor = new ForgeCompression();
        
        public CustomRotatedPillarBlock(Properties properties, int compressionLevel) {
            super(properties);
            compressor.setCompressionLevel(compressionLevel);
        }
        
        @Override
        public BlockState rotate(BlockState p_185499_1_, Rotation p_185499_2_) {
            return super.rotate(p_185499_1_, p_185499_2_);
        }
        
        @Override
        protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
            super.createBlockStateDefinition(p_206840_1_);
        }
        
        @Override
        public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
            return super.getStateForPlacement(p_196258_1_);
        }
        
        @Override
        public BlockState mirror(BlockState p_185471_1_, Mirror p_185471_2_) {
            return super.mirror(p_185471_1_, p_185471_2_);
        }
        
        @Override
        public void appendHoverText(ItemStack is, @Nullable IBlockReader br, List<ITextComponent> lc, ITooltipFlag tf) {
            super.appendHoverText(is, br, lc, tf);
            lc.add(new StringTextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
        }
    }
}
