package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

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

    @Override
    protected void addTranslations() {
        add("itemGroup.compressed_blocks", "Compressed Blocks");
        add("block.compressedblocks.logo_block", "Logo Block (This Block has no use and is only used as the Creative Tab Logo)");

        for (BlockFactory factory : Lists.blockList) {
            add("block.compressedblocks.c0_" + factory.getRegistryName(), "Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c1_" + factory.getRegistryName(), "Double Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c2_" + factory.getRegistryName(), "Triple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c3_" + factory.getRegistryName(), "Quadruple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c4_" + factory.getRegistryName(), "Quintuple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c5_" + factory.getRegistryName(), "Sextuple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c6_" + factory.getRegistryName(), "Septuple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c7_" + factory.getRegistryName(), "Octuple Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c8_" + factory.getRegistryName(), "Mega Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
            add("block.compressedblocks.c9_" + factory.getRegistryName(), "Giga Compressed " + stringFormat(factory.getRegistryName().replace("_", " ")));
        }
    }
}