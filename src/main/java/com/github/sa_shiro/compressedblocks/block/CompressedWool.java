package com.github.sa_shiro.compressedblocks.block;


import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import com.github.sa_shiro.compressedblocks.event.RegisterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
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
 * For an example, see {@link DeferredRegistryEvent}
 */
class CompressedWool extends Block implements ICompressedBlock {
    private final Compression comp = new Compression();

    /**
     * @param material      Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param sound         Minecraft {@link SoundType}
     * @param compression   Compression Level ( 0 - 9 )
     */
    @ParametersAreNonnullByDefault
    protected CompressedWool(Material material, MaterialColor materialColor, SoundType sound, int compression) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(5.0f)
                .harvestLevel(0)
                .variableOpacity()
        );
        comp.setCompressionLevel(compression);
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
