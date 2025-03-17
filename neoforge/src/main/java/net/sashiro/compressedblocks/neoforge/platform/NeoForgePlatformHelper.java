package net.sashiro.compressedblocks.neoforge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.neoforge.CBNeoForgeConfig;
import net.sashiro.compressedblocks.neoforge.CompressedBlocksNeoForge;
import net.sashiro.compressedblocks.platform.Services;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;
import net.sashiro.compressedblocks.util.CommonUtils;

public class NeoForgePlatformHelper implements IPlatformHelper {

    public static final NeoForgePlatformHelper INSTANCE = new NeoForgePlatformHelper();

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
        if (Services.PLATFORM.isBlockEnabled(name)) {
            for (int i = 0; i < blocks.length; i++) {
                String prefixedName = "c" + i + "_" + name;
                Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i).setId(CommonUtils.createItemId(prefixedName));
                int finalI = i;
                CompressedBlocksNeoForge.BLOCKS.register(prefixedName.toLowerCase(), () -> blocks[finalI]);
                CompressedBlocksNeoForge.ITEMS.register(prefixedName.toLowerCase(), () -> new BlockItem(blocks[finalI], properties));
                Constants.BLOCKS.add(blocks[i]);
            }
        }
    }

    @Override
    public void registerCrate(String name, Block... crateBlocks) {
        if (!Services.PLATFORM.isBlockEnabled(name)) {
            for (int i = 0; i < crateBlocks.length; i++) {
                String prefixedName = CommonUtils.getCratePrefix(i) + name;
                Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i).setId(CommonUtils.createItemId(prefixedName));
                int finalI = i;
                CompressedBlocksNeoForge.CRATE_BLOCKS.register(prefixedName.toLowerCase(), () -> crateBlocks[finalI]);
                CompressedBlocksNeoForge.CRATE_ITEMS.register(prefixedName.toLowerCase(), () -> new CrateItem(crateBlocks[finalI], properties));
                Constants.CRATES.add(crateBlocks[i]);
            }
        }
    }

    @Override
    public boolean areBlocksEnabled() {
        return CBNeoForgeConfig.CONFIG.CONFIG_BLOCKS_ENABLED.get();
    }

    @Override
    public boolean areCratesEnabled() {
        return CBNeoForgeConfig.CONFIG.CONFIG_CRATES_ENABLED.get();
    }

    @Override
    public int maxCompressionLevel() {
        return CBNeoForgeConfig.CONFIG.CONFIG_MAX_COMPRESSION_LEVEL.get();
    }

    @Override
    public int maxCrateCompressionLevel() {
        return CBNeoForgeConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isBlockEnabled(String name) {
        return CBNeoForgeConfig.CONFIG.isBlockEnabled(name);
    }
}