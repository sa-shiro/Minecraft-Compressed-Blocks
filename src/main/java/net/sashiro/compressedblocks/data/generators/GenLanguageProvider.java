package net.sashiro.compressedblocks.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.event.ModRegistryEvent;
import net.sashiro.compressedblocks.util.StringUtils;
import net.sashiro.compressedblocks.world.level.item.CrateItems;

public class GenLanguageProvider extends LanguageProvider {
    public GenLanguageProvider(DataGenerator gen, String locale) {
        super(gen, CompressedBlocks.MOD_ID, locale);
    }

    private String compressionLevel(String registryName) {
        String str = registryName.substring(0, 2);
        return switch (str) {
            case "c0" -> "Compressed ";
            case "c1" -> "Double Compressed ";
            case "c2" -> "Triple Compressed ";
            case "c3" -> "Quadruple Compressed ";
            case "c4" -> "Quintuple Compressed ";
            case "c5" -> "Sextuple Compressed ";
            case "c6" -> "Septuple Compressed ";
            case "c7" -> "Octuple Compressed ";
            case "c8" -> "Mega Compressed ";
            case "c9" -> "Giga Compressed ";
            default -> "";
        };
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.compressed_blocks", "Compressed Blocks");
        add("itemGroup.compressed_items", "Compressed Items");
        add("block.compressedblocks.logo_block", "Logo Block (This Block has no use and is only used as the Creative Tab Logo)");

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            if (!name.contains("logo_block"))
                add("block.compressedblocks." + name, compressionLevel(name) + StringUtils.stringFormat(name2.replace("_", " ")));
        }

        for (String itemName : CrateItems.CRATE_ITEMS) {
            add("item.compressedblocks.crated_" + itemName, "Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.double_crated_" + itemName, "Double Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.triple_crated_" + itemName, "Triple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.quadruple_crated_" + itemName, "Quadruple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.quintuple_crated_" + itemName, "Quintuple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.sextuple_crated_" + itemName, "Sextuple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.septuple_crated_" + itemName, "Septuple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.octuple_crated_" + itemName, "Octuple Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.mega_crated_" + itemName, "Mega Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.giga_crated_" + itemName, "Giga Crate of " + StringUtils.stringFormat(itemName.replace("_", " ")));
        }
    }
}