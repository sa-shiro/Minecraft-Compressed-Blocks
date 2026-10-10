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
import net.sashiro.compressedblocks.block.CompressedBlockFactory;
import net.sashiro.compressedblocks.crate.CrateFactory;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public class CompressedBlocksForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CompressedBlocksForge.CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> CompressedBlockFactory.STONE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CompressedBlocksForge.ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final RegistryObject<CreativeModeTab> CRATES_TAB = CompressedBlocksForge.CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(COMPRESSED_BLOCKS_TAB.getKey())
            .title(Component.literal("Crates"))
            .icon(() -> CrateFactory.GOLDEN_APPLE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CompressedBlocksForge.CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    private static boolean finished = false;

    public CompressedBlocksForge() {
        CompressedBlocks.init();

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CRATE_BLOCKS.register(modEventBus);
        CRATE_ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        modEventBus.addListener(this::reg);
    }

    /**
     * Required because the registration will be frozen before Registry is fired.
     *
     * @param event RegisterEvent
     */
    private void reg(RegisterEvent event) {
        if (!finished) {
            BlockRegistration.registerBlocks();
            CrateRegistration.registerCrates();
            LOG.info("Compressed Blocks Forge mod initialized successfully. Registered {} Blocks and {} Crates.", Constants.BLOCKS.size(), Constants.CRATE_ITEMS.size() + Constants.CRATE_BLOCKS.size());

            finished = true;
        }
    }
}