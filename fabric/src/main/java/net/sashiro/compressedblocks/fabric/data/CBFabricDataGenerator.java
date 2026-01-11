package net.sashiro.compressedblocks.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sashiro.compressedblocks.fabric.data.providers.*;

public class CBFabricDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // todo: fix data generation
        // current workflow: run Fabric Datagen (no models) -> Run Forge Datagen (models)
        pack.addProvider(CBTagsProviders.CBBlockTagsProvider::new);
        pack.addProvider(CBTagsProviders.CBItemTagsProvider::new);
        pack.addProvider(CBLanguageProvider::new);
        pack.addProvider(CBLootTableProvider::new);
        // fixme: Model generator can no longer be run on the server side thus Datagen task will fail!
        pack.addProvider(CBModelProvider::new);
        pack.addProvider(CBRecipeProvider::new);
    }
}
