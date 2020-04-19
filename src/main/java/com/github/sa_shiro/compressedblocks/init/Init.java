package com.github.sa_shiro.compressedblocks.init;

import com.github.sa_shiro.compressedblocks.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Init {
    private static final RenderType rendertype = RenderType.getTranslucent();
    public static ItemGroup compressedGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.Single.COMPRESSED_STONE);
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };

    public void init() {
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_STONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Single.COMPRESSED_DIAMOND_BLOCK, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Double.DOUBLE_COMPRESSED_STONE, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Triple.TRIPLE_COMPRESSED_STONE, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quad.QUADRUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Quin.QUINTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sext.SEXTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Sept.SEPTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Oct.OCTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Mega.MEGA_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(Blocks.Giga.GIGA_COMPRESSED_SAND, rendertype);
    }
}
