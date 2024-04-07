package net.sashiro.compressedblocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
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

public class CompressedBlocksClient implements ClientModInitializer {
    
    private static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroup.builder(new ResourceLocation(MOD_ID, "compressed_blocks"))
            .icon(() -> new ItemStack(BlockList.STONE_6.asItem()))
            .title(Component.translatable("itemGroup.compressed_blocks"))
            .build();
    
    private static final CreativeModeTab CRATE_ITEMS = FabricItemGroup.builder(new ResourceLocation(MOD_ID, "compressed_items"))
            .icon(() -> new ItemStack(CrateList.APPLE_0.asItem()))
            .title(Component.translatable("itemGroup.compressed_items"))
            .build();
    
    @Override
    public void onInitializeClient() {
        Collection<ItemStack> itemStackBlocks = new ArrayList<>();
        Collection<ItemStack> itemStackCrates = new ArrayList<>();
        
        for (Block block : Constants.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
            itemStackBlocks.add(new ItemStack(block));
        }
        
        for (Block block : Constants.CRATES) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
            itemStackCrates.add(new ItemStack(block));
        }
        
        ItemGroupEvents.modifyEntriesEvent(COMPRESSED_BLOCKS).register(content -> content.acceptAll(itemStackBlocks));
        ItemGroupEvents.modifyEntriesEvent(CRATE_ITEMS).register(content -> content.acceptAll(itemStackCrates));
        
        LOG.info(String.format("Successfully registered: %d Blocks and %d Crates!", itemStackBlocks.size(), itemStackCrates.size()));
    }
}
