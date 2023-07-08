package net.sashiro.compressedblocks.item;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

import static net.sashiro.compressedblocks.Constants.MOD_ID;
import static net.sashiro.compressedblocks.block.BlockList.STONE_0;
import static net.sashiro.compressedblocks.block.CrateList.APPLE_0;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {
    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab compressedBlockGroup = new CreativeModeTab("compressedblocks.compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(STONE_0);
        }
        
        @Override
        public boolean canScroll() {
            return true;
        }
    };
    
    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab compressedItemGroup = new CreativeModeTab("compressedblocks.compressed_items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(APPLE_0);
        }
        
        @Override
        public boolean canScroll() {
            return true;
        }
    };
}