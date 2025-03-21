package net.sashiro.compressedblocks.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.sashiro.compressedblocks.platform.Services;
import net.sashiro.compressedblocks.util.CommonUtils;

import static net.sashiro.compressedblocks.Constants.*;

public class BlockList {

    public static final CBBlock[] DIRT = createBlocks("DIRT", 0.925F);
    public static final CBBlock[] GRAVEL = createBlocks("GRAVEL", 0.925F);
    public static final CBBlock[] COBBLESTONE = createBlocks("COBBLESTONE");
    public static final CBBlock[] STONE = createBlocks("STONE");
    public static final CBBlock[] GRANITE = createBlocks("GRANITE");
    public static final CBBlock[] DIORITE = createBlocks("DIORITE");
    public static final CBBlock[] ANDESITE = createBlocks("ANDESITE");
    public static final CBBlock[] CRIMSON_NYLIUM = createBlocks("CRIMSON_NYLIUM");
    public static final CBBlock[] WARPED_NYLIUM = createBlocks("WARPED_NYLIUM");
    public static final CBBlock[] CLAY = createBlocks("CLAY", 0.925F);
    public static final CBBlock[] SAND = createBlocks("SAND", 0.925F);
    public static final CBBlock[] RED_SAND = createBlocks("RED_SAND", 0.925F);
    public static final CBBlock[] SANDSTONE = createBlocks("SANDSTONE");
    public static final CBBlock[] RED_SANDSTONE = createBlocks("RED_SANDSTONE");
    public static final CBBlock[] COAL_ORE = createBlocks("COAL_ORE");
    public static final CBBlock[] COPPER_ORE = createBlocks("COPPER_ORE");
    public static final CBBlock[] IRON_ORE = createBlocks("IRON_ORE");
    public static final CBBlock[] GOLD_ORE = createBlocks("GOLD_ORE");
    public static final CBBlock[] REDSTONE_ORE = createBlocks("REDSTONE_ORE");
    public static final CBBlock[] EMERALD_ORE = createBlocks("EMERALD_ORE");
    public static final CBBlock[] LAPIS_ORE = createBlocks("LAPIS_ORE");
    public static final CBBlock[] DIAMOND_ORE = createBlocks("DIAMOND_ORE");
    public static final CBBlock[] NETHER_GOLD_ORE = createBlocks("NETHER_GOLD_ORE");
    public static final CBBlock[] NETHER_QUARTZ_ORE = createBlocks("NETHER_QUARTZ_ORE");
    public static final CBBlock[] DEEPSLATE_COAL_ORE = createBlocks("DEEPSLATE_COAL_ORE");
    public static final CBBlock[] DEEPSLATE_COPPER_ORE = createBlocks("DEEPSLATE_COPPER_ORE");
    public static final CBBlock[] DEEPSLATE_IRON_ORE = createBlocks("DEEPSLATE_IRON_ORE");
    public static final CBBlock[] DEEPSLATE_GOLD_ORE = createBlocks("DEEPSLATE_GOLD_ORE");
    public static final CBBlock[] DEEPSLATE_REDSTONE_ORE = createBlocks("DEEPSLATE_REDSTONE_ORE");
    public static final CBBlock[] DEEPSLATE_EMERALD_ORE = createBlocks("DEEPSLATE_EMERALD_ORE");
    public static final CBBlock[] DEEPSLATE_LAPIS_ORE = createBlocks("DEEPSLATE_LAPIS_ORE");
    public static final CBBlock[] DEEPSLATE_DIAMOND_ORE = createBlocks("DEEPSLATE_DIAMOND_ORE");
    public static final CBBlock[] RAW_IRON_BLOCK = createBlocks("RAW_IRON_BLOCK", 1.25F);
    public static final CBBlock[] RAW_COPPER_BLOCK = createBlocks("RAW_COPPER_BLOCK", 1.25F);
    public static final CBBlock[] RAW_GOLD_BLOCK = createBlocks("RAW_GOLD_BLOCK", 1.25F);
    public static final CBBlock[] IRON_BLOCK = createBlocks("IRON_BLOCK", 1.5F);
    public static final CBBlock[] GOLD_BLOCK = createBlocks("GOLD_BLOCK", 1.5F);
    public static final CBBlock[] LAPIS_BLOCK = createBlocks("LAPIS_BLOCK", 1.5F);
    public static final CBBlock[] REDSTONE_BLOCK = createBlocks("REDSTONE_BLOCK", 1.5F);
    public static final CBBlock[] EMERALD_BLOCK = createBlocks("EMERALD_BLOCK", 1.5F);
    public static final CBBlock[] DIAMOND_BLOCK = createBlocks("DIAMOND_BLOCK", 2.0F);
    public static final CBBlock[] NETHERITE_BLOCK = createBlocks("NETHERITE_BLOCK", 2.5F);
    public static final CBBlock[] COAL_BLOCK = createBlocks("COAL_BLOCK");
    public static final CBBlock[] SLIME_BLOCK = createBlocks("SLIME_BLOCK", 0.925F);
    public static final CBBlock[] HONEY_BLOCK = createBlocks("HONEY_BLOCK", 0.925F);
    public static final CBBlock[] BRICKS = createBlocks("BRICKS");
    public static final CBBlock[] STONE_BRICKS = createBlocks("STONE_BRICKS");
    public static final CBBlock[] NETHERRACK = createBlocks("NETHERRACK");
    public static final CBBlock[] NETHER_BRICKS = createBlocks("NETHER_BRICKS");
    public static final CBBlock[] RED_NETHER_BRICKS = createBlocks("RED_NETHER_BRICKS");
    public static final CBBlock[] NETHER_WART_BLOCK = createBlocks("NETHER_WART_BLOCK");
    public static final CBBlock[] SOUL_SAND = createBlocks("SOUL_SAND");
    public static final CBBlock[] SOUL_SOIL = createBlocks("SOUL_SOIL");
    public static final CBBlock[] END_STONE = createBlocks("END_STONE");
    public static final CBBlock[] END_STONE_BRICKS = createBlocks("END_STONE_BRICKS");
    public static final CBBlock[] BLACKSTONE = createBlocks("BLACKSTONE");
    public static final CBBlock[] DEEPSLATE = createBlocks("DEEPSLATE");
    public static final CBBlock[] COBBLED_DEEPSLATE = createBlocks("COBBLED_DEEPSLATE");
    public static final CBBlock[] TUFF = createBlocks("TUFF");
    public static final CBRotationalBlock[] BASALT = createRotationalBlocks("BASALT");
    public static final CBBlock[] OBSIDIAN = createBlocks("OBSIDIAN", 3.5F);
    public static final CBBlock[] MUD = createBlocks("MUD", 0.8F);
    public static final CBRotationalBlock[] OAK_LOG = createRotationalBlocks("OAK_LOG");
    public static final CBRotationalBlock[] SPRUCE_LOG = createRotationalBlocks("SPRUCE_LOG");
    public static final CBRotationalBlock[] BIRCH_LOG = createRotationalBlocks("BIRCH_LOG");
    public static final CBRotationalBlock[] JUNGLE_LOG = createRotationalBlocks("JUNGLE_LOG");
    public static final CBRotationalBlock[] ACACIA_LOG = createRotationalBlocks("ACACIA_LOG");
    public static final CBRotationalBlock[] DARK_OAK_LOG = createRotationalBlocks("DARK_OAK_LOG");
    public static final CBRotationalBlock[] MANGROVE_LOG = createRotationalBlocks("MANGROVE_LOG");
    public static final CBRotationalBlock[] CHERRY_LOG = createRotationalBlocks("CHERRY_LOG");
    public static final CBRotationalBlock[] STRIPPED_OAK_LOG = createRotationalBlocks("STRIPPED_OAK_LOG");
    public static final CBRotationalBlock[] STRIPPED_SPRUCE_LOG = createRotationalBlocks("STRIPPED_SPRUCE_LOG");
    public static final CBRotationalBlock[] STRIPPED_BIRCH_LOG = createRotationalBlocks("STRIPPED_BIRCH_LOG");
    public static final CBRotationalBlock[] STRIPPED_JUNGLE_LOG = createRotationalBlocks("STRIPPED_JUNGLE_LOG");
    public static final CBRotationalBlock[] STRIPPED_ACACIA_LOG = createRotationalBlocks("STRIPPED_ACACIA_LOG");
    public static final CBRotationalBlock[] STRIPPED_DARK_OAK_LOG = createRotationalBlocks("STRIPPED_DARK_OAK_LOG");
    public static final CBRotationalBlock[] STRIPPED_MANGROVE_LOG = createRotationalBlocks("STRIPPED_MANGROVE_LOG");
    public static final CBRotationalBlock[] STRIPPED_CHERRY_LOG = createRotationalBlocks("STRIPPED_CHERRY_LOG");
    public static final CBRotationalBlock[] OAK_PLANKS = createRotationalBlocks("OAK_PLANKS");
    public static final CBRotationalBlock[] SPRUCE_PLANKS = createRotationalBlocks("SPRUCE_PLANKS");
    public static final CBRotationalBlock[] BIRCH_PLANKS = createRotationalBlocks("BIRCH_PLANKS");
    public static final CBRotationalBlock[] JUNGLE_PLANKS = createRotationalBlocks("JUNGLE_PLANKS");
    public static final CBRotationalBlock[] ACACIA_PLANKS = createRotationalBlocks("ACACIA_PLANKS");
    public static final CBRotationalBlock[] DARK_OAK_PLANKS = createRotationalBlocks("DARK_OAK_PLANKS");
    public static final CBRotationalBlock[] MANGROVE_PLANKS = createRotationalBlocks("MANGROVE_PLANKS");
    public static final CBRotationalBlock[] CHERRY_PLANKS = createRotationalBlocks("CHERRY_PLANKS");
    public static final CBRotationalBlock[] BAMBOO_PLANKS = createRotationalBlocks("BAMBOO_PLANKS");
    public static final CBRotationalBlock[] BAMBOO_MOSAIC = createRotationalBlocks("BAMBOO_MOSAIC");
    public static final CBBlock[] COPPER_BLOCK = createBlocks("COPPER_BLOCK", 1.5F);
    public static final CBBlock[] CUT_COPPER = createBlocks("CUT_COPPER", 1.75F);
    public static final CBBlock[] EXPOSED_COPPER = createBlocks("EXPOSED_COPPER", 1.35F);
    public static final CBBlock[] EXPOSED_CUT_COPPER = createBlocks("EXPOSED_CUT_COPPER", 1.35F);
    public static final CBBlock[] WEATHERED_COPPER = createBlocks("WEATHERED_COPPER", 1.35F);
    public static final CBBlock[] WEATHERED_CUT_COPPER = createBlocks("WEATHERED_CUT_COPPER", 1.35F);
    public static final CBBlock[] OXIDIZED_COPPER = createBlocks("OXIDIZED_COPPER", 1.35F);
    public static final CBBlock[] OXIDIZED_CUT_COPPER = createBlocks("OXIDIZED_CUT_COPPER", 1.35F);
    public static final CBBlock[] WAXED_COPPER_BLOCK = createBlocks("WAXED_COPPER_BLOCK", 1.75F);
    public static final CBBlock[] WAXED_CUT_COPPER = createBlocks("WAXED_CUT_COPPER", 1.75F);
    public static final CBBlock[] WAXED_EXPOSED_COPPER = createBlocks("WAXED_EXPOSED_COPPER", 1.75F);
    public static final CBBlock[] WAXED_EXPOSED_CUT_COPPER = createBlocks("WAXED_EXPOSED_CUT_COPPER", 1.75F);
    public static final CBBlock[] WAXED_WEATHERED_COPPER = createBlocks("WAXED_WEATHERED_COPPER", 1.75F);
    public static final CBBlock[] WAXED_WEATHERED_CUT_COPPER = createBlocks("WAXED_WEATHERED_CUT_COPPER", 1.75F);
    public static final CBBlock[] WAXED_OXIDIZED_COPPER = createBlocks("WAXED_OXIDIZED_COPPER", 1.75F);
    public static final CBBlock[] WAXED_OXIDIZED_CUT_COPPER = createBlocks("WAXED_OXIDIZED_CUT_COPPER", 1.75F);
    public static final CBRotationalBlock[] BONE_BLOCK = createRotationalBlocks("BONE_BLOCK");
    public static final CBRotationalBlock[] SCULK = createRotationalBlocks("SCULK");
    public static final CBBlock[] SMOOTH_SANDSTONE = createBlocks("SMOOTH_SANDSTONE");
    public static final CBBlock[] CUT_SANDSTONE = createBlocks("CUT_SANDSTONE");
    public static final CBBlock[] CHISELED_SANDSTONE = createBlocks("CHISELED_SANDSTONE");
    public static final CBBlock[] SMOOTH_RED_SANDSTONE = createBlocks("SMOOTH_RED_SANDSTONE");
    public static final CBBlock[] CUT_RED_SANDSTONE = createBlocks("CUT_RED_SANDSTONE");
    public static final CBBlock[] CHISELED_RED_SANDSTONE = createBlocks("CHISELED_RED_SANDSTONE");
    public static final CBRotationalBlock[] CRIMSON_STEM = createRotationalBlocks("CRIMSON_STEM");
    public static final CBRotationalBlock[] WARPED_STEM = createRotationalBlocks("WARPED_STEM");
    public static final CBBlock[] TNT = createBlocks("TNT", 0.25F);
    public static final CBRotationalBlock[] BAMBOO_BLOCK = createRotationalBlocks("BAMBOO_BLOCK");
    public static final CBRotationalBlock[] STRIPPED_BAMBOO_BLOCK = createRotationalBlocks("STRIPPED_BAMBOO_BLOCK");
    public static final CBRotationalBlock[] STRIPPED_CRIMSON_STEM = createRotationalBlocks("STRIPPED_CRIMSON_STEM");
    public static final CBBlock[] CRIMSON_PLANKS = createBlocks("CRIMSON_PLANKS");
    public static final CBRotationalBlock[] STRIPPED_WARPED_STEM = createRotationalBlocks("STRIPPED_WARPED_STEM");
    public static final CBBlock[] WARPED_PLANKS = createBlocks("WARPED_PLANKS");
    public static final CBBlock[] MOSSY_COBBLESTONE = createBlocks("MOSSY_COBBLESTONE");
    public static final CBBlock[] MOSSY_STONE_BRICKS = createBlocks("MOSSY_STONE_BRICKS");
    public static final CBBlock[] CRACKED_STONE_BRICKS = createBlocks("CRACKED_STONE_BRICKS");
    public static final CBBlock[] CHISELED_STONE_BRICKS = createBlocks("CHISELED_STONE_BRICKS");
    public static final CBBlock[] POLISHED_GRANITE = createBlocks("POLISHED_GRANITE");
    public static final CBBlock[] POLISHED_DIORITE = createBlocks("POLISHED_DIORITE");
    public static final CBBlock[] POLISHED_ANDESITE = createBlocks("POLISHED_ANDESITE");
    public static final CBBlock[] CHISELED_DEEPSLATE = createBlocks("CHISELED_DEEPSLATE");
    public static final CBBlock[] POLISHED_DEEPSLATE = createBlocks("POLISHED_DEEPSLATE");
    public static final CBBlock[] DEEPSLATE_BRICKS = createBlocks("DEEPSLATE_BRICKS");
    public static final CBBlock[] CRACKED_DEEPSLATE_BRICKS = createBlocks("CRACKED_DEEPSLATE_BRICKS");
    public static final CBBlock[] DEEPSLATE_TILES = createBlocks("DEEPSLATE_TILES");
    public static final CBBlock[] CRACKED_DEEPSLATE_TILES = createBlocks("CRACKED_DEEPSLATE_TILES");
    public static final CBBlock[] PACKED_MUD = createBlocks("PACKED_MUD");
    public static final CBBlock[] MUD_BRICKS = createBlocks("MUD_BRICKS");
    public static final CBBlock[] PRISMARINE = createBlocks("PRISMARINE");
    public static final CBBlock[] PRISMARINE_BRICKS = createBlocks("PRISMARINE_BRICKS");
    public static final CBBlock[] DARK_PRISMARINE = createBlocks("DARK_PRISMARINE");
    public static final CBRotationalBlock[] QUARTZ_BLOCK = createRotationalBlocks("QUARTZ_BLOCK");
    public static final CBBlock[] CHISELED_QUARTZ_BLOCK = createBlocks("CHISELED_QUARTZ_BLOCK");
    public static final CBBlock[] QUARTZ_BRICKS = createBlocks("QUARTZ_BRICKS");
    public static final CBRotationalBlock[] QUARTZ_PILLAR = createRotationalBlocks("QUARTZ_PILLAR");
    public static final CBBlock[] SMOOTH_QUARTZ_BLOCK = createBlocks("SMOOTH_QUARTZ_BLOCK");
    public static final CBBlock[] AMETHYST_BLOCK = createBlocks("AMETHYST_BLOCK");
    public static final CBBlock[] WHITE_WOOL = createBlocks("WHITE_WOOL", 0.5F);
    public static final CBBlock[] LIGHT_GRAY_WOOL = createBlocks("LIGHT_GRAY_WOOL", 0.5F);
    public static final CBBlock[] GRAY_WOOL = createBlocks("GRAY_WOOL", 0.5F);
    public static final CBBlock[] BLACK_WOOL = createBlocks("BLACK_WOOL", 0.5F);
    public static final CBBlock[] BROWN_WOOL = createBlocks("BROWN_WOOL", 0.5F);
    public static final CBBlock[] RED_WOOL = createBlocks("RED_WOOL", 0.5F);
    public static final CBBlock[] ORANGE_WOOL = createBlocks("ORANGE_WOOL", 0.5F);
    public static final CBBlock[] YELLOW_WOOL = createBlocks("YELLOW_WOOL", 0.5F);
    public static final CBBlock[] LIME_WOOL = createBlocks("LIME_WOOL", 0.5F);
    public static final CBBlock[] GREEN_WOOL = createBlocks("GREEN_WOOL", 0.5F);
    public static final CBBlock[] CYAN_WOOL = createBlocks("CYAN_WOOL", 0.5F);
    public static final CBBlock[] LIGHT_BLUE_WOOL = createBlocks("LIGHT_BLUE_WOOL", 0.5F);
    public static final CBBlock[] BLUE_WOOL = createBlocks("BLUE_WOOL", 0.5F);
    public static final CBBlock[] PURPLE_WOOL = createBlocks("PURPLE_WOOL", 0.5F);
    public static final CBBlock[] MAGENTA_WOOL = createBlocks("MAGENTA_WOOL", 0.5F);
    public static final CBBlock[] PINK_WOOL = createBlocks("PINK_WOOL", 0.5F);
    public static final CBBlock[] TERRACOTTA = createBlocks("TERRACOTTA");
    public static final CBBlock[] WHITE_TERRACOTTA = createBlocks("WHITE_TERRACOTTA");
    public static final CBBlock[] LIGHT_GRAY_TERRACOTTA = createBlocks("LIGHT_GRAY_TERRACOTTA");
    public static final CBBlock[] GRAY_TERRACOTTA = createBlocks("GRAY_TERRACOTTA");
    public static final CBBlock[] BLACK_TERRACOTTA = createBlocks("BLACK_TERRACOTTA");
    public static final CBBlock[] BROWN_TERRACOTTA = createBlocks("BROWN_TERRACOTTA");
    public static final CBBlock[] RED_TERRACOTTA = createBlocks("RED_TERRACOTTA");
    public static final CBBlock[] ORANGE_TERRACOTTA = createBlocks("ORANGE_TERRACOTTA");
    public static final CBBlock[] YELLOW_TERRACOTTA = createBlocks("YELLOW_TERRACOTTA");
    public static final CBBlock[] LIME_TERRACOTTA = createBlocks("LIME_TERRACOTTA");
    public static final CBBlock[] GREEN_TERRACOTTA = createBlocks("GREEN_TERRACOTTA");
    public static final CBBlock[] CYAN_TERRACOTTA = createBlocks("CYAN_TERRACOTTA");
    public static final CBBlock[] LIGHT_BLUE_TERRACOTTA = createBlocks("LIGHT_BLUE_TERRACOTTA");
    public static final CBBlock[] BLUE_TERRACOTTA = createBlocks("BLUE_TERRACOTTA");
    public static final CBBlock[] PURPLE_TERRACOTTA = createBlocks("PURPLE_TERRACOTTA");
    public static final CBBlock[] MAGENTA_TERRACOTTA = createBlocks("MAGENTA_TERRACOTTA");
    public static final CBBlock[] PINK_TERRACOTTA = createBlocks("PINK_TERRACOTTA");
    public static final CBBlock[] WHITE_GLAZED_TERRACOTTA = createBlocks("WHITE_GLAZED_TERRACOTTA");
    public static final CBBlock[] LIGHT_GRAY_GLAZED_TERRACOTTA = createBlocks("LIGHT_GRAY_GLAZED_TERRACOTTA");
    public static final CBBlock[] GRAY_GLAZED_TERRACOTTA = createBlocks("GRAY_GLAZED_TERRACOTTA");
    public static final CBBlock[] BLACK_GLAZED_TERRACOTTA = createBlocks("BLACK_GLAZED_TERRACOTTA");
    public static final CBBlock[] BROWN_GLAZED_TERRACOTTA = createBlocks("BROWN_GLAZED_TERRACOTTA");
    public static final CBBlock[] RED_GLAZED_TERRACOTTA = createBlocks("RED_GLAZED_TERRACOTTA");
    public static final CBBlock[] ORANGE_GLAZED_TERRACOTTA = createBlocks("ORANGE_GLAZED_TERRACOTTA");
    public static final CBBlock[] YELLOW_GLAZED_TERRACOTTA = createBlocks("YELLOW_GLAZED_TERRACOTTA");
    public static final CBBlock[] LIME_GLAZED_TERRACOTTA = createBlocks("LIME_GLAZED_TERRACOTTA");
    public static final CBBlock[] GREEN_GLAZED_TERRACOTTA = createBlocks("GREEN_GLAZED_TERRACOTTA");
    public static final CBBlock[] CYAN_GLAZED_TERRACOTTA = createBlocks("CYAN_GLAZED_TERRACOTTA");
    public static final CBBlock[] LIGHT_BLUE_GLAZED_TERRACOTTA = createBlocks("LIGHT_BLUE_GLAZED_TERRACOTTA");
    public static final CBBlock[] BLUE_GLAZED_TERRACOTTA = createBlocks("BLUE_GLAZED_TERRACOTTA");
    public static final CBBlock[] PURPLE_GLAZED_TERRACOTTA = createBlocks("PURPLE_GLAZED_TERRACOTTA");
    public static final CBBlock[] MAGENTA_GLAZED_TERRACOTTA = createBlocks("MAGENTA_GLAZED_TERRACOTTA");
    public static final CBBlock[] PINK_GLAZED_TERRACOTTA = createBlocks("PINK_GLAZED_TERRACOTTA");
    public static final CBBlock[] WHITE_CONCRETE_POWDER = createBlocks("WHITE_CONCRETE_POWDER");
    public static final CBBlock[] LIGHT_GRAY_CONCRETE_POWDER = createBlocks("LIGHT_GRAY_CONCRETE_POWDER");
    public static final CBBlock[] GRAY_CONCRETE_POWDER = createBlocks("GRAY_CONCRETE_POWDER");
    public static final CBBlock[] BLACK_CONCRETE_POWDER = createBlocks("BLACK_CONCRETE_POWDER");
    public static final CBBlock[] BROWN_CONCRETE_POWDER = createBlocks("BROWN_CONCRETE_POWDER");
    public static final CBBlock[] RED_CONCRETE_POWDER = createBlocks("RED_CONCRETE_POWDER");
    public static final CBBlock[] ORANGE_CONCRETE_POWDER = createBlocks("ORANGE_CONCRETE_POWDER");
    public static final CBBlock[] YELLOW_CONCRETE_POWDER = createBlocks("YELLOW_CONCRETE_POWDER");
    public static final CBBlock[] LIME_CONCRETE_POWDER = createBlocks("LIME_CONCRETE_POWDER");
    public static final CBBlock[] GREEN_CONCRETE_POWDER = createBlocks("GREEN_CONCRETE_POWDER");
    public static final CBBlock[] CYAN_CONCRETE_POWDER = createBlocks("CYAN_CONCRETE_POWDER");
    public static final CBBlock[] LIGHT_BLUE_CONCRETE_POWDER = createBlocks("LIGHT_BLUE_CONCRETE_POWDER");
    public static final CBBlock[] BLUE_CONCRETE_POWDER = createBlocks("BLUE_CONCRETE_POWDER");
    public static final CBBlock[] PURPLE_CONCRETE_POWDER = createBlocks("PURPLE_CONCRETE_POWDER");
    public static final CBBlock[] MAGENTA_CONCRETE_POWDER = createBlocks("MAGENTA_CONCRETE_POWDER");
    public static final CBBlock[] PINK_CONCRETE_POWDER = createBlocks("PINK_CONCRETE_POWDER");
    public static final CBBlock[] WHITE_CONCRETE = createBlocks("WHITE_CONCRETE");
    public static final CBBlock[] LIGHT_GRAY_CONCRETE = createBlocks("LIGHT_GRAY_CONCRETE");
    public static final CBBlock[] GRAY_CONCRETE = createBlocks("GRAY_CONCRETE");
    public static final CBBlock[] BLACK_CONCRETE = createBlocks("BLACK_CONCRETE");
    public static final CBBlock[] BROWN_CONCRETE = createBlocks("BROWN_CONCRETE");
    public static final CBBlock[] RED_CONCRETE = createBlocks("RED_CONCRETE");
    public static final CBBlock[] ORANGE_CONCRETE = createBlocks("ORANGE_CONCRETE");
    public static final CBBlock[] YELLOW_CONCRETE = createBlocks("YELLOW_CONCRETE");
    public static final CBBlock[] LIME_CONCRETE = createBlocks("LIME_CONCRETE");
    public static final CBBlock[] GREEN_CONCRETE = createBlocks("GREEN_CONCRETE");
    public static final CBBlock[] CYAN_CONCRETE = createBlocks("CYAN_CONCRETE");
    public static final CBBlock[] LIGHT_BLUE_CONCRETE = createBlocks("LIGHT_BLUE_CONCRETE");
    public static final CBBlock[] BLUE_CONCRETE = createBlocks("BLUE_CONCRETE");
    public static final CBBlock[] PURPLE_CONCRETE = createBlocks("PURPLE_CONCRETE");
    public static final CBBlock[] MAGENTA_CONCRETE = createBlocks("MAGENTA_CONCRETE");
    public static final CBBlock[] PINK_CONCRETE = createBlocks("PINK_CONCRETE");
    public static final CBBlock[] GLASS = createGlassBlocks("GLASS", 0.12F);
    public static final CBBlock[] TINTED_GLASS = createGlassBlocks("TINTED_GLASS", 0.25F);
    public static final CBBlock[] WHITE_STAINED_GLASS = createGlassBlocks("WHITE_STAINED_GLASS");
    public static final CBBlock[] LIGHT_GRAY_STAINED_GLASS = createGlassBlocks("LIGHT_GRAY_STAINED_GLASS");
    public static final CBBlock[] GRAY_STAINED_GLASS = createGlassBlocks("GRAY_STAINED_GLASS");
    public static final CBBlock[] BLACK_STAINED_GLASS = createGlassBlocks("BLACK_STAINED_GLASS");
    public static final CBBlock[] BROWN_STAINED_GLASS = createGlassBlocks("BROWN_STAINED_GLASS");
    public static final CBBlock[] RED_STAINED_GLASS = createGlassBlocks("RED_STAINED_GLASS");
    public static final CBBlock[] ORANGE_STAINED_GLASS = createGlassBlocks("ORANGE_STAINED_GLASS");
    public static final CBBlock[] YELLOW_STAINED_GLASS = createGlassBlocks("YELLOW_STAINED_GLASS");
    public static final CBBlock[] LIME_STAINED_GLASS = createGlassBlocks("LIME_STAINED_GLASS");
    public static final CBBlock[] GREEN_STAINED_GLASS = createGlassBlocks("GREEN_STAINED_GLASS");
    public static final CBBlock[] CYAN_STAINED_GLASS = createGlassBlocks("CYAN_STAINED_GLASS");
    public static final CBBlock[] LIGHT_BLUE_STAINED_GLASS = createGlassBlocks("LIGHT_BLUE_STAINED_GLASS");
    public static final CBBlock[] BLUE_STAINED_GLASS = createGlassBlocks("BLUE_STAINED_GLASS");
    public static final CBBlock[] PURPLE_STAINED_GLASS = createGlassBlocks("PURPLE_STAINED_GLASS");
    public static final CBBlock[] MAGENTA_STAINED_GLASS = createGlassBlocks("MAGENTA_STAINED_GLASS");
    public static final CBBlock[] PINK_STAINED_GLASS = createGlassBlocks("PINK_STAINED_GLASS");
    public static final CBBlock[] ICE = createBlocks("ICE", 0.75F, true);
    public static final CBBlock[] PACKED_ICE = createBlocks("PACKED_ICE", 0.75F, true);
    public static final CBBlock[] BLUE_ICE = createBlocks("BLUE_ICE", 0.75F, true);
    public static final CBBlock[] SNOW_BLOCK = createBlocks("SNOW_BLOCK", 0.5F);
    public static final CBBlock[] MOSS_BLOCK = createBlocks("MOSS_BLOCK", 0.5F);
    public static final CBBlock[] CALCITE = createBlocks("CALCITE");
    public static final CBBlock[] DRIPSTONE_BLOCK = createBlocks("DRIPSTONE_BLOCK");
    public static final CBBlock[] MAGMA_BLOCK = createBlocks("MAGMA_BLOCK");
    public static final CBBlock[] GLOWSTONE = createBlocks("GLOWSTONE");
    public static final CBBlock[] DRIED_KELP_BLOCK = createBlocks("DRIED_KELP_BLOCK", 0.5F);
    public static final CBBlock[] BROWN_MUSHROOM_BLOCK = createBlocks("BROWN_MUSHROOM_BLOCK");
    public static final CBBlock[] RED_MUSHROOM_BLOCK = createBlocks("RED_MUSHROOM_BLOCK");
    public static final CBBlock[] SHROOMLIGHT = createBlocks("SHROOMLIGHT");
    public static final CBRotationalBlock[] MELON = createRotationalBlocks("MELON");
    public static final CBRotationalBlock[] PUMPKIN = createRotationalBlocks("PUMPKIN");
    public static final CBRotationalBlock[] HAY_BLOCK = createRotationalBlocks("HAY_BLOCK", 0.5F);
    public static final CBRotationalBlock[] OCHRE_FROGLIGHT = createRotationalBlocks("OCHRE_FROGLIGHT");
    public static final CBRotationalBlock[] VERDANT_FROGLIGHT = createRotationalBlocks("VERDANT_FROGLIGHT");
    public static final CBRotationalBlock[] PEARLESCENT_FROGLIGHT = createRotationalBlocks("PEARLESCENT_FROGLIGHT");
    public static final CBBlock[] SEA_LANTERN = createBlocks("SEA_LANTERN");

