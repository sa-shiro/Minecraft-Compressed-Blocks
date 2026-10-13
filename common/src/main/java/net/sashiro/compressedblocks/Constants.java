package net.sashiro.compressedblocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.platform.Services;

import java.util.ArrayList;

public class Constants {

    public static final float[] HARDNESS = Services.PLATFORM.getHardnessArray();
    public static final float[] RESISTANCE = Services.PLATFORM.getResistanceArray();
    public static ArrayList<Block> BLOCKS = new ArrayList<>();
    public static ArrayList<Item> CRATE_ITEMS = new ArrayList<>();
    public static ArrayList<Block> CRATE_BLOCKS = new ArrayList<>();
    // note: unsafe due to initialization order, but fine as the config is always loaded first (or at least should be)
    public static int MAX_COMPRESSION_LEVEL = Services.PLATFORM.maxCompressionLevel();
    public static int MAX_CRATE_COMPRESSION_LEVEL = Services.PLATFORM.maxCrateCompressionLevel();
}