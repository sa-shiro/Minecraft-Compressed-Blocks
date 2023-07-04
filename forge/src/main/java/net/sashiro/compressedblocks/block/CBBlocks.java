package net.sashiro.compressedblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.sashiro.compressedblocks.Constants.*;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;

@SuppressWarnings({"unused", "CanBeFinal"})
@Mod.EventBusSubscriber(modid = MOD_ID)
public class CBBlocks {
    
    // Dirt
    public static final RegistryObject<Block> DIRT_0 = BLOCKS.register("c0_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_0);
    public static final RegistryObject<Block> DIRT_1 = BLOCKS.register("c1_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_1);
    public static final RegistryObject<Block> DIRT_2 = BLOCKS.register("c2_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_2);
    public static final RegistryObject<Block> DIRT_3 = BLOCKS.register("c3_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_3);
    public static final RegistryObject<Block> DIRT_4 = BLOCKS.register("c4_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_4);
    public static final RegistryObject<Block> DIRT_5 = BLOCKS.register("c5_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_5);
    public static final RegistryObject<Block> DIRT_6 = BLOCKS.register("c6_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_6);
    public static final RegistryObject<Block> DIRT_7 = BLOCKS.register("c7_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_7);
    public static final RegistryObject<Block> DIRT_8 = BLOCKS.register("c8_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_8);
    public static final RegistryObject<Block> DIRT_9 = BLOCKS.register("c9_" + "DIRT".toLowerCase(), () -> BlockList.DIRT_9);
    // Gravel
    public static final RegistryObject<Block> GRAVEL_0 = BLOCKS.register("c0_gravel", () -> BlockList.GRAVEL_0);
    public static final RegistryObject<Block> GRAVEL_1 = BLOCKS.register("c1_gravel", () -> BlockList.GRAVEL_1);
    public static final RegistryObject<Block> GRAVEL_2 = BLOCKS.register("c2_gravel", () -> BlockList.GRAVEL_2);
    public static final RegistryObject<Block> GRAVEL_3 = BLOCKS.register("c3_gravel", () -> BlockList.GRAVEL_3);
    public static final RegistryObject<Block> GRAVEL_4 = BLOCKS.register("c4_gravel", () -> BlockList.GRAVEL_4);
    public static final RegistryObject<Block> GRAVEL_5 = BLOCKS.register("c5_gravel", () -> BlockList.GRAVEL_5);
    public static final RegistryObject<Block> GRAVEL_6 = BLOCKS.register("c6_gravel", () -> BlockList.GRAVEL_6);
    public static final RegistryObject<Block> GRAVEL_7 = BLOCKS.register("c7_gravel", () -> BlockList.GRAVEL_7);
    public static final RegistryObject<Block> GRAVEL_8 = BLOCKS.register("c8_gravel", () -> BlockList.GRAVEL_8);
    public static final RegistryObject<Block> GRAVEL_9 = BLOCKS.register("c9_gravel", () -> BlockList.GRAVEL_9);
    // Cobblestone
    public static final RegistryObject<Block> COBBLESTONE_0 = BLOCKS.register("c0_cobblestone", () -> BlockList.COBBLESTONE_0);
    public static final RegistryObject<Block> COBBLESTONE_1 = BLOCKS.register("c1_cobblestone", () -> BlockList.COBBLESTONE_1);
    public static final RegistryObject<Block> COBBLESTONE_2 = BLOCKS.register("c2_cobblestone", () -> BlockList.COBBLESTONE_2);
    public static final RegistryObject<Block> COBBLESTONE_3 = BLOCKS.register("c3_cobblestone", () -> BlockList.COBBLESTONE_3);
    public static final RegistryObject<Block> COBBLESTONE_4 = BLOCKS.register("c4_cobblestone", () -> BlockList.COBBLESTONE_4);
    public static final RegistryObject<Block> COBBLESTONE_5 = BLOCKS.register("c5_cobblestone", () -> BlockList.COBBLESTONE_5);
    public static final RegistryObject<Block> COBBLESTONE_6 = BLOCKS.register("c6_cobblestone", () -> BlockList.COBBLESTONE_6);
    public static final RegistryObject<Block> COBBLESTONE_7 = BLOCKS.register("c7_cobblestone", () -> BlockList.COBBLESTONE_7);
    public static final RegistryObject<Block> COBBLESTONE_8 = BLOCKS.register("c8_cobblestone", () -> BlockList.COBBLESTONE_8);
    public static final RegistryObject<Block> COBBLESTONE_9 = BLOCKS.register("c9_cobblestone", () -> BlockList.COBBLESTONE_9);
    // Stone
    public static final RegistryObject<Block> STONE_0 = BLOCKS.register("c0_stone", () -> BlockList.STONE_0);
    public static final RegistryObject<Block> STONE_1 = BLOCKS.register("c1_stone", () -> BlockList.STONE_1);
    public static final RegistryObject<Block> STONE_2 = BLOCKS.register("c2_stone", () -> BlockList.STONE_2);
    public static final RegistryObject<Block> STONE_3 = BLOCKS.register("c3_stone", () -> BlockList.STONE_3);
    public static final RegistryObject<Block> STONE_4 = BLOCKS.register("c4_stone", () -> BlockList.STONE_4);
    public static final RegistryObject<Block> STONE_5 = BLOCKS.register("c5_stone", () -> BlockList.STONE_5);
    public static final RegistryObject<Block> STONE_6 = BLOCKS.register("c6_stone", () -> BlockList.STONE_6);
    public static final RegistryObject<Block> STONE_7 = BLOCKS.register("c7_stone", () -> BlockList.STONE_7);
    public static final RegistryObject<Block> STONE_8 = BLOCKS.register("c8_stone", () -> BlockList.STONE_8);
    public static final RegistryObject<Block> STONE_9 = BLOCKS.register("c9_stone", () -> BlockList.STONE_9);
    // Granite
    public static final RegistryObject<Block> GRANITE_0 = BLOCKS.register("c0_granite", () -> BlockList.GRANITE_0);
    public static final RegistryObject<Block> GRANITE_1 = BLOCKS.register("c1_granite", () -> BlockList.GRANITE_1);
    public static final RegistryObject<Block> GRANITE_2 = BLOCKS.register("c2_granite", () -> BlockList.GRANITE_2);
    public static final RegistryObject<Block> GRANITE_3 = BLOCKS.register("c3_granite", () -> BlockList.GRANITE_3);
    public static final RegistryObject<Block> GRANITE_4 = BLOCKS.register("c4_granite", () -> BlockList.GRANITE_4);
    public static final RegistryObject<Block> GRANITE_5 = BLOCKS.register("c5_granite", () -> BlockList.GRANITE_5);
    public static final RegistryObject<Block> GRANITE_6 = BLOCKS.register("c6_granite", () -> BlockList.GRANITE_6);
    public static final RegistryObject<Block> GRANITE_7 = BLOCKS.register("c7_granite", () -> BlockList.GRANITE_7);
    public static final RegistryObject<Block> GRANITE_8 = BLOCKS.register("c8_granite", () -> BlockList.GRANITE_8);
    public static final RegistryObject<Block> GRANITE_9 = BLOCKS.register("c9_granite", () -> BlockList.GRANITE_9);
    // Diorite
    public static final RegistryObject<Block> DIORITE_0 = BLOCKS.register("c0_diorite", () -> BlockList.DIORITE_0);
    public static final RegistryObject<Block> DIORITE_1 = BLOCKS.register("c1_diorite", () -> BlockList.DIORITE_1);
    public static final RegistryObject<Block> DIORITE_2 = BLOCKS.register("c2_diorite", () -> BlockList.DIORITE_2);
    public static final RegistryObject<Block> DIORITE_3 = BLOCKS.register("c3_diorite", () -> BlockList.DIORITE_3);
    public static final RegistryObject<Block> DIORITE_4 = BLOCKS.register("c4_diorite", () -> BlockList.DIORITE_4);
    public static final RegistryObject<Block> DIORITE_5 = BLOCKS.register("c5_diorite", () -> BlockList.DIORITE_5);
    public static final RegistryObject<Block> DIORITE_6 = BLOCKS.register("c6_diorite", () -> BlockList.DIORITE_6);
    public static final RegistryObject<Block> DIORITE_7 = BLOCKS.register("c7_diorite", () -> BlockList.DIORITE_7);
    public static final RegistryObject<Block> DIORITE_8 = BLOCKS.register("c8_diorite", () -> BlockList.DIORITE_8);
    public static final RegistryObject<Block> DIORITE_9 = BLOCKS.register("c9_diorite", () -> BlockList.DIORITE_9);
    // Andesite
    public static final RegistryObject<Block> ANDESITE_0 = BLOCKS.register("c0_andesite", () -> BlockList.ANDESITE_0);
    public static final RegistryObject<Block> ANDESITE_1 = BLOCKS.register("c1_andesite", () -> BlockList.ANDESITE_1);
    public static final RegistryObject<Block> ANDESITE_2 = BLOCKS.register("c2_andesite", () -> BlockList.ANDESITE_2);
    public static final RegistryObject<Block> ANDESITE_3 = BLOCKS.register("c3_andesite", () -> BlockList.ANDESITE_3);
    public static final RegistryObject<Block> ANDESITE_4 = BLOCKS.register("c4_andesite", () -> BlockList.ANDESITE_4);
    public static final RegistryObject<Block> ANDESITE_5 = BLOCKS.register("c5_andesite", () -> BlockList.ANDESITE_5);
    public static final RegistryObject<Block> ANDESITE_6 = BLOCKS.register("c6_andesite", () -> BlockList.ANDESITE_6);
    public static final RegistryObject<Block> ANDESITE_7 = BLOCKS.register("c7_andesite", () -> BlockList.ANDESITE_7);
    public static final RegistryObject<Block> ANDESITE_8 = BLOCKS.register("c8_andesite", () -> BlockList.ANDESITE_8);
    public static final RegistryObject<Block> ANDESITE_9 = BLOCKS.register("c9_andesite", () -> BlockList.ANDESITE_9);
    // Crimson Nylium
    public static final RegistryObject<Block> CRIMSON_NYLIUM_0 = BLOCKS.register("c0_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_0);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_1 = BLOCKS.register("c1_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_1);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_2 = BLOCKS.register("c2_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_2);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_3 = BLOCKS.register("c3_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_3);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_4 = BLOCKS.register("c4_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_4);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_5 = BLOCKS.register("c5_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_5);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_6 = BLOCKS.register("c6_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_6);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_7 = BLOCKS.register("c7_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_7);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_8 = BLOCKS.register("c8_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_8);
    public static final RegistryObject<Block> CRIMSON_NYLIUM_9 = BLOCKS.register("c9_crimson_nylium", () -> BlockList.CRIMSON_NYLIUM_9);
    // Warped Nylium
    public static final RegistryObject<Block> WARPED_NYLIUM_0 = BLOCKS.register("c0_warped_nylium", () -> BlockList.WARPED_NYLIUM_0);
    public static final RegistryObject<Block> WARPED_NYLIUM_1 = BLOCKS.register("c1_warped_nylium", () -> BlockList.WARPED_NYLIUM_1);
    public static final RegistryObject<Block> WARPED_NYLIUM_2 = BLOCKS.register("c2_warped_nylium", () -> BlockList.WARPED_NYLIUM_2);
    public static final RegistryObject<Block> WARPED_NYLIUM_3 = BLOCKS.register("c3_warped_nylium", () -> BlockList.WARPED_NYLIUM_3);
    public static final RegistryObject<Block> WARPED_NYLIUM_4 = BLOCKS.register("c4_warped_nylium", () -> BlockList.WARPED_NYLIUM_4);
    public static final RegistryObject<Block> WARPED_NYLIUM_5 = BLOCKS.register("c5_warped_nylium", () -> BlockList.WARPED_NYLIUM_5);
    public static final RegistryObject<Block> WARPED_NYLIUM_6 = BLOCKS.register("c6_warped_nylium", () -> BlockList.WARPED_NYLIUM_6);
    public static final RegistryObject<Block> WARPED_NYLIUM_7 = BLOCKS.register("c7_warped_nylium", () -> BlockList.WARPED_NYLIUM_7);
    public static final RegistryObject<Block> WARPED_NYLIUM_8 = BLOCKS.register("c8_warped_nylium", () -> BlockList.WARPED_NYLIUM_8);
    public static final RegistryObject<Block> WARPED_NYLIUM_9 = BLOCKS.register("c9_warped_nylium", () -> BlockList.WARPED_NYLIUM_9);
    // Clay
    public static final RegistryObject<Block> CLAY_0 = BLOCKS.register("c0_clay", () -> BlockList.CLAY_0);
    public static final RegistryObject<Block> CLAY_1 = BLOCKS.register("c1_clay", () -> BlockList.CLAY_1);
    public static final RegistryObject<Block> CLAY_2 = BLOCKS.register("c2_clay", () -> BlockList.CLAY_2);
    public static final RegistryObject<Block> CLAY_3 = BLOCKS.register("c3_clay", () -> BlockList.CLAY_3);
    public static final RegistryObject<Block> CLAY_4 = BLOCKS.register("c4_clay", () -> BlockList.CLAY_4);
    public static final RegistryObject<Block> CLAY_5 = BLOCKS.register("c5_clay", () -> BlockList.CLAY_5);
    public static final RegistryObject<Block> CLAY_6 = BLOCKS.register("c6_clay", () -> BlockList.CLAY_6);
    public static final RegistryObject<Block> CLAY_7 = BLOCKS.register("c7_clay", () -> BlockList.CLAY_7);
    public static final RegistryObject<Block> CLAY_8 = BLOCKS.register("c8_clay", () -> BlockList.CLAY_8);
    public static final RegistryObject<Block> CLAY_9 = BLOCKS.register("c9_clay", () -> BlockList.CLAY_9);
    // Sand
    public static final RegistryObject<Block> SAND_0 = BLOCKS.register("c0_sand", () -> BlockList.SAND_0);
    public static final RegistryObject<Block> SAND_1 = BLOCKS.register("c1_sand", () -> BlockList.SAND_1);
    public static final RegistryObject<Block> SAND_2 = BLOCKS.register("c2_sand", () -> BlockList.SAND_2);
    public static final RegistryObject<Block> SAND_3 = BLOCKS.register("c3_sand", () -> BlockList.SAND_3);
    public static final RegistryObject<Block> SAND_4 = BLOCKS.register("c4_sand", () -> BlockList.SAND_4);
    public static final RegistryObject<Block> SAND_5 = BLOCKS.register("c5_sand", () -> BlockList.SAND_5);
    public static final RegistryObject<Block> SAND_6 = BLOCKS.register("c6_sand", () -> BlockList.SAND_6);
    public static final RegistryObject<Block> SAND_7 = BLOCKS.register("c7_sand", () -> BlockList.SAND_7);
    public static final RegistryObject<Block> SAND_8 = BLOCKS.register("c8_sand", () -> BlockList.SAND_8);
    public static final RegistryObject<Block> SAND_9 = BLOCKS.register("c9_sand", () -> BlockList.SAND_9);
    // Red Sand
    public static final RegistryObject<Block> RED_SAND_0 = BLOCKS.register("c0_red_sand", () -> BlockList.RED_SAND_0);
    public static final RegistryObject<Block> RED_SAND_1 = BLOCKS.register("c1_red_sand", () -> BlockList.RED_SAND_1);
    public static final RegistryObject<Block> RED_SAND_2 = BLOCKS.register("c2_red_sand", () -> BlockList.RED_SAND_2);
    public static final RegistryObject<Block> RED_SAND_3 = BLOCKS.register("c3_red_sand", () -> BlockList.RED_SAND_3);
    public static final RegistryObject<Block> RED_SAND_4 = BLOCKS.register("c4_red_sand", () -> BlockList.RED_SAND_4);
    public static final RegistryObject<Block> RED_SAND_5 = BLOCKS.register("c5_red_sand", () -> BlockList.RED_SAND_5);
    public static final RegistryObject<Block> RED_SAND_6 = BLOCKS.register("c6_red_sand", () -> BlockList.RED_SAND_6);
    public static final RegistryObject<Block> RED_SAND_7 = BLOCKS.register("c7_red_sand", () -> BlockList.RED_SAND_7);
    public static final RegistryObject<Block> RED_SAND_8 = BLOCKS.register("c8_red_sand", () -> BlockList.RED_SAND_8);
    public static final RegistryObject<Block> RED_SAND_9 = BLOCKS.register("c9_red_sand", () -> BlockList.RED_SAND_9);
    // Sandstone
    public static final RegistryObject<Block> SANDSTONE_0 = BLOCKS.register("c0_sandstone", () -> BlockList.SANDSTONE_0);
    public static final RegistryObject<Block> SANDSTONE_1 = BLOCKS.register("c1_sandstone", () -> BlockList.SANDSTONE_1);
    public static final RegistryObject<Block> SANDSTONE_2 = BLOCKS.register("c2_sandstone", () -> BlockList.SANDSTONE_2);
    public static final RegistryObject<Block> SANDSTONE_3 = BLOCKS.register("c3_sandstone", () -> BlockList.SANDSTONE_3);
    public static final RegistryObject<Block> SANDSTONE_4 = BLOCKS.register("c4_sandstone", () -> BlockList.SANDSTONE_4);
    public static final RegistryObject<Block> SANDSTONE_5 = BLOCKS.register("c5_sandstone", () -> BlockList.SANDSTONE_5);
    public static final RegistryObject<Block> SANDSTONE_6 = BLOCKS.register("c6_sandstone", () -> BlockList.SANDSTONE_6);
    public static final RegistryObject<Block> SANDSTONE_7 = BLOCKS.register("c7_sandstone", () -> BlockList.SANDSTONE_7);
    public static final RegistryObject<Block> SANDSTONE_8 = BLOCKS.register("c8_sandstone", () -> BlockList.SANDSTONE_8);
    public static final RegistryObject<Block> SANDSTONE_9 = BLOCKS.register("c9_sandstone", () -> BlockList.SANDSTONE_9);
    // Red Sandstone
    public static final RegistryObject<Block> RED_SANDSTONE_0 = BLOCKS.register("c0_red_sandstone", () -> BlockList.RED_SANDSTONE_0);
    public static final RegistryObject<Block> RED_SANDSTONE_1 = BLOCKS.register("c1_red_sandstone", () -> BlockList.RED_SANDSTONE_1);
    public static final RegistryObject<Block> RED_SANDSTONE_2 = BLOCKS.register("c2_red_sandstone", () -> BlockList.RED_SANDSTONE_2);
    public static final RegistryObject<Block> RED_SANDSTONE_3 = BLOCKS.register("c3_red_sandstone", () -> BlockList.RED_SANDSTONE_3);
    public static final RegistryObject<Block> RED_SANDSTONE_4 = BLOCKS.register("c4_red_sandstone", () -> BlockList.RED_SANDSTONE_4);
    public static final RegistryObject<Block> RED_SANDSTONE_5 = BLOCKS.register("c5_red_sandstone", () -> BlockList.RED_SANDSTONE_5);
    public static final RegistryObject<Block> RED_SANDSTONE_6 = BLOCKS.register("c6_red_sandstone", () -> BlockList.RED_SANDSTONE_6);
    public static final RegistryObject<Block> RED_SANDSTONE_7 = BLOCKS.register("c7_red_sandstone", () -> BlockList.RED_SANDSTONE_7);
    public static final RegistryObject<Block> RED_SANDSTONE_8 = BLOCKS.register("c8_red_sandstone", () -> BlockList.RED_SANDSTONE_8);
    public static final RegistryObject<Block> RED_SANDSTONE_9 = BLOCKS.register("c9_red_sandstone", () -> BlockList.RED_SANDSTONE_9);
    // Coal Ore
    public static final RegistryObject<Block> COAL_ORE_0 = BLOCKS.register("c0_coal_ore", () -> BlockList.COAL_ORE_0);
    public static final RegistryObject<Block> COAL_ORE_1 = BLOCKS.register("c1_coal_ore", () -> BlockList.COAL_ORE_1);
    public static final RegistryObject<Block> COAL_ORE_2 = BLOCKS.register("c2_coal_ore", () -> BlockList.COAL_ORE_2);
    public static final RegistryObject<Block> COAL_ORE_3 = BLOCKS.register("c3_coal_ore", () -> BlockList.COAL_ORE_3);
    public static final RegistryObject<Block> COAL_ORE_4 = BLOCKS.register("c4_coal_ore", () -> BlockList.COAL_ORE_4);
    public static final RegistryObject<Block> COAL_ORE_5 = BLOCKS.register("c5_coal_ore", () -> BlockList.COAL_ORE_5);
    public static final RegistryObject<Block> COAL_ORE_6 = BLOCKS.register("c6_coal_ore", () -> BlockList.COAL_ORE_6);
    public static final RegistryObject<Block> COAL_ORE_7 = BLOCKS.register("c7_coal_ore", () -> BlockList.COAL_ORE_7);
    public static final RegistryObject<Block> COAL_ORE_8 = BLOCKS.register("c8_coal_ore", () -> BlockList.COAL_ORE_8);
    public static final RegistryObject<Block> COAL_ORE_9 = BLOCKS.register("c9_coal_ore", () -> BlockList.COAL_ORE_9);
    // Iron Ore
    public static final RegistryObject<Block> IRON_ORE_0 = BLOCKS.register("c0_iron_ore", () -> BlockList.IRON_ORE_0);
    public static final RegistryObject<Block> IRON_ORE_1 = BLOCKS.register("c1_iron_ore", () -> BlockList.IRON_ORE_1);
    public static final RegistryObject<Block> IRON_ORE_2 = BLOCKS.register("c2_iron_ore", () -> BlockList.IRON_ORE_2);
    public static final RegistryObject<Block> IRON_ORE_3 = BLOCKS.register("c3_iron_ore", () -> BlockList.IRON_ORE_3);
    public static final RegistryObject<Block> IRON_ORE_4 = BLOCKS.register("c4_iron_ore", () -> BlockList.IRON_ORE_4);
    public static final RegistryObject<Block> IRON_ORE_5 = BLOCKS.register("c5_iron_ore", () -> BlockList.IRON_ORE_5);
    public static final RegistryObject<Block> IRON_ORE_6 = BLOCKS.register("c6_iron_ore", () -> BlockList.IRON_ORE_6);
    public static final RegistryObject<Block> IRON_ORE_7 = BLOCKS.register("c7_iron_ore", () -> BlockList.IRON_ORE_7);
    public static final RegistryObject<Block> IRON_ORE_8 = BLOCKS.register("c8_iron_ore", () -> BlockList.IRON_ORE_8);
    public static final RegistryObject<Block> IRON_ORE_9 = BLOCKS.register("c9_iron_ore", () -> BlockList.IRON_ORE_9);
    // Gold Ore
    public static final RegistryObject<Block> GOLD_ORE_0 = BLOCKS.register("c0_gold_ore", () -> BlockList.GOLD_ORE_0);
    public static final RegistryObject<Block> GOLD_ORE_1 = BLOCKS.register("c1_gold_ore", () -> BlockList.GOLD_ORE_1);
    public static final RegistryObject<Block> GOLD_ORE_2 = BLOCKS.register("c2_gold_ore", () -> BlockList.GOLD_ORE_2);
    public static final RegistryObject<Block> GOLD_ORE_3 = BLOCKS.register("c3_gold_ore", () -> BlockList.GOLD_ORE_3);
    public static final RegistryObject<Block> GOLD_ORE_4 = BLOCKS.register("c4_gold_ore", () -> BlockList.GOLD_ORE_4);
    public static final RegistryObject<Block> GOLD_ORE_5 = BLOCKS.register("c5_gold_ore", () -> BlockList.GOLD_ORE_5);
    public static final RegistryObject<Block> GOLD_ORE_6 = BLOCKS.register("c6_gold_ore", () -> BlockList.GOLD_ORE_6);
    public static final RegistryObject<Block> GOLD_ORE_7 = BLOCKS.register("c7_gold_ore", () -> BlockList.GOLD_ORE_7);
    public static final RegistryObject<Block> GOLD_ORE_8 = BLOCKS.register("c8_gold_ore", () -> BlockList.GOLD_ORE_8);
    public static final RegistryObject<Block> GOLD_ORE_9 = BLOCKS.register("c9_gold_ore", () -> BlockList.GOLD_ORE_9);
    // Nether Gold Ore
    public static final RegistryObject<Block> NETHER_GOLD_ORE_0 = BLOCKS.register("c0_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_0);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_1 = BLOCKS.register("c1_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_1);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_2 = BLOCKS.register("c2_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_2);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_3 = BLOCKS.register("c3_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_3);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_4 = BLOCKS.register("c4_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_4);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_5 = BLOCKS.register("c5_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_5);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_6 = BLOCKS.register("c6_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_6);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_7 = BLOCKS.register("c7_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_7);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_8 = BLOCKS.register("c8_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_8);
    public static final RegistryObject<Block> NETHER_GOLD_ORE_9 = BLOCKS.register("c9_nether_gold_ore", () -> BlockList.NETHER_GOLD_ORE_9);
    // Nether Quartz Ore
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_0 = BLOCKS.register("c0_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_0);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_1 = BLOCKS.register("c1_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_1);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_2 = BLOCKS.register("c2_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_2);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_3 = BLOCKS.register("c3_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_3);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_4 = BLOCKS.register("c4_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_4);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_5 = BLOCKS.register("c5_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_5);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_6 = BLOCKS.register("c6_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_6);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_7 = BLOCKS.register("c7_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_7);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_8 = BLOCKS.register("c8_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_8);
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_9 = BLOCKS.register("c9_nether_quartz_ore", () -> BlockList.NETHER_QUARTZ_ORE_9);
    // Lapis Ore
    public static final RegistryObject<Block> LAPIS_ORE_0 = BLOCKS.register("c0_lapis_ore", () -> BlockList.LAPIS_ORE_0);
    public static final RegistryObject<Block> LAPIS_ORE_1 = BLOCKS.register("c1_lapis_ore", () -> BlockList.LAPIS_ORE_1);
    public static final RegistryObject<Block> LAPIS_ORE_2 = BLOCKS.register("c2_lapis_ore", () -> BlockList.LAPIS_ORE_2);
    public static final RegistryObject<Block> LAPIS_ORE_3 = BLOCKS.register("c3_lapis_ore", () -> BlockList.LAPIS_ORE_3);
    public static final RegistryObject<Block> LAPIS_ORE_4 = BLOCKS.register("c4_lapis_ore", () -> BlockList.LAPIS_ORE_4);
    public static final RegistryObject<Block> LAPIS_ORE_5 = BLOCKS.register("c5_lapis_ore", () -> BlockList.LAPIS_ORE_5);
    public static final RegistryObject<Block> LAPIS_ORE_6 = BLOCKS.register("c6_lapis_ore", () -> BlockList.LAPIS_ORE_6);
    public static final RegistryObject<Block> LAPIS_ORE_7 = BLOCKS.register("c7_lapis_ore", () -> BlockList.LAPIS_ORE_7);
    public static final RegistryObject<Block> LAPIS_ORE_8 = BLOCKS.register("c8_lapis_ore", () -> BlockList.LAPIS_ORE_8);
    public static final RegistryObject<Block> LAPIS_ORE_9 = BLOCKS.register("c9_lapis_ore", () -> BlockList.LAPIS_ORE_9);
    // Redstone Ore
    public static final RegistryObject<Block> REDSTONE_ORE_0 = BLOCKS.register("c0_redstone_ore", () -> BlockList.REDSTONE_ORE_0);
    public static final RegistryObject<Block> REDSTONE_ORE_1 = BLOCKS.register("c1_redstone_ore", () -> BlockList.REDSTONE_ORE_1);
    public static final RegistryObject<Block> REDSTONE_ORE_2 = BLOCKS.register("c2_redstone_ore", () -> BlockList.REDSTONE_ORE_2);
    public static final RegistryObject<Block> REDSTONE_ORE_3 = BLOCKS.register("c3_redstone_ore", () -> BlockList.REDSTONE_ORE_3);
    public static final RegistryObject<Block> REDSTONE_ORE_4 = BLOCKS.register("c4_redstone_ore", () -> BlockList.REDSTONE_ORE_4);
    public static final RegistryObject<Block> REDSTONE_ORE_5 = BLOCKS.register("c5_redstone_ore", () -> BlockList.REDSTONE_ORE_5);
    public static final RegistryObject<Block> REDSTONE_ORE_6 = BLOCKS.register("c6_redstone_ore", () -> BlockList.REDSTONE_ORE_6);
    public static final RegistryObject<Block> REDSTONE_ORE_7 = BLOCKS.register("c7_redstone_ore", () -> BlockList.REDSTONE_ORE_7);
    public static final RegistryObject<Block> REDSTONE_ORE_8 = BLOCKS.register("c8_redstone_ore", () -> BlockList.REDSTONE_ORE_8);
    public static final RegistryObject<Block> REDSTONE_ORE_9 = BLOCKS.register("c9_redstone_ore", () -> BlockList.REDSTONE_ORE_9);
    // Iron Block
    public static final RegistryObject<Block> IRON_BLOCK_0 = BLOCKS.register("c0_iron_block", () -> BlockList.IRON_BLOCK_0);
    public static final RegistryObject<Block> IRON_BLOCK_1 = BLOCKS.register("c1_iron_block", () -> BlockList.IRON_BLOCK_1);
    public static final RegistryObject<Block> IRON_BLOCK_2 = BLOCKS.register("c2_iron_block", () -> BlockList.IRON_BLOCK_2);
    public static final RegistryObject<Block> IRON_BLOCK_3 = BLOCKS.register("c3_iron_block", () -> BlockList.IRON_BLOCK_3);
    public static final RegistryObject<Block> IRON_BLOCK_4 = BLOCKS.register("c4_iron_block", () -> BlockList.IRON_BLOCK_4);
    public static final RegistryObject<Block> IRON_BLOCK_5 = BLOCKS.register("c5_iron_block", () -> BlockList.IRON_BLOCK_5);
    public static final RegistryObject<Block> IRON_BLOCK_6 = BLOCKS.register("c6_iron_block", () -> BlockList.IRON_BLOCK_6);
    public static final RegistryObject<Block> IRON_BLOCK_7 = BLOCKS.register("c7_iron_block", () -> BlockList.IRON_BLOCK_7);
    public static final RegistryObject<Block> IRON_BLOCK_8 = BLOCKS.register("c8_iron_block", () -> BlockList.IRON_BLOCK_8);
    public static final RegistryObject<Block> IRON_BLOCK_9 = BLOCKS.register("c9_iron_block", () -> BlockList.IRON_BLOCK_9);
    // Gold Block
    public static final RegistryObject<Block> GOLD_BLOCK_0 = BLOCKS.register("c0_gold_block", () -> BlockList.GOLD_BLOCK_0);
    public static final RegistryObject<Block> GOLD_BLOCK_1 = BLOCKS.register("c1_gold_block", () -> BlockList.GOLD_BLOCK_1);
    public static final RegistryObject<Block> GOLD_BLOCK_2 = BLOCKS.register("c2_gold_block", () -> BlockList.GOLD_BLOCK_2);
    public static final RegistryObject<Block> GOLD_BLOCK_3 = BLOCKS.register("c3_gold_block", () -> BlockList.GOLD_BLOCK_3);
    public static final RegistryObject<Block> GOLD_BLOCK_4 = BLOCKS.register("c4_gold_block", () -> BlockList.GOLD_BLOCK_4);
    public static final RegistryObject<Block> GOLD_BLOCK_5 = BLOCKS.register("c5_gold_block", () -> BlockList.GOLD_BLOCK_5);
    public static final RegistryObject<Block> GOLD_BLOCK_6 = BLOCKS.register("c6_gold_block", () -> BlockList.GOLD_BLOCK_6);
    public static final RegistryObject<Block> GOLD_BLOCK_7 = BLOCKS.register("c7_gold_block", () -> BlockList.GOLD_BLOCK_7);
    public static final RegistryObject<Block> GOLD_BLOCK_8 = BLOCKS.register("c8_gold_block", () -> BlockList.GOLD_BLOCK_8);
    public static final RegistryObject<Block> GOLD_BLOCK_9 = BLOCKS.register("c9_gold_block", () -> BlockList.GOLD_BLOCK_9);
    // Lapis Block
    public static final RegistryObject<Block> LAPIS_BLOCK_0 = BLOCKS.register("c0_lapis_block", () -> BlockList.LAPIS_BLOCK_0);
    public static final RegistryObject<Block> LAPIS_BLOCK_1 = BLOCKS.register("c1_lapis_block", () -> BlockList.LAPIS_BLOCK_1);
    public static final RegistryObject<Block> LAPIS_BLOCK_2 = BLOCKS.register("c2_lapis_block", () -> BlockList.LAPIS_BLOCK_2);
    public static final RegistryObject<Block> LAPIS_BLOCK_3 = BLOCKS.register("c3_lapis_block", () -> BlockList.LAPIS_BLOCK_3);
    public static final RegistryObject<Block> LAPIS_BLOCK_4 = BLOCKS.register("c4_lapis_block", () -> BlockList.LAPIS_BLOCK_4);
    public static final RegistryObject<Block> LAPIS_BLOCK_5 = BLOCKS.register("c5_lapis_block", () -> BlockList.LAPIS_BLOCK_5);
    public static final RegistryObject<Block> LAPIS_BLOCK_6 = BLOCKS.register("c6_lapis_block", () -> BlockList.LAPIS_BLOCK_6);
    public static final RegistryObject<Block> LAPIS_BLOCK_7 = BLOCKS.register("c7_lapis_block", () -> BlockList.LAPIS_BLOCK_7);
    public static final RegistryObject<Block> LAPIS_BLOCK_8 = BLOCKS.register("c8_lapis_block", () -> BlockList.LAPIS_BLOCK_8);
    public static final RegistryObject<Block> LAPIS_BLOCK_9 = BLOCKS.register("c9_lapis_block", () -> BlockList.LAPIS_BLOCK_9);
    // Redstone Block
    public static final RegistryObject<Block> REDSTONE_BLOCK_0 = BLOCKS.register("c0_redstone_block", () -> BlockList.REDSTONE_BLOCK_0);
    public static final RegistryObject<Block> REDSTONE_BLOCK_1 = BLOCKS.register("c1_redstone_block", () -> BlockList.REDSTONE_BLOCK_1);
    public static final RegistryObject<Block> REDSTONE_BLOCK_2 = BLOCKS.register("c2_redstone_block", () -> BlockList.REDSTONE_BLOCK_2);
    public static final RegistryObject<Block> REDSTONE_BLOCK_3 = BLOCKS.register("c3_redstone_block", () -> BlockList.REDSTONE_BLOCK_3);
    public static final RegistryObject<Block> REDSTONE_BLOCK_4 = BLOCKS.register("c4_redstone_block", () -> BlockList.REDSTONE_BLOCK_4);
    public static final RegistryObject<Block> REDSTONE_BLOCK_5 = BLOCKS.register("c5_redstone_block", () -> BlockList.REDSTONE_BLOCK_5);
    public static final RegistryObject<Block> REDSTONE_BLOCK_6 = BLOCKS.register("c6_redstone_block", () -> BlockList.REDSTONE_BLOCK_6);
    public static final RegistryObject<Block> REDSTONE_BLOCK_7 = BLOCKS.register("c7_redstone_block", () -> BlockList.REDSTONE_BLOCK_7);
    public static final RegistryObject<Block> REDSTONE_BLOCK_8 = BLOCKS.register("c8_redstone_block", () -> BlockList.REDSTONE_BLOCK_8);
    public static final RegistryObject<Block> REDSTONE_BLOCK_9 = BLOCKS.register("c9_redstone_block", () -> BlockList.REDSTONE_BLOCK_9);
    // Coal Block
    public static final RegistryObject<Block> COAL_BLOCK_0 = BLOCKS.register("c0_coal_block", () -> BlockList.COAL_BLOCK_0);
    public static final RegistryObject<Block> COAL_BLOCK_1 = BLOCKS.register("c1_coal_block", () -> BlockList.COAL_BLOCK_1);
    public static final RegistryObject<Block> COAL_BLOCK_2 = BLOCKS.register("c2_coal_block", () -> BlockList.COAL_BLOCK_2);
    public static final RegistryObject<Block> COAL_BLOCK_3 = BLOCKS.register("c3_coal_block", () -> BlockList.COAL_BLOCK_3);
    public static final RegistryObject<Block> COAL_BLOCK_4 = BLOCKS.register("c4_coal_block", () -> BlockList.COAL_BLOCK_4);
    public static final RegistryObject<Block> COAL_BLOCK_5 = BLOCKS.register("c5_coal_block", () -> BlockList.COAL_BLOCK_5);
    public static final RegistryObject<Block> COAL_BLOCK_6 = BLOCKS.register("c6_coal_block", () -> BlockList.COAL_BLOCK_6);
    public static final RegistryObject<Block> COAL_BLOCK_7 = BLOCKS.register("c7_coal_block", () -> BlockList.COAL_BLOCK_7);
    public static final RegistryObject<Block> COAL_BLOCK_8 = BLOCKS.register("c8_coal_block", () -> BlockList.COAL_BLOCK_8);
    public static final RegistryObject<Block> COAL_BLOCK_9 = BLOCKS.register("c9_coal_block", () -> BlockList.COAL_BLOCK_9);
    // Slime Block
    public static final RegistryObject<Block> SLIME_BLOCK_0 = BLOCKS.register("c0_slime_block", () -> BlockList.SLIME_BLOCK_0);
    public static final RegistryObject<Block> SLIME_BLOCK_1 = BLOCKS.register("c1_slime_block", () -> BlockList.SLIME_BLOCK_1);
    public static final RegistryObject<Block> SLIME_BLOCK_2 = BLOCKS.register("c2_slime_block", () -> BlockList.SLIME_BLOCK_2);
    public static final RegistryObject<Block> SLIME_BLOCK_3 = BLOCKS.register("c3_slime_block", () -> BlockList.SLIME_BLOCK_3);
    public static final RegistryObject<Block> SLIME_BLOCK_4 = BLOCKS.register("c4_slime_block", () -> BlockList.SLIME_BLOCK_4);
    public static final RegistryObject<Block> SLIME_BLOCK_5 = BLOCKS.register("c5_slime_block", () -> BlockList.SLIME_BLOCK_5);
    public static final RegistryObject<Block> SLIME_BLOCK_6 = BLOCKS.register("c6_slime_block", () -> BlockList.SLIME_BLOCK_6);
    public static final RegistryObject<Block> SLIME_BLOCK_7 = BLOCKS.register("c7_slime_block", () -> BlockList.SLIME_BLOCK_7);
    public static final RegistryObject<Block> SLIME_BLOCK_8 = BLOCKS.register("c8_slime_block", () -> BlockList.SLIME_BLOCK_8);
    public static final RegistryObject<Block> SLIME_BLOCK_9 = BLOCKS.register("c9_slime_block", () -> BlockList.SLIME_BLOCK_9);
    // Honey Block
    public static final RegistryObject<Block> HONEY_BLOCK_0 = BLOCKS.register("c0_honey_block", () -> BlockList.HONEY_BLOCK_0);
    public static final RegistryObject<Block> HONEY_BLOCK_1 = BLOCKS.register("c1_honey_block", () -> BlockList.HONEY_BLOCK_1);
    public static final RegistryObject<Block> HONEY_BLOCK_2 = BLOCKS.register("c2_honey_block", () -> BlockList.HONEY_BLOCK_2);
    public static final RegistryObject<Block> HONEY_BLOCK_3 = BLOCKS.register("c3_honey_block", () -> BlockList.HONEY_BLOCK_3);
    public static final RegistryObject<Block> HONEY_BLOCK_4 = BLOCKS.register("c4_honey_block", () -> BlockList.HONEY_BLOCK_4);
    public static final RegistryObject<Block> HONEY_BLOCK_5 = BLOCKS.register("c5_honey_block", () -> BlockList.HONEY_BLOCK_5);
    public static final RegistryObject<Block> HONEY_BLOCK_6 = BLOCKS.register("c6_honey_block", () -> BlockList.HONEY_BLOCK_6);
    public static final RegistryObject<Block> HONEY_BLOCK_7 = BLOCKS.register("c7_honey_block", () -> BlockList.HONEY_BLOCK_7);
    public static final RegistryObject<Block> HONEY_BLOCK_8 = BLOCKS.register("c8_honey_block", () -> BlockList.HONEY_BLOCK_8);
    public static final RegistryObject<Block> HONEY_BLOCK_9 = BLOCKS.register("c9_honey_block", () -> BlockList.HONEY_BLOCK_9);
    // Bricks
    public static final RegistryObject<Block> BRICKS_0 = BLOCKS.register("c0_bricks", () -> BlockList.BRICKS_0);
    public static final RegistryObject<Block> BRICKS_1 = BLOCKS.register("c1_bricks", () -> BlockList.BRICKS_1);
    public static final RegistryObject<Block> BRICKS_2 = BLOCKS.register("c2_bricks", () -> BlockList.BRICKS_2);
    public static final RegistryObject<Block> BRICKS_3 = BLOCKS.register("c3_bricks", () -> BlockList.BRICKS_3);
    public static final RegistryObject<Block> BRICKS_4 = BLOCKS.register("c4_bricks", () -> BlockList.BRICKS_4);
    public static final RegistryObject<Block> BRICKS_5 = BLOCKS.register("c5_bricks", () -> BlockList.BRICKS_5);
    public static final RegistryObject<Block> BRICKS_6 = BLOCKS.register("c6_bricks", () -> BlockList.BRICKS_6);
    public static final RegistryObject<Block> BRICKS_7 = BLOCKS.register("c7_bricks", () -> BlockList.BRICKS_7);
    public static final RegistryObject<Block> BRICKS_8 = BLOCKS.register("c8_bricks", () -> BlockList.BRICKS_8);
    public static final RegistryObject<Block> BRICKS_9 = BLOCKS.register("c9_bricks", () -> BlockList.BRICKS_9);
    // Stone Bricks
    public static final RegistryObject<Block> STONE_BRICKS_0 = BLOCKS.register("c0_stone_bricks", () -> BlockList.STONE_BRICKS_0);
    public static final RegistryObject<Block> STONE_BRICKS_1 = BLOCKS.register("c1_stone_bricks", () -> BlockList.STONE_BRICKS_1);
    public static final RegistryObject<Block> STONE_BRICKS_2 = BLOCKS.register("c2_stone_bricks", () -> BlockList.STONE_BRICKS_2);
    public static final RegistryObject<Block> STONE_BRICKS_3 = BLOCKS.register("c3_stone_bricks", () -> BlockList.STONE_BRICKS_3);
    public static final RegistryObject<Block> STONE_BRICKS_4 = BLOCKS.register("c4_stone_bricks", () -> BlockList.STONE_BRICKS_4);
    public static final RegistryObject<Block> STONE_BRICKS_5 = BLOCKS.register("c5_stone_bricks", () -> BlockList.STONE_BRICKS_5);
    public static final RegistryObject<Block> STONE_BRICKS_6 = BLOCKS.register("c6_stone_bricks", () -> BlockList.STONE_BRICKS_6);
    public static final RegistryObject<Block> STONE_BRICKS_7 = BLOCKS.register("c7_stone_bricks", () -> BlockList.STONE_BRICKS_7);
    public static final RegistryObject<Block> STONE_BRICKS_8 = BLOCKS.register("c8_stone_bricks", () -> BlockList.STONE_BRICKS_8);
    public static final RegistryObject<Block> STONE_BRICKS_9 = BLOCKS.register("c9_stone_bricks", () -> BlockList.STONE_BRICKS_9);
    // Netherrack
    public static final RegistryObject<Block> NETHERRACK_0 = BLOCKS.register("c0_netherrack", () -> BlockList.NETHERRACK_0);
    public static final RegistryObject<Block> NETHERRACK_1 = BLOCKS.register("c1_netherrack", () -> BlockList.NETHERRACK_1);
    public static final RegistryObject<Block> NETHERRACK_2 = BLOCKS.register("c2_netherrack", () -> BlockList.NETHERRACK_2);
    public static final RegistryObject<Block> NETHERRACK_3 = BLOCKS.register("c3_netherrack", () -> BlockList.NETHERRACK_3);
    public static final RegistryObject<Block> NETHERRACK_4 = BLOCKS.register("c4_netherrack", () -> BlockList.NETHERRACK_4);
    public static final RegistryObject<Block> NETHERRACK_5 = BLOCKS.register("c5_netherrack", () -> BlockList.NETHERRACK_5);
    public static final RegistryObject<Block> NETHERRACK_6 = BLOCKS.register("c6_netherrack", () -> BlockList.NETHERRACK_6);
    public static final RegistryObject<Block> NETHERRACK_7 = BLOCKS.register("c7_netherrack", () -> BlockList.NETHERRACK_7);
    public static final RegistryObject<Block> NETHERRACK_8 = BLOCKS.register("c8_netherrack", () -> BlockList.NETHERRACK_8);
    public static final RegistryObject<Block> NETHERRACK_9 = BLOCKS.register("c9_netherrack", () -> BlockList.NETHERRACK_9);
    // Nether Bricks
    public static final RegistryObject<Block> NETHER_BRICKS_0 = BLOCKS.register("c0_nether_bricks", () -> BlockList.NETHER_BRICKS_0);
    public static final RegistryObject<Block> NETHER_BRICKS_1 = BLOCKS.register("c1_nether_bricks", () -> BlockList.NETHER_BRICKS_1);
    public static final RegistryObject<Block> NETHER_BRICKS_2 = BLOCKS.register("c2_nether_bricks", () -> BlockList.NETHER_BRICKS_2);
    public static final RegistryObject<Block> NETHER_BRICKS_3 = BLOCKS.register("c3_nether_bricks", () -> BlockList.NETHER_BRICKS_3);
    public static final RegistryObject<Block> NETHER_BRICKS_4 = BLOCKS.register("c4_nether_bricks", () -> BlockList.NETHER_BRICKS_4);
    public static final RegistryObject<Block> NETHER_BRICKS_5 = BLOCKS.register("c5_nether_bricks", () -> BlockList.NETHER_BRICKS_5);
    public static final RegistryObject<Block> NETHER_BRICKS_6 = BLOCKS.register("c6_nether_bricks", () -> BlockList.NETHER_BRICKS_6);
    public static final RegistryObject<Block> NETHER_BRICKS_7 = BLOCKS.register("c7_nether_bricks", () -> BlockList.NETHER_BRICKS_7);
    public static final RegistryObject<Block> NETHER_BRICKS_8 = BLOCKS.register("c8_nether_bricks", () -> BlockList.NETHER_BRICKS_8);
    public static final RegistryObject<Block> NETHER_BRICKS_9 = BLOCKS.register("c9_nether_bricks", () -> BlockList.NETHER_BRICKS_9);
    // Red Nether Bricks
    public static final RegistryObject<Block> RED_NETHER_BRICKS_0 = BLOCKS.register("c0_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_0);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_1 = BLOCKS.register("c1_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_1);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_2 = BLOCKS.register("c2_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_2);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_3 = BLOCKS.register("c3_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_3);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_4 = BLOCKS.register("c4_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_4);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_5 = BLOCKS.register("c5_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_5);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_6 = BLOCKS.register("c6_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_6);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_7 = BLOCKS.register("c7_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_7);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_8 = BLOCKS.register("c8_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_8);
    public static final RegistryObject<Block> RED_NETHER_BRICKS_9 = BLOCKS.register("c9_red_nether_bricks", () -> BlockList.RED_NETHER_BRICKS_9);
    // Nether Wart Block
    public static final RegistryObject<Block> NETHER_WART_BLOCK_0 = BLOCKS.register("c0_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_0);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_1 = BLOCKS.register("c1_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_1);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_2 = BLOCKS.register("c2_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_2);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_3 = BLOCKS.register("c3_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_3);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_4 = BLOCKS.register("c4_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_4);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_5 = BLOCKS.register("c5_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_5);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_6 = BLOCKS.register("c6_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_6);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_7 = BLOCKS.register("c7_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_7);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_8 = BLOCKS.register("c8_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_8);
    public static final RegistryObject<Block> NETHER_WART_BLOCK_9 = BLOCKS.register("c9_nether_wart_block", () -> BlockList.NETHER_WART_BLOCK_9);
    // Soul Sand
    public static final RegistryObject<Block> SOUL_SAND_0 = BLOCKS.register("c0_soul_sand", () -> BlockList.SOUL_SAND_0);
    public static final RegistryObject<Block> SOUL_SAND_1 = BLOCKS.register("c1_soul_sand", () -> BlockList.SOUL_SAND_1);
    public static final RegistryObject<Block> SOUL_SAND_2 = BLOCKS.register("c2_soul_sand", () -> BlockList.SOUL_SAND_2);
    public static final RegistryObject<Block> SOUL_SAND_3 = BLOCKS.register("c3_soul_sand", () -> BlockList.SOUL_SAND_3);
    public static final RegistryObject<Block> SOUL_SAND_4 = BLOCKS.register("c4_soul_sand", () -> BlockList.SOUL_SAND_4);
    public static final RegistryObject<Block> SOUL_SAND_5 = BLOCKS.register("c5_soul_sand", () -> BlockList.SOUL_SAND_5);
    public static final RegistryObject<Block> SOUL_SAND_6 = BLOCKS.register("c6_soul_sand", () -> BlockList.SOUL_SAND_6);
    public static final RegistryObject<Block> SOUL_SAND_7 = BLOCKS.register("c7_soul_sand", () -> BlockList.SOUL_SAND_7);
    public static final RegistryObject<Block> SOUL_SAND_8 = BLOCKS.register("c8_soul_sand", () -> BlockList.SOUL_SAND_8);
    public static final RegistryObject<Block> SOUL_SAND_9 = BLOCKS.register("c9_soul_sand", () -> BlockList.SOUL_SAND_9);
    // Soul Soil
    public static final RegistryObject<Block> SOUL_SOIL_0 = BLOCKS.register("c0_soul_soil", () -> BlockList.SOUL_SOIL_0);
    public static final RegistryObject<Block> SOUL_SOIL_1 = BLOCKS.register("c1_soul_soil", () -> BlockList.SOUL_SOIL_1);
    public static final RegistryObject<Block> SOUL_SOIL_2 = BLOCKS.register("c2_soul_soil", () -> BlockList.SOUL_SOIL_2);
    public static final RegistryObject<Block> SOUL_SOIL_3 = BLOCKS.register("c3_soul_soil", () -> BlockList.SOUL_SOIL_3);
    public static final RegistryObject<Block> SOUL_SOIL_4 = BLOCKS.register("c4_soul_soil", () -> BlockList.SOUL_SOIL_4);
    public static final RegistryObject<Block> SOUL_SOIL_5 = BLOCKS.register("c5_soul_soil", () -> BlockList.SOUL_SOIL_5);
    public static final RegistryObject<Block> SOUL_SOIL_6 = BLOCKS.register("c6_soul_soil", () -> BlockList.SOUL_SOIL_6);
    public static final RegistryObject<Block> SOUL_SOIL_7 = BLOCKS.register("c7_soul_soil", () -> BlockList.SOUL_SOIL_7);
    public static final RegistryObject<Block> SOUL_SOIL_8 = BLOCKS.register("c8_soul_soil", () -> BlockList.SOUL_SOIL_8);
    public static final RegistryObject<Block> SOUL_SOIL_9 = BLOCKS.register("c9_soul_soil", () -> BlockList.SOUL_SOIL_9);
    // End Stone
    public static final RegistryObject<Block> END_STONE_0 = BLOCKS.register("c0_end_stone", () -> BlockList.END_STONE_0);
    public static final RegistryObject<Block> END_STONE_1 = BLOCKS.register("c1_end_stone", () -> BlockList.END_STONE_1);
    public static final RegistryObject<Block> END_STONE_2 = BLOCKS.register("c2_end_stone", () -> BlockList.END_STONE_2);
    public static final RegistryObject<Block> END_STONE_3 = BLOCKS.register("c3_end_stone", () -> BlockList.END_STONE_3);
    public static final RegistryObject<Block> END_STONE_4 = BLOCKS.register("c4_end_stone", () -> BlockList.END_STONE_4);
    public static final RegistryObject<Block> END_STONE_5 = BLOCKS.register("c5_end_stone", () -> BlockList.END_STONE_5);
    public static final RegistryObject<Block> END_STONE_6 = BLOCKS.register("c6_end_stone", () -> BlockList.END_STONE_6);
    public static final RegistryObject<Block> END_STONE_7 = BLOCKS.register("c7_end_stone", () -> BlockList.END_STONE_7);
    public static final RegistryObject<Block> END_STONE_8 = BLOCKS.register("c8_end_stone", () -> BlockList.END_STONE_8);
    public static final RegistryObject<Block> END_STONE_9 = BLOCKS.register("c9_end_stone", () -> BlockList.END_STONE_9);
    // End Stone Bricks
    public static final RegistryObject<Block> END_STONE_BRICKS_0 = BLOCKS.register("c0_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_0);
    public static final RegistryObject<Block> END_STONE_BRICKS_1 = BLOCKS.register("c1_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_1);
    public static final RegistryObject<Block> END_STONE_BRICKS_2 = BLOCKS.register("c2_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_2);
    public static final RegistryObject<Block> END_STONE_BRICKS_3 = BLOCKS.register("c3_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_3);
    public static final RegistryObject<Block> END_STONE_BRICKS_4 = BLOCKS.register("c4_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_4);
    public static final RegistryObject<Block> END_STONE_BRICKS_5 = BLOCKS.register("c5_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_5);
    public static final RegistryObject<Block> END_STONE_BRICKS_6 = BLOCKS.register("c6_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_6);
    public static final RegistryObject<Block> END_STONE_BRICKS_7 = BLOCKS.register("c7_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_7);
    public static final RegistryObject<Block> END_STONE_BRICKS_8 = BLOCKS.register("c8_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_8);
    public static final RegistryObject<Block> END_STONE_BRICKS_9 = BLOCKS.register("c9_end_stone_bricks", () -> BlockList.END_STONE_BRICKS_9);
    // Blackstone
    public static final RegistryObject<Block> BLACKSTONE_0 = BLOCKS.register("c0_blackstone", () -> BlockList.BLACKSTONE_0);
    public static final RegistryObject<Block> BLACKSTONE_1 = BLOCKS.register("c1_blackstone", () -> BlockList.BLACKSTONE_1);
    public static final RegistryObject<Block> BLACKSTONE_2 = BLOCKS.register("c2_blackstone", () -> BlockList.BLACKSTONE_2);
    public static final RegistryObject<Block> BLACKSTONE_3 = BLOCKS.register("c3_blackstone", () -> BlockList.BLACKSTONE_3);
    public static final RegistryObject<Block> BLACKSTONE_4 = BLOCKS.register("c4_blackstone", () -> BlockList.BLACKSTONE_4);
    public static final RegistryObject<Block> BLACKSTONE_5 = BLOCKS.register("c5_blackstone", () -> BlockList.BLACKSTONE_5);
    public static final RegistryObject<Block> BLACKSTONE_6 = BLOCKS.register("c6_blackstone", () -> BlockList.BLACKSTONE_6);
    public static final RegistryObject<Block> BLACKSTONE_7 = BLOCKS.register("c7_blackstone", () -> BlockList.BLACKSTONE_7);
    public static final RegistryObject<Block> BLACKSTONE_8 = BLOCKS.register("c8_blackstone", () -> BlockList.BLACKSTONE_8);
    public static final RegistryObject<Block> BLACKSTONE_9 = BLOCKS.register("c9_blackstone", () -> BlockList.BLACKSTONE_9);
    // Deepslate
    public static final RegistryObject<Block> DEEPSLATE_0 = BLOCKS.register("c0_deepslate", () -> BlockList.DEEPSLATE_0);
    public static final RegistryObject<Block> DEEPSLATE_1 = BLOCKS.register("c1_deepslate", () -> BlockList.DEEPSLATE_1);
    public static final RegistryObject<Block> DEEPSLATE_2 = BLOCKS.register("c2_deepslate", () -> BlockList.DEEPSLATE_2);
    public static final RegistryObject<Block> DEEPSLATE_3 = BLOCKS.register("c3_deepslate", () -> BlockList.DEEPSLATE_3);
    public static final RegistryObject<Block> DEEPSLATE_4 = BLOCKS.register("c4_deepslate", () -> BlockList.DEEPSLATE_4);
    public static final RegistryObject<Block> DEEPSLATE_5 = BLOCKS.register("c5_deepslate", () -> BlockList.DEEPSLATE_5);
    public static final RegistryObject<Block> DEEPSLATE_6 = BLOCKS.register("c6_deepslate", () -> BlockList.DEEPSLATE_6);
    public static final RegistryObject<Block> DEEPSLATE_7 = BLOCKS.register("c7_deepslate", () -> BlockList.DEEPSLATE_7);
    public static final RegistryObject<Block> DEEPSLATE_8 = BLOCKS.register("c8_deepslate", () -> BlockList.DEEPSLATE_8);
    public static final RegistryObject<Block> DEEPSLATE_9 = BLOCKS.register("c9_deepslate", () -> BlockList.DEEPSLATE_9);
    // Cobbled Deepslate
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_0 = BLOCKS.register("c0_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_0);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_1 = BLOCKS.register("c1_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_1);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_2 = BLOCKS.register("c2_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_2);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_3 = BLOCKS.register("c3_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_3);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_4 = BLOCKS.register("c4_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_4);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_5 = BLOCKS.register("c5_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_5);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_6 = BLOCKS.register("c6_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_6);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_7 = BLOCKS.register("c7_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_7);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_8 = BLOCKS.register("c8_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_8);
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_9 = BLOCKS.register("c9_cobbled_deepslate", () -> BlockList.COBBLED_DEEPSLATE_9);
    // Tuff
    public static final RegistryObject<Block> TUFF_0 = BLOCKS.register("c0_tuff", () -> BlockList.TUFF_0);
    public static final RegistryObject<Block> TUFF_1 = BLOCKS.register("c1_tuff", () -> BlockList.TUFF_1);
    public static final RegistryObject<Block> TUFF_2 = BLOCKS.register("c2_tuff", () -> BlockList.TUFF_2);
    public static final RegistryObject<Block> TUFF_3 = BLOCKS.register("c3_tuff", () -> BlockList.TUFF_3);
    public static final RegistryObject<Block> TUFF_4 = BLOCKS.register("c4_tuff", () -> BlockList.TUFF_4);
    public static final RegistryObject<Block> TUFF_5 = BLOCKS.register("c5_tuff", () -> BlockList.TUFF_5);
    public static final RegistryObject<Block> TUFF_6 = BLOCKS.register("c6_tuff", () -> BlockList.TUFF_6);
    public static final RegistryObject<Block> TUFF_7 = BLOCKS.register("c7_tuff", () -> BlockList.TUFF_7);
    public static final RegistryObject<Block> TUFF_8 = BLOCKS.register("c8_tuff", () -> BlockList.TUFF_8);
    public static final RegistryObject<Block> TUFF_9 = BLOCKS.register("c9_tuff", () -> BlockList.TUFF_9);
    // Basalt
    public static final RegistryObject<Block> BASALT_0 = BLOCKS.register("c0_basalt", () -> BlockList.BASALT_0);
    public static final RegistryObject<Block> BASALT_1 = BLOCKS.register("c1_basalt", () -> BlockList.BASALT_1);
    public static final RegistryObject<Block> BASALT_2 = BLOCKS.register("c2_basalt", () -> BlockList.BASALT_2);
    public static final RegistryObject<Block> BASALT_3 = BLOCKS.register("c3_basalt", () -> BlockList.BASALT_3);
    public static final RegistryObject<Block> BASALT_4 = BLOCKS.register("c4_basalt", () -> BlockList.BASALT_4);
    public static final RegistryObject<Block> BASALT_5 = BLOCKS.register("c5_basalt", () -> BlockList.BASALT_5);
    public static final RegistryObject<Block> BASALT_6 = BLOCKS.register("c6_basalt", () -> BlockList.BASALT_6);
    public static final RegistryObject<Block> BASALT_7 = BLOCKS.register("c7_basalt", () -> BlockList.BASALT_7);
    public static final RegistryObject<Block> BASALT_8 = BLOCKS.register("c8_basalt", () -> BlockList.BASALT_8);
    public static final RegistryObject<Block> BASALT_9 = BLOCKS.register("c9_basalt", () -> BlockList.BASALT_9);
    // Obsidian
    public static final RegistryObject<Block> OBSIDIAN_0 = BLOCKS.register("c0_obsidian", () -> BlockList.OBSIDIAN_0);
    public static final RegistryObject<Block> OBSIDIAN_1 = BLOCKS.register("c1_obsidian", () -> BlockList.OBSIDIAN_1);
    public static final RegistryObject<Block> OBSIDIAN_2 = BLOCKS.register("c2_obsidian", () -> BlockList.OBSIDIAN_2);
    public static final RegistryObject<Block> OBSIDIAN_3 = BLOCKS.register("c3_obsidian", () -> BlockList.OBSIDIAN_3);
    public static final RegistryObject<Block> OBSIDIAN_4 = BLOCKS.register("c4_obsidian", () -> BlockList.OBSIDIAN_4);
    public static final RegistryObject<Block> OBSIDIAN_5 = BLOCKS.register("c5_obsidian", () -> BlockList.OBSIDIAN_5);
    public static final RegistryObject<Block> OBSIDIAN_6 = BLOCKS.register("c6_obsidian", () -> BlockList.OBSIDIAN_6);
    public static final RegistryObject<Block> OBSIDIAN_7 = BLOCKS.register("c7_obsidian", () -> BlockList.OBSIDIAN_7);
    public static final RegistryObject<Block> OBSIDIAN_8 = BLOCKS.register("c8_obsidian", () -> BlockList.OBSIDIAN_8);
    public static final RegistryObject<Block> OBSIDIAN_9 = BLOCKS.register("c9_obsidian", () -> BlockList.OBSIDIAN_9);
    // RAW_IRON_BLOCK
    public static final RegistryObject<Block> RAW_IRON_BLOCK_0 = BLOCKS.register("c0_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_0);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_1 = BLOCKS.register("c1_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_1);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_2 = BLOCKS.register("c2_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_2);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_3 = BLOCKS.register("c3_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_3);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_4 = BLOCKS.register("c4_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_4);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_5 = BLOCKS.register("c5_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_5);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_6 = BLOCKS.register("c6_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_6);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_7 = BLOCKS.register("c7_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_7);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_8 = BLOCKS.register("c8_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_8);
    public static final RegistryObject<Block> RAW_IRON_BLOCK_9 = BLOCKS.register("c9_" + "RAW_IRON_BLOCK".toLowerCase(), () -> BlockList.RAW_IRON_BLOCK_9);
    // Raw Copper Block
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_0 = BLOCKS.register("c0_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_0);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_1 = BLOCKS.register("c1_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_1);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_2 = BLOCKS.register("c2_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_2);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_3 = BLOCKS.register("c3_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_3);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_4 = BLOCKS.register("c4_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_4);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_5 = BLOCKS.register("c5_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_5);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_6 = BLOCKS.register("c6_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_6);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_7 = BLOCKS.register("c7_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_7);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_8 = BLOCKS.register("c8_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_8);
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_9 = BLOCKS.register("c9_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> BlockList.RAW_COPPER_BLOCK_9);
    // RAW_GOLD_BLOCK
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_0 = BLOCKS.register("c0_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_0);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_1 = BLOCKS.register("c1_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_1);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_2 = BLOCKS.register("c2_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_2);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_3 = BLOCKS.register("c3_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_3);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_4 = BLOCKS.register("c4_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_4);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_5 = BLOCKS.register("c5_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_5);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_6 = BLOCKS.register("c6_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_6);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_7 = BLOCKS.register("c7_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_7);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_8 = BLOCKS.register("c8_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_8);
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_9 = BLOCKS.register("c9_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> BlockList.RAW_GOLD_BLOCK_9);
    // MUD
    public static final RegistryObject<Block> MUD_0 = BLOCKS.register("c0_" + "MUD".toLowerCase(), () -> BlockList.MUD_0);
    public static final RegistryObject<Block> MUD_1 = BLOCKS.register("c1_" + "MUD".toLowerCase(), () -> BlockList.MUD_1);
    public static final RegistryObject<Block> MUD_2 = BLOCKS.register("c2_" + "MUD".toLowerCase(), () -> BlockList.MUD_2);
    public static final RegistryObject<Block> MUD_3 = BLOCKS.register("c3_" + "MUD".toLowerCase(), () -> BlockList.MUD_3);
    public static final RegistryObject<Block> MUD_4 = BLOCKS.register("c4_" + "MUD".toLowerCase(), () -> BlockList.MUD_4);
    public static final RegistryObject<Block> MUD_5 = BLOCKS.register("c5_" + "MUD".toLowerCase(), () -> BlockList.MUD_5);
    public static final RegistryObject<Block> MUD_6 = BLOCKS.register("c6_" + "MUD".toLowerCase(), () -> BlockList.MUD_6);
    public static final RegistryObject<Block> MUD_7 = BLOCKS.register("c7_" + "MUD".toLowerCase(), () -> BlockList.MUD_7);
    public static final RegistryObject<Block> MUD_8 = BLOCKS.register("c8_" + "MUD".toLowerCase(), () -> BlockList.MUD_8);
    public static final RegistryObject<Block> MUD_9 = BLOCKS.register("c9_" + "MUD".toLowerCase(), () -> BlockList.MUD_9);
    // OAK_LOG
    public static final RegistryObject<Block> OAK_LOG_0 = BLOCKS.register("c0_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_0);
    public static final RegistryObject<Block> OAK_LOG_1 = BLOCKS.register("c1_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_1);
    public static final RegistryObject<Block> OAK_LOG_2 = BLOCKS.register("c2_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_2);
    public static final RegistryObject<Block> OAK_LOG_3 = BLOCKS.register("c3_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_3);
    public static final RegistryObject<Block> OAK_LOG_4 = BLOCKS.register("c4_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_4);
    public static final RegistryObject<Block> OAK_LOG_5 = BLOCKS.register("c5_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_5);
    public static final RegistryObject<Block> OAK_LOG_6 = BLOCKS.register("c6_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_6);
    public static final RegistryObject<Block> OAK_LOG_7 = BLOCKS.register("c7_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_7);
    public static final RegistryObject<Block> OAK_LOG_8 = BLOCKS.register("c8_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_8);
    public static final RegistryObject<Block> OAK_LOG_9 = BLOCKS.register("c9_" + "OAK_LOG".toLowerCase(), () -> BlockList.OAK_LOG_9);
    // SPRUCE_LOG
    public static final RegistryObject<Block> SPRUCE_LOG_0 = BLOCKS.register("c0_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_0);
    public static final RegistryObject<Block> SPRUCE_LOG_1 = BLOCKS.register("c1_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_1);
    public static final RegistryObject<Block> SPRUCE_LOG_2 = BLOCKS.register("c2_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_2);
    public static final RegistryObject<Block> SPRUCE_LOG_3 = BLOCKS.register("c3_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_3);
    public static final RegistryObject<Block> SPRUCE_LOG_4 = BLOCKS.register("c4_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_4);
    public static final RegistryObject<Block> SPRUCE_LOG_5 = BLOCKS.register("c5_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_5);
    public static final RegistryObject<Block> SPRUCE_LOG_6 = BLOCKS.register("c6_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_6);
    public static final RegistryObject<Block> SPRUCE_LOG_7 = BLOCKS.register("c7_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_7);
    public static final RegistryObject<Block> SPRUCE_LOG_8 = BLOCKS.register("c8_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_8);
    public static final RegistryObject<Block> SPRUCE_LOG_9 = BLOCKS.register("c9_" + "SPRUCE_LOG".toLowerCase(), () -> BlockList.SPRUCE_LOG_9);
    // BIRCH_LOG
    public static final RegistryObject<Block> BIRCH_LOG_0 = BLOCKS.register("c0_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_0);
    public static final RegistryObject<Block> BIRCH_LOG_1 = BLOCKS.register("c1_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_1);
    public static final RegistryObject<Block> BIRCH_LOG_2 = BLOCKS.register("c2_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_2);
    public static final RegistryObject<Block> BIRCH_LOG_3 = BLOCKS.register("c3_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_3);
    public static final RegistryObject<Block> BIRCH_LOG_4 = BLOCKS.register("c4_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_4);
    public static final RegistryObject<Block> BIRCH_LOG_5 = BLOCKS.register("c5_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_5);
    public static final RegistryObject<Block> BIRCH_LOG_6 = BLOCKS.register("c6_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_6);
    public static final RegistryObject<Block> BIRCH_LOG_7 = BLOCKS.register("c7_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_7);
    public static final RegistryObject<Block> BIRCH_LOG_8 = BLOCKS.register("c8_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_8);
    public static final RegistryObject<Block> BIRCH_LOG_9 = BLOCKS.register("c9_" + "BIRCH_LOG".toLowerCase(), () -> BlockList.BIRCH_LOG_9);
    // JUNGLE_LOG
    public static final RegistryObject<Block> JUNGLE_LOG_0 = BLOCKS.register("c0_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_0);
    public static final RegistryObject<Block> JUNGLE_LOG_1 = BLOCKS.register("c1_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_1);
    public static final RegistryObject<Block> JUNGLE_LOG_2 = BLOCKS.register("c2_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_2);
    public static final RegistryObject<Block> JUNGLE_LOG_3 = BLOCKS.register("c3_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_3);
    public static final RegistryObject<Block> JUNGLE_LOG_4 = BLOCKS.register("c4_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_4);
    public static final RegistryObject<Block> JUNGLE_LOG_5 = BLOCKS.register("c5_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_5);
    public static final RegistryObject<Block> JUNGLE_LOG_6 = BLOCKS.register("c6_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_6);
    public static final RegistryObject<Block> JUNGLE_LOG_7 = BLOCKS.register("c7_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_7);
    public static final RegistryObject<Block> JUNGLE_LOG_8 = BLOCKS.register("c8_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_8);
    public static final RegistryObject<Block> JUNGLE_LOG_9 = BLOCKS.register("c9_" + "JUNGLE_LOG".toLowerCase(), () -> BlockList.JUNGLE_LOG_9);
    // ACACIA_LOG
    public static final RegistryObject<Block> ACACIA_LOG_0 = BLOCKS.register("c0_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_0);
    public static final RegistryObject<Block> ACACIA_LOG_1 = BLOCKS.register("c1_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_1);
    public static final RegistryObject<Block> ACACIA_LOG_2 = BLOCKS.register("c2_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_2);
    public static final RegistryObject<Block> ACACIA_LOG_3 = BLOCKS.register("c3_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_3);
    public static final RegistryObject<Block> ACACIA_LOG_4 = BLOCKS.register("c4_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_4);
    public static final RegistryObject<Block> ACACIA_LOG_5 = BLOCKS.register("c5_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_5);
    public static final RegistryObject<Block> ACACIA_LOG_6 = BLOCKS.register("c6_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_6);
    public static final RegistryObject<Block> ACACIA_LOG_7 = BLOCKS.register("c7_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_7);
    public static final RegistryObject<Block> ACACIA_LOG_8 = BLOCKS.register("c8_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_8);
    public static final RegistryObject<Block> ACACIA_LOG_9 = BLOCKS.register("c9_" + "ACACIA_LOG".toLowerCase(), () -> BlockList.ACACIA_LOG_9);
    // DARK_OAK_LOG
    public static final RegistryObject<Block> DARK_OAK_LOG_0 = BLOCKS.register("c0_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_0);
    public static final RegistryObject<Block> DARK_OAK_LOG_1 = BLOCKS.register("c1_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_1);
    public static final RegistryObject<Block> DARK_OAK_LOG_2 = BLOCKS.register("c2_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_2);
    public static final RegistryObject<Block> DARK_OAK_LOG_3 = BLOCKS.register("c3_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_3);
    public static final RegistryObject<Block> DARK_OAK_LOG_4 = BLOCKS.register("c4_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_4);
    public static final RegistryObject<Block> DARK_OAK_LOG_5 = BLOCKS.register("c5_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_5);
    public static final RegistryObject<Block> DARK_OAK_LOG_6 = BLOCKS.register("c6_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_6);
    public static final RegistryObject<Block> DARK_OAK_LOG_7 = BLOCKS.register("c7_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_7);
    public static final RegistryObject<Block> DARK_OAK_LOG_8 = BLOCKS.register("c8_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_8);
    public static final RegistryObject<Block> DARK_OAK_LOG_9 = BLOCKS.register("c9_" + "DARK_OAK_LOG".toLowerCase(), () -> BlockList.DARK_OAK_LOG_9);
    // MANGROVE_LOG
    public static final RegistryObject<Block> MANGROVE_LOG_0 = BLOCKS.register("c0_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_0);
    public static final RegistryObject<Block> MANGROVE_LOG_1 = BLOCKS.register("c1_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_1);
    public static final RegistryObject<Block> MANGROVE_LOG_2 = BLOCKS.register("c2_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_2);
    public static final RegistryObject<Block> MANGROVE_LOG_3 = BLOCKS.register("c3_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_3);
    public static final RegistryObject<Block> MANGROVE_LOG_4 = BLOCKS.register("c4_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_4);
    public static final RegistryObject<Block> MANGROVE_LOG_5 = BLOCKS.register("c5_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_5);
    public static final RegistryObject<Block> MANGROVE_LOG_6 = BLOCKS.register("c6_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_6);
    public static final RegistryObject<Block> MANGROVE_LOG_7 = BLOCKS.register("c7_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_7);
    public static final RegistryObject<Block> MANGROVE_LOG_8 = BLOCKS.register("c8_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_8);
    public static final RegistryObject<Block> MANGROVE_LOG_9 = BLOCKS.register("c9_" + "MANGROVE_LOG".toLowerCase(), () -> BlockList.MANGROVE_LOG_9);
    // CHERRY_LOG
    public static final RegistryObject<Block> CHERRY_LOG_0 = BLOCKS.register("c0_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_0);
    public static final RegistryObject<Block> CHERRY_LOG_1 = BLOCKS.register("c1_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_1);
    public static final RegistryObject<Block> CHERRY_LOG_2 = BLOCKS.register("c2_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_2);
    public static final RegistryObject<Block> CHERRY_LOG_3 = BLOCKS.register("c3_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_3);
    public static final RegistryObject<Block> CHERRY_LOG_4 = BLOCKS.register("c4_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_4);
    public static final RegistryObject<Block> CHERRY_LOG_5 = BLOCKS.register("c5_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_5);
    public static final RegistryObject<Block> CHERRY_LOG_6 = BLOCKS.register("c6_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_6);
    public static final RegistryObject<Block> CHERRY_LOG_7 = BLOCKS.register("c7_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_7);
    public static final RegistryObject<Block> CHERRY_LOG_8 = BLOCKS.register("c8_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_8);
    public static final RegistryObject<Block> CHERRY_LOG_9 = BLOCKS.register("c9_" + "CHERRY_LOG".toLowerCase(), () -> BlockList.CHERRY_LOG_9);
    // STRIPPED_OAK_LOG
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_0);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_1);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_2);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_3);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_4);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_5);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_6);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_7);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_8);
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_OAK_LOG_9);
    // STRIPPED_SPRUCE_LOG
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_0);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_1);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_2);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_3);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_4);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_5);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_6);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_7);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_8);
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> BlockList.STRIPPED_SPRUCE_LOG_9);
    // STRIPPED_BIRCH_LOG
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_0);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_1);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_2);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_3);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_4);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_5);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_6);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_7);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_8);
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> BlockList.STRIPPED_BIRCH_LOG_9);
    // STRIPPED_JUNGLE_LOG
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_0);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_1);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_2);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_3);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_4);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_5);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_6);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_7);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_8);
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> BlockList.STRIPPED_JUNGLE_LOG_9);
    // STRIPPED_ACACIA_LOG
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_0);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_1);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_2);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_3);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_4);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_5);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_6);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_7);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_8);
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> BlockList.STRIPPED_ACACIA_LOG_9);
    // STRIPPED_DARK_OAK_LOG
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_0);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_1);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_2);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_3);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_4);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_5);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_6);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_7);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_8);
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> BlockList.STRIPPED_DARK_OAK_LOG_9);
    // STRIPPED_MANGROVE_LOG
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_0);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_1);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_2);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_3);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_4);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_5);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_6);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_7);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_8);
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> BlockList.STRIPPED_MANGROVE_LOG_9);
    // STRIPPED_CHERRY_LOG
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_0);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_1);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_2);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_3);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_4);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_5);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_6);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_7);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_8);
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> BlockList.STRIPPED_CHERRY_LOG_9);
    // OAK_PLANKS
    public static final RegistryObject<Block> OAK_PLANKS_0 = BLOCKS.register("c0_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_0);
    public static final RegistryObject<Block> OAK_PLANKS_1 = BLOCKS.register("c1_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_1);
    public static final RegistryObject<Block> OAK_PLANKS_2 = BLOCKS.register("c2_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_2);
    public static final RegistryObject<Block> OAK_PLANKS_3 = BLOCKS.register("c3_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_3);
    public static final RegistryObject<Block> OAK_PLANKS_4 = BLOCKS.register("c4_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_4);
    public static final RegistryObject<Block> OAK_PLANKS_5 = BLOCKS.register("c5_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_5);
    public static final RegistryObject<Block> OAK_PLANKS_6 = BLOCKS.register("c6_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_6);
    public static final RegistryObject<Block> OAK_PLANKS_7 = BLOCKS.register("c7_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_7);
    public static final RegistryObject<Block> OAK_PLANKS_8 = BLOCKS.register("c8_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_8);
    public static final RegistryObject<Block> OAK_PLANKS_9 = BLOCKS.register("c9_" + "OAK_PLANKS".toLowerCase(), () -> BlockList.OAK_PLANKS_9);
    // SPRUCE_PLANKS
    public static final RegistryObject<Block> SPRUCE_PLANKS_0 = BLOCKS.register("c0_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_0);
    public static final RegistryObject<Block> SPRUCE_PLANKS_1 = BLOCKS.register("c1_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_1);
    public static final RegistryObject<Block> SPRUCE_PLANKS_2 = BLOCKS.register("c2_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_2);
    public static final RegistryObject<Block> SPRUCE_PLANKS_3 = BLOCKS.register("c3_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_3);
    public static final RegistryObject<Block> SPRUCE_PLANKS_4 = BLOCKS.register("c4_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_4);
    public static final RegistryObject<Block> SPRUCE_PLANKS_5 = BLOCKS.register("c5_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_5);
    public static final RegistryObject<Block> SPRUCE_PLANKS_6 = BLOCKS.register("c6_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_6);
    public static final RegistryObject<Block> SPRUCE_PLANKS_7 = BLOCKS.register("c7_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_7);
    public static final RegistryObject<Block> SPRUCE_PLANKS_8 = BLOCKS.register("c8_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_8);
    public static final RegistryObject<Block> SPRUCE_PLANKS_9 = BLOCKS.register("c9_" + "SPRUCE_PLANKS".toLowerCase(), () -> BlockList.SPRUCE_PLANKS_9);
    // BIRCH_PLANKS
    public static final RegistryObject<Block> BIRCH_PLANKS_0 = BLOCKS.register("c0_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_0);
    public static final RegistryObject<Block> BIRCH_PLANKS_1 = BLOCKS.register("c1_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_1);
    public static final RegistryObject<Block> BIRCH_PLANKS_2 = BLOCKS.register("c2_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_2);
    public static final RegistryObject<Block> BIRCH_PLANKS_3 = BLOCKS.register("c3_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_3);
    public static final RegistryObject<Block> BIRCH_PLANKS_4 = BLOCKS.register("c4_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_4);
    public static final RegistryObject<Block> BIRCH_PLANKS_5 = BLOCKS.register("c5_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_5);
    public static final RegistryObject<Block> BIRCH_PLANKS_6 = BLOCKS.register("c6_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_6);
    public static final RegistryObject<Block> BIRCH_PLANKS_7 = BLOCKS.register("c7_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_7);
    public static final RegistryObject<Block> BIRCH_PLANKS_8 = BLOCKS.register("c8_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_8);
    public static final RegistryObject<Block> BIRCH_PLANKS_9 = BLOCKS.register("c9_" + "BIRCH_PLANKS".toLowerCase(), () -> BlockList.BIRCH_PLANKS_9);
    // JUNGLE_PLANKS
    public static final RegistryObject<Block> JUNGLE_PLANKS_0 = BLOCKS.register("c0_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_0);
    public static final RegistryObject<Block> JUNGLE_PLANKS_1 = BLOCKS.register("c1_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_1);
    public static final RegistryObject<Block> JUNGLE_PLANKS_2 = BLOCKS.register("c2_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_2);
    public static final RegistryObject<Block> JUNGLE_PLANKS_3 = BLOCKS.register("c3_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_3);
    public static final RegistryObject<Block> JUNGLE_PLANKS_4 = BLOCKS.register("c4_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_4);
    public static final RegistryObject<Block> JUNGLE_PLANKS_5 = BLOCKS.register("c5_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_5);
    public static final RegistryObject<Block> JUNGLE_PLANKS_6 = BLOCKS.register("c6_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_6);
    public static final RegistryObject<Block> JUNGLE_PLANKS_7 = BLOCKS.register("c7_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_7);
    public static final RegistryObject<Block> JUNGLE_PLANKS_8 = BLOCKS.register("c8_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_8);
    public static final RegistryObject<Block> JUNGLE_PLANKS_9 = BLOCKS.register("c9_" + "JUNGLE_PLANKS".toLowerCase(), () -> BlockList.JUNGLE_PLANKS_9);
    // ACACIA_PLANKS
    public static final RegistryObject<Block> ACACIA_PLANKS_0 = BLOCKS.register("c0_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_0);
    public static final RegistryObject<Block> ACACIA_PLANKS_1 = BLOCKS.register("c1_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_1);
    public static final RegistryObject<Block> ACACIA_PLANKS_2 = BLOCKS.register("c2_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_2);
    public static final RegistryObject<Block> ACACIA_PLANKS_3 = BLOCKS.register("c3_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_3);
    public static final RegistryObject<Block> ACACIA_PLANKS_4 = BLOCKS.register("c4_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_4);
    public static final RegistryObject<Block> ACACIA_PLANKS_5 = BLOCKS.register("c5_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_5);
    public static final RegistryObject<Block> ACACIA_PLANKS_6 = BLOCKS.register("c6_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_6);
    public static final RegistryObject<Block> ACACIA_PLANKS_7 = BLOCKS.register("c7_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_7);
    public static final RegistryObject<Block> ACACIA_PLANKS_8 = BLOCKS.register("c8_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_8);
    public static final RegistryObject<Block> ACACIA_PLANKS_9 = BLOCKS.register("c9_" + "ACACIA_PLANKS".toLowerCase(), () -> BlockList.ACACIA_PLANKS_9);
    // DARK_OAK_PLANKS
    public static final RegistryObject<Block> DARK_OAK_PLANKS_0 = BLOCKS.register("c0_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_0);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_1 = BLOCKS.register("c1_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_1);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_2 = BLOCKS.register("c2_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_2);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_3 = BLOCKS.register("c3_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_3);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_4 = BLOCKS.register("c4_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_4);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_5 = BLOCKS.register("c5_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_5);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_6 = BLOCKS.register("c6_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_6);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_7 = BLOCKS.register("c7_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_7);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_8 = BLOCKS.register("c8_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_8);
    public static final RegistryObject<Block> DARK_OAK_PLANKS_9 = BLOCKS.register("c9_" + "DARK_OAK_PLANKS".toLowerCase(), () -> BlockList.DARK_OAK_PLANKS_9);
    // MANGROVE_PLANKS
    public static final RegistryObject<Block> MANGROVE_PLANKS_0 = BLOCKS.register("c0_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_0);
    public static final RegistryObject<Block> MANGROVE_PLANKS_1 = BLOCKS.register("c1_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_1);
    public static final RegistryObject<Block> MANGROVE_PLANKS_2 = BLOCKS.register("c2_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_2);
    public static final RegistryObject<Block> MANGROVE_PLANKS_3 = BLOCKS.register("c3_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_3);
    public static final RegistryObject<Block> MANGROVE_PLANKS_4 = BLOCKS.register("c4_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_4);
    public static final RegistryObject<Block> MANGROVE_PLANKS_5 = BLOCKS.register("c5_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_5);
    public static final RegistryObject<Block> MANGROVE_PLANKS_6 = BLOCKS.register("c6_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_6);
    public static final RegistryObject<Block> MANGROVE_PLANKS_7 = BLOCKS.register("c7_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_7);
    public static final RegistryObject<Block> MANGROVE_PLANKS_8 = BLOCKS.register("c8_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_8);
    public static final RegistryObject<Block> MANGROVE_PLANKS_9 = BLOCKS.register("c9_" + "MANGROVE_PLANKS".toLowerCase(), () -> BlockList.MANGROVE_PLANKS_9);
    // MANGROVE_PLANKS
    public static final RegistryObject<Block> CHERRY_PLANKS_0 = BLOCKS.register("c0_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_0);
    public static final RegistryObject<Block> CHERRY_PLANKS_1 = BLOCKS.register("c1_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_1);
    public static final RegistryObject<Block> CHERRY_PLANKS_2 = BLOCKS.register("c2_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_2);
    public static final RegistryObject<Block> CHERRY_PLANKS_3 = BLOCKS.register("c3_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_3);
    public static final RegistryObject<Block> CHERRY_PLANKS_4 = BLOCKS.register("c4_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_4);
    public static final RegistryObject<Block> CHERRY_PLANKS_5 = BLOCKS.register("c5_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_5);
    public static final RegistryObject<Block> CHERRY_PLANKS_6 = BLOCKS.register("c6_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_6);
    public static final RegistryObject<Block> CHERRY_PLANKS_7 = BLOCKS.register("c7_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_7);
    public static final RegistryObject<Block> CHERRY_PLANKS_8 = BLOCKS.register("c8_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_8);
    public static final RegistryObject<Block> CHERRY_PLANKS_9 = BLOCKS.register("c9_" + "CHERRY_PLANKS".toLowerCase(), () -> BlockList.CHERRY_PLANKS_9);
    // BAMBOO_PLANKS
    public static final RegistryObject<Block> BAMBOO_PLANKS_0 = BLOCKS.register("c0_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_0);
    public static final RegistryObject<Block> BAMBOO_PLANKS_1 = BLOCKS.register("c1_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_1);
    public static final RegistryObject<Block> BAMBOO_PLANKS_2 = BLOCKS.register("c2_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_2);
    public static final RegistryObject<Block> BAMBOO_PLANKS_3 = BLOCKS.register("c3_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_3);
    public static final RegistryObject<Block> BAMBOO_PLANKS_4 = BLOCKS.register("c4_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_4);
    public static final RegistryObject<Block> BAMBOO_PLANKS_5 = BLOCKS.register("c5_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_5);
    public static final RegistryObject<Block> BAMBOO_PLANKS_6 = BLOCKS.register("c6_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_6);
    public static final RegistryObject<Block> BAMBOO_PLANKS_7 = BLOCKS.register("c7_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_7);
    public static final RegistryObject<Block> BAMBOO_PLANKS_8 = BLOCKS.register("c8_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_8);
    public static final RegistryObject<Block> BAMBOO_PLANKS_9 = BLOCKS.register("c9_" + "BAMBOO_PLANKS".toLowerCase(), () -> BlockList.BAMBOO_PLANKS_9);
    // BAMBOO_MOSAIC_PLANKS
    public static final RegistryObject<Block> BAMBOO_MOSAIC_0 = BLOCKS.register("c0_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_0);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_1 = BLOCKS.register("c1_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_1);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_2 = BLOCKS.register("c2_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_2);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_3 = BLOCKS.register("c3_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_3);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_4 = BLOCKS.register("c4_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_4);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_5 = BLOCKS.register("c5_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_5);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_6 = BLOCKS.register("c6_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_6);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_7 = BLOCKS.register("c7_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_7);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_8 = BLOCKS.register("c8_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_8);
    public static final RegistryObject<Block> BAMBOO_MOSAIC_9 = BLOCKS.register("c9_" + "BAMBOO_MOSAIC".toLowerCase(), () -> BlockList.BAMBOO_MOSAIC_9);
    
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return true;
    }
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
}
