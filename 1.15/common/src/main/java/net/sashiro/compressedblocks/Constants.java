package net.sashiro.compressedblocks;

import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.Collection;

public class Constants {
    
    public static final String MOD_ID = "compressedblocks";
    public static final String MOD_NAME = "Compressed Blocks";
    public static final float[] HARDNESS = {5.0F, 6.5F, 8.5F, 12.5F, 15.0F, 20.5F, 25.5F, 30.5F, 40.0F, 50.0F};
    public static final float[] RESISTANCE = {35.5F, 75.0F, 150.0F, 300.0F, 600.0F, 800.0F, 1250.0F, 2000.0F, 5000.0F, 7500.0F};
    public static final String c0 = "crated_";
    public static final String c1 = "double_crated_";
    public static final String c2 = "triple_crated_";
    public static final String c3 = "quadruple_crated_";
    public static final String c4 = "quintuple_crated_";
    public static final String c5 = "sextuple_crated_";
    public static final String c6 = "septuple_crated_";
    public static final String c7 = "octuple_crated_";
    public static final String c8 = "mega_crated_";
    public static final String c9 = "giga_crated_";
    public static Collection<Block> BLOCKS = new ArrayList<>();
    public static Collection<Block> CRATES = new ArrayList<>();
}