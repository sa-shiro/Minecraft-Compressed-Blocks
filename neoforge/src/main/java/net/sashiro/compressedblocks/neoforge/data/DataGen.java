package net.sashiro.compressedblocks.neoforge.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.sashiro.compressedblocks.neoforge.data.providers.CBBlockStateProvider;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SuppressWarnings("unused")
//@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGen {
    //@SubscribeEvent
    public static void gatherData(GatherDataEvent e) throws ExecutionException, InterruptedException {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        RecipeOutput recipeOutput = (RecipeOutput) gen.getPackOutput();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();
        HolderLookup.Provider registries = lookupProvider.get();

        gen.addProvider(true, new CBBlockStateProvider(packOutput, existingFileHelper));
        //gen.addProvider(true, new CBItemModelProvider(packOutput, existingFileHelper));
        //gen.addProvider(true, new CBLanguageProvider(packOutput, "en_us"));
        //gen.addProvider(true, new CBRecipeProvider(registries, recipeOutput));
        //gen.addProvider(true, CBLootTableProvider.create(packOutput, lookupProvider));
        //TagsProvider<Block> tagsProvider = gen.addProvider(true, new CBBlockTagsProvider(packOutput, lookupProvider, MOD_ID, existingFileHelper));
        //gen.addProvider(true, new CBItemTagsProvider(packOutput, lookupProvider, tagsProvider.contentsGetter(), MOD_ID, existingFileHelper));
    }
}
