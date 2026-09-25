package net.sashiro.compressedblocks.util;

public record CompressionEntry(String id, Kind kind, float hardnessResistanceMultiplier, int maxCompressionLevel,
                               boolean hasSmallerCompression, boolean enabledByDefault) {

    public enum Kind {
        BLOCK,
        ROT_BLOCK,
        GLASS_BLOCK,
        CRATE_ITEM,
        CRATE_BLOCK
    }
}
