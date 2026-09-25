package net.sashiro.compressedblocks.block;

import net.sashiro.compressedblocks.util.Compression;

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
}
