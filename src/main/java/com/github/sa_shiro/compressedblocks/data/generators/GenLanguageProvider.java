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
        add("itemGroup.compressed_custom_blocks", "Custom Compressed Blocks");
        add("item.compressedblocks.hardened_wooden_pickaxe", "Hardened Wooden Pickaxe");
        add("item.compressedblocks.hardened_wooden_axe", "Hardened Wooden Axe");
        add("item.compressedblocks.hardened_wooden_shovel", "Hardened Wooden Shovel");
        add("item.compressedblocks.hardened_wooden_hoe", "Hardened Wooden Hoe");
        add("item.compressedblocks.hardened_wooden_sword", "Hardened Wooden Sword");
        add("item.compressedblocks.hardened_pickaxe", "Hardened Pickaxe");
        add("item.compressedblocks.hardened_axe", "Hardened Axe");
        add("item.compressedblocks.hardened_shovel", "Hardened Shovel");
        add("item.compressedblocks.hardened_hoe", "Hardened Hoe");
        add("item.compressedblocks.hardened_sword", "Hardened Sword");
        add("item.compressedblocks.hardened_iron_pickaxe", "Hardened Iron Pickaxe");
        add("item.compressedblocks.hardened_iron_axe", "Hardened Iron Axe");
        add("item.compressedblocks.hardened_iron_shovel", "Hardened Iron Shovel");
        add("item.compressedblocks.hardened_iron_hoe", "Hardened Iron Hoe");
        add("item.compressedblocks.hardened_iron_sword", "Hardened Iron Sword");
        add("item.compressedblocks.hardened_golden_pickaxe", "Hardened Golden Pickaxe");
        add("item.compressedblocks.hardened_golden_axe", "Hardened Golden Axe");
        add("item.compressedblocks.hardened_golden_shovel", "Hardened Golden Shovel");
        add("item.compressedblocks.hardened_golden_hoe", "Hardened Golden Hoe");
        add("item.compressedblocks.hardened_golden_sword", "Hardened Golden Sword");
        add("item.compressedblocks.hardened_diamond_pickaxe", "Hardened Diamond Pickaxe");
        add("item.compressedblocks.hardened_diamond_axe", "Hardened Diamond Axe");
        add("item.compressedblocks.hardened_diamond_shovel", "Hardened Diamond Shovel");
        add("item.compressedblocks.hardened_diamond_hoe", "Hardened Diamond Hoe");
        add("item.compressedblocks.hardened_diamond_sword", "Hardened Diamond Sword");
        add("item.compressedblocks.compressed_stick", "Compressed Stick");
        add("item.compressedblocks.compressed_wood", "Compressed Wood");
        add("item.compressedblocks.compressed_iron", "Compressed Iron");
        add("item.compressedblocks.compressed_gold", "Compressed Gold");
        add("item.compressedblocks.compressed_diamond", "Compressed Diamond");
        add("item.compressedblocks.ender_pearl_bag", "Sack of Ender Pearls");
        add("item.compressedblocks.huge_ender_pearl_bag", "Huge Sack of Ender Pearls");
        add("item.compressedblocks.ender_eye_bag", "Sack of Ender Eyes");
        add("item.compressedblocks.huge_ender_eye_bag", "Huge Sack of Ender Eyes");
        add("item.compressedblocks.egg_bag", "Sack of Eggs");
        add("item.compressedblocks.huge_egg_bag", "Huge Sack of Eggs");
        add("item.compressedblocks.logo_block", "Logo Block (This Block has no use and is only used as the Creative Tab Logo)");

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