    /**
     * Creates a list of blocks with different compression levels.
     *
     * @param name The name of the block.
     * @return The list of blocks.
     */
    public static CBBlock[] createBlocks(String name) {
        return createBlocks(name, null);
    }

    /**
     * Creates a list of blocks with different compression levels.
     *
     * @param name      The name of the block.
     * @param amplifier The amplifier of the block.
     * @return The list of blocks.
     */
    public static CBBlock[] createBlocks(String name, Float amplifier) {
        return createBlocks(name, amplifier, false);
    }

    /**
     * Creates a list of blocks with different compression levels.
     *
     * @param name                  The name of the block.
     * @param amplifier             The amplifier of the block.
     * @param hasSmallerCompression Whether the block has smaller compression levels.
     * @return The list of blocks.
     */
    public static CBBlock[] createBlocks(String name, Float amplifier, boolean hasSmallerCompression) {
        if (!Services.PLATFORM.isBlockEnabled(name)) return null;
        CBBlock[] result = new CBBlock[MAX_COMPRESSION_LEVEL];

        for (int i = 0; i < MAX_COMPRESSION_LEVEL; i++) {
            float baseHardness = HARDNESS[i];
            float baseResistance = RESISTANCE[i];

            float factor = (amplifier == null ? 1 : amplifier);

            float blockHardness = baseHardness * factor;
            float blockResistance = baseResistance * factor;

            result[i] = new CBBlock(BlockBehaviour.Properties.of().strength(blockHardness, blockResistance), i, hasSmallerCompression, CommonUtils.createBlockId("c" + i + "_" + name));
        }
        return result;
    }

