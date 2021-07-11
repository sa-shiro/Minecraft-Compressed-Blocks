package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        assert false;
        for (int i = 0; i < RegistryEvent.BLOCK_REGISTRY.size(); i++) {
            String blockName = RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString();
            boolean isSpecial = blockName.contains("c0_rotten_flesh_block") || blockName.contains("c0_gunpowder_block") || blockName.contains("c0_flint_block");
            if (blockName.contains("c0_") && !isSpecial) {
                String cbBlockName = blockName.replace("compressedblocks:c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getRegistryName().toString().replace("minecraft:", "");
                    if (cbBlockName.equals(mcBlockName) && !isSpecial) {
                        ShapedRecipeBuilder.shaped(
                                RegistryEvent.BLOCK_REGISTRY.get(i).get()) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                        ShapelessRecipeBuilder.shapeless(mcBlock, 9)
                                .requires(RegistryEvent.BLOCK_REGISTRY.get(i).get())
                                .unlockedBy("has_item", has(RegistryEvent.BLOCK_REGISTRY.get(i).get().asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
                    }
                }
            } else if (isSpecial) {
                Item item;
                if (blockName.contains("gunpowder")) {
                    item = Items.GUNPOWDER;
                } else if (blockName.contains("rotten_flesh")) {
                    item = Items.ROTTEN_FLESH;
                } else {
                    item = Items.FLINT;
                }
                ShapedRecipeBuilder.shaped(RegistryEvent.BLOCK_REGISTRY.get(i).get()) // result
                        .define('#', item) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(item))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                ShapelessRecipeBuilder.shapeless(item, 9)
                        .requires(RegistryEvent.BLOCK_REGISTRY.get(i).get())
                        .unlockedBy("has_item", has(RegistryEvent.BLOCK_REGISTRY.get(i).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));

            } else {
                ShapedRecipeBuilder.shaped(RegistryEvent.BLOCK_REGISTRY.get(i).get()) // result
                        .define('#', RegistryEvent.BLOCK_REGISTRY.get(i - 1).get()) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(RegistryEvent.BLOCK_REGISTRY.get(i - 1).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                ShapelessRecipeBuilder.shapeless(RegistryEvent.BLOCK_REGISTRY.get(i - 1).get(), 9)
                        .requires(RegistryEvent.BLOCK_REGISTRY.get(i).get())
                        .unlockedBy("has_item", has(RegistryEvent.BLOCK_REGISTRY.get(i).get().asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
            }
        }

        ShapedRecipeBuilder.shaped(RegistryEvent.COMPRESSED_DIAMOND.get()) // result
                .define('*', Items.DIAMOND) // ingredient
                .define('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("###")
                .pattern("#*#")
                .pattern("###")
                .unlockedBy("has_item", has(Items.DIAMOND))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_DIAMOND.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.COMPRESSED_GOLD.get()) // result
                .define('*', Items.GOLD_INGOT) // ingredient
                .define('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("###")
                .pattern("#*#")
                .pattern("###")
                .unlockedBy("has_item", has(Items.GOLD_INGOT))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_GOLD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.COMPRESSED_IRON.get()) // result
                .define('*', Items.IRON_INGOT) // ingredient
                .define('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("###")
                .pattern("#*#")
                .pattern("###")
                .unlockedBy("has_item", has(Items.IRON_INGOT))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_IRON.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.COMPRESSED_STICK.get()) // result
                .define('*', Items.STICK) // ingredient
                .define('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("###")
                .pattern("#*#")
                .pattern("###")
                .unlockedBy("has_item", has(Items.STICK))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_STICK.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.COMPRESSED_WOOD.get()) // result
                .define('*', ItemTags.PLANKS) // ingredient
                .define('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("###")
                .pattern("#*#")
                .pattern("###")
                .unlockedBy("has_item", has(ItemTags.PLANKS))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_WOOD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.EGG_BAG.get()) // result
                .define('#', Items.EGG) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(Items.EGG))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(Items.EGG, 9)
                .requires(RegistryEvent.EGG_BAG.get())
                .unlockedBy("has_item", has(RegistryEvent.EGG_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HUGE_EGG_BAG.get()) // result
                .define('#', RegistryEvent.EGG_BAG.get()) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(RegistryEvent.EGG_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(RegistryEvent.EGG_BAG.get(), 9)
                .requires(RegistryEvent.HUGE_EGG_BAG.get())
                .unlockedBy("has_item", has(RegistryEvent.HUGE_EGG_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.ENDER_EYE_BAG.get()) // result
                .define('#', Items.ENDER_EYE) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(Items.ENDER_EYE))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(Items.ENDER_EYE, 9)
                .requires(RegistryEvent.ENDER_EYE_BAG.get())
                .unlockedBy("has_item", has(Items.ENDER_EYE))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HUGE_ENDER_EYE_BAG.get()) // result
                .define('#', RegistryEvent.ENDER_EYE_BAG.get()) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(RegistryEvent.ENDER_EYE_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(RegistryEvent.ENDER_EYE_BAG.get(), 9)
                .requires(RegistryEvent.HUGE_ENDER_EYE_BAG.get())
                .unlockedBy("has_item", has(RegistryEvent.HUGE_ENDER_EYE_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.ENDER_PEARL_BAG.get()) // result
                .define('#', Items.ENDER_PEARL) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(Items.ENDER_PEARL))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(Items.ENDER_PEARL, 9)
                .requires(RegistryEvent.ENDER_PEARL_BAG.get())
                .unlockedBy("has_item", has(RegistryEvent.ENDER_PEARL_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HUGE_ENDER_PEARL_BAG.get()) // result
                .define('#', RegistryEvent.ENDER_PEARL_BAG.get()) // ingredient
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(RegistryEvent.ENDER_PEARL_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapeless(RegistryEvent.ENDER_PEARL_BAG.get(), 9)
                .requires(RegistryEvent.HUGE_ENDER_PEARL_BAG.get())
                .unlockedBy("has_item", has(RegistryEvent.HUGE_ENDER_PEARL_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_AXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("** ")
                .pattern("*# ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_STICK.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_HOE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("** ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_STICK.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_PICKAXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern("***")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_STICK.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_SHOVEL.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern(" * ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.ENDER_PEARL_BAG.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_SWORD.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .pattern(" * ")
                .pattern(" * ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_STICK.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_IRON_AXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .pattern("** ")
                .pattern("*# ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_IRON.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_IRON_HOE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .pattern("** ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_IRON.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_IRON_PICKAXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .pattern("***")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_IRON.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_IRON_SHOVEL.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .pattern(" * ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_IRON.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_IRON_SWORD.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .pattern(" * ")
                .pattern(" * ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_IRON.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_GOLDEN_AXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .pattern("** ")
                .pattern("*# ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_GOLD.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_GOLDEN_HOE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .pattern("** ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_GOLD.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_GOLDEN_PICKAXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .pattern("***")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_GOLD.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_GOLDEN_SHOVEL.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .pattern(" * ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_GOLD.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_GOLDEN_SWORD.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .pattern(" * ")
                .pattern(" * ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_GOLD.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_DIAMOND_AXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .pattern("** ")
                .pattern("*# ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_DIAMOND_HOE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .pattern("** ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_DIAMOND_PICKAXE.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .pattern("***")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_DIAMOND_SHOVEL.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .pattern(" * ")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shaped(RegistryEvent.HARDENED_DIAMOND_SWORD.get()) // result
                .define('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .define('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .pattern(" * ")
                .pattern(" * ")
                .pattern(" # ")
                .unlockedBy("has_item", has(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));
    }
}