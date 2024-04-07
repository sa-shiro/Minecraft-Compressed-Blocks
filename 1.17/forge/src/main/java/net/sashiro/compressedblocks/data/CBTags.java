package net.sashiro.compressedblocks.data;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBTags {
    public static final Tag<Block> SINGLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "single"));
    public static final Tag<Block> DOUBLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "double"));
    public static final Tag<Block> TRIPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "triple"));
    public static final Tag<Block> QUADRUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quadruple"));
    public static final Tag<Block> QUINTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quintuple"));
    public static final Tag<Block> SEXTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "sextuple"));
    public static final Tag<Block> SEPTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "septuple"));
    public static final Tag<Block> OCTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "octuple"));
    public static final Tag<Block> MEGA = BlockTags.createOptional(new ResourceLocation(MOD_ID, "mega"));
    public static final Tag<Block> GIGA = BlockTags.createOptional(new ResourceLocation(MOD_ID, "giga"));
    public static final Tag<Item> SINGLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "single"));
    public static final Tag<Item> DOUBLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "double"));
    public static final Tag<Item> TRIPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "triple"));
    public static final Tag<Item> QUADRUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quadruple"));
    public static final Tag<Item> QUINTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quintuple"));
    public static final Tag<Item> SEXTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "sextuple"));
    public static final Tag<Item> SEPTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "septuple"));
    public static final Tag<Item> OCTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "octuple"));
    public static final Tag<Item> MEGA_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "mega"));
    public static final Tag<Item> GIGA_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "giga"));
    
    
    public static final Tag<Item> SINGLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "single_crate"));
    public static final Tag<Item> DOUBLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "double_crate"));
    public static final Tag<Item> TRIPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "triple_crate"));
    public static final Tag<Item> QUADRUPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quadruple_crate"));
    public static final Tag<Item> QUINTUPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quintuple_crate"));
    public static final Tag<Item> SEXTUPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "sextuple_crate"));
    public static final Tag<Item> SEPTUPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "septuple_crate"));
    public static final Tag<Item> OCTUPLE_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "octuple_crate"));
    public static final Tag<Item> MEGA_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "mega_crate"));
    public static final Tag<Item> GIGA_CRATE = ItemTags.createOptional(new ResourceLocation(MOD_ID, "giga_crate"));
    
    public static final Tag<Block> C0 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c0"));
    public static final Tag<Block> C1 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c1"));
    public static final Tag<Block> C2 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c2"));
    public static final Tag<Block> C3 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c3"));
    public static final Tag<Block> C4 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c4"));
    public static final Tag<Block> C5 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c5"));
    public static final Tag<Block> C6 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c6"));
    public static final Tag<Block> C7 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c7"));
    public static final Tag<Block> C8 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c8"));
    public static final Tag<Block> C9 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c9"));
    public static final Tag<Item> C0_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c0"));
    public static final Tag<Item> C1_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c1"));
    public static final Tag<Item> C2_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c2"));
    public static final Tag<Item> C3_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c3"));
    public static final Tag<Item> C4_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c4"));
    public static final Tag<Item> C5_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c5"));
    public static final Tag<Item> C6_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c6"));
    public static final Tag<Item> C7_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c7"));
    public static final Tag<Item> C8_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c8"));
    public static final Tag<Item> C9_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c9"));
}
