package com.coreworldy.NewMineOrder.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class EntityCrusher extends BlockEntity {

    public EntityCrusher(BlockPos blockPos, BlockState blockState) {
        super(CrusherBlockEntityTypes.CRUSHER_BLOCK.get(),blockPos,blockState);
    }

    @Override
    protected void saveAdditional(CompoundTag nbt) {

        super.saveAdditional(nbt);
    }

    @Override
    public void load(CompoundTag nbt) {

        super.load(nbt);
    }

}

