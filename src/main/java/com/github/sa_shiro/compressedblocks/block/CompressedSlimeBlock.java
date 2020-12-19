package com.github.sa_shiro.compressedblocks.block;


import com.github.sa_shiro.compressedblocks.event.DeferredRegistryEvent;
import com.github.sa_shiro.compressedblocks.event.RegisterBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

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
class CompressedSlimeBlock extends SlimeBlock implements ICompressedBlock {
    private final Compression comp = new Compression();

    /**
     * @param material Minecraft {@link Material}
     * @param materialColor Minecraft {@link MaterialColor}
     * @param sound Minecraft {@link SoundType}
     * @param compression  Compression Level ( 0 - 9 )
     */
    @ParametersAreNonnullByDefault
    protected CompressedSlimeBlock(Material material, MaterialColor materialColor, SoundType sound, int compression) {
        super(Properties.create(material, materialColor)
                .sound(sound)
                .hardnessAndResistance(0.5F)
                .harvestLevel(0)
                .variableOpacity()
                .slipperiness(0.85f)
        );
        comp.setCompressionLevel(compression);
    }

    @Override
    public void addInformation(@Nonnull ItemStack stack, @Nullable IBlockReader worldIn, @Nonnull List<ITextComponent> tooltip, @Nonnull ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new StringTextComponent(comp.blockCount + " Blocks").applyTextStyle(comp.textFormatting));
    }

    @Override
    public Block getBlock() {
        return this;
    }

    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        if (entityIn.isSneaking()) {
            super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
        } else {
            entityIn.fall(fallDistance, 0.0F);
        }
    }

    @Override
    public void onLanded(IBlockReader worldIn, Entity entityIn) {
        if (entityIn.isSneaking()) {
            super.onLanded(worldIn, entityIn);
        } else {
            Vec3d vec3d = entityIn.getMotion();
            if (vec3d.y < 0.0D) {
                double d0 = entityIn instanceof LivingEntity ? 1.0D : 0.8D;
                entityIn.setMotion(vec3d.x, -vec3d.y * d0, vec3d.z);
            }
        }
    }

    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
        double d0 = Math.abs(entityIn.getMotion().y);
        if (d0 < 0.1D && !entityIn.isSneaking()) {
            double d1 = 0.4D + d0 * 0.2D;
            entityIn.setMotion(entityIn.getMotion().mul(d1, 1.0D, d1));
        }
        super.onEntityWalk(worldIn, pos, entityIn);
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}
