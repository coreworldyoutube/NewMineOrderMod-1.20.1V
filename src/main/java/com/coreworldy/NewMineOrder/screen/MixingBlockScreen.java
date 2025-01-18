package com.coreworldy.NewMineOrder.screen;

import com.coreworldy.NewMineOrder.menu.MixingBlockMenu;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.ResourceLocation;

public class MixingBlockScreen extends AbstractContainerScreen<MixingBlockMenu> {
    private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation("your_mod_id", "textures/gui/mixing_block.png");

    public MixingBlockScreen(MixingBlockMenu menu, Inventory inv, Component title) {
        super(menu, inv, title);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTicks, int mouseX, int mouseY) {
        // 背景テクスチャの描画
        Minecraft.getInstance().getTextureManager().bind(BACKGROUND_TEXTURE);
        blit(poseStack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, partialTicks);
        this.renderTooltip(poseStack, mouseX, mouseY);
    }
}
