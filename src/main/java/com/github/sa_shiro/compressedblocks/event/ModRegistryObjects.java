package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.CompressedBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;

public class ModRegistryObjects {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS2 = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    public static CompressedBlock LOGO_BLOCK = new CompressedBlock();
    public static ArrayList<RegistryObject<Block>> BLOCK_REGISTRY = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> APPLES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ARROWS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BEETROOT = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BEETROOT_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BLAZE_POWDER = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BLAZE_RODS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> BONES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> CARROTS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> EGGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ENDER_EYES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> ENDER_PEARLS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> FEATHERS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> LEATHER = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> MELONS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> POTATOES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SUGAR_CANE = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> MELON_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> PUMPKIN = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> PUMPKIN_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> WHEAT_SEEDS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SPIDER_EYES = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> STRINGS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> STICKS = new ArrayList<>();
    public static ArrayList<RegistryObject<Item>> SUGAR = new ArrayList<>();

    public static void populate() {
        APPLES.add(0, RegistryObject.of(Items.APPLE.getRegistryName(), ForgeRegistries.ITEMS));
        ARROWS.add(0, RegistryObject.of(new ResourceLocation("arrow"), ForgeRegistries.ITEMS));
        BEETROOT.add(0, RegistryObject.of(new ResourceLocation("beetroot"), ForgeRegistries.ITEMS));
        BEETROOT_SEEDS.add(0, RegistryObject.of(new ResourceLocation("beetroot_seeds"), ForgeRegistries.ITEMS));
        BLAZE_POWDER.add(0, RegistryObject.of(new ResourceLocation("blaze_powder"), ForgeRegistries.ITEMS));
        BLAZE_RODS.add(0, RegistryObject.of(new ResourceLocation("blaze_rod"), ForgeRegistries.ITEMS));
        BONES.add(0, RegistryObject.of(new ResourceLocation("bone"), ForgeRegistries.ITEMS));
        CARROTS.add(0, RegistryObject.of(new ResourceLocation("carrot"), ForgeRegistries.ITEMS));
        EGGS.add(0, RegistryObject.of(new ResourceLocation("egg"), ForgeRegistries.ITEMS));
        ENDER_EYES.add(0, RegistryObject.of(new ResourceLocation("ender_eye"), ForgeRegistries.ITEMS));
        ENDER_PEARLS.add(0, RegistryObject.of(new ResourceLocation("ender_pearl"), ForgeRegistries.ITEMS));
        FEATHERS.add(0, RegistryObject.of(new ResourceLocation("feather"), ForgeRegistries.ITEMS));
        LEATHER.add(0, RegistryObject.of(new ResourceLocation("leather"), ForgeRegistries.ITEMS));
        MELONS.add(0, RegistryObject.of(new ResourceLocation("melon"), ForgeRegistries.ITEMS));
        POTATOES.add(0, RegistryObject.of(new ResourceLocation("potato"), ForgeRegistries.ITEMS));
        SUGAR_CANE.add(0, RegistryObject.of(new ResourceLocation("sugar_cane"), ForgeRegistries.ITEMS));
        MELON_SEEDS.add(0, RegistryObject.of(new ResourceLocation("melon_seeds"), ForgeRegistries.ITEMS));
        PUMPKIN.add(0, RegistryObject.of(new ResourceLocation("pumpkin"), ForgeRegistries.ITEMS));
        PUMPKIN_SEEDS.add(0, RegistryObject.of(new ResourceLocation("pumpkin_seeds"), ForgeRegistries.ITEMS));
        WHEAT_SEEDS.add(0, RegistryObject.of(new ResourceLocation("wheat_seeds"), ForgeRegistries.ITEMS));
        SPIDER_EYES.add(0, RegistryObject.of(new ResourceLocation("spider_eye"), ForgeRegistries.ITEMS));
        STRINGS.add(0, RegistryObject.of(new ResourceLocation("string"), ForgeRegistries.ITEMS));
        STICKS.add(0, RegistryObject.of(new ResourceLocation("stick"), ForgeRegistries.ITEMS));
        SUGAR.add(0, RegistryObject.of(new ResourceLocation("sugar"), ForgeRegistries.ITEMS));
    }
}
