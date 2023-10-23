package net.sashiro.compressedblocks.block;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.sashiro.compressedblocks.block.CompressedBlock.*;

import static net.sashiro.compressedblocks.Constants.HARDNESS;
import static net.sashiro.compressedblocks.Constants.RESISTANCE;

@SuppressWarnings("unused")
public class BlockList {

    // DIRT
    public static final CustomDefaultBlock DIRT_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock DIRT_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock DIRT_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock DIRT_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock DIRT_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock DIRT_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock DIRT_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock DIRT_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock DIRT_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock DIRT_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // GRAVEL
    public static final CustomGravelBlock GRAVEL_0 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomGravelBlock GRAVEL_1 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomGravelBlock GRAVEL_2 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomGravelBlock GRAVEL_3 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomGravelBlock GRAVEL_4 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomGravelBlock GRAVEL_5 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomGravelBlock GRAVEL_6 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomGravelBlock GRAVEL_7 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomGravelBlock GRAVEL_8 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomGravelBlock GRAVEL_9 = new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // COBBLESTONE
    public static final CustomDefaultBlock COBBLESTONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COBBLESTONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COBBLESTONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COBBLESTONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COBBLESTONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COBBLESTONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COBBLESTONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COBBLESTONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COBBLESTONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COBBLESTONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STONE
    public static final CustomDefaultBlock STONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock STONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock STONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock STONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock STONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock STONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock STONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock STONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock STONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock STONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // GRANITE
    public static final CustomDefaultBlock GRANITE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GRANITE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GRANITE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GRANITE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GRANITE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GRANITE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GRANITE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GRANITE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GRANITE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GRANITE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // DIORITE
    public static final CustomDefaultBlock DIORITE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock DIORITE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock DIORITE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock DIORITE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock DIORITE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock DIORITE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock DIORITE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock DIORITE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock DIORITE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock DIORITE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ANDESITE
    public static final CustomDefaultBlock ANDESITE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock ANDESITE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock ANDESITE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock ANDESITE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock ANDESITE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock ANDESITE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock ANDESITE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock ANDESITE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock ANDESITE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock ANDESITE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CRIMSON_NYLIUM
    public static final CustomNyliumBlock CRIMSON_NYLIUM_0 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_1 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_2 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_3 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_4 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_5 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_6 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_7 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_8 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomNyliumBlock CRIMSON_NYLIUM_9 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WARPED_NYLIUM
    public static final CustomNyliumBlock WARPED_NYLIUM_0 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomNyliumBlock WARPED_NYLIUM_1 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomNyliumBlock WARPED_NYLIUM_2 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomNyliumBlock WARPED_NYLIUM_3 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomNyliumBlock WARPED_NYLIUM_4 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomNyliumBlock WARPED_NYLIUM_5 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomNyliumBlock WARPED_NYLIUM_6 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomNyliumBlock WARPED_NYLIUM_7 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomNyliumBlock WARPED_NYLIUM_8 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomNyliumBlock WARPED_NYLIUM_9 = new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CLAY
    public static final CustomDefaultBlock CLAY_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock CLAY_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock CLAY_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock CLAY_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock CLAY_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock CLAY_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock CLAY_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock CLAY_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock CLAY_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock CLAY_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SAND
    public static final CustomSandBlock SAND_0 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomSandBlock SAND_1 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomSandBlock SAND_2 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomSandBlock SAND_3 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomSandBlock SAND_4 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomSandBlock SAND_5 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomSandBlock SAND_6 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomSandBlock SAND_7 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomSandBlock SAND_8 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomSandBlock SAND_9 = new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_SAND
    public static final CustomSandBlock RED_SAND_0 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomSandBlock RED_SAND_1 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomSandBlock RED_SAND_2 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomSandBlock RED_SAND_3 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomSandBlock RED_SAND_4 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomSandBlock RED_SAND_5 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomSandBlock RED_SAND_6 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomSandBlock RED_SAND_7 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomSandBlock RED_SAND_8 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomSandBlock RED_SAND_9 = new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SANDSTONE
    public static final CustomDefaultBlock SANDSTONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock SANDSTONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock SANDSTONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock SANDSTONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock SANDSTONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock SANDSTONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock SANDSTONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock SANDSTONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock SANDSTONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock SANDSTONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_SANDSTONE
    public static final CustomDefaultBlock RED_SANDSTONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RED_SANDSTONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RED_SANDSTONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RED_SANDSTONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RED_SANDSTONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RED_SANDSTONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RED_SANDSTONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RED_SANDSTONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RED_SANDSTONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RED_SANDSTONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // COAL_ORE
    public static final CustomDefaultBlock COAL_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COAL_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COAL_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COAL_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COAL_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COAL_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COAL_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COAL_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COAL_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COAL_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // IRON_ORE
    public static final CustomDefaultBlock IRON_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock IRON_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock IRON_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock IRON_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock IRON_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock IRON_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock IRON_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock IRON_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock IRON_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock IRON_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // GOLD_ORE
    public static final CustomDefaultBlock GOLD_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GOLD_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GOLD_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GOLD_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GOLD_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GOLD_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GOLD_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GOLD_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GOLD_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GOLD_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_GOLD_ORE
    public static final CustomDefaultBlock NETHER_GOLD_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_GOLD_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_QUARTZ_ORE
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_QUARTZ_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // LAPIS_ORE
    public static final CustomDefaultBlock LAPIS_ORE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock LAPIS_ORE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock LAPIS_ORE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock LAPIS_ORE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock LAPIS_ORE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock LAPIS_ORE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock LAPIS_ORE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock LAPIS_ORE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock LAPIS_ORE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock LAPIS_ORE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // REDSTONE_ORE
    public static final CustomRedstoneOreBlock REDSTONE_ORE_0 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_1 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_2 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_3 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_4 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_5 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_6 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_7 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_8 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRedstoneOreBlock REDSTONE_ORE_9 = new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // IRON_BLOCK
    public static final CustomDefaultBlock IRON_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock IRON_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock IRON_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock IRON_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock IRON_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock IRON_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock IRON_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock IRON_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock IRON_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock IRON_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // GOLD_BLOCK
    public static final CustomDefaultBlock GOLD_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock GOLD_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock GOLD_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock GOLD_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock GOLD_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock GOLD_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock GOLD_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock GOLD_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock GOLD_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock GOLD_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // LAPIS_BLOCK
    public static final CustomDefaultBlock LAPIS_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock LAPIS_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock LAPIS_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock LAPIS_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock LAPIS_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock LAPIS_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock LAPIS_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock LAPIS_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock LAPIS_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock LAPIS_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // REDSTONE_BLOCK
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_0 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_1 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_2 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_3 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_4 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_5 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_6 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_7 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_8 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRedstoneTorchBlock REDSTONE_BLOCK_9 = new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // COAL_BLOCK
    public static final CustomDefaultBlock COAL_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COAL_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COAL_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COAL_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COAL_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COAL_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COAL_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COAL_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COAL_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COAL_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SLIME_BLOCK
    public static final CustomSlimeBlock SLIME_BLOCK_0 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion(), 0);
    public static final CustomSlimeBlock SLIME_BLOCK_1 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion(), 1);
    public static final CustomSlimeBlock SLIME_BLOCK_2 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion(), 2);
    public static final CustomSlimeBlock SLIME_BLOCK_3 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion(), 3);
    public static final CustomSlimeBlock SLIME_BLOCK_4 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion(), 4);
    public static final CustomSlimeBlock SLIME_BLOCK_5 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion(), 5);
    public static final CustomSlimeBlock SLIME_BLOCK_6 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion(), 6);
    public static final CustomSlimeBlock SLIME_BLOCK_7 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion(), 7);
    public static final CustomSlimeBlock SLIME_BLOCK_8 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion(), 8);
    public static final CustomSlimeBlock SLIME_BLOCK_9 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion(), 9);
    // HONEY_BLOCK
    public static final CustomSlimeBlock HONEY_BLOCK_0 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4F).jumpFactor(0.5F), 0);
    public static final CustomSlimeBlock HONEY_BLOCK_1 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).speedFactor(0.375F).jumpFactor(0.525F), 1);
    public static final CustomSlimeBlock HONEY_BLOCK_2 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).speedFactor(0.35F).jumpFactor(0.55F), 2);
    public static final CustomSlimeBlock HONEY_BLOCK_3 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).speedFactor(0.325F).jumpFactor(0.575F), 3);
    public static final CustomSlimeBlock HONEY_BLOCK_4 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).speedFactor(0.3F).jumpFactor(0.6F), 4);
    public static final CustomSlimeBlock HONEY_BLOCK_5 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).speedFactor(0.275F).jumpFactor(0.625F), 5);
    public static final CustomSlimeBlock HONEY_BLOCK_6 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).speedFactor(0.25F).jumpFactor(0.65F), 6);
    public static final CustomSlimeBlock HONEY_BLOCK_7 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).speedFactor(0.225F).jumpFactor(0.675F), 7);
    public static final CustomSlimeBlock HONEY_BLOCK_8 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).speedFactor(0.2F).jumpFactor(0.7F), 8);
    public static final CustomSlimeBlock HONEY_BLOCK_9 = new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).speedFactor(0.175F).jumpFactor(0.725F), 9);
    // BRICKS
    public static final CustomDefaultBlock BRICKS_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock BRICKS_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock BRICKS_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock BRICKS_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock BRICKS_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock BRICKS_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock BRICKS_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock BRICKS_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock BRICKS_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock BRICKS_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STONE_BRICKS
    public static final CustomDefaultBlock STONE_BRICKS_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock STONE_BRICKS_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock STONE_BRICKS_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock STONE_BRICKS_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock STONE_BRICKS_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock STONE_BRICKS_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock STONE_BRICKS_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock STONE_BRICKS_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock STONE_BRICKS_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock STONE_BRICKS_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHERRACK
    public static final CustomDefaultBlock NETHERRACK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHERRACK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHERRACK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHERRACK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHERRACK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHERRACK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHERRACK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHERRACK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHERRACK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHERRACK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_BRICKS
    public static final CustomDefaultBlock NETHER_BRICKS_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_BRICKS_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_BRICKS_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_BRICKS_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_BRICKS_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_BRICKS_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_BRICKS_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_BRICKS_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_BRICKS_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_BRICKS_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // RED_NETHER_BRICKS
    public static final CustomDefaultBlock RED_NETHER_BRICKS_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RED_NETHER_BRICKS_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // NETHER_WART_BLOCK
    public static final CustomDefaultBlock NETHER_WART_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock NETHER_WART_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SOUL_SAND
    public static final CustomSoulSandBlock SOUL_SAND_0 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4f), 0);
    public static final CustomSoulSandBlock SOUL_SAND_1 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[2], RESISTANCE[0]).speedFactor(0.4f), 1);
    public static final CustomSoulSandBlock SOUL_SAND_2 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[3], RESISTANCE[1]).speedFactor(0.35f), 2);
    public static final CustomSoulSandBlock SOUL_SAND_3 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[3], RESISTANCE[1]).speedFactor(0.3f), 3);
    public static final CustomSoulSandBlock SOUL_SAND_4 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[4], RESISTANCE[2]).speedFactor(0.25f), 4);
    public static final CustomSoulSandBlock SOUL_SAND_5 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[4], RESISTANCE[2]).speedFactor(0.2f), 5);
    public static final CustomSoulSandBlock SOUL_SAND_6 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[5], RESISTANCE[3]).speedFactor(0.15f), 6);
    public static final CustomSoulSandBlock SOUL_SAND_7 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[5], RESISTANCE[3]).speedFactor(0.1f), 7);
    public static final CustomSoulSandBlock SOUL_SAND_8 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[6], RESISTANCE[4]).speedFactor(0.05f), 8);
    public static final CustomSoulSandBlock SOUL_SAND_9 = new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[6], RESISTANCE[4]).speedFactor(0.01f), 9);
    // SOUL_SOIL
    public static final CustomDefaultBlock SOUL_SOIL_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock SOUL_SOIL_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock SOUL_SOIL_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock SOUL_SOIL_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock SOUL_SOIL_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock SOUL_SOIL_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock SOUL_SOIL_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock SOUL_SOIL_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock SOUL_SOIL_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock SOUL_SOIL_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // END_STONE
    public static final CustomDefaultBlock END_STONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock END_STONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock END_STONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock END_STONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock END_STONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock END_STONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock END_STONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock END_STONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock END_STONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock END_STONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // END_STONE_BRICKS
    public static final CustomDefaultBlock END_STONE_BRICKS_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock END_STONE_BRICKS_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock END_STONE_BRICKS_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock END_STONE_BRICKS_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock END_STONE_BRICKS_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock END_STONE_BRICKS_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock END_STONE_BRICKS_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock END_STONE_BRICKS_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock END_STONE_BRICKS_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock END_STONE_BRICKS_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BLACKSTONE
    public static final CustomDefaultBlock BLACKSTONE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock BLACKSTONE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock BLACKSTONE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock BLACKSTONE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock BLACKSTONE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock BLACKSTONE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock BLACKSTONE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock BLACKSTONE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock BLACKSTONE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock BLACKSTONE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // DEEPSLATE
    public static final CustomDefaultBlock DEEPSLATE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock DEEPSLATE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock DEEPSLATE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock DEEPSLATE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock DEEPSLATE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock DEEPSLATE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock DEEPSLATE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock DEEPSLATE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock DEEPSLATE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock DEEPSLATE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // COBBLED_DEEPSLATE
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COBBLED_DEEPSLATE_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // TUFF
    public static final CustomDefaultBlock TUFF_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock TUFF_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock TUFF_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock TUFF_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock TUFF_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock TUFF_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock TUFF_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock TUFF_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock TUFF_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock TUFF_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BASALT
    public static final CustomRotatedPillarBlock BASALT_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BASALT_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BASALT_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BASALT_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BASALT_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BASALT_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BASALT_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BASALT_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BASALT_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BASALT_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // OBSIDIAN
    public static final CustomDefaultBlock OBSIDIAN_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(75, 1300), 0);
    public static final CustomDefaultBlock OBSIDIAN_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(100, 1400), 1);
    public static final CustomDefaultBlock OBSIDIAN_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(125, 1500), 2);
    public static final CustomDefaultBlock OBSIDIAN_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(150, 1600), 3);
    public static final CustomDefaultBlock OBSIDIAN_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(175, 1700), 4);
    public static final CustomDefaultBlock OBSIDIAN_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(200, 1800), 5);
    public static final CustomDefaultBlock OBSIDIAN_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(225, 2000), 6);
    public static final CustomDefaultBlock OBSIDIAN_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(250, 2500), 7);
    public static final CustomDefaultBlock OBSIDIAN_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(275, 2750), 8);
    public static final CustomDefaultBlock OBSIDIAN_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(300, 3000), 9);
    // RAW_IRON_BLOCK
    public static final CustomDefaultBlock RAW_IRON_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RAW_IRON_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // RAW_COPPER_BLOCK
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RAW_COPPER_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // RAW_GOLD_BLOCK
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock RAW_GOLD_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // MUD
    public static final CustomMudBlock MUD_0 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomMudBlock MUD_1 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomMudBlock MUD_2 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomMudBlock MUD_3 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomMudBlock MUD_4 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomMudBlock MUD_5 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomMudBlock MUD_6 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomMudBlock MUD_7 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomMudBlock MUD_8 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomMudBlock MUD_9 = new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // OAK_LOG
    public static final CustomRotatedPillarBlock OAK_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock OAK_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock OAK_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock OAK_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock OAK_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock OAK_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock OAK_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock OAK_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock OAK_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock OAK_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SPRUCE_LOG
    public static final CustomRotatedPillarBlock SPRUCE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SPRUCE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BIRCH_LOG
    public static final CustomRotatedPillarBlock BIRCH_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BIRCH_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BIRCH_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BIRCH_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BIRCH_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BIRCH_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BIRCH_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BIRCH_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BIRCH_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BIRCH_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // JUNGLE_LOG
    public static final CustomRotatedPillarBlock JUNGLE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock JUNGLE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ACACIA_LOG
    public static final CustomRotatedPillarBlock ACACIA_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock ACACIA_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock ACACIA_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock ACACIA_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock ACACIA_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock ACACIA_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock ACACIA_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock ACACIA_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock ACACIA_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock ACACIA_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // DARK_OAK_LOG
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock DARK_OAK_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // MANGROVE_LOG
    public static final CustomRotatedPillarBlock MANGROVE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock MANGROVE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CHERRY_LOG
    public static final CustomRotatedPillarBlock CHERRY_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CHERRY_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CHERRY_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CHERRY_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CHERRY_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CHERRY_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CHERRY_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CHERRY_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CHERRY_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CHERRY_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_OAK_LOG
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_OAK_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_SPRUCE_LOG
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_SPRUCE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_SPRUCE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_BIRCH_LOG
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_BIRCH_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_BIRCH_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_JUNGLE_LOG
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_JUNGLE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_JUNGLE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_ACACIA_LOG
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_ACACIA_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_ACACIA_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_DARK_OAK_LOG
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_DARK_OAK_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_DARK_OAK_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_MANGROVE_LOG
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_MANGROVE_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_MANGROVE_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STRIPPED_CHERRY_LOG
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock STRIPPED_CHERRY_LOG_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_CHERRY_LOG).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // OAK_PLANKS
    public static final CustomRotatedPillarBlock OAK_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock OAK_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock OAK_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock OAK_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock OAK_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock OAK_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock OAK_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock OAK_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock OAK_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock OAK_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SPRUCE_PLANKS
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SPRUCE_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BIRCH_PLANKS
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BIRCH_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // JUNGLE_PLANKS
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock JUNGLE_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ACACIA_PLANKS
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock ACACIA_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // DARK_OAK_PLANKS
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock DARK_OAK_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // MANGROVE_PLANKS
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock MANGROVE_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CHERRY_PLANKS
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CHERRY_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BAMBOO_PLANKS
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BAMBOO_PLANKS_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // BAMBOO_MOSAIC
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BAMBOO_MOSAIC_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ==================================================
    // Version: 1.3.8
    // ==================================================
    // COPPER_BLOCK
    public static final CustomDefaultBlock COPPER_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock COPPER_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock COPPER_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock COPPER_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock COPPER_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock COPPER_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock COPPER_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock COPPER_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock COPPER_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock COPPER_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CUT_COPPER
    public static final CustomDefaultBlock CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // EXPOSED_COPPER
    public static final CustomDefaultBlock EXPOSED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock EXPOSED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock EXPOSED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock EXPOSED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock EXPOSED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock EXPOSED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock EXPOSED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock EXPOSED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock EXPOSED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock EXPOSED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // EXPOSED_CUT_COPPER
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock EXPOSED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.EXPOSED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WEATHERED_COPPER
    public static final CustomDefaultBlock WEATHERED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WEATHERED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WEATHERED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WEATHERED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WEATHERED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WEATHERED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WEATHERED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WEATHERED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WEATHERED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WEATHERED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WEATHERED_CUT_COPPER
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WEATHERED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WEATHERED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // OXIDIZED_COPPER
    public static final CustomDefaultBlock OXIDIZED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock OXIDIZED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock OXIDIZED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock OXIDIZED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock OXIDIZED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock OXIDIZED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock OXIDIZED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock OXIDIZED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock OXIDIZED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock OXIDIZED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // OXIDIZED_CUT_COPPER
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock OXIDIZED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_COPPER_BLOCK
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_COPPER_BLOCK_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_CUT_COPPER
    public static final CustomDefaultBlock WAXED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_EXPOSED_COPPER
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_EXPOSED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_EXPOSED_CUT_COPPER
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_EXPOSED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_EXPOSED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_WEATHERED_COPPER
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_WEATHERED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_WEATHERED_CUT_COPPER
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_WEATHERED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_WEATHERED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_OXIDIZED_COPPER
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_OXIDIZED_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // WAXED_OXIDIZED_CUT_COPPER
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_0 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_1 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_2 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_3 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_4 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_5 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_6 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_7 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_8 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomDefaultBlock WAXED_OXIDIZED_CUT_COPPER_9 = new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ==================================================
    // Version: 1.3.9
    // ==================================================
    // BONE_BLOCK
    public static final CustomRotatedPillarBlock BONE_BLOCK_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock BONE_BLOCK_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock BONE_BLOCK_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock BONE_BLOCK_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock BONE_BLOCK_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock BONE_BLOCK_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock BONE_BLOCK_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock BONE_BLOCK_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock BONE_BLOCK_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock BONE_BLOCK_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // ==================================================
    // Version: 1.4.0
    // ==================================================
    // SCULK
    public static final CustomRotatedPillarBlock SCULK_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SCULK_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SCULK_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SCULK_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SCULK_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SCULK_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SCULK_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SCULK_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SCULK_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SCULK_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SMOOTH_SANDSTONE
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SMOOTH_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CUT_SANDSTONE
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CUT_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CHISELED_SANDSTONE
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CHISELED_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // SMOOTH_RED_SANDSTONE
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock SMOOTH_RED_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CUT_RED_SANDSTONE
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CUT_RED_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // CHISELED_RED_SANDSTONE
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CustomRotatedPillarBlock CHISELED_RED_SANDSTONE_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHISELED_RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // DIAMOND_BLOCK
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[3], RESISTANCE[2]), 0);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[3], RESISTANCE[2]), 1);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[4], RESISTANCE[3]), 2);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[4], RESISTANCE[3]), 3);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[5], RESISTANCE[4]), 4);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[5], RESISTANCE[4]), 5);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[6], RESISTANCE[5]), 6);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[6], RESISTANCE[5]), 7);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[7], RESISTANCE[6]), 8);
    public static final CustomRotatedPillarBlock DIAMOND_BLOCK_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(HARDNESS[7], RESISTANCE[6]), 9);
    // NETHERITE_BLOCK
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_0 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[5], RESISTANCE[5]), 0);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_1 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[5], RESISTANCE[5]), 1);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_2 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[6], RESISTANCE[6]), 2);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_3 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[6], RESISTANCE[6]), 3);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_4 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[7], RESISTANCE[7]), 4);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_5 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[7], RESISTANCE[7]), 5);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_6 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[8], RESISTANCE[8]), 6);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_7 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[8], RESISTANCE[8]), 7);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_8 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[9], RESISTANCE[9]), 8);
    public static final CustomRotatedPillarBlock NETHERITE_BLOCK_9 = new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).strength(HARDNESS[9], RESISTANCE[9]), 9);
}
