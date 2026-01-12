package net.sashiro.compressedblocks.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.util.CommonUtils;
import net.sashiro.compressedblocks.util.Compression;

public class CrateBlockItem extends BlockItem {

    private final Block block;

    public CrateBlockItem(Block block, Properties properties) {
        super(block, properties.stacksTo(64));
        this.block = block;
        Compression comp = new Compression();
        comp.setCompressionLevel(getLevel());
        String itemCount = comp.getQuantity();

        String itemName = CommonUtils.stringFormat(this.getDescriptionId()
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

        properties.overrideDescription(String.valueOf(Component.literal(itemCount + "x " + itemName).withStyle(comp.getStyle())));
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
}