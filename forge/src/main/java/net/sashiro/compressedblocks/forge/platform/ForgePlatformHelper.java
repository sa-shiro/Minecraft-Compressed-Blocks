package net.sashiro.compressedblocks.forge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.forge.CBForgeConfig;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;
import net.sashiro.compressedblocks.util.CommonUtils;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Forge";
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
            CompressedBlocksForge.BLOCKS.register(prefixedName.toLowerCase(), () -> blocks[finalI]);
            CompressedBlocksForge.ITEMS.register(prefixedName.toLowerCase(), () -> new BlockItem(blocks[finalI], properties));
            Constants.BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerCrate(String name, Block... crateBlocks) {
        for (int i = 0; i < crateBlocks.length; i++) {
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i);
            String prefixedName = CommonUtils.getCratePrefix(i) + name;
            int finalI = i;
            CompressedBlocksForge.CRATE_BLOCKS.register(prefixedName.toLowerCase(), () -> crateBlocks[finalI]);
            CompressedBlocksForge.CRATE_ITEMS.register(prefixedName.toLowerCase(), () -> new CrateItem(crateBlocks[finalI], properties));
            Constants.CRATES.add(crateBlocks[i]);
        }
    }

    @Override
    public boolean areBlocksEnabled() {
        return CBForgeConfig.CONFIG.CONFIG_BLOCKS_ENABLED.get();
    }

    @Override
    public boolean areCratesEnabled() {
        return CBForgeConfig.CONFIG.CONFIG_CRATES_ENABLED.get();
    }

    @Override
    public int maxCompressionLevel() {
        return CBForgeConfig.CONFIG.CONFIG_MAX_COMPRESSION_LEVEL.get();
    }

    @Override
    public int maxCrateCompressionLevel() {
        return CBForgeConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isBlockEnabled(String name) {
        return CBForgeConfig.CONFIG.isBlockEnabled(name);
    }
}