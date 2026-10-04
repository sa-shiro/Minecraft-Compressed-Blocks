package net.sashiro.compressedblocks.forge.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.block.CompressedBlock;
import net.sashiro.compressedblocks.crate.CrateBlock;
import net.sashiro.compressedblocks.forge.CBForgeConfig;
import net.sashiro.compressedblocks.forge.CompressedBlocksForge;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.PlatformHelper;
import net.sashiro.compressedblocks.util.ResourceUtils;

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

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties().setId(ResourceUtils.createItemId(cbBlock.blockName())), cbBlock.getCompressor().getCompressionLevel());

        CompressedBlocksForge.BLOCKS.register(cbBlock.blockName().toLowerCase(), () -> block);
        CompressedBlocksForge.ITEMS.register(cbBlock.blockName().toLowerCase(), () -> new BlockItem(block, properties));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(CrateItem crateItem) {
        String crateName = ResourceUtils.removeCrateName(crateItem.getCrateName()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;
        CompressedBlocksForge.CRATE_ITEMS.register(crateItem.getCrateName().toLowerCase(), () -> crateItem);
        CRATE_ITEMS.add(crateItem);
    }

    @Override
    public void registerCrate(CrateBlock crateBlock) {
        String crateName = ResourceUtils.removeCrateName(crateBlock.getBlockName().location().getPath()).toUpperCase();
        if (!isBlockEnabled(crateName)) return;

        Item.Properties properties = ResourceUtils.setRarity(new Item.Properties(), crateBlock.getCompressor().getCompressionLevel()).setId(ResourceUtils.createItemId(crateBlock.blockName().toLowerCase()));

        CompressedBlocksForge.CRATE_BLOCKS.register(crateBlock.blockName().toLowerCase(), () -> crateBlock);
        CompressedBlocksForge.CRATE_ITEMS.register(crateBlock.blockName().toLowerCase(), () -> new BlockItem(crateBlock, properties));
        CRATE_BLOCKS.add(crateBlock);
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
    public float[] getHardnessArray() {
        return CBForgeConfig.CONFIG.getHardnessArray();
    }

    @Override
    public float[] getResistanceArray() {
        return CBForgeConfig.CONFIG.getResistanceArray();
    }

    @Override
    public int maxCrateCompressionLevel() {
        return CBForgeConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isBlockEnabled(String name) {
        if (name.contains("crate")) {
            name = ResourceUtils.removeCrateName(name).toUpperCase();
        } else {
            name = ResourceUtils.removeCompressionName(name).toUpperCase();
        }
        return CBForgeConfig.CONFIG.isBlockEnabled(name);
    }

    @Override
    public float getHardnessResistanceMultiplier(String id) {
        return CBForgeConfig.CONFIG.getHardnessResistanceMultiplier(id);
    }

    @Override
    public int getMaxCompressionLevel(String id) {
        return CBForgeConfig.CONFIG.getCompressionLevel(id);
    }
}