package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.Constants;

import java.util.ArrayList;
import java.util.function.Consumer;

@SuppressWarnings("DuplicatedCode")
public class CBRecipeProvider extends FabricRecipeProvider {

    public CBRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateRecipes(Consumer<FinishedRecipe> exporter) {
        ArrayList<Block> blocks = (ArrayList<Block>) Constants.BLOCKS;

        for (int i = 0; i < blocks.size(); i++) {
            String blockName = blocks.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("c0_", "");
                for (Block mcBlock : Registry.BLOCK) {
                    String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        ShapedRecipeBuilder.shaped(blocks.get(i)) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(exporter, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                        ShapelessRecipeBuilder.shapeless(mcBlock, 9)
                                .requires(blocks.get(i))
                                .unlockedBy("has_item", has(blocks.get(i).asItem()))
                                .save(exporter, new ResourceLocation("compressedblocks", "shapeless_" + blockName));
                    }
                }
            } else {
                ShapedRecipeBuilder.shaped(blocks.get(i)) // result
                        .define('#', blocks.get(i - 1)) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(blocks.get(i - 1).asItem()))
                        .save(exporter, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                ShapelessRecipeBuilder.shapeless(blocks.get(i - 1), 9)
                        .requires(blocks.get(i))
                        .unlockedBy("has_item", has(blocks.get(i).asItem()))
                        .save(exporter, new ResourceLocation("compressedblocks", "shapeless_" + blockName));
            }
        }

        ArrayList<Block> crate_items = (ArrayList<Block>) Constants.CRATES;

        for (int i = 0; i < crate_items.size(); i++) {
            String crate_itemName = crate_items.get(i).getDescriptionId().replace("block.compressedblocks.", "");

            if (crate_itemName.startsWith("crated")) {
                String crate_itemName_clean = crate_itemName.replace("crated_", "");
                for (Item vanillaItem : Registry.ITEM) {
                    String vanillaItemName = vanillaItem.getDescriptionId().replace("item.minecraft.", "").replace("block.minecraft.", "");
                    if (crate_itemName_clean.equals(vanillaItemName)) {
                        ShapedRecipeBuilder.shaped(crate_items.get(i)) // result
                                .define('#', vanillaItem) // ingredient 1
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(vanillaItem.asItem()))
                                .save(exporter, new ResourceLocation("compressedblocks", "shaped_" + crate_itemName));
                        ShapelessRecipeBuilder.shapeless(vanillaItem, 9)
                                .requires(crate_items.get(i))
                                .unlockedBy("has_item", has(crate_items.get(i).asItem()))
                                .save(exporter, new ResourceLocation("compressedblocks", "shapeless_" + crate_itemName));
                    }
                }
            } else {
                ShapedRecipeBuilder.shaped(crate_items.get(i)) // result
                        .define('#', crate_items.get(i - 1)) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(crate_items.get(i - 1).asItem()))
                        .save(exporter, new ResourceLocation("compressedblocks", "shaped_" + crate_itemName));
                ShapelessRecipeBuilder.shapeless(crate_items.get(i - 1), 9)
                        .requires(crate_items.get(i))
                        .unlockedBy("has_item", has(crate_items.get(i).asItem()))
                        .save(exporter, new ResourceLocation("compressedblocks", "shapeless_" + crate_itemName));

            }
        }
    }
}
