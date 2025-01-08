package net.sashiro.compressedblocks.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.BlockList;
import net.sashiro.compressedblocks.block.CrateList;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
public class CompressedBlocksClient implements ClientModInitializer {

    public static final ResourceKey<CreativeModeTab> COMPRESSED_BLOCKS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compressed_blocks"));
    public static final ResourceKey<CreativeModeTab> CRATE_ITEMS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compressed_items"));

    private static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlockList.STONE[9].asItem()))
            .title(Component.translatable("itemGroup.compressed_blocks"))
            .build();

    private static final CreativeModeTab CRATE_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CrateList.APPLE[0].asItem()))
            .title(Component.translatable("itemGroup.compressed_items"))
            .build();

    @Override
    public void onInitializeClient() {
        Collection<ItemStack> itemStackBlocks = new ArrayList<>();
        Collection<ItemStack> itemStackCrates = new ArrayList<>();

        for (Block block : Constants.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
            itemStackBlocks.add(new ItemStack(block));
        }

        for (Block block : Constants.CRATES) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
            itemStackCrates.add(new ItemStack(block));
        }

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, COMPRESSED_BLOCKS_KEY.location().getPath()), COMPRESSED_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, CRATE_ITEMS_KEY.location().getPath()), CRATE_ITEMS);

        ItemGroupEvents.modifyEntriesEvent(COMPRESSED_BLOCKS_KEY).register(content -> content.acceptAll(itemStackBlocks));
        ItemGroupEvents.modifyEntriesEvent(CRATE_ITEMS_KEY).register(content -> content.acceptAll(itemStackCrates));

        LOG.info("Successfully registered: {} Blocks and {} Crates!", itemStackBlocks.size(), itemStackCrates.size());
    }
}
