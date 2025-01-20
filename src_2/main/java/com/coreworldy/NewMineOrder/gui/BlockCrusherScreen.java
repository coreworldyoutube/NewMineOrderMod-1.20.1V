package com.coreworldy.NewMineOrder.gui;

import net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen;
import net.minecraft.client.gui.screens.recipebook.SmeltingRecipeBookComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;


public class BlockCrusherScreen extends AbstractFurnaceScreen<BlockCrusherMenu> {
    private static final ResourceLocation NNMO_TEXTURE = new ResourceLocation("textures/gui/container/furnace.png");

    public BlockCrusherScreen(BlockCrusherScreen screen, Inventory inventory, Component componet) {
        super(screen, new SmeltingRecipeBookComponent(), inventory, componet, NNMO_TEXTURE);
    }
}
