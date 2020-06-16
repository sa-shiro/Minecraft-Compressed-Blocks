package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.*;
import com.github.sa_shiro.compressedblocks.item.BagItem;
import com.github.sa_shiro.compressedblocks.item.EnumItemTier;
import com.github.sa_shiro.compressedblocks.item.ToolItems;
import com.github.sa_shiro.compressedblocks.util.ItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DeferredRegistryEvent {

    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    private static final Item.Properties props = new Item.Properties().group(ItemGroup.compressedGroup);
    private static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    private static int index = 0;
    
    public static ArrayList<String> BLOCK_NAMES = new ArrayList<>();
    public static ArrayList<String> METAL_BLOCK_NAMES = new ArrayList<>();
    public static ArrayList<Float> HARDNESS = new ArrayList<>();
    public static ArrayList<Float> RESISTANCE = new ArrayList<>();
    public static ArrayList<Integer> HARVEST_LEVEL = new ArrayList<>();
    public static ArrayList<RegistryObject<?>> BLOCK_REGISTRY = new ArrayList<>();


    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        populate();
        registerBlocks();
        //fixme: !!! Deprecated !!!
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(DeferredRegistryEvent::translucentRender);
        });
    }

    private static void populate() {
        BLOCK_NAMES.add(0, "stone");
        BLOCK_NAMES.add(1, "granite");
        BLOCK_NAMES.add(2, "diorite");
        BLOCK_NAMES.add(3, "andesite");
        BLOCK_NAMES.add(4, "dirt");
        BLOCK_NAMES.add(5, "cobblestone");
        BLOCK_NAMES.add(6, "sandstone");
        BLOCK_NAMES.add(7, "red_sandstone");
        BLOCK_NAMES.add(8, "bricks");
        BLOCK_NAMES.add(9, "netherrack");
        BLOCK_NAMES.add(10, "glowstone");
        BLOCK_NAMES.add(11, "stone_bricks");
        BLOCK_NAMES.add(12, "nether_bricks");
        BLOCK_NAMES.add(13, "end_stone");
        BLOCK_NAMES.add(14, "coal_block");
        METAL_BLOCK_NAMES.add(0, "lapis_block");
        METAL_BLOCK_NAMES.add(1, "gold_block");
        METAL_BLOCK_NAMES.add(2, "iron_block");
        METAL_BLOCK_NAMES.add(3, "diamond_block");
        METAL_BLOCK_NAMES.add(4, "emerald_block");
        HARDNESS.add(0, 5.0f);
        HARDNESS.add(1, 5.5f);
        HARDNESS.add(2, 6.0f);
        HARDNESS.add(3, 12.0f);
        HARDNESS.add(4, 16.0f);
        HARDNESS.add(5, 25.0f);
        HARDNESS.add(6, 30.0f);
        HARDNESS.add(7, 40.0f);
        HARDNESS.add(8, 55.0f);
        HARDNESS.add(9, 75.0f);
        RESISTANCE.add(0, 35.0f);
        RESISTANCE.add(1, 40.0f);
        RESISTANCE.add(2, 40.0f);
        RESISTANCE.add(3, 50.0f);
        RESISTANCE.add(4, 50.0f);
        RESISTANCE.add(5, 50.0f);
        RESISTANCE.add(6, 75.0f);
        RESISTANCE.add(7, 125.0f);
        RESISTANCE.add(8, 250.0f);
        RESISTANCE.add(9, 500.0f);
        HARVEST_LEVEL.add(0, 1);
        HARVEST_LEVEL.add(1, 1);
        HARVEST_LEVEL.add(2, 1);
        HARVEST_LEVEL.add(3, 2);
        HARVEST_LEVEL.add(4, 2);
        HARVEST_LEVEL.add(5, 2);
        HARVEST_LEVEL.add(6, 3);
        HARVEST_LEVEL.add(7, 3);
        HARVEST_LEVEL.add(8, 4);
        HARVEST_LEVEL.add(9, 4);
    }

    private static void registerBlocks() {
        for (String blockName : BLOCK_NAMES) {
            for (int y = 0; y < 10; y++) {
                final int compression = y;
                final float hardness = HARDNESS.get(y);
                final float resistance = RESISTANCE.get(y);
                final int harvest_level = HARVEST_LEVEL.get(y);
                int index2 = index; // required for ITEMS.register()
                BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_" + blockName, () -> new CompressedBlock(Material.ROCK, SoundType.STONE, compression, hardness, resistance, harvest_level)));
                ITEMS.register("c" + y + "_" + blockName, () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
                index++;
            }
        }
        for (String blockName : METAL_BLOCK_NAMES) {
            for (int y = 0; y < 10; y++) {
                final int compression = y;
                final float hardness = HARDNESS.get(y);
                final float resistance = RESISTANCE.get(y);
                final int harvest_level = HARVEST_LEVEL.get(y);
                int index2 = index;
                BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_" + blockName, () -> new CompressedBlock(Material.IRON, SoundType.METAL, compression, hardness, resistance, harvest_level)));
                ITEMS.register("c" + y + "_" + blockName, () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
                index++;
            }
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y);
            final float resistance = RESISTANCE.get(y);
            final int harvest_level = HARVEST_LEVEL.get(y);
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_redstone_block", () -> new CompressedRedstoneBlock(Material.IRON, SoundType.METAL, compression, hardness, resistance, harvest_level)));
            ITEMS.register("c" + y + "_redstone_block", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y);
            final float resistance = RESISTANCE.get(y);
            final int harvest_level = HARVEST_LEVEL.get(y);
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_sand", () -> new CompressedFallingBlock.Sand(Material.SAND, SoundType.SAND, compression, hardness, resistance, harvest_level)));
            ITEMS.register("c" + y + "_sand", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y);
            final float resistance = RESISTANCE.get(y);
            final int harvest_level = HARVEST_LEVEL.get(y);
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_red_sand", () -> new CompressedFallingBlock.Sand(Material.SAND, SoundType.SAND, compression, hardness, resistance, harvest_level)));
            ITEMS.register("c" + y + "_red_sand", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y);
            final float resistance = RESISTANCE.get(y);
            final int harvest_level = HARVEST_LEVEL.get(y);
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_gravel", () -> new CompressedFallingBlock.Gravel(Material.EARTH, SoundType.GROUND, compression, hardness, resistance, harvest_level)));
            ITEMS.register("c" + y + "_gravel", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y);
            final float resistance = RESISTANCE.get(y);
            final int harvest_level = HARVEST_LEVEL.get(y);
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_soul_sand", () -> new CompressedSoulSandBlock(Material.SAND, SoundType.SAND, compression, hardness, resistance, harvest_level)));
            ITEMS.register("c" + y + "_soul_sand", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
        for (int y = 0; y < 10; y++) {
            final int compression = y;
            final float hardness = HARDNESS.get(y) * 2.5f;
            final float resistance = RESISTANCE.get(y) * 25.0f;
            int index2 = index;
            BLOCK_REGISTRY.add(index, BLOCKS.register("c" + y + "_obsidian", () -> new CompressedBlock(Material.SAND, SoundType.SAND, compression, hardness, resistance, 4)));
            ITEMS.register("c" + y + "_obsidian", () -> new BlockItem((Block) BLOCK_REGISTRY.get(index2).get(), props));
            index++;
        }
    }

    private static void translucentRender(final FMLClientSetupEvent e) {
        final RenderType TRANSLUCENT = RenderType.getTranslucent();

        for (RegistryObject<?> registryObject : BLOCK_REGISTRY) {
            RenderTypeLookup.setRenderLayer((Block) registryObject.get(), TRANSLUCENT);
        }
    }

    public static final RegistryObject<Item> ENDER_PEARL_BAG = ITEMS.register("ender_pearl_bag", () -> new BagItem(0, "Ender Pearls"));
    public static final RegistryObject<Item> HUGE_ENDER_PEARL_BAG = ITEMS.register("huge_ender_pearl_bag", () -> new BagItem(1, "Ender Pearls"));
    public static final RegistryObject<Item> EGG_BAG = ITEMS.register("egg_bag", () -> new BagItem(0, "Egg"));
    public static final RegistryObject<Item> HUGE_EGG_BAG = ITEMS.register("huge_egg_bag", () -> new BagItem(1, "Eggs"));
    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> COMPRESSED_WOOD = ITEMS.register("compressed_wood", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.compressedGroup)));

    public static final RegistryObject<Item> HARDENED_WOODEN_PICKAXE = ITEMS.register("hardened_wooden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_AXE = ITEMS.register("hardened_wooden_axe", () -> new ToolItems.HardeneAxe(EnumItemTier.HARDENED_WOOD, 5, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SHOVEL = ITEMS.register("hardened_wooden_shovel", () -> new ToolItems.HardeneShovel(EnumItemTier.HARDENED_WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_HOE = ITEMS.register("hardened_wooden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_WOOD, 0.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SWORD = ITEMS.register("hardened_wooden_sword", () -> new ToolItems.HardeneSword(EnumItemTier.HARDENED_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroup.compressedGroup)));

    public static final RegistryObject<Item> HARDENED_PICKAXE = ITEMS.register("hardened_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_AXE = ITEMS.register("hardened_axe", () -> new ToolItems.HardeneAxe(EnumItemTier.HARDENED_STONE, 5, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_SHOVEL = ITEMS.register("hardened_shovel", () -> new ToolItems.HardeneShovel(EnumItemTier.HARDENED_STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_HOE = ITEMS.register("hardened_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_STONE, 0.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_SWORD = ITEMS.register("hardened_sword", () -> new ToolItems.HardeneSword(EnumItemTier.HARDENED_STONE, 4, -2.4F, (new Item.Properties()).group(ItemGroup.compressedGroup)));

    public static final RegistryObject<Item> HARDENED_IRON_PICKAXE = ITEMS.register("hardened_iron_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_AXE = ITEMS.register("hardened_iron_axe", () -> new ToolItems.HardeneAxe(EnumItemTier.HARDENED_IRON, 6, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SHOVEL = ITEMS.register("hardened_iron_shovel", () -> new ToolItems.HardeneShovel(EnumItemTier.HARDENED_IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_HOE = ITEMS.register("hardened_iron_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_IRON, 0.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SWORD = ITEMS.register("hardened_iron_sword", () -> new ToolItems.HardeneSword(EnumItemTier.HARDENED_IRON, 4, -2.4F, (new Item.Properties()).group(ItemGroup.compressedGroup)));

    public static final RegistryObject<Item> HARDENED_GOLDEN_PICKAXE = ITEMS.register("hardened_golden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_AXE = ITEMS.register("hardened_golden_axe", () -> new ToolItems.HardeneAxe(EnumItemTier.HARDENED_GOLD, 6, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SHOVEL = ITEMS.register("hardened_golden_shovel", () -> new ToolItems.HardeneShovel(EnumItemTier.HARDENED_GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_HOE = ITEMS.register("hardened_golden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_GOLD, 0.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SWORD = ITEMS.register("hardened_golden_sword", () -> new ToolItems.HardeneSword(EnumItemTier.HARDENED_GOLD, 4, -2.4F, (new Item.Properties()).group(ItemGroup.compressedGroup)));

    public static final RegistryObject<Item> HARDENED_DIAMOND_PICKAXE = ITEMS.register("hardened_diamond_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_AXE = ITEMS.register("hardened_diamond_axe", () -> new ToolItems.HardeneAxe(EnumItemTier.HARDENED_DIAMOND, 7, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_SHOVEL = ITEMS.register("hardened_diamond_shovel", () -> new ToolItems.HardeneShovel(EnumItemTier.HARDENED_DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_HOE = ITEMS.register("hardened_diamond_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_DIAMOND, 0.0F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_SWORD = ITEMS.register("hardened_diamond_sword", () -> new ToolItems.HardeneSword(EnumItemTier.HARDENED_DIAMOND, 5, -2.4F, (new Item.Properties()).group(ItemGroup.compressedGroup)));
}