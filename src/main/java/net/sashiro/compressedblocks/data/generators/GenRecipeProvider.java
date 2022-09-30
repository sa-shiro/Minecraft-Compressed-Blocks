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
import net.sashiro.compressedblocks.world.level.item.CrateItems;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.function.Consumer;

import static net.sashiro.compressedblocks.world.level.item.CrateItems.*;

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
        makeRecipe(consumer, APPLE);
        makeRecipe(consumer, MUSHROOM_STEW);
        makeRecipe(consumer, BREAD);
        makeRecipe(consumer, RAW_PORKCHOP);
        makeRecipe(consumer, COOKED_PORKCHOP);
        makeRecipe(consumer, RAW_COD);
        makeRecipe(consumer, RAW_SALMON);
        makeRecipe(consumer, TROPICAL_FISH);
        makeRecipe(consumer, PUFFERFISH);
        makeRecipe(consumer, COOKED_COD);
        makeRecipe(consumer, COOKED_SALMON);
        makeRecipe(consumer, CAKE);
        makeRecipe(consumer, COOKIE);
        makeRecipe(consumer, MELON_SLICE);
        makeRecipe(consumer, MELON_SEEDS);
        makeRecipe(consumer, DRIED_KELP);
        makeRecipe(consumer, RAW_BEEF);
        makeRecipe(consumer, COOKED_BEEF);
        makeRecipe(consumer, RAW_CHICKEN);
        makeRecipe(consumer, COOKED_CHICKEN);
        makeRecipe(consumer, ROTTEN_FLESH);
        makeRecipe(consumer, CARROT);
        makeRecipe(consumer, POTATO);
        makeRecipe(consumer, BAKED_POTATO);
        makeRecipe(consumer, POISONOUS_POTATO);
        makeRecipe(consumer, PUMPKIN_PIE);
        makeRecipe(consumer, RAW_RABBIT);
        makeRecipe(consumer, COOKED_RABBIT);
        makeRecipe(consumer, RABBIT_STEW);
        makeRecipe(consumer, MUTTON);
        makeRecipe(consumer, COOKED_MUTTON);
        makeRecipe(consumer, BEETROOT);
        makeRecipe(consumer, BEETROOT_SEEDS);
        makeRecipe(consumer, BEETROOT_SOUP);
        makeRecipe(consumer, SWEET_BERRIES);
        makeRecipe(consumer, GLOW_BERRIES);
        makeRecipe(consumer, EGG);
        makeRecipe(consumer, SUGAR_CANE);
        makeRecipe(consumer, SUGAR);
        makeRecipe(consumer, PUMPKIN);
        makeRecipe(consumer, PUMPKIN_SEEDS);
        makeRecipe(consumer, WHEAT);
        makeRecipe(consumer, WHEAT_SEEDS);
        makeRecipe(consumer, COCOA_BEANS);
        // MOB LOOT
        makeRecipe(consumer, ARROW);
        makeRecipe(consumer, SPIDER_EYE);
        makeRecipe(consumer, FERMENTED_SPIDER_EYE);
        makeRecipe(consumer, BLAZE_ROD);
        makeRecipe(consumer, BLAZE_POWDER);
        makeRecipe(consumer, MAGMA_CREAM);
        makeRecipe(consumer, BONE);
        makeRecipe(consumer, BONE_MEAL);
        makeRecipe(consumer, ENDER_EYE);
        makeRecipe(consumer, ENDER_PEARL);
        makeRecipe(consumer, CrateItems.FEATHER);
        makeRecipe(consumer, LEATHER);
        makeRecipe(consumer, CrateItems.STRING);
        makeRecipe(consumer, INK_SACS);
        makeRecipe(consumer, GLOW_INK_SACS);
        // MISC
        makeRecipe(consumer, CrateItems.STICK);
        makeRecipe(consumer, GLASS_BOTTLE);
        makeRecipe(consumer, CrateItems.SNOWBALL);
        makeRecipe(consumer, PAPER);
        makeRecipe(consumer, FLINT);
        // SAPLINGS / NATURE
        makeRecipe(consumer, OAK_SAPLING);
        makeRecipe(consumer, SPRUCE_SAPLING);
        makeRecipe(consumer, BIRCH_SAPLING);
        makeRecipe(consumer, JUNGLE_SAPLING);
        makeRecipe(consumer, ACACIA_SAPLING);
        makeRecipe(consumer, DARK_OAK_SAPLING);
        makeRecipe(consumer, CHORUS_FRUIT);
        makeRecipe(consumer, SEAGRASS);
        makeRecipe(consumer, KELP);
        makeRecipe(consumer, BAMBOO);
        makeRecipe(consumer, BROWN_MUSHROOM);
        makeRecipe(consumer, RED_MUSHROOM);
        makeRecipe(consumer, CRIMSON_FUNGUS);
        makeRecipe(consumer, WARPED_FUNGUS);
        makeRecipe(consumer, WITHER_ROSE);

        makeRecipe(consumer, NETHER_WART);
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