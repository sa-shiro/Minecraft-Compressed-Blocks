package net.sashiro.compressedblocks.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.sashiro.compressedblocks.block.ForgeCompressedBlock.*;

import static net.sashiro.compressedblocks.Constants.HARDNESS;
import static net.sashiro.compressedblocks.Constants.RESISTANCE;

@SuppressWarnings("unused")
public class ForgeBlockList {
    
    // DIRT
    public static final CustomDefaultBlock DIRT_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock DIRT_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock DIRT_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock DIRT_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock DIRT_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock DIRT_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock DIRT_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock DIRT_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock DIRT_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock DIRT_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIRT).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // GRAVEL
    public static final CustomGravelBlock GRAVEL_0 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomGravelBlock GRAVEL_1 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomGravelBlock GRAVEL_2 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomGravelBlock GRAVEL_3 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomGravelBlock GRAVEL_4 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomGravelBlock GRAVEL_5 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomGravelBlock GRAVEL_6 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomGravelBlock GRAVEL_7 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomGravelBlock GRAVEL_8 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomGravelBlock GRAVEL_9 = new CustomGravelBlock(Block.Properties.from(Blocks.GRAVEL).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // COBBLESTONE
    public static final CustomDefaultBlock COBBLESTONE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COBBLESTONE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COBBLESTONE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COBBLESTONE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COBBLESTONE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COBBLESTONE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COBBLESTONE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COBBLESTONE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COBBLESTONE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COBBLESTONE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.COBBLESTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STONE
    public static final CustomDefaultBlock STONE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock STONE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock STONE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock STONE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock STONE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock STONE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock STONE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock STONE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock STONE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock STONE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // GRANITE
    public static final CustomDefaultBlock GRANITE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GRANITE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GRANITE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GRANITE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GRANITE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GRANITE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GRANITE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GRANITE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GRANITE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GRANITE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.GRANITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // DIORITE
    public static final CustomDefaultBlock DIORITE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock DIORITE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock DIORITE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock DIORITE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock DIORITE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock DIORITE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock DIORITE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock DIORITE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock DIORITE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock DIORITE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.DIORITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // ANDESITE
    public static final CustomDefaultBlock ANDESITE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock ANDESITE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock ANDESITE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock ANDESITE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock ANDESITE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock ANDESITE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock ANDESITE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock ANDESITE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock ANDESITE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock ANDESITE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.ANDESITE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // CLAY
    public static final CustomDefaultBlock CLAY_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock CLAY_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock CLAY_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock CLAY_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock CLAY_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock CLAY_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock CLAY_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock CLAY_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock CLAY_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock CLAY_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.CLAY).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SAND
    public static final CustomSandBlock SAND_0 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomSandBlock SAND_1 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomSandBlock SAND_2 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomSandBlock SAND_3 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomSandBlock SAND_4 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomSandBlock SAND_5 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomSandBlock SAND_6 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomSandBlock SAND_7 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomSandBlock SAND_8 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomSandBlock SAND_9 = new CustomSandBlock(14406560, Block.Properties.from(Blocks.SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_SAND
    public static final CustomSandBlock RED_SAND_0 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomSandBlock RED_SAND_1 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomSandBlock RED_SAND_2 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomSandBlock RED_SAND_3 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomSandBlock RED_SAND_4 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomSandBlock RED_SAND_5 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomSandBlock RED_SAND_6 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomSandBlock RED_SAND_7 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomSandBlock RED_SAND_8 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomSandBlock RED_SAND_9 = new CustomSandBlock(11098145, Block.Properties.from(Blocks.RED_SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SANDSTONE
    public static final CustomDefaultBlock SANDSTONE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock SANDSTONE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock SANDSTONE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock SANDSTONE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock SANDSTONE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock SANDSTONE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock SANDSTONE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock SANDSTONE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock SANDSTONE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock SANDSTONE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.SANDSTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_SANDSTONE
    public static final CustomDefaultBlock RED_SANDSTONE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RED_SANDSTONE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RED_SANDSTONE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RED_SANDSTONE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RED_SANDSTONE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RED_SANDSTONE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RED_SANDSTONE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RED_SANDSTONE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RED_SANDSTONE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RED_SANDSTONE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_SANDSTONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // COAL_ORE
    public static final CustomDefaultBlock COAL_ORE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COAL_ORE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COAL_ORE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COAL_ORE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COAL_ORE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COAL_ORE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COAL_ORE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COAL_ORE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COAL_ORE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COAL_ORE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // IRON_ORE
    public static final CustomDefaultBlock IRON_ORE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock IRON_ORE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock IRON_ORE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock IRON_ORE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock IRON_ORE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock IRON_ORE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock IRON_ORE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock IRON_ORE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock IRON_ORE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock IRON_ORE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // GOLD_ORE
    public static final CustomDefaultBlock GOLD_ORE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GOLD_ORE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GOLD_ORE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GOLD_ORE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GOLD_ORE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GOLD_ORE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GOLD_ORE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GOLD_ORE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GOLD_ORE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GOLD_ORE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_QUARTZ_ORE
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_QUARTZ_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // LAPIS_ORE
    public static final CustomDefaultBlock LAPIS_ORE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock LAPIS_ORE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock LAPIS_ORE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock LAPIS_ORE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock LAPIS_ORE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock LAPIS_ORE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock LAPIS_ORE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock LAPIS_ORE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock LAPIS_ORE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock LAPIS_ORE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // REDSTONE_ORE
    public static final CustomRedstoneOreBlock REDSTONE_ORE_0 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_1 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_2 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_3 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_4 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_5 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_6 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_7 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_8 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_9 = new CustomRedstoneOreBlock(Block.Properties.from(Blocks.REDSTONE_ORE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // IRON_BLOCK
    public static final CustomDefaultBlock IRON_BLOCK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock IRON_BLOCK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock IRON_BLOCK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock IRON_BLOCK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock IRON_BLOCK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock IRON_BLOCK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock IRON_BLOCK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock IRON_BLOCK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock IRON_BLOCK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock IRON_BLOCK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.IRON_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // GOLD_BLOCK
    public static final CustomDefaultBlock GOLD_BLOCK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GOLD_BLOCK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GOLD_BLOCK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GOLD_BLOCK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GOLD_BLOCK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GOLD_BLOCK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GOLD_BLOCK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GOLD_BLOCK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GOLD_BLOCK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GOLD_BLOCK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.GOLD_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // LAPIS_BLOCK
    public static final CustomDefaultBlock LAPIS_BLOCK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock LAPIS_BLOCK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock LAPIS_BLOCK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock LAPIS_BLOCK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock LAPIS_BLOCK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock LAPIS_BLOCK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock LAPIS_BLOCK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock LAPIS_BLOCK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock LAPIS_BLOCK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock LAPIS_BLOCK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.LAPIS_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // REDSTONE_BLOCK
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_0 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_1 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_2 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_3 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_4 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_5 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_6 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_7 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_8 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_9 = new CustomRedstoneTorchBlock(Block.Properties.from(Blocks.REDSTONE_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // COAL_BLOCK
    public static final CustomDefaultBlock COAL_BLOCK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COAL_BLOCK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COAL_BLOCK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COAL_BLOCK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COAL_BLOCK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COAL_BLOCK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COAL_BLOCK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COAL_BLOCK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COAL_BLOCK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COAL_BLOCK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.COAL_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SLIME_BLOCK
    public static final CustomSlimeBlock SLIME_BLOCK_0 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomSlimeBlock SLIME_BLOCK_1 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomSlimeBlock SLIME_BLOCK_2 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomSlimeBlock SLIME_BLOCK_3 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomSlimeBlock SLIME_BLOCK_4 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomSlimeBlock SLIME_BLOCK_5 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomSlimeBlock SLIME_BLOCK_6 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomSlimeBlock SLIME_BLOCK_7 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomSlimeBlock SLIME_BLOCK_8 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomSlimeBlock SLIME_BLOCK_9 = new CustomSlimeBlock(Block.Properties.from(Blocks.SLIME_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // HONEY_BLOCK
    public static final CustomSlimeBlock HONEY_BLOCK_0 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4F).jumpFactor(0.5F), 0);
    public static final CustomSlimeBlock HONEY_BLOCK_1 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]).speedFactor(0.375F).jumpFactor(0.525F), 1);
    public static final CustomSlimeBlock HONEY_BLOCK_2 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]).speedFactor(0.35F).jumpFactor(0.55F), 2);
    public static final CustomSlimeBlock HONEY_BLOCK_3 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]).speedFactor(0.325F).jumpFactor(0.575F), 3);
    public static final CustomSlimeBlock HONEY_BLOCK_4 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]).speedFactor(0.3F).jumpFactor(0.6F), 4);
    public static final CustomSlimeBlock HONEY_BLOCK_5 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]).speedFactor(0.275F).jumpFactor(0.625F), 5);
    public static final CustomSlimeBlock HONEY_BLOCK_6 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]).speedFactor(0.25F).jumpFactor(0.65F), 6);
    public static final CustomSlimeBlock HONEY_BLOCK_7 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]).speedFactor(0.225F).jumpFactor(0.675F), 7);
    public static final CustomSlimeBlock HONEY_BLOCK_8 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]).speedFactor(0.2F).jumpFactor(0.7F), 8);
    public static final CustomSlimeBlock HONEY_BLOCK_9 = new CustomSlimeBlock(Block.Properties.from(Blocks.HONEY_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]).speedFactor(0.175F).jumpFactor(0.725F), 9);
    // BRICKS
    public static final CustomDefaultBlock BRICKS_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock BRICKS_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock BRICKS_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock BRICKS_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock BRICKS_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock BRICKS_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock BRICKS_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock BRICKS_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock BRICKS_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock BRICKS_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STONE_BRICKS
    public static final CustomDefaultBlock STONE_BRICKS_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock STONE_BRICKS_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock STONE_BRICKS_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock STONE_BRICKS_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock STONE_BRICKS_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock STONE_BRICKS_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock STONE_BRICKS_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock STONE_BRICKS_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock STONE_BRICKS_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock STONE_BRICKS_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.STONE_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHERRACK
    public static final CustomDefaultBlock NETHERRACK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHERRACK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHERRACK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHERRACK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHERRACK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHERRACK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHERRACK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHERRACK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHERRACK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHERRACK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHERRACK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_BRICKS
    public static final CustomDefaultBlock NETHER_BRICKS_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_BRICKS_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_BRICKS_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_BRICKS_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_BRICKS_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_BRICKS_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_BRICKS_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_BRICKS_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_BRICKS_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_BRICKS_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_NETHER_BRICKS
    public static final CustomDefaultBlock RED_NETHER_BRICKS_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.RED_NETHER_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_WART_BLOCK
    public static final CustomDefaultBlock NETHER_WART_BLOCK_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.NETHER_WART_BLOCK).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SOUL_SAND
    public static final CustomSoulSandBlock SOUL_SAND_0 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4f), 0);
    public static final CustomSoulSandBlock SOUL_SAND_1 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4f), 1);
    public static final CustomSoulSandBlock SOUL_SAND_2 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]).speedFactor(0.35f), 2);
    public static final CustomSoulSandBlock SOUL_SAND_3 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]).speedFactor(0.3f), 3);
    public static final CustomSoulSandBlock SOUL_SAND_4 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]).speedFactor(0.25f), 4);
    public static final CustomSoulSandBlock SOUL_SAND_5 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]).speedFactor(0.2f), 5);
    public static final CustomSoulSandBlock SOUL_SAND_6 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]).speedFactor(0.15f), 6);
    public static final CustomSoulSandBlock SOUL_SAND_7 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]).speedFactor(0.1f), 7);
    public static final CustomSoulSandBlock SOUL_SAND_8 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]).speedFactor(0.05f), 8);
    public static final CustomSoulSandBlock SOUL_SAND_9 = new CustomSoulSandBlock(Block.Properties.from(Blocks.SOUL_SAND).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]).speedFactor(0.01f), 9);
    // END_STONE
    public static final CustomDefaultBlock END_STONE_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock END_STONE_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock END_STONE_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock END_STONE_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock END_STONE_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock END_STONE_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock END_STONE_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock END_STONE_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock END_STONE_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock END_STONE_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // END_STONE_BRICKS
    public static final CustomDefaultBlock END_STONE_BRICKS_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock END_STONE_BRICKS_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock END_STONE_BRICKS_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock END_STONE_BRICKS_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock END_STONE_BRICKS_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock END_STONE_BRICKS_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock END_STONE_BRICKS_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock END_STONE_BRICKS_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock END_STONE_BRICKS_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock END_STONE_BRICKS_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.END_STONE_BRICKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // OBSIDIAN
    public static final CustomDefaultBlock OBSIDIAN_0 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(75, 1300), 0);
    public static final CustomDefaultBlock OBSIDIAN_1 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(100, 1400), 1);
    public static final CustomDefaultBlock OBSIDIAN_2 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(125, 1500), 2);
    public static final CustomDefaultBlock OBSIDIAN_3 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(150, 1600), 3);
    public static final CustomDefaultBlock OBSIDIAN_4 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(175, 1700), 4);
    public static final CustomDefaultBlock OBSIDIAN_5 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(200, 1800), 5);
    public static final CustomDefaultBlock OBSIDIAN_6 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(225, 2000), 6);
    public static final CustomDefaultBlock OBSIDIAN_7 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(250, 2500), 7);
    public static final CustomDefaultBlock OBSIDIAN_8 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(275, 2750), 8);
    public static final CustomDefaultBlock OBSIDIAN_9 = new CustomDefaultBlock(Block.Properties.from(Blocks.OBSIDIAN).hardnessAndResistance(300, 3000), 9);
    // OAK_LOG
    public static final CustomRotatedPillarBlock OAK_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock OAK_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock OAK_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock OAK_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock OAK_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock OAK_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock OAK_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock OAK_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock OAK_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock OAK_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SPRUCE_LOG
    public static final CustomRotatedPillarBlock SPRUCE_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // BIRCH_LOG
    public static final CustomRotatedPillarBlock BIRCH_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BIRCH_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BIRCH_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BIRCH_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BIRCH_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BIRCH_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BIRCH_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BIRCH_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BIRCH_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BIRCH_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // JUNGLE_LOG
    public static final CustomRotatedPillarBlock JUNGLE_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // ACACIA_LOG
    public static final CustomRotatedPillarBlock ACACIA_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock ACACIA_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock ACACIA_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock ACACIA_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock ACACIA_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock ACACIA_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock ACACIA_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock ACACIA_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock ACACIA_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock ACACIA_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // DARK_OAK_LOG
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_OAK_LOG
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_SPRUCE_LOG
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_SPRUCE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_BIRCH_LOG
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_BIRCH_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_JUNGLE_LOG
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_JUNGLE_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_ACACIA_LOG
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_ACACIA_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_DARK_OAK_LOG
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.STRIPPED_DARK_OAK_LOG).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // OAK_PLANKS
    public static final CustomRotatedPillarBlock OAK_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock OAK_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock OAK_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock OAK_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock OAK_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock OAK_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock OAK_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock OAK_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock OAK_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock OAK_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.OAK_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // SPRUCE_PLANKS
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.SPRUCE_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // BIRCH_PLANKS
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.BIRCH_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // JUNGLE_PLANKS
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.JUNGLE_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // ACACIA_PLANKS
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.ACACIA_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
    // DARK_OAK_PLANKS
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_0 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_1 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_2 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_3 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_4 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_5 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_6 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_7 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_8 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_9 = new CustomRotatedPillarBlock(Block.Properties.from(Blocks.DARK_OAK_PLANKS).hardnessAndResistance(HARDNESS[6], RESISTANCE[4]), 9);
}
