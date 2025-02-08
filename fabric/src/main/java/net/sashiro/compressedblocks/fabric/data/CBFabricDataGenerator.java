package net.sashiro.compressedblocks.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.sashiro.compressedblocks.fabric.data.providers.*;

public class CBFabricDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CBBlockTagsProvider::new);
        pack.addProvider(CBItemTagsProvider::new);
        pack.addProvider(CBLanguageProvider::new);
        pack.addProvider(CBLootTableProvider::new);
        pack.addProvider(CBModelProvider::new);
        pack.addProvider(CBRecipeProvider::new);
    }
}
