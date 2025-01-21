package net.sashiro.compressedblocks.neoforge.data;

//@SuppressWarnings("unused")
//@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class CBNeoForgeDataGenerator {
    //@SubscribeEvent
    //public static void gatherData(GatherDataEvent e) throws ExecutionException, InterruptedException {
    //DataGenerator gen = e.getGenerator();
    //PackOutput packOutput = gen.getPackOutput();
    //ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
    //CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

    // todo: fix data generation
    // current workflow: run Fabric Datagen (no models) -> Run Forge Datagen (models)
    //gen.addProvider(true, new CBBlockStateProvider(packOutput, existingFileHelper));
    //gen.addProvider(true, new CBItemModelProvider(packOutput, existingFileHelper));
    //gen.addProvider(true, new CBLanguageProvider(packOutput, "en_us"));
    //gen.addProvider(true, new CBRecipeProvider(registries, recipeOutput));
    //gen.addProvider(true, CBLootTableProvider.create(packOutput, lookupProvider));
    //TagsProvider<Block> tagsProvider = gen.addProvider(true, new CBBlockTagsProvider(packOutput, lookupProvider, MOD_ID, existingFileHelper));
    //gen.addProvider(true, new CBItemTagsProvider(packOutput, lookupProvider, tagsProvider.contentsGetter(), MOD_ID, existingFileHelper));
    //}
}
