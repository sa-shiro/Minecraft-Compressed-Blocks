package net.sashiro.compressedblocks;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CompressedBlocks {

    public static final String MOD_ID = "compressedblocks";
    public static final String MOD_NAME = "Compressed Blocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static void init() {
        LOGGER.info("Initializing {}...", MOD_NAME);
    }
}