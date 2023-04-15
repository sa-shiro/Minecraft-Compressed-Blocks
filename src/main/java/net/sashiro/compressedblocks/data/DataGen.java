package net.sashiro.compressedblocks.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.data.generators.*;

@Mod.EventBusSubscriber(modid = CompressedBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        gen.addProvider(true, new GenBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(true, new GenItemModelProvider(gen, existingFileHelper));
        gen.addProvider(true, new GenLanguageProvider(gen, "en_us"));
        gen.addProvider(true, new GenRecipeProvider(gen));
        gen.addProvider(true, new GenLootTableProvider(gen));
        gen.addProvider(true, new GenTagProvider(gen, CompressedBlocks.MOD_ID, existingFileHelper));
    }
}
