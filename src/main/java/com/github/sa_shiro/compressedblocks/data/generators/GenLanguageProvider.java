package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.event.ModRegistryEvent;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.fmllegacy.RegistryObject;

public class GenLanguageProvider extends LanguageProvider {
    public GenLanguageProvider(DataGenerator gen, String locale) {
        super(gen, CompressedBlocks.MOD_ID, locale);
    }

    private static String stringFormat(String formatString) {
        String[] words = formatString.split("\\s");
        StringBuilder stringFormat = new StringBuilder();
        for (String str : words) {
            String first = str.substring(0, 1);
            String afterFirst = str.substring(1);
            stringFormat.append(first.toUpperCase()).append(afterFirst).append(" ");
        }
        return stringFormat.toString().trim();
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
        add("block.compressedblocks.logo_block", "Logo Block (This Block has no use and is only used as the Creative Tab Logo)");

        for (RegistryObject<Block> block : ModRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getRegistryName().toString().replace("compressedblocks:", "");
            String name2 = "";
            for (int i = 0; i < 10; i++) {
                if (name.contains("c" + i))
                    name2 = name.replace("c" + i + "_", "");
            }
            if (!name.contains("logo_block"))
                add("block.compressedblocks." + name, compressionLevel(name) + stringFormat(name2.replace("_", " ")));
        }

        for (String itemName : Lists.ITEMS) {
            add("item.compressedblocks.crated_" + itemName, "Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.double_crated_" + itemName, "Double Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.triple_crated_" + itemName, "Triple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.quadruple_crated_" + itemName, "Quadruple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.quintuple_crated_" + itemName, "Quintuple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.sextuple_crated_" + itemName, "Sextuple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.septuple_crated_" + itemName, "Septuple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.octuple_crated_" + itemName, "Octuple Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.mega_crated_" + itemName, "Mega Crate of " + stringFormat(itemName.replace("_", " ")));
            add("item.compressedblocks.giga_crated_" + itemName, "Giga Crate of " + stringFormat(itemName.replace("_", " ")));
        }
    }
}