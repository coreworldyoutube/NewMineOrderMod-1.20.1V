package com.coreworldy.NewMineOrder.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class MixingBlockMenu extends AbstractContainerMenu {
    private final ContainerLevelAccess access;

    public MixingBlockMenu(int id, Inventory playerInventory, ContainerLevelAccess access) {
        super(/* MenuTypeを後で登録 */, id);
        this.access = access;

        // プレイヤーインベントリのスロットを追加
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlot(new Slot(playerInventory, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));
            }
        }
        for (int col = 0; col < 9; ++col) {
            this.addSlot(new Slot(playerInventory, col, 8 + col * 18, 142));
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return this.access.evaluate((level, pos) -> true, true); // 条件を適切に設定
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        // シフトクリック時の挙動を実装
        return ItemStack.EMPTY;
    }
}