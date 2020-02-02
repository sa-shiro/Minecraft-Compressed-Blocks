package com.github.sa_shiro.compressedblocks.Events;

import com.github.sa_shiro.compressedblocks.blocks.CompressedBlock;
import com.github.sa_shiro.compressedblocks.blocks.CompressedBlockList;
import com.github.sa_shiro.compressedblocks.init.Init;
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
    public static void registerCompressedStone(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "stone", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "stone", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "stone", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "stone", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "stone", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "stone", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "stone", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "stone", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "stone", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "stone", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedStoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_STONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedGranite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "granite", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "granite", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "granite", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "granite", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "granite", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "granite", 40.0f, 125.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedGraniteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRANITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedDiorite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "diorite", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "diorite", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "diorite", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "diorite", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "diorite", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "diorite", 40.0f, 125.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedDioriteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIORITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIORITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedAndesite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "andesite", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "andesite", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "andesite", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "andesite", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "andesite", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_ANDESITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "andesite", 40.0f, 125.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedAndesiteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_ANDESITE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_ANDESITE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_ANDESITE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedDirt(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 0, "dirt", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 1, "dirt", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 2, "dirt", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 3, "dirt", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 4, "dirt", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 5, "dirt", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 6, "dirt", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 7, "dirt", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 8, "dirt", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_DIRT = new CompressedBlock(Material.EARTH, SoundType.GROUND, 9, "dirt", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedDirtItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_DIRT.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_DIRT, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_DIRT.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedCobblestone(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "cobblestone", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "cobblestone", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "cobblestone", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "cobblestone", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "cobblestone", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "cobblestone", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "cobblestone", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "cobblestone", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "cobblestone", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_COBBLESTONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "cobblestone", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedCobblestoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_COBBLESTONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_COBBLESTONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_COBBLESTONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "sand", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "sand", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "sand", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 3, "sand", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 4, "sand", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 5, "sand", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 6, "sand", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 7, "sand", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 8, "sand", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 9, "sand", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "red_sand", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "red_sand", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "red_sand", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 3, "red_sand", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 4, "red_sand", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 5, "red_sand", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 6, "red_sand", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 7, "red_sand", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 8, "red_sand", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_RED_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 9, "red_sand", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedRedSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_RED_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_RED_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_RED_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedGravel(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 0, "gravel", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 1, "gravel", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 2, "gravel", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 3, "gravel", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 4, "gravel", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 5, "gravel", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_GRAVEL = new CompressedBlock(Material.EARTH, SoundType.GROUND, 6, "gravel", 50.0f, 200.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedGravelItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRAVEL.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_GRAVEL, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_GRAVEL.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedNetherrack(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "netherrack", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "netherrack", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "netherrack", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "netherrack", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "netherrack", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "netherrack", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "netherrack", 50.0f, 200.0f, 3),
                CompressedBlockList.Oct.OCTUPLE_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "netherrack", 60.0f, 500.0f, 3),
                CompressedBlockList.Mega.MEGA_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "netherrack", 70.0f, 60000.0f, 3),
                CompressedBlockList.Giga.GIGA_COMPRESSED_NETHERRACK = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "netherrack", 80.0f, 120000.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedNetherrackItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Mega.MEGA_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Mega.MEGA_COMPRESSED_NETHERRACK.getRegistryName())),
                new BlockItem(CompressedBlockList.Giga.GIGA_COMPRESSED_NETHERRACK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Giga.GIGA_COMPRESSED_NETHERRACK.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedSoulSand(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 0, "soul_sand", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 1, "soul_sand", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 2, "soul_sand", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 3, "soul_sand", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 4, "soul_sand", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 5, "soul_sand", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SOUL_SAND = new CompressedBlock(Material.SAND, SoundType.SAND, 6, "soul_sand", 50.0f, 200.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedSoulSandItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SOUL_SAND.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SOUL_SAND, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SOUL_SAND.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedEndStone(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "end_stone", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "end_stone", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "end_stone", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "end_stone", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "end_stone", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "end_stone", 40.0f, 125.0f, 3),
                CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_END_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "end_stone", 50.0f, 200.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedEndSToneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_END_STONE.getRegistryName())),
                new BlockItem(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_END_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_END_STONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedRedstoneBlock(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlockList.Single.COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 0, "redstone_block", 2.0f, 35.0f, 0),
                CompressedBlockList.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 1, "redstone_block", 5.0f, 45.0f, 1),
                CompressedBlockList.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 2, "redstone_block", 10.0f, 50.0f, 1),
                CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 3, "redstone_block", 20.0f, 75.0f, 2),
                CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 4, "redstone_block", 30.0f, 100.0f, 2),
                CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_REDSTONE_BLOCK = new CompressedBlock(Material.IRON, SoundType.METAL, 5, "redstone_block", 40.0f, 125.0f, 3)
        );
    }
    @SubscribeEvent
    public static void registerCompressedRedstoneBlockItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlockList.Single.COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Single.COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(CompressedBlockList.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(CompressedBlockList.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName())),
                new BlockItem(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_REDSTONE_BLOCK, props).setRegistryName(Objects.requireNonNull(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_REDSTONE_BLOCK.getRegistryName()))
        );
    }
}