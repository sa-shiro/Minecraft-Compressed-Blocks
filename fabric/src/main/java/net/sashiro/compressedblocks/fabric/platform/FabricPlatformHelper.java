package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.block.CrateBlock;
import net.sashiro.compressedblocks.fabric.CBFabricConfig;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;
import net.sashiro.compressedblocks.util.CommonUtils;

import static net.sashiro.compressedblocks.Constants.*;

public class FabricPlatformHelper implements IPlatformHelper {

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

    @Deprecated
    public void registerBlock(String name, Block... blocks) {
        for (int i = 0; i < blocks.length; i++) {
            CompressedBlock cbBlock = (CompressedBlock) blocks[i];
            if (!isBlockEnabled(cbBlock.blockName())) continue;

            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i).setId(CommonUtils.createItemId(cbBlock.blockName().toLowerCase()));
            Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, cbBlock.blockName().toLowerCase()), blocks[i]);
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, cbBlock.blockName().toLowerCase()), new BlockItem(blocks[i], properties));
            BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerBlock(Block block) {
        CompressedBlock cbBlock = (CompressedBlock) block;
        if (!isBlockEnabled(cbBlock.blockName())) return;

        Item.Properties properties = CommonUtils.setRarity(new Item.Properties().setId(CommonUtils.createItemId(cbBlock.blockName())), cbBlock.getCompressor().getCompressionLevel());

        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, cbBlock.blockName()), block);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, cbBlock.blockName()), new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    @Deprecated
    public void registerCrate(CrateItem... crateItems) {
        for (CrateItem crateItem : crateItems) {
            String crateName = CommonUtils.removeCrateName(crateItem.getCrateName()).toUpperCase();
            if (!isBlockEnabled(crateName)) continue;
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, crateItem.getCrateName().toLowerCase()), crateItem);
            CRATE_ITEMS.add(crateItem);
        }
    }

    public void registerCrate(CrateItem crateItem) {
        String crateName = CommonUtils.removeCrateName(crateItem.getCrateName()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, crateItem.getCrateName().toLowerCase()), crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    @Deprecated
    public void registerCrate(CrateBlock... crateBlocks) {
        for (int i = 0; i < crateBlocks.length; i++) {
            String crateName = CommonUtils.removeCrateName(crateBlocks[i].getBlockName().identifier().getPath()).toUpperCase();
            if (!isBlockEnabled(crateName)) continue;
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i).setId(CommonUtils.createItemId(crateBlocks[i].getBlockNameString().toLowerCase()));

            Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, crateBlocks[i].getBlockNameString().toLowerCase()), crateBlocks[i]);
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, crateBlocks[i].getBlockNameString().toLowerCase()), new BlockItem(crateBlocks[i], properties));
            CRATE_BLOCKS.add(crateBlocks[i]);
        }
    }

    public void registerCrate(CrateBlock crateBlock) {
        String crateName = CommonUtils.removeCrateName(crateBlock.getBlockName().identifier().getPath()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), 0).setId(CommonUtils.createItemId(crateBlock.getBlockNameString().toLowerCase()));

        Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, crateBlock.getBlockNameString().toLowerCase()), crateBlock);
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, crateBlock.getBlockNameString().toLowerCase()), new BlockItem(crateBlock, properties));
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
            name = CommonUtils.removeCrateName(name).toUpperCase();
        } else {
            name = CommonUtils.removeCompressionName(name).toUpperCase();
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