package net.sashiro.compressedblocks.world.level.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.sashiro.compressedblocks.world.level.block.Compression;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

public class BagItem extends Item {

    private final String itemCount;
    private final String toolTipText;
    private final Compression comp = new Compression();

    /**
     * @param level       An int between 0 and 9 representing how many Items the BagItem contains<br>
     * @param toolTipText The text that will be added after the representation of how many Items the BagItem contains
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
    @ParametersAreNonnullByDefault
    public void appendHoverText(ItemStack s, @Nullable Level l, List<Component> c, TooltipFlag t) {
        super.appendHoverText(s, l, c, t);
        c.add(new TextComponent(itemCount + " " + toolTipText).setStyle(comp.getStyle()));
    }
}