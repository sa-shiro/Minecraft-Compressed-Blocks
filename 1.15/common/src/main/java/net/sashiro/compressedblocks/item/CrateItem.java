package net.sashiro.compressedblocks.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.util.Compression;
import net.sashiro.compressedblocks.util.StringUtils;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@SuppressWarnings("DuplicatedCode")
public class CrateItem extends BlockItem {
    
    private final Block block;
    private final String itemCount;
    private final Compression comp = new Compression();
    
    public CrateItem(Block block, Properties properties) {
        super(block, properties);
        this.block = block;
        comp.setCompressionLevel(getLevel());
        this.itemCount = comp.getBlockCount();
    }
    
    private int getLevel() {
        String name = block.getDescriptionId().replace("block.compressedblocks.", "").replace("item.compressedblocks.", "");
        if (name.startsWith("crated_")) return 0;
        if (name.startsWith("double_")) return 1;
        if (name.startsWith("triple_")) return 2;
        if (name.startsWith("quadruple_")) return 3;
        if (name.startsWith("quintuple_")) return 4;
        if (name.startsWith("sextuple_")) return 5;
        if (name.startsWith("septuple_")) return 6;
        if (name.startsWith("octuple_")) return 7;
        if (name.startsWith("mega_")) return 8;
        if (name.startsWith("giga_")) return 9;
        else return 0;
    }
    
    @Override
    @ParametersAreNonnullByDefault
    public void appendHoverText(ItemStack s, @Nullable Level l, List<Component> c, TooltipFlag t) {
        super.appendHoverText(s, l, c, t);
        String itemName = StringUtils.stringFormat(this.getDescriptionId()
                .replace("block.compressedblocks.", "")
                .replace("item.compressedblocks.", "")
                .replace("crated_", "")
                .replace("double_", "")
                .replace("triple_", "")
                .replace("quadruple_", "")
                .replace("quintuple_", "")
                .replace("sextuple_", "")
                .replace("septuple_", "")
                .replace("octuple_", "")
                .replace("mega_", "")
                .replace("giga_", "")
        );
        c.add(new TextComponent(itemCount + "x " + itemName).setStyle(comp.getStyle()));
    }
}