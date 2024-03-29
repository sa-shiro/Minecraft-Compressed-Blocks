package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.sashiro.compressedblocks.Constants;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;

@SuppressWarnings("DuplicatedCode")
public class CBRecipeProvider extends RecipeProvider {
    public CBRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }


    @Override
    @ParametersAreNonnullByDefault
    protected void buildRecipes(RecipeOutput consumer) {

        ArrayList<Block> blocks = (ArrayList<Block>) Constants.BLOCKS;

        for (int i = 0; i < blocks.size(); i++) {
            String blockName = blocks.get(i).getDescriptionId().replace("block.compressedblocks.", "");
            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, blocks.get(i)) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, mcBlock, 9)
                                .requires(blocks.get(i))
                                .unlockedBy("has_item", has(blocks.get(i).asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName));
                    }
                }
            } else {
                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, blocks.get(i)) // result
                        .define('#', blocks.get(i - 1)) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(blocks.get(i - 1).asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, blocks.get(i - 1), 9)
                        .requires(blocks.get(i))
                        .unlockedBy("has_item", has(blocks.get(i).asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName));

            }
        }

        ArrayList<Block> crate_items = (ArrayList<Block>) Constants.CRATES;

        for (int i = 0; i < crate_items.size(); i++) {
            String crate_itemName = crate_items.get(i).getDescriptionId().replace("block.compressedblocks.", "");

            if (crate_itemName.startsWith("crated")) {
                String crate_itemName_clean = crate_itemName.replace("crated_", "");
                for (Item vanillaItem : ForgeRegistries.ITEMS) {
                    String vanillaItemName = vanillaItem.getDescriptionId().replace("item.minecraft.", "").replace("block.minecraft.", "");
                    if (crate_itemName_clean.equals(vanillaItemName)) {
                        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, crate_items.get(i)) // result
                                .define('#', vanillaItem) // ingredient 1
                                //.define('*', CBCrateItems.EMPTY_CRATE.get()) // ingredient 2
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(vanillaItem.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + crate_itemName));
                        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, vanillaItem, 9)
                                .requires(crate_items.get(i))
                                .unlockedBy("has_item", has(crate_items.get(i).asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + crate_itemName));
                    }
                }
            } else {
                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, crate_items.get(i)) // result
                        .define('#', crate_items.get(i - 1)) // ingredient
                        .pattern("###")
                        .pattern("###")
                        .pattern("###")
                        .unlockedBy("has_item", has(crate_items.get(i - 1).asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + crate_itemName));
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, crate_items.get(i - 1), 9)
                        .requires(crate_items.get(i))
                        .unlockedBy("has_item", has(crate_items.get(i).asItem()))
                        .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + crate_itemName));

            }
        }
    }
}