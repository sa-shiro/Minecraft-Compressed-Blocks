package net.sashiro.compressedblocks.neoforge;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
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
import net.sashiro.compressedblocks.platform.registry.CBBlockRegistry;
import net.sashiro.compressedblocks.platform.registry.CBCrateRegistry;

import java.util.function.Supplier;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.STONE;
import static net.sashiro.compressedblocks.block.CrateList.APPLE;

@SuppressWarnings("unused")
@Mod(Constants.MOD_ID)
public class CompressedBlocksNeoForge {

    private static boolean finished = false;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Item.Properties PROPERTIES = new Item.Properties();

    public static final Supplier<CreativeModeTab> CRATES_TAB = CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MOD_ID, "compressed_blocks"))
            .title(Component.literal("Crates"))
            .icon(() -> APPLE[0].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());

    public static final Supplier<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> STONE[0].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (DeferredHolder<Item, ? extends Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());

    public CompressedBlocksNeoForge(IEventBus modEventBus, ModContainer modContainer) {
        CompressedBlocks.init();

        modContainer.registerConfig(ModConfig.Type.STARTUP, CBNeoForgeConfig.CONFIG_SPEC);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CRATE_BLOCKS.register(modEventBus);
        CRATE_ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::reg);

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