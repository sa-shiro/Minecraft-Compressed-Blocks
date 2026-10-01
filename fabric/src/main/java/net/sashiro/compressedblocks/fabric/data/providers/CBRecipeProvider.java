package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.compression.Compression;
import net.sashiro.compressedblocks.item.CrateItem;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings({"NullableProblems", "SameParameterValue"})
public class CBRecipeProvider extends FabricRecipeProvider {

    private static HolderGetter<Item> items;

    public CBRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static Compression getCompression(ItemLike result, ItemLike ingredient) {
        if (ingredient instanceof CrateItem crateItem) {
            return crateItem.getCompressor();
        }
        if (ingredient instanceof CompressedBlock compressedBlock) {
            return compressedBlock.getCompressor();
        }
        if (result instanceof CrateItem crateItem) {
            return crateItem.getCompressor();
        }
        if (result instanceof CompressedBlock compressedBlock) {
            return compressedBlock.getCompressor();
        }
        return null;
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        items = registryLookup.lookupOrThrow(Registries.ITEM);

        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {

                Block previousBlock = null;

                for (Block currentBlock : Constants.BLOCKS) {
                    String blockName = currentBlock.getDescriptionId().replace("block.compressedblocks.", "");

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
                    String crate_itemName = currentCrate.getDescriptionId().replace("item.compressedblocks.", "");

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

                Block previousCrateBlock = null;

                for (Block currentBlock : Constants.CRATE_BLOCKS) {
                    String crate_blockName = currentBlock.getDescriptionId()
                            .replace("block.compressedblocks.", "");

                    if (crate_blockName.startsWith("crated_")) {
                        String vanillaBlockName = crate_blockName.substring(7);

                        for (Block vanillaBlock : BuiltInRegistries.BLOCK) {
                            String registryName = vanillaBlock.getDescriptionId().replace("block.minecraft.", "");

                            if (vanillaBlockName.equals(registryName)) {
                                previousCrateBlock = vanillaBlock;
                                break;
                            }
                        }
                    }

                    makeShapedCrateRecipe(exporter, RecipeCategory.MISC, currentBlock, previousCrateBlock, crate_blockName);
                    makeShapelessCrateRecipe(exporter, RecipeCategory.MISC, previousCrateBlock, currentBlock, crate_blockName);

                    previousCrateBlock = currentBlock;
                }
            }
        };
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
    private void makeShapedBlockRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String fileName) {
        if (getCompression(result, ingredient).isSmallerCompression()) {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName)));
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
    private void makeShapedCrateRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String fileName) {
        if (getCompression(result, ingredient).isSmallerCompression()) {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName)));
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
    private void makeShapelessBlockRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        if (getCompression(result, ingredient).isSmallerCompression()) {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName)));
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
    private void makeShapelessCrateRecipe(RecipeOutput exporter, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, String recipeName) {
        if (getCompression(result, ingredient).isSmallerCompression()) {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(ResourceLocation.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName)));
        }
    }

    @Override
    public String getName() {
        return "CBRecipeProvider";
    }
}
