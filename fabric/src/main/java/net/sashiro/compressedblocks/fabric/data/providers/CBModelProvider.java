package net.sashiro.compressedblocks.fabric.data.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.core.Direction;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.sashiro.compressedblocks.Constants;
import net.sashiro.compressedblocks.util.CommonUtils;
import org.jspecify.annotations.NonNull;

import java.util.Optional;

import static net.minecraft.client.data.models.BlockModelGenerators.X_ROT_90;
import static net.minecraft.client.data.models.BlockModelGenerators.Y_ROT_90;

public class CBModelProvider extends FabricModelProvider {
    public static final TextureSlot ITEM_SLOT = TextureSlot.create("item");
    public static final TextureSlot NUMBER_SLOT = TextureSlot.create("number");
    public static final TextureSlot OVERLAY_SLOT = TextureSlot.create("overlay");

    public static final ModelTemplate TEMPLATE_BLOCK = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath("compressedblocks", "block/template/template_block")), Optional.empty(), TextureSlot.ALL, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CUBE_COLUMN_HORIZONTAL = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath("compressedblocks", "block/template/template_cube_column_horizontal")), Optional.empty(), TextureSlot.END, TextureSlot.SIDE, TextureSlot.PARTICLE, OVERLAY_SLOT);
    public static final ModelTemplate TEMPLATE_CRATE = new ModelTemplate(Optional.of(Identifier.fromNamespaceAndPath("compressedblocks", "block/template/template_crate")), Optional.empty(), TextureSlot.ALL, ITEM_SLOT, NUMBER_SLOT);


    public CBModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
        for (Block block : Constants.BLOCKS) {
            String descriptionId = block.getDescriptionId();
            String block_name = descriptionId.replace("block.compressedblocks.", "");
            // exclude manually added resources
            if (CommonUtils.isBlock(descriptionId)) continue;

            // Check if the block is a rotational block
            if (CommonUtils.isRotational(descriptionId)) {
                Identifier side = CommonUtils.resolveVanillaBlockId(descriptionId);
                Identifier end = Identifier.fromNamespaceAndPath(side.getNamespace(), side.getPath() + "_top");

                if (descriptionId.contains("froglight") || descriptionId.contains("hay") || descriptionId.contains("melon") || descriptionId.contains("pumpkin")) {
                    side = Identifier.fromNamespaceAndPath("minecraft", side.getPath() + "_side");
                }

                TextureMapping mapping = new TextureMapping().put(TextureSlot.END, end).put(TextureSlot.SIDE, side).put(TextureSlot.PARTICLE, side).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));
                TextureMapping mapping_horizontal = new TextureMapping().put(TextureSlot.END, end).put(TextureSlot.SIDE, side).put(TextureSlot.PARTICLE, side).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));
                MultiVariant variant = BlockModelGenerators.plainVariant(TEMPLATE_CUBE_COLUMN.create(block, mapping, blockModelGenerators.modelOutput));
                MultiVariant horizontalVariant = BlockModelGenerators.plainVariant(TEMPLATE_CUBE_COLUMN_HORIZONTAL.createWithSuffix(block, "_horizontal", mapping_horizontal, blockModelGenerators.modelOutput));

                blockModelGenerators.registerSimpleItemModel(block, Identifier.fromNamespaceAndPath("compressedblocks", "block/" + block_name));
                blockModelGenerators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block).with(PropertyDispatch.initial(BlockStateProperties.AXIS).select(Direction.Axis.Y, variant).select(Direction.Axis.Z, horizontalVariant.with(X_ROT_90)).select(Direction.Axis.X, horizontalVariant.with(X_ROT_90).with(Y_ROT_90))));

            }
            // If the block is not rotational then create a simple block model
            else {
                TextureMapping mapping = new TextureMapping().put(TextureSlot.ALL, CommonUtils.resolveVanillaBlockId(descriptionId)).put(OVERLAY_SLOT, CommonUtils.getOverlay(descriptionId));
                Identifier blockModel = TEMPLATE_BLOCK.create(block, mapping, blockModelGenerators.modelOutput);

                blockModelGenerators.registerSimpleItemModel(block, Identifier.fromNamespaceAndPath("compressedblocks", "block/" + block_name));
                blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, BlockModelGenerators.plainVariant(blockModel)));
            }
        }
        for (Block crate : Constants.CRATES) {
            String crate_name = crate.getDescriptionId().replace("block.compressedblocks.", "");
            String mc_name = CommonUtils.getMCName(crate_name);
            TexturedModel.Provider provider = TexturedModel.createDefault(block -> customColumn(block, mc_name), TEMPLATE_CRATE);

            blockModelGenerators.createHorizontallyRotatedBlock(crate, provider);
        }
    }

    private TextureMapping customColumn(Block block, String name) {
        return new TextureMapping().put(TextureSlot.ALL, Identifier.fromNamespaceAndPath("compressedblocks", "block/crate")).put(ITEM_SLOT, CommonUtils.getIdentifier(name)).put(NUMBER_SLOT, CommonUtils.getOverlay(block.getDescriptionId()));
    }

    @Override
    public void generateItemModels(@NonNull ItemModelGenerators itemModelGenerators) {
    }
}
