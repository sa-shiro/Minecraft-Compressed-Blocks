package com.github.sa_shiro.compressedblocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

public class CompressedBlock extends Block {
    private String registryName;
    private String tooltipName;
    private String blockCount;
    private TextFormatting color;

    /**
     *
     * @param material          Minecraft Material
     * @param soundType         Minecraft SoundType
     * @param level             Compression Level ( 0 - 6 )
     * @param registryName      Block registry name
     * @param tooltipBlockName  Block name displayed in Tooltip
     * @param hardness          Block hardness
     * @param resistance        Block resistance
     * @param harvestLevel      Block harvest level
     */
    public CompressedBlock(Material material, SoundType soundType, int level, String registryName, String tooltipBlockName, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material)
                .sound(soundType)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
        );
        switch (level) {
            case 0:
                this.blockCount = "9x ";
                this.color = TextFormatting.WHITE;
                this.registryName = "double_compressed_";
                break;
            case 1:
                this.blockCount = "81x ";
                this.color = TextFormatting.DARK_GREEN;
                this.registryName = "triple_compressed_";
                break;
            case 2:
                this.blockCount = "729x ";
                this.color = TextFormatting.AQUA;
                this.registryName = "quadruple_compressed_";
                break;
            case 3:
                this.blockCount = "6.561x ";
                this.color = TextFormatting.DARK_BLUE;
                this.registryName = "quintuple_compressed_";
                break;
            case 4:
                this.blockCount = "59.049x ";
                this.color = TextFormatting.BLUE;
                this.registryName = "sextuple_compressed_";
                break;
            case 5:
                this.blockCount = "531.441x ";
                this.color = TextFormatting.DARK_PURPLE;
                this.registryName = "septuple_compressed_";
                break;
            case 6:
                this.blockCount = "4.782.969x ";
                this.color = TextFormatting.DARK_RED;
                this.registryName = "octuple_compressed_";
                break;
            default:
                break;
        }

        setRegistryName(this.registryName + registryName);
        this.tooltipName = tooltipBlockName;
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(blockCount + tooltipName).applyTextStyle(color));
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
