package com.github.sa_shiro.compressedblocks.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;

import static com.github.sa_shiro.compressedblocks.CompressedBlocks.MOD_ID;

public class CompressedItemList {

    public static final String base = MOD_ID + ":hardened_";

    @ObjectHolder(base + "pickaxe")
    public static Item HARDENED_PICKAXE;
    @ObjectHolder(base + "axe")
    public static Item HARDENED_AXE;
    @ObjectHolder(base + "shovel")
    public static Item HARDENED_SHOVEL;
    @ObjectHolder(base + "hoe")
    public static Item HARDENED_HOE;
    @ObjectHolder(base + "sword")
    public static Item HARDENED_SWORD;

    @ObjectHolder(base + "stick")
    public static Item HARDENED_STICK;
}
