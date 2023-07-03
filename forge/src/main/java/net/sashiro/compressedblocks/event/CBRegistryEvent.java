package net.sashiro.compressedblocks.event;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.sashiro.compressedblocks.Constants.MOD_ID;


public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);
    }
}