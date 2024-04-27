package net.sashiro.compressedblocks.fabric.platform;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.sashiro.compressedblocks.fabric.client.CompressedBlocksClient;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;
import net.sashiro.compressedblocks.util.StringUtils;

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
            FabricItemSettings fis = (FabricItemSettings) new FabricItemSettings().tab(CompressedBlocksClient.COMPRESSED_BLOCKS);
            String prefixedName = "c" + i + "_" + name;
            Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, prefixedName.toLowerCase()), blocks[i]);
            Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, prefixedName.toLowerCase()), new BlockItem(blocks[i], fis));
            BLOCKS.add(blocks[i]);
        }
    }

    @Override
    public void registerCrate(String name, Block... crateBlocks) {
        for (int i = 0; i < crateBlocks.length; i++) {
            FabricItemSettings fis = (FabricItemSettings) new FabricItemSettings().tab(CompressedBlocksClient.CRATE_ITEMS);
            String prefixedName = StringUtils.getCratePrefix(i) + name;
            Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, prefixedName.toLowerCase()), crateBlocks[i]);
            Registry.register(Registry.ITEM, new ResourceLocation(MOD_ID, prefixedName.toLowerCase()), new CrateItem(crateBlocks[i], fis));
            CRATES.add(crateBlocks[i]);
        }
    }
}