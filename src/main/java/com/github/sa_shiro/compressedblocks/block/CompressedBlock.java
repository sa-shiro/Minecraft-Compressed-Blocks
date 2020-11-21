package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class CompressedBlock extends Block implements ICompressedBlock {
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
    protected CompressedBlock(Material material, MaterialColor materialColor, SoundType sound, int compression, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
                .variableOpacity()
        );
        comp.setCompressionLevel(compression);
    }

    public static ICompressedBlock createBlock(@Nonnull BlockType type, int compression, @Nonnull Material material, @Nullable MaterialColor materialColor, @Nonnull SoundType soundType, float hardness, float resistance, int harvestLevel) {
        if (materialColor == null) materialColor = material.getColor();
        if (type == BlockType.DEFAULT)
            return new CompressedBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.SAND)
            return new CompressedSand(14406560, material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.RED_SAND)
            return new CompressedSand(11098145, material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.GRAVEL)
            return new CompressedGravel(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.REDSTONE)
            return new CompressedRedstoneBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.SOUL_SAND)
            return new CompressedSoulSandBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
        if (type == BlockType.WOOL)
            return new CompressedWool(material, materialColor, soundType, compression);
        if (type == BlockType.SLIME)
            return new CompressedSlimeBlock(material, materialColor, soundType, compression);
        else return null; // fixme: this should not return null !!!
    }

    public static ICompressedBlock createSandBlock(int dustColor, int compression, @Nonnull Material material, @Nullable MaterialColor materialColor, @Nonnull SoundType soundType, float hardness, float resistance, int harvestLevel) {
        if (materialColor == null) materialColor = material.getColor();
        return new CompressedSand(dustColor, material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
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