package net.sashiro.compressedblocks.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.data.generators.*;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CompressedBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

        gen.addProvider(true, new GenBlockStateProvider(packOutput, existingFileHelper));
        gen.addProvider(true, new GenItemModelProvider(packOutput, existingFileHelper));
        gen.addProvider(true, new GenLanguageProvider(packOutput, "en_us"));
        gen.addProvider(true, new GenRecipeProvider(packOutput));
        gen.addProvider(true, GenLootTableProvider.create(packOutput));
        gen.addProvider(true, new GenTagProvider(packOutput, lookupProvider, CompressedBlocks.MOD_ID, existingFileHelper));
    }
}
