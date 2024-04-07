package net.sashiro.compressedblocks.event;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.compressedblocks.registry.CBBlockRegister;
import net.sashiro.compressedblocks.registry.CBCratesRegister;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    public static Collection<Block> BLOCK_LIST = new ArrayList<>();
    public static Collection<Block> CRATE_LIST = new ArrayList<>();
    
    public static void register() {
        eventBus.addGenericListener(Block.class, CBBlockRegister::register);
        eventBus.addGenericListener(Block.class, CBCratesRegister::register);
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(CBRegistryEvent::translucentRender));
        
    }
    
    private static void translucentRender(final FMLCommonSetupEvent e) {
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            RenderTypeLookup.setRenderLayer(registryObject.get(), RenderType.getTranslucent());
        }
        for (RegistryObject<Block> registryObject : CRATE_BLOCKS.getEntries()) {
            RenderTypeLookup.setRenderLayer(registryObject.get(), RenderType.getCutout());
        }
    }
}
