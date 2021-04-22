package com.github.sa_shiro.compressedblocks.data;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.data.generators.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CompressedBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        ExistingFileHelper existingFileHelper = e.getExistingFileHelper();

        gen.addProvider(new GenBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new GenItemModelProvider(gen, existingFileHelper));
        gen.addProvider(new GenLanguageProvider(gen, "en_us"));
        gen.addProvider(new GenRecipeProvider(gen));
        gen.addProvider(new GenLootTableProvider(gen));
    }
}
