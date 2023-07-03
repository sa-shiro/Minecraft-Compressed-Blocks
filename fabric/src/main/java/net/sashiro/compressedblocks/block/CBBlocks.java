package net.sashiro.compressedblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import static net.sashiro.compressedblocks.Constants.HARDNESS;
import static net.sashiro.compressedblocks.Constants.RESISTANCE;

public class CBBlocks {
    
    // DIRT
    public static final CompressedBlock.CustomDefaultBlock DIRT_0 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CompressedBlock.CustomDefaultBlock DIRT_1 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CompressedBlock.CustomDefaultBlock DIRT_2 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CompressedBlock.CustomDefaultBlock DIRT_3 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CompressedBlock.CustomDefaultBlock DIRT_4 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CompressedBlock.CustomDefaultBlock DIRT_5 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CompressedBlock.CustomDefaultBlock DIRT_6 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CompressedBlock.CustomDefaultBlock DIRT_7 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CompressedBlock.CustomDefaultBlock DIRT_8 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CompressedBlock.CustomDefaultBlock DIRT_9 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // COBBLESTONE
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_0 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_1 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_2 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_3 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_4 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_5 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_6 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_7 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_8 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CompressedBlock.CustomDefaultBlock COBBLESTONE_9 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    // STONE
    public static final CompressedBlock.CustomDefaultBlock STONE_0 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[2], RESISTANCE[0]), 0);
    public static final CompressedBlock.CustomDefaultBlock STONE_1 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[2], RESISTANCE[0]), 1);
    public static final CompressedBlock.CustomDefaultBlock STONE_2 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[3], RESISTANCE[1]), 2);
    public static final CompressedBlock.CustomDefaultBlock STONE_3 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[3], RESISTANCE[1]), 3);
    public static final CompressedBlock.CustomDefaultBlock STONE_4 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[4], RESISTANCE[2]), 4);
    public static final CompressedBlock.CustomDefaultBlock STONE_5 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[4], RESISTANCE[2]), 5);
    public static final CompressedBlock.CustomDefaultBlock STONE_6 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[5], RESISTANCE[3]), 6);
    public static final CompressedBlock.CustomDefaultBlock STONE_7 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[5], RESISTANCE[3]), 7);
    public static final CompressedBlock.CustomDefaultBlock STONE_8 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[6], RESISTANCE[4]), 8);
    public static final CompressedBlock.CustomDefaultBlock STONE_9 = new CompressedBlock.CustomDefaultBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(HARDNESS[6], RESISTANCE[4]), 9);
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return true;
    }
    
    private static boolean isTrue(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return true;
    }
}
