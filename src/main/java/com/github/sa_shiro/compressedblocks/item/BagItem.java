package com.github.sa_shiro.compressedblocks.item;

import com.github.sa_shiro.compressedblocks.block.Compression;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

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
                .tab(ItemGroups.compressedBlockGroup)
                .stacksTo(64)
        );
        comp.setCompressionLevel(level);
        this.toolTipText = toolTipText;
        this.itemCount = comp.getBlockCount();
    }


    @Override
    public void appendHoverText(ItemStack s, @Nullable Level l, List<Component> c, TooltipFlag t) {
        super.appendHoverText(s, l, c, t);
        c.add(new TextComponent(itemCount + " " + toolTipText).setStyle(comp.getStyle()));
    }
}