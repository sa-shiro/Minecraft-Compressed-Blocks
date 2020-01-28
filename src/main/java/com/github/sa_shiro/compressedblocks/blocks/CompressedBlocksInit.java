package com.github.sa_shiro.compressedblocks.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraftforge.registries.ObjectHolder;

import static com.github.sa_shiro.compressedblocks.CompressedBlocks.MOD_ID;

public class CompressedBlocksInit {

    public static final String singleCompression = MOD_ID + ":compressed_";
    public static final String doubleCompression = MOD_ID + ":double_compressed_";
    public static final String tripleCompression = MOD_ID + ":triple_compressed_";
    public static final String quadCompression = MOD_ID + ":quadruple_compressed_";
    public static final String quinCompression = MOD_ID + ":quintuple_compressed_";
    public static final String sexCompression = MOD_ID + ":sextuple_compressed_";
    public static final String sepCompression = MOD_ID + ":septuple_compressed_";
    public static final String octCompression = MOD_ID + ":octuple_compressed_";
    public static final String megaCompression = MOD_ID + ":mega_compressed_";
    public static final String gigaCompression = MOD_ID + ":giga_compressed_";

    // Single compressed Blocks
    public static class Single {
        @ObjectHolder(singleCompression + "stone")
        public static final CompressedBlock COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 0, "stone", 2.0f, 35.0f, 0);
        @ObjectHolder(singleCompression + "granite")
        public static CompressedBlock COMPRESSED_GRANITE;
        @ObjectHolder(singleCompression + "diorite")
        public static CompressedBlock COMPRESSED_DIORITE;
        @ObjectHolder(singleCompression + "andesite")
        public static BlockItem COMPRESSED_ANDESITE;
        @ObjectHolder(singleCompression + "dirt")
        public static CompressedBlock COMPRESSED_DIRT;
        @ObjectHolder(singleCompression + "cobblestone")
        public static CompressedBlock COMPRESSED_COBBLESTONE;
        @ObjectHolder(singleCompression + "sand")
        public static CompressedBlock COMPRESSED_SAND;
        @ObjectHolder(singleCompression + "red_sand")
        public static CompressedBlock COMPRESSED_RED_SAND;
        @ObjectHolder(singleCompression + "gravel")
        public static CompressedBlock COMPRESSED_GRAVEL;
        @ObjectHolder(singleCompression + "lapis_block")
        public static CompressedBlock COMPRESSED_LAPIS_BLOCK;
        @ObjectHolder(singleCompression + "gold_block")
        public static CompressedBlock COMPRESSED_GOLD_BLOCK;
        @ObjectHolder(singleCompression + "iron_block")
        public static CompressedBlock COMPRESSED_IRON_BLOCK;
        @ObjectHolder(singleCompression + "obsidian")
        public static CompressedBlock COMPRESSED_OBSIDIAN;
        @ObjectHolder(singleCompression + "diamond_block")
        public static CompressedBlock COMPRESSED_DIAMOND_BLOCK;
        @ObjectHolder(singleCompression + "netherrack")
        public static CompressedBlock COMPRESSED_NETHERRACK;
        @ObjectHolder(singleCompression + "soul_sand")
        public static CompressedBlock COMPRESSED_SOUL_SAND;
        @ObjectHolder(singleCompression + "end_stone")
        public static CompressedBlock COMPRESSED_END_STONE;
        @ObjectHolder(singleCompression + "emerald_block")
        public static CompressedBlock COMPRESSED_EMERALD_BLOCK;
        @ObjectHolder(singleCompression + "hay_bale")
        public static CompressedBlock COMPRESSED_HAY_BALE;
        @ObjectHolder(singleCompression + "redstone_block")
        public static CompressedBlock COMPRESSED_REDSTONE_BLOCK;
    }

    // Double compressed Blocks
    public static class Double {
        @ObjectHolder(doubleCompression + "stone")
        public static CompressedBlock DOUBLE_COMPRESSED_STONE = new CompressedBlock(Material.ROCK, SoundType.STONE, 1, "stone", 5.0f, 45.0f, 1);
        @ObjectHolder(doubleCompression + "granite")
        public static CompressedBlock DOUBLE_COMPRESSED_GRANITE;
        @ObjectHolder(doubleCompression + "diorite")
        public static CompressedBlock DOUBLE_COMPRESSED_DIORITE;
        @ObjectHolder(doubleCompression + "andesite")
        public static CompressedBlock DOUBLE_COMPRESSED_ANDESITE;
        @ObjectHolder(doubleCompression + "dirt")
        public static CompressedBlock DOUBLE_COMPRESSED_DIRT;
        @ObjectHolder(doubleCompression + "cobblestone")
        public static CompressedBlock DOUBLE_COMPRESSED_COBBLESTONE;
        @ObjectHolder(doubleCompression + "sand")
        public static CompressedBlock DOUBLE_COMPRESSED_SAND;
        @ObjectHolder(doubleCompression + "red_sand")
        public static CompressedBlock DOUBLE_COMPRESSED_RED_SAND;
        @ObjectHolder(doubleCompression + "gravel")
        public static CompressedBlock DOUBLE_COMPRESSED_GRAVEL;
        @ObjectHolder(doubleCompression + "lapis_block")
        public static CompressedBlock DOUBLE_COMPRESSED_LAPIS_BLOCK;
        @ObjectHolder(doubleCompression + "gold_block")
        public static CompressedBlock DOUBLE_COMPRESSED_GOLD_BLOCK;
        @ObjectHolder(doubleCompression + "iron_block")
        public static CompressedBlock DOUBLE_COMPRESSED_IRON_BLOCK;
        @ObjectHolder(doubleCompression + "obsidian")
        public static CompressedBlock DOUBLE_COMPRESSED_OBSIDIAN;
        @ObjectHolder(doubleCompression + "diamond_block")
        public static CompressedBlock DOUBLE_COMPRESSED_DIAMOND_BLOCK;
        @ObjectHolder(doubleCompression + "netherrack")
        public static CompressedBlock DOUBLE_COMPRESSED_NETHERRACK;
        @ObjectHolder(doubleCompression + "soul_sand")
        public static CompressedBlock DOUBLE_COMPRESSED_SOUL_SAND;
        @ObjectHolder(doubleCompression + "end_stone")
        public static CompressedBlock DOUBLE_COMPRESSED_END_STONE;
        @ObjectHolder(doubleCompression + "emerald_block")
        public static CompressedBlock DOUBLE_COMPRESSED_EMERALD_BLOCK;
        @ObjectHolder(doubleCompression + "hay_bale")
        public static CompressedBlock DOUBLE_COMPRESSED_HAY_BALE;
        @ObjectHolder(doubleCompression + "redstone_block")
        public static CompressedBlock DOUBLE_COMPRESSED_REDSTONE_BLOCK;
    }

    // Triple compressed Blocks
    public static class Triple {
        @ObjectHolder(tripleCompression + "stone")
        public static CompressedBlock TRIPLE_COMPRESSED_STONE;
        @ObjectHolder(tripleCompression + "granite")
        public static CompressedBlock TRIPLE_COMPRESSED_GRANITE;
    }

    // Quadruple compressed Blocks
    public static class Quad {
        @ObjectHolder(quadCompression + "stone")
        public static CompressedBlock QUADRUPLE_COMPRESSED_STONE;
        @ObjectHolder(quadCompression + "granite")
        public static CompressedBlock QUADRUPLE_COMPRESSED_GRANITE;
    }

    // Quintuple compressed Blocks
    public static class Quin {
        @ObjectHolder(quinCompression + "stone")
        public static CompressedBlock QUINTUPLE_COMPRESSED_STONE;
        @ObjectHolder(quinCompression + "granite")
        public static CompressedBlock QUINTUPLE_COMPRESSED_GRANITE;
    }

    // Sextuple compressed Blocks
    public static class Sext {
        @ObjectHolder(sexCompression + "stone")
        public static CompressedBlock SEXTUPLE_COMPRESSED_STONE;
        @ObjectHolder(sexCompression + "granite")
        public static CompressedBlock SEXTUPLE_COMPRESSED_GRANITE;
    }

    // Septuple compressed Blocks
    public static class Sept {
        @ObjectHolder(sepCompression + "stone")
        public static CompressedBlock SEPTUPLE_COMPRESSED_STONE;
        @ObjectHolder(sepCompression + "granite")
        public static CompressedBlock SEPTUPLE_COMPRESSED_GRANITE;
    }

    // Octuple compressed Blocks
    public static class Oct {
        @ObjectHolder(octCompression + "stone")
        public static CompressedBlock OCTUPLE_COMPRESSED_STONE;
        @ObjectHolder(octCompression + "granite")
        public static CompressedBlock OCTUPLE_COMPRESSED_GRANITE;
    }

    // Mega compressed Blocks
    public static class Mega {
        @ObjectHolder(megaCompression + "stone")
        public static CompressedBlock MEGA_COMPRESSED_STONE;
        @ObjectHolder(megaCompression + "granite")
        public static CompressedBlock MEGA_COMPRESSED_GRANITE;
    }

    // Giga compressed Blocks
    public static class Giga {
        @ObjectHolder(gigaCompression + "stone")
        public static CompressedBlock GIGA_COMPRESSED_STONE;
        @ObjectHolder(gigaCompression + "granite")
        public static CompressedBlock GIGA_COMPRESSED_GRANITE;
    }
}
