package net.sashiro.compressedblocks.neoforge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.neoforge.CompressedBlocksNeoForge;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;
import net.sashiro.compressedblocks.util.CommonUtils;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.isProduction();
    }

    @Override
    public void registerBlock(String name, Block... blocks) {
        for (int i = 0; i < blocks.length; i++) {
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i);
            String prefixedName = "c" + i + "_" + name;
            int finalI = i;
            CompressedBlocksNeoForge.BLOCKS.register(prefixedName.toLowerCase(), () -> blocks[finalI]);
            CompressedBlocksNeoForge.ITEMS.register(prefixedName.toLowerCase(), () -> new BlockItem(blocks[finalI], properties));
            Constants.BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerCrate(String name, Block... crateBlocks) {
        for (int i = 0; i < crateBlocks.length; i++) {
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i);
            String prefixedName = CommonUtils.getCratePrefix(i) + name;
            int finalI = i;
            CompressedBlocksNeoForge.CRATE_BLOCKS.register(prefixedName.toLowerCase(), () -> crateBlocks[finalI]);
            CompressedBlocksNeoForge.CRATE_ITEMS.register(prefixedName.toLowerCase(), () -> new CrateItem(crateBlocks[finalI], properties));
            Constants.CRATES.add(crateBlocks[i]);
        }
    }
}