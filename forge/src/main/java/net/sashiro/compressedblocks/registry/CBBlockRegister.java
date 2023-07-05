package net.sashiro.compressedblocks.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.sashiro.compressedblocks.Constants;

import static net.sashiro.compressedblocks.block.BlockList.*;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.*;

/**
 * Forge doesn't let us use Vanilla Registries which results in duplicate code.
 */
public class CBBlockRegister {
    
    private static void registerBlock(String name, Block block) {
        BLOCKS.register(name.toLowerCase(), () -> block);
        ITEMS.register(name.toLowerCase(), () -> new BlockItem(block, PROPERTIES));
        Constants.BLOCKS.add(block);
    }
    
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void register(RegisterEvent event) {
        if (event.getRegistryKey() == BLOCKS.getRegistryKey()) {
            // Dirt
            registerBlock("c0_" + "DIRT", DIRT_0);
            registerBlock("c1_" + "DIRT", DIRT_1);
            registerBlock("c2_" + "DIRT", DIRT_2);
            registerBlock("c3_" + "DIRT", DIRT_3);
            registerBlock("c4_" + "DIRT", DIRT_4);
            registerBlock("c5_" + "DIRT", DIRT_5);
            registerBlock("c6_" + "DIRT", DIRT_6);
            registerBlock("c7_" + "DIRT", DIRT_7);
            registerBlock("c8_" + "DIRT", DIRT_8);
            registerBlock("c9_" + "DIRT", DIRT_9);
            // Gravel
            registerBlock("c0_gravel", GRAVEL_0);
            registerBlock("c1_gravel", GRAVEL_1);
            registerBlock("c2_gravel", GRAVEL_2);
            registerBlock("c3_gravel", GRAVEL_3);
            registerBlock("c4_gravel", GRAVEL_4);
            registerBlock("c5_gravel", GRAVEL_5);
            registerBlock("c6_gravel", GRAVEL_6);
            registerBlock("c7_gravel", GRAVEL_7);
            registerBlock("c8_gravel", GRAVEL_8);
            registerBlock("c9_gravel", GRAVEL_9);
            // Cobblestone
            registerBlock("c0_cobblestone", COBBLESTONE_0);
            registerBlock("c1_cobblestone", COBBLESTONE_1);
            registerBlock("c2_cobblestone", COBBLESTONE_2);
            registerBlock("c3_cobblestone", COBBLESTONE_3);
            registerBlock("c4_cobblestone", COBBLESTONE_4);
            registerBlock("c5_cobblestone", COBBLESTONE_5);
            registerBlock("c6_cobblestone", COBBLESTONE_6);
            registerBlock("c7_cobblestone", COBBLESTONE_7);
            registerBlock("c8_cobblestone", COBBLESTONE_8);
            registerBlock("c9_cobblestone", COBBLESTONE_9);
            // Stone
            registerBlock("c0_stone", STONE_0);
            registerBlock("c1_stone", STONE_1);
            registerBlock("c2_stone", STONE_2);
            registerBlock("c3_stone", STONE_3);
            registerBlock("c4_stone", STONE_4);
            registerBlock("c5_stone", STONE_5);
            registerBlock("c6_stone", STONE_6);
            registerBlock("c7_stone", STONE_7);
            registerBlock("c8_stone", STONE_8);
            registerBlock("c9_stone", STONE_9);
            // Granite
            registerBlock("c0_granite", GRANITE_0);
            registerBlock("c1_granite", GRANITE_1);
            registerBlock("c2_granite", GRANITE_2);
            registerBlock("c3_granite", GRANITE_3);
            registerBlock("c4_granite", GRANITE_4);
            registerBlock("c5_granite", GRANITE_5);
            registerBlock("c6_granite", GRANITE_6);
            registerBlock("c7_granite", GRANITE_7);
            registerBlock("c8_granite", GRANITE_8);
            registerBlock("c9_granite", GRANITE_9);
            // Diorite
            registerBlock("c0_diorite", DIORITE_0);
            registerBlock("c1_diorite", DIORITE_1);
            registerBlock("c2_diorite", DIORITE_2);
            registerBlock("c3_diorite", DIORITE_3);
            registerBlock("c4_diorite", DIORITE_4);
            registerBlock("c5_diorite", DIORITE_5);
            registerBlock("c6_diorite", DIORITE_6);
            registerBlock("c7_diorite", DIORITE_7);
            registerBlock("c8_diorite", DIORITE_8);
            registerBlock("c9_diorite", DIORITE_9);
            // Andesite
            registerBlock("c0_andesite", ANDESITE_0);
            registerBlock("c1_andesite", ANDESITE_1);
            registerBlock("c2_andesite", ANDESITE_2);
            registerBlock("c3_andesite", ANDESITE_3);
            registerBlock("c4_andesite", ANDESITE_4);
            registerBlock("c5_andesite", ANDESITE_5);
            registerBlock("c6_andesite", ANDESITE_6);
            registerBlock("c7_andesite", ANDESITE_7);
            registerBlock("c8_andesite", ANDESITE_8);
            registerBlock("c9_andesite", ANDESITE_9);
            // Crimson Nylium
            registerBlock("c0_crimson_nylium", CRIMSON_NYLIUM_0);
            registerBlock("c1_crimson_nylium", CRIMSON_NYLIUM_1);
            registerBlock("c2_crimson_nylium", CRIMSON_NYLIUM_2);
            registerBlock("c3_crimson_nylium", CRIMSON_NYLIUM_3);
            registerBlock("c4_crimson_nylium", CRIMSON_NYLIUM_4);
            registerBlock("c5_crimson_nylium", CRIMSON_NYLIUM_5);
            registerBlock("c6_crimson_nylium", CRIMSON_NYLIUM_6);
            registerBlock("c7_crimson_nylium", CRIMSON_NYLIUM_7);
            registerBlock("c8_crimson_nylium", CRIMSON_NYLIUM_8);
            registerBlock("c9_crimson_nylium", CRIMSON_NYLIUM_9);
            // Warped Nylium
            registerBlock("c0_warped_nylium", WARPED_NYLIUM_0);
            registerBlock("c1_warped_nylium", WARPED_NYLIUM_1);
            registerBlock("c2_warped_nylium", WARPED_NYLIUM_2);
            registerBlock("c3_warped_nylium", WARPED_NYLIUM_3);
            registerBlock("c4_warped_nylium", WARPED_NYLIUM_4);
            registerBlock("c5_warped_nylium", WARPED_NYLIUM_5);
            registerBlock("c6_warped_nylium", WARPED_NYLIUM_6);
            registerBlock("c7_warped_nylium", WARPED_NYLIUM_7);
            registerBlock("c8_warped_nylium", WARPED_NYLIUM_8);
            registerBlock("c9_warped_nylium", WARPED_NYLIUM_9);
            // Clay
            registerBlock("c0_clay", CLAY_0);
            registerBlock("c1_clay", CLAY_1);
            registerBlock("c2_clay", CLAY_2);
            registerBlock("c3_clay", CLAY_3);
            registerBlock("c4_clay", CLAY_4);
            registerBlock("c5_clay", CLAY_5);
            registerBlock("c6_clay", CLAY_6);
            registerBlock("c7_clay", CLAY_7);
            registerBlock("c8_clay", CLAY_8);
            registerBlock("c9_clay", CLAY_9);
            // Sand
            registerBlock("c0_sand", SAND_0);
            registerBlock("c1_sand", SAND_1);
            registerBlock("c2_sand", SAND_2);
            registerBlock("c3_sand", SAND_3);
            registerBlock("c4_sand", SAND_4);
            registerBlock("c5_sand", SAND_5);
            registerBlock("c6_sand", SAND_6);
            registerBlock("c7_sand", SAND_7);
            registerBlock("c8_sand", SAND_8);
            registerBlock("c9_sand", SAND_9);
            // Red Sand
            registerBlock("c0_red_sand", RED_SAND_0);
            registerBlock("c1_red_sand", RED_SAND_1);
            registerBlock("c2_red_sand", RED_SAND_2);
            registerBlock("c3_red_sand", RED_SAND_3);
            registerBlock("c4_red_sand", RED_SAND_4);
            registerBlock("c5_red_sand", RED_SAND_5);
            registerBlock("c6_red_sand", RED_SAND_6);
            registerBlock("c7_red_sand", RED_SAND_7);
            registerBlock("c8_red_sand", RED_SAND_8);
            registerBlock("c9_red_sand", RED_SAND_9);
            // Sandstone
            registerBlock("c0_sandstone", SANDSTONE_0);
            registerBlock("c1_sandstone", SANDSTONE_1);
            registerBlock("c2_sandstone", SANDSTONE_2);
            registerBlock("c3_sandstone", SANDSTONE_3);
            registerBlock("c4_sandstone", SANDSTONE_4);
            registerBlock("c5_sandstone", SANDSTONE_5);
            registerBlock("c6_sandstone", SANDSTONE_6);
            registerBlock("c7_sandstone", SANDSTONE_7);
            registerBlock("c8_sandstone", SANDSTONE_8);
            registerBlock("c9_sandstone", SANDSTONE_9);
            // Red Sandstone
            registerBlock("c0_red_sandstone", RED_SANDSTONE_0);
            registerBlock("c1_red_sandstone", RED_SANDSTONE_1);
            registerBlock("c2_red_sandstone", RED_SANDSTONE_2);
            registerBlock("c3_red_sandstone", RED_SANDSTONE_3);
            registerBlock("c4_red_sandstone", RED_SANDSTONE_4);
            registerBlock("c5_red_sandstone", RED_SANDSTONE_5);
            registerBlock("c6_red_sandstone", RED_SANDSTONE_6);
            registerBlock("c7_red_sandstone", RED_SANDSTONE_7);
            registerBlock("c8_red_sandstone", RED_SANDSTONE_8);
            registerBlock("c9_red_sandstone", RED_SANDSTONE_9);
            // Coal Ore
            registerBlock("c0_coal_ore", COAL_ORE_0);
            registerBlock("c1_coal_ore", COAL_ORE_1);
            registerBlock("c2_coal_ore", COAL_ORE_2);
            registerBlock("c3_coal_ore", COAL_ORE_3);
            registerBlock("c4_coal_ore", COAL_ORE_4);
            registerBlock("c5_coal_ore", COAL_ORE_5);
            registerBlock("c6_coal_ore", COAL_ORE_6);
            registerBlock("c7_coal_ore", COAL_ORE_7);
            registerBlock("c8_coal_ore", COAL_ORE_8);
            registerBlock("c9_coal_ore", COAL_ORE_9);
            // Iron Ore
            registerBlock("c0_iron_ore", IRON_ORE_0);
            registerBlock("c1_iron_ore", IRON_ORE_1);
            registerBlock("c2_iron_ore", IRON_ORE_2);
            registerBlock("c3_iron_ore", IRON_ORE_3);
            registerBlock("c4_iron_ore", IRON_ORE_4);
            registerBlock("c5_iron_ore", IRON_ORE_5);
            registerBlock("c6_iron_ore", IRON_ORE_6);
            registerBlock("c7_iron_ore", IRON_ORE_7);
            registerBlock("c8_iron_ore", IRON_ORE_8);
            registerBlock("c9_iron_ore", IRON_ORE_9);
            // Gold Ore
            registerBlock("c0_gold_ore", GOLD_ORE_0);
            registerBlock("c1_gold_ore", GOLD_ORE_1);
            registerBlock("c2_gold_ore", GOLD_ORE_2);
            registerBlock("c3_gold_ore", GOLD_ORE_3);
            registerBlock("c4_gold_ore", GOLD_ORE_4);
            registerBlock("c5_gold_ore", GOLD_ORE_5);
            registerBlock("c6_gold_ore", GOLD_ORE_6);
            registerBlock("c7_gold_ore", GOLD_ORE_7);
            registerBlock("c8_gold_ore", GOLD_ORE_8);
            registerBlock("c9_gold_ore", GOLD_ORE_9);
            // Nether Gold Ore
            registerBlock("c0_nether_gold_ore", NETHER_GOLD_ORE_0);
            registerBlock("c1_nether_gold_ore", NETHER_GOLD_ORE_1);
            registerBlock("c2_nether_gold_ore", NETHER_GOLD_ORE_2);
            registerBlock("c3_nether_gold_ore", NETHER_GOLD_ORE_3);
            registerBlock("c4_nether_gold_ore", NETHER_GOLD_ORE_4);
            registerBlock("c5_nether_gold_ore", NETHER_GOLD_ORE_5);
            registerBlock("c6_nether_gold_ore", NETHER_GOLD_ORE_6);
            registerBlock("c7_nether_gold_ore", NETHER_GOLD_ORE_7);
            registerBlock("c8_nether_gold_ore", NETHER_GOLD_ORE_8);
            registerBlock("c9_nether_gold_ore", NETHER_GOLD_ORE_9);
            // Nether Quartz Ore
            registerBlock("c0_nether_quartz_ore", NETHER_QUARTZ_ORE_0);
            registerBlock("c1_nether_quartz_ore", NETHER_QUARTZ_ORE_1);
            registerBlock("c2_nether_quartz_ore", NETHER_QUARTZ_ORE_2);
            registerBlock("c3_nether_quartz_ore", NETHER_QUARTZ_ORE_3);
            registerBlock("c4_nether_quartz_ore", NETHER_QUARTZ_ORE_4);
            registerBlock("c5_nether_quartz_ore", NETHER_QUARTZ_ORE_5);
            registerBlock("c6_nether_quartz_ore", NETHER_QUARTZ_ORE_6);
            registerBlock("c7_nether_quartz_ore", NETHER_QUARTZ_ORE_7);
            registerBlock("c8_nether_quartz_ore", NETHER_QUARTZ_ORE_8);
            registerBlock("c9_nether_quartz_ore", NETHER_QUARTZ_ORE_9);
            // Lapis Ore
            registerBlock("c0_lapis_ore", LAPIS_ORE_0);
            registerBlock("c1_lapis_ore", LAPIS_ORE_1);
            registerBlock("c2_lapis_ore", LAPIS_ORE_2);
            registerBlock("c3_lapis_ore", LAPIS_ORE_3);
            registerBlock("c4_lapis_ore", LAPIS_ORE_4);
            registerBlock("c5_lapis_ore", LAPIS_ORE_5);
            registerBlock("c6_lapis_ore", LAPIS_ORE_6);
            registerBlock("c7_lapis_ore", LAPIS_ORE_7);
            registerBlock("c8_lapis_ore", LAPIS_ORE_8);
            registerBlock("c9_lapis_ore", LAPIS_ORE_9);
            // Redstone Ore
            registerBlock("c0_redstone_ore", REDSTONE_ORE_0);
            registerBlock("c1_redstone_ore", REDSTONE_ORE_1);
            registerBlock("c2_redstone_ore", REDSTONE_ORE_2);
            registerBlock("c3_redstone_ore", REDSTONE_ORE_3);
            registerBlock("c4_redstone_ore", REDSTONE_ORE_4);
            registerBlock("c5_redstone_ore", REDSTONE_ORE_5);
            registerBlock("c6_redstone_ore", REDSTONE_ORE_6);
            registerBlock("c7_redstone_ore", REDSTONE_ORE_7);
            registerBlock("c8_redstone_ore", REDSTONE_ORE_8);
            registerBlock("c9_redstone_ore", REDSTONE_ORE_9);
            // Iron Block
            registerBlock("c0_iron_block", IRON_BLOCK_0);
            registerBlock("c1_iron_block", IRON_BLOCK_1);
            registerBlock("c2_iron_block", IRON_BLOCK_2);
            registerBlock("c3_iron_block", IRON_BLOCK_3);
            registerBlock("c4_iron_block", IRON_BLOCK_4);
            registerBlock("c5_iron_block", IRON_BLOCK_5);
            registerBlock("c6_iron_block", IRON_BLOCK_6);
            registerBlock("c7_iron_block", IRON_BLOCK_7);
            registerBlock("c8_iron_block", IRON_BLOCK_8);
            registerBlock("c9_iron_block", IRON_BLOCK_9);
            // Gold Block
            registerBlock("c0_gold_block", GOLD_BLOCK_0);
            registerBlock("c1_gold_block", GOLD_BLOCK_1);
            registerBlock("c2_gold_block", GOLD_BLOCK_2);
            registerBlock("c3_gold_block", GOLD_BLOCK_3);
            registerBlock("c4_gold_block", GOLD_BLOCK_4);
            registerBlock("c5_gold_block", GOLD_BLOCK_5);
            registerBlock("c6_gold_block", GOLD_BLOCK_6);
            registerBlock("c7_gold_block", GOLD_BLOCK_7);
            registerBlock("c8_gold_block", GOLD_BLOCK_8);
            registerBlock("c9_gold_block", GOLD_BLOCK_9);
            // Lapis Block
            registerBlock("c0_lapis_block", LAPIS_BLOCK_0);
            registerBlock("c1_lapis_block", LAPIS_BLOCK_1);
            registerBlock("c2_lapis_block", LAPIS_BLOCK_2);
            registerBlock("c3_lapis_block", LAPIS_BLOCK_3);
            registerBlock("c4_lapis_block", LAPIS_BLOCK_4);
            registerBlock("c5_lapis_block", LAPIS_BLOCK_5);
            registerBlock("c6_lapis_block", LAPIS_BLOCK_6);
            registerBlock("c7_lapis_block", LAPIS_BLOCK_7);
            registerBlock("c8_lapis_block", LAPIS_BLOCK_8);
            registerBlock("c9_lapis_block", LAPIS_BLOCK_9);
            // Redstone Block
            registerBlock("c0_redstone_block", REDSTONE_BLOCK_0);
            registerBlock("c1_redstone_block", REDSTONE_BLOCK_1);
            registerBlock("c2_redstone_block", REDSTONE_BLOCK_2);
            registerBlock("c3_redstone_block", REDSTONE_BLOCK_3);
            registerBlock("c4_redstone_block", REDSTONE_BLOCK_4);
            registerBlock("c5_redstone_block", REDSTONE_BLOCK_5);
            registerBlock("c6_redstone_block", REDSTONE_BLOCK_6);
            registerBlock("c7_redstone_block", REDSTONE_BLOCK_7);
            registerBlock("c8_redstone_block", REDSTONE_BLOCK_8);
            registerBlock("c9_redstone_block", REDSTONE_BLOCK_9);
            // Coal Block
            registerBlock("c0_coal_block", COAL_BLOCK_0);
            registerBlock("c1_coal_block", COAL_BLOCK_1);
            registerBlock("c2_coal_block", COAL_BLOCK_2);
            registerBlock("c3_coal_block", COAL_BLOCK_3);
            registerBlock("c4_coal_block", COAL_BLOCK_4);
            registerBlock("c5_coal_block", COAL_BLOCK_5);
            registerBlock("c6_coal_block", COAL_BLOCK_6);
            registerBlock("c7_coal_block", COAL_BLOCK_7);
            registerBlock("c8_coal_block", COAL_BLOCK_8);
            registerBlock("c9_coal_block", COAL_BLOCK_9);
            // Slime Block
            registerBlock("c0_slime_block", SLIME_BLOCK_0);
            registerBlock("c1_slime_block", SLIME_BLOCK_1);
            registerBlock("c2_slime_block", SLIME_BLOCK_2);
            registerBlock("c3_slime_block", SLIME_BLOCK_3);
            registerBlock("c4_slime_block", SLIME_BLOCK_4);
            registerBlock("c5_slime_block", SLIME_BLOCK_5);
            registerBlock("c6_slime_block", SLIME_BLOCK_6);
            registerBlock("c7_slime_block", SLIME_BLOCK_7);
            registerBlock("c8_slime_block", SLIME_BLOCK_8);
            registerBlock("c9_slime_block", SLIME_BLOCK_9);
            // Honey Block
            registerBlock("c0_honey_block", HONEY_BLOCK_0);
            registerBlock("c1_honey_block", HONEY_BLOCK_1);
            registerBlock("c2_honey_block", HONEY_BLOCK_2);
            registerBlock("c3_honey_block", HONEY_BLOCK_3);
            registerBlock("c4_honey_block", HONEY_BLOCK_4);
            registerBlock("c5_honey_block", HONEY_BLOCK_5);
            registerBlock("c6_honey_block", HONEY_BLOCK_6);
            registerBlock("c7_honey_block", HONEY_BLOCK_7);
            registerBlock("c8_honey_block", HONEY_BLOCK_8);
            registerBlock("c9_honey_block", HONEY_BLOCK_9);
            // Bricks
            registerBlock("c0_bricks", BRICKS_0);
            registerBlock("c1_bricks", BRICKS_1);
            registerBlock("c2_bricks", BRICKS_2);
            registerBlock("c3_bricks", BRICKS_3);
            registerBlock("c4_bricks", BRICKS_4);
            registerBlock("c5_bricks", BRICKS_5);
            registerBlock("c6_bricks", BRICKS_6);
            registerBlock("c7_bricks", BRICKS_7);
            registerBlock("c8_bricks", BRICKS_8);
            registerBlock("c9_bricks", BRICKS_9);
            // Stone Bricks
            registerBlock("c0_stone_bricks", STONE_BRICKS_0);
            registerBlock("c1_stone_bricks", STONE_BRICKS_1);
            registerBlock("c2_stone_bricks", STONE_BRICKS_2);
            registerBlock("c3_stone_bricks", STONE_BRICKS_3);
            registerBlock("c4_stone_bricks", STONE_BRICKS_4);
            registerBlock("c5_stone_bricks", STONE_BRICKS_5);
            registerBlock("c6_stone_bricks", STONE_BRICKS_6);
            registerBlock("c7_stone_bricks", STONE_BRICKS_7);
            registerBlock("c8_stone_bricks", STONE_BRICKS_8);
            registerBlock("c9_stone_bricks", STONE_BRICKS_9);
            // Netherrack
            registerBlock("c0_netherrack", NETHERRACK_0);
            registerBlock("c1_netherrack", NETHERRACK_1);
            registerBlock("c2_netherrack", NETHERRACK_2);
            registerBlock("c3_netherrack", NETHERRACK_3);
            registerBlock("c4_netherrack", NETHERRACK_4);
            registerBlock("c5_netherrack", NETHERRACK_5);
            registerBlock("c6_netherrack", NETHERRACK_6);
            registerBlock("c7_netherrack", NETHERRACK_7);
            registerBlock("c8_netherrack", NETHERRACK_8);
            registerBlock("c9_netherrack", NETHERRACK_9);
            // Nether Bricks
            registerBlock("c0_nether_bricks", NETHER_BRICKS_0);
            registerBlock("c1_nether_bricks", NETHER_BRICKS_1);
            registerBlock("c2_nether_bricks", NETHER_BRICKS_2);
            registerBlock("c3_nether_bricks", NETHER_BRICKS_3);
            registerBlock("c4_nether_bricks", NETHER_BRICKS_4);
            registerBlock("c5_nether_bricks", NETHER_BRICKS_5);
            registerBlock("c6_nether_bricks", NETHER_BRICKS_6);
            registerBlock("c7_nether_bricks", NETHER_BRICKS_7);
            registerBlock("c8_nether_bricks", NETHER_BRICKS_8);
            registerBlock("c9_nether_bricks", NETHER_BRICKS_9);
            // Red Nether Bricks
            registerBlock("c0_red_nether_bricks", RED_NETHER_BRICKS_0);
            registerBlock("c1_red_nether_bricks", RED_NETHER_BRICKS_1);
            registerBlock("c2_red_nether_bricks", RED_NETHER_BRICKS_2);
            registerBlock("c3_red_nether_bricks", RED_NETHER_BRICKS_3);
            registerBlock("c4_red_nether_bricks", RED_NETHER_BRICKS_4);
            registerBlock("c5_red_nether_bricks", RED_NETHER_BRICKS_5);
            registerBlock("c6_red_nether_bricks", RED_NETHER_BRICKS_6);
            registerBlock("c7_red_nether_bricks", RED_NETHER_BRICKS_7);
            registerBlock("c8_red_nether_bricks", RED_NETHER_BRICKS_8);
            registerBlock("c9_red_nether_bricks", RED_NETHER_BRICKS_9);
            // Nether Wart Block
            registerBlock("c0_nether_wart_block", NETHER_WART_BLOCK_0);
            registerBlock("c1_nether_wart_block", NETHER_WART_BLOCK_1);
            registerBlock("c2_nether_wart_block", NETHER_WART_BLOCK_2);
            registerBlock("c3_nether_wart_block", NETHER_WART_BLOCK_3);
            registerBlock("c4_nether_wart_block", NETHER_WART_BLOCK_4);
            registerBlock("c5_nether_wart_block", NETHER_WART_BLOCK_5);
            registerBlock("c6_nether_wart_block", NETHER_WART_BLOCK_6);
            registerBlock("c7_nether_wart_block", NETHER_WART_BLOCK_7);
            registerBlock("c8_nether_wart_block", NETHER_WART_BLOCK_8);
            registerBlock("c9_nether_wart_block", NETHER_WART_BLOCK_9);
            // Soul Sand
            registerBlock("c0_soul_sand", SOUL_SAND_0);
            registerBlock("c1_soul_sand", SOUL_SAND_1);
            registerBlock("c2_soul_sand", SOUL_SAND_2);
            registerBlock("c3_soul_sand", SOUL_SAND_3);
            registerBlock("c4_soul_sand", SOUL_SAND_4);
            registerBlock("c5_soul_sand", SOUL_SAND_5);
            registerBlock("c6_soul_sand", SOUL_SAND_6);
            registerBlock("c7_soul_sand", SOUL_SAND_7);
            registerBlock("c8_soul_sand", SOUL_SAND_8);
            registerBlock("c9_soul_sand", SOUL_SAND_9);
            // Soul Soil
            registerBlock("c0_soul_soil", SOUL_SOIL_0);
            registerBlock("c1_soul_soil", SOUL_SOIL_1);
            registerBlock("c2_soul_soil", SOUL_SOIL_2);
            registerBlock("c3_soul_soil", SOUL_SOIL_3);
            registerBlock("c4_soul_soil", SOUL_SOIL_4);
            registerBlock("c5_soul_soil", SOUL_SOIL_5);
            registerBlock("c6_soul_soil", SOUL_SOIL_6);
            registerBlock("c7_soul_soil", SOUL_SOIL_7);
            registerBlock("c8_soul_soil", SOUL_SOIL_8);
            registerBlock("c9_soul_soil", SOUL_SOIL_9);
            // End Stone
            registerBlock("c0_end_stone", END_STONE_0);
            registerBlock("c1_end_stone", END_STONE_1);
            registerBlock("c2_end_stone", END_STONE_2);
            registerBlock("c3_end_stone", END_STONE_3);
            registerBlock("c4_end_stone", END_STONE_4);
            registerBlock("c5_end_stone", END_STONE_5);
            registerBlock("c6_end_stone", END_STONE_6);
            registerBlock("c7_end_stone", END_STONE_7);
            registerBlock("c8_end_stone", END_STONE_8);
            registerBlock("c9_end_stone", END_STONE_9);
            // End Stone Bricks
            registerBlock("c0_end_stone_bricks", END_STONE_BRICKS_0);
            registerBlock("c1_end_stone_bricks", END_STONE_BRICKS_1);
            registerBlock("c2_end_stone_bricks", END_STONE_BRICKS_2);
            registerBlock("c3_end_stone_bricks", END_STONE_BRICKS_3);
            registerBlock("c4_end_stone_bricks", END_STONE_BRICKS_4);
            registerBlock("c5_end_stone_bricks", END_STONE_BRICKS_5);
            registerBlock("c6_end_stone_bricks", END_STONE_BRICKS_6);
            registerBlock("c7_end_stone_bricks", END_STONE_BRICKS_7);
            registerBlock("c8_end_stone_bricks", END_STONE_BRICKS_8);
            registerBlock("c9_end_stone_bricks", END_STONE_BRICKS_9);
            // Blackstone
            registerBlock("c0_blackstone", BLACKSTONE_0);
            registerBlock("c1_blackstone", BLACKSTONE_1);
            registerBlock("c2_blackstone", BLACKSTONE_2);
            registerBlock("c3_blackstone", BLACKSTONE_3);
            registerBlock("c4_blackstone", BLACKSTONE_4);
            registerBlock("c5_blackstone", BLACKSTONE_5);
            registerBlock("c6_blackstone", BLACKSTONE_6);
            registerBlock("c7_blackstone", BLACKSTONE_7);
            registerBlock("c8_blackstone", BLACKSTONE_8);
            registerBlock("c9_blackstone", BLACKSTONE_9);
            // Deepslate
            registerBlock("c0_deepslate", DEEPSLATE_0);
            registerBlock("c1_deepslate", DEEPSLATE_1);
            registerBlock("c2_deepslate", DEEPSLATE_2);
            registerBlock("c3_deepslate", DEEPSLATE_3);
            registerBlock("c4_deepslate", DEEPSLATE_4);
            registerBlock("c5_deepslate", DEEPSLATE_5);
            registerBlock("c6_deepslate", DEEPSLATE_6);
            registerBlock("c7_deepslate", DEEPSLATE_7);
            registerBlock("c8_deepslate", DEEPSLATE_8);
            registerBlock("c9_deepslate", DEEPSLATE_9);
            // Cobbled Deepslate
            registerBlock("c0_cobbled_deepslate", COBBLED_DEEPSLATE_0);
            registerBlock("c1_cobbled_deepslate", COBBLED_DEEPSLATE_1);
            registerBlock("c2_cobbled_deepslate", COBBLED_DEEPSLATE_2);
            registerBlock("c3_cobbled_deepslate", COBBLED_DEEPSLATE_3);
            registerBlock("c4_cobbled_deepslate", COBBLED_DEEPSLATE_4);
            registerBlock("c5_cobbled_deepslate", COBBLED_DEEPSLATE_5);
            registerBlock("c6_cobbled_deepslate", COBBLED_DEEPSLATE_6);
            registerBlock("c7_cobbled_deepslate", COBBLED_DEEPSLATE_7);
            registerBlock("c8_cobbled_deepslate", COBBLED_DEEPSLATE_8);
            registerBlock("c9_cobbled_deepslate", COBBLED_DEEPSLATE_9);
            // Tuff
            registerBlock("c0_tuff", TUFF_0);
            registerBlock("c1_tuff", TUFF_1);
            registerBlock("c2_tuff", TUFF_2);
            registerBlock("c3_tuff", TUFF_3);
            registerBlock("c4_tuff", TUFF_4);
            registerBlock("c5_tuff", TUFF_5);
            registerBlock("c6_tuff", TUFF_6);
            registerBlock("c7_tuff", TUFF_7);
            registerBlock("c8_tuff", TUFF_8);
            registerBlock("c9_tuff", TUFF_9);
            // Basalt
            registerBlock("c0_basalt", BASALT_0);
            registerBlock("c1_basalt", BASALT_1);
            registerBlock("c2_basalt", BASALT_2);
            registerBlock("c3_basalt", BASALT_3);
            registerBlock("c4_basalt", BASALT_4);
            registerBlock("c5_basalt", BASALT_5);
            registerBlock("c6_basalt", BASALT_6);
            registerBlock("c7_basalt", BASALT_7);
            registerBlock("c8_basalt", BASALT_8);
            registerBlock("c9_basalt", BASALT_9);
            // Obsidian
            registerBlock("c0_obsidian", OBSIDIAN_0);
            registerBlock("c1_obsidian", OBSIDIAN_1);
            registerBlock("c2_obsidian", OBSIDIAN_2);
            registerBlock("c3_obsidian", OBSIDIAN_3);
            registerBlock("c4_obsidian", OBSIDIAN_4);
            registerBlock("c5_obsidian", OBSIDIAN_5);
            registerBlock("c6_obsidian", OBSIDIAN_6);
            registerBlock("c7_obsidian", OBSIDIAN_7);
            registerBlock("c8_obsidian", OBSIDIAN_8);
            registerBlock("c9_obsidian", OBSIDIAN_9);
            // RAW_IRON_BLOCK
            registerBlock("c0_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_0);
            registerBlock("c1_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_1);
            registerBlock("c2_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_2);
            registerBlock("c3_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_3);
            registerBlock("c4_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_4);
            registerBlock("c5_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_5);
            registerBlock("c6_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_6);
            registerBlock("c7_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_7);
            registerBlock("c8_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_8);
            registerBlock("c9_" + "RAW_IRON_BLOCK", RAW_IRON_BLOCK_9);
            // Raw Copper Block
            registerBlock("c0_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_0);
            registerBlock("c1_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_1);
            registerBlock("c2_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_2);
            registerBlock("c3_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_3);
            registerBlock("c4_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_4);
            registerBlock("c5_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_5);
            registerBlock("c6_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_6);
            registerBlock("c7_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_7);
            registerBlock("c8_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_8);
            registerBlock("c9_" + "RAW_COPPER_BLOCK", RAW_COPPER_BLOCK_9);
            // RAW_GOLD_BLOCK
            registerBlock("c0_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_0);
            registerBlock("c1_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_1);
            registerBlock("c2_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_2);
            registerBlock("c3_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_3);
            registerBlock("c4_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_4);
            registerBlock("c5_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_5);
            registerBlock("c6_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_6);
            registerBlock("c7_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_7);
            registerBlock("c8_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_8);
            registerBlock("c9_" + "RAW_GOLD_BLOCK", RAW_GOLD_BLOCK_9);
            // MUD
            registerBlock("c0_" + "MUD", MUD_0);
            registerBlock("c1_" + "MUD", MUD_1);
            registerBlock("c2_" + "MUD", MUD_2);
            registerBlock("c3_" + "MUD", MUD_3);
            registerBlock("c4_" + "MUD", MUD_4);
            registerBlock("c5_" + "MUD", MUD_5);
            registerBlock("c6_" + "MUD", MUD_6);
            registerBlock("c7_" + "MUD", MUD_7);
            registerBlock("c8_" + "MUD", MUD_8);
            registerBlock("c9_" + "MUD", MUD_9);
            // OAK_LOG
            registerBlock("c0_" + "OAK_LOG", OAK_LOG_0);
            registerBlock("c1_" + "OAK_LOG", OAK_LOG_1);
            registerBlock("c2_" + "OAK_LOG", OAK_LOG_2);
            registerBlock("c3_" + "OAK_LOG", OAK_LOG_3);
            registerBlock("c4_" + "OAK_LOG", OAK_LOG_4);
            registerBlock("c5_" + "OAK_LOG", OAK_LOG_5);
            registerBlock("c6_" + "OAK_LOG", OAK_LOG_6);
            registerBlock("c7_" + "OAK_LOG", OAK_LOG_7);
            registerBlock("c8_" + "OAK_LOG", OAK_LOG_8);
            registerBlock("c9_" + "OAK_LOG", OAK_LOG_9);
            // SPRUCE_LOG
            registerBlock("c0_" + "SPRUCE_LOG", SPRUCE_LOG_0);
            registerBlock("c1_" + "SPRUCE_LOG", SPRUCE_LOG_1);
            registerBlock("c2_" + "SPRUCE_LOG", SPRUCE_LOG_2);
            registerBlock("c3_" + "SPRUCE_LOG", SPRUCE_LOG_3);
            registerBlock("c4_" + "SPRUCE_LOG", SPRUCE_LOG_4);
            registerBlock("c5_" + "SPRUCE_LOG", SPRUCE_LOG_5);
            registerBlock("c6_" + "SPRUCE_LOG", SPRUCE_LOG_6);
            registerBlock("c7_" + "SPRUCE_LOG", SPRUCE_LOG_7);
            registerBlock("c8_" + "SPRUCE_LOG", SPRUCE_LOG_8);
            registerBlock("c9_" + "SPRUCE_LOG", SPRUCE_LOG_9);
            // BIRCH_LOG
            registerBlock("c0_" + "BIRCH_LOG", BIRCH_LOG_0);
            registerBlock("c1_" + "BIRCH_LOG", BIRCH_LOG_1);
            registerBlock("c2_" + "BIRCH_LOG", BIRCH_LOG_2);
            registerBlock("c3_" + "BIRCH_LOG", BIRCH_LOG_3);
            registerBlock("c4_" + "BIRCH_LOG", BIRCH_LOG_4);
            registerBlock("c5_" + "BIRCH_LOG", BIRCH_LOG_5);
            registerBlock("c6_" + "BIRCH_LOG", BIRCH_LOG_6);
            registerBlock("c7_" + "BIRCH_LOG", BIRCH_LOG_7);
            registerBlock("c8_" + "BIRCH_LOG", BIRCH_LOG_8);
            registerBlock("c9_" + "BIRCH_LOG", BIRCH_LOG_9);
            // JUNGLE_LOG
            registerBlock("c0_" + "JUNGLE_LOG", JUNGLE_LOG_0);
            registerBlock("c1_" + "JUNGLE_LOG", JUNGLE_LOG_1);
            registerBlock("c2_" + "JUNGLE_LOG", JUNGLE_LOG_2);
            registerBlock("c3_" + "JUNGLE_LOG", JUNGLE_LOG_3);
            registerBlock("c4_" + "JUNGLE_LOG", JUNGLE_LOG_4);
            registerBlock("c5_" + "JUNGLE_LOG", JUNGLE_LOG_5);
            registerBlock("c6_" + "JUNGLE_LOG", JUNGLE_LOG_6);
            registerBlock("c7_" + "JUNGLE_LOG", JUNGLE_LOG_7);
            registerBlock("c8_" + "JUNGLE_LOG", JUNGLE_LOG_8);
            registerBlock("c9_" + "JUNGLE_LOG", JUNGLE_LOG_9);
            // ACACIA_LOG
            registerBlock("c0_" + "ACACIA_LOG", ACACIA_LOG_0);
            registerBlock("c1_" + "ACACIA_LOG", ACACIA_LOG_1);
            registerBlock("c2_" + "ACACIA_LOG", ACACIA_LOG_2);
            registerBlock("c3_" + "ACACIA_LOG", ACACIA_LOG_3);
            registerBlock("c4_" + "ACACIA_LOG", ACACIA_LOG_4);
            registerBlock("c5_" + "ACACIA_LOG", ACACIA_LOG_5);
            registerBlock("c6_" + "ACACIA_LOG", ACACIA_LOG_6);
            registerBlock("c7_" + "ACACIA_LOG", ACACIA_LOG_7);
            registerBlock("c8_" + "ACACIA_LOG", ACACIA_LOG_8);
            registerBlock("c9_" + "ACACIA_LOG", ACACIA_LOG_9);
            // DARK_OAK_LOG
            registerBlock("c0_" + "DARK_OAK_LOG", DARK_OAK_LOG_0);
            registerBlock("c1_" + "DARK_OAK_LOG", DARK_OAK_LOG_1);
            registerBlock("c2_" + "DARK_OAK_LOG", DARK_OAK_LOG_2);
            registerBlock("c3_" + "DARK_OAK_LOG", DARK_OAK_LOG_3);
            registerBlock("c4_" + "DARK_OAK_LOG", DARK_OAK_LOG_4);
            registerBlock("c5_" + "DARK_OAK_LOG", DARK_OAK_LOG_5);
            registerBlock("c6_" + "DARK_OAK_LOG", DARK_OAK_LOG_6);
            registerBlock("c7_" + "DARK_OAK_LOG", DARK_OAK_LOG_7);
            registerBlock("c8_" + "DARK_OAK_LOG", DARK_OAK_LOG_8);
            registerBlock("c9_" + "DARK_OAK_LOG", DARK_OAK_LOG_9);
            // MANGROVE_LOG
            registerBlock("c0_" + "MANGROVE_LOG", MANGROVE_LOG_0);
            registerBlock("c1_" + "MANGROVE_LOG", MANGROVE_LOG_1);
            registerBlock("c2_" + "MANGROVE_LOG", MANGROVE_LOG_2);
            registerBlock("c3_" + "MANGROVE_LOG", MANGROVE_LOG_3);
            registerBlock("c4_" + "MANGROVE_LOG", MANGROVE_LOG_4);
            registerBlock("c5_" + "MANGROVE_LOG", MANGROVE_LOG_5);
            registerBlock("c6_" + "MANGROVE_LOG", MANGROVE_LOG_6);
            registerBlock("c7_" + "MANGROVE_LOG", MANGROVE_LOG_7);
            registerBlock("c8_" + "MANGROVE_LOG", MANGROVE_LOG_8);
            registerBlock("c9_" + "MANGROVE_LOG", MANGROVE_LOG_9);
            // CHERRY_LOG
            registerBlock("c0_" + "CHERRY_LOG", CHERRY_LOG_0);
            registerBlock("c1_" + "CHERRY_LOG", CHERRY_LOG_1);
            registerBlock("c2_" + "CHERRY_LOG", CHERRY_LOG_2);
            registerBlock("c3_" + "CHERRY_LOG", CHERRY_LOG_3);
            registerBlock("c4_" + "CHERRY_LOG", CHERRY_LOG_4);
            registerBlock("c5_" + "CHERRY_LOG", CHERRY_LOG_5);
            registerBlock("c6_" + "CHERRY_LOG", CHERRY_LOG_6);
            registerBlock("c7_" + "CHERRY_LOG", CHERRY_LOG_7);
            registerBlock("c8_" + "CHERRY_LOG", CHERRY_LOG_8);
            registerBlock("c9_" + "CHERRY_LOG", CHERRY_LOG_9);
            // STRIPPED_OAK_LOG
            registerBlock("c0_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_0);
            registerBlock("c1_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_1);
            registerBlock("c2_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_2);
            registerBlock("c3_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_3);
            registerBlock("c4_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_4);
            registerBlock("c5_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_5);
            registerBlock("c6_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_6);
            registerBlock("c7_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_7);
            registerBlock("c8_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_8);
            registerBlock("c9_" + "STRIPPED_OAK_LOG", STRIPPED_OAK_LOG_9);
            // STRIPPED_SPRUCE_LOG
            registerBlock("c0_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_0);
            registerBlock("c1_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_1);
            registerBlock("c2_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_2);
            registerBlock("c3_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_3);
            registerBlock("c4_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_4);
            registerBlock("c5_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_5);
            registerBlock("c6_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_6);
            registerBlock("c7_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_7);
            registerBlock("c8_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_8);
            registerBlock("c9_" + "STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG_9);
            // STRIPPED_BIRCH_LOG
            registerBlock("c0_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_0);
            registerBlock("c1_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_1);
            registerBlock("c2_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_2);
            registerBlock("c3_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_3);
            registerBlock("c4_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_4);
            registerBlock("c5_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_5);
            registerBlock("c6_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_6);
            registerBlock("c7_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_7);
            registerBlock("c8_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_8);
            registerBlock("c9_" + "STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG_9);
            // STRIPPED_JUNGLE_LOG
            registerBlock("c0_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_0);
            registerBlock("c1_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_1);
            registerBlock("c2_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_2);
            registerBlock("c3_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_3);
            registerBlock("c4_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_4);
            registerBlock("c5_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_5);
            registerBlock("c6_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_6);
            registerBlock("c7_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_7);
            registerBlock("c8_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_8);
            registerBlock("c9_" + "STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG_9);
            // STRIPPED_ACACIA_LOG
            registerBlock("c0_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_0);
            registerBlock("c1_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_1);
            registerBlock("c2_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_2);
            registerBlock("c3_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_3);
            registerBlock("c4_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_4);
            registerBlock("c5_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_5);
            registerBlock("c6_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_6);
            registerBlock("c7_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_7);
            registerBlock("c8_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_8);
            registerBlock("c9_" + "STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG_9);
            // STRIPPED_DARK_OAK_LOG
            registerBlock("c0_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_0);
            registerBlock("c1_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_1);
            registerBlock("c2_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_2);
            registerBlock("c3_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_3);
            registerBlock("c4_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_4);
            registerBlock("c5_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_5);
            registerBlock("c6_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_6);
            registerBlock("c7_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_7);
            registerBlock("c8_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_8);
            registerBlock("c9_" + "STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG_9);
            // STRIPPED_MANGROVE_LOG
            registerBlock("c0_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_0);
            registerBlock("c1_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_1);
            registerBlock("c2_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_2);
            registerBlock("c3_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_3);
            registerBlock("c4_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_4);
            registerBlock("c5_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_5);
            registerBlock("c6_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_6);
            registerBlock("c7_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_7);
            registerBlock("c8_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_8);
            registerBlock("c9_" + "STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG_9);
            // STRIPPED_CHERRY_LOG
            registerBlock("c0_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_0);
            registerBlock("c1_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_1);
            registerBlock("c2_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_2);
            registerBlock("c3_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_3);
            registerBlock("c4_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_4);
            registerBlock("c5_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_5);
            registerBlock("c6_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_6);
            registerBlock("c7_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_7);
            registerBlock("c8_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_8);
            registerBlock("c9_" + "STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG_9);
            // OAK_PLANKS
            registerBlock("c0_" + "OAK_PLANKS", OAK_PLANKS_0);
            registerBlock("c1_" + "OAK_PLANKS", OAK_PLANKS_1);
            registerBlock("c2_" + "OAK_PLANKS", OAK_PLANKS_2);
            registerBlock("c3_" + "OAK_PLANKS", OAK_PLANKS_3);
            registerBlock("c4_" + "OAK_PLANKS", OAK_PLANKS_4);
            registerBlock("c5_" + "OAK_PLANKS", OAK_PLANKS_5);
            registerBlock("c6_" + "OAK_PLANKS", OAK_PLANKS_6);
            registerBlock("c7_" + "OAK_PLANKS", OAK_PLANKS_7);
            registerBlock("c8_" + "OAK_PLANKS", OAK_PLANKS_8);
            registerBlock("c9_" + "OAK_PLANKS", OAK_PLANKS_9);
            // SPRUCE_PLANKS
            registerBlock("c0_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_0);
            registerBlock("c1_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_1);
            registerBlock("c2_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_2);
            registerBlock("c3_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_3);
            registerBlock("c4_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_4);
            registerBlock("c5_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_5);
            registerBlock("c6_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_6);
            registerBlock("c7_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_7);
            registerBlock("c8_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_8);
            registerBlock("c9_" + "SPRUCE_PLANKS", SPRUCE_PLANKS_9);
            // BIRCH_PLANKS
            registerBlock("c0_" + "BIRCH_PLANKS", BIRCH_PLANKS_0);
            registerBlock("c1_" + "BIRCH_PLANKS", BIRCH_PLANKS_1);
            registerBlock("c2_" + "BIRCH_PLANKS", BIRCH_PLANKS_2);
            registerBlock("c3_" + "BIRCH_PLANKS", BIRCH_PLANKS_3);
            registerBlock("c4_" + "BIRCH_PLANKS", BIRCH_PLANKS_4);
            registerBlock("c5_" + "BIRCH_PLANKS", BIRCH_PLANKS_5);
            registerBlock("c6_" + "BIRCH_PLANKS", BIRCH_PLANKS_6);
            registerBlock("c7_" + "BIRCH_PLANKS", BIRCH_PLANKS_7);
            registerBlock("c8_" + "BIRCH_PLANKS", BIRCH_PLANKS_8);
            registerBlock("c9_" + "BIRCH_PLANKS", BIRCH_PLANKS_9);
            // JUNGLE_PLANKS
            registerBlock("c0_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_0);
            registerBlock("c1_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_1);
            registerBlock("c2_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_2);
            registerBlock("c3_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_3);
            registerBlock("c4_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_4);
            registerBlock("c5_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_5);
            registerBlock("c6_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_6);
            registerBlock("c7_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_7);
            registerBlock("c8_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_8);
            registerBlock("c9_" + "JUNGLE_PLANKS", JUNGLE_PLANKS_9);
            // ACACIA_PLANKS
            registerBlock("c0_" + "ACACIA_PLANKS", ACACIA_PLANKS_0);
            registerBlock("c1_" + "ACACIA_PLANKS", ACACIA_PLANKS_1);
            registerBlock("c2_" + "ACACIA_PLANKS", ACACIA_PLANKS_2);
            registerBlock("c3_" + "ACACIA_PLANKS", ACACIA_PLANKS_3);
            registerBlock("c4_" + "ACACIA_PLANKS", ACACIA_PLANKS_4);
            registerBlock("c5_" + "ACACIA_PLANKS", ACACIA_PLANKS_5);
            registerBlock("c6_" + "ACACIA_PLANKS", ACACIA_PLANKS_6);
            registerBlock("c7_" + "ACACIA_PLANKS", ACACIA_PLANKS_7);
            registerBlock("c8_" + "ACACIA_PLANKS", ACACIA_PLANKS_8);
            registerBlock("c9_" + "ACACIA_PLANKS", ACACIA_PLANKS_9);
            // DARK_OAK_PLANKS
            registerBlock("c0_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_0);
            registerBlock("c1_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_1);
            registerBlock("c2_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_2);
            registerBlock("c3_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_3);
            registerBlock("c4_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_4);
            registerBlock("c5_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_5);
            registerBlock("c6_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_6);
            registerBlock("c7_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_7);
            registerBlock("c8_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_8);
            registerBlock("c9_" + "DARK_OAK_PLANKS", DARK_OAK_PLANKS_9);
            // MANGROVE_PLANKS
            registerBlock("c0_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_0);
            registerBlock("c1_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_1);
            registerBlock("c2_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_2);
            registerBlock("c3_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_3);
            registerBlock("c4_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_4);
            registerBlock("c5_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_5);
            registerBlock("c6_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_6);
            registerBlock("c7_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_7);
            registerBlock("c8_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_8);
            registerBlock("c9_" + "MANGROVE_PLANKS", MANGROVE_PLANKS_9);
            // MANGROVE_PLANKS
            registerBlock("c0_" + "CHERRY_PLANKS", CHERRY_PLANKS_0);
            registerBlock("c1_" + "CHERRY_PLANKS", CHERRY_PLANKS_1);
            registerBlock("c2_" + "CHERRY_PLANKS", CHERRY_PLANKS_2);
            registerBlock("c3_" + "CHERRY_PLANKS", CHERRY_PLANKS_3);
            registerBlock("c4_" + "CHERRY_PLANKS", CHERRY_PLANKS_4);
            registerBlock("c5_" + "CHERRY_PLANKS", CHERRY_PLANKS_5);
            registerBlock("c6_" + "CHERRY_PLANKS", CHERRY_PLANKS_6);
            registerBlock("c7_" + "CHERRY_PLANKS", CHERRY_PLANKS_7);
            registerBlock("c8_" + "CHERRY_PLANKS", CHERRY_PLANKS_8);
            registerBlock("c9_" + "CHERRY_PLANKS", CHERRY_PLANKS_9);
            // BAMBOO_PLANKS
            registerBlock("c0_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_0);
            registerBlock("c1_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_1);
            registerBlock("c2_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_2);
            registerBlock("c3_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_3);
            registerBlock("c4_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_4);
            registerBlock("c5_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_5);
            registerBlock("c6_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_6);
            registerBlock("c7_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_7);
            registerBlock("c8_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_8);
            registerBlock("c9_" + "BAMBOO_PLANKS", BAMBOO_PLANKS_9);
            // BAMBOO_MOSAIC_PLANKS
            registerBlock("c0_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_0);
            registerBlock("c1_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_1);
            registerBlock("c2_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_2);
            registerBlock("c3_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_3);
            registerBlock("c4_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_4);
            registerBlock("c5_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_5);
            registerBlock("c6_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_6);
            registerBlock("c7_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_7);
            registerBlock("c8_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_8);
            registerBlock("c9_" + "BAMBOO_MOSAIC", BAMBOO_MOSAIC_9);
        }
    }
}
