package net.sashiro.compressedblocks.forge;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.STONE;
import static net.sashiro.compressedblocks.block.CrateList.APPLE;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public class CompressedBlocksForge {

    private static boolean finished = false;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> STONE[9].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final RegistryObject<CreativeModeTab> CRATES_TAB = CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(COMPRESSED_BLOCKS_TAB.getKey())
            .title(Component.literal("Crates"))
            .icon(() -> APPLE[0].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final Item.Properties PROPERTIES = new Item.Properties();
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public CompressedBlocksForge() {
        CompressedBlocks.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CRATE_BLOCKS.register(eventBus);
        CRATE_ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);

        eventBus.addListener(this::reg);

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
}