    /**
     * Creates a list of glass blocks with different compression levels.
     *
     * @param name The name of the block.
     * @return The list of blocks.
     */
    public static CBBlock[] createGlassBlocks(String name) {
        return createGlassBlocks(name, 0.125F);
    }

    /**
     * Creates a list of glass blocks with different compression levels.
     *
     * @param name      The name of the block.
     * @param amplifier The amplifier of the block.
     * @return The list of blocks.
     */
    public static CBBlock[] createGlassBlocks(String name, Float amplifier) {
        if (!Services.PLATFORM.isBlockEnabled(name)) return null;
        CBBlock[] result = new CBBlock[MAX_COMPRESSION_LEVEL];
        for (int i = 0; i < MAX_COMPRESSION_LEVEL; i++) {
            float blockHardness = amplifier != null ? HARDNESS[i] * amplifier : HARDNESS[i];
            float blockResistance = amplifier != null ? RESISTANCE[i] * amplifier : RESISTANCE[i];

            result[i] = new CBBlock(BlockBehaviour.Properties.of().noCollission().strength(blockHardness, blockResistance), i, false, CommonUtils.createBlockId("c" + i + "_" + name));
        }
        return result;
    }

    /**
     * Creates a list of rotational blocks with different compression levels.
     *
     * @param name The name of the block.
     * @return The list of blocks.
     */
    public static CBRotationalBlock[] createRotationalBlocks(String name) {
        return createRotationalBlocks(name, null);
    }

    /**
     * Creates a list of rotational blocks with different compression levels.
     *
     * @param name      The name of the block.
     * @param amplifier The amplifier of the block.
     * @return The list of blocks.
     */
    public static CBRotationalBlock[] createRotationalBlocks(String name, Float amplifier) {
        if (!Services.PLATFORM.isBlockEnabled(name)) return null;
        CBRotationalBlock[] result = new CBRotationalBlock[MAX_COMPRESSION_LEVEL];
        for (int i = 0; i < MAX_COMPRESSION_LEVEL; i++) {
            float blockHardness = amplifier != null ? HARDNESS[i] * amplifier : HARDNESS[i];
            float blockResistance = amplifier != null ? RESISTANCE[i] * amplifier : RESISTANCE[i];
            result[i] = new CBRotationalBlock(BlockBehaviour.Properties.of().strength(blockHardness, blockResistance), i, CommonUtils.createBlockId("c" + i + "_" + name));
        }
        return result;
    }
}