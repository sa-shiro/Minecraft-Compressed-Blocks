package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

class CompressedRotationalBlock extends RotatedPillarBlock implements ICompressedBlock {
    private final Compression comp = new Compression();

    public CompressedRotationalBlock(Material material, SoundType soundType, MaterialColor topColor, MaterialColor sideColor, int compression, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material, (state) -> state.get(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? topColor : sideColor)
                .sound(soundType)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
                .variableOpacity()
        );
        comp.setCompressionLevel(compression);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    public CompressedRotationalBlock(Material material, SoundType soundType, MaterialColor materialColor, int compression, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material, (state) -> {
                    return materialColor;
                })
                        .sound(soundType)
                        .hardnessAndResistance(hardness, resistance)
                        .harvestLevel(harvestLevel)
                        .variableOpacity()
        );
        comp.setCompressionLevel(compression);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.Y));
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(comp.getBlockCount() + " Blocks").setStyle(comp.getStyle()));
    }

    @Override
    public Block getBlock() {
        return this;
    }
}
