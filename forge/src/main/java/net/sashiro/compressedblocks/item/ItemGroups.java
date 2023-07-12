package net.sashiro.compressedblocks.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.ForgeBlockList.STONE_5;
import static net.sashiro.compressedblocks.block.ForgeCrateList.APPLE_0;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {
    public static ItemGroup compressedBlockGroup = new ItemGroup("compressedblocks.compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(STONE_5);
        }
        
        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
    
    public static ItemGroup crateBlockGroup = new ItemGroup("compressedblocks.compressed_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(APPLE_0);
        }
        
        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };
}