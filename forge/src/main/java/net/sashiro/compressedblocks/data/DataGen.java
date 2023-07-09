package net.sashiro.compressedblocks.data;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.sashiro.compressedblocks.data.providers.*;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();
        
        gen.addProvider(new CBBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new CBItemModelProvider(gen, existingFileHelper));
        gen.addProvider(new CBLanguageProvider(gen, "en_us"));
        gen.addProvider(new CBRecipeProvider(gen));
        gen.addProvider(new CBLootTableProvider(gen));
        //gen.addProvider(new CBTagProvider(gen, existingFileHelper));
    }
}
