package com.coreworldy.NewMineOrder.Main;

import com.coreworldy.NewMineOrder.block.entity.CrusherBlockEntityTypes;
import com.coreworldy.NewMineOrder.regi.NewMineOrderBlocks;
import com.coreworldy.NewMineOrder.regi.NewMineOrderItems;
import com.coreworldy.NewMineOrder.regi.tab.NewMineOrderTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("newmineorder")
public class NewMineOrder {
    public static final String MOD_ID = "newmineorder";

    public NewMineOrder(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        System.out.println("Initializing NewMineOrder Mod...");
        NewMineOrderItems.ITEMS.register(bus);
        NewMineOrderBlocks.Blocks.BLOCKS.register(bus);
        NewMineOrderBlocks.BlockItems.BLOCK_ITEMS.register(bus);
        CrusherBlockEntityTypes.BLOCK_ENTITY_TYPES.register(bus);
        NewMineOrderTabs.MOD_TABS.register(bus);
        System.out.println("NewMineOrder Mod Initialized.");
    }
}
