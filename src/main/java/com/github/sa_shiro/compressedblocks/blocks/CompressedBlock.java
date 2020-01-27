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
    private String blockCount;
    private TextFormatting color;

    /**
     * @param material     Minecraft Material
     * @param sound        Minecraft SoundType
     * @param compression  Compression Level ( 0 - 9 )
     * @param registryName Block registry name
     * @param hardness     Block hardness
     * @param resistance   Block resistance
     * @param harvestLevel Block harvest level
     */
    public CompressedBlock(Material material, SoundType sound, int compression, String registryName, float hardness, float resistance, int harvestLevel) {
        super(Properties.create(material)
                .sound(sound)
                .hardnessAndResistance(hardness, resistance)
                .harvestLevel(harvestLevel)
                .variableOpacity()
        );
        switch (compression) {
            case 0:
                this.blockCount = "9";
                this.color = TextFormatting.WHITE;
                this.registryName = "compressed_";
                break;
            case 1:
                this.blockCount = "81";
                this.color = TextFormatting.YELLOW;
                this.registryName = "double_compressed_";
                break;
            case 2:
                this.blockCount = "729";
                this.color = TextFormatting.YELLOW;
                this.registryName = "triple_compressed_";
                break;
            case 3:
                this.blockCount = "6.561";
                this.color = TextFormatting.YELLOW;
                this.registryName = "quadruple_compressed_";
                break;
            case 4:
                this.blockCount = "59.049";
                this.color = TextFormatting.AQUA;
                this.registryName = "quintuple_compressed_";
                break;
            case 5:
                this.blockCount = "531.441";
                this.color = TextFormatting.AQUA;
                this.registryName = "sextuple_compressed_";
                break;
            case 6:
                this.blockCount = "4.782.969";
                this.color = TextFormatting.LIGHT_PURPLE;
                this.registryName = "septuple_compressed_";
                break;
            case 7:
                this.blockCount = "43.046.721";
                this.color = TextFormatting.DARK_PURPLE;
                this.registryName = "octuple_compressed_";
                break;
            case 8:
                this.blockCount = "387.420.489";
                this.color = TextFormatting.DARK_RED;
                this.registryName = "mega_compressed_";
                break;
            case 9:
                this.blockCount = "3.486.784.101";
                this.color = TextFormatting.BLACK;
                this.registryName = "giga_compressed_";
                break;
            default:
                break;
        }
        setRegistryName(this.registryName + registryName);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(blockCount + " Blocks").applyTextStyle(color));
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }


}
