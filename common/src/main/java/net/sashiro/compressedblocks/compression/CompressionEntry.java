package net.sashiro.compressedblocks.compression;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record CompressionEntry(
        String id,
        Kind kind,
        float hardnessResistanceMultiplier,
        int maxCompressionLevel,
        boolean hasSmallerCompression,
        boolean enabledByDefault,
        String minecraftVersion
) {
    public static final Codec<CompressionEntry> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.STRING.fieldOf("id").forGetter(CompressionEntry::id),
                    Codec.STRING.xmap(Kind::valueOf, Kind::name)
                            .fieldOf("kind")
                            .forGetter(CompressionEntry::kind),
                    Codec.FLOAT.fieldOf("hardness_resistance_multiplier")
                            .forGetter(CompressionEntry::hardnessResistanceMultiplier),
                    Codec.INT.fieldOf("max_compression_level")
                            .forGetter(CompressionEntry::maxCompressionLevel),
                    Codec.BOOL.fieldOf("has_smaller_compression")
                            .forGetter(CompressionEntry::hasSmallerCompression),
                    Codec.BOOL.fieldOf("enabled_by_default")
                            .forGetter(CompressionEntry::enabledByDefault),
                    Codec.STRING.fieldOf("minecraft_version")
                            .forGetter(CompressionEntry::minecraftVersion)
            ).apply(instance, CompressionEntry::new)
    );

    public enum Kind {
        BLOCK,
        ROT_BLOCK,
        GLASS_BLOCK,
        CRATE_ITEM,
        CRATE_BLOCK
    }
}