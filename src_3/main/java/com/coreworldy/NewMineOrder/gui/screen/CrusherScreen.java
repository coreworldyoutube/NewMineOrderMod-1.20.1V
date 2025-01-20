package com.coreworldy.NewMineOrder.gui.screen;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.gui.container.CrusherBlockMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class CrusherScreen extends AbstractContainerScreen<CrusherBlockMenu> {
    private static final ResourceLocation CRUSHER_TEXTURE = new ResourceLocation(NewMineOrder.MOD_ID, "textures/gui/container/crush_table.png");
    public CrusherScreen(CrusherBlockMenu crusherBlockMenu, Inventory inventory, Component component) {
        super(crusherBlockMenu, inventory, component);
    }

    protected void renderBg(GuiGraphics guiGraphics, float f, int w, int h) {
        int setW = (this.width - this.imageWidth)/2;
        int setH = (this.height - this.imageHeight)/2;
        guiGraphics.blit(CRUSHER_TEXTURE, setW,setH,0,0,this.imageWidth,this.imageHeight);
    }
}
