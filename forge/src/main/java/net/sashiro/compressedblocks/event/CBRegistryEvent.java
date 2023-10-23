package net.sashiro.compressedblocks.event;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBRegistryEvent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    private static boolean finished = false;

    public static void register() {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);

        LOG.info("Successfully registered all Blocks and Crates!");
    }

    /**
     * Required because Forge doesn't let us use Vanilla Registries and<br>
     * if using DeferredRegister the registration will be frozen before the Block and Item registration is fired.
     *
     * @param event RegisterEvent
     */
    @SubscribeEvent
    public static void reg(RegisterEvent event) {
        if (!finished) {
            CBBlockRegistry.registerBlocks();
            CBCrateRegistry.registerCrates();
            finished = true;
        }
    }
}
