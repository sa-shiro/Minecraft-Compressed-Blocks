package net.sashiro.compressedblocks.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.sashiro.compressedblocks.fabric.data.providers.*;

public class FabricDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator fabricDataGenerator) {
        net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CBBlockTagsProvider::new);
        pack.addProvider(CBItemTagsProvider::new);
        pack.addProvider(CBLanguageProvider::new);
        pack.addProvider(CBLootTableProvider::new);
        // fixme: model provider is not working "cannot be loaded in environment type SERVER"
        //pack.addProvider(CBModelProvider::new);
        pack.addProvider(CBRecipeProvider::new);
    }
}
