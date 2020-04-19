package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.block.CompressedBlock;
import com.github.sa_shiro.compressedblocks.block.Blocks;
import com.github.sa_shiro.compressedblocks.init.Init;
import com.github.sa_shiro.compressedblocks.item.Items;
import com.github.sa_shiro.compressedblocks.item.EnumItemTier;
import com.github.sa_shiro.compressedblocks.item.ToolItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Objects;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RegistryEvents {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(
                Items.COMPRESSED_STICK = new Item(new Item.Properties().group(Init.compressedGroup)).setRegistryName("compressed_stick"),

                Items.COMPRESSED_WOOD = new Item(new Item.Properties().group(Init.compressedGroup)).setRegistryName("compressed_wood"),
                Items.COMPRESSED_IRON = new Item(new Item.Properties().group(Init.compressedGroup)).setRegistryName("compressed_iron"),
                Items.COMPRESSED_GOLD = new Item(new Item.Properties().group(Init.compressedGroup)).setRegistryName("compressed_gold"),
                Items.COMPRESSED_DIAMOND = new Item(new Item.Properties().group(Init.compressedGroup)).setRegistryName("compressed_diamond"),

                Items.HARDENED_WOODEN_PICKAXE = new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_WOOD, 1, -2.8F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_wooden_pickaxe"),
                Items.HARDENED_WOODEN_AXE = new ToolItems.HardeneAxe(EnumItemTier.HARDENED_WOOD, 5, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_wooden_axe"),
                Items.HARDENED_WOODEN_SHOVEL = new ToolItems.HardeneShovel(EnumItemTier.HARDENED_WOOD, 1.5F, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_wooden_shovel"),
                Items.HARDENED_WOODEN_HOE = new ToolItems.HardenedHoe(EnumItemTier.HARDENED_WOOD,  0.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_wooden_hoe"),
                Items.HARDENED_WOODEN_SWORD = new ToolItems.HardeneSword(EnumItemTier.HARDENED_WOOD, 3, -2.4F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_wooden_sword"),

                Items.HARDENED_PICKAXE = new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_STONE, 1, -2.8F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_pickaxe"),
                Items.HARDENED_AXE = new ToolItems.HardeneAxe(EnumItemTier.HARDENED_STONE, 5, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_axe"),
                Items.HARDENED_SHOVEL = new ToolItems.HardeneShovel(EnumItemTier.HARDENED_STONE, 1.5F, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_shovel"),
                Items.HARDENED_HOE = new ToolItems.HardenedHoe(EnumItemTier.HARDENED_STONE,  0.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_hoe"),
                Items.HARDENED_SWORD = new ToolItems.HardeneSword(EnumItemTier.HARDENED_STONE, 4, -2.4F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_sword"),

                Items.HARDENED_IRON_PICKAXE = new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_IRON, 1, -2.8F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_iron_pickaxe"),
                Items.HARDENED_IRON_AXE = new ToolItems.HardeneAxe(EnumItemTier.HARDENED_IRON, 6, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_iron_axe"),
                Items.HARDENED_IRON_SHOVEL = new ToolItems.HardeneShovel(EnumItemTier.HARDENED_IRON, 1.5F, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_iron_shovel"),
                Items.HARDENED_IRON_HOE = new ToolItems.HardenedHoe(EnumItemTier.HARDENED_IRON,  0.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_iron_hoe"),
                Items.HARDENED_IRON_SWORD = new ToolItems.HardeneSword(EnumItemTier.HARDENED_IRON, 4, -2.4F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_iron_sword"),

                Items.HARDENED_GOLDEN_PICKAXE = new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_GOLD, 1, -2.8F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_golden_pickaxe"),
                Items.HARDENED_GOLDEN_AXE = new ToolItems.HardeneAxe(EnumItemTier.HARDENED_GOLD, 6, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_golden_axe"),
                Items.HARDENED_GOLDEN_SHOVEL = new ToolItems.HardeneShovel(EnumItemTier.HARDENED_GOLD, 1.5F, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_golden_shovel"),
                Items.HARDENED_GOLDEN_HOE = new ToolItems.HardenedHoe(EnumItemTier.HARDENED_GOLD,  0.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_golden_hoe"),
                Items.HARDENED_GOLDEN_SWORD = new ToolItems.HardeneSword(EnumItemTier.HARDENED_GOLD, 4, -2.4F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_golden_sword"),

                Items.HARDENED_DIAMOND_PICKAXE = new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_DIAMOND, 1, -2.8F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_diamond_pickaxe"),
                Items.HARDENED_DIAMOND_AXE = new ToolItems.HardeneAxe(EnumItemTier.HARDENED_DIAMOND, 7, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_diamond_axe"),
                Items.HARDENED_DIAMOND_SHOVEL = new ToolItems.HardeneShovel(EnumItemTier.HARDENED_DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_diamond_shovel"),
                Items.HARDENED_DIAMOND_HOE = new ToolItems.HardenedHoe(EnumItemTier.HARDENED_DIAMOND,  0.0F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_diamond_hoe"),
                Items.HARDENED_DIAMOND_SWORD = new ToolItems.HardeneSword(EnumItemTier.HARDENED_DIAMOND, 5, -2.4F, (new Item.Properties()).group(Init.compressedGroup)).setRegistryName("hardened_diamond_sword")
        );
    }

    @SubscribeEvent
    public static void registerCompressedDiamondBlock(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_DIAMOND_BLOCK = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "diamond_block", 2.0f, 35.0f, 0)
        );
    }
    @SubscribeEvent
    public static void registerCompressedDiamondBlockItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_DIAMOND_BLOCK, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_DIAMOND_BLOCK.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedStone(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "stone", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "stone", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "stone", 10.0f, 50.0f, 1)
        );
    }
    @SubscribeEvent
    public static void registerCompressedStoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_STONE.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_STONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedGranite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "granite", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "granite", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "granite", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "granite", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "granite", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "granite", 40.0f, 125.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedGraniteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_GRANITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedDiorite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "diorite", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "diorite", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "diorite", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "diorite", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "diorite", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "diorite", 40.0f, 125.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedDioriteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_DIORITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedAndesite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "andesite", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "andesite", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "andesite", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "andesite", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "andesite", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "andesite", 40.0f, 125.0f, 3)
        );


    }

    @SubscribeEvent
    public static void registerCompressedAndesiteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_ANDESITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedDirt(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 0, "dirt", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 1, "dirt", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 2, "dirt", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 3, "dirt", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 4, "dirt", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 5, "dirt", 40.0f, 125.0f, 3),
                Blocks.Sept.SEPTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 6, "dirt", 50.0f, 200.0f, 3),
                Blocks.Oct.OCTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 7, "dirt", 60.0f, 500.0f, 3),
                Blocks.Mega.MEGA_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 8, "dirt", 70.0f, 60000.0f, 3),
                Blocks.Giga.GIGA_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 9, "dirt", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedDirtItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Sept.SEPTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Sept.SEPTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Oct.OCTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Oct.OCTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Mega.MEGA_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Mega.MEGA_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(Blocks.Giga.GIGA_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(Blocks.Giga.GIGA_COMPRESSED_DIRT.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedCobblestone(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "cobblestone", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "cobblestone", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "cobblestone", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "cobblestone", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "cobblestone", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "cobblestone", 40.0f, 125.0f, 3),
                Blocks.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "cobblestone", 50.0f, 200.0f, 3),
                Blocks.Oct.OCTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "cobblestone", 60.0f, 500.0f, 3),
                Blocks.Mega.MEGA_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "cobblestone", 70.0f, 60000.0f, 3),
                Blocks.Giga.GIGA_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "cobblestone", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedCobblestoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Oct.OCTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Oct.OCTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Mega.MEGA_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Mega.MEGA_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(Blocks.Giga.GIGA_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(Blocks.Giga.GIGA_COMPRESSED_COBBLESTONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "sand", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "sand", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "sand", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 3, "sand", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 4, "sand", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 5, "sand", 40.0f, 125.0f, 3),
                Blocks.Sept.SEPTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 6, "sand", 50.0f, 200.0f, 3),
                Blocks.Oct.OCTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 7, "sand", 60.0f, 500.0f, 3),
                Blocks.Mega.MEGA_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 8, "sand", 70.0f, 60000.0f, 3),
                Blocks.Giga.GIGA_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 9, "sand", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Sept.SEPTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Sept.SEPTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Oct.OCTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Oct.OCTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Mega.MEGA_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Mega.MEGA_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(Blocks.Giga.GIGA_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Giga.GIGA_COMPRESSED_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "red_sand", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "red_sand", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "red_sand", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 3, "red_sand", 20.0f, 75.0f, 2)
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_RED_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedGravel(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 0, "gravel", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 1, "gravel", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 2, "gravel", 10.0f, 50.0f, 1)
        );
    }

    @SubscribeEvent
    public static void registerCompressedGravelItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_GRAVEL.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedNetherrack(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "netherrack", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "netherrack", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "netherrack", 10.0f, 50.0f, 1),
                Blocks.Quad.QUADRUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "netherrack", 20.0f, 75.0f, 2),
                Blocks.Quin.QUINTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "netherrack", 30.0f, 100.0f, 2),
                Blocks.Sext.SEXTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "netherrack", 40.0f, 125.0f, 3),
                Blocks.Sept.SEPTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "netherrack", 50.0f, 200.0f, 3),
                Blocks.Oct.OCTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "netherrack", 60.0f, 500.0f, 3),
                Blocks.Mega.MEGA_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "netherrack", 70.0f, 60000.0f, 3),
                Blocks.Giga.GIGA_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "netherrack", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedNetherrackItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Quad.QUADRUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Quad.QUADRUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Quin.QUINTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Quin.QUINTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Sext.SEXTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Sext.SEXTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Sept.SEPTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Sept.SEPTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Oct.OCTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Oct.OCTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Mega.MEGA_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Mega.MEGA_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(Blocks.Giga.GIGA_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(Blocks.Giga.GIGA_COMPRESSED_NETHERRACK.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedSoulSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "soul_sand", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "soul_sand", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "soul_sand", 10.0f, 50.0f, 1)
        );
    }

    @SubscribeEvent
    public static void registerCompressedSoulSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_SOUL_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedstoneBlock(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                Blocks.Single.COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 0, "redstone_block", 2.0f, 35.0f, 0),
                Blocks.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 1, "redstone_block", 5.0f, 45.0f, 1),
                Blocks.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 2, "redstone_block", 10.0f, 50.0f, 1)
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedstoneBlockItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(Blocks.Single.COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(Blocks.Single.COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(Blocks.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(Blocks.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(Blocks.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(Blocks.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName()))
        );
    }
}