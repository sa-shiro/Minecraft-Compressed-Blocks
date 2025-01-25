package net.sashiro.compressedblocks.forge.data.providers;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.packs.VanillaRecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CBBlock;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;

@SuppressWarnings("DuplicatedCode")
public class CBRecipeProvider extends VanillaRecipeProvider {
    private final HolderGetter<Item> items;
    protected final RecipeOutput output;

    public CBRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
        this.items = registries.lookupOrThrow(Registries.ITEM);
        this.output = recipeOutput;
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

        if (compressedBlock != null && compressedBlock.getCompressor().hasSmallerCompression()) {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName)));
        }
    }

    private void makeShapelessRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        CBBlock compressedBlock = getCbBlock(result, ingredient);

        if (compressedBlock != null && compressedBlock.getCompressor().hasSmallerCompression()) {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", has(ingredient.asItem()))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName)));
        }
    }

    @Override
    @ParametersAreNonnullByDefault
    protected void buildRecipes() {

        ArrayList<Block> blocks = Constants.BLOCKS;

        for (int i = 0; i < blocks.size(); i++) {
            String blockName = blocks.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            // Check if this is the first compressed block
            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        makeShapedRecipe(output, RecipeCategory.BUILDING_BLOCKS, blocks.get(i), mcBlock, blockName);
                        makeShapelessRecipe(output, RecipeCategory.BUILDING_BLOCKS, mcBlock, blocks.get(i), blockName);
                    }
                }
            } else {
                makeShapedRecipe(output, RecipeCategory.BUILDING_BLOCKS, blocks.get(i), blocks.get(i - 1), blockName);
                makeShapelessRecipe(output, RecipeCategory.BUILDING_BLOCKS, blocks.get(i - 1), blocks.get(i), blockName);
            }
        }

        ArrayList<Block> crate_items = Constants.CRATES;

        for (int i = 0; i < crate_items.size(); i++) {
            String crate_itemName = crate_items.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            // Check if this is the first crate
            if (crate_itemName.startsWith("crated")) {
                String crate_itemName_clean = crate_itemName.replace("crated_", "");
                for (Item vanillaItem : ForgeRegistries.ITEMS) {
                    String vanillaItemName = vanillaItem.getDescriptionId().replace("item.minecraft.", "").replace("block.minecraft.", "");
                    if (crate_itemName_clean.equals(vanillaItemName)) {
                        makeShapedRecipe(output, RecipeCategory.MISC, crate_items.get(i), vanillaItem, crate_itemName);
                        makeShapelessRecipe(output, RecipeCategory.MISC, vanillaItem, crate_items.get(i), crate_itemName);
                    }
                }
            } else {
                makeShapedRecipe(output, RecipeCategory.MISC, crate_items.get(i), crate_items.get(i - 1), crate_itemName);
                makeShapelessRecipe(output, RecipeCategory.MISC, crate_items.get(i - 1), crate_items.get(i), crate_itemName);
            }
        }
    }
}