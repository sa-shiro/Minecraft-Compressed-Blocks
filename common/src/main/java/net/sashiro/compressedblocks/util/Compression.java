package net.sashiro.compressedblocks.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;

public class Compression {
    private static final String[] BLOCK_COUNTS_SMALLER = {"4", "16", "64", "256", "1.024", "4.096", "16.384", "65.536", "262.144", "1.048.576"};
    private static final String[] BLOCK_COUNTS = {"9", "81", "729", "6.561", "59.049", "531.441", "4.782.969", "43.046.721", "387.420.489", "3.486.784.401"};
    private static final ChatFormatting[] STYLES = {ChatFormatting.WHITE, ChatFormatting.GREEN, ChatFormatting.AQUA, ChatFormatting.BLUE, ChatFormatting.DARK_BLUE, ChatFormatting.YELLOW, ChatFormatting.GOLD, ChatFormatting.LIGHT_PURPLE, ChatFormatting.DARK_PURPLE, ChatFormatting.DARK_RED};
    private String blockCount;
    private Style style;
    private boolean hasSmallerCompression;
    private int compressionLevel;

    public Compression() {
        style = Style.EMPTY;
    }

    /**
     * Function to set the Block Count and Style based on the Compression Level
     *
     * @param compressionLevel Compression Level
     */
    public void setCompressionLevel(int compressionLevel, boolean hasSmallerCompression) {
        this.hasSmallerCompression = hasSmallerCompression;
        this.compressionLevel = compressionLevel;
        if (compressionLevel < 0) compressionLevel = 0;
        if (compressionLevel > 9) compressionLevel = 9;

        this.blockCount = hasSmallerCompression ? BLOCK_COUNTS_SMALLER[compressionLevel] : BLOCK_COUNTS[compressionLevel];
        this.style = style.applyFormat(STYLES[compressionLevel]);
    }

    /**
     * Function to get the current Block Count
     *
     * @return Block Count
     */
    public String getBlockCount() {
        return this.blockCount;
    }

    /**
     * Function to check if the block has a smaller compression
     *
     * @return True if the block has a smaller compression
     */
    public boolean hasSmallerCompression() {
        return hasSmallerCompression;
    }

    /**
     * Function to get the current Compression Level
     *
     * @return Compression Level
     */
    public int getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Function to set the Block Count and Style based on the Compression Level
     *
     * @param compressionLevel Compression Level
     */
    public void setCompressionLevel(int compressionLevel) {
        setCompressionLevel(compressionLevel, false);
    }

    /**
     * Function to get the current Style
     *
     * @return Style
     */
    public Style getStyle() {
        return this.style;
    }
}