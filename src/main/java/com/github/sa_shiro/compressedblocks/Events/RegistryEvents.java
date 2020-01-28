package com.github.sa_shiro.compressedblocks.Events;

import com.github.sa_shiro.compressedblocks.blocks.CompressedBlock;
import com.github.sa_shiro.compressedblocks.blocks.CompressedBlocksInit;
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
                CompressedBlocksInit.Single.COMPRESSED_STONE,
                CompressedBlocksInit.Double.DOUBLE_COMPRESSED_STONE,
                CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "stone", 10.0f, 50.0f, 1),
                CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "stone", 20.0f, 75.0f, 2),
                CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "stone", 30.0f, 100.0f, 2),
                CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "stone", 40.0f, 125.0f, 3),
                CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "stone", 50.0f, 200.0f, 3),
                CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "stone", 60.0f, 500.0f, 3),
                CompressedBlocksInit.Mega.MEGA_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "stone", 70.0f, 60000.0f, 3),
                CompressedBlocksInit.Giga.GIGA_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "stone", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedGranite(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlocksInit.Single.COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "granite", 2.0f, 35.0f, 0),
                CompressedBlocksInit.Double.DOUBLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "granite", 5.0f, 45.0f, 1),
                CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "granite", 10.0f, 50.0f, 1),
                CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "granite", 20.0f, 75.0f, 2),
                CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "granite", 30.0f, 100.0f, 2),
                CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "granite", 40.0f, 125.0f, 3),
                CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "granite", 50.0f, 200.0f, 3),
                CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "granite", 60.0f, 500.0f, 3),
                CompressedBlocksInit.Mega.MEGA_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 8, "granite", 70.0f, 60000.0f, 3),
                CompressedBlocksInit.Giga.GIGA_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 9, "granite", 80.0f, 120000.0f, 3)
        );
    }

    @SubscribeEvent
    public static void registerCompressedStoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlocksInit.Single.COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Single.COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Double.DOUBLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Double.DOUBLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Mega.MEGA_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Mega.MEGA_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Giga.GIGA_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Giga.GIGA_COMPRESSED_STONE.getRegistryName()))
        );
    }

    @SubscribeEvent
    public static void registerCompressedGraniteItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlocksInit.Single.COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Single.COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Double.DOUBLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Double.DOUBLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Triple.TRIPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Quad.QUADRUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Quin.QUINTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Sext.SEXTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Sept.SEPTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Oct.OCTUPLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Mega.MEGA_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Mega.MEGA_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.Giga.GIGA_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.Giga.GIGA_COMPRESSED_GRANITE.getRegistryName()))
        );
    }
}
