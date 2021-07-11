package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.block.BlockFactory;
import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class GenItemModelProvider extends ItemModelProvider {
    public GenItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CompressedBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (BlockFactory factory : Lists.blockList) {
            for (int i = 0; i <= 9; i++) {
                withExistingParent("c" + i + "_" + factory.getRegistryName(), modLoc("block/" + "c" + i + "_" + factory.getRegistryName()));
            }
        }

        ModelFile.ExistingModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile.ExistingModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));

        assert false;
        builder(RegistryEvent.ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.HUGE_ENDER_PEARL_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.HUGE_ENDER_EYE_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.HUGE_EGG_BAG.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.COMPRESSED_STICK.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.COMPRESSED_WOOD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.COMPRESSED_IRON.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.COMPRESSED_GOLD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);
        builder(RegistryEvent.COMPRESSED_DIAMOND.get().getRegistryName().toString().replace("compressedblocks:", ""), itemGenerated);

        builder(RegistryEvent.HARDENED_WOODEN_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_WOODEN_AXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_WOODEN_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_WOODEN_HOE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_WOODEN_SWORD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_AXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_HOE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_SWORD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_IRON_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_IRON_AXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_IRON_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_IRON_HOE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_IRON_SWORD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_GOLDEN_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_GOLDEN_AXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_GOLDEN_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_GOLDEN_HOE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_GOLDEN_SWORD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_DIAMOND_PICKAXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_DIAMOND_AXE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_DIAMOND_SHOVEL.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_DIAMOND_HOE.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
        builder(RegistryEvent.HARDENED_DIAMOND_SWORD.get().getRegistryName().toString().replace("compressedblocks:", ""), itemHandheld);
    }

    private void builder(String registryName, ModelFile.ExistingModelFile parentTexture) {
        getBuilder(registryName).parent(parentTexture).texture("layer0", "item/" + registryName);
    }
}