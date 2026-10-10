package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.CBConfig;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.PlatformHelper;
import net.sashiro.compressedblocks.util.ResourceUtils;

import java.nio.file.Path;

import static net.sashiro.compressedblocks.Constants.*;

public class FabricPlatformHelper implements PlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public void registerBlock(Block block) {
        CompressedBlock cbBlock = (CompressedBlock) block;
        if (!isBlockEnabled(cbBlock.blockName())) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), cbBlock.getCompressor().getCompressionLevel());

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, cbBlock.blockName()), block);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, cbBlock.blockName()), new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(CrateItem crateItem) {
        String crateName = ResourceUtils.removeCrateName(crateItem.getCrateName());
        if (!isBlockEnabled(crateName)) return;
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, crateItem.getCrateName()), crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    public void registerCrate(CrateBlock crateBlock) {
        String crateName = ResourceUtils.removeCrateName(crateBlock.getBlockName().location().getPath());
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), crateBlock.getCompressor().getCompressionLevel());

        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, crateBlock.blockName()), crateBlock);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, crateBlock.blockName()), new BlockItem(crateBlock, properties));
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
        return CBConfig.CONFIG.isEnabled(name);
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
        return FabricLoader.getInstance().getConfigDir();
    }
}