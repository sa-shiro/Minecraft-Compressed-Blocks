package net.sashiro.compressedblocks.neoforge.client;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.item.CrateItem;

/**
 * The CBNeoForgeClient class is responsible for handling client-side events related to the Compressed Blocks mod.
 * It listens for item tooltip events and adds additional information to the tooltip for compressed blocks and crates.
 */
@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public final class CBNeoForgeClient {

    private CBNeoForgeClient() {
    }

    /**
     * Handles the ItemTooltipEvent to add additional information to the tooltip for compressed blocks and crates.
     * If the item is a CrateItem, it adds the quantity of items in the crate to the tooltip.
     * If the item is a BlockItem representing a CompressedBlock, it adds the quantity of blocks or items in the compressed block to the tooltip.
     *
     * @param event The ItemTooltipEvent triggered when an item's tooltip is being generated.
     */
    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();

        if (stack.getItem() instanceof CrateItem crateItem) {
            event.getToolTip().add(Component.literal(crateItem.getCompressor().getQuantity() + " Items").withStyle(crateItem.getCompressor().getStyle()));
            return;
        }

        if (!(stack.getItem() instanceof BlockItem blockItem)) {
            return;
        }

        if (!(blockItem.getBlock() instanceof CompressedBlock compressedBlock)) {
            return;
        }

        String contentType = compressedBlock instanceof CrateBlock ? "Items" : "Blocks";

        event.getToolTip().add(Component.literal(compressedBlock.getCompressor().getQuantity() + " " + contentType).withStyle(compressedBlock.getCompressor().getStyle()));
    }
}