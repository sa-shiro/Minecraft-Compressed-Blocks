package net.sashiro.compressedblocks.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.sashiro.compressedblocks.data.providers.*;

import java.util.concurrent.CompletableFuture;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

        gen.addProvider(true, new CBBlockStateProvider(packOutput, existingFileHelper));
        gen.addProvider(true, new CBItemModelProvider(packOutput, existingFileHelper));
        gen.addProvider(true, new CBLanguageProvider(packOutput, "en_us"));
        gen.addProvider(true, new CBRecipeProvider(packOutput, lookupProvider));
        gen.addProvider(true, CBLootTableProvider.create(packOutput));
        TagsProvider<Block> tagsProvider = gen.addProvider(true, new CBBlockTagsProvider(packOutput, lookupProvider, MOD_ID, existingFileHelper));
        gen.addProvider(true, new CBItemTagsProvider(packOutput, lookupProvider, tagsProvider.contentsGetter(), MOD_ID, existingFileHelper));
    }
}
