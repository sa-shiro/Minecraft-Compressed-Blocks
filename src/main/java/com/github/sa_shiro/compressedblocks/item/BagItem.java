package com.github.sa_shiro.compressedblocks.item;

import com.github.sa_shiro.compressedblocks.util.ItemGroup;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class BagItem extends Item {

    private final TextFormatting color;
    private final String itemCount;
    private final String text;

    /**
     * @param level       A int between 0 and 1 representing how much Items the BagItem contains<br>
     *                    <ul><li>0 = 9<br></li>
     *                    <li>1 = 81</li></ul>
     * @param toolTipText The text that will be added after the representation of how much Items the BagItem contains
     */
    public BagItem(int level, String toolTipText) {
        super(new Properties()
                .group(ItemGroup.compressedGroup)
                .maxStackSize(64)
        );
        this.text = toolTipText;

        switch (level) {
            default:
            case 0:
                this.itemCount = "9 ";
                this.color = TextFormatting.DARK_GREEN;
                break;
            case 1:
                this.itemCount = "81 ";
                this.color = TextFormatting.AQUA;
                break;
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(itemCount + text).func_240699_a_(color));
    }
}
