package net.sashiro.compressedblocks.neoforge;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.RegisterEvent;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CompressedBlockFactory;
import net.sashiro.compressedblocks.crate.CrateFactory;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

import java.util.function.Supplier;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public class CompressedBlocksNeoForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Supplier<CreativeModeTab> CRATES_TAB = CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(Identifier.fromNamespaceAndPath(MOD_ID, "compressed_blocks"))
            .title(Component.literal("Crates"))
            .icon(() -> CrateFactory.GOLDEN_APPLE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final Supplier<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> CompressedBlockFactory.STONE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    private static boolean finished = false;

    public CompressedBlocksNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        CompressedBlocks.init();

        modContainer.registerConfig(ModConfig.Type.STARTUP, CBNeoForgeConfig.CONFIG_SPEC);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CRATE_BLOCKS.register(modEventBus);
        CRATE_ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::reg);

        LOG.info("Compressed Blocks NeoForge mod initialized successfully. Registered {} Blocks and {} Crates.", Constants.BLOCKS.size(), Constants.CRATE_BLOCKS.size() + Constants.CRATE_ITEMS.size());
    }

    /**
     * Required because the registration will be frozen before {@link BlockRegistration} is fired.
     *
     * @param event RegisterEvent
     */
    private void reg(RegisterEvent event) {
        if (!finished) {
            BlockRegistration.registerBlocks();
            CrateRegistration.registerCrates();
            finished = true;
        }
    }
}