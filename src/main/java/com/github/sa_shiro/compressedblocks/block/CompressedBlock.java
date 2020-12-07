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
import javax.annotation.ParametersAreNonnullByDefault;
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
    @ParametersAreNonnullByDefault
    protected CompressedBlock(Material material, MaterialColor materialColor, SoundType sound, int compression, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
                .variableOpacity()
        );
        comp.setCompressionLevel(compression);
    }
    @ParametersAreNonnullByDefault
    protected CompressedBlock(Material material, MaterialColor materialColor, SoundType sound, int compression, float slipperiness) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(0.5F)
                .harvestLevel(0)
                .variableOpacity()
                .slipperiness(slipperiness)
        );
        comp.setCompressionLevel(compression);
    }

    /**
     * @param type {@link BlockType}
     * @param compression  Compression Level ( 0 - 9 )
     * @param material Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param soundType Minecraft {@link SoundType}
     * @param hardness     Block hardness               https://minecraftmodcustomstuff.fandom.com/wiki/Hardness
     * @param resistance   Block resistance             https://minecraftmodcustomstuff.fandom.com/wiki/Resistance
     * @param harvestLevel Block harvest level          0: Wood, 1: Stone/Gold, 2: Iron, 3: Diamond
     */
    public static ICompressedBlock createBlock(@Nonnull BlockType type, int compression, @Nonnull Material material, @Nullable MaterialColor materialColor, @Nonnull SoundType soundType, float hardness, float resistance, int harvestLevel) {
        if (materialColor == null) materialColor = material.getColor();
        switch (type) {
            default:
            case DEFAULT:
                return new CompressedBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case SAND:
                return new CompressedSand(14406560, material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case RED_SAND:
                return new CompressedSand(11098145, material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case GRAVEL:
                return new CompressedGravel(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case REDSTONE:
                return new CompressedRedstoneBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case SOUL_SAND:
                return new CompressedSoulSandBlock(material, materialColor, soundType, compression, hardness, resistance, harvestLevel);
            case WOOL:
                return new CompressedWool(material, materialColor, soundType, compression);
            case SLIME:
                return new CompressedSlimeBlock(material, materialColor, soundType, compression);
            case CUSTOM: // fixme: currently only used / usable for compressed flesh block
                return new CompressedBlock(material, materialColor, soundType, compression, 0.85f);
            case GLASS:
                return new CompressedBlock(Material.GLASS, MaterialColor.AIR, SoundType.GLASS, compression, 0.5F, 0.5F, 0);
        }
    }

    /**
     * @param dustColor  Dust Color
     * @param compression  Compression Level ( 0 - 9 )
     * @param material Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param soundType Minecraft {@link SoundType}
     * @param hardness     Block hardness               https://minecraftmodcustomstuff.fandom.com/wiki/Hardness
     * @param resistance   Block resistance             https://minecraftmodcustomstuff.fandom.com/wiki/Resistance
     * @param harvestLevel Block harvest level          0: Wood, 1: Stone/Gold, 2: Iron, 3: Diamond
     */
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