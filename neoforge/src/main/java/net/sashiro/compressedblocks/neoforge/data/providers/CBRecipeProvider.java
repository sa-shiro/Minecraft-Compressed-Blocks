package net.sashiro.compressedblocks.neoforge.data.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CBBlock;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("DuplicatedCode")
public class CBRecipeProvider extends RecipeProvider {
    public CBRecipeProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(packOutput, completableFuture);
    }

    private static CBBlock getCbBlock(ItemLike result, ItemLike ingredient) {
        CBBlock block = null;
        if (ingredient instanceof CBBlock) {
            block = (CBBlock) ingredient;
        } else if (result instanceof CBBlock) {
            block = (CBBlock) result;
        }
        return block;
    }

    private void makeShapedRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String fileName) {
        CBBlock compressedBlock = getCbBlock(result, ingredient);

        if (compressedBlock != null && compressedBlock.getCompressor().isLesser()) {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName));

        } else {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName));
        }
    }

    private void makeShapelessRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        CBBlock compressedBlock = getCbBlock(result, ingredient);

        if (compressedBlock != null && compressedBlock.getCompressor().isLesser()) {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName));

        } else {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName));
        }
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildRecipes(RecipeOutput exporter) {

        ArrayList<Block> blocks = Constants.BLOCKS;

        for (int i = 0; i < blocks.size(); i++) {
            String blockName = blocks.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            // Check if this is the first compressed block
            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("c0_", "");
                for (Block mcBlock : BuiltInRegistries.BLOCK) {
                    String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        makeShapedRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, blocks.get(i), mcBlock, blockName);
                        makeShapelessRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, mcBlock, blocks.get(i), blockName);
                    }
                }
            } else {
                makeShapedRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, blocks.get(i), blocks.get(i - 1), blockName);
                makeShapelessRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, blocks.get(i - 1), blocks.get(i), blockName);
            }
        }

        ArrayList<Block> crate_items = Constants.CRATES;

        for (int i = 0; i < crate_items.size(); i++) {
            String crate_itemName = crate_items.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            // Check if this is the first crate
            if (crate_itemName.startsWith("crated")) {
                String crate_itemName_clean = crate_itemName.replace("crated_", "");
                for (Item vanillaItem : BuiltInRegistries.ITEM) {
                    String vanillaItemName = vanillaItem.getDescriptionId().replace("item.minecraft.", "").replace("block.minecraft.", "");
                    if (crate_itemName_clean.equals(vanillaItemName)) {
                        makeShapedRecipe(exporter, RecipeCategory.MISC, crate_items.get(i), vanillaItem, crate_itemName);
                        makeShapelessRecipe(exporter, RecipeCategory.MISC, vanillaItem, crate_items.get(i), crate_itemName);
                    }
                }
            } else {
                makeShapedRecipe(exporter, RecipeCategory.MISC, crate_items.get(i), crate_items.get(i - 1), crate_itemName);
                makeShapelessRecipe(exporter, RecipeCategory.MISC, crate_items.get(i - 1), crate_items.get(i), crate_itemName);
            }
        }
    }
}