package net.sashiro.compressedblocks.event;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.util.StringUtils;
import net.sashiro.compressedblocks.world.level.item.BagItem;
import net.sashiro.compressedblocks.world.level.item.ItemGroups;

import java.util.ArrayList;

import static net.sashiro.compressedblocks.world.level.item.CustomItems.*;

public class ModRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS2 = DeferredRegister.create(ForgeRegistries.BLOCKS, CompressedBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CompressedBlocks.MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties().tab(ItemGroups.compressedBlockGroup);
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        registerItems();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(ModRegistryEvent::translucentRender));
    }

    private static void translucentRender(final FMLCommonSetupEvent e) {
        final RenderType TRANSLUCENT = RenderType.translucent();
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            ItemBlockRenderTypes.setRenderLayer(registryObject.get(), TRANSLUCENT);
        }
    }

    private static void registerCrateItems(ArrayList<RegistryObject<Item>> itemArray) {
        assert false;
        RegistryObject<Item> item = itemArray.get(0);
        String itemName = item.get().getRegistryName().toString().replace("minecraft:", "");

        itemArray.add(1, ModRegistryEvent.ITEMS.register("crated_" + itemName, () -> new BagItem(0, StringUtils.stringFormat(itemName))));
        itemArray.add(2, ModRegistryEvent.ITEMS.register("double_crated_" + itemName, () -> new BagItem(1, StringUtils.stringFormat(itemName))));
        itemArray.add(3, ModRegistryEvent.ITEMS.register("triple_crated_" + itemName, () -> new BagItem(2, StringUtils.stringFormat(itemName))));
        itemArray.add(4, ModRegistryEvent.ITEMS.register("quadruple_crated_" + itemName, () -> new BagItem(3, StringUtils.stringFormat(itemName))));
        itemArray.add(5, ModRegistryEvent.ITEMS.register("quintuple_crated_" + itemName, () -> new BagItem(4, StringUtils.stringFormat(itemName))));
        itemArray.add(6, ModRegistryEvent.ITEMS.register("sextuple_crated_" + itemName, () -> new BagItem(5, StringUtils.stringFormat(itemName))));
        itemArray.add(7, ModRegistryEvent.ITEMS.register("septuple_crated_" + itemName, () -> new BagItem(6, StringUtils.stringFormat(itemName))));
        itemArray.add(8, ModRegistryEvent.ITEMS.register("octuple_crated_" + itemName, () -> new BagItem(7, StringUtils.stringFormat(itemName))));
        itemArray.add(9, ModRegistryEvent.ITEMS.register("mega_crated_" + itemName, () -> new BagItem(8, StringUtils.stringFormat(itemName))));
        itemArray.add(10, ModRegistryEvent.ITEMS.register("giga_crated_" + itemName, () -> new BagItem(9, StringUtils.stringFormat(itemName))));
    }

    private static void registerItems() {
        registerCrateItems(APPLES);
        registerCrateItems(MUSHROOM_STEW);
        registerCrateItems(BREAD);
        registerCrateItems(PORKCHOP); // translation
        registerCrateItems(COOKED_PORKCHOP);
        registerCrateItems(COD); // translation
        registerCrateItems(SALMON); // translation
        registerCrateItems(TROPICAL_FISH);
        registerCrateItems(PUFFERFISH);
        registerCrateItems(COOKED_COD);
        registerCrateItems(COOKED_SALMON);
        registerCrateItems(CAKES);
        registerCrateItems(COOKIES);
        registerCrateItems(MELON_SLICES);
        registerCrateItems(MELON_SEEDS);
        registerCrateItems(DRIED_KELP);
        registerCrateItems(BEEF); // translation
        registerCrateItems(COOKED_BEEF);
        registerCrateItems(CHICKEN); // translation
        registerCrateItems(COOKED_CHICKEN);
        registerCrateItems(ROTTEN_FLESH);
        registerCrateItems(CARROTS);
        registerCrateItems(POTATOES);
        registerCrateItems(BAKED_POTATOES);
        registerCrateItems(POISONOUS_POTATOES);
        registerCrateItems(PUMPKIN_PIES);
        registerCrateItems(RABBIT); // translation
        registerCrateItems(COOKED_RABBIT);
        registerCrateItems(RABBIT_STEW);
        registerCrateItems(MUTTON); // translation
        registerCrateItems(COOKED_MUTTON);
        registerCrateItems(BEETROOT);
        registerCrateItems(BEETROOT_SEEDS);
        registerCrateItems(BEETROOT_SOUP);
        registerCrateItems(SWEET_BERRIES);
        registerCrateItems(GLOW_BERRIES);
        registerCrateItems(EGGS);
        registerCrateItems(SUGAR_CANES);
        registerCrateItems(SUGAR);
        registerCrateItems(PUMPKINS);
        registerCrateItems(PUMPKIN_SEEDS);
        registerCrateItems(WHEAT);
        registerCrateItems(WHEAT_SEEDS);
        registerCrateItems(COCOA_BEANS);
        registerCrateItems(ARROWS);
        registerCrateItems(SPIDER_EYES);
        registerCrateItems(FERMENTED_SPIDER_EYES);
        registerCrateItems(BLAZE_RODS);
        registerCrateItems(BLAZE_POWDER);
        registerCrateItems(MAGMA_CREAM);
        registerCrateItems(BONES);
        registerCrateItems(BONE_MEAL);
        registerCrateItems(ENDER_EYES);
        registerCrateItems(ENDER_PEARLS);
        registerCrateItems(FEATHERS);
        registerCrateItems(LEATHER);
        registerCrateItems(STRINGS);
        registerCrateItems(INK_SACS);
        registerCrateItems(GLOW_INK_SACS);
        registerCrateItems(STICKS);
        registerCrateItems(GLASS_BOTTLES);
        registerCrateItems(SNOWBALLS);
        registerCrateItems(PAPER);
        registerCrateItems(FLINTS);
        registerCrateItems(OAK_SAPLINGS);
        registerCrateItems(SPRUCE_SAPLINGS);
        registerCrateItems(BIRCH_SAPLINGS);
        registerCrateItems(JUNGLE_SAPLINGS);
        registerCrateItems(ACACIA_SAPLINGS);
        registerCrateItems(DARK_OAK_SAPLINGS);
        registerCrateItems(CHORUS_FRUITS);
        registerCrateItems(SEAGRASS);
        registerCrateItems(KELP);
        registerCrateItems(BAMBOO);
        registerCrateItems(BROWN_MUSHROOMS);
        registerCrateItems(RED_MUSHROOMS);
        registerCrateItems(CRIMSON_FUNGUS);
        registerCrateItems(WARPED_FUNGUS);
        registerCrateItems(WITHER_ROSES);
        registerCrateItems(NETHER_WARTS);
    }
}
