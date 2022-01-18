package com.github.sa_shiro.compressedblocks.data.generators;

import com.github.sa_shiro.compressedblocks.CompressedBlocks;
import com.github.sa_shiro.compressedblocks.event.ModRegistryEvent;
import com.github.sa_shiro.compressedblocks.util.Lists;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fmllegacy.RegistryObject;

public class GenItemModelProvider extends ItemModelProvider {
    public GenItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, CompressedBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (RegistryObject<Block> block : ModRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getRegistryName().toString().replace("compressedblocks:", "");
            withExistingParent(name, modLoc("block/" + name));

        }

        withExistingParent("logo_block", modLoc("block/logo_block"));

        ModelFile.ExistingModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        for (String str : Lists.ITEMS) {
            for (int i = 0; i <= 9; i++) {
                builder(i, str, itemGenerated);
            }
        }
    }

    private void builder(int level, String itemName, ModelFile.ExistingModelFile parentTexture) {
        String r = "";
        if (level == 1) r = "double_";
        else if (level == 2) r = "triple_";
        else if (level == 3) r = "quadruple_";
        else if (level == 4) r = "quintuple_";
        else if (level == 5) r = "sextuple_";
        else if (level == 6) r = "septuple_";
        else if (level == 7) r = "octuple_";
        else if (level == 8) r = "mega_";
        else if (level == 9) r = "giga_";
        getBuilder(r + "crated_" + itemName).parent(parentTexture).texture("layer0", "item/crate").texture("layer1", "item/" + itemName);
    }
}