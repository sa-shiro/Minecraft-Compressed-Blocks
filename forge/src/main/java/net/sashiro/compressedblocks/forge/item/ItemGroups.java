package net.sashiro.compressedblocks.forge.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.STONE;
import static net.sashiro.compressedblocks.block.CrateList.APPLE;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {

    public static final RegistryObject<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CompressedBlocksForge.CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> STONE[9].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CompressedBlocksForge.ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());

    public static final RegistryObject<CreativeModeTab> CRATES_TAB = CompressedBlocksForge.CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(COMPRESSED_BLOCKS_TAB.getKey())
            .title(Component.literal("Crates"))
            .icon(() -> APPLE[0].asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CompressedBlocksForge.CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
}