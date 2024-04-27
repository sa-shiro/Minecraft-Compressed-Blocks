package net.sashiro.compressedblocks.forge.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.STONE;
import static net.sashiro.compressedblocks.block.CrateList.APPLE;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {

    public static CreativeModeTab BLOCKS_ITEM_GROUP;
    public static CreativeModeTab CRATE_ITEM_GROUP;

    @SubscribeEvent
    public static void registerCreativeTab(CreativeModeTabEvent.Register event) {
        BLOCKS_ITEM_GROUP = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressedblocks.compressed_blocks"), builder -> builder.icon(
                () -> new ItemStack(STONE[9])).title(Component.translatable("itemGroup.compressed_blocks")));

        CRATE_ITEM_GROUP = event.registerCreativeModeTab(new ResourceLocation(MOD_ID, "compressedblocks.compressed_items"), builder -> builder.icon(
                () -> new ItemStack(APPLE[0])).title(Component.translatable("itemGroup.compressed_items")));
    }
}