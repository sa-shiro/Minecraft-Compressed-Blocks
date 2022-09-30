package net.sashiro.compressedblocks.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.util.StringUtils;
import net.sashiro.compressedblocks.world.level.item.CrateItem;
import net.sashiro.compressedblocks.world.level.item.CrateItems;
import net.sashiro.compressedblocks.world.level.item.ItemGroups;

import java.util.ArrayList;

import static net.sashiro.compressedblocks.world.level.item.CrateItems.*;

public class ModRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties().tab(ItemGroups.compressedBlockGroup);
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        registerItems();
    }

    private static void registerCrateItems(ArrayList<RegistryObject<Item>> itemArray) {
        assert false;
        Item item = itemArray.get(0).get().asItem();
        String itemName = String.valueOf(StringUtils.stringResourceLocationFixer(item));

        itemArray.add(1, ModRegistryEvent.ITEMS.register("crated_" + itemName, () -> new CrateItem(0, StringUtils.stringFormat(itemName))));
        itemArray.add(2, ModRegistryEvent.ITEMS.register("double_crated_" + itemName, () -> new CrateItem(1, StringUtils.stringFormat(itemName))));
        itemArray.add(3, ModRegistryEvent.ITEMS.register("triple_crated_" + itemName, () -> new CrateItem(2, StringUtils.stringFormat(itemName))));
        itemArray.add(4, ModRegistryEvent.ITEMS.register("quadruple_crated_" + itemName, () -> new CrateItem(3, StringUtils.stringFormat(itemName))));
        itemArray.add(5, ModRegistryEvent.ITEMS.register("quintuple_crated_" + itemName, () -> new CrateItem(4, StringUtils.stringFormat(itemName))));
        itemArray.add(6, ModRegistryEvent.ITEMS.register("sextuple_crated_" + itemName, () -> new CrateItem(5, StringUtils.stringFormat(itemName))));
        itemArray.add(7, ModRegistryEvent.ITEMS.register("septuple_crated_" + itemName, () -> new CrateItem(6, StringUtils.stringFormat(itemName))));
        itemArray.add(8, ModRegistryEvent.ITEMS.register("octuple_crated_" + itemName, () -> new CrateItem(7, StringUtils.stringFormat(itemName))));
        itemArray.add(9, ModRegistryEvent.ITEMS.register("mega_crated_" + itemName, () -> new CrateItem(8, StringUtils.stringFormat(itemName))));
        itemArray.add(10, ModRegistryEvent.ITEMS.register("giga_crated_" + itemName, () -> new CrateItem(9, StringUtils.stringFormat(itemName))));
    }

    private static void registerItems() {
        registerCrateItems(APPLE);
        registerCrateItems(MUSHROOM_STEW);
        registerCrateItems(BREAD);
        registerCrateItems(RAW_PORKCHOP); // fixme: translation
        registerCrateItems(COOKED_PORKCHOP);
        registerCrateItems(RAW_COD); // fixme: translation
        registerCrateItems(RAW_SALMON); // fixme: translation
        registerCrateItems(TROPICAL_FISH);
        registerCrateItems(PUFFERFISH);
        registerCrateItems(COOKED_COD);
        registerCrateItems(COOKED_SALMON);
        registerCrateItems(CAKE);
        registerCrateItems(COOKIE);
        registerCrateItems(MELON_SLICE);
        registerCrateItems(MELON_SEEDS);
        registerCrateItems(DRIED_KELP);
        registerCrateItems(RAW_BEEF); // fixme: translation
        registerCrateItems(COOKED_BEEF);
        registerCrateItems(RAW_CHICKEN); // fixme: translation
        registerCrateItems(COOKED_CHICKEN);
        registerCrateItems(ROTTEN_FLESH);
        registerCrateItems(CARROT);
        registerCrateItems(POTATO);
        registerCrateItems(BAKED_POTATO);
        registerCrateItems(POISONOUS_POTATO);
        registerCrateItems(PUMPKIN_PIE);
        registerCrateItems(RAW_RABBIT); // fixme: translation
        registerCrateItems(COOKED_RABBIT);
        registerCrateItems(RABBIT_STEW);
        registerCrateItems(MUTTON); // fixme: translation
        registerCrateItems(COOKED_MUTTON);
        registerCrateItems(BEETROOT);
        registerCrateItems(BEETROOT_SEEDS);
        registerCrateItems(BEETROOT_SOUP);
        registerCrateItems(SWEET_BERRIES);
        registerCrateItems(GLOW_BERRIES);
        registerCrateItems(EGG);
        registerCrateItems(SUGAR_CANE);
        registerCrateItems(SUGAR);
        registerCrateItems(PUMPKIN);
        registerCrateItems(PUMPKIN_SEEDS);
        registerCrateItems(WHEAT);
        registerCrateItems(WHEAT_SEEDS);
        registerCrateItems(COCOA_BEANS);
        registerCrateItems(ARROW);
        registerCrateItems(SPIDER_EYE);
        registerCrateItems(FERMENTED_SPIDER_EYE);
        registerCrateItems(BLAZE_ROD);
        registerCrateItems(BLAZE_POWDER);
        registerCrateItems(MAGMA_CREAM);
        registerCrateItems(BONE);
        registerCrateItems(BONE_MEAL);
        registerCrateItems(ENDER_EYE);
        registerCrateItems(ENDER_PEARL);
        registerCrateItems(CrateItems.FEATHER);
        registerCrateItems(LEATHER);
        registerCrateItems(CrateItems.STRING);
        registerCrateItems(INK_SACS);
        registerCrateItems(GLOW_INK_SACS);
        registerCrateItems(CrateItems.STICK);
        registerCrateItems(GLASS_BOTTLE);
        registerCrateItems(CrateItems.SNOWBALL);
        registerCrateItems(PAPER);
        registerCrateItems(FLINT);
        registerCrateItems(OAK_SAPLING);
        registerCrateItems(SPRUCE_SAPLING);
        registerCrateItems(BIRCH_SAPLING);
        registerCrateItems(JUNGLE_SAPLING);
        registerCrateItems(ACACIA_SAPLING);
        registerCrateItems(DARK_OAK_SAPLING);
        registerCrateItems(CHORUS_FRUIT); // fixme: translation
        registerCrateItems(SEAGRASS);
        registerCrateItems(KELP);
        registerCrateItems(BAMBOO);
        registerCrateItems(BROWN_MUSHROOM);
        registerCrateItems(RED_MUSHROOM);
        registerCrateItems(CRIMSON_FUNGUS);
        registerCrateItems(WARPED_FUNGUS);
        registerCrateItems(WITHER_ROSE); // fixme: translation
        registerCrateItems(NETHER_WART);
    }
}
