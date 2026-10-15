package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.triggers.InventoryChangeTrigger;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings({"NullableProblems", "SameParameterValue", "BooleanMethodIsAlwaysInverted"})
public class CBRecipeProvider extends FabricRecipeProvider {

    private static HolderGetter<Item> items;

    public CBRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
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

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        items = registries.lookupOrThrow(Registries.ITEM);
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                Block previousBlock = null;

                for (Block currentBlock : CompressedBlocks.COMPRESSED_BLOCKS) {
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

                    makeShapedBlockRecipe(this.output, RecipeCategory.BUILDING_BLOCKS, currentBlock, previousBlock, blockName);
                    makeShapelessBlockRecipe(this.output, RecipeCategory.BUILDING_BLOCKS, previousBlock, currentBlock, blockName);

                    previousBlock = currentBlock;
                }

                Item previousCrate = null;

                for (Item currentCrate : CompressedBlocks.CRATE_ITEMS) {
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

                    makeShapedCrateRecipe(this.output, RecipeCategory.MISC, currentCrate, previousCrate, crate_itemName);
                    makeShapelessCrateRecipe(this.output, RecipeCategory.MISC, previousCrate, currentCrate, crate_itemName);

                    previousCrate = currentCrate;
                }

                ItemLike previousCrateBlock = null;

                for (Block currentBlock : CompressedBlocks.CRATE_BLOCKS) {
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

                    makeShapedCrateRecipe(this.output, RecipeCategory.MISC, currentBlock, previousCrateBlock, crate_blockName);
                    makeShapelessCrateRecipe(this.output, RecipeCategory.MISC, previousCrateBlock, currentBlock, crate_blockName);

                    previousCrateBlock = currentBlock;
                }
            }
        };
    }

    private boolean isAvailable(String id) {
        CompressionEntry entry = CompressionCatalog.getEntryById(ResourceUtils.removeCompressionName(id));
        if (entry == null) return false;
        return VersionUtils.isCompatibleWithCurrentVersion(entry);
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
        if (hasSmallerCompression(result, ingredient)) {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName)));
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
        if (hasSmallerCompression(result, ingredient)) {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("##")
                    .pattern("##")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shaped_lesser_" + fileName)));

        } else {
            ShapedRecipeBuilder.shaped(items, recipeCategory, result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shaped_" + fileName)));
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
        if (hasSmallerCompression(result, ingredient)) {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName)));
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
        if (hasSmallerCompression(result, ingredient)) {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 4)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shapeless_lesser_" + recipeName)));

        } else {
            ShapelessRecipeBuilder.shapeless(items, recipeCategory, result, 9)
                    .requires(ingredient)
                    .unlockedBy("has_item", InventoryChangeTrigger.TriggerInstance.hasItems(ingredient))
                    .save(exporter, String.valueOf(Identifier.fromNamespaceAndPath("compressedblocks", "shapeless_" + recipeName)));
        }
    }

    @Override
    public String getName() {
        return "CBRecipeProvider";
    }
}
