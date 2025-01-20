package com.coreworldy.NewMineOrder.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.FurnaceMenu;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class EntityCrhsher extends AbstractFurnaceBlockEntity {
    public EntityCrhsher(BlockPos pos_one, BlockState state_ore) {
        super(BlockEntityType.FURNACE, pos_one, state_ore, RecipeType.Chokkin);
    }

    protected Component getDefaultName() {
        return Component.translatable("container.furnace");
    }

    protected AbstractContainerMenu createMenu(int iint, Inventory iinvent) {
        return new FurnaceMenu(iint, iinvent, this, this.dataAccess);
    }
}
