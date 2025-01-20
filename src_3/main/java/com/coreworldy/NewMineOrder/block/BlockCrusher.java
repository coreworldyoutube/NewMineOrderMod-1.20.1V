package com.coreworldy.NewMineOrder.block;

import com.coreworldy.NewMineOrder.block.entity.EntityCrhsher;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class BlockCrusher extends BaseEntityBlock {
    public BlockCrusher() {
        super(Properties.of().strength(3.0F, 125F));
    }

    @Override
    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState blockState, boolean bool) {
        super.onRemove(state, world, pos, blockState, bool);
    }
    public RenderShape getRenderShape(BlockState p_49232_) {
        return RenderShape.MODEL;
    }

    @Nullable
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {

        return new EntityCrhsher(blockPos,blockState);
    }


}
