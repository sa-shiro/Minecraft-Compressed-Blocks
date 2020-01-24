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
    public static void registerCompressedBlocks(final RegistryEvent.Register<Block> e) {
        e.getRegistry().registerAll(
                CompressedBlocksInit.DOUBLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "stone", "Stone", 2.0f, 50.0f, 1),
                CompressedBlocksInit.DOUBLE_COMPRESSED_GRANITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "granite", "Granite", 2.0f, 50.0f, 1),
                CompressedBlocksInit.DOUBLE_COMPRESSED_DIORITE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "diorite", "Diorite", 2.0f, 50.0f, 1)
        );
    }

    @SubscribeEvent
    public static void registerCompressedBlockItems(final RegistryEvent.Register<Item> e) {
        Item.Properties props = new Item.Properties()
                .group(Init.doubleCompressedGroup);
        e.getRegistry().registerAll(
                new BlockItem(CompressedBlocksInit.DOUBLE_COMPRESSED_STONE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.DOUBLE_COMPRESSED_STONE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.DOUBLE_COMPRESSED_GRANITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.DOUBLE_COMPRESSED_GRANITE.getRegistryName())),
                new BlockItem(CompressedBlocksInit.DOUBLE_COMPRESSED_DIORITE, props).setRegistryName(Objects.requireNonNull(CompressedBlocksInit.DOUBLE_COMPRESSED_DIORITE.getRegistryName()))
        );
    }
}
