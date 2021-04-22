package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        assert false;
        for (int i = 0; i < RegistryEvent.BLOCK_REGISTRY.size(); i++) {
            if (RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().contains("c0_")) {
                String str = RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().replace("compressedblocks:c0_", "");
                for (Block block : ForgeRegistries.BLOCKS) {
                    String str2 = block.getRegistryName().toString().replace("minecraft:", "");
                    if (str.equals(str2)) {
                        ShapedRecipeBuilder.shapedRecipe(
                                RegistryEvent.BLOCK_REGISTRY.get(i).get()) // result
                                .key('#', block) // ingredient
                                .patternLine("###")
                                .patternLine("###")
                                .patternLine("###")
                                .addCriterion("has_item", hasItem(block.asItem()))
                                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().replace("compressedblocks:", "")));
                        ShapelessRecipeBuilder.shapelessRecipe(block, 9)
                                .addIngredient(RegistryEvent.BLOCK_REGISTRY.get(i).get())
                                .addCriterion("has_item", hasItem(RegistryEvent.BLOCK_REGISTRY.get(i).get().asItem()))
                                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().replace("compressedblocks:", "")));
                    }
                }
            } else {
                ShapedRecipeBuilder.shapedRecipe(RegistryEvent.BLOCK_REGISTRY.get(i).get()) // result
                        .key('#', RegistryEvent.BLOCK_REGISTRY.get(i - 1).get()) // ingredient
                        .patternLine("###")
                        .patternLine("###")
                        .patternLine("###")
                        .addCriterion("has_item", hasItem(RegistryEvent.BLOCK_REGISTRY.get(i - 1).get().asItem()))
                        .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().replace("compressedblocks:", "")));
                ShapelessRecipeBuilder.shapelessRecipe(RegistryEvent.BLOCK_REGISTRY.get(i - 1).get(), 9)
                        .addIngredient(RegistryEvent.BLOCK_REGISTRY.get(i).get())
                        .addCriterion("has_item", hasItem(RegistryEvent.BLOCK_REGISTRY.get(i).get().asItem()))
                        .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.BLOCK_REGISTRY.get(i).get().getRegistryName().toString().replace("compressedblocks:", "")));
            }
        }

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.COMPRESSED_DIAMOND.get()) // result
                .key('*', Items.DIAMOND) // ingredient
                .key('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("###")
                .patternLine("#*#")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.DIAMOND))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_DIAMOND.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.COMPRESSED_GOLD.get()) // result
                .key('*', Items.GOLD_INGOT) // ingredient
                .key('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("###")
                .patternLine("#*#")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.GOLD_INGOT))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_GOLD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.COMPRESSED_IRON.get()) // result
                .key('*', Items.IRON_INGOT) // ingredient
                .key('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("###")
                .patternLine("#*#")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.IRON_INGOT))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_IRON.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.COMPRESSED_STICK.get()) // result
                .key('*', Items.STICK) // ingredient
                .key('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("###")
                .patternLine("#*#")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.STICK))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_STICK.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.COMPRESSED_WOOD.get()) // result
                .key('*', ItemTags.PLANKS) // ingredient
                .key('#', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("###")
                .patternLine("#*#")
                .patternLine("###")
                .addCriterion("has_item", hasItem(ItemTags.PLANKS))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.COMPRESSED_WOOD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.EGG_BAG.get()) // result
                .key('#', Items.EGG) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.EGG))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(Items.EGG, 9)
                .addIngredient(RegistryEvent.EGG_BAG.get())
                .addCriterion("has_item", hasItem(RegistryEvent.EGG_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HUGE_EGG_BAG.get()) // result
                .key('#', RegistryEvent.EGG_BAG.get()) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(RegistryEvent.EGG_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(RegistryEvent.EGG_BAG.get(), 9)
                .addIngredient(RegistryEvent.HUGE_EGG_BAG.get())
                .addCriterion("has_item", hasItem(RegistryEvent.HUGE_EGG_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.ENDER_EYE_BAG.get()) // result
                .key('#', Items.ENDER_EYE) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.ENDER_EYE))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(Items.ENDER_EYE, 9)
                .addIngredient(RegistryEvent.ENDER_EYE_BAG.get())
                .addCriterion("has_item", hasItem(Items.ENDER_EYE))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HUGE_ENDER_EYE_BAG.get()) // result
                .key('#', RegistryEvent.ENDER_EYE_BAG.get()) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(RegistryEvent.ENDER_EYE_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(RegistryEvent.ENDER_EYE_BAG.get(), 9)
                .addIngredient(RegistryEvent.HUGE_ENDER_EYE_BAG.get())
                .addCriterion("has_item", hasItem(RegistryEvent.HUGE_ENDER_EYE_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.ENDER_PEARL_BAG.get()) // result
                .key('#', Items.ENDER_PEARL) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(Items.ENDER_PEARL))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(Items.ENDER_PEARL, 9)
                .addIngredient(RegistryEvent.ENDER_PEARL_BAG.get())
                .addCriterion("has_item", hasItem(RegistryEvent.ENDER_PEARL_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HUGE_ENDER_PEARL_BAG.get()) // result
                .key('#', RegistryEvent.ENDER_PEARL_BAG.get()) // ingredient
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(RegistryEvent.ENDER_PEARL_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapelessRecipeBuilder.shapelessRecipe(RegistryEvent.ENDER_PEARL_BAG.get(), 9)
                .addIngredient(RegistryEvent.HUGE_ENDER_PEARL_BAG.get())
                .addCriterion("has_item", hasItem(RegistryEvent.HUGE_ENDER_PEARL_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shapeless_" + RegistryEvent.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_AXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("** ")
                .patternLine("*# ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_STICK.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_HOE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("** ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_STICK.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_PICKAXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine("***")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_STICK.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_SHOVEL.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine(" * ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.ENDER_PEARL_BAG.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_SWORD.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.BLOCK_REGISTRY.get(1).get()) // ingredient
                .patternLine(" * ")
                .patternLine(" * ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_STICK.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_IRON_AXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .patternLine("** ")
                .patternLine("*# ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_IRON.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_IRON_HOE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .patternLine("** ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_IRON.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_IRON_PICKAXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .patternLine("***")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_IRON.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_IRON_SHOVEL.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_IRON.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_IRON_SWORD.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_IRON.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" * ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_IRON.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_IRON_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_GOLDEN_AXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .patternLine("** ")
                .patternLine("*# ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_GOLD.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_GOLDEN_HOE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .patternLine("** ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_GOLD.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_GOLDEN_PICKAXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .patternLine("***")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_GOLD.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_GOLDEN_SHOVEL.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_GOLD.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_GOLDEN_SWORD.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_GOLD.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" * ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_GOLD.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_GOLDEN_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));

        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_DIAMOND_AXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .patternLine("** ")
                .patternLine("*# ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_AXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_DIAMOND_HOE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .patternLine("** ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_HOE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_DIAMOND_PICKAXE.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .patternLine("***")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_DIAMOND_SHOVEL.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" # ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", "")));
        ShapedRecipeBuilder.shapedRecipe(RegistryEvent.HARDENED_DIAMOND_SWORD.get()) // result
                .key('#', RegistryEvent.COMPRESSED_STICK.get()) // ingredient
                .key('*', RegistryEvent.COMPRESSED_DIAMOND.get()) // ingredient
                .patternLine(" * ")
                .patternLine(" * ")
                .patternLine(" # ")
                .addCriterion("has_item", hasItem(RegistryEvent.COMPRESSED_DIAMOND.get()))
                .build(consumer, new ResourceLocation("compressedblocks", "shaped_" + RegistryEvent.HARDENED_DIAMOND_SWORD.get().getRegistryName().toString().replace("compressedblocks:", "")));
    }
}