package net.sashiro.compressedblocks.forge.item;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.compressedblocks.block.BlockList;
import net.sashiro.compressedblocks.block.CrateList;

import static net.sashiro.compressedblocks.Constants.MOD_ID;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemGroups {
    @MethodsReturnNonnullByDefault
    public static final CreativeModeTab compressedBlockGroup = new CreativeModeTab("compressedblocks.compressed_blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockList.STONE[9]);
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
            return new ItemStack(CrateList.APPLE[0]);
        }

        @Override
        public boolean canScroll() {
            return true;
        }
    };
}