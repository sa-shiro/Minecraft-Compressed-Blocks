package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i);
            String prefixedName = "c" + i + "_" + name;
            Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), blocks[i]);
            Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), new BlockItem(blocks[i], properties));
            BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerCrate(String name, Block... crateBlocks) {
        for (int i = 0; i < crateBlocks.length; i++) {
            Item.Properties properties = CommonUtils.setRarity(new Item.Properties(), i);
            String prefixedName = CommonUtils.getCratePrefix(i) + name;
            Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), crateBlocks[i]);
            Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MOD_ID, prefixedName.toLowerCase()), new CrateItem(crateBlocks[i], properties));
            CRATES.add(crateBlocks[i]);
        }
    }
}