package net.sashiro.compressedblocks.data.generators;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.event.ModRegistryEvent;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.function.Consumer;

import static net.sashiro.compressedblocks.world.level.item.CustomItems.*;

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
            String blockName = blocks.get(i).get().getDescriptionId();
            if (blockName.contains("c0_")) {
                String cbBlockName = blockName.replace("block.compressedblocks.c0_", "");
                for (Block mcBlock : ForgeRegistries.BLOCKS) {
                    String mcBlockName = mcBlock.getDescriptionId().replace("block.minecraft.", "");
                    if (cbBlockName.equals(mcBlockName)) {
                        ShapedRecipeBuilder.shaped(
                                        blocks.get(i).get()) // result
                                .define('#', mcBlock) // ingredient
                                .pattern("###")
                                .pattern("###")
                                .pattern("###")
                                .unlockedBy("has_item", has(mcBlock.asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                        ShapelessRecipeBuilder.shapeless(mcBlock, 9)
                                .requires(blocks.get(i).get())
                                .unlockedBy("has_item", has(blocks.get(i).get().asItem()))
                                .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName));
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
                            .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + blockName));
                    ShapelessRecipeBuilder.shapeless(blocks.get(i - 1).get(), 9)
                            .requires(blocks.get(i).get())
                            .unlockedBy("has_item", has(blocks.get(i).get().asItem()))
                            .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + blockName));
                }
            }
        }

        // Crate Items

        makeRecipe(consumer, APPLES);
        makeRecipe(consumer, MUSHROOM_STEW);
        makeRecipe(consumer, BREAD);
        makeRecipe(consumer, PORKCHOP);
        makeRecipe(consumer, COOKED_PORKCHOP);
        makeRecipe(consumer, COD);
        makeRecipe(consumer, SALMON);
        makeRecipe(consumer, TROPICAL_FISH);
        makeRecipe(consumer, PUFFERFISH);
        makeRecipe(consumer, COOKED_COD);
        makeRecipe(consumer, COOKED_SALMON);
        makeRecipe(consumer, CAKES);
        makeRecipe(consumer, COOKIES);
        makeRecipe(consumer, MELON_SLICES);
        makeRecipe(consumer, MELON_SEEDS);
        makeRecipe(consumer, DRIED_KELP);
        makeRecipe(consumer, BEEF);
        makeRecipe(consumer, COOKED_BEEF);
        makeRecipe(consumer, CHICKEN);
        makeRecipe(consumer, COOKED_CHICKEN);
        makeRecipe(consumer, ROTTEN_FLESH);
        makeRecipe(consumer, CARROTS);
        makeRecipe(consumer, POTATOES);
        makeRecipe(consumer, BAKED_POTATOES);
        makeRecipe(consumer, POISONOUS_POTATOES);
        makeRecipe(consumer, PUMPKIN_PIES);
        makeRecipe(consumer, RABBIT);
        makeRecipe(consumer, COOKED_RABBIT);
        makeRecipe(consumer, RABBIT_STEW);
        makeRecipe(consumer, MUTTON);
        makeRecipe(consumer, COOKED_MUTTON);
        makeRecipe(consumer, BEETROOT);
        makeRecipe(consumer, BEETROOT_SEEDS);
        makeRecipe(consumer, BEETROOT_SOUP);
        makeRecipe(consumer, SWEET_BERRIES);
        makeRecipe(consumer, GLOW_BERRIES);
        makeRecipe(consumer, EGGS);
        makeRecipe(consumer, SUGAR_CANES);
        makeRecipe(consumer, SUGAR);
        makeRecipe(consumer, PUMPKINS);
        makeRecipe(consumer, PUMPKIN_SEEDS);
        makeRecipe(consumer, WHEAT);
        makeRecipe(consumer, WHEAT_SEEDS);
        makeRecipe(consumer, COCOA_BEANS);
        // MOB LOOT
        makeRecipe(consumer, ARROWS);
        makeRecipe(consumer, SPIDER_EYES);
        makeRecipe(consumer, FERMENTED_SPIDER_EYES);
        makeRecipe(consumer, BLAZE_RODS);
        makeRecipe(consumer, BLAZE_POWDER);
        makeRecipe(consumer, MAGMA_CREAM);
        makeRecipe(consumer, BONES);
        makeRecipe(consumer, BONE_MEAL);
        makeRecipe(consumer, ENDER_EYES);
        makeRecipe(consumer, ENDER_PEARLS);
        makeRecipe(consumer, FEATHERS);
        makeRecipe(consumer, LEATHER);
        makeRecipe(consumer, STRINGS);
        makeRecipe(consumer, INK_SACS);
        makeRecipe(consumer, GLOW_INK_SACS);
        // MISC
        makeRecipe(consumer, STICKS);
        makeRecipe(consumer, GLASS_BOTTLES);
        makeRecipe(consumer, SNOWBALLS);
        makeRecipe(consumer, PAPER);
        makeRecipe(consumer, FLINTS);
        // SAPLINGS / NATURE
        makeRecipe(consumer, OAK_SAPLINGS);
        makeRecipe(consumer, SPRUCE_SAPLINGS);
        makeRecipe(consumer, BIRCH_SAPLINGS);
        makeRecipe(consumer, JUNGLE_SAPLINGS);
        makeRecipe(consumer, ACACIA_SAPLINGS);
        makeRecipe(consumer, DARK_OAK_SAPLINGS);
        makeRecipe(consumer, CHORUS_FRUITS);
        makeRecipe(consumer, SEAGRASS);
        makeRecipe(consumer, KELP);
        makeRecipe(consumer, BAMBOO);
        makeRecipe(consumer, BROWN_MUSHROOMS);
        makeRecipe(consumer, RED_MUSHROOMS);
        makeRecipe(consumer, CRIMSON_FUNGUS);
        makeRecipe(consumer, WARPED_FUNGUS);
        makeRecipe(consumer, WITHER_ROSES);

        makeRecipe(consumer, NETHER_WARTS);
    }

    private void makeRecipe(Consumer<FinishedRecipe> consumer, ArrayList<RegistryObject<Item>> baseItem) {
        assert false;
        for (int i = 0; i < baseItem.size() - 1; i++) {
            Item ingredient = baseItem.get(i).get();
            Item result = baseItem.get(i + 1).get();

            ShapedRecipeBuilder.shaped(result) // result
                    .define('#', ingredient) // ingredient
                    .pattern("###")
                    .pattern("###")
                    .pattern("###")
                    .unlockedBy("has_item", has(ingredient)) // ingredient
                    .save(consumer, new ResourceLocation("compressedblocks", "shaped_" + result.getDescriptionId()));

            ShapelessRecipeBuilder.shapeless(ingredient, 9) // result, count
                    .requires(result) // ingredient
                    .unlockedBy("has_item", has(result))
                    .save(consumer, new ResourceLocation("compressedblocks", "shapeless_" + result.getDescriptionId()));
        }
    }
}