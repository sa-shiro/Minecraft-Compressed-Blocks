package com.github.sa_shiro.compressedblocks.event;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.block.CompressedBlock;
import com.github.sa_shiro.compressedblocks.item.BagItem;
import com.github.sa_shiro.compressedblocks.item.EnumItemTier;
import com.github.sa_shiro.compressedblocks.item.ToolItems;
import com.github.sa_shiro.compressedblocks.util.ForgeConfigManager;
import com.github.sa_shiro.compressedblocks.util.ItemGroups;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class RegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    public static final RegistryObject<Item> ENDER_PEARL_BAG = ITEMS.register("ender_pearl_bag", () -> new BagItem(0, "Ender Pearls"));
    public static final RegistryObject<Item> HUGE_ENDER_PEARL_BAG = ITEMS.register("huge_ender_pearl_bag", () -> new BagItem(1, "Ender Pearls"));
    public static final RegistryObject<Item> ENDER_EYE_BAG = ITEMS.register("ender_eye_bag", () -> new BagItem(0, "Ender Eyes"));
    public static final RegistryObject<Item> HUGE_ENDER_EYE_BAG = ITEMS.register("huge_ender_eye_bag", () -> new BagItem(1, "Ender Eyes"));
    public static final RegistryObject<Item> EGG_BAG = ITEMS.register("egg_bag", () -> new BagItem(0, "Egg"));
    public static final RegistryObject<Item> HUGE_EGG_BAG = ITEMS.register("huge_egg_bag", () -> new BagItem(1, "Eggs"));
    public static final RegistryObject<Item> COMPRESSED_STICK = ITEMS.register("compressed_stick", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_WOOD = ITEMS.register("compressed_wood", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_IRON = ITEMS.register("compressed_iron", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_GOLD = ITEMS.register("compressed_gold", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> COMPRESSED_DIAMOND = ITEMS.register("compressed_diamond", () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_PICKAXE = ITEMS.register("hardened_wooden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_WOOD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_AXE = ITEMS.register("hardened_wooden_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_WOOD, 5, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SHOVEL = ITEMS.register("hardened_wooden_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_WOOD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_HOE = ITEMS.register("hardened_wooden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_WOOD, 1, 0.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_WOODEN_SWORD = ITEMS.register("hardened_wooden_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_WOOD, 3, -2.4F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_PICKAXE = ITEMS.register("hardened_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_STONE, 1, -2.8F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_AXE = ITEMS.register("hardened_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_STONE, 5, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_SHOVEL = ITEMS.register("hardened_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_STONE, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_HOE = ITEMS.register("hardened_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_STONE, 1, 0.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_SWORD = ITEMS.register("hardened_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_STONE, 4, -2.4F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_PICKAXE = ITEMS.register("hardened_iron_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_IRON, 1, -2.8F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_AXE = ITEMS.register("hardened_iron_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_IRON, 6, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SHOVEL = ITEMS.register("hardened_iron_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_IRON, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_HOE = ITEMS.register("hardened_iron_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_IRON, 1, 0.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_IRON_SWORD = ITEMS.register("hardened_iron_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_IRON, 4, -2.4F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_PICKAXE = ITEMS.register("hardened_golden_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_GOLD, 1, -2.8F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_AXE = ITEMS.register("hardened_golden_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_GOLD, 6, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SHOVEL = ITEMS.register("hardened_golden_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_GOLD, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_HOE = ITEMS.register("hardened_golden_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_GOLD, 1, 0.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_GOLDEN_SWORD = ITEMS.register("hardened_golden_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_GOLD, 4, -2.4F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_PICKAXE = ITEMS.register("hardened_diamond_pickaxe", () -> new ToolItems.HardenedPickaxe(EnumItemTier.HARDENED_DIAMOND, 1, -2.8F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_AXE = ITEMS.register("hardened_diamond_axe", () -> new ToolItems.HardenedAxe(EnumItemTier.HARDENED_DIAMOND, 7, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_SHOVEL = ITEMS.register("hardened_diamond_shovel", () -> new ToolItems.HardenedShovel(EnumItemTier.HARDENED_DIAMOND, 1.5F, -3.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_HOE = ITEMS.register("hardened_diamond_hoe", () -> new ToolItems.HardenedHoe(EnumItemTier.HARDENED_DIAMOND, 1, 0.0F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    public static final RegistryObject<Item> HARDENED_DIAMOND_SWORD = ITEMS.register("hardened_diamond_sword", () -> new ToolItems.HardenedSword(EnumItemTier.HARDENED_DIAMOND, 5, -2.4F, (new Item.Properties()).group(ItemGroups.compressedBlockGroup)));
    private static final Logger LOGGER = LogManager.getLogger();
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    public static ArrayList<RegistryObject<Block>> BLOCK_REGISTRY = new ArrayList<>();

    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        registerBlocks();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(RegistryEvent::translucentRender));
    }

    private static void registerBlocks() {
        for (BlockFactory factory : Lists.blockList) {
            if (factory.getRegistryName().equals("stone") || factory.getRegistryName().equals("cobblestone") && !factory.getHasRotation()) {
                for (int level = 0; level <= 9; level++) {
                    RegisterBlock.registerNewBlock(
                            CompressedBlock.createBlock(
                                    factory.getType(),
                                    level,
                                    factory.getMaterial(),
                                    factory.getMaterialColor(),
                                    factory.getSoundType(),
                                    Lists.HARDNESS.get(level),
                                    Lists.RESISTANCE.get(level),
                                    Lists.HARVEST_LEVEL.get(level)
                            ),
                            factory.getRegistryName(), level, ForgeConfigManager.getIsBlockEnabled(factory.getRegistryName()) // ConfigManager.isBlockEnabled(factory.getRegistryName()
                    );
                }
            } else if (!factory.getHasRotation()) {
                for (int level = 0; level <= ForgeConfigManager.maxCompressionLevel.get(); level++) {
                    RegisterBlock.registerNewBlock(
                            CompressedBlock.createBlock(
                                    factory.getType(),
                                    level,
                                    factory.getMaterial(),
                                    factory.getMaterialColor(),
                                    factory.getSoundType(),
                                    Lists.HARDNESS.get(level),
                                    Lists.RESISTANCE.get(level),
                                    Lists.HARVEST_LEVEL.get(level)
                            ),
                            factory.getRegistryName(), level, ForgeConfigManager.getIsBlockEnabled(factory.getRegistryName()) // ConfigManager.isBlockEnabled(factory.getRegistryName()
                    );
                }
            } else if (factory.getIsLogBlock()) {
                for (int level = 0; level <= ForgeConfigManager.maxCompressionLevel.get(); level++) {
                    RegisterBlock.registerNewBlock(
                            CompressedBlock.createRotationalBlock(
                                    level,
                                    factory.getMaterial(),
                                    factory.getMaterialColorSide(),
                                    factory.getMaterialColorEnd(),
                                    factory.getSoundType(),
                                    Lists.HARDNESS.get(level),
                                    Lists.RESISTANCE.get(level),
                                    Lists.HARVEST_LEVEL.get(level)
                            ),
                            factory.getRegistryName(), level, ForgeConfigManager.getIsBlockEnabled(factory.getRegistryName()) // ConfigManager.isBlockEnabled(factory.getRegistryName()
                    );
                }
            } else if (factory.getHasRotation()) {
                for (int level = 0; level <= ForgeConfigManager.maxCompressionLevel.get(); level++) {
                    RegisterBlock.registerNewBlock(
                            CompressedBlock.createRotationalBlock(
                                    level,
                                    factory.getMaterial(),
                                    factory.getMaterialColor(),
                                    factory.getSoundType(),
                                    Lists.HARDNESS.get(level),
                                    Lists.RESISTANCE.get(level),
                                    Lists.HARVEST_LEVEL.get(level)
                            ),
                            factory.getRegistryName(), level, ForgeConfigManager.getIsBlockEnabled(factory.getRegistryName()) // ConfigManager.isBlockEnabled(factory.getRegistryName()
                    );
                }
            }
        }
        LOGGER.info("Registration finished.");
    }

    private static void translucentRender(final FMLCommonSetupEvent e) {
        e.setPhase(EventPriority.NORMAL);
        final RenderType TRANSLUCENT = RenderType.getTranslucent();
        for (RegistryObject<Block> registryObject : BLOCK_REGISTRY) {
            RenderTypeLookup.setRenderLayer(registryObject.get(), TRANSLUCENT);
        }
    }
}