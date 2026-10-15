package net.sashiro.compressedblocks;


import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CompressedBlocks {

    public static final String MOD_ID = "compressedblocks";
    public static final String MOD_NAME = "Compressed Blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static ArrayList<Block> COMPRESSED_BLOCKS = new ArrayList<>();
    public static ArrayList<Block> CRATE_BLOCKS = new ArrayList<>();
    public static ArrayList<Item> CRATE_ITEMS = new ArrayList<>();

    public static void init() {
        LOGGER.info("Initializing {}...", MOD_NAME);
    }
}