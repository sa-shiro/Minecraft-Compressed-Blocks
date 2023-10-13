package net.sashiro.compressedblocks.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;

public class Compression {
    protected String blockCount;
    protected Style style;

    public Compression() {
        style = Style.EMPTY;
    }

    /**
     * @param compressionLevel Level of compression. <br>Min: 0<br> Max: 9
     */
    public void setCompressionLevel(int compressionLevel) {
        if (compressionLevel < 0) compressionLevel = 0;
        if (compressionLevel > 9) compressionLevel = 9;
        switch (compressionLevel) {
            case 0 -> {
                this.blockCount = "9";
                this.style = style.applyFormat(ChatFormatting.WHITE);
            }
            case 1 -> {
                this.blockCount = "81";
                this.style = style.applyFormat(ChatFormatting.YELLOW);
            }
            case 2 -> {
                this.blockCount = "729";
                this.style = style.applyFormat(ChatFormatting.YELLOW);
            }
            case 3 -> {
                this.blockCount = "6.561";
                this.style = style.applyFormat(ChatFormatting.YELLOW);
            }
            case 4 -> {
                this.blockCount = "59.049";
                this.style = style.applyFormat(ChatFormatting.AQUA);
            }
            case 5 -> {
                this.blockCount = "531.441";
                this.style = style.applyFormat(ChatFormatting.AQUA);
            }
            case 6 -> {
                this.blockCount = "4.782.969";
                this.style = style.applyFormat(ChatFormatting.LIGHT_PURPLE);
            }
            case 7 -> {
                this.blockCount = "43.046.721";
                this.style = style.applyFormat(ChatFormatting.DARK_PURPLE);
            }
            case 8 -> {
                this.blockCount = "387.420.489";
                this.style = style.applyFormat(ChatFormatting.RED);
            }
            case 9 -> {
                this.blockCount = "3.486.784.101";
                this.style = style.applyFormat(ChatFormatting.DARK_RED);
            }
        }
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
     * Function to get the current Style
     *
     * @return Style
     */
    public Style getStyle() {
        return this.style;
    }
}