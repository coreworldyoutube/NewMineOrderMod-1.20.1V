package com.coreworldy.NewMineOrder.regi;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.block.entity.CrusherBlockEntityTypes;
import com.coreworldy.NewMineOrder.gui.screen.CrusherScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NewMineOrder.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        blockScreenRegister();
    }
    public static void blockScreenRegister(){
        MenuScreens.register(CrusherBlockEntityTypes.CRUSHER_BLOCK.get(), CrusherScreen::new);
    }
}
