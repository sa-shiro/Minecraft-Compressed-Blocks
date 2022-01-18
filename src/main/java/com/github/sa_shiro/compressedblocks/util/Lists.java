package com.github.sa_shiro.compressedblocks.util;

import java.util.ArrayList;

public class Lists {
    public final static ArrayList<Float> HARDNESS = new ArrayList<>();
    public final static ArrayList<Float> RESISTANCE = new ArrayList<>();
    public final static ArrayList<Integer> HARVEST_LEVEL = new ArrayList<>();
    public static final ArrayList<String> ITEMS = new ArrayList<>();

    public static void populate() {
        // fixme: modify or remove this
        HARDNESS.add(0, 1.0f);
        HARDNESS.add(1, 1.1f);
        HARDNESS.add(2, 1.15f);
        HARDNESS.add(3, 1.2f);
        HARDNESS.add(4, 1.25f);
        HARDNESS.add(5, 1.3f);
        HARDNESS.add(6, 1.35f);
        HARDNESS.add(7, 1.4f);
        HARDNESS.add(8, 1.6f);
        HARDNESS.add(9, 1.8f);

        RESISTANCE.add(0, 35.0f);
        RESISTANCE.add(1, 40.0f);
        RESISTANCE.add(2, 40.0f);
        RESISTANCE.add(3, 50.0f);
        RESISTANCE.add(4, 50.0f);
        RESISTANCE.add(5, 50.0f);
        RESISTANCE.add(6, 75.0f);
        RESISTANCE.add(7, 125.0f);
        RESISTANCE.add(8, 150.0f);
        RESISTANCE.add(9, 200.0f);

        ITEMS.add("apples");
        ITEMS.add("arrows");
        ITEMS.add("beetroots");
        ITEMS.add("beetroot_seeds");
        ITEMS.add("blaze_powder");
        ITEMS.add("blaze_rods");
        ITEMS.add("bones");
        ITEMS.add("carrots");
        ITEMS.add("eggs");
        ITEMS.add("ender_eyes");
        ITEMS.add("ender_pearls");
        ITEMS.add("feathers");
        ITEMS.add("leather");
        ITEMS.add("melons");
        ITEMS.add("potatoes");
        ITEMS.add("sugar_canes");
        ITEMS.add("melon_seeds");
        ITEMS.add("pumpkin");
        ITEMS.add("pumpkin_seeds");
        ITEMS.add("wheat_seeds");
        ITEMS.add("spider_eyes");
        ITEMS.add("strings");
        ITEMS.add("sticks");
        ITEMS.add("sugar");
    }
}