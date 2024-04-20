package net.sashiro.compressedblocks.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.CompressedBlocksNeoForge;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;

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
    public void registerBlock(String name, Block block) {
        CompressedBlocksNeoForge.BLOCKS.register(name.toLowerCase(), () -> block);
        CompressedBlocksNeoForge.ITEMS.register(name.toLowerCase(), () -> new BlockItem(block, CompressedBlocksNeoForge.PROPERTIES));
        Constants.BLOCKS.add(block);
    }

    @Override
    public void registerCrate(String name, Block block) {
        CompressedBlocksNeoForge.CRATE_BLOCKS.register(name.toLowerCase(), () -> block);
        CompressedBlocksNeoForge.CRATE_ITEMS.register(name.toLowerCase(), () -> new CrateItem(block));
        Constants.CRATES.add(block);
    }
}