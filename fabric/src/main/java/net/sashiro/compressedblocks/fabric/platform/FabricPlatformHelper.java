package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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

    @Override
    public void registerBlock(String name, Block... blocks) {
        for (int i = 0; i < blocks.length; i++) {
            String prefixedName = "c" + i + "_" + name;
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i).setId(CommonUtils.createItemId(prefixedName));
            Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), blocks[i]);
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), new BlockItem(blocks[i], properties));
            BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerCrate(String name, CrateItem... crateItems) {
        for (int i = 0; i < crateItems.length; i++) {
            String prefixedName = CommonUtils.getCratePrefix(i) + name;
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), crateItems[i]);
            CRATES.add(crateItems[i]);
        }
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
        return CBFabricConfig.CONFIG.CONFIG_HARDNESS_LEVELS.get();
    }

    @Override
    public float[] getResistanceArray() {
        return CBFabricConfig.CONFIG.CONFIG_RESISTANCE_LEVELS.get();
    }


    @Override
    public int maxCrateCompressionLevel() {
        return CBFabricConfig.CONFIG.CONFIG_MAX_CRATE_COMPRESSION_LEVEL.get();
    }

    @Override
    public boolean isCompressionEnabled(String name) {
        return CBFabricConfig.CONFIG.isBlockEnabled(name);
    }
}