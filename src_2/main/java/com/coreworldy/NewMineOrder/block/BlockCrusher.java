package com.coreworldy.NewMineOrder.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class BlockCrusher extends AbstractFurnaceBlock {
    public BlockCrusher() {
        super(Properties.of().strength(3.0F, 125F));
    }
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return null;
    }
    @Nullable
    @Override
}
