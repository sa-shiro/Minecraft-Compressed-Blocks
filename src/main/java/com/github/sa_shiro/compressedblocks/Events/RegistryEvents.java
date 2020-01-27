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
                CompressedBlocksInit.COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.DOUBLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.TRIPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 2, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.QUADRUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 3, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.QUINTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 4, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.SEXTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 5, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.SEPTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 6, "stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.OCTUPLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 7, "stone", 2.0f, 50.0f, 1));
    }

    @SubscribeEvent
    public static void registerCompressedStoneItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.compressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlocksInit.COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.DOUBLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.DOUBLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.TRIPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.TRIPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.QUADRUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.QUADRUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.QUINTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.QUINTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.SEXTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.SEXTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.SEPTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.SEPTUPLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.OCTUPLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.OCTUPLE_COMPRESSED_STONE.getRegistryName()))
        );
    }
}
