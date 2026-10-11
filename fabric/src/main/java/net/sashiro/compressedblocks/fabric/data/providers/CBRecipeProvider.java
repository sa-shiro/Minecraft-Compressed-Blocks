package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;

import java.util.function.Consumer;

@SuppressWarnings({"NullableProblems", "SameParameterValue", "BooleanMethodIsAlwaysInverted"})
public class CBRecipeProvider extends FabricRecipeProvider {

    public CBRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    private static boolean hasSmallerCompression(ItemLike result, ItemLike ingredient) {
        CompressionEntry resultEntry = CompressionCatalog.getEntryById(ResourceUtils.removeNamespace(result.asItem().getDescriptionId()));
        CompressionEntry ingredientEntry = CompressionCatalog.getEntryById(ResourceUtils.removeNamespace(ingredient.asItem().getDescriptionId()));

        if (resultEntry != null) {
            return resultEntry.hasSmallerCompression();
        } else if (ingredientEntry != null) {
            return ingredientEntry.hasSmallerCompression();
        }
        return false;
    }

    private boolean isAvailable(String id) {
        CompressionEntry entry = CompressionCatalog.getEntryById(ResourceUtils.removeCompressionName(id));
        if (entry == null) return false;
        return VersionUtils.isCompatibleWithCurrentVersion(entry);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        Block previousBlock = null;

        for (Block currentBlock : Constants.BLOCKS) {
            String blockName = ResourceUtils.removeNamespace(currentBlock.getDescriptionId());

            if (!isAvailable(ResourceUtils.removeCompressionName(blockName))) continue;

            if (blockName.startsWith("c0_")) {
                String mcBlockName = blockName.substring(3);

                for (Block mcBlock : BuiltInRegistries.BLOCK) {
                    String registryName = mcBlock.getDescriptionId().replace("block.minecraft.", "");

                    if (mcBlockName.equals(registryName)) {
                        previousBlock = mcBlock;
                        break;
                    }
                }
            }

            makeShapedBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, currentBlock, previousBlock, blockName);
            makeShapelessBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, previousBlock, currentBlock, blockName);

            previousBlock = currentBlock;
        }

        Item previousCrate = null;

        for (Item currentCrate : Constants.CRATE_ITEMS) {
            String crate_itemName = ResourceUtils.removeNamespace(currentCrate.getDescriptionId());

            if (!isAvailable(ResourceUtils.removeCrateName(crate_itemName))) continue;

            if (crate_itemName.startsWith("crated_")) {
                String vanillaItemName = crate_itemName.substring(7);

                for (Item vanillaItem : BuiltInRegistries.ITEM) {
                    String registryName = vanillaItem.getDescriptionId()
                            .replace("item.minecraft.", "")
                            .replace("block.minecraft.", "");

                    if (vanillaItemName.equals(registryName)) {
                        previousCrate = vanillaItem;
                        break;
                    }
                }
            }

            makeShapedCrateRecipe(exporter, RecipeCategory.MISC, currentCrate, previousCrate, crate_itemName);
            makeShapelessCrateRecipe(exporter, RecipeCategory.MISC, previousCrate, currentCrate, crate_itemName);

            previousCrate = currentCrate;
        }

        ItemLike previousCrateBlock = null;

        for (Block currentBlock : Constants.CRATE_BLOCKS) {
            String crate_blockName = ResourceUtils.removeNamespace(currentBlock.getDescriptionId());

            if (!isAvailable(ResourceUtils.removeCrateName(crate_blockName))) continue;

            if (crate_blockName.startsWith("crated_")) {
                String vanillaBlockName = crate_blockName.substring(7);

                for (Block vanillaBlock : BuiltInRegistries.BLOCK) {
                    String registryName = vanillaBlock.getDescriptionId().replace("block.minecraft.", "");

                    if (vanillaBlockName.equals(registryName)) {
                        previousCrateBlock = vanillaBlock;
                        break;
                    }
                }
                for (Item vanillaItem : BuiltInRegistries.ITEM) {
                    String registryName = vanillaItem.getDescriptionId().replace("item.minecraft.", "");

                    if (vanillaBlockName.equals(registryName)) {
                        previousCrateBlock = vanillaItem;
                        break;
                    }
                }
            }

            makeShapedCrateRecipe(exporter, RecipeCategory.MISC, currentBlock, previousCrateBlock, crate_blockName);
            makeShapelessCrateRecipe(exporter, RecipeCategory.MISC, previousCrateBlock, currentBlock, crate_blockName);

            previousCrateBlock = currentBlock;
        }
    }

    /**
     * Creates a shaped recipe for a compressed block.
     *
     * @param exporter       The recipe output to save the recipe to.
     * @param recipeCategory The category of the recipe.
     * @param result         The resulting compressed block item.
     * @param ingredient     The ingredient item used in the recipe.
     * @param fileName       The file name for the saved recipe.
     */
    private void makeShapedBlockRecipe(Consumer<FinishedRecipe> exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String fileName) {
        if (hasSmallerCompression(result, ingredient)) {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shaped_" + fileName)));
        }
    }

    /**
     * Creates a shaped recipe for a crate item.
     *
     * @param exporter       The recipe output to save the recipe to.
     * @param recipeCategory The category of the recipe.
     * @param result         The resulting crate item.
     * @param ingredient     The ingredient item used in the recipe.
     * @param fileName       The file name for the saved recipe.
     */
    private void makeShapedCrateRecipe(Consumer<FinishedRecipe> exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String fileName) {
        if (hasSmallerCompression(result, ingredient)) {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shaped_" + fileName)));
        }
    }

    /**
     * Creates a shapeless recipe for a compressed block.
     *
     * @param exporter       The recipe output to save the recipe to.
     * @param recipeCategory The category of the recipe.
     * @param result         The resulting compressed block item.
     * @param ingredient     The ingredient item used in the recipe.
     * @param recipeName     The name for the saved recipe.
     */
    private void makeShapelessBlockRecipe(Consumer<FinishedRecipe> exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        if (hasSmallerCompression(result, ingredient)) {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shapeless_" + recipeName)));
        }
    }

    /**
     * Creates a shapeless recipe for a crate item.
     *
     * @param exporter       The recipe output to save the recipe to.
     * @param recipeCategory The category of the recipe.
     * @param result         The resulting crate item.
     * @param ingredient     The ingredient item used in the recipe.
     * @param recipeName     The name for the saved recipe.
     */
    private void makeShapelessCrateRecipe(Consumer<FinishedRecipe> exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        if (hasSmallerCompression(result, ingredient)) {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(new ResourceLocation("compressedblocks", "shapeless_" + recipeName)));
        }
    }

    @Override
    public String getName() {
        return "CBRecipeProvider";
    }
}
