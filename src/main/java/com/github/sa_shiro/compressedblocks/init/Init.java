package com.github.sa_shiro.compressedblocks.init;

import com.github.sa_shiro.compressedblocks.blocks.CompressedBlockList;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Init {
    private static final RenderType rendertype = RenderType.translucent();
    public static ItemGroup compressedGroup = new ItemGroup("compressed_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(CompressedBlockList.Single.COMPRESSED_STONE);
        }

        @Override
        public boolean hasScrollbar() {
            return true;
        }
    };

    public void init() {
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Single.COMPRESSED_STONE, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Double.DOUBLE_COMPRESSED_STONE, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_GRAVEL, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_REDSTONE_BLOCK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_SOUL_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Triple.TRIPLE_COMPRESSED_STONE, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_RED_SAND, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quad.QUADRUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Quin.QUINTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_ANDESITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIORITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_GRANITE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sext.SEXTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Sept.SEPTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Oct.OCTUPLE_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Mega.MEGA_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Mega.MEGA_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Mega.MEGA_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Mega.MEGA_COMPRESSED_SAND, rendertype);

        RenderTypeLookup.setRenderLayer(CompressedBlockList.Giga.GIGA_COMPRESSED_COBBLESTONE, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Giga.GIGA_COMPRESSED_DIRT, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Giga.GIGA_COMPRESSED_NETHERRACK, rendertype);
        RenderTypeLookup.setRenderLayer(CompressedBlockList.Giga.GIGA_COMPRESSED_SAND, rendertype);
    }
}
