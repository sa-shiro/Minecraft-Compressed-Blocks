package net.sashiro.compressedblocks.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.sashiro.compressedblocks.fabric.data.providers.*;

public class FabricDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(CBBlockTagsProvider::new);
        fabricDataGenerator.addProvider(CBItemTagsProvider::new);
        fabricDataGenerator.addProvider(CBLanguageProvider::new);
        fabricDataGenerator.addProvider(CBLootTableProvider::new);
        fabricDataGenerator.addProvider(CBModelProvider::new);
        fabricDataGenerator.addProvider(CBRecipeProvider::new);
    }
}
