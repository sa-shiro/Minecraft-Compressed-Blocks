package net.sashiro.compressedblocks.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.block.CompressedBlockFactory;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.crate.CrateFactory;
import net.sashiro.compressedblocks.item.CrateItem;

import static net.sashiro.compressedblocks.CompressedBlocks.LOGGER;
import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;

@SuppressWarnings("unused")
public class CBFabricClient implements ClientModInitializer {

    public static final ResourceKey<CreativeModeTab> COMPRESSED_BLOCKS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "compressed_blocks"));
    public static final ResourceKey<CreativeModeTab> CRATE_ITEMS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(MOD_ID, "compressed_items"));

    private static final CreativeModeTab COMPRESSED_BLOCKS =
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(CompressedBlockFactory.STONE))
                    .title(Component.translatable("itemGroup.compressed_blocks"))
                    .displayItems((params, output) -> CompressedBlocks.COMPRESSED_BLOCKS.forEach(output::accept))
                    .build();

    private static final CreativeModeTab CRATE_ITEMS =
            FabricCreativeModeTab.builder()
                    .icon(() -> new ItemStack(CrateFactory.GOLDEN_APPLE))
                    .title(Component.translatable("itemGroup.compressed_items"))
                    .displayItems((params, output) -> {
                        CompressedBlocks.CRATE_ITEMS.forEach(output::accept);
                        CompressedBlocks.CRATE_BLOCKS.forEach(output::accept);
                    })
                    .build();

    @Override
    public void onInitializeClient() {
        ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {

            // Compressed blocks: BasicCompressedBlock + RotationalCompressedBlock
            if (Block.byItem(itemStack.getItem()) instanceof CompressedBlock block) {
                list.add(Component.literal(block.getCompressor().getQuantity() + " Blocks").withStyle(block.getCompressor().getStyle()));

                // Crate item
            } else if (itemStack.getItem() instanceof CrateItem crateItem) {
                list.add(Component.literal(crateItem.getCompressor().getQuantity() + " Items").withStyle(crateItem.getCompressor().getStyle()));

                // Crate block
            } else if (Block.byItem(itemStack.getItem()) instanceof CrateBlock crateBlock) {
                list.add(Component.literal(crateBlock.getCompressor().getQuantity() + " Items").withStyle(crateBlock.getCompressor().getStyle()));
            }
        });

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, COMPRESSED_BLOCKS_KEY, COMPRESSED_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CRATE_ITEMS_KEY, CRATE_ITEMS);

        LOGGER.info("Successfully registered: {} Blocks and {} Crates!", CompressedBlocks.COMPRESSED_BLOCKS.size(), CompressedBlocks.CRATE_BLOCKS.size() + CompressedBlocks.CRATE_ITEMS.size());
    }
}