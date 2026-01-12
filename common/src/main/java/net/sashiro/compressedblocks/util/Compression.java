package net.sashiro.compressedblocks.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;

/**
 * Holds display and metadata information derived from a compression level.
 * <p>
 * This class is responsible for converting a compression level into:
 * <ul>
 *   <li>A human-readable quantity representing the number of base units</li>
 *   <li>A visual style used for UI elements such as tooltips or block names</li>
 * </ul>
 * <p>
 * The quantity may represent blocks, items, or any other compressible unit.
 * This class does not assume a specific unit type.
 */
public class Compression {

    /**
     * Human-readable quantities for standard compression (e.g. 9, 81, 729, ...)
     */
    private static final String[] STANDARD_QUANTITIES = {
            "9", "81", "729", "6,561", "59,049",
            "531,441", "4,782,969", "43,046,721",
            "387,420,489", "3,486.784,401"
    };

    /**
     * Human-readable quantities for smaller compression variants (e.g. 4, 16, 64, ...)
     */
    private static final String[] SMALLER_QUANTITIES = {
            "4", "16", "64", "256", "1,024",
            "4,096", "16,384", "65,536",
            "262,144", "1,048,576"
    };

    /**
     * Display styles associated with each compression level
     */
    private static final ChatFormatting[] LEVEL_STYLES = {
            ChatFormatting.WHITE,        // 0 - Base                    - Compressed x9 / x4
            ChatFormatting.GREEN,        // 1 - Common                  - Double Compressed x81 / x16
            ChatFormatting.AQUA,         // 2 - Uncommon                - Triple Compressed x729 / x64
            ChatFormatting.BLUE,         // 3 - Rare                    - Quadruple Compressed x6,561 / x256
            ChatFormatting.DARK_BLUE,    // 4 - Very Rare               - Quintuple Compressed x59,049 / x1,024
            ChatFormatting.YELLOW,       // 5 - Valuable                - Sextuple Compressed x531,441 / x4,096
            ChatFormatting.GOLD,         // 6 - Highly Valuable         - Septuple Compressed x4,782,969 / x16,384
            ChatFormatting.DARK_PURPLE,  // 7 - Epic                    - Octuple Compressed x43,046,721 / x65,536
            ChatFormatting.LIGHT_PURPLE, // 8 - Mythic                  - Mega Compressed x387,420,489 / x262,144
            ChatFormatting.RED           // 9 - Extreme / Ultimate      - Giga Compressed x3,486,784,401 / x1,048,576
    };

    /**
     * Maximum supported compression level
     */
    private static final int MAX_LEVEL = 9;

    private int compressionLevel;
    private boolean smallerCompression;
    private String quantity;
    private Style style = Style.EMPTY;

    /**
     * Creates a new {@code CompressionInfo} instance with no compression applied.
     * <p>
     * The compression level defaults to {@code 0}.
     */
    public Compression() {
        setCompressionLevel(0, false);
    }

    /**
     * Updates all derived values based on the given compression level.
     *
     * @param level              the compression level (clamped between {@code 0} and {@value #MAX_LEVEL})
     * @param smallerCompression whether the compressed unit represents a smaller variant
     */
    public void setCompressionLevel(int level, boolean smallerCompression) {
        this.compressionLevel = clamp(level);
        this.smallerCompression = smallerCompression;

        this.quantity = smallerCompression
                ? SMALLER_QUANTITIES[this.compressionLevel]
                : STANDARD_QUANTITIES[this.compressionLevel];

        this.style = Style.EMPTY.applyFormat(LEVEL_STYLES[this.compressionLevel]);
    }

    /**
     * Returns the current compression level.
     *
     * @return the compression level
     */
    public int getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Updates all derived values based on the given compression level
     * using the standard (non-smaller) compression rules.
     *
     * @param level the compression level
     */
    public void setCompressionLevel(int level) {
        setCompressionLevel(level, false);
    }

    /**
     * Returns whether this compression represents a smaller variant.
     *
     * @return {@code true} if this compression uses smaller units
     */
    public boolean isSmallerCompression() {
        return smallerCompression;
    }

    /**
     * Returns the formatted quantity representing the number of base units.
     * <p>
     * This value is intended for display purposes and is not numeric.
     *
     * @return the human-readable quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Returns the visual style associated with the current compression level.
     *
     * @return the style for UI rendering
     */
    public Style getStyle() {
        return style;
    }

    /**
     * Ensures the compression level stays within valid bounds.
     */
    private int clamp(int level) {
        if (level < 0) return 0;
        return Math.min(level, MAX_LEVEL);
    }
}