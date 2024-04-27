package net.sashiro.compressedblocks.forge;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.forge.item.ItemGroups;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod(Constants.MOD_ID)
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

        eventBus.addListener(this::reg);
        eventBus.addListener(CompressedBlocksForge::addItemsToCreativeTab);

        LOG.info("Successfully registered all Blocks and Crates!");
    }

    /**
     * Required because the registration will be frozen before {@link CBBlockRegistry} is fired.
     *
     * @param event RegisterEvent
     */
    private void reg(RegisterEvent event) {
        if (!finished) {
            CBBlockRegistry.registerBlocks();
            CBCrateRegistry.registerCrates();
            finished = true;
        }
    }

    private static void addItemsToCreativeTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == ItemGroups.BLOCKS_ITEM_GROUP) {
            for (RegistryObject<Block> block : BLOCKS.getEntries()) {
                event.accept(block.get());
            }
        }
        if (event.getTab() == ItemGroups.CRATE_ITEM_GROUP) {
            for (RegistryObject<Item> item : CRATE_ITEMS.getEntries()) {
                event.accept(item.get());
            }
        }
    }
}