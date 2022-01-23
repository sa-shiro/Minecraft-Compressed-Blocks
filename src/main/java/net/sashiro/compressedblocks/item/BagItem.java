package net.sashiro.compressedblocks.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.sashiro.compressedblocks.block.Compression;
import net.sashiro.compressedblocks.util.ItemGroups;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
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
    @ParametersAreNonnullByDefault
    public void appendHoverText(ItemStack i, @Nullable World w, List<ITextComponent> t, ITooltipFlag f) {
        t.add(new StringTextComponent(itemCount + " " + toolTipText).setStyle(comp.getStyle()));
    }
}