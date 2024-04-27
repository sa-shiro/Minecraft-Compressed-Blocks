package net.sashiro.compressedblocks.forge;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod(Constants.MOD_ID)
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CompressedBlocksForge {

    private static boolean finished = false;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public CompressedBlocksForge() {
        CompressedBlocks.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);

        eventBus.addGenericListener(Block.class, CompressedBlocksForge::reg);

        LOG.info("Successfully registered all Blocks and Crates!");
    }

    /**
     * Required because the registration will be frozen before {@link CBBlockRegistry} is fired.
     *
     * @param event RegisterEvent
     */
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void reg(RegistryEvent.Register<Block> event) {
        if (!finished) {
            CBBlockRegistry.registerBlocks();
            CBCrateRegistry.registerCrates();
            finished = true;
        }
    }
}