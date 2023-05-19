package net.sashiro.compressedblocks.data.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.sashiro.compressedblocks.CompressedBlocks;
import net.sashiro.compressedblocks.event.CBRegistryEvent;

public class CBItemModelProvider extends ItemModelProvider {
    public CBItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, CompressedBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ModelFile.ExistingModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        for (RegistryObject<Block> block : CBRegistryEvent.BLOCKS.getEntries()) {
            assert false;
            String name = block.get().getDescriptionId().replace("block.compressedblocks.", "");
            withExistingParent(name, modLoc("block/" + name));
        }

        for (RegistryObject<Item> crateItem : CBRegistryEvent.CRATE_ITEMS.getEntries()) {
            assert false;
            String crateItemName = crateItem.get().getDescriptionId().replace("item.compressedblocks.", "");
            String cratedItemNameClean = crateItemName
                    .replace("crated_", "")
                    .replace("double_", "")
                    .replace("triple_", "")
                    .replace("quadruple_", "")
                    .replace("quintuple_", "")
                    .replace("sextuple_", "")
                    .replace("septuple_", "")
                    .replace("octuple_", "")
                    .replace("mega_", "")
                    .replace("giga_", "");

            //getBuilder(crateItemName)
            //        .parent(itemGenerated)
            //        .texture("layer0", "item/crate")
            //        .texture("layer1", "item/" + cratedItemNameClean)
            //        .texture("layer2", "item/" + crateLevel(crateItemName));
            getBuilder(crateItemName).parent(itemGenerated).texture("layer0", "item/crate").texture("layer1", "item/crate");
        }
    }

    private String crateLevel(String crateName) {
        String s = "";
        if (crateName.startsWith("crated_")) s = "1";
        if (crateName.startsWith("double_")) s = "2";
        if (crateName.startsWith("triple_")) s = "3";
        if (crateName.startsWith("quadruple_")) s = "4";
        if (crateName.startsWith("quintuple_")) s = "5";
        if (crateName.startsWith("sextuple_")) s = "6";
        if (crateName.startsWith("septuple_")) s = "7";
        if (crateName.startsWith("octuple_")) s = "8";
        if (crateName.startsWith("mega_")) s = "9";
        if (crateName.startsWith("giga_")) s = "10";
        return s;
    }
}