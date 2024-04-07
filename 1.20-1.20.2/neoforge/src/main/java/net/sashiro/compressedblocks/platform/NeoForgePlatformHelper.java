package net.sashiro.compressedblocks.platform;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.item.CrateItem;
import net.sashiro.compressedblocks.platform.services.IPlatformHelper;

import static net.sashiro.compressedblocks.event.CBRegistryEvent.*;

public class NeoForgePlatformHelper implements IPlatformHelper {

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
    public void registerBlock(String name, Block block) {
        BLOCKS.register(name.toLowerCase(), () -> block);
        ITEMS.register(name.toLowerCase(), () -> new BlockItem(block, PROPERTIES));
        Constants.BLOCKS.add(block);
    }

    @Override
    public void registerCrate(String name, Block block) {
        CRATE_BLOCKS.register(name.toLowerCase(), () -> block);
        CRATE_ITEMS.register(name.toLowerCase(), () -> new CrateItem(block));
        Constants.CRATES.add(block);
    }
}