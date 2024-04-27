package net.sashiro.compressedblocks.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.client.renderer.RenderType;
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

    public static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "compressed_blocks"), () -> new ItemStack(BlockList.STONE[9]));
    public static final CreativeModeTab CRATE_ITEMS = FabricItemGroupBuilder.build(new ResourceLocation(MOD_ID, "compressed_items"), () -> new ItemStack(CrateList.APPLE[0]));

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

        LOG.info(String.format("Successfully registered: %d Blocks and %d Crates!", itemStackBlocks.size(), itemStackCrates.size()));
    }
}
