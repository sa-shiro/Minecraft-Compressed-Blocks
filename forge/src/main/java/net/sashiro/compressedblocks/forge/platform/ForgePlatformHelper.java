package net.sashiro.compressedblocks.forge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.fml.loading.FMLPaths;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.compression.CompressionCatalog;
import net.sashiro.compressedblocks.compression.CompressionEntry;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.PlatformHelper;
import net.sashiro.compressedblocks.util.ResourceUtils;
import net.sashiro.compressedblocks.util.VersionUtils;

import java.nio.file.Path;

import static net.sashiro.compressedblocks.Constants.*;

public class ForgePlatformHelper implements PlatformHelper {

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
    public void registerBlock(Block block) {
        CompressedBlock cbBlock = (CompressedBlock) block;
        if (!isBlockEnabled(cbBlock.blockName())) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), cbBlock.getCompressor().getCompressionLevel());

        CompressedBlocksForge.BLOCKS.register(cbBlock.blockName(), () -> block);
        CompressedBlocksForge.ITEMS.register(cbBlock.blockName(), () -> new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(CrateItem crateItem) {
        String crateName = ResourceUtils.removeCrateName(crateItem.getCrateName());
        if (!isBlockEnabled(crateName)) return;
        CompressedBlocksForge.CRATE_ITEMS.register(crateItem.getCrateName(), () -> crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    public void registerCrate(CrateBlock crateBlock) {
        String crateName = ResourceUtils.removeCrateName(crateBlock.getBlockName().location().getPath());
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), crateBlock.getCompressor().getCompressionLevel());

        CompressedBlocksForge.CRATE_BLOCKS.register(crateBlock.blockName(), () -> crateBlock);
        CompressedBlocksForge.CRATE_ITEMS.register(crateBlock.blockName(), () -> new BlockItem(crateBlock, properties));
        CRATE_BLOCKS.add(crateBlock);
    }

    @Override
    public boolean areBlocksEnabled() {
        return true;
    }

    @Override
    public boolean areCratesEnabled() {
        return true;
    }

    @Override
    public int maxCompressionLevel() {
        return 10;
    }

    @Override
    public float[] getHardnessArray() {
        return new float[]{5.0F, 6.5F, 8.5F, 12.5F, 15.0F, 20.5F, 25.5F, 30.5F, 40.0F, 50.0F};
    }

    @Override
    public float[] getResistanceArray() {
        return new float[]{35.5F, 75.0F, 150.0F, 300.0F, 600.0F, 800.0F, 1250.0F, 2000.0F, 5000.0F, 7500.0F};
    }

    @Override
    public int maxCrateCompressionLevel() {
        return 10;
    }

    @Override
    public boolean isBlockEnabled(String name) {
        if (name.contains("crate")) {
            name = ResourceUtils.removeCrateName(name);
        } else {
            name = ResourceUtils.removeCompressionName(name);
        }
        CompressionEntry entry = CompressionCatalog.getEntryById(name);
        if (entry == null) return false;
        return VersionUtils.isCompatibleWithCurrentVersion(entry);
    }

    @Override
    public float getHardnessResistanceMultiplier(String id) {
        if (id.contains("crate")) {
            id = ResourceUtils.removeCrateName(id);
        } else {
            id = ResourceUtils.removeCompressionName(id);
        }
        CompressionEntry entry = CompressionCatalog.getEntryById(id);
        if (entry == null) return 1.0F;
        return entry.hardnessResistanceMultiplier();
    }

    @Override
    public int getMaxCompressionLevel(String id) {
        return 10;
    }

    @Override
    public Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}