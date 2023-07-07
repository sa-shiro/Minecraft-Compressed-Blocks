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
import net.sashiro.compressedblocks.registry.CBBlockRegister;
import net.sashiro.compressedblocks.registry.CBCratesRegister;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    public static void register() {
        eventBus.addGenericListener(Block.class, CBBlockRegister::register);
        eventBus.addGenericListener(Block.class, CBCratesRegister::register);
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> FMLJavaModLoadingContext.get().getModEventBus().addListener(CBRegistryEvent::translucentRender));
        
        LOG.info("Successfully registered all Blocks and Crates!");
    }
    
    private static void translucentRender(final FMLCommonSetupEvent e) {
        for (RegistryObject<Block> registryObject : BLOCKS.getEntries()) {
            ItemBlockRenderTypes.setRenderLayer(registryObject.get(), RenderType.translucent());
        }
        for (RegistryObject<Block> registryObject : CRATE_BLOCKS.getEntries()) {
            ItemBlockRenderTypes.setRenderLayer(registryObject.get(), RenderType.cutout());
        }
    }
}
