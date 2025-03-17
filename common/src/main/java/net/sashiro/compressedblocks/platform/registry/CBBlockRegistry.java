package net.sashiro.compressedblocks.platform.registry;

import net.sashiro.compressedblocks.platform.Services;

import static net.sashiro.compressedblocks.block.BlockList.*;

public class CBBlockRegistry {
    public static void registerBlocks() {
        if (Services.PLATFORM.areBlocksEnabled()) {
            Services.PLATFORM.registerBlock("DIRT", DIRT);
            Services.PLATFORM.registerBlock("GRAVEL", GRAVEL);
            Services.PLATFORM.registerBlock("COBBLESTONE", COBBLESTONE);
            Services.PLATFORM.registerBlock("STONE", STONE);
            Services.PLATFORM.registerBlock("GRANITE", GRANITE);
            Services.PLATFORM.registerBlock("DIORITE", DIORITE);
            Services.PLATFORM.registerBlock("ANDESITE", ANDESITE);
            Services.PLATFORM.registerBlock("CRIMSON_NYLIUM", CRIMSON_NYLIUM);
            Services.PLATFORM.registerBlock("WARPED_NYLIUM", WARPED_NYLIUM);
            Services.PLATFORM.registerBlock("CLAY", CLAY);
            Services.PLATFORM.registerBlock("SAND", SAND);
            Services.PLATFORM.registerBlock("RED_SAND", RED_SAND);
            Services.PLATFORM.registerBlock("SANDSTONE", SANDSTONE);
            Services.PLATFORM.registerBlock("RED_SANDSTONE", RED_SANDSTONE);
            Services.PLATFORM.registerBlock("COAL_ORE", COAL_ORE);
            Services.PLATFORM.registerBlock("COPPER_ORE", COPPER_ORE);
            Services.PLATFORM.registerBlock("IRON_ORE", IRON_ORE);
            Services.PLATFORM.registerBlock("GOLD_ORE", GOLD_ORE);
            Services.PLATFORM.registerBlock("REDSTONE_ORE", REDSTONE_ORE);
            Services.PLATFORM.registerBlock("EMERALD_ORE", EMERALD_ORE);
            Services.PLATFORM.registerBlock("LAPIS_ORE", LAPIS_ORE);
            Services.PLATFORM.registerBlock("DIAMOND_ORE", DIAMOND_ORE);
            Services.PLATFORM.registerBlock("NETHER_GOLD_ORE", NETHER_GOLD_ORE);
            Services.PLATFORM.registerBlock("NETHER_QUARTZ_ORE", NETHER_QUARTZ_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_COAL_ORE", DEEPSLATE_COAL_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_COPPER_ORE", DEEPSLATE_COPPER_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_IRON_ORE", DEEPSLATE_IRON_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_GOLD_ORE", DEEPSLATE_GOLD_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_REDSTONE_ORE", DEEPSLATE_REDSTONE_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_EMERALD_ORE", DEEPSLATE_EMERALD_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_LAPIS_ORE", DEEPSLATE_LAPIS_ORE);
            Services.PLATFORM.registerBlock("DEEPSLATE_DIAMOND_ORE", DEEPSLATE_DIAMOND_ORE);
            Services.PLATFORM.registerBlock("RAW_IRON_BLOCK", RAW_IRON_BLOCK);
            Services.PLATFORM.registerBlock("RAW_COPPER_BLOCK", RAW_COPPER_BLOCK);
            Services.PLATFORM.registerBlock("RAW_GOLD_BLOCK", RAW_GOLD_BLOCK);
            Services.PLATFORM.registerBlock("IRON_BLOCK", IRON_BLOCK);
            Services.PLATFORM.registerBlock("GOLD_BLOCK", GOLD_BLOCK);
            Services.PLATFORM.registerBlock("REDSTONE_BLOCK", REDSTONE_BLOCK);
            Services.PLATFORM.registerBlock("EMERALD_BLOCK", EMERALD_BLOCK);
            Services.PLATFORM.registerBlock("LAPIS_BLOCK", LAPIS_BLOCK);
            Services.PLATFORM.registerBlock("DIAMOND_BLOCK", DIAMOND_BLOCK);
            Services.PLATFORM.registerBlock("NETHERITE_BLOCK", NETHERITE_BLOCK);
            Services.PLATFORM.registerBlock("COAL_BLOCK", COAL_BLOCK);
            Services.PLATFORM.registerBlock("SLIME_BLOCK", SLIME_BLOCK);
            Services.PLATFORM.registerBlock("HONEY_BLOCK", HONEY_BLOCK);
            Services.PLATFORM.registerBlock("BRICKS", BRICKS);
            Services.PLATFORM.registerBlock("STONE_BRICKS", STONE_BRICKS);
            Services.PLATFORM.registerBlock("NETHERRACK", NETHERRACK);
            Services.PLATFORM.registerBlock("NETHER_BRICKS", NETHER_BRICKS);
            Services.PLATFORM.registerBlock("RED_NETHER_BRICKS", RED_NETHER_BRICKS);
            Services.PLATFORM.registerBlock("NETHER_WART_BLOCK", NETHER_WART_BLOCK);
            Services.PLATFORM.registerBlock("SOUL_SAND", SOUL_SAND);
            Services.PLATFORM.registerBlock("SOUL_SOIL", SOUL_SOIL);
            Services.PLATFORM.registerBlock("END_STONE", END_STONE);
            Services.PLATFORM.registerBlock("END_STONE_BRICKS", END_STONE_BRICKS);
            Services.PLATFORM.registerBlock("BLACKSTONE", BLACKSTONE);
            Services.PLATFORM.registerBlock("DEEPSLATE", DEEPSLATE);
            Services.PLATFORM.registerBlock("COBBLED_DEEPSLATE", COBBLED_DEEPSLATE);
            Services.PLATFORM.registerBlock("TUFF", TUFF);
            Services.PLATFORM.registerBlock("BASALT", BASALT);
            Services.PLATFORM.registerBlock("OBSIDIAN", OBSIDIAN);
            Services.PLATFORM.registerBlock("MUD", MUD);
            Services.PLATFORM.registerBlock("OAK_LOG", OAK_LOG);
            Services.PLATFORM.registerBlock("SPRUCE_LOG", SPRUCE_LOG);
            Services.PLATFORM.registerBlock("BIRCH_LOG", BIRCH_LOG);
            Services.PLATFORM.registerBlock("JUNGLE_LOG", JUNGLE_LOG);
            Services.PLATFORM.registerBlock("ACACIA_LOG", ACACIA_LOG);
            Services.PLATFORM.registerBlock("DARK_OAK_LOG", DARK_OAK_LOG);
            Services.PLATFORM.registerBlock("MANGROVE_LOG", MANGROVE_LOG);
            Services.PLATFORM.registerBlock("CHERRY_LOG", CHERRY_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_OAK_LOG", STRIPPED_OAK_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_SPRUCE_LOG", STRIPPED_SPRUCE_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_BIRCH_LOG", STRIPPED_BIRCH_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_JUNGLE_LOG", STRIPPED_JUNGLE_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_ACACIA_LOG", STRIPPED_ACACIA_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_DARK_OAK_LOG", STRIPPED_DARK_OAK_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_MANGROVE_LOG", STRIPPED_MANGROVE_LOG);
            Services.PLATFORM.registerBlock("STRIPPED_CHERRY_LOG", STRIPPED_CHERRY_LOG);
            Services.PLATFORM.registerBlock("OAK_PLANKS", OAK_PLANKS);
            Services.PLATFORM.registerBlock("SPRUCE_PLANKS", SPRUCE_PLANKS);
            Services.PLATFORM.registerBlock("BIRCH_PLANKS", BIRCH_PLANKS);
            Services.PLATFORM.registerBlock("JUNGLE_PLANKS", JUNGLE_PLANKS);
            Services.PLATFORM.registerBlock("ACACIA_PLANKS", ACACIA_PLANKS);
            Services.PLATFORM.registerBlock("DARK_OAK_PLANKS", DARK_OAK_PLANKS);
            Services.PLATFORM.registerBlock("MANGROVE_PLANKS", MANGROVE_PLANKS);
            Services.PLATFORM.registerBlock("CHERRY_PLANKS", CHERRY_PLANKS);
            Services.PLATFORM.registerBlock("BAMBOO_PLANKS", BAMBOO_PLANKS);
            Services.PLATFORM.registerBlock("BAMBOO_MOSAIC", BAMBOO_MOSAIC);
            Services.PLATFORM.registerBlock("COPPER_BLOCK", COPPER_BLOCK);
            Services.PLATFORM.registerBlock("CUT_COPPER", CUT_COPPER);
            Services.PLATFORM.registerBlock("EXPOSED_COPPER", EXPOSED_COPPER);
            Services.PLATFORM.registerBlock("EXPOSED_CUT_COPPER", EXPOSED_CUT_COPPER);
            Services.PLATFORM.registerBlock("WEATHERED_COPPER", WEATHERED_COPPER);
            Services.PLATFORM.registerBlock("WEATHERED_CUT_COPPER", WEATHERED_CUT_COPPER);
            Services.PLATFORM.registerBlock("OXIDIZED_COPPER", OXIDIZED_COPPER);
            Services.PLATFORM.registerBlock("OXIDIZED_CUT_COPPER", OXIDIZED_CUT_COPPER);
            Services.PLATFORM.registerBlock("WAXED_COPPER_BLOCK", WAXED_COPPER_BLOCK);
            Services.PLATFORM.registerBlock("WAXED_CUT_COPPER", WAXED_CUT_COPPER);
            Services.PLATFORM.registerBlock("WAXED_EXPOSED_COPPER", WAXED_EXPOSED_COPPER);
            Services.PLATFORM.registerBlock("WAXED_EXPOSED_CUT_COPPER", WAXED_EXPOSED_CUT_COPPER);
            Services.PLATFORM.registerBlock("WAXED_WEATHERED_COPPER", WAXED_WEATHERED_COPPER);
            Services.PLATFORM.registerBlock("WAXED_WEATHERED_CUT_COPPER", WAXED_WEATHERED_CUT_COPPER);
            Services.PLATFORM.registerBlock("WAXED_OXIDIZED_COPPER", WAXED_OXIDIZED_COPPER);
            Services.PLATFORM.registerBlock("WAXED_OXIDIZED_CUT_COPPER", WAXED_OXIDIZED_CUT_COPPER);
            Services.PLATFORM.registerBlock("BONE_BLOCK", BONE_BLOCK);
            Services.PLATFORM.registerBlock("SCULK", SCULK);
            Services.PLATFORM.registerBlock("SMOOTH_SANDSTONE", SMOOTH_SANDSTONE);
            Services.PLATFORM.registerBlock("CUT_SANDSTONE", CUT_SANDSTONE);
            Services.PLATFORM.registerBlock("CHISELED_SANDSTONE", CHISELED_SANDSTONE);
            Services.PLATFORM.registerBlock("SMOOTH_RED_SANDSTONE", SMOOTH_RED_SANDSTONE);
            Services.PLATFORM.registerBlock("CUT_RED_SANDSTONE", CUT_RED_SANDSTONE);
            Services.PLATFORM.registerBlock("CHISELED_RED_SANDSTONE", CHISELED_RED_SANDSTONE);
            Services.PLATFORM.registerBlock("CRIMSON_STEM", CRIMSON_STEM);
            Services.PLATFORM.registerBlock("WARPED_STEM", WARPED_STEM);
            Services.PLATFORM.registerBlock("TNT", TNT);
            Services.PLATFORM.registerBlock("BAMBOO_BLOCK", BAMBOO_BLOCK);
            Services.PLATFORM.registerBlock("STRIPPED_BAMBOO_BLOCK", STRIPPED_BAMBOO_BLOCK);
            Services.PLATFORM.registerBlock("STRIPPED_CRIMSON_STEM", STRIPPED_CRIMSON_STEM);
            Services.PLATFORM.registerBlock("CRIMSON_PLANKS", CRIMSON_PLANKS);
            Services.PLATFORM.registerBlock("STRIPPED_WARPED_STEM", STRIPPED_WARPED_STEM);
            Services.PLATFORM.registerBlock("WARPED_PLANKS", WARPED_PLANKS);
            Services.PLATFORM.registerBlock("MOSSY_COBBLESTONE", MOSSY_COBBLESTONE);
            Services.PLATFORM.registerBlock("MOSSY_STONE_BRICKS", MOSSY_STONE_BRICKS);
            Services.PLATFORM.registerBlock("CRACKED_STONE_BRICKS", CRACKED_STONE_BRICKS);
            Services.PLATFORM.registerBlock("CHISELED_STONE_BRICKS", CHISELED_STONE_BRICKS);
            Services.PLATFORM.registerBlock("POLISHED_GRANITE", POLISHED_GRANITE);
            Services.PLATFORM.registerBlock("POLISHED_DIORITE", POLISHED_DIORITE);
            Services.PLATFORM.registerBlock("POLISHED_ANDESITE", POLISHED_ANDESITE);
            Services.PLATFORM.registerBlock("CHISELED_DEEPSLATE", CHISELED_DEEPSLATE);
            Services.PLATFORM.registerBlock("POLISHED_DEEPSLATE", POLISHED_DEEPSLATE);
            Services.PLATFORM.registerBlock("DEEPSLATE_BRICKS", DEEPSLATE_BRICKS);
            Services.PLATFORM.registerBlock("CRACKED_DEEPSLATE_BRICKS", CRACKED_DEEPSLATE_BRICKS);
            Services.PLATFORM.registerBlock("DEEPSLATE_TILES", DEEPSLATE_TILES);
            Services.PLATFORM.registerBlock("CRACKED_DEEPSLATE_TILES", CRACKED_DEEPSLATE_TILES);
            Services.PLATFORM.registerBlock("PACKED_MUD", PACKED_MUD);
            Services.PLATFORM.registerBlock("MUD_BRICKS", MUD_BRICKS);
            Services.PLATFORM.registerBlock("PRISMARINE", PRISMARINE);
            Services.PLATFORM.registerBlock("PRISMARINE_BRICKS", PRISMARINE_BRICKS);
            Services.PLATFORM.registerBlock("DARK_PRISMARINE", DARK_PRISMARINE);
            Services.PLATFORM.registerBlock("QUARTZ_BLOCK", QUARTZ_BLOCK);
            Services.PLATFORM.registerBlock("CHISELED_QUARTZ_BLOCK", CHISELED_QUARTZ_BLOCK);
            Services.PLATFORM.registerBlock("QUARTZ_BRICKS", QUARTZ_BRICKS);
            Services.PLATFORM.registerBlock("QUARTZ_PILLAR", QUARTZ_PILLAR);
            Services.PLATFORM.registerBlock("SMOOTH_QUARTZ_BLOCK", SMOOTH_QUARTZ_BLOCK);
            Services.PLATFORM.registerBlock("AMETHYST_BLOCK", AMETHYST_BLOCK);
            Services.PLATFORM.registerBlock("WHITE_WOOL", WHITE_WOOL);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_WOOL", LIGHT_GRAY_WOOL);
            Services.PLATFORM.registerBlock("GRAY_WOOL", GRAY_WOOL);
            Services.PLATFORM.registerBlock("BLACK_WOOL", BLACK_WOOL);
            Services.PLATFORM.registerBlock("BROWN_WOOL", BROWN_WOOL);
            Services.PLATFORM.registerBlock("RED_WOOL", RED_WOOL);
            Services.PLATFORM.registerBlock("ORANGE_WOOL", ORANGE_WOOL);
            Services.PLATFORM.registerBlock("YELLOW_WOOL", YELLOW_WOOL);
            Services.PLATFORM.registerBlock("LIME_WOOL", LIME_WOOL);
            Services.PLATFORM.registerBlock("GREEN_WOOL", GREEN_WOOL);
            Services.PLATFORM.registerBlock("CYAN_WOOL", CYAN_WOOL);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_WOOL", LIGHT_BLUE_WOOL);
            Services.PLATFORM.registerBlock("BLUE_WOOL", BLUE_WOOL);
            Services.PLATFORM.registerBlock("PURPLE_WOOL", PURPLE_WOOL);
            Services.PLATFORM.registerBlock("MAGENTA_WOOL", MAGENTA_WOOL);
            Services.PLATFORM.registerBlock("PINK_WOOL", PINK_WOOL);
            Services.PLATFORM.registerBlock("TERRACOTTA", TERRACOTTA);
            Services.PLATFORM.registerBlock("WHITE_TERRACOTTA", WHITE_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_TERRACOTTA", LIGHT_GRAY_TERRACOTTA);
            Services.PLATFORM.registerBlock("GRAY_TERRACOTTA", GRAY_TERRACOTTA);
            Services.PLATFORM.registerBlock("BLACK_TERRACOTTA", BLACK_TERRACOTTA);
            Services.PLATFORM.registerBlock("BROWN_TERRACOTTA", BROWN_TERRACOTTA);
            Services.PLATFORM.registerBlock("RED_TERRACOTTA", RED_TERRACOTTA);
            Services.PLATFORM.registerBlock("ORANGE_TERRACOTTA", ORANGE_TERRACOTTA);
            Services.PLATFORM.registerBlock("YELLOW_TERRACOTTA", YELLOW_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIME_TERRACOTTA", LIME_TERRACOTTA);
            Services.PLATFORM.registerBlock("GREEN_TERRACOTTA", GREEN_TERRACOTTA);
            Services.PLATFORM.registerBlock("CYAN_TERRACOTTA", CYAN_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_TERRACOTTA", LIGHT_BLUE_TERRACOTTA);
            Services.PLATFORM.registerBlock("BLUE_TERRACOTTA", BLUE_TERRACOTTA);
            Services.PLATFORM.registerBlock("PURPLE_TERRACOTTA", PURPLE_TERRACOTTA);
            Services.PLATFORM.registerBlock("MAGENTA_TERRACOTTA", MAGENTA_TERRACOTTA);
            Services.PLATFORM.registerBlock("PINK_TERRACOTTA", PINK_TERRACOTTA);
            Services.PLATFORM.registerBlock("WHITE_GLAZED_TERRACOTTA", WHITE_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_GLAZED_TERRACOTTA", LIGHT_GRAY_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("GRAY_GLAZED_TERRACOTTA", GRAY_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("BLACK_GLAZED_TERRACOTTA", BLACK_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("BROWN_GLAZED_TERRACOTTA", BROWN_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("RED_GLAZED_TERRACOTTA", RED_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("ORANGE_GLAZED_TERRACOTTA", ORANGE_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("YELLOW_GLAZED_TERRACOTTA", YELLOW_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIME_GLAZED_TERRACOTTA", LIME_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("GREEN_GLAZED_TERRACOTTA", GREEN_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("CYAN_GLAZED_TERRACOTTA", CYAN_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_GLAZED_TERRACOTTA", LIGHT_BLUE_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("BLUE_GLAZED_TERRACOTTA", BLUE_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("PURPLE_GLAZED_TERRACOTTA", PURPLE_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("MAGENTA_GLAZED_TERRACOTTA", MAGENTA_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("PINK_GLAZED_TERRACOTTA", PINK_GLAZED_TERRACOTTA);
            Services.PLATFORM.registerBlock("WHITE_CONCRETE_POWDER", WHITE_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_CONCRETE_POWDER", LIGHT_GRAY_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("GRAY_CONCRETE_POWDER", GRAY_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("BLACK_CONCRETE_POWDER", BLACK_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("BROWN_CONCRETE_POWDER", BROWN_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("RED_CONCRETE_POWDER", RED_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("ORANGE_CONCRETE_POWDER", ORANGE_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("YELLOW_CONCRETE_POWDER", YELLOW_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("LIME_CONCRETE_POWDER", LIME_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("GREEN_CONCRETE_POWDER", GREEN_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("CYAN_CONCRETE_POWDER", CYAN_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_CONCRETE_POWDER", LIGHT_BLUE_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("BLUE_CONCRETE_POWDER", BLUE_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("PURPLE_CONCRETE_POWDER", PURPLE_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("MAGENTA_CONCRETE_POWDER", MAGENTA_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("PINK_CONCRETE_POWDER", PINK_CONCRETE_POWDER);
            Services.PLATFORM.registerBlock("WHITE_CONCRETE", WHITE_CONCRETE);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_CONCRETE", LIGHT_GRAY_CONCRETE);
            Services.PLATFORM.registerBlock("GRAY_CONCRETE", GRAY_CONCRETE);
            Services.PLATFORM.registerBlock("BLACK_CONCRETE", BLACK_CONCRETE);
            Services.PLATFORM.registerBlock("BROWN_CONCRETE", BROWN_CONCRETE);
            Services.PLATFORM.registerBlock("RED_CONCRETE", RED_CONCRETE);
            Services.PLATFORM.registerBlock("ORANGE_CONCRETE", ORANGE_CONCRETE);
            Services.PLATFORM.registerBlock("YELLOW_CONCRETE", YELLOW_CONCRETE);
            Services.PLATFORM.registerBlock("LIME_CONCRETE", LIME_CONCRETE);
            Services.PLATFORM.registerBlock("GREEN_CONCRETE", GREEN_CONCRETE);
            Services.PLATFORM.registerBlock("CYAN_CONCRETE", CYAN_CONCRETE);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_CONCRETE", LIGHT_BLUE_CONCRETE);
            Services.PLATFORM.registerBlock("BLUE_CONCRETE", BLUE_CONCRETE);
            Services.PLATFORM.registerBlock("PURPLE_CONCRETE", PURPLE_CONCRETE);
            Services.PLATFORM.registerBlock("MAGENTA_CONCRETE", MAGENTA_CONCRETE);
            Services.PLATFORM.registerBlock("PINK_CONCRETE", PINK_CONCRETE);
            Services.PLATFORM.registerBlock("GLASS", GLASS);
            Services.PLATFORM.registerBlock("TINTED_GLASS", TINTED_GLASS);
            Services.PLATFORM.registerBlock("WHITE_STAINED_GLASS", WHITE_STAINED_GLASS);
            Services.PLATFORM.registerBlock("LIGHT_GRAY_STAINED_GLASS", LIGHT_GRAY_STAINED_GLASS);
            Services.PLATFORM.registerBlock("GRAY_STAINED_GLASS", GRAY_STAINED_GLASS);
            Services.PLATFORM.registerBlock("BLACK_STAINED_GLASS", BLACK_STAINED_GLASS);
            Services.PLATFORM.registerBlock("BROWN_STAINED_GLASS", BROWN_STAINED_GLASS);
            Services.PLATFORM.registerBlock("RED_STAINED_GLASS", RED_STAINED_GLASS);
            Services.PLATFORM.registerBlock("ORANGE_STAINED_GLASS", ORANGE_STAINED_GLASS);
            Services.PLATFORM.registerBlock("YELLOW_STAINED_GLASS", YELLOW_STAINED_GLASS);
            Services.PLATFORM.registerBlock("LIME_STAINED_GLASS", LIME_STAINED_GLASS);
            Services.PLATFORM.registerBlock("GREEN_STAINED_GLASS", GREEN_STAINED_GLASS);
            Services.PLATFORM.registerBlock("CYAN_STAINED_GLASS", CYAN_STAINED_GLASS);
            Services.PLATFORM.registerBlock("LIGHT_BLUE_STAINED_GLASS", LIGHT_BLUE_STAINED_GLASS);
            Services.PLATFORM.registerBlock("BLUE_STAINED_GLASS", BLUE_STAINED_GLASS);
            Services.PLATFORM.registerBlock("PURPLE_STAINED_GLASS", PURPLE_STAINED_GLASS);
            Services.PLATFORM.registerBlock("MAGENTA_STAINED_GLASS", MAGENTA_STAINED_GLASS);
            Services.PLATFORM.registerBlock("PINK_STAINED_GLASS", PINK_STAINED_GLASS);
            Services.PLATFORM.registerBlock("ICE", ICE);
            Services.PLATFORM.registerBlock("PACKED_ICE", PACKED_ICE);
            Services.PLATFORM.registerBlock("BLUE_ICE", BLUE_ICE);
            Services.PLATFORM.registerBlock("SNOW_BLOCK", SNOW_BLOCK);
            Services.PLATFORM.registerBlock("MOSS_BLOCK", MOSS_BLOCK);
            Services.PLATFORM.registerBlock("CALCITE", CALCITE);
            Services.PLATFORM.registerBlock("DRIPSTONE_BLOCK", DRIPSTONE_BLOCK);
            Services.PLATFORM.registerBlock("MAGMA_BLOCK", MAGMA_BLOCK);
            Services.PLATFORM.registerBlock("GLOWSTONE", GLOWSTONE);
            Services.PLATFORM.registerBlock("DRIED_KELP_BLOCK", DRIED_KELP_BLOCK);
            Services.PLATFORM.registerBlock("BROWN_MUSHROOM_BLOCK", BROWN_MUSHROOM_BLOCK);
            Services.PLATFORM.registerBlock("RED_MUSHROOM_BLOCK", RED_MUSHROOM_BLOCK);
            Services.PLATFORM.registerBlock("SHROOMLIGHT", SHROOMLIGHT);
            Services.PLATFORM.registerBlock("MELON", MELON);
            Services.PLATFORM.registerBlock("PUMPKIN", PUMPKIN);
            Services.PLATFORM.registerBlock("HAY_BLOCK", HAY_BLOCK);
            Services.PLATFORM.registerBlock("OCHRE_FROGLIGHT", OCHRE_FROGLIGHT);
            Services.PLATFORM.registerBlock("VERDANT_FROGLIGHT", VERDANT_FROGLIGHT);
            Services.PLATFORM.registerBlock("PEARLESCENT_FROGLIGHT", PEARLESCENT_FROGLIGHT);
            Services.PLATFORM.registerBlock("SEA_LANTERN", SEA_LANTERN);
        }
    }
}
