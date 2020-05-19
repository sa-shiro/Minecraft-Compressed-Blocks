package com.github.sa_shiro.compressedblocks;

import com.github.sa_shiro.compressedblocks.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("compressedblocks")
public class CompressedBlocks {
    public static final String MOD_ID = "compressedblocks";
    private static final Logger logger = LogManager.getLogger();

    public CompressedBlocks() {
        DistExecutor.runWhenOn(Dist.CLIENT, () -> () -> {
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRender);
        });
    }

    private void clientRender(final FMLClientSetupEvent event) {
        final RenderType TRANSLUCENT = RenderType.TRANSLUCENT;

        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_GRAVEL, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_RED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_REDSTONE_BLOCK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_SOUL_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_STONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIAMOND_BLOCK, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_GRAVEL, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_RED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_SOUL_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_STONE, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_GRAVEL, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_RED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_SOUL_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_STONE, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_RED_SAND, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_ANDESITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_DIORITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_GRANITE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_SAND, TRANSLUCENT);

        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_COBBLESTONE, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_DIRT, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_NETHERRACK, TRANSLUCENT);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_SAND, TRANSLUCENT);
    }
}
