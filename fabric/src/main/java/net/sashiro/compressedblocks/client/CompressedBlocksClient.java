package net.sashiro.compressedblocks.client;

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
import net.sashiro.compressedblocks.block.CBBlocks;
import net.sashiro.compressedblocks.block.CBCrates;
import net.sashiro.compressedblocks.registry.CBBlocksRegister;
import net.sashiro.compressedblocks.registry.CBCratesRegister;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CompressedBlocksClient implements ClientModInitializer {
    
    public static final ResourceKey<CreativeModeTab> COMPRESSED_BLOCKS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "compressed_blocks"));
    public static final ResourceKey<CreativeModeTab> CRATE_ITEMS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "compressed_items"));
    
    private static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CBBlocks.DIRT_2.asItem()))
            .title(Component.translatable("itemGroup.compressed_blocks"))
            .build();
    
    private static final CreativeModeTab CRATE_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CBCrates.APPLE_0.asItem()))
            .title(Component.translatable("itemGroup.compressed_items"))
            .build();
    
    @Override
    public void onInitializeClient() {
        // DIRT
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_0, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_1, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_2, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_3, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_4, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_5, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_6, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_7, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_8, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.DIRT_9, RenderType.translucent());
        // COBBLESTONE
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_0, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_1, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_2, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_3, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_4, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_5, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_6, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_7, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_8, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.COBBLESTONE_9, RenderType.translucent());
        // STONE
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_0, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_1, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_2, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_3, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_4, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_5, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_6, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_7, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_8, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(CBBlocks.STONE_9, RenderType.translucent());
        
        // CRATE - APPLES
        BlockRenderLayerMap.INSTANCE.putBlock(CBCrates.APPLE_0, RenderType.cutout());
        
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "compressed_blocks"), COMPRESSED_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MOD_ID, "compressed_items"), CRATE_ITEMS);
        
        ItemGroupEvents.modifyEntriesEvent(COMPRESSED_BLOCKS_KEY).register(content -> content.acceptAll(CBBlocksRegister.BLOCKS));
        
        ItemGroupEvents.modifyEntriesEvent(CRATE_ITEMS_KEY).register(content -> content.acceptAll(CBCratesRegister.CRATES));
    }
}
