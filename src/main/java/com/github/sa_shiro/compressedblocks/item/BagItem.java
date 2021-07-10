package com.github.sa_shiro.compressedblocks.item;

import com.github.sa_shiro.compressedblocks.block.Compression;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class BagItem extends Item {

    private final String itemCount;
    private final String toolTipText;
    private final Compression comp = new Compression();

    /**
     * @param level       A int between 0 and 9 representing how much Items the BagItem contains<br>
     * @param toolTipText The text that will be added after the representation of how much Items the BagItem contains
     */
    public BagItem(int level, String toolTipText) {
        super(new Properties()
                .group(ItemGroups.compressedBlockGroup)
                .maxStackSize(64)
        );
        comp.setCompressionLevel(level);
        this.toolTipText = toolTipText;
        this.itemCount = comp.getBlockCount();
    }

    /**
     * @param level       A int between 0 and 9 representing how much Items the BagItem contains<br>
     * @param toolTipText The text that will be added after the representation of how much Items the BagItem contains
     * @param itemGroup   The Item Group the Item should be placed in
     */
    public BagItem(int level, String toolTipText, ItemGroup itemGroup) {
        super(new Properties()
                .group(itemGroup)
                .maxStackSize(64)
        );
        comp.setCompressionLevel(level);
        this.toolTipText = toolTipText;
        this.itemCount = comp.getBlockCount();
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable World worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(itemCount + " " + toolTipText).setStyle(comp.getStyle()));
    }
}
