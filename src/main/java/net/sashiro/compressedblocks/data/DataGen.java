package net.sashiro.compressedblocks.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.data.providers.*;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = CompressedBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
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
        gen.addProvider(true, new CBRecipeProvider(packOutput));
        gen.addProvider(true, CBLootTableProvider.create(packOutput));
        TagsProvider<Block> tagsProvider = gen.addProvider(true, new CBBlockTagsProvider(packOutput, lookupProvider, CompressedBlocks.MOD_ID, existingFileHelper));
        gen.addProvider(true, new CBItemTagsProvider(packOutput, lookupProvider, tagsProvider.contentsGetter(), CompressedBlocks.MOD_ID, existingFileHelper));
    }
}
