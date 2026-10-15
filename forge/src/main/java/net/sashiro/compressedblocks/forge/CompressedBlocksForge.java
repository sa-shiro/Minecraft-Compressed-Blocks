package net.sashiro.compressedblocks.forge;


import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.listener.Priority;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.block.CompressedBlockFactory;
import net.sashiro.compressedblocks.crate.CrateFactory;
import net.sashiro.compressedblocks.platform.registration.BlockRegistration;
import net.sashiro.compressedblocks.platform.registration.CrateRegistration;

import java.util.function.Supplier;

import static net.sashiro.compressedblocks.CompressedBlocks.LOGGER;
import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;

/**
 * Forge entry point for Compressed Blocks.
 *
 * <p>Initializes the common mod infrastructure and registers the mod's deferred
 * registries for compressed blocks, block items, crates, crate items, and creative
 * mode tabs.</p>
 *
 * <p>Block and crate registration is performed when the block registry is being
 * processed. The {@code finished} flag ensures that this registration and the
 * initialization log are executed only once.</p>
 *
 * @see CompressedBlocks
 * @see BlockRegistration
 * @see CrateRegistration
 * @see CompressedBlockFactory
 * @see CrateFactory
 * @see <a href="https://docs.minecraftforge.net/en/latest/">Forge Documentation</a>
 */
@SuppressWarnings("unused")
@Mod(MOD_ID)
public class CompressedBlocksForge {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<Block> CRATE_BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> CRATE_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final Supplier<CreativeModeTab> CRATES_TAB = CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(Identifier.fromNamespaceAndPath(MOD_ID, "compressed_blocks"))
            .title(Component.literal("Crates"))
            .icon(() -> CrateFactory.GOLDEN_APPLE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    public static final Supplier<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> CompressedBlockFactory.STONE.asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    private static boolean finished = false;

    public CompressedBlocksForge(FMLJavaModLoadingContext context) {
        CompressedBlocks.init();
        var modBusGroup = context.getModBusGroup();

        BLOCKS.register(modBusGroup);
        ITEMS.register(modBusGroup);
        CRATE_BLOCKS.register(modBusGroup);
        CRATE_ITEMS.register(modBusGroup);
        CREATIVE_MODE_TABS.register(modBusGroup);

        RegisterEvent.getBus(modBusGroup).addListener(Priority.HIGHEST, this::reg);
    }


    @SubscribeEvent
    private void reg(RegisterEvent event) {
        ResourceKey<? extends Registry<?>> currentRegistry = event.getRegistryKey();
        ResourceKey<? extends Registry<?>> requiredRegistry = BuiltInRegistries.BLOCK.key();

        if (!finished && currentRegistry.equals(requiredRegistry)) {

            BlockRegistration.registerBlocks();
            CrateRegistration.registerCrates();
            LOGGER.info("Compressed Blocks Forge mod initialized successfully. Registered {} Blocks and {} Crates.", CompressedBlocks.COMPRESSED_BLOCKS.size(), CompressedBlocks.CRATE_BLOCKS.size() + CompressedBlocks.CRATE_ITEMS.size());

            finished = true;
        }
    }
}