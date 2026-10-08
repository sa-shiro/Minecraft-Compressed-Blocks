package net.sashiro.compressedblocks.neoforge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.fml.loading.FMLPaths;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.neoforge.CompressedBlocksNeoForge;
import net.sashiro.compressedblocks.platform.services.PlatformHelper;
import net.sashiro.compressedblocks.util.ResourceUtils;

import java.nio.file.Path;

import static net.sashiro.compressedblocks.Constants.*;

@SuppressWarnings("unused")
public class NeoForgePlatformHelper implements PlatformHelper {

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
    public void registerBlock(Block block) {
        CompressedBlock cbBlock = (CompressedBlock) block;
        if (!isBlockEnabled(cbBlock.blockName())) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), cbBlock.getCompressor().getCompressionLevel());

        CompressedBlocksNeoForge.BLOCKS.register(cbBlock.blockName(), () -> block);
        CompressedBlocksNeoForge.ITEMS.register(cbBlock.blockName(), () -> new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(CrateItem crateItem) {
        String crateName = ResourceUtils.removeCrateName(crateItem.getCrateName());
        if (!isBlockEnabled(crateName)) return;
        CompressedBlocksNeoForge.CRATE_ITEMS.register(crateItem.getCrateName(), () -> crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    public void registerCrate(CrateBlock crateBlock) {
        String crateName = ResourceUtils.removeCrateName(crateBlock.getBlockName().location().getPath());
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), crateBlock.getCompressor().getCompressionLevel());

        CompressedBlocksNeoForge.CRATE_BLOCKS.register(crateBlock.blockName(), () -> crateBlock);
        CompressedBlocksNeoForge.CRATE_ITEMS.register(crateBlock.blockName(), () -> new BlockItem(crateBlock, properties));
        CRATE_BLOCKS.add(crateBlock);
    }

    @Override
    public boolean areBlocksEnabled() {
        return CBConfig.CONFIG.CONFIG_BLOCKS_ENABLED.get();
    }

    @Override
    public boolean areCratesEnabled() {
        return CBConfig.CONFIG.CONFIG_CRATES_ENABLED.get();
    }

    @Override
    public int maxCompressionLevel() {
        return CBConfig.CONFIG.CONFIG_MAX_COMPRESSION_LEVEL.get();
    }

    @Override
    public float[] getHardnessArray() {
        return CBConfig.CONFIG.getHardnessArray();
    }

    @Override
    public float[] getResistanceArray() {
        return CBConfig.CONFIG.getResistanceArray();
    }

    @Override
    public int maxCrateCompressionLevel() {
        return CBConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isBlockEnabled(String name) {
        if (name.contains("crate")) {
            name = ResourceUtils.removeCrateName(name);
        } else {
            name = ResourceUtils.removeCompressionName(name);
        }
        return CBConfig.CONFIG.isBlockEnabled(name);
    }

    @Override
    public float getHardnessResistanceMultiplier(String id) {
        return CBConfig.CONFIG.getHardnessResistanceMultiplier(id);
    }

    @Override
    public int getMaxCompressionLevel(String id) {
        return CBConfig.CONFIG.getCompressionLevel(id);
    }

    @Override
    public Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}