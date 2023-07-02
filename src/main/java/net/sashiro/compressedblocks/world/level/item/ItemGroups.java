package net.sashiro.compressedblocks.world.level.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.*;
import static net.sashiro.compressedblocks.world.level.block.CompressedBlocks.DIRT_9;
import static net.sashiro.compressedblocks.world.level.item.CrateItems.APPLE_0;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {
    
    public static final RegistryObject<CreativeModeTab> COMPRESSED_BLOCKS_TAB = CREATIVE_MODE_TABS.register("compressed_blocks", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.literal("Compressed Blocks"))
            .icon(() -> DIRT_9.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
    
    public static final RegistryObject<CreativeModeTab> CRATES_TAB = CREATIVE_MODE_TABS.register("compressed_items", () -> CreativeModeTab.builder()
            .withTabsBefore(COMPRESSED_BLOCKS_TAB.getKey())
            .title(Component.literal("Crates"))
            .icon(() -> APPLE_0.get().asItem().getDefaultInstance())
            .displayItems((parameters, output) -> {
                for (RegistryObject<Item> item : CRATE_ITEMS.getEntries()) {
                    output.accept(item.get());
                }
            }).build());
}