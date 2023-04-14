package net.sashiro.compressedblocks.world.level.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.compressedblocks.CompressedBlocks.MOD_ID;
import static net.sashiro.compressedblocks.world.level.block.CompressedBlocks.LOGO_BLOCK;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {

    public static CreativeModeTab compressedBlockGroup;

    // fixme: change icon to crate
    public static CreativeModeTab compressedItemGroup;

    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        compressedBlockGroup = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressed_blocks"), builder -> builder.icon(
                () -> new ItemStack(LOGO_BLOCK.get())).title(Component.translatable("itemGroup.compressed_blocks")));

        compressedItemGroup = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressed_items"), builder -> builder.icon(
                () -> new ItemStack(LOGO_BLOCK.get())).title(Component.translatable("itemGroup.compressed_items")));
    }
}