package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.sashiro.compressedblocks.util.Compression;

import java.util.List;

public class CBRotationalBlock extends RotatedPillarBlock {
    private final Compression compressor = new Compression();

    public CBRotationalBlock(Properties properties, int compressionLevel) {
        super(properties);
        compressor.setCompressionLevel(compressionLevel);
    }

    @Override
    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return super.rotate(blockState, rotation);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockBlockStateBuilder) {
        super.createBlockStateDefinition(blockBlockStateBuilder);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        return super.getStateForPlacement(blockPlaceContext);
    }

    @Override
    public void appendHoverText(ItemStack is, BlockGetter bg, List<Component> lC, TooltipFlag ttf) {
        super.appendHoverText(is, bg, lC, ttf);
        lC.add(new TextComponent(compressor.getBlockCount() + " Blocks").setStyle(compressor.getStyle()));
    }
}
