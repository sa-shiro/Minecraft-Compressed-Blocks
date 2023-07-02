package net.sashiro.compressedblocks.world.level.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.sashiro.compressedblocks.event.CBRegistryEvent.BLOCKS;
import static net.sashiro.compressedblocks.world.level.block.CompressedBlock.*;

@SuppressWarnings({"unused", "CanBeFinal"})
@Mod.EventBusSubscriber(modid = net.sashiro.compressedblocks.CompressedBlocks.MOD_ID)
public class CompressedBlocks {
    public static final float[] HARDNESS = {5.0F, 6.5F, 8.5F, 12.5F, 15.0F, 20.5F, 25.5F, 30.5F, 40.0F, 50.0F};
    public static final float[] RESISTANCE = {35.5F, 75.0F, 150.0F, 300.0F, 600.0F, 800.0F, 1250.0F, 2000.0F, 5000.0F, 7500.0F};
    
    //------------------------------------------------------------------------------------------------------------------
    //region Dirt
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> DIRT_0 = BLOCKS.register("c0_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> DIRT_1 = BLOCKS.register("c1_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> DIRT_2 = BLOCKS.register("c2_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> DIRT_3 = BLOCKS.register("c3_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> DIRT_4 = BLOCKS.register("c4_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> DIRT_5 = BLOCKS.register("c5_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> DIRT_6 = BLOCKS.register("c6_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> DIRT_7 = BLOCKS.register("c7_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> DIRT_8 = BLOCKS.register("c8_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> DIRT_9 = BLOCKS.register("c9_dirt", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gravel
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> GRAVEL_0 = BLOCKS.register("c0_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> GRAVEL_1 = BLOCKS.register("c1_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> GRAVEL_2 = BLOCKS.register("c2_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> GRAVEL_3 = BLOCKS.register("c3_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> GRAVEL_4 = BLOCKS.register("c4_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> GRAVEL_5 = BLOCKS.register("c5_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> GRAVEL_6 = BLOCKS.register("c6_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> GRAVEL_7 = BLOCKS.register("c7_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> GRAVEL_8 = BLOCKS.register("c8_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> GRAVEL_9 = BLOCKS.register("c9_gravel", () -> new CustomGravelBlock(BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cobblestone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> COBBLESTONE_0 = BLOCKS.register("c0_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> COBBLESTONE_1 = BLOCKS.register("c1_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> COBBLESTONE_2 = BLOCKS.register("c2_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> COBBLESTONE_3 = BLOCKS.register("c3_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> COBBLESTONE_4 = BLOCKS.register("c4_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> COBBLESTONE_5 = BLOCKS.register("c5_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> COBBLESTONE_6 = BLOCKS.register("c6_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> COBBLESTONE_7 = BLOCKS.register("c7_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> COBBLESTONE_8 = BLOCKS.register("c8_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> COBBLESTONE_9 = BLOCKS.register("c9_cobblestone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Stone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STONE_0 = BLOCKS.register("c0_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> STONE_1 = BLOCKS.register("c1_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> STONE_2 = BLOCKS.register("c2_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> STONE_3 = BLOCKS.register("c3_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> STONE_4 = BLOCKS.register("c4_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> STONE_5 = BLOCKS.register("c5_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> STONE_6 = BLOCKS.register("c6_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> STONE_7 = BLOCKS.register("c7_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> STONE_8 = BLOCKS.register("c8_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> STONE_9 = BLOCKS.register("c9_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Granite
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> GRANITE_0 = BLOCKS.register("c0_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> GRANITE_1 = BLOCKS.register("c1_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> GRANITE_2 = BLOCKS.register("c2_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> GRANITE_3 = BLOCKS.register("c3_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> GRANITE_4 = BLOCKS.register("c4_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> GRANITE_5 = BLOCKS.register("c5_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> GRANITE_6 = BLOCKS.register("c6_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> GRANITE_7 = BLOCKS.register("c7_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> GRANITE_8 = BLOCKS.register("c8_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> GRANITE_9 = BLOCKS.register("c9_granite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GRANITE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Diorite
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> DIORITE_0 = BLOCKS.register("c0_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> DIORITE_1 = BLOCKS.register("c1_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> DIORITE_2 = BLOCKS.register("c2_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> DIORITE_3 = BLOCKS.register("c3_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> DIORITE_4 = BLOCKS.register("c4_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> DIORITE_5 = BLOCKS.register("c5_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> DIORITE_6 = BLOCKS.register("c6_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> DIORITE_7 = BLOCKS.register("c7_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> DIORITE_8 = BLOCKS.register("c8_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> DIORITE_9 = BLOCKS.register("c9_diorite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIORITE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Andesite
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> ANDESITE_0 = BLOCKS.register("c0_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> ANDESITE_1 = BLOCKS.register("c1_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> ANDESITE_2 = BLOCKS.register("c2_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> ANDESITE_3 = BLOCKS.register("c3_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> ANDESITE_4 = BLOCKS.register("c4_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> ANDESITE_5 = BLOCKS.register("c5_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> ANDESITE_6 = BLOCKS.register("c6_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> ANDESITE_7 = BLOCKS.register("c7_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> ANDESITE_8 = BLOCKS.register("c8_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> ANDESITE_9 = BLOCKS.register("c9_andesite", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ANDESITE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Crimson Nylium
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> CRIMSON_NYLIUM_0 = BLOCKS.register("c0_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_1 = BLOCKS.register("c1_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_2 = BLOCKS.register("c2_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_3 = BLOCKS.register("c3_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_4 = BLOCKS.register("c4_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_5 = BLOCKS.register("c5_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_6 = BLOCKS.register("c6_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_7 = BLOCKS.register("c7_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_8 = BLOCKS.register("c8_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_9 = BLOCKS.register("c9_crimson_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_NYLIUM).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Warped Nylium
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> WARPED_NYLIUM_0 = BLOCKS.register("c0_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> WARPED_NYLIUM_1 = BLOCKS.register("c1_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> WARPED_NYLIUM_2 = BLOCKS.register("c2_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> WARPED_NYLIUM_3 = BLOCKS.register("c3_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> WARPED_NYLIUM_4 = BLOCKS.register("c4_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> WARPED_NYLIUM_5 = BLOCKS.register("c5_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> WARPED_NYLIUM_6 = BLOCKS.register("c6_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> WARPED_NYLIUM_7 = BLOCKS.register("c7_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> WARPED_NYLIUM_8 = BLOCKS.register("c8_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> WARPED_NYLIUM_9 = BLOCKS.register("c9_warped_nylium", () -> new CustomNyliumBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_NYLIUM).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Clay
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> CLAY_0 = BLOCKS.register("c0_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> CLAY_1 = BLOCKS.register("c1_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> CLAY_2 = BLOCKS.register("c2_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> CLAY_3 = BLOCKS.register("c3_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> CLAY_4 = BLOCKS.register("c4_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> CLAY_5 = BLOCKS.register("c5_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> CLAY_6 = BLOCKS.register("c6_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> CLAY_7 = BLOCKS.register("c7_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> CLAY_8 = BLOCKS.register("c8_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> CLAY_9 = BLOCKS.register("c9_clay", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CLAY).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sand
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SAND_0 = BLOCKS.register("c0_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> SAND_1 = BLOCKS.register("c1_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> SAND_2 = BLOCKS.register("c2_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> SAND_3 = BLOCKS.register("c3_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> SAND_4 = BLOCKS.register("c4_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> SAND_5 = BLOCKS.register("c5_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> SAND_6 = BLOCKS.register("c6_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> SAND_7 = BLOCKS.register("c7_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> SAND_8 = BLOCKS.register("c8_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> SAND_9 = BLOCKS.register("c9_sand", () -> new CustomSandBlock(14406560, BlockBehaviour.Properties.copy(Blocks.SAND).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Sand
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RED_SAND_0 = BLOCKS.register("c0_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> RED_SAND_1 = BLOCKS.register("c1_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> RED_SAND_2 = BLOCKS.register("c2_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> RED_SAND_3 = BLOCKS.register("c3_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> RED_SAND_4 = BLOCKS.register("c4_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> RED_SAND_5 = BLOCKS.register("c5_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> RED_SAND_6 = BLOCKS.register("c6_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> RED_SAND_7 = BLOCKS.register("c7_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> RED_SAND_8 = BLOCKS.register("c8_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> RED_SAND_9 = BLOCKS.register("c9_red_sand", () -> new CustomSandBlock(11098145, BlockBehaviour.Properties.copy(Blocks.RED_SAND).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Sandstone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SANDSTONE_0 = BLOCKS.register("c0_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> SANDSTONE_1 = BLOCKS.register("c1_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> SANDSTONE_2 = BLOCKS.register("c2_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> SANDSTONE_3 = BLOCKS.register("c3_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> SANDSTONE_4 = BLOCKS.register("c4_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> SANDSTONE_5 = BLOCKS.register("c5_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> SANDSTONE_6 = BLOCKS.register("c6_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> SANDSTONE_7 = BLOCKS.register("c7_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> SANDSTONE_8 = BLOCKS.register("c8_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> SANDSTONE_9 = BLOCKS.register("c9_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SANDSTONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Sandstone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RED_SANDSTONE_0 = BLOCKS.register("c0_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> RED_SANDSTONE_1 = BLOCKS.register("c1_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> RED_SANDSTONE_2 = BLOCKS.register("c2_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> RED_SANDSTONE_3 = BLOCKS.register("c3_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> RED_SANDSTONE_4 = BLOCKS.register("c4_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> RED_SANDSTONE_5 = BLOCKS.register("c5_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> RED_SANDSTONE_6 = BLOCKS.register("c6_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> RED_SANDSTONE_7 = BLOCKS.register("c7_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> RED_SANDSTONE_8 = BLOCKS.register("c8_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> RED_SANDSTONE_9 = BLOCKS.register("c9_red_sandstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_SANDSTONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Coal Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> COAL_ORE_0 = BLOCKS.register("c0_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> COAL_ORE_1 = BLOCKS.register("c1_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> COAL_ORE_2 = BLOCKS.register("c2_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> COAL_ORE_3 = BLOCKS.register("c3_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> COAL_ORE_4 = BLOCKS.register("c4_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> COAL_ORE_5 = BLOCKS.register("c5_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> COAL_ORE_6 = BLOCKS.register("c6_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> COAL_ORE_7 = BLOCKS.register("c7_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> COAL_ORE_8 = BLOCKS.register("c8_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> COAL_ORE_9 = BLOCKS.register("c9_coal_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Iron Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> IRON_ORE_0 = BLOCKS.register("c0_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> IRON_ORE_1 = BLOCKS.register("c1_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> IRON_ORE_2 = BLOCKS.register("c2_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> IRON_ORE_3 = BLOCKS.register("c3_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> IRON_ORE_4 = BLOCKS.register("c4_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> IRON_ORE_5 = BLOCKS.register("c5_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> IRON_ORE_6 = BLOCKS.register("c6_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> IRON_ORE_7 = BLOCKS.register("c7_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> IRON_ORE_8 = BLOCKS.register("c8_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> IRON_ORE_9 = BLOCKS.register("c9_iron_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gold Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> GOLD_ORE_0 = BLOCKS.register("c0_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> GOLD_ORE_1 = BLOCKS.register("c1_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> GOLD_ORE_2 = BLOCKS.register("c2_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> GOLD_ORE_3 = BLOCKS.register("c3_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> GOLD_ORE_4 = BLOCKS.register("c4_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> GOLD_ORE_5 = BLOCKS.register("c5_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> GOLD_ORE_6 = BLOCKS.register("c6_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> GOLD_ORE_7 = BLOCKS.register("c7_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> GOLD_ORE_8 = BLOCKS.register("c8_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> GOLD_ORE_9 = BLOCKS.register("c9_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Gold Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> NETHER_GOLD_ORE_0 = BLOCKS.register("c0_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_1 = BLOCKS.register("c1_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_2 = BLOCKS.register("c2_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_3 = BLOCKS.register("c3_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_4 = BLOCKS.register("c4_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_5 = BLOCKS.register("c5_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_6 = BLOCKS.register("c6_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_7 = BLOCKS.register("c7_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_8 = BLOCKS.register("c8_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> NETHER_GOLD_ORE_9 = BLOCKS.register("c9_nether_gold_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_GOLD_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Quartz Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_0 = BLOCKS.register("c0_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_1 = BLOCKS.register("c1_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_2 = BLOCKS.register("c2_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_3 = BLOCKS.register("c3_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_4 = BLOCKS.register("c4_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_5 = BLOCKS.register("c5_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_6 = BLOCKS.register("c6_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_7 = BLOCKS.register("c7_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_8 = BLOCKS.register("c8_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> NETHER_QUARTZ_ORE_9 = BLOCKS.register("c9_nether_quartz_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_QUARTZ_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lapis Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> LAPIS_ORE_0 = BLOCKS.register("c0_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> LAPIS_ORE_1 = BLOCKS.register("c1_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> LAPIS_ORE_2 = BLOCKS.register("c2_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> LAPIS_ORE_3 = BLOCKS.register("c3_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> LAPIS_ORE_4 = BLOCKS.register("c4_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> LAPIS_ORE_5 = BLOCKS.register("c5_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> LAPIS_ORE_6 = BLOCKS.register("c6_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> LAPIS_ORE_7 = BLOCKS.register("c7_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> LAPIS_ORE_8 = BLOCKS.register("c8_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> LAPIS_ORE_9 = BLOCKS.register("c9_lapis_ore", () -> new CustomDropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Ore
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> REDSTONE_ORE_0 = BLOCKS.register("c0_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> REDSTONE_ORE_1 = BLOCKS.register("c1_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> REDSTONE_ORE_2 = BLOCKS.register("c2_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> REDSTONE_ORE_3 = BLOCKS.register("c3_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> REDSTONE_ORE_4 = BLOCKS.register("c4_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> REDSTONE_ORE_5 = BLOCKS.register("c5_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> REDSTONE_ORE_6 = BLOCKS.register("c6_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> REDSTONE_ORE_7 = BLOCKS.register("c7_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> REDSTONE_ORE_8 = BLOCKS.register("c8_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> REDSTONE_ORE_9 = BLOCKS.register("c9_redstone_ore", () -> new CustomRedstoneOreBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_ORE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Iron Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> IRON_BLOCK_0 = BLOCKS.register("c0_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> IRON_BLOCK_1 = BLOCKS.register("c1_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> IRON_BLOCK_2 = BLOCKS.register("c2_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> IRON_BLOCK_3 = BLOCKS.register("c3_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> IRON_BLOCK_4 = BLOCKS.register("c4_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> IRON_BLOCK_5 = BLOCKS.register("c5_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> IRON_BLOCK_6 = BLOCKS.register("c6_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> IRON_BLOCK_7 = BLOCKS.register("c7_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> IRON_BLOCK_8 = BLOCKS.register("c8_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> IRON_BLOCK_9 = BLOCKS.register("c9_iron_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Gold Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> GOLD_BLOCK_0 = BLOCKS.register("c0_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> GOLD_BLOCK_1 = BLOCKS.register("c1_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> GOLD_BLOCK_2 = BLOCKS.register("c2_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> GOLD_BLOCK_3 = BLOCKS.register("c3_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> GOLD_BLOCK_4 = BLOCKS.register("c4_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> GOLD_BLOCK_5 = BLOCKS.register("c5_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> GOLD_BLOCK_6 = BLOCKS.register("c6_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> GOLD_BLOCK_7 = BLOCKS.register("c7_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> GOLD_BLOCK_8 = BLOCKS.register("c8_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> GOLD_BLOCK_9 = BLOCKS.register("c9_gold_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Lapis Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> LAPIS_BLOCK_0 = BLOCKS.register("c0_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> LAPIS_BLOCK_1 = BLOCKS.register("c1_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> LAPIS_BLOCK_2 = BLOCKS.register("c2_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> LAPIS_BLOCK_3 = BLOCKS.register("c3_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> LAPIS_BLOCK_4 = BLOCKS.register("c4_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> LAPIS_BLOCK_5 = BLOCKS.register("c5_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> LAPIS_BLOCK_6 = BLOCKS.register("c6_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> LAPIS_BLOCK_7 = BLOCKS.register("c7_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> LAPIS_BLOCK_8 = BLOCKS.register("c8_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> LAPIS_BLOCK_9 = BLOCKS.register("c9_lapis_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.LAPIS_BLOCK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Redstone Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> REDSTONE_BLOCK_0 = BLOCKS.register("c0_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> REDSTONE_BLOCK_1 = BLOCKS.register("c1_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> REDSTONE_BLOCK_2 = BLOCKS.register("c2_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> REDSTONE_BLOCK_3 = BLOCKS.register("c3_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> REDSTONE_BLOCK_4 = BLOCKS.register("c4_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> REDSTONE_BLOCK_5 = BLOCKS.register("c5_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> REDSTONE_BLOCK_6 = BLOCKS.register("c6_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> REDSTONE_BLOCK_7 = BLOCKS.register("c7_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> REDSTONE_BLOCK_8 = BLOCKS.register("c8_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> REDSTONE_BLOCK_9 = BLOCKS.register("c9_redstone_block", () -> new CustomRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Coal Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> COAL_BLOCK_0 = BLOCKS.register("c0_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> COAL_BLOCK_1 = BLOCKS.register("c1_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> COAL_BLOCK_2 = BLOCKS.register("c2_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> COAL_BLOCK_3 = BLOCKS.register("c3_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> COAL_BLOCK_4 = BLOCKS.register("c4_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> COAL_BLOCK_5 = BLOCKS.register("c5_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> COAL_BLOCK_6 = BLOCKS.register("c6_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> COAL_BLOCK_7 = BLOCKS.register("c7_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> COAL_BLOCK_8 = BLOCKS.register("c8_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> COAL_BLOCK_9 = BLOCKS.register("c9_coal_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Slime Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SLIME_BLOCK_0 = BLOCKS.register("c0_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion(), 0));
    public static final RegistryObject<Block> SLIME_BLOCK_1 = BLOCKS.register("c1_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion(), 1));
    public static final RegistryObject<Block> SLIME_BLOCK_2 = BLOCKS.register("c2_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion(), 2));
    public static final RegistryObject<Block> SLIME_BLOCK_3 = BLOCKS.register("c3_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion(), 3));
    public static final RegistryObject<Block> SLIME_BLOCK_4 = BLOCKS.register("c4_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion(), 4));
    public static final RegistryObject<Block> SLIME_BLOCK_5 = BLOCKS.register("c5_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion(), 5));
    public static final RegistryObject<Block> SLIME_BLOCK_6 = BLOCKS.register("c6_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion(), 6));
    public static final RegistryObject<Block> SLIME_BLOCK_7 = BLOCKS.register("c7_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion(), 7));
    public static final RegistryObject<Block> SLIME_BLOCK_8 = BLOCKS.register("c8_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion(), 8));
    public static final RegistryObject<Block> SLIME_BLOCK_9 = BLOCKS.register("c9_slime_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Honey Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> HONEY_BLOCK_0 = BLOCKS.register("c0_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion().speedFactor(0.4F).jumpFactor(0.5F), 0));
    public static final RegistryObject<Block> HONEY_BLOCK_1 = BLOCKS.register("c1_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[2], RESISTANCE[0]).noOcclusion().speedFactor(0.375F).jumpFactor(0.525F), 1));
    public static final RegistryObject<Block> HONEY_BLOCK_2 = BLOCKS.register("c2_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion().speedFactor(0.35F).jumpFactor(0.55F), 2));
    public static final RegistryObject<Block> HONEY_BLOCK_3 = BLOCKS.register("c3_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[3], RESISTANCE[1]).noOcclusion().speedFactor(0.325F).jumpFactor(0.575F), 3));
    public static final RegistryObject<Block> HONEY_BLOCK_4 = BLOCKS.register("c4_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion().speedFactor(0.3F).jumpFactor(0.6F), 4));
    public static final RegistryObject<Block> HONEY_BLOCK_5 = BLOCKS.register("c5_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[4], RESISTANCE[2]).noOcclusion().speedFactor(0.275F).jumpFactor(0.625F), 5));
    public static final RegistryObject<Block> HONEY_BLOCK_6 = BLOCKS.register("c6_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion().speedFactor(0.25F).jumpFactor(0.65F), 6));
    public static final RegistryObject<Block> HONEY_BLOCK_7 = BLOCKS.register("c7_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[5], RESISTANCE[3]).noOcclusion().speedFactor(0.225F).jumpFactor(0.675F), 7));
    public static final RegistryObject<Block> HONEY_BLOCK_8 = BLOCKS.register("c8_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion().speedFactor(0.2F).jumpFactor(0.7F), 8));
    public static final RegistryObject<Block> HONEY_BLOCK_9 = BLOCKS.register("c9_honey_block", () -> new CustomSlimeBlock(BlockBehaviour.Properties.copy(Blocks.HONEY_BLOCK).strength(HARDNESS[6], RESISTANCE[4]).noOcclusion().speedFactor(0.175F).jumpFactor(0.725F), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Bricks
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BRICKS_0 = BLOCKS.register("c0_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> BRICKS_1 = BLOCKS.register("c1_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> BRICKS_2 = BLOCKS.register("c2_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> BRICKS_3 = BLOCKS.register("c3_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> BRICKS_4 = BLOCKS.register("c4_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> BRICKS_5 = BLOCKS.register("c5_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> BRICKS_6 = BLOCKS.register("c6_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> BRICKS_7 = BLOCKS.register("c7_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> BRICKS_8 = BLOCKS.register("c8_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> BRICKS_9 = BLOCKS.register("c9_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BRICKS).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Stone Bricks
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STONE_BRICKS_0 = BLOCKS.register("c0_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> STONE_BRICKS_1 = BLOCKS.register("c1_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> STONE_BRICKS_2 = BLOCKS.register("c2_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> STONE_BRICKS_3 = BLOCKS.register("c3_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> STONE_BRICKS_4 = BLOCKS.register("c4_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> STONE_BRICKS_5 = BLOCKS.register("c5_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> STONE_BRICKS_6 = BLOCKS.register("c6_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> STONE_BRICKS_7 = BLOCKS.register("c7_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> STONE_BRICKS_8 = BLOCKS.register("c8_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> STONE_BRICKS_9 = BLOCKS.register("c9_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Netherrack
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> NETHERRACK_0 = BLOCKS.register("c0_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> NETHERRACK_1 = BLOCKS.register("c1_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> NETHERRACK_2 = BLOCKS.register("c2_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> NETHERRACK_3 = BLOCKS.register("c3_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> NETHERRACK_4 = BLOCKS.register("c4_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> NETHERRACK_5 = BLOCKS.register("c5_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> NETHERRACK_6 = BLOCKS.register("c6_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> NETHERRACK_7 = BLOCKS.register("c7_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> NETHERRACK_8 = BLOCKS.register("c8_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> NETHERRACK_9 = BLOCKS.register("c9_netherrack", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Bricks
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> NETHER_BRICKS_0 = BLOCKS.register("c0_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> NETHER_BRICKS_1 = BLOCKS.register("c1_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> NETHER_BRICKS_2 = BLOCKS.register("c2_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> NETHER_BRICKS_3 = BLOCKS.register("c3_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> NETHER_BRICKS_4 = BLOCKS.register("c4_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> NETHER_BRICKS_5 = BLOCKS.register("c5_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> NETHER_BRICKS_6 = BLOCKS.register("c6_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> NETHER_BRICKS_7 = BLOCKS.register("c7_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> NETHER_BRICKS_8 = BLOCKS.register("c8_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> NETHER_BRICKS_9 = BLOCKS.register("c9_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Red Nether Bricks
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RED_NETHER_BRICKS_0 = BLOCKS.register("c0_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_1 = BLOCKS.register("c1_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_2 = BLOCKS.register("c2_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_3 = BLOCKS.register("c3_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_4 = BLOCKS.register("c4_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_5 = BLOCKS.register("c5_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_6 = BLOCKS.register("c6_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_7 = BLOCKS.register("c7_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_8 = BLOCKS.register("c8_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> RED_NETHER_BRICKS_9 = BLOCKS.register("c9_red_nether_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Nether Wart Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> NETHER_WART_BLOCK_0 = BLOCKS.register("c0_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_1 = BLOCKS.register("c1_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_2 = BLOCKS.register("c2_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_3 = BLOCKS.register("c3_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_4 = BLOCKS.register("c4_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_5 = BLOCKS.register("c5_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_6 = BLOCKS.register("c6_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_7 = BLOCKS.register("c7_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_8 = BLOCKS.register("c8_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> NETHER_WART_BLOCK_9 = BLOCKS.register("c9_nether_wart_block", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.NETHER_WART_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Soul Sand
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SOUL_SAND_0 = BLOCKS.register("c0_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops().speedFactor(0.4f), 0));
    public static final RegistryObject<Block> SOUL_SAND_1 = BLOCKS.register("c1_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops().speedFactor(0.4f), 1));
    public static final RegistryObject<Block> SOUL_SAND_2 = BLOCKS.register("c2_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops().speedFactor(0.35f), 2));
    public static final RegistryObject<Block> SOUL_SAND_3 = BLOCKS.register("c3_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops().speedFactor(0.3f), 3));
    public static final RegistryObject<Block> SOUL_SAND_4 = BLOCKS.register("c4_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops().speedFactor(0.25f), 4));
    public static final RegistryObject<Block> SOUL_SAND_5 = BLOCKS.register("c5_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops().speedFactor(0.2f), 5));
    public static final RegistryObject<Block> SOUL_SAND_6 = BLOCKS.register("c6_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops().speedFactor(0.25f), 6));
    public static final RegistryObject<Block> SOUL_SAND_7 = BLOCKS.register("c7_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops().speedFactor(0.1f), 7));
    public static final RegistryObject<Block> SOUL_SAND_8 = BLOCKS.register("c8_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops().speedFactor(0.05f), 8));
    public static final RegistryObject<Block> SOUL_SAND_9 = BLOCKS.register("c9_soul_sand", () -> new CustomSoulSandBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SAND).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops().speedFactor(0.01f), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Soul Soil
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SOUL_SOIL_0 = BLOCKS.register("c0_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> SOUL_SOIL_1 = BLOCKS.register("c1_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> SOUL_SOIL_2 = BLOCKS.register("c2_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> SOUL_SOIL_3 = BLOCKS.register("c3_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> SOUL_SOIL_4 = BLOCKS.register("c4_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> SOUL_SOIL_5 = BLOCKS.register("c5_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> SOUL_SOIL_6 = BLOCKS.register("c6_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> SOUL_SOIL_7 = BLOCKS.register("c7_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> SOUL_SOIL_8 = BLOCKS.register("c8_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> SOUL_SOIL_9 = BLOCKS.register("c9_soul_soil", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_SOIL).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region End Stone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> END_STONE_0 = BLOCKS.register("c0_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> END_STONE_1 = BLOCKS.register("c1_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> END_STONE_2 = BLOCKS.register("c2_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> END_STONE_3 = BLOCKS.register("c3_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> END_STONE_4 = BLOCKS.register("c4_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> END_STONE_5 = BLOCKS.register("c5_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> END_STONE_6 = BLOCKS.register("c6_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> END_STONE_7 = BLOCKS.register("c7_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> END_STONE_8 = BLOCKS.register("c8_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> END_STONE_9 = BLOCKS.register("c9_end_stone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region End Stone Bricks
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> END_STONE_BRICKS_0 = BLOCKS.register("c0_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> END_STONE_BRICKS_1 = BLOCKS.register("c1_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> END_STONE_BRICKS_2 = BLOCKS.register("c2_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> END_STONE_BRICKS_3 = BLOCKS.register("c3_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> END_STONE_BRICKS_4 = BLOCKS.register("c4_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> END_STONE_BRICKS_5 = BLOCKS.register("c5_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> END_STONE_BRICKS_6 = BLOCKS.register("c6_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> END_STONE_BRICKS_7 = BLOCKS.register("c7_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> END_STONE_BRICKS_8 = BLOCKS.register("c8_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> END_STONE_BRICKS_9 = BLOCKS.register("c9_end_stone_bricks", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Blackstone
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BLACKSTONE_0 = BLOCKS.register("c0_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> BLACKSTONE_1 = BLOCKS.register("c1_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> BLACKSTONE_2 = BLOCKS.register("c2_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> BLACKSTONE_3 = BLOCKS.register("c3_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> BLACKSTONE_4 = BLOCKS.register("c4_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> BLACKSTONE_5 = BLOCKS.register("c5_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> BLACKSTONE_6 = BLOCKS.register("c6_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> BLACKSTONE_7 = BLOCKS.register("c7_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> BLACKSTONE_8 = BLOCKS.register("c8_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> BLACKSTONE_9 = BLOCKS.register("c9_blackstone", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Deepslate
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> DEEPSLATE_0 = BLOCKS.register("c0_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> DEEPSLATE_1 = BLOCKS.register("c1_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> DEEPSLATE_2 = BLOCKS.register("c2_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> DEEPSLATE_3 = BLOCKS.register("c3_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> DEEPSLATE_4 = BLOCKS.register("c4_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> DEEPSLATE_5 = BLOCKS.register("c5_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> DEEPSLATE_6 = BLOCKS.register("c6_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> DEEPSLATE_7 = BLOCKS.register("c7_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> DEEPSLATE_8 = BLOCKS.register("c8_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> DEEPSLATE_9 = BLOCKS.register("c9_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Cobbled Deepslate
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_0 = BLOCKS.register("c0_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_1 = BLOCKS.register("c1_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_2 = BLOCKS.register("c2_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_3 = BLOCKS.register("c3_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_4 = BLOCKS.register("c4_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_5 = BLOCKS.register("c5_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_6 = BLOCKS.register("c6_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_7 = BLOCKS.register("c7_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_8 = BLOCKS.register("c8_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_9 = BLOCKS.register("c9_cobbled_deepslate", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Tuff
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> TUFF_0 = BLOCKS.register("c0_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> TUFF_1 = BLOCKS.register("c1_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> TUFF_2 = BLOCKS.register("c2_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> TUFF_3 = BLOCKS.register("c3_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> TUFF_4 = BLOCKS.register("c4_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> TUFF_5 = BLOCKS.register("c5_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> TUFF_6 = BLOCKS.register("c6_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> TUFF_7 = BLOCKS.register("c7_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> TUFF_8 = BLOCKS.register("c8_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> TUFF_9 = BLOCKS.register("c9_tuff", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.TUFF).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Basalt
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BASALT_0 = BLOCKS.register("c0_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[0], RESISTANCE[0]).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> BASALT_1 = BLOCKS.register("c1_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[1], RESISTANCE[1]).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> BASALT_2 = BLOCKS.register("c2_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[2], RESISTANCE[2]).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> BASALT_3 = BLOCKS.register("c3_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[3], RESISTANCE[3]).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> BASALT_4 = BLOCKS.register("c4_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[4], RESISTANCE[4]).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> BASALT_5 = BLOCKS.register("c5_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[5], RESISTANCE[5]).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> BASALT_6 = BLOCKS.register("c6_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[6], RESISTANCE[6]).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> BASALT_7 = BLOCKS.register("c7_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[7], RESISTANCE[7]).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> BASALT_8 = BLOCKS.register("c8_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[8], RESISTANCE[8]).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> BASALT_9 = BLOCKS.register("c9_basalt", () -> new CustomRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BASALT).strength(HARDNESS[9], RESISTANCE[9]).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Obsidian
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> OBSIDIAN_0 = BLOCKS.register("c0_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(75, 1300).requiresCorrectToolForDrops(), 0));
    public static final RegistryObject<Block> OBSIDIAN_1 = BLOCKS.register("c1_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(100, 1400).requiresCorrectToolForDrops(), 1));
    public static final RegistryObject<Block> OBSIDIAN_2 = BLOCKS.register("c2_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(125, 1500).requiresCorrectToolForDrops(), 2));
    public static final RegistryObject<Block> OBSIDIAN_3 = BLOCKS.register("c3_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(150, 1600).requiresCorrectToolForDrops(), 3));
    public static final RegistryObject<Block> OBSIDIAN_4 = BLOCKS.register("c4_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(175, 1700).requiresCorrectToolForDrops(), 4));
    public static final RegistryObject<Block> OBSIDIAN_5 = BLOCKS.register("c5_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(200, 1800).requiresCorrectToolForDrops(), 5));
    public static final RegistryObject<Block> OBSIDIAN_6 = BLOCKS.register("c6_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(225, 2000).requiresCorrectToolForDrops(), 6));
    public static final RegistryObject<Block> OBSIDIAN_7 = BLOCKS.register("c7_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(250, 2500).requiresCorrectToolForDrops(), 7));
    public static final RegistryObject<Block> OBSIDIAN_8 = BLOCKS.register("c8_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(275, 2750).requiresCorrectToolForDrops(), 8));
    public static final RegistryObject<Block> OBSIDIAN_9 = BLOCKS.register("c9_obsidian", () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).strength(300, 3000).requiresCorrectToolForDrops(), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region RAW_IRON_BLOCK
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RAW_IRON_BLOCK_0 = BLOCKS.register("c0_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_1 = BLOCKS.register("c1_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_2 = BLOCKS.register("c2_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_3 = BLOCKS.register("c3_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_4 = BLOCKS.register("c4_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_5 = BLOCKS.register("c5_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_6 = BLOCKS.register("c6_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_7 = BLOCKS.register("c7_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_8 = BLOCKS.register("c8_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> RAW_IRON_BLOCK_9 = BLOCKS.register("c9_" + "RAW_IRON_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region Raw Copper Block
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_0 = BLOCKS.register("c0_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_1 = BLOCKS.register("c1_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_2 = BLOCKS.register("c2_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_3 = BLOCKS.register("c3_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_4 = BLOCKS.register("c4_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_5 = BLOCKS.register("c5_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_6 = BLOCKS.register("c6_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_7 = BLOCKS.register("c7_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_8 = BLOCKS.register("c8_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> RAW_COPPER_BLOCK_9 = BLOCKS.register("c9_" + "RAW_COPPER_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region RAW_GOLD_BLOCK
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_0 = BLOCKS.register("c0_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_1 = BLOCKS.register("c1_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_2 = BLOCKS.register("c2_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_3 = BLOCKS.register("c3_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_4 = BLOCKS.register("c4_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_5 = BLOCKS.register("c5_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_6 = BLOCKS.register("c6_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_7 = BLOCKS.register("c7_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_8 = BLOCKS.register("c8_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> RAW_GOLD_BLOCK_9 = BLOCKS.register("c9_" + "RAW_GOLD_BLOCK".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.RAW_GOLD_BLOCK).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region MUD
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> MUD_0 = BLOCKS.register("c0_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[2], RESISTANCE[0]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 0));
    public static final RegistryObject<Block> MUD_1 = BLOCKS.register("c1_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[2], RESISTANCE[0]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 1));
    public static final RegistryObject<Block> MUD_2 = BLOCKS.register("c2_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[3], RESISTANCE[1]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 2));
    public static final RegistryObject<Block> MUD_3 = BLOCKS.register("c3_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[3], RESISTANCE[1]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 3));
    public static final RegistryObject<Block> MUD_4 = BLOCKS.register("c4_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[4], RESISTANCE[2]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 4));
    public static final RegistryObject<Block> MUD_5 = BLOCKS.register("c5_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[4], RESISTANCE[2]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 5));
    public static final RegistryObject<Block> MUD_6 = BLOCKS.register("c6_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[5], RESISTANCE[3]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 6));
    public static final RegistryObject<Block> MUD_7 = BLOCKS.register("c7_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[5], RESISTANCE[3]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 7));
    public static final RegistryObject<Block> MUD_8 = BLOCKS.register("c8_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[6], RESISTANCE[4]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 8));
    public static final RegistryObject<Block> MUD_9 = BLOCKS.register("c9_" + "MUD".toLowerCase(), () -> new CustomMudBlock(BlockBehaviour.Properties.copy(Blocks.MUD).strength(HARDNESS[6], RESISTANCE[4]).mapColor(MapColor.TERRACOTTA_CYAN).isValidSpawn(CompressedBlocks::isTrue).isRedstoneConductor(CompressedBlocks::isTrue).isViewBlocking(CompressedBlocks::isTrue).isSuffocating(CompressedBlocks::isTrue).sound(SoundType.MUD), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region OAK_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> OAK_LOG_0 = BLOCKS.register("c0_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> OAK_LOG_1 = BLOCKS.register("c1_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> OAK_LOG_2 = BLOCKS.register("c2_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> OAK_LOG_3 = BLOCKS.register("c3_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> OAK_LOG_4 = BLOCKS.register("c4_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> OAK_LOG_5 = BLOCKS.register("c5_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> OAK_LOG_6 = BLOCKS.register("c6_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> OAK_LOG_7 = BLOCKS.register("c7_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> OAK_LOG_8 = BLOCKS.register("c8_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> OAK_LOG_9 = BLOCKS.register("c9_" + "OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region SPRUCE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SPRUCE_LOG_0 = BLOCKS.register("c0_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> SPRUCE_LOG_1 = BLOCKS.register("c1_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> SPRUCE_LOG_2 = BLOCKS.register("c2_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> SPRUCE_LOG_3 = BLOCKS.register("c3_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> SPRUCE_LOG_4 = BLOCKS.register("c4_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> SPRUCE_LOG_5 = BLOCKS.register("c5_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> SPRUCE_LOG_6 = BLOCKS.register("c6_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> SPRUCE_LOG_7 = BLOCKS.register("c7_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> SPRUCE_LOG_8 = BLOCKS.register("c8_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> SPRUCE_LOG_9 = BLOCKS.register("c9_" + "SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region BIRCH_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BIRCH_LOG_0 = BLOCKS.register("c0_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> BIRCH_LOG_1 = BLOCKS.register("c1_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> BIRCH_LOG_2 = BLOCKS.register("c2_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> BIRCH_LOG_3 = BLOCKS.register("c3_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> BIRCH_LOG_4 = BLOCKS.register("c4_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> BIRCH_LOG_5 = BLOCKS.register("c5_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> BIRCH_LOG_6 = BLOCKS.register("c6_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> BIRCH_LOG_7 = BLOCKS.register("c7_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> BIRCH_LOG_8 = BLOCKS.register("c8_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> BIRCH_LOG_9 = BLOCKS.register("c9_" + "BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.QUARTZ, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region JUNGLE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> JUNGLE_LOG_0 = BLOCKS.register("c0_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> JUNGLE_LOG_1 = BLOCKS.register("c1_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> JUNGLE_LOG_2 = BLOCKS.register("c2_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> JUNGLE_LOG_3 = BLOCKS.register("c3_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> JUNGLE_LOG_4 = BLOCKS.register("c4_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> JUNGLE_LOG_5 = BLOCKS.register("c5_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> JUNGLE_LOG_6 = BLOCKS.register("c6_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> JUNGLE_LOG_7 = BLOCKS.register("c7_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> JUNGLE_LOG_8 = BLOCKS.register("c8_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> JUNGLE_LOG_9 = BLOCKS.register("c9_" + "JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region ACACIA_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> ACACIA_LOG_0 = BLOCKS.register("c0_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> ACACIA_LOG_1 = BLOCKS.register("c1_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> ACACIA_LOG_2 = BLOCKS.register("c2_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> ACACIA_LOG_3 = BLOCKS.register("c3_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> ACACIA_LOG_4 = BLOCKS.register("c4_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> ACACIA_LOG_5 = BLOCKS.register("c5_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> ACACIA_LOG_6 = BLOCKS.register("c6_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> ACACIA_LOG_7 = BLOCKS.register("c7_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> ACACIA_LOG_8 = BLOCKS.register("c8_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> ACACIA_LOG_9 = BLOCKS.register("c9_" + "ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.STONE, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region DARK_OAK_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> DARK_OAK_LOG_0 = BLOCKS.register("c0_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> DARK_OAK_LOG_1 = BLOCKS.register("c1_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> DARK_OAK_LOG_2 = BLOCKS.register("c2_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> DARK_OAK_LOG_3 = BLOCKS.register("c3_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> DARK_OAK_LOG_4 = BLOCKS.register("c4_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> DARK_OAK_LOG_5 = BLOCKS.register("c5_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> DARK_OAK_LOG_6 = BLOCKS.register("c6_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> DARK_OAK_LOG_7 = BLOCKS.register("c7_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> DARK_OAK_LOG_8 = BLOCKS.register("c8_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> DARK_OAK_LOG_9 = BLOCKS.register("c9_" + "DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region MANGROVE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> MANGROVE_LOG_0 = BLOCKS.register("c0_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> MANGROVE_LOG_1 = BLOCKS.register("c1_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> MANGROVE_LOG_2 = BLOCKS.register("c2_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> MANGROVE_LOG_3 = BLOCKS.register("c3_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> MANGROVE_LOG_4 = BLOCKS.register("c4_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> MANGROVE_LOG_5 = BLOCKS.register("c5_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> MANGROVE_LOG_6 = BLOCKS.register("c6_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> MANGROVE_LOG_7 = BLOCKS.register("c7_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> MANGROVE_LOG_8 = BLOCKS.register("c8_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> MANGROVE_LOG_9 = BLOCKS.register("c9_" + "MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region CHERRY_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> CHERRY_LOG_0 = BLOCKS.register("c0_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> CHERRY_LOG_1 = BLOCKS.register("c1_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> CHERRY_LOG_2 = BLOCKS.register("c2_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> CHERRY_LOG_3 = BLOCKS.register("c3_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> CHERRY_LOG_4 = BLOCKS.register("c4_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> CHERRY_LOG_5 = BLOCKS.register("c5_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> CHERRY_LOG_6 = BLOCKS.register("c6_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> CHERRY_LOG_7 = BLOCKS.register("c7_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> CHERRY_LOG_8 = BLOCKS.register("c8_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> CHERRY_LOG_9 = BLOCKS.register("c9_" + "CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_OAK_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_OAK_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.WOOD, MapColor.WOOD, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_SPRUCE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_SPRUCE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_SPRUCE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.PODZOL, MapColor.PODZOL, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_BIRCH_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_BIRCH_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_BIRCH_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.SAND, MapColor.SAND, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_JUNGLE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_JUNGLE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_JUNGLE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.DIRT, MapColor.DIRT, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_ACACIA_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_ACACIA_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_ACACIA_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_ORANGE, MapColor.COLOR_ORANGE, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_DARK_OAK_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_DARK_OAK_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_DARK_OAK_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_BROWN, MapColor.COLOR_BROWN, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_MANGROVE_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_MANGROVE_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_MANGROVE_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region STRIPPED_CHERRY_LOG
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_0 = BLOCKS.register("c0_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[2], RESISTANCE[0], 0));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_1 = BLOCKS.register("c1_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[2], RESISTANCE[0], 1));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_2 = BLOCKS.register("c2_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[3], RESISTANCE[1], 2));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_3 = BLOCKS.register("c3_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[3], RESISTANCE[1], 3));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_4 = BLOCKS.register("c4_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[4], RESISTANCE[2], 4));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_5 = BLOCKS.register("c5_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[4], RESISTANCE[2], 5));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_6 = BLOCKS.register("c6_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[5], RESISTANCE[3], 6));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_7 = BLOCKS.register("c7_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[5], RESISTANCE[3], 7));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_8 = BLOCKS.register("c8_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[6], RESISTANCE[4], 8));
    public static final RegistryObject<Block> STRIPPED_CHERRY_LOG_9 = BLOCKS.register("c9_" + "STRIPPED_CHERRY_LOG".toLowerCase(), () -> new CustomRotatedPillarBlock(MapColor.COLOR_RED, MapColor.COLOR_RED, HARDNESS[6], RESISTANCE[4], 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region OAK_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> OAK_PLANKS_0 = BLOCKS.register("c0_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> OAK_PLANKS_1 = BLOCKS.register("c1_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> OAK_PLANKS_2 = BLOCKS.register("c2_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> OAK_PLANKS_3 = BLOCKS.register("c3_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> OAK_PLANKS_4 = BLOCKS.register("c4_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> OAK_PLANKS_5 = BLOCKS.register("c5_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> OAK_PLANKS_6 = BLOCKS.register("c6_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> OAK_PLANKS_7 = BLOCKS.register("c7_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> OAK_PLANKS_8 = BLOCKS.register("c8_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> OAK_PLANKS_9 = BLOCKS.register("c9_" + "OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region SPRUCE_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> SPRUCE_PLANKS_0 = BLOCKS.register("c0_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> SPRUCE_PLANKS_1 = BLOCKS.register("c1_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> SPRUCE_PLANKS_2 = BLOCKS.register("c2_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> SPRUCE_PLANKS_3 = BLOCKS.register("c3_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> SPRUCE_PLANKS_4 = BLOCKS.register("c4_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> SPRUCE_PLANKS_5 = BLOCKS.register("c5_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> SPRUCE_PLANKS_6 = BLOCKS.register("c6_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> SPRUCE_PLANKS_7 = BLOCKS.register("c7_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> SPRUCE_PLANKS_8 = BLOCKS.register("c8_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> SPRUCE_PLANKS_9 = BLOCKS.register("c9_" + "SPRUCE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region BIRCH_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BIRCH_PLANKS_0 = BLOCKS.register("c0_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> BIRCH_PLANKS_1 = BLOCKS.register("c1_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> BIRCH_PLANKS_2 = BLOCKS.register("c2_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> BIRCH_PLANKS_3 = BLOCKS.register("c3_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> BIRCH_PLANKS_4 = BLOCKS.register("c4_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> BIRCH_PLANKS_5 = BLOCKS.register("c5_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> BIRCH_PLANKS_6 = BLOCKS.register("c6_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> BIRCH_PLANKS_7 = BLOCKS.register("c7_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> BIRCH_PLANKS_8 = BLOCKS.register("c8_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> BIRCH_PLANKS_9 = BLOCKS.register("c9_" + "BIRCH_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region JUNGLE_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> JUNGLE_PLANKS_0 = BLOCKS.register("c0_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> JUNGLE_PLANKS_1 = BLOCKS.register("c1_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> JUNGLE_PLANKS_2 = BLOCKS.register("c2_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> JUNGLE_PLANKS_3 = BLOCKS.register("c3_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> JUNGLE_PLANKS_4 = BLOCKS.register("c4_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> JUNGLE_PLANKS_5 = BLOCKS.register("c5_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> JUNGLE_PLANKS_6 = BLOCKS.register("c6_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> JUNGLE_PLANKS_7 = BLOCKS.register("c7_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> JUNGLE_PLANKS_8 = BLOCKS.register("c8_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> JUNGLE_PLANKS_9 = BLOCKS.register("c9_" + "JUNGLE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region ACACIA_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> ACACIA_PLANKS_0 = BLOCKS.register("c0_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> ACACIA_PLANKS_1 = BLOCKS.register("c1_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> ACACIA_PLANKS_2 = BLOCKS.register("c2_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> ACACIA_PLANKS_3 = BLOCKS.register("c3_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> ACACIA_PLANKS_4 = BLOCKS.register("c4_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> ACACIA_PLANKS_5 = BLOCKS.register("c5_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> ACACIA_PLANKS_6 = BLOCKS.register("c6_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> ACACIA_PLANKS_7 = BLOCKS.register("c7_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> ACACIA_PLANKS_8 = BLOCKS.register("c8_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> ACACIA_PLANKS_9 = BLOCKS.register("c9_" + "ACACIA_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region DARK_OAK_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> DARK_OAK_PLANKS_0 = BLOCKS.register("c0_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_1 = BLOCKS.register("c1_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_2 = BLOCKS.register("c2_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_3 = BLOCKS.register("c3_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_4 = BLOCKS.register("c4_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_5 = BLOCKS.register("c5_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_6 = BLOCKS.register("c6_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_7 = BLOCKS.register("c7_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_8 = BLOCKS.register("c8_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> DARK_OAK_PLANKS_9 = BLOCKS.register("c9_" + "DARK_OAK_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region MANGROVE_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> MANGROVE_PLANKS_0 = BLOCKS.register("c0_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> MANGROVE_PLANKS_1 = BLOCKS.register("c1_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> MANGROVE_PLANKS_2 = BLOCKS.register("c2_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> MANGROVE_PLANKS_3 = BLOCKS.register("c3_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> MANGROVE_PLANKS_4 = BLOCKS.register("c4_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> MANGROVE_PLANKS_5 = BLOCKS.register("c5_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> MANGROVE_PLANKS_6 = BLOCKS.register("c6_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> MANGROVE_PLANKS_7 = BLOCKS.register("c7_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> MANGROVE_PLANKS_8 = BLOCKS.register("c8_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> MANGROVE_PLANKS_9 = BLOCKS.register("c9_" + "MANGROVE_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region MANGROVE_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> CHERRY_PLANKS_0 = BLOCKS.register("c0_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> CHERRY_PLANKS_1 = BLOCKS.register("c1_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> CHERRY_PLANKS_2 = BLOCKS.register("c2_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> CHERRY_PLANKS_3 = BLOCKS.register("c3_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> CHERRY_PLANKS_4 = BLOCKS.register("c4_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> CHERRY_PLANKS_5 = BLOCKS.register("c5_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> CHERRY_PLANKS_6 = BLOCKS.register("c6_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> CHERRY_PLANKS_7 = BLOCKS.register("c7_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> CHERRY_PLANKS_8 = BLOCKS.register("c8_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> CHERRY_PLANKS_9 = BLOCKS.register("c9_" + "CHERRY_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region BAMBOO_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BAMBOO_PLANKS_0 = BLOCKS.register("c0_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> BAMBOO_PLANKS_1 = BLOCKS.register("c1_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> BAMBOO_PLANKS_2 = BLOCKS.register("c2_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> BAMBOO_PLANKS_3 = BLOCKS.register("c3_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> BAMBOO_PLANKS_4 = BLOCKS.register("c4_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> BAMBOO_PLANKS_5 = BLOCKS.register("c5_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> BAMBOO_PLANKS_6 = BLOCKS.register("c6_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> BAMBOO_PLANKS_7 = BLOCKS.register("c7_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> BAMBOO_PLANKS_8 = BLOCKS.register("c8_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> BAMBOO_PLANKS_9 = BLOCKS.register("c9_" + "BAMBOO_PLANKS".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    //region BAMBOO_MOSAIC_PLANKS
    //------------------------------------------------------------------------------------------------------------------
    public static final RegistryObject<Block> BAMBOO_MOSAIC_0 = BLOCKS.register("c0_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[2], RESISTANCE[0]), 0));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_1 = BLOCKS.register("c1_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[2], RESISTANCE[0]), 1));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_2 = BLOCKS.register("c2_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[3], RESISTANCE[1]), 2));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_3 = BLOCKS.register("c3_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[3], RESISTANCE[1]), 3));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_4 = BLOCKS.register("c4_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[4], RESISTANCE[2]), 4));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_5 = BLOCKS.register("c5_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[4], RESISTANCE[2]), 5));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_6 = BLOCKS.register("c6_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[5], RESISTANCE[3]), 6));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_7 = BLOCKS.register("c7_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[5], RESISTANCE[3]), 7));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_8 = BLOCKS.register("c8_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[6], RESISTANCE[4]), 8));
    public static final RegistryObject<Block> BAMBOO_MOSAIC_9 = BLOCKS.register("c9_" + "BAMBOO_MOSAIC".toLowerCase(), () -> new CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_MOSAIC).strength(HARDNESS[6], RESISTANCE[4]), 9));
    //------------------------------------------------------------------------------------------------------------------
    //endregion
    //------------------------------------------------------------------------------------------------------------------
    
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return true;
    }
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
}
