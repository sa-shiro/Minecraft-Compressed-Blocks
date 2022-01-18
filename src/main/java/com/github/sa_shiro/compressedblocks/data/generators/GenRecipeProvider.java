package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.event.ModRegistryEvent;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.function.Consumer;

public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        assert false;
        ArrayList<RegistryObject<Block>> blocks = new ArrayList<>(ModRegistryEvent.BLOCKS.getEntries());

        for (int i = 0; i < blocks.size(); i++) {
            String blockName = blocks.get(i).get().getRegistryName().toString();

            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("compressedblocks:c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getRegistryName().toString().replace("minecraft:", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        ShapedRecipeBuilder.shaped(
                                        blocks.get(i).get()) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                        ShapelessRecipeBuilder.shapeless(mcBlock, 9)
                                .requires(blocks.get(i).get())
                                .unlockedBy("has_item", has(blocks.get(i).get().asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
                    }
                }
            } else {
                if (i > 0) {
                    ShapedRecipeBuilder.shaped(blocks.get(i).get()) // result
                            .define('#', blocks.get(i - 1).get()) // ingredient
                            .pattern("###")
                            .pattern("###")
                            .pattern("###")
                            .unlockedBy("has_item", has(blocks.get(i - 1).get().asItem()))
                            .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName.replace("compressedblocks:", "")));
                    ShapelessRecipeBuilder.shapeless(blocks.get(i - 1).get(), 9)
                            .requires(blocks.get(i).get())
                            .unlockedBy("has_item", has(blocks.get(i).get().asItem()))
                            .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName.replace("compressedblocks:", "")));
                }
            }
        }

        // Crate Items
        for (int i = 0; i < ModRegistryEvent.APPLES.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.APPLES.get(i).get();
            Item itemResult = ModRegistryEvent.APPLES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.ARROWS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.ARROWS.get(i).get();
            Item itemResult = ModRegistryEvent.ARROWS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.BEETROOT.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.BEETROOT.get(i).get();
            Item itemResult = ModRegistryEvent.BEETROOT.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.BEETROOT_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.BEETROOT_SEEDS.get(i).get();
            Item itemResult = ModRegistryEvent.BEETROOT_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.BLAZE_POWDER.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.BLAZE_POWDER.get(i).get();
            Item itemResult = ModRegistryEvent.BLAZE_POWDER.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.BLAZE_RODS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.BLAZE_RODS.get(i).get();
            Item itemResult = ModRegistryEvent.BLAZE_RODS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.BONES.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.BONES.get(i).get();
            Item itemResult = ModRegistryEvent.BONES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.CARROTS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.CARROTS.get(i).get();
            Item itemResult = ModRegistryEvent.CARROTS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.EGGS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.EGGS.get(i).get();
            Item itemResult = ModRegistryEvent.EGGS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.ENDER_EYES.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.ENDER_EYES.get(i).get();
            Item itemResult = ModRegistryEvent.ENDER_EYES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.ENDER_PEARLS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.ENDER_PEARLS.get(i).get();
            Item itemResult = ModRegistryEvent.ENDER_PEARLS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.FEATHERS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.FEATHERS.get(i).get();
            Item itemResult = ModRegistryEvent.FEATHERS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.LEATHER.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.LEATHER.get(i).get();
            Item itemResult = ModRegistryEvent.LEATHER.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.MELONS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.MELONS.get(i).get();
            Item itemResult = ModRegistryEvent.MELONS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.POTATOES.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.POTATOES.get(i).get();
            Item itemResult = ModRegistryEvent.POTATOES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.SUGAR_CANE.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.SUGAR_CANE.get(i).get();
            Item itemResult = ModRegistryEvent.SUGAR_CANE.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.MELON_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.MELON_SEEDS.get(i).get();
            Item itemResult = ModRegistryEvent.MELON_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.PUMPKIN.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.PUMPKIN.get(i).get();
            Item itemResult = ModRegistryEvent.PUMPKIN.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.PUMPKIN_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.PUMPKIN_SEEDS.get(i).get();
            Item itemResult = ModRegistryEvent.PUMPKIN_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.WHEAT_SEEDS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.WHEAT_SEEDS.get(i).get();
            Item itemResult = ModRegistryEvent.WHEAT_SEEDS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.SPIDER_EYES.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.SPIDER_EYES.get(i).get();
            Item itemResult = ModRegistryEvent.SPIDER_EYES.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.STRINGS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.STRINGS.get(i).get();
            Item itemResult = ModRegistryEvent.STRINGS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.STICKS.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.STICKS.get(i).get();
            Item itemResult = ModRegistryEvent.STICKS.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
        for (int i = 0; i < ModRegistryEvent.SUGAR.size() - 1; i++) {
            Item itemIngredient = ModRegistryEvent.SUGAR.get(i).get();
            Item itemResult = ModRegistryEvent.SUGAR.get(i + 1).get();

            ShapedRecipeBuilder.shaped(itemResult) // result
                    .define('#', itemIngredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(itemIngredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));

            ShapelessRecipeBuilder.shapeless(itemIngredient, 9) // result, count
                    .requires(itemResult) // ingredient
                    .unlockedBy("has_item", has(itemResult))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + itemResult.getRegistryName().toString().replace("compressedblocks:", "").replace("minecraft:", "")));
        }
    }
}