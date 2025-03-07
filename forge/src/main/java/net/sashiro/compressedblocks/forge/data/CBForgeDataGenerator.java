package net.sashiro.compressedblocks.forge.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.forge.data.providers.CBBlockStateProvider;
import net.sashiro.compressedblocks.forge.data.providers.CBItemModelProvider;

import java.util.concurrent.CompletableFuture;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBForgeDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

        // todo: fix data generation
        // current workflow: run Fabric Datagen (no models) -> Run Forge Datagen (models)
        gen.addProvider(true, new CBBlockStateProvider(packOutput, existingFileHelper));
        gen.addProvider(true, new CBItemModelProvider(packOutput, existingFileHelper));
        //gen.addProvider(true, new CBLanguageProvider(packOutput, "en_us"));
        //gen.addProvider(true, CBRecipeProvider::new);
        //gen.addProvider(true, CBLootTableProvider.create(packOutput, lookupProvider));
        //TagsProvider<Block> tagsProvider = gen.addProvider(true, new CBBlockTagsProvider(packOutput, lookupProvider, MOD_ID, existingFileHelper));
        //gen.addProvider(true, new CBItemTagsProvider(packOutput, lookupProvider, tagsProvider.contentsGetter(), MOD_ID, existingFileHelper));
    }
}
