package net.sashiro.compressedblocks;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.platform.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class Constants {

    public static final String MOD_ID = "compressedblocks";
    public static final String MOD_NAME = "Compressed Blocks";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    public static final float[] HARDNESS = Services.PLATFORM.getHardnessArray();
    public static final float[] RESISTANCE = Services.PLATFORM.getResistanceArray();
    public static ArrayList<Block> BLOCKS = new ArrayList<>();
    public static ArrayList<Block> BLOCK_CRATES = new ArrayList<>();
    public static ArrayList<Item> CRATES = new ArrayList<>();
    public static int MAX_COMPRESSION_LEVEL = Services.PLATFORM.maxCompressionLevel();
    public static int MAX_CRATE_COMPRESSION_LEVEL = Services.PLATFORM.maxCrateCompressionLevel();
}