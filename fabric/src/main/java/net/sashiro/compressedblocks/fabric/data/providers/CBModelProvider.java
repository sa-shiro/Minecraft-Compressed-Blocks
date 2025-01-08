package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.blockstates.Variant;
import net.minecraft.client.data.models.blockstates.VariantProperties;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.util.CommonUtils;

import java.util.Optional;

public class CBModelProvider extends FabricModelProvider {
    public static final TextureSlot ITEM_SLOT = TextureSlot.create("item");
    public static final TextureSlot NUMBER_SLOT = TextureSlot.create("number");
    public static final TextureSlot OVERLAY_SLOT = TextureSlot.create("overlay");

    public static final ModelTemplate TEMPLATE_BLOCK = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_block")), Optional.empty(), TextureSlot.ALL, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CRATE = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_crate")), Optional.empty(), TextureSlot.ALL, ITEM_SLOT, NUMBER_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN_HORIZONTAL = new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column_horizontal")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);

    public CBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        for (Block block : Constants.BLOCKS) {
            String descriptionId = block.getDescriptionId();
            String block_name = descriptionId.replace("block.compressedblocks.", "");
            if (CommonUtils.isBlock(descriptionId)) continue; // exclude manually added resources

            if (CommonUtils.isRotational(descriptionId)) {
                ResourceLocation side = CommonUtils.getActualResourceLocation(descriptionId);
                ResourceLocation end = ResourceLocation.fromNamespaceAndPath(side.getNamespace(), side.getPath() + "_top");

                if (descriptionId.contains("froglight") || descriptionId.contains("hay") || descriptionId.contains("melon") || descriptionId.contains("pumpkin")) {
                    side = ResourceLocation.fromNamespaceAndPath("minecraft", side.getPath() + "_side");
                }

                TextureMapping mapping = new TextureMapping().put(TextureSlot.END, end).put(TextureSlot.SIDE, side).put(TextureSlot.PARTICLE, side).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));
                TextureMapping mapping_horizontal = new TextureMapping().put(TextureSlot.END, end).put(TextureSlot.SIDE, side).put(TextureSlot.PARTICLE, side).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));
                ResourceLocation location = TEMPLATE_CUBE_COLUMN.create(block, mapping, blockModelGenerators.modelOutput);
                ResourceLocation location_horizontal = TEMPLATE_CUBE_COLUMN_HORIZONTAL.createWithSuffix(block, "_horizontal", mapping_horizontal, blockModelGenerators.modelOutput);

                blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(block, location, location_horizontal));
                blockModelGenerators.registerSimpleItemModel(block, ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/" + block_name));

            } else {
                TextureMapping mapping = new TextureMapping().put(TextureSlot.ALL, CommonUtils.getActualResourceLocation(descriptionId)).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));

                blockModelGenerators.createTrivialBlock(block, (TexturedModel.Provider) TEMPLATE_BLOCK);
                blockModelGenerators.registerSimpleItemModel(block, ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/" + block_name));
            }
        }
        for (Block crate : Constants.CRATES) {
            String crate_name = crate.getDescriptionId().replace("block.compressedblocks.", "");
            String mc_name = CommonUtils.getMCName(crate_name);
            TextureMapping mapping = new TextureMapping().put(TextureSlot.ALL, ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/crate")).put(ITEM_SLOT, CommonUtils.getResourceLocation(mc_name)).put(NUMBER_SLOT, CommonUtils.getOverlay(crate.getDescriptionId()));
            ResourceLocation resourcelocation = TEMPLATE_CRATE.create(crate, mapping.copyAndUpdate(ITEM_SLOT, CommonUtils.getResourceLocation(mc_name)), blockModelGenerators.modelOutput);

            blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.multiVariant(crate, Variant.variant().with(VariantProperties.MODEL, resourcelocation)).with(createHorizontalFacingDispatch()));
            blockModelGenerators.registerSimpleItemModel(crate, ResourceLocation.fromNamespaceAndPath("compressedblocks", "block/" + crate_name));
        }
    }

    private static PropertyDispatch createHorizontalFacingDispatch() {
        return PropertyDispatch.property(BlockStateProperties.HORIZONTAL_FACING).select(Direction.EAST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).select(Direction.SOUTH, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)).select(Direction.WEST, Variant.variant().with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)).select(Direction.NORTH, Variant.variant());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
    }
}
