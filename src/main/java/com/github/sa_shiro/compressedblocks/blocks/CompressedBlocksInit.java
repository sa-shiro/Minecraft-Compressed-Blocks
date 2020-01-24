package com.github.sa_shiro.compressedblocks.blocks;

import net.minecraftforge.registries.ObjectHolder;

import  static  com.github.sa_shiro.compressedblocks.CompressedBlocks.MOD_ID;

public class CompressedBlocksInit {

    public static final String doubleCompression = MOD_ID + ":double_compressed_";

    // Double compressed Blocks
    @ObjectHolder(doubleCompression + "stone")
    public static CompressedBlock DOUBLE_COMPRESSED_STONE;
    @ObjectHolder(MOD_ID + ":double_compressed_granite")
    public static CompressedBlock DOUBLE_COMPRESSED_GRANITE;
    @ObjectHolder(MOD_ID + ":double_compressed_diorite")
    public static CompressedBlock DOUBLE_COMPRESSED_DIORITE;

}
