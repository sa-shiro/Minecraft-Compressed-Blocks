package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.fabric.CBFabricConfig;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.PlatformHelper;
import net.sashiro.compressedblocks.util.ResourceUtils;

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

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties().setId(ResourceUtils.createItemId(cbBlock.blockName())), cbBlock.getCompressor().getCompressionLevel());

        Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, cbBlock.blockName()), block);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, cbBlock.blockName()), new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(CrateItem crateItem) {
        String crateName = ResourceUtils.removeCrateName(crateItem.getCrateName()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, crateItem.getCrateName().toLowerCase()), crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    public void registerCrate(CrateBlock crateBlock) {
        String crateName = ResourceUtils.removeCrateName(crateBlock.getBlockName().location().getPath()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), crateBlock.getCompressor().getCompressionLevel()).setId(ResourceUtils.createItemId(crateBlock.blockName().toLowerCase()));

        Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, crateBlock.blockName().toLowerCase()), crateBlock);
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, crateBlock.blockName().toLowerCase()), new BlockItem(crateBlock, properties));
        CRATE_BLOCKS.add(crateBlock);
    }

    @Override
    public boolean areBlocksEnabled() {
        return CBFabricConfig.CONFIG.CONFIG_BLOCKS_ENABLED.get();
    }

    @Override
    public boolean areCratesEnabled() {
        return CBFabricConfig.CONFIG.CONFIG_CRATES_ENABLED.get();
    }

    @Override
    public int maxCompressionLevel() {
        return CBFabricConfig.CONFIG.CONFIG_MAX_COMPRESSION_LEVEL.get();
    }

    @Override
    public float[] getHardnessArray() {
        return CBFabricConfig.CONFIG.getHardnessArray();
    }

    @Override
    public float[] getResistanceArray() {
        return CBFabricConfig.CONFIG.getResistanceArray();
    }

    @Override
    public int maxCrateCompressionLevel() {
        return CBFabricConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isBlockEnabled(String name) {
        if (name.contains("crate")) {
            name = ResourceUtils.removeCrateName(name).toUpperCase();
        } else {
            name = ResourceUtils.removeCompressionName(name).toUpperCase();
        }
        return CBFabricConfig.CONFIG.isBlockEnabled(name);
    }

    @Override
    public float getHardnessResistanceMultiplier(String id) {
        return CBFabricConfig.CONFIG.getHardnessResistanceMultiplier(id);
    }

    @Override
    public int getMaxCompressionLevel(String id) {
        return CBFabricConfig.CONFIG.getCompressionLevel(id);
    }
}