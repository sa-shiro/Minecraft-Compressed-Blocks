package net.sashiro.compressedblocks.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
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
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.block.CompressedBlockFactory;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.crate.CrateFactory;
import net.sashiro.compressedblocks.item.CrateItem;

import java.util.ArrayList;
import java.util.Collection;

import static net.sashiro.compressedblocks.Constants.LOG;
import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
public class CBFabricClient implements ClientModInitializer {

    public static final ResourceKey<CreativeModeTab> COMPRESSED_BLOCKS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compressed_blocks"));
    public static final ResourceKey<CreativeModeTab> CRATE_ITEMS_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, "compressed_items"));

    private static final CreativeModeTab COMPRESSED_BLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CompressedBlockFactory.STONE))
            .title(Component.translatable("itemGroup.compressed_blocks"))
            .build();

    private static final CreativeModeTab CRATE_ITEMS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CrateFactory.GOLDEN_APPLE))
            .title(Component.translatable("itemGroup.compressed_items"))
            .build();

    @Override
    public void onInitializeClient() {
        Collection<ItemStack> itemStackBlocks = new ArrayList<>();
        Collection<ItemStack> itemStackCrates = new ArrayList<>();
        Collection<ItemStack> itemStackBlockCrates = new ArrayList<>();

        for (Block block : Constants.BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
            itemStackBlocks.add(new ItemStack(block));
        }

        for (Item item : Constants.CRATE_ITEMS) {
            itemStackCrates.add(new ItemStack(item));
        }

        for (Block block : Constants.CRATE_BLOCKS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent());
            itemStackBlockCrates.add(new ItemStack(block));
        }

        ItemTooltipCallback.EVENT.register((itemStack, tooltipContext, tooltipType, list) -> {

            // Compressed blocks: BasicCompressedBlock + RotationalCompressedBlock
            if (Block.byItem(itemStack.getItem()) instanceof CompressedBlock block) {
                list.add(
                        Component.literal(
                                block.getCompressor().getQuantity() + " Blocks"
                        ).withStyle(
                                block.getCompressor().getStyle()
                        )
                );

                // Crate item
            } else if (itemStack.getItem() instanceof CrateItem crateItem) {
                list.add(
                        Component.literal(
                                crateItem.getCompressor().getQuantity() + " Items"
                        ).withStyle(
                                crateItem.getCompressor().getStyle()
                        )
                );

                // Crate block
            } else if (Block.byItem(itemStack.getItem()) instanceof CrateBlock crateBlock) {
                list.add(
                        Component.literal(
                                crateBlock.getCompressor().getQuantity() + " Items"
                        ).withStyle(
                                crateBlock.getCompressor().getStyle()
                        )
                );
            }
        });

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, COMPRESSED_BLOCKS_KEY.location().getPath()), COMPRESSED_BLOCKS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(MOD_ID, CRATE_ITEMS_KEY.location().getPath()), CRATE_ITEMS);

        ItemGroupEvents.modifyEntriesEvent(COMPRESSED_BLOCKS_KEY).register(content -> content.acceptAll(itemStackBlocks));
        ItemGroupEvents.modifyEntriesEvent(CRATE_ITEMS_KEY).register(content -> content.acceptAll(itemStackCrates));
        ItemGroupEvents.modifyEntriesEvent(CRATE_ITEMS_KEY).register(content -> content.acceptAll(itemStackBlockCrates));

        LOG.info("Successfully registered: {} Blocks and {} Crates!", itemStackBlocks.size(), itemStackCrates.size());
    }
}