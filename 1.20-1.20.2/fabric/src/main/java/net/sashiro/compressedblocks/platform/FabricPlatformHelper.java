package net.sashiro.compressedblocks.platform;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;

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
    public void registerBlock(String name, Block block) {
        FabricItemSettings fis = new FabricItemSettings();
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name.toLowerCase()), block);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name.toLowerCase()), new BlockItem(block, fis));
        BLOCKS.add(block);
    }

    @Override
    public void registerCrate(String name, Block crateBlock) {
        Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MOD_ID, name.toLowerCase()), crateBlock);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MOD_ID, name.toLowerCase()), new CrateItem(crateBlock));
        CRATES.add(crateBlock);
    }
}