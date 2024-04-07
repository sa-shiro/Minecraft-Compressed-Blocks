package net.sashiro.compressedblocks.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.BlockList;
import net.sashiro.compressedblocks.block.CrateList;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

public class CompressedBlocksClient implements ClientModInitializer {
    
    public static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "compressed_blocks"), () -> new ItemStack(BlockList.STONE_6));
    
    public static final CreativeModeTab CRATE_ITEMS = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "compressed_items"), () -> new ItemStack(CrateList.APPLE_0));
    
    @Override
    public void onInitializeClient() {
        NonNullList<ItemStack> itemStackBlocks = NonNullList.create();
        NonNullList<ItemStack> itemStackCrates = NonNullList.create();
        
        for (Block block : Constants.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
            itemStackBlocks.add(new ItemStack(block));
        }
        
        for (Block block : Constants.CRATES) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
            itemStackCrates.add(new ItemStack(block));
        }
    }
}
