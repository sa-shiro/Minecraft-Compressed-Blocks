package net.sashiro.compressedblocks.event;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.world.level.item.ItemGroups;

import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;

public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        eventBus.addListener(CBRegistryEvent::addItemsToCreativeTab);
    }


    private static void addItemsToCreativeTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ItemGroups.compressedBlockGroup) {
            for (RegistryObject<Block> block : BLOCKS.getEntries()) {
                event.accept(block.get());
            }
        }
        if (event.getTab() == ItemGroups.compressedItemGroup) {
            for (RegistryObject<Item> item : CRATE_ITEMS.getEntries()) {
                event.accept(item.get());
            }
        }
    }
}
