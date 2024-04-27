package net.sashiro.compressedblocks.forge.data;

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
    public static final Tag.Named<Block> SINGLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "single"));
    public static final Tag.Named<Block> DOUBLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "double"));
    public static final Tag.Named<Block> TRIPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "triple"));
    public static final Tag.Named<Block> QUADRUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quadruple"));
    public static final Tag.Named<Block> QUINTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quintuple"));
    public static final Tag.Named<Block> SEXTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "sextuple"));
    public static final Tag.Named<Block> SEPTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "septuple"));
    public static final Tag.Named<Block> OCTUPLE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "octuple"));
    public static final Tag.Named<Block> MEGA = BlockTags.createOptional(new ResourceLocation(MOD_ID, "mega"));
    public static final Tag.Named<Block> GIGA = BlockTags.createOptional(new ResourceLocation(MOD_ID, "giga"));
    public static final Tag.Named<Item> SINGLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "single"));
    public static final Tag.Named<Item> DOUBLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "double"));
    public static final Tag.Named<Item> TRIPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "triple"));
    public static final Tag.Named<Item> QUADRUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quadruple"));
    public static final Tag.Named<Item> QUINTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quintuple"));
    public static final Tag.Named<Item> SEXTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "sextuple"));
    public static final Tag.Named<Item> SEPTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "septuple"));
    public static final Tag.Named<Item> OCTUPLE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "octuple"));
    public static final Tag.Named<Item> MEGA_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "mega"));
    public static final Tag.Named<Item> GIGA_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "giga"));


    public static final Tag.Named<Block> SINGLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "single_crate"));
    public static final Tag.Named<Block> DOUBLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "double_crate"));
    public static final Tag.Named<Block> TRIPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "triple_crate"));
    public static final Tag.Named<Block> QUADRUPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quadruple_crate"));
    public static final Tag.Named<Block> QUINTUPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "quintuple_crate"));
    public static final Tag.Named<Block> SEXTUPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "sextuple_crate"));
    public static final Tag.Named<Block> SEPTUPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "septuple_crate"));
    public static final Tag.Named<Block> OCTUPLE_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "octuple_crate"));
    public static final Tag.Named<Block> MEGA_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "mega_crate"));
    public static final Tag.Named<Block> GIGA_CRATE = BlockTags.createOptional(new ResourceLocation(MOD_ID, "giga_crate"));
    public static final Tag.Named<Item> SINGLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "single_crate"));
    public static final Tag.Named<Item> DOUBLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "double_crate"));
    public static final Tag.Named<Item> TRIPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "triple_crate"));
    public static final Tag.Named<Item> QUADRUPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quadruple_crate"));
    public static final Tag.Named<Item> QUINTUPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "quintuple_crate"));
    public static final Tag.Named<Item> SEXTUPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "sextuple_crate"));
    public static final Tag.Named<Item> SEPTUPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "septuple_crate"));
    public static final Tag.Named<Item> OCTUPLE_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "octuple_crate"));
    public static final Tag.Named<Item> MEGA_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "mega_crate"));
    public static final Tag.Named<Item> GIGA_CRATE_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "giga_crate"));

    public static final Tag.Named<Block> C0 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c0"));
    public static final Tag.Named<Block> C1 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c1"));
    public static final Tag.Named<Block> C2 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c2"));
    public static final Tag.Named<Block> C3 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c3"));
    public static final Tag.Named<Block> C4 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c4"));
    public static final Tag.Named<Block> C5 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c5"));
    public static final Tag.Named<Block> C6 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c6"));
    public static final Tag.Named<Block> C7 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c7"));
    public static final Tag.Named<Block> C8 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c8"));
    public static final Tag.Named<Block> C9 = BlockTags.createOptional(new ResourceLocation(MOD_ID, "c9"));
    public static final Tag.Named<Item> C0_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c0"));
    public static final Tag.Named<Item> C1_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c1"));
    public static final Tag.Named<Item> C2_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c2"));
    public static final Tag.Named<Item> C3_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c3"));
    public static final Tag.Named<Item> C4_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c4"));
    public static final Tag.Named<Item> C5_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c5"));
    public static final Tag.Named<Item> C6_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c6"));
    public static final Tag.Named<Item> C7_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c7"));
    public static final Tag.Named<Item> C8_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c8"));
    public static final Tag.Named<Item> C9_ITEM = ItemTags.createOptional(new ResourceLocation(MOD_ID, "c9"));
}
