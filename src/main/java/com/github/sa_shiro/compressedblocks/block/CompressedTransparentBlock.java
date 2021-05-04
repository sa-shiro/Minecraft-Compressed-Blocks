package com.github.sa_shiro.compressedblocks.block;

import com.github.sa_shiro.compressedblocks.event.RegisterBlock;
import com.github.sa_shiro.compressedblocks.event.RegistryEvent;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

/**
 * This class is not intended for the creation of custom Compressed Blocks.<br>
 * Create your own Block class and extend {@link ICompressedBlock} or use {@link CompressedBlock#createBlock}.<br>
 * You can register your custom compressed blocks using {@link RegisterBlock#registerNewBlock}.<br>
 * For an example, see {@link RegistryEvent}
 */
class CompressedTransparentBlock extends GlassBlock implements ICompressedBlock {
    private final Compression comp = new Compression();

    /**
     * @param compression Compression Level ( 0 - 9 )
     */
    @ParametersAreNonnullByDefault
    protected CompressedTransparentBlock(int compression) {
        super(Properties.create(Material.GLASS, MaterialColor.AIR)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(0.3F)
                .harvestLevel(0)
                .variableOpacity()
                .notSolid()
                .setOpaque(CompressedTransparentBlock::isNotTransparent)
                .setSuffocates(CompressedTransparentBlock::isNotTransparent)
                .setBlocksVision(CompressedTransparentBlock::isNotTransparent)
        );
        comp.setCompressionLevel(compression);
    }

    private static boolean isNotTransparent(BlockState s, IBlockReader r, BlockPos b) {
        return false;
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(comp.blockCount + " Blocks").setStyle(comp.style));
    }

    @Override
    public Block getBlock() {
        return this;
    }
}