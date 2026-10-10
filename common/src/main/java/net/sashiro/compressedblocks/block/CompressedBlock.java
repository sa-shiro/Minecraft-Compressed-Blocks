package net.sashiro.compressedblocks.block;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.sashiro.compressedblocks.compression.Compression;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Interface for compressed blocks
 */
public interface CompressedBlock {

    /**
     * Function to get the block name
     *
     * @return Block name
     */
    String blockName();

    /**
     * Function to get the compressor of the block
     *
     * @return {@link Compression} Compressor
     */
    Compression getCompressor();

    void appendHoverText(@NotNull ItemStack is, Level tc, @NotNull List<Component> lC, @NotNull TooltipFlag ttf);
}
