package com.coreworldy.NewMineOrder.gui.container;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;

public class CrusherBlockMenu extends AbstractContainerMenu {

    private final Container container;
    private final ContainerData data;
    public CrusherBlockMenu(int a, Inventory inventory, Container container, Container container1, ContainerData data) {
        super(null,a);
        this.container = container1;
        this.data = data;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    public ContainerData getData() {
        return data;
    }
}
