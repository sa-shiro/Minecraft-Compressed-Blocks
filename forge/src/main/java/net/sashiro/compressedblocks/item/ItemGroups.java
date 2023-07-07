package net.sashiro.compressedblocks.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.DIRT_9;
import static net.sashiro.compressedblocks.block.CrateList.APPLE_0;
import static net.sashiro.compressedblocks.event.CBRegistryEvent.*;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {
    
    public static CreativeModeTab compressedBlockGroup;
    public static CreativeModeTab compressedItemGroup;
    
    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        compressedBlockGroup = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressed_blocks"), builder -> builder.icon(
                () -> new ItemStack(DIRT_9)).title(Component.translatable("itemGroup.compressed_blocks")));
        
        compressedItemGroup = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressed_items"), builder -> builder.icon(
                () -> new ItemStack(APPLE_0)).title(Component.translatable("itemGroup.compressed_items")));
    }
}