package net.sashiro.compressedblocks.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.CBBlocks.*;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.ITEMS;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.PROPERTIES;

@SuppressWarnings({"unused", "CanBeFinal"})
@Mod.EventBusSubscriber(modid = MOD_ID)
public class CBBlockItems {
    
    // Dirt
    public static final RegistryObject<Item> DIRT_0_ITEM = ITEMS.register("c0_dirt", () -> new BlockItem(DIRT_0.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_1_ITEM = ITEMS.register("c1_dirt", () -> new BlockItem(DIRT_1.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_2_ITEM = ITEMS.register("c2_dirt", () -> new BlockItem(DIRT_2.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_3_ITEM = ITEMS.register("c3_dirt", () -> new BlockItem(DIRT_3.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_4_ITEM = ITEMS.register("c4_dirt", () -> new BlockItem(DIRT_4.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_5_ITEM = ITEMS.register("c5_dirt", () -> new BlockItem(DIRT_5.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_6_ITEM = ITEMS.register("c6_dirt", () -> new BlockItem(DIRT_6.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_7_ITEM = ITEMS.register("c7_dirt", () -> new BlockItem(DIRT_7.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_8_ITEM = ITEMS.register("c8_dirt", () -> new BlockItem(DIRT_8.get(), PROPERTIES));
    public static final RegistryObject<Item> DIRT_9_ITEM = ITEMS.register("c9_dirt", () -> new BlockItem(DIRT_9.get(), PROPERTIES));
    // Gravel
    public static final RegistryObject<Item> GRAVEL_0_ITEM = ITEMS.register("c0_gravel", () -> new BlockItem(GRAVEL_0.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_1_ITEM = ITEMS.register("c1_gravel", () -> new BlockItem(GRAVEL_1.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_2_ITEM = ITEMS.register("c2_gravel", () -> new BlockItem(GRAVEL_2.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_3_ITEM = ITEMS.register("c3_gravel", () -> new BlockItem(GRAVEL_3.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_4_ITEM = ITEMS.register("c4_gravel", () -> new BlockItem(GRAVEL_4.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_5_ITEM = ITEMS.register("c5_gravel", () -> new BlockItem(GRAVEL_5.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_6_ITEM = ITEMS.register("c6_gravel", () -> new BlockItem(GRAVEL_6.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_7_ITEM = ITEMS.register("c7_gravel", () -> new BlockItem(GRAVEL_7.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_8_ITEM = ITEMS.register("c8_gravel", () -> new BlockItem(GRAVEL_8.get(), PROPERTIES));
    public static final RegistryObject<Item> GRAVEL_9_ITEM = ITEMS.register("c9_gravel", () -> new BlockItem(GRAVEL_9.get(), PROPERTIES));
    // Cobblestone
    public static final RegistryObject<Item> COBBLESTONE_0_ITEM = ITEMS.register("c0_cobblestone", () -> new BlockItem(COBBLESTONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_1_ITEM = ITEMS.register("c1_cobblestone", () -> new BlockItem(COBBLESTONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_2_ITEM = ITEMS.register("c2_cobblestone", () -> new BlockItem(COBBLESTONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_3_ITEM = ITEMS.register("c3_cobblestone", () -> new BlockItem(COBBLESTONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_4_ITEM = ITEMS.register("c4_cobblestone", () -> new BlockItem(COBBLESTONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_5_ITEM = ITEMS.register("c5_cobblestone", () -> new BlockItem(COBBLESTONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_6_ITEM = ITEMS.register("c6_cobblestone", () -> new BlockItem(COBBLESTONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_7_ITEM = ITEMS.register("c7_cobblestone", () -> new BlockItem(COBBLESTONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_8_ITEM = ITEMS.register("c8_cobblestone", () -> new BlockItem(COBBLESTONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLESTONE_9_ITEM = ITEMS.register("c9_cobblestone", () -> new BlockItem(COBBLESTONE_9.get(), PROPERTIES));
    // Stone
    public static final RegistryObject<Item> STONE_0_ITEM = ITEMS.register("c0_stone", () -> new BlockItem(STONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_1_ITEM = ITEMS.register("c1_stone", () -> new BlockItem(STONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_2_ITEM = ITEMS.register("c2_stone", () -> new BlockItem(STONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_3_ITEM = ITEMS.register("c3_stone", () -> new BlockItem(STONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_4_ITEM = ITEMS.register("c4_stone", () -> new BlockItem(STONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_5_ITEM = ITEMS.register("c5_stone", () -> new BlockItem(STONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_6_ITEM = ITEMS.register("c6_stone", () -> new BlockItem(STONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_7_ITEM = ITEMS.register("c7_stone", () -> new BlockItem(STONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_8_ITEM = ITEMS.register("c8_stone", () -> new BlockItem(STONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_9_ITEM = ITEMS.register("c9_stone", () -> new BlockItem(STONE_9.get(), PROPERTIES));
    // Granite
    public static final RegistryObject<Item> GRANITE_0_ITEM = ITEMS.register("c0_granite", () -> new BlockItem(GRANITE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_1_ITEM = ITEMS.register("c1_granite", () -> new BlockItem(GRANITE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_2_ITEM = ITEMS.register("c2_granite", () -> new BlockItem(GRANITE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_3_ITEM = ITEMS.register("c3_granite", () -> new BlockItem(GRANITE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_4_ITEM = ITEMS.register("c4_granite", () -> new BlockItem(GRANITE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_5_ITEM = ITEMS.register("c5_granite", () -> new BlockItem(GRANITE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_6_ITEM = ITEMS.register("c6_granite", () -> new BlockItem(GRANITE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_7_ITEM = ITEMS.register("c7_granite", () -> new BlockItem(GRANITE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_8_ITEM = ITEMS.register("c8_granite", () -> new BlockItem(GRANITE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> GRANITE_9_ITEM = ITEMS.register("c9_granite", () -> new BlockItem(GRANITE_9.get(), PROPERTIES));
    // Diorite
    public static final RegistryObject<Item> DIORITE_0_ITEM = ITEMS.register("c0_diorite", () -> new BlockItem(DIORITE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_1_ITEM = ITEMS.register("c1_diorite", () -> new BlockItem(DIORITE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_2_ITEM = ITEMS.register("c2_diorite", () -> new BlockItem(DIORITE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_3_ITEM = ITEMS.register("c3_diorite", () -> new BlockItem(DIORITE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_4_ITEM = ITEMS.register("c4_diorite", () -> new BlockItem(DIORITE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_5_ITEM = ITEMS.register("c5_diorite", () -> new BlockItem(DIORITE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_6_ITEM = ITEMS.register("c6_diorite", () -> new BlockItem(DIORITE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_7_ITEM = ITEMS.register("c7_diorite", () -> new BlockItem(DIORITE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_8_ITEM = ITEMS.register("c8_diorite", () -> new BlockItem(DIORITE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> DIORITE_9_ITEM = ITEMS.register("c9_diorite", () -> new BlockItem(DIORITE_9.get(), PROPERTIES));
    // Andesite
    public static final RegistryObject<Item> ANDESITE_0_ITEM = ITEMS.register("c0_andesite", () -> new BlockItem(ANDESITE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_1_ITEM = ITEMS.register("c1_andesite", () -> new BlockItem(ANDESITE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_2_ITEM = ITEMS.register("c2_andesite", () -> new BlockItem(ANDESITE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_3_ITEM = ITEMS.register("c3_andesite", () -> new BlockItem(ANDESITE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_4_ITEM = ITEMS.register("c4_andesite", () -> new BlockItem(ANDESITE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_5_ITEM = ITEMS.register("c5_andesite", () -> new BlockItem(ANDESITE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_6_ITEM = ITEMS.register("c6_andesite", () -> new BlockItem(ANDESITE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_7_ITEM = ITEMS.register("c7_andesite", () -> new BlockItem(ANDESITE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_8_ITEM = ITEMS.register("c8_andesite", () -> new BlockItem(ANDESITE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> ANDESITE_9_ITEM = ITEMS.register("c9_andesite", () -> new BlockItem(ANDESITE_9.get(), PROPERTIES));
    // Crimson Nylium
    public static final RegistryObject<Item> CRIMSON_NYLIUM_0_ITEM = ITEMS.register("c0_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_0.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_1_ITEM = ITEMS.register("c1_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_1.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_2_ITEM = ITEMS.register("c2_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_2.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_3_ITEM = ITEMS.register("c3_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_3.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_4_ITEM = ITEMS.register("c4_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_4.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_5_ITEM = ITEMS.register("c5_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_5.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_6_ITEM = ITEMS.register("c6_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_6.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_7_ITEM = ITEMS.register("c7_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_7.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_8_ITEM = ITEMS.register("c8_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_8.get(), PROPERTIES));
    public static final RegistryObject<Item> CRIMSON_NYLIUM_9_ITEM = ITEMS.register("c9_crimson_nylium", () -> new BlockItem(CRIMSON_NYLIUM_9.get(), PROPERTIES));
    // Warped Nylium
    public static final RegistryObject<Item> WARPED_NYLIUM_0_ITEM = ITEMS.register("c0_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_0.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_1_ITEM = ITEMS.register("c1_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_1.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_2_ITEM = ITEMS.register("c2_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_2.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_3_ITEM = ITEMS.register("c3_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_3.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_4_ITEM = ITEMS.register("c4_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_4.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_5_ITEM = ITEMS.register("c5_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_5.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_6_ITEM = ITEMS.register("c6_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_6.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_7_ITEM = ITEMS.register("c7_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_7.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_8_ITEM = ITEMS.register("c8_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_8.get(), PROPERTIES));
    public static final RegistryObject<Item> WARPED_NYLIUM_9_ITEM = ITEMS.register("c9_warped_nylium", () -> new BlockItem(WARPED_NYLIUM_9.get(), PROPERTIES));
    // Clay
    public static final RegistryObject<Item> CLAY_0_ITEM = ITEMS.register("c0_clay", () -> new BlockItem(CLAY_0.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_1_ITEM = ITEMS.register("c1_clay", () -> new BlockItem(CLAY_1.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_2_ITEM = ITEMS.register("c2_clay", () -> new BlockItem(CLAY_2.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_3_ITEM = ITEMS.register("c3_clay", () -> new BlockItem(CLAY_3.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_4_ITEM = ITEMS.register("c4_clay", () -> new BlockItem(CLAY_4.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_5_ITEM = ITEMS.register("c5_clay", () -> new BlockItem(CLAY_5.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_6_ITEM = ITEMS.register("c6_clay", () -> new BlockItem(CLAY_6.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_7_ITEM = ITEMS.register("c7_clay", () -> new BlockItem(CLAY_7.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_8_ITEM = ITEMS.register("c8_clay", () -> new BlockItem(CLAY_8.get(), PROPERTIES));
    public static final RegistryObject<Item> CLAY_9_ITEM = ITEMS.register("c9_clay", () -> new BlockItem(CLAY_9.get(), PROPERTIES));
    // Sand
    public static final RegistryObject<Item> SAND_0_ITEM = ITEMS.register("c0_sand", () -> new BlockItem(SAND_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_2_ITEM = ITEMS.register("c2_sand", () -> new BlockItem(SAND_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_1_ITEM = ITEMS.register("c1_sand", () -> new BlockItem(SAND_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_3_ITEM = ITEMS.register("c3_sand", () -> new BlockItem(SAND_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_4_ITEM = ITEMS.register("c4_sand", () -> new BlockItem(SAND_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_5_ITEM = ITEMS.register("c5_sand", () -> new BlockItem(SAND_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_6_ITEM = ITEMS.register("c6_sand", () -> new BlockItem(SAND_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_7_ITEM = ITEMS.register("c7_sand", () -> new BlockItem(SAND_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_8_ITEM = ITEMS.register("c8_sand", () -> new BlockItem(SAND_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SAND_9_ITEM = ITEMS.register("c9_sand", () -> new BlockItem(SAND_9.get(), PROPERTIES));
    // Red Sand
    public static final RegistryObject<Item> RED_SAND_0_ITEM = ITEMS.register("c0_red_sand", () -> new BlockItem(RED_SAND_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_1_ITEM = ITEMS.register("c1_red_sand", () -> new BlockItem(RED_SAND_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_2_ITEM = ITEMS.register("c2_red_sand", () -> new BlockItem(RED_SAND_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_3_ITEM = ITEMS.register("c3_red_sand", () -> new BlockItem(RED_SAND_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_4_ITEM = ITEMS.register("c4_red_sand", () -> new BlockItem(RED_SAND_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_5_ITEM = ITEMS.register("c5_red_sand", () -> new BlockItem(RED_SAND_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_6_ITEM = ITEMS.register("c6_red_sand", () -> new BlockItem(RED_SAND_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_7_ITEM = ITEMS.register("c7_red_sand", () -> new BlockItem(RED_SAND_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_8_ITEM = ITEMS.register("c8_red_sand", () -> new BlockItem(RED_SAND_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SAND_9_ITEM = ITEMS.register("c9_red_sand", () -> new BlockItem(RED_SAND_9.get(), PROPERTIES));
    // Sandstone
    public static final RegistryObject<Item> SANDSTONE_0_ITEM = ITEMS.register("c0_sandstone", () -> new BlockItem(SANDSTONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_1_ITEM = ITEMS.register("c1_sandstone", () -> new BlockItem(SANDSTONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_2_ITEM = ITEMS.register("c2_sandstone", () -> new BlockItem(SANDSTONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_3_ITEM = ITEMS.register("c3_sandstone", () -> new BlockItem(SANDSTONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_4_ITEM = ITEMS.register("c4_sandstone", () -> new BlockItem(SANDSTONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_5_ITEM = ITEMS.register("c5_sandstone", () -> new BlockItem(SANDSTONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_6_ITEM = ITEMS.register("c6_sandstone", () -> new BlockItem(SANDSTONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_7_ITEM = ITEMS.register("c7_sandstone", () -> new BlockItem(SANDSTONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_8_ITEM = ITEMS.register("c8_sandstone", () -> new BlockItem(SANDSTONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SANDSTONE_9_ITEM = ITEMS.register("c9_sandstone", () -> new BlockItem(SANDSTONE_9.get(), PROPERTIES));
    // Red Sandstone
    public static final RegistryObject<Item> RED_SANDSTONE_0_ITEM = ITEMS.register("c0_red_sandstone", () -> new BlockItem(RED_SANDSTONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_1_ITEM = ITEMS.register("c1_red_sandstone", () -> new BlockItem(RED_SANDSTONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_2_ITEM = ITEMS.register("c2_red_sandstone", () -> new BlockItem(RED_SANDSTONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_3_ITEM = ITEMS.register("c3_red_sandstone", () -> new BlockItem(RED_SANDSTONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_4_ITEM = ITEMS.register("c4_red_sandstone", () -> new BlockItem(RED_SANDSTONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_5_ITEM = ITEMS.register("c5_red_sandstone", () -> new BlockItem(RED_SANDSTONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_6_ITEM = ITEMS.register("c6_red_sandstone", () -> new BlockItem(RED_SANDSTONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_7_ITEM = ITEMS.register("c7_red_sandstone", () -> new BlockItem(RED_SANDSTONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_8_ITEM = ITEMS.register("c8_red_sandstone", () -> new BlockItem(RED_SANDSTONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_SANDSTONE_9_ITEM = ITEMS.register("c9_red_sandstone", () -> new BlockItem(RED_SANDSTONE_9.get(), PROPERTIES));
    // Coal Ore
    public static final RegistryObject<Item> COAL_ORE_0_ITEM = ITEMS.register("c0_coal_ore", () -> new BlockItem(COAL_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_1_ITEM = ITEMS.register("c1_coal_ore", () -> new BlockItem(COAL_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_2_ITEM = ITEMS.register("c2_coal_ore", () -> new BlockItem(COAL_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_3_ITEM = ITEMS.register("c3_coal_ore", () -> new BlockItem(COAL_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_4_ITEM = ITEMS.register("c4_coal_ore", () -> new BlockItem(COAL_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_5_ITEM = ITEMS.register("c5_coal_ore", () -> new BlockItem(COAL_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_6_ITEM = ITEMS.register("c6_coal_ore", () -> new BlockItem(COAL_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_7_ITEM = ITEMS.register("c7_coal_ore", () -> new BlockItem(COAL_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_8_ITEM = ITEMS.register("c8_coal_ore", () -> new BlockItem(COAL_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_ORE_9_ITEM = ITEMS.register("c9_coal_ore", () -> new BlockItem(COAL_ORE_9.get(), PROPERTIES));
    // Iron Ore
    public static final RegistryObject<Item> IRON_ORE_0_ITEM = ITEMS.register("c0_iron_ore", () -> new BlockItem(IRON_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_1_ITEM = ITEMS.register("c1_iron_ore", () -> new BlockItem(IRON_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_2_ITEM = ITEMS.register("c2_iron_ore", () -> new BlockItem(IRON_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_3_ITEM = ITEMS.register("c3_iron_ore", () -> new BlockItem(IRON_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_4_ITEM = ITEMS.register("c4_iron_ore", () -> new BlockItem(IRON_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_5_ITEM = ITEMS.register("c5_iron_ore", () -> new BlockItem(IRON_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_6_ITEM = ITEMS.register("c6_iron_ore", () -> new BlockItem(IRON_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_7_ITEM = ITEMS.register("c7_iron_ore", () -> new BlockItem(IRON_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_8_ITEM = ITEMS.register("c8_iron_ore", () -> new BlockItem(IRON_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_ORE_9_ITEM = ITEMS.register("c9_iron_ore", () -> new BlockItem(IRON_ORE_9.get(), PROPERTIES));
    // Gold Ore
    public static final RegistryObject<Item> GOLD_ORE_0_ITEM = ITEMS.register("c0_gold_ore", () -> new BlockItem(GOLD_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_1_ITEM = ITEMS.register("c1_gold_ore", () -> new BlockItem(GOLD_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_2_ITEM = ITEMS.register("c2_gold_ore", () -> new BlockItem(GOLD_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_3_ITEM = ITEMS.register("c3_gold_ore", () -> new BlockItem(GOLD_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_4_ITEM = ITEMS.register("c4_gold_ore", () -> new BlockItem(GOLD_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_5_ITEM = ITEMS.register("c5_gold_ore", () -> new BlockItem(GOLD_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_6_ITEM = ITEMS.register("c6_gold_ore", () -> new BlockItem(GOLD_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_7_ITEM = ITEMS.register("c7_gold_ore", () -> new BlockItem(GOLD_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_8_ITEM = ITEMS.register("c8_gold_ore", () -> new BlockItem(GOLD_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_ORE_9_ITEM = ITEMS.register("c9_gold_ore", () -> new BlockItem(GOLD_ORE_9.get(), PROPERTIES));
    // Nether Gold Ore
    public static final RegistryObject<Item> NETHER_GOLD_ORE_0_ITEM = ITEMS.register("c0_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_1_ITEM = ITEMS.register("c1_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_2_ITEM = ITEMS.register("c2_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_3_ITEM = ITEMS.register("c3_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_4_ITEM = ITEMS.register("c4_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_5_ITEM = ITEMS.register("c5_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_6_ITEM = ITEMS.register("c6_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_7_ITEM = ITEMS.register("c7_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_8_ITEM = ITEMS.register("c8_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_GOLD_ORE_9_ITEM = ITEMS.register("c9_nether_gold_ore", () -> new BlockItem(NETHER_GOLD_ORE_9.get(), PROPERTIES));
    // Nether Quartz Ore
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_0_ITEM = ITEMS.register("c0_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_1_ITEM = ITEMS.register("c1_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_2_ITEM = ITEMS.register("c2_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_3_ITEM = ITEMS.register("c3_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_4_ITEM = ITEMS.register("c4_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_5_ITEM = ITEMS.register("c5_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_6_ITEM = ITEMS.register("c6_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_7_ITEM = ITEMS.register("c7_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_8_ITEM = ITEMS.register("c8_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_QUARTZ_ORE_9_ITEM = ITEMS.register("c9_nether_quartz_ore", () -> new BlockItem(NETHER_QUARTZ_ORE_9.get(), PROPERTIES));
    // Lapis Ore
    public static final RegistryObject<Item> LAPIS_ORE_0_ITEM = ITEMS.register("c0_lapis_ore", () -> new BlockItem(LAPIS_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_1_ITEM = ITEMS.register("c1_lapis_ore", () -> new BlockItem(LAPIS_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_2_ITEM = ITEMS.register("c2_lapis_ore", () -> new BlockItem(LAPIS_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_3_ITEM = ITEMS.register("c3_lapis_ore", () -> new BlockItem(LAPIS_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_4_ITEM = ITEMS.register("c4_lapis_ore", () -> new BlockItem(LAPIS_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_5_ITEM = ITEMS.register("c5_lapis_ore", () -> new BlockItem(LAPIS_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_6_ITEM = ITEMS.register("c6_lapis_ore", () -> new BlockItem(LAPIS_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_7_ITEM = ITEMS.register("c7_lapis_ore", () -> new BlockItem(LAPIS_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_8_ITEM = ITEMS.register("c8_lapis_ore", () -> new BlockItem(LAPIS_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_ORE_9_ITEM = ITEMS.register("c9_lapis_ore", () -> new BlockItem(LAPIS_ORE_9.get(), PROPERTIES));
    // Redstone Ore
    public static final RegistryObject<Item> REDSTONE_ORE_0_ITEM = ITEMS.register("c0_redstone_ore", () -> new BlockItem(REDSTONE_ORE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_1_ITEM = ITEMS.register("c1_redstone_ore", () -> new BlockItem(REDSTONE_ORE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_2_ITEM = ITEMS.register("c2_redstone_ore", () -> new BlockItem(REDSTONE_ORE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_3_ITEM = ITEMS.register("c3_redstone_ore", () -> new BlockItem(REDSTONE_ORE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_4_ITEM = ITEMS.register("c4_redstone_ore", () -> new BlockItem(REDSTONE_ORE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_5_ITEM = ITEMS.register("c5_redstone_ore", () -> new BlockItem(REDSTONE_ORE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_6_ITEM = ITEMS.register("c6_redstone_ore", () -> new BlockItem(REDSTONE_ORE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_7_ITEM = ITEMS.register("c7_redstone_ore", () -> new BlockItem(REDSTONE_ORE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_8_ITEM = ITEMS.register("c8_redstone_ore", () -> new BlockItem(REDSTONE_ORE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_ORE_9_ITEM = ITEMS.register("c9_redstone_ore", () -> new BlockItem(REDSTONE_ORE_9.get(), PROPERTIES));
    // Iron Block
    public static final RegistryObject<Item> IRON_BLOCK_0_ITEM = ITEMS.register("c0_iron_block", () -> new BlockItem(IRON_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_1_ITEM = ITEMS.register("c1_iron_block", () -> new BlockItem(IRON_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_2_ITEM = ITEMS.register("c2_iron_block", () -> new BlockItem(IRON_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_3_ITEM = ITEMS.register("c3_iron_block", () -> new BlockItem(IRON_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_4_ITEM = ITEMS.register("c4_iron_block", () -> new BlockItem(IRON_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_5_ITEM = ITEMS.register("c5_iron_block", () -> new BlockItem(IRON_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_6_ITEM = ITEMS.register("c6_iron_block", () -> new BlockItem(IRON_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_7_ITEM = ITEMS.register("c7_iron_block", () -> new BlockItem(IRON_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_8_ITEM = ITEMS.register("c8_iron_block", () -> new BlockItem(IRON_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> IRON_BLOCK_9_ITEM = ITEMS.register("c9_iron_block", () -> new BlockItem(IRON_BLOCK_9.get(), PROPERTIES));
    // Gold Block
    public static final RegistryObject<Item> GOLD_BLOCK_0_ITEM = ITEMS.register("c0_gold_block", () -> new BlockItem(GOLD_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_1_ITEM = ITEMS.register("c1_gold_block", () -> new BlockItem(GOLD_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_2_ITEM = ITEMS.register("c2_gold_block", () -> new BlockItem(GOLD_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_3_ITEM = ITEMS.register("c3_gold_block", () -> new BlockItem(GOLD_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_4_ITEM = ITEMS.register("c4_gold_block", () -> new BlockItem(GOLD_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_5_ITEM = ITEMS.register("c5_gold_block", () -> new BlockItem(GOLD_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_6_ITEM = ITEMS.register("c6_gold_block", () -> new BlockItem(GOLD_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_7_ITEM = ITEMS.register("c7_gold_block", () -> new BlockItem(GOLD_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_8_ITEM = ITEMS.register("c8_gold_block", () -> new BlockItem(GOLD_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> GOLD_BLOCK_9_ITEM = ITEMS.register("c9_gold_block", () -> new BlockItem(GOLD_BLOCK_9.get(), PROPERTIES));
    // Lapis Block
    public static final RegistryObject<Item> LAPIS_BLOCK_0_ITEM = ITEMS.register("c0_lapis_block", () -> new BlockItem(LAPIS_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_1_ITEM = ITEMS.register("c1_lapis_block", () -> new BlockItem(LAPIS_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_2_ITEM = ITEMS.register("c2_lapis_block", () -> new BlockItem(LAPIS_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_3_ITEM = ITEMS.register("c3_lapis_block", () -> new BlockItem(LAPIS_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_4_ITEM = ITEMS.register("c4_lapis_block", () -> new BlockItem(LAPIS_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_5_ITEM = ITEMS.register("c5_lapis_block", () -> new BlockItem(LAPIS_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_6_ITEM = ITEMS.register("c6_lapis_block", () -> new BlockItem(LAPIS_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_7_ITEM = ITEMS.register("c7_lapis_block", () -> new BlockItem(LAPIS_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_8_ITEM = ITEMS.register("c8_lapis_block", () -> new BlockItem(LAPIS_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> LAPIS_BLOCK_9_ITEM = ITEMS.register("c9_lapis_block", () -> new BlockItem(LAPIS_BLOCK_9.get(), PROPERTIES));
    // Redstone Block
    public static final RegistryObject<Item> REDSTONE_BLOCK_0_ITEM = ITEMS.register("c0_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_1_ITEM = ITEMS.register("c1_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_2_ITEM = ITEMS.register("c2_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_3_ITEM = ITEMS.register("c3_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_4_ITEM = ITEMS.register("c4_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_5_ITEM = ITEMS.register("c5_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_6_ITEM = ITEMS.register("c6_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_7_ITEM = ITEMS.register("c7_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_8_ITEM = ITEMS.register("c8_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> REDSTONE_BLOCK_9_ITEM = ITEMS.register("c9_redstone_block", () -> new BlockItem(REDSTONE_BLOCK_9.get(), PROPERTIES));
    // Coal Block
    public static final RegistryObject<Item> COAL_BLOCK_0_ITEM = ITEMS.register("c0_coal_block", () -> new BlockItem(COAL_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_1_ITEM = ITEMS.register("c1_coal_block", () -> new BlockItem(COAL_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_2_ITEM = ITEMS.register("c2_coal_block", () -> new BlockItem(COAL_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_3_ITEM = ITEMS.register("c3_coal_block", () -> new BlockItem(COAL_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_4_ITEM = ITEMS.register("c4_coal_block", () -> new BlockItem(COAL_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_5_ITEM = ITEMS.register("c5_coal_block", () -> new BlockItem(COAL_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_6_ITEM = ITEMS.register("c6_coal_block", () -> new BlockItem(COAL_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_7_ITEM = ITEMS.register("c7_coal_block", () -> new BlockItem(COAL_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_8_ITEM = ITEMS.register("c8_coal_block", () -> new BlockItem(COAL_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> COAL_BLOCK_9_ITEM = ITEMS.register("c9_coal_block", () -> new BlockItem(COAL_BLOCK_9.get(), PROPERTIES));
    // Slime Block
    public static final RegistryObject<Item> SLIME_BLOCK_0_ITEM = ITEMS.register("c0_slime_block", () -> new BlockItem(SLIME_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_1_ITEM = ITEMS.register("c1_slime_block", () -> new BlockItem(SLIME_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_2_ITEM = ITEMS.register("c2_slime_block", () -> new BlockItem(SLIME_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_3_ITEM = ITEMS.register("c3_slime_block", () -> new BlockItem(SLIME_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_4_ITEM = ITEMS.register("c4_slime_block", () -> new BlockItem(SLIME_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_5_ITEM = ITEMS.register("c5_slime_block", () -> new BlockItem(SLIME_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_6_ITEM = ITEMS.register("c6_slime_block", () -> new BlockItem(SLIME_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_7_ITEM = ITEMS.register("c7_slime_block", () -> new BlockItem(SLIME_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_8_ITEM = ITEMS.register("c8_slime_block", () -> new BlockItem(SLIME_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SLIME_BLOCK_9_ITEM = ITEMS.register("c9_slime_block", () -> new BlockItem(SLIME_BLOCK_9.get(), PROPERTIES));
    // Honey Block
    public static final RegistryObject<Item> HONEY_BLOCK_0_ITEM = ITEMS.register("c0_honey_block", () -> new BlockItem(HONEY_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_1_ITEM = ITEMS.register("c1_honey_block", () -> new BlockItem(HONEY_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_2_ITEM = ITEMS.register("c2_honey_block", () -> new BlockItem(HONEY_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_3_ITEM = ITEMS.register("c3_honey_block", () -> new BlockItem(HONEY_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_4_ITEM = ITEMS.register("c4_honey_block", () -> new BlockItem(HONEY_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_5_ITEM = ITEMS.register("c5_honey_block", () -> new BlockItem(HONEY_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_6_ITEM = ITEMS.register("c6_honey_block", () -> new BlockItem(HONEY_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_7_ITEM = ITEMS.register("c7_honey_block", () -> new BlockItem(HONEY_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_8_ITEM = ITEMS.register("c8_honey_block", () -> new BlockItem(HONEY_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> HONEY_BLOCK_9_ITEM = ITEMS.register("c9_honey_block", () -> new BlockItem(HONEY_BLOCK_9.get(), PROPERTIES));
    // Bricks
    public static final RegistryObject<Item> BRICKS_0_ITEM = ITEMS.register("c0_bricks", () -> new BlockItem(BRICKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_1_ITEM = ITEMS.register("c1_bricks", () -> new BlockItem(BRICKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_2_ITEM = ITEMS.register("c2_bricks", () -> new BlockItem(BRICKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_3_ITEM = ITEMS.register("c3_bricks", () -> new BlockItem(BRICKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_4_ITEM = ITEMS.register("c4_bricks", () -> new BlockItem(BRICKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_5_ITEM = ITEMS.register("c5_bricks", () -> new BlockItem(BRICKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_6_ITEM = ITEMS.register("c6_bricks", () -> new BlockItem(BRICKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_7_ITEM = ITEMS.register("c7_bricks", () -> new BlockItem(BRICKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_8_ITEM = ITEMS.register("c8_bricks", () -> new BlockItem(BRICKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> BRICKS_9_ITEM = ITEMS.register("c9_bricks", () -> new BlockItem(BRICKS_9.get(), PROPERTIES));
    // Stone Bricks
    public static final RegistryObject<Item> STONE_BRICKS_0_ITEM = ITEMS.register("c0_stone_bricks", () -> new BlockItem(STONE_BRICKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_1_ITEM = ITEMS.register("c1_stone_bricks", () -> new BlockItem(STONE_BRICKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_2_ITEM = ITEMS.register("c2_stone_bricks", () -> new BlockItem(STONE_BRICKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_3_ITEM = ITEMS.register("c3_stone_bricks", () -> new BlockItem(STONE_BRICKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_4_ITEM = ITEMS.register("c4_stone_bricks", () -> new BlockItem(STONE_BRICKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_5_ITEM = ITEMS.register("c5_stone_bricks", () -> new BlockItem(STONE_BRICKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_6_ITEM = ITEMS.register("c6_stone_bricks", () -> new BlockItem(STONE_BRICKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_7_ITEM = ITEMS.register("c7_stone_bricks", () -> new BlockItem(STONE_BRICKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_8_ITEM = ITEMS.register("c8_stone_bricks", () -> new BlockItem(STONE_BRICKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STONE_BRICKS_9_ITEM = ITEMS.register("c9_stone_bricks", () -> new BlockItem(STONE_BRICKS_9.get(), PROPERTIES));
    // Netherrack
    public static final RegistryObject<Item> NETHERRACK_0_ITEM = ITEMS.register("c0_netherrack", () -> new BlockItem(NETHERRACK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_1_ITEM = ITEMS.register("c1_netherrack", () -> new BlockItem(NETHERRACK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_2_ITEM = ITEMS.register("c2_netherrack", () -> new BlockItem(NETHERRACK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_3_ITEM = ITEMS.register("c3_netherrack", () -> new BlockItem(NETHERRACK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_4_ITEM = ITEMS.register("c4_netherrack", () -> new BlockItem(NETHERRACK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_5_ITEM = ITEMS.register("c5_netherrack", () -> new BlockItem(NETHERRACK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_6_ITEM = ITEMS.register("c6_netherrack", () -> new BlockItem(NETHERRACK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_7_ITEM = ITEMS.register("c7_netherrack", () -> new BlockItem(NETHERRACK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_8_ITEM = ITEMS.register("c8_netherrack", () -> new BlockItem(NETHERRACK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHERRACK_9_ITEM = ITEMS.register("c9_netherrack", () -> new BlockItem(NETHERRACK_9.get(), PROPERTIES));
    // Nether Bricks
    public static final RegistryObject<Item> NETHER_BRICKS_0_ITEM = ITEMS.register("c0_nether_bricks", () -> new BlockItem(NETHER_BRICKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_1_ITEM = ITEMS.register("c1_nether_bricks", () -> new BlockItem(NETHER_BRICKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_2_ITEM = ITEMS.register("c2_nether_bricks", () -> new BlockItem(NETHER_BRICKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_3_ITEM = ITEMS.register("c3_nether_bricks", () -> new BlockItem(NETHER_BRICKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_4_ITEM = ITEMS.register("c4_nether_bricks", () -> new BlockItem(NETHER_BRICKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_5_ITEM = ITEMS.register("c5_nether_bricks", () -> new BlockItem(NETHER_BRICKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_6_ITEM = ITEMS.register("c6_nether_bricks", () -> new BlockItem(NETHER_BRICKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_7_ITEM = ITEMS.register("c7_nether_bricks", () -> new BlockItem(NETHER_BRICKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_8_ITEM = ITEMS.register("c8_nether_bricks", () -> new BlockItem(NETHER_BRICKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_BRICKS_9_ITEM = ITEMS.register("c9_nether_bricks", () -> new BlockItem(NETHER_BRICKS_9.get(), PROPERTIES));
    // Red Nether Bricks
    public static final RegistryObject<Item> RED_NETHER_BRICKS_0_ITEM = ITEMS.register("c0_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_1_ITEM = ITEMS.register("c1_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_2_ITEM = ITEMS.register("c2_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_3_ITEM = ITEMS.register("c3_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_4_ITEM = ITEMS.register("c4_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_5_ITEM = ITEMS.register("c5_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_6_ITEM = ITEMS.register("c6_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_7_ITEM = ITEMS.register("c7_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_8_ITEM = ITEMS.register("c8_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RED_NETHER_BRICKS_9_ITEM = ITEMS.register("c9_red_nether_bricks", () -> new BlockItem(RED_NETHER_BRICKS_9.get(), PROPERTIES));
    // Nether Wart Block
    public static final RegistryObject<Item> NETHER_WART_BLOCK_0_ITEM = ITEMS.register("c0_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_1_ITEM = ITEMS.register("c1_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_2_ITEM = ITEMS.register("c2_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_3_ITEM = ITEMS.register("c3_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_4_ITEM = ITEMS.register("c4_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_5_ITEM = ITEMS.register("c5_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_6_ITEM = ITEMS.register("c6_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_7_ITEM = ITEMS.register("c7_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_8_ITEM = ITEMS.register("c8_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> NETHER_WART_BLOCK_9_ITEM = ITEMS.register("c9_nether_wart_block", () -> new BlockItem(NETHER_WART_BLOCK_9.get(), PROPERTIES));
    // Soul Sand
    public static final RegistryObject<Item> SOUL_SAND_0_ITEM = ITEMS.register("c0_soul_sand", () -> new BlockItem(SOUL_SAND_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_1_ITEM = ITEMS.register("c1_soul_sand", () -> new BlockItem(SOUL_SAND_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_2_ITEM = ITEMS.register("c2_soul_sand", () -> new BlockItem(SOUL_SAND_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_3_ITEM = ITEMS.register("c3_soul_sand", () -> new BlockItem(SOUL_SAND_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_4_ITEM = ITEMS.register("c4_soul_sand", () -> new BlockItem(SOUL_SAND_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_5_ITEM = ITEMS.register("c5_soul_sand", () -> new BlockItem(SOUL_SAND_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_6_ITEM = ITEMS.register("c6_soul_sand", () -> new BlockItem(SOUL_SAND_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_7_ITEM = ITEMS.register("c7_soul_sand", () -> new BlockItem(SOUL_SAND_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_8_ITEM = ITEMS.register("c8_soul_sand", () -> new BlockItem(SOUL_SAND_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SAND_9_ITEM = ITEMS.register("c9_soul_sand", () -> new BlockItem(SOUL_SAND_9.get(), PROPERTIES));
    // Soul Soil
    public static final RegistryObject<Item> SOUL_SOIL_0_ITEM = ITEMS.register("c0_soul_soil", () -> new BlockItem(SOUL_SOIL_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_1_ITEM = ITEMS.register("c1_soul_soil", () -> new BlockItem(SOUL_SOIL_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_2_ITEM = ITEMS.register("c2_soul_soil", () -> new BlockItem(SOUL_SOIL_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_3_ITEM = ITEMS.register("c3_soul_soil", () -> new BlockItem(SOUL_SOIL_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_4_ITEM = ITEMS.register("c4_soul_soil", () -> new BlockItem(SOUL_SOIL_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_5_ITEM = ITEMS.register("c5_soul_soil", () -> new BlockItem(SOUL_SOIL_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_6_ITEM = ITEMS.register("c6_soul_soil", () -> new BlockItem(SOUL_SOIL_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_7_ITEM = ITEMS.register("c7_soul_soil", () -> new BlockItem(SOUL_SOIL_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_8_ITEM = ITEMS.register("c8_soul_soil", () -> new BlockItem(SOUL_SOIL_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SOUL_SOIL_9_ITEM = ITEMS.register("c9_soul_soil", () -> new BlockItem(SOUL_SOIL_9.get(), PROPERTIES));
    // End Stone
    public static final RegistryObject<Item> END_STONE_0_ITEM = ITEMS.register("c0_end_stone", () -> new BlockItem(END_STONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_1_ITEM = ITEMS.register("c1_end_stone", () -> new BlockItem(END_STONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_2_ITEM = ITEMS.register("c2_end_stone", () -> new BlockItem(END_STONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_3_ITEM = ITEMS.register("c3_end_stone", () -> new BlockItem(END_STONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_4_ITEM = ITEMS.register("c4_end_stone", () -> new BlockItem(END_STONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_5_ITEM = ITEMS.register("c5_end_stone", () -> new BlockItem(END_STONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_6_ITEM = ITEMS.register("c6_end_stone", () -> new BlockItem(END_STONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_7_ITEM = ITEMS.register("c7_end_stone", () -> new BlockItem(END_STONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_8_ITEM = ITEMS.register("c8_end_stone", () -> new BlockItem(END_STONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_9_ITEM = ITEMS.register("c9_end_stone", () -> new BlockItem(END_STONE_9.get(), PROPERTIES));
    // End Stine Bricks
    public static final RegistryObject<Item> END_STONE_BRICKS_0_ITEM = ITEMS.register("c0_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_1_ITEM = ITEMS.register("c1_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_2_ITEM = ITEMS.register("c2_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_3_ITEM = ITEMS.register("c3_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_4_ITEM = ITEMS.register("c4_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_5_ITEM = ITEMS.register("c5_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_6_ITEM = ITEMS.register("c6_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_7_ITEM = ITEMS.register("c7_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_8_ITEM = ITEMS.register("c8_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> END_STONE_BRICKS_9_ITEM = ITEMS.register("c9_end_stone_bricks", () -> new BlockItem(END_STONE_BRICKS_9.get(), PROPERTIES));
    // Blackstone
    public static final RegistryObject<Item> BLACKSTONE_0_ITEM = ITEMS.register("c0_blackstone", () -> new BlockItem(BLACKSTONE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_1_ITEM = ITEMS.register("c1_blackstone", () -> new BlockItem(BLACKSTONE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_2_ITEM = ITEMS.register("c2_blackstone", () -> new BlockItem(BLACKSTONE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_3_ITEM = ITEMS.register("c3_blackstone", () -> new BlockItem(BLACKSTONE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_4_ITEM = ITEMS.register("c4_blackstone", () -> new BlockItem(BLACKSTONE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_5_ITEM = ITEMS.register("c5_blackstone", () -> new BlockItem(BLACKSTONE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_6_ITEM = ITEMS.register("c6_blackstone", () -> new BlockItem(BLACKSTONE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_7_ITEM = ITEMS.register("c7_blackstone", () -> new BlockItem(BLACKSTONE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_8_ITEM = ITEMS.register("c8_blackstone", () -> new BlockItem(BLACKSTONE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> BLACKSTONE_9_ITEM = ITEMS.register("c9_blackstone", () -> new BlockItem(BLACKSTONE_9.get(), PROPERTIES));
    // Deepslate
    public static final RegistryObject<Item> DEEPSLATE_0_ITEM = ITEMS.register("c0_deepslate", () -> new BlockItem(DEEPSLATE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_1_ITEM = ITEMS.register("c1_deepslate", () -> new BlockItem(DEEPSLATE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_2_ITEM = ITEMS.register("c2_deepslate", () -> new BlockItem(DEEPSLATE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_3_ITEM = ITEMS.register("c3_deepslate", () -> new BlockItem(DEEPSLATE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_4_ITEM = ITEMS.register("c4_deepslate", () -> new BlockItem(DEEPSLATE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_5_ITEM = ITEMS.register("c5_deepslate", () -> new BlockItem(DEEPSLATE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_6_ITEM = ITEMS.register("c6_deepslate", () -> new BlockItem(DEEPSLATE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_7_ITEM = ITEMS.register("c7_deepslate", () -> new BlockItem(DEEPSLATE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_8_ITEM = ITEMS.register("c8_deepslate", () -> new BlockItem(DEEPSLATE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> DEEPSLATE_9_ITEM = ITEMS.register("c9_deepslate", () -> new BlockItem(DEEPSLATE_9.get(), PROPERTIES));
    // Cobbled Deepslate
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_0_ITEM = ITEMS.register("c0_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_0.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_1_ITEM = ITEMS.register("c1_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_1.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_2_ITEM = ITEMS.register("c2_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_2.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_3_ITEM = ITEMS.register("c3_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_3.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_4_ITEM = ITEMS.register("c4_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_4.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_5_ITEM = ITEMS.register("c5_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_5.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_6_ITEM = ITEMS.register("c6_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_6.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_7_ITEM = ITEMS.register("c7_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_7.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_8_ITEM = ITEMS.register("c8_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_8.get(), PROPERTIES));
    public static final RegistryObject<Item> COBBLED_DEEPSLATE_9_ITEM = ITEMS.register("c9_cobbled_deepslate", () -> new BlockItem(COBBLED_DEEPSLATE_9.get(), PROPERTIES));
    // Tuff
    public static final RegistryObject<Item> TUFF_0_ITEM = ITEMS.register("c0_tuff", () -> new BlockItem(TUFF_0.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_1_ITEM = ITEMS.register("c1_tuff", () -> new BlockItem(TUFF_1.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_2_ITEM = ITEMS.register("c2_tuff", () -> new BlockItem(TUFF_2.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_3_ITEM = ITEMS.register("c3_tuff", () -> new BlockItem(TUFF_3.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_4_ITEM = ITEMS.register("c4_tuff", () -> new BlockItem(TUFF_4.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_5_ITEM = ITEMS.register("c5_tuff", () -> new BlockItem(TUFF_5.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_6_ITEM = ITEMS.register("c6_tuff", () -> new BlockItem(TUFF_6.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_7_ITEM = ITEMS.register("c7_tuff", () -> new BlockItem(TUFF_7.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_8_ITEM = ITEMS.register("c8_tuff", () -> new BlockItem(TUFF_8.get(), PROPERTIES));
    public static final RegistryObject<Item> TUFF_9_ITEM = ITEMS.register("c9_tuff", () -> new BlockItem(TUFF_9.get(), PROPERTIES));
    // Basalt
    public static final RegistryObject<Item> BASALT_0_ITEM = ITEMS.register("c0_basalt", () -> new BlockItem(BASALT_0.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_1_ITEM = ITEMS.register("c1_basalt", () -> new BlockItem(BASALT_1.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_2_ITEM = ITEMS.register("c2_basalt", () -> new BlockItem(BASALT_2.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_3_ITEM = ITEMS.register("c3_basalt", () -> new BlockItem(BASALT_3.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_4_ITEM = ITEMS.register("c4_basalt", () -> new BlockItem(BASALT_4.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_5_ITEM = ITEMS.register("c5_basalt", () -> new BlockItem(BASALT_5.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_6_ITEM = ITEMS.register("c6_basalt", () -> new BlockItem(BASALT_6.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_7_ITEM = ITEMS.register("c7_basalt", () -> new BlockItem(BASALT_7.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_8_ITEM = ITEMS.register("c8_basalt", () -> new BlockItem(BASALT_8.get(), PROPERTIES));
    public static final RegistryObject<Item> BASALT_9_ITEM = ITEMS.register("c9_basalt", () -> new BlockItem(BASALT_9.get(), PROPERTIES));
    // Obsidian
    public static final RegistryObject<Item> OBSIDIAN_0_ITEM = ITEMS.register("c0_obsidian", () -> new BlockItem(OBSIDIAN_0.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_1_ITEM = ITEMS.register("c1_obsidian", () -> new BlockItem(OBSIDIAN_1.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_2_ITEM = ITEMS.register("c2_obsidian", () -> new BlockItem(OBSIDIAN_2.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_3_ITEM = ITEMS.register("c3_obsidian", () -> new BlockItem(OBSIDIAN_3.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_4_ITEM = ITEMS.register("c4_obsidian", () -> new BlockItem(OBSIDIAN_4.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_5_ITEM = ITEMS.register("c5_obsidian", () -> new BlockItem(OBSIDIAN_5.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_6_ITEM = ITEMS.register("c6_obsidian", () -> new BlockItem(OBSIDIAN_6.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_7_ITEM = ITEMS.register("c7_obsidian", () -> new BlockItem(OBSIDIAN_7.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_8_ITEM = ITEMS.register("c8_obsidian", () -> new BlockItem(OBSIDIAN_8.get(), PROPERTIES));
    public static final RegistryObject<Item> OBSIDIAN_9_ITEM = ITEMS.register("c9_obsidian", () -> new BlockItem(OBSIDIAN_9.get(), PROPERTIES));
    // RAW_IRON_BLOCK
    public static final RegistryObject<Item> RAW_IRON_BLOCK_0_ITEM = ITEMS.register("c0_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_1_ITEM = ITEMS.register("c1_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_2_ITEM = ITEMS.register("c2_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_3_ITEM = ITEMS.register("c3_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_4_ITEM = ITEMS.register("c4_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_5_ITEM = ITEMS.register("c5_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_6_ITEM = ITEMS.register("c6_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_7_ITEM = ITEMS.register("c7_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_8_ITEM = ITEMS.register("c8_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_IRON_BLOCK_9_ITEM = ITEMS.register("c9_RAW_IRON_BLOCK".toLowerCase(), () -> new BlockItem(RAW_IRON_BLOCK_9.get(), PROPERTIES));
    // RAW_COPPER_BLOCK
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_0_ITEM = ITEMS.register("c0_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_1_ITEM = ITEMS.register("c1_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_2_ITEM = ITEMS.register("c2_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_3_ITEM = ITEMS.register("c3_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_4_ITEM = ITEMS.register("c4_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_5_ITEM = ITEMS.register("c5_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_6_ITEM = ITEMS.register("c6_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_7_ITEM = ITEMS.register("c7_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_8_ITEM = ITEMS.register("c8_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_COPPER_BLOCK_9_ITEM = ITEMS.register("c9_RAW_COPPER_BLOCK".toLowerCase(), () -> new BlockItem(RAW_COPPER_BLOCK_9.get(), PROPERTIES));
    // RAW_GOLD_BLOCK
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_0_ITEM = ITEMS.register("c0_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_0.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_1_ITEM = ITEMS.register("c1_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_1.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_2_ITEM = ITEMS.register("c2_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_2.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_3_ITEM = ITEMS.register("c3_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_3.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_4_ITEM = ITEMS.register("c4_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_4.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_5_ITEM = ITEMS.register("c5_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_5.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_6_ITEM = ITEMS.register("c6_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_6.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_7_ITEM = ITEMS.register("c7_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_7.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_8_ITEM = ITEMS.register("c8_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_8.get(), PROPERTIES));
    public static final RegistryObject<Item> RAW_GOLD_BLOCK_9_ITEM = ITEMS.register("c9_RAW_GOLD_BLOCK".toLowerCase(), () -> new BlockItem(RAW_GOLD_BLOCK_9.get(), PROPERTIES));
    // MUD
    public static final RegistryObject<Item> MUD_0_ITEM = ITEMS.register("c0_MUD".toLowerCase(), () -> new BlockItem(MUD_0.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_1_ITEM = ITEMS.register("c1_MUD".toLowerCase(), () -> new BlockItem(MUD_1.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_2_ITEM = ITEMS.register("c2_MUD".toLowerCase(), () -> new BlockItem(MUD_2.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_3_ITEM = ITEMS.register("c3_MUD".toLowerCase(), () -> new BlockItem(MUD_3.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_4_ITEM = ITEMS.register("c4_MUD".toLowerCase(), () -> new BlockItem(MUD_4.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_5_ITEM = ITEMS.register("c5_MUD".toLowerCase(), () -> new BlockItem(MUD_5.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_6_ITEM = ITEMS.register("c6_MUD".toLowerCase(), () -> new BlockItem(MUD_6.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_7_ITEM = ITEMS.register("c7_MUD".toLowerCase(), () -> new BlockItem(MUD_7.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_8_ITEM = ITEMS.register("c8_MUD".toLowerCase(), () -> new BlockItem(MUD_8.get(), PROPERTIES));
    public static final RegistryObject<Item> MUD_9_ITEM = ITEMS.register("c9_MUD".toLowerCase(), () -> new BlockItem(MUD_9.get(), PROPERTIES));
    // OAK_LOG
    public static final RegistryObject<Item> OAK_LOG_0_ITEM = ITEMS.register("c0_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_1_ITEM = ITEMS.register("c1_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_2_ITEM = ITEMS.register("c2_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_3_ITEM = ITEMS.register("c3_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_4_ITEM = ITEMS.register("c4_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_5_ITEM = ITEMS.register("c5_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_6_ITEM = ITEMS.register("c6_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_7_ITEM = ITEMS.register("c7_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_8_ITEM = ITEMS.register("c8_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_LOG_9_ITEM = ITEMS.register("c9_OAK_LOG".toLowerCase(), () -> new BlockItem(OAK_LOG_9.get(), PROPERTIES));
    // SPRUCE_LOG
    public static final RegistryObject<Item> SPRUCE_LOG_0_ITEM = ITEMS.register("c0_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_1_ITEM = ITEMS.register("c1_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_2_ITEM = ITEMS.register("c2_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_3_ITEM = ITEMS.register("c3_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_4_ITEM = ITEMS.register("c4_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_5_ITEM = ITEMS.register("c5_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_6_ITEM = ITEMS.register("c6_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_7_ITEM = ITEMS.register("c7_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_8_ITEM = ITEMS.register("c8_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_LOG_9_ITEM = ITEMS.register("c9_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(SPRUCE_LOG_9.get(), PROPERTIES));
    // BIRCH_LOG
    public static final RegistryObject<Item> BIRCH_LOG_0_ITEM = ITEMS.register("c0_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_1_ITEM = ITEMS.register("c1_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_2_ITEM = ITEMS.register("c2_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_3_ITEM = ITEMS.register("c3_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_4_ITEM = ITEMS.register("c4_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_5_ITEM = ITEMS.register("c5_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_6_ITEM = ITEMS.register("c6_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_7_ITEM = ITEMS.register("c7_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_8_ITEM = ITEMS.register("c8_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_LOG_9_ITEM = ITEMS.register("c9_BIRCH_LOG".toLowerCase(), () -> new BlockItem(BIRCH_LOG_9.get(), PROPERTIES));
    // JUNGLE_LOG
    public static final RegistryObject<Item> JUNGLE_LOG_0_ITEM = ITEMS.register("c0_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_1_ITEM = ITEMS.register("c1_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_2_ITEM = ITEMS.register("c2_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_3_ITEM = ITEMS.register("c3_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_4_ITEM = ITEMS.register("c4_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_5_ITEM = ITEMS.register("c5_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_6_ITEM = ITEMS.register("c6_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_7_ITEM = ITEMS.register("c7_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_8_ITEM = ITEMS.register("c8_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_LOG_9_ITEM = ITEMS.register("c9_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(JUNGLE_LOG_9.get(), PROPERTIES));
    // ACACIA_LOG
    public static final RegistryObject<Item> ACACIA_LOG_0_ITEM = ITEMS.register("c0_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_1_ITEM = ITEMS.register("c1_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_2_ITEM = ITEMS.register("c2_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_3_ITEM = ITEMS.register("c3_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_4_ITEM = ITEMS.register("c4_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_5_ITEM = ITEMS.register("c5_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_6_ITEM = ITEMS.register("c6_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_7_ITEM = ITEMS.register("c7_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_8_ITEM = ITEMS.register("c8_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_LOG_9_ITEM = ITEMS.register("c9_ACACIA_LOG".toLowerCase(), () -> new BlockItem(ACACIA_LOG_9.get(), PROPERTIES));
    // DARK_OAK_LOG
    public static final RegistryObject<Item> DARK_OAK_LOG_0_ITEM = ITEMS.register("c0_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_1_ITEM = ITEMS.register("c1_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_2_ITEM = ITEMS.register("c2_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_3_ITEM = ITEMS.register("c3_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_4_ITEM = ITEMS.register("c4_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_5_ITEM = ITEMS.register("c5_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_6_ITEM = ITEMS.register("c6_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_7_ITEM = ITEMS.register("c7_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_8_ITEM = ITEMS.register("c8_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_LOG_9_ITEM = ITEMS.register("c9_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(DARK_OAK_LOG_9.get(), PROPERTIES));
    // MANGROVE_LOG
    public static final RegistryObject<Item> MANGROVE_LOG_0_ITEM = ITEMS.register("c0_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_1_ITEM = ITEMS.register("c1_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_2_ITEM = ITEMS.register("c2_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_3_ITEM = ITEMS.register("c3_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_4_ITEM = ITEMS.register("c4_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_5_ITEM = ITEMS.register("c5_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_6_ITEM = ITEMS.register("c6_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_7_ITEM = ITEMS.register("c7_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_8_ITEM = ITEMS.register("c8_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_LOG_9_ITEM = ITEMS.register("c9_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(MANGROVE_LOG_9.get(), PROPERTIES));
    // STRIPPED_OAK_LOG
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_OAK_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_OAK_LOG_9.get(), PROPERTIES));
    // STRIPPED_SPRUCE_LOG
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_SPRUCE_LOG_9.get(), PROPERTIES));
    // STRIPPED_BIRCH_LOG
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_BIRCH_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_BIRCH_LOG_9.get(), PROPERTIES));
    // STRIPPED_JUNGLE_LOG
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_JUNGLE_LOG_9.get(), PROPERTIES));
    // STRIPPED_ACACIA_LOG
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_ACACIA_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_ACACIA_LOG_9.get(), PROPERTIES));
    // STRIPPED_DARK_OAK_LOG
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_DARK_OAK_LOG_9.get(), PROPERTIES));
    // STRIPPED_MANGROVE_LOG
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_0_ITEM = ITEMS.register("c0_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_0.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_1_ITEM = ITEMS.register("c1_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_1.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_2_ITEM = ITEMS.register("c2_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_2.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_3_ITEM = ITEMS.register("c3_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_3.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_4_ITEM = ITEMS.register("c4_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_4.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_5_ITEM = ITEMS.register("c5_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_5.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_6_ITEM = ITEMS.register("c6_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_6.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_7_ITEM = ITEMS.register("c7_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_7.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_8_ITEM = ITEMS.register("c8_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_8.get(), PROPERTIES));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_LOG_9_ITEM = ITEMS.register("c9_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new BlockItem(STRIPPED_MANGROVE_LOG_9.get(), PROPERTIES));
    // OAK_PLANKS
    public static final RegistryObject<Item> OAK_PLANKS_0_ITEM = ITEMS.register("c0_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_1_ITEM = ITEMS.register("c1_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_2_ITEM = ITEMS.register("c2_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_3_ITEM = ITEMS.register("c3_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_4_ITEM = ITEMS.register("c4_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_5_ITEM = ITEMS.register("c5_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_6_ITEM = ITEMS.register("c6_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_7_ITEM = ITEMS.register("c7_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_8_ITEM = ITEMS.register("c8_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> OAK_PLANKS_9_ITEM = ITEMS.register("c9_" + "OAK_PLANKS".toLowerCase(), () -> new BlockItem(OAK_PLANKS_9.get(), PROPERTIES));
    // SPRUCE_PLANKS
    public static final RegistryObject<Item> SPRUCE_PLANKS_0_ITEM = ITEMS.register("c0_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_1_ITEM = ITEMS.register("c1_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_2_ITEM = ITEMS.register("c2_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_3_ITEM = ITEMS.register("c3_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_4_ITEM = ITEMS.register("c4_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_5_ITEM = ITEMS.register("c5_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_6_ITEM = ITEMS.register("c6_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_7_ITEM = ITEMS.register("c7_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_8_ITEM = ITEMS.register("c8_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> SPRUCE_PLANKS_9_ITEM = ITEMS.register("c9_" + "SPRUCE_PLANKS".toLowerCase(), () -> new BlockItem(SPRUCE_PLANKS_9.get(), PROPERTIES));
    // BIRCH_PLANKS
    public static final RegistryObject<Item> BIRCH_PLANKS_0_ITEM = ITEMS.register("c0_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_1_ITEM = ITEMS.register("c1_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_2_ITEM = ITEMS.register("c2_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_3_ITEM = ITEMS.register("c3_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_4_ITEM = ITEMS.register("c4_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_5_ITEM = ITEMS.register("c5_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_6_ITEM = ITEMS.register("c6_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_7_ITEM = ITEMS.register("c7_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_8_ITEM = ITEMS.register("c8_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> BIRCH_PLANKS_9_ITEM = ITEMS.register("c9_" + "BIRCH_PLANKS".toLowerCase(), () -> new BlockItem(BIRCH_PLANKS_9.get(), PROPERTIES));
    // JUNGLE_PLANKS
    public static final RegistryObject<Item> JUNGLE_PLANKS_0_ITEM = ITEMS.register("c0_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_1_ITEM = ITEMS.register("c1_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_2_ITEM = ITEMS.register("c2_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_3_ITEM = ITEMS.register("c3_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_4_ITEM = ITEMS.register("c4_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_5_ITEM = ITEMS.register("c5_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_6_ITEM = ITEMS.register("c6_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_7_ITEM = ITEMS.register("c7_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_8_ITEM = ITEMS.register("c8_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> JUNGLE_PLANKS_9_ITEM = ITEMS.register("c9_" + "JUNGLE_PLANKS".toLowerCase(), () -> new BlockItem(JUNGLE_PLANKS_9.get(), PROPERTIES));
    // ACACIA_PLANKS
    public static final RegistryObject<Item> ACACIA_PLANKS_0_ITEM = ITEMS.register("c0_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_1_ITEM = ITEMS.register("c1_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_2_ITEM = ITEMS.register("c2_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_3_ITEM = ITEMS.register("c3_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_4_ITEM = ITEMS.register("c4_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_5_ITEM = ITEMS.register("c5_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_6_ITEM = ITEMS.register("c6_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_7_ITEM = ITEMS.register("c7_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_8_ITEM = ITEMS.register("c8_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> ACACIA_PLANKS_9_ITEM = ITEMS.register("c9_" + "ACACIA_PLANKS".toLowerCase(), () -> new BlockItem(ACACIA_PLANKS_9.get(), PROPERTIES));
    // DARK_OAK_PLANKS
    public static final RegistryObject<Item> DARK_OAK_PLANKS_0_ITEM = ITEMS.register("c0_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_1_ITEM = ITEMS.register("c1_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_2_ITEM = ITEMS.register("c2_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_3_ITEM = ITEMS.register("c3_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_4_ITEM = ITEMS.register("c4_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_5_ITEM = ITEMS.register("c5_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_6_ITEM = ITEMS.register("c6_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_7_ITEM = ITEMS.register("c7_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_8_ITEM = ITEMS.register("c8_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> DARK_OAK_PLANKS_9_ITEM = ITEMS.register("c9_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new BlockItem(DARK_OAK_PLANKS_9.get(), PROPERTIES));
    // MANGROVE_PLANKS
    public static final RegistryObject<Item> MANGROVE_PLANKS_0_ITEM = ITEMS.register("c0_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_0.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_1_ITEM = ITEMS.register("c1_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_1.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_2_ITEM = ITEMS.register("c2_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_2.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_3_ITEM = ITEMS.register("c3_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_3.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_4_ITEM = ITEMS.register("c4_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_4.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_5_ITEM = ITEMS.register("c5_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_5.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_6_ITEM = ITEMS.register("c6_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_6.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_7_ITEM = ITEMS.register("c7_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_7.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_8_ITEM = ITEMS.register("c8_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_8.get(), PROPERTIES));
    public static final RegistryObject<Item> MANGROVE_PLANKS_9_ITEM = ITEMS.register("c9_" + "MANGROVE_PLANKS".toLowerCase(), () -> new BlockItem(MANGROVE_PLANKS_9.get(), PROPERTIES));
    //end
}