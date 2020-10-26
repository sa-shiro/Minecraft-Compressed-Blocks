package com.github.sa_shiro.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.List;

public class CompressedBlock extends Block {
    private String blockCount;
    private TextFormatting color;

    /**
     * @param material     Minecraft Material
     * @param sound        Minecraft SoundType
     * @param compression  Compression Level ( 0 - 9 )
     * @param hardness     Block hardness               https://minecraftmodcustomstuff.fandom.com/wiki/Hardness
     * @param resistance   Block resistance             https://minecraftmodcustomstuff.fandom.com/wiki/Resistance
     * @param harvestLevel Block harvest level          0: Wood, 1: Stone/Gold, 2: Iron, 3: Diamond
     */
    public CompressedBlock(Material material, SoundType sound, int compression, float hardness, float resistance, int harvestLevel) {
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
                break;
            case 1:
                this.blockCount = "81";
                this.color = TextFormatting.YELLOW;
                break;
            case 2:
                this.blockCount = "729";
                this.color = TextFormatting.YELLOW;
                break;
            case 3:
                this.blockCount = "6.561";
                this.color = TextFormatting.YELLOW;
                break;
            case 4:
                this.blockCount = "59.049";
                this.color = TextFormatting.AQUA;
                break;
            case 5:
                this.blockCount = "531.441";
                this.color = TextFormatting.AQUA;
                break;
            case 6:
                this.blockCount = "4.782.969";
                this.color = TextFormatting.LIGHT_PURPLE;
                break;
            case 7:
                this.blockCount = "43.046.721";
                this.color = TextFormatting.DARK_PURPLE;
                break;
            case 8:
                this.blockCount = "387.420.489";
                this.color = TextFormatting.RED;
                break;
            case 9:
                this.blockCount = "3.486.784.101";
                this.color = TextFormatting.DARK_RED;
                break;
            default:
                break;
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable IBlockReader worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(blockCount + " Blocks").func_240699_a_(color)); // fixme: needs mapping
    }
}