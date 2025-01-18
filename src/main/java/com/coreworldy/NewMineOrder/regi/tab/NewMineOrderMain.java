package com.coreworldy.NewMineOrder.regi.tab;

import com.coreworldy.NewMineOrder.item.ItemBerylliumRaw;
import com.coreworldy.NewMineOrder.regi.NewMineOrderBlocks;
import com.coreworldy.NewMineOrder.regi.NewMineOrderItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class NewMineOrderMain {
    public static final Item[] items = {
            NewMineOrderItems.BERYLLIUM_RAW.get(),
            NewMineOrderBlocks.BlockItems.BERYLLIUM_ORE.get(),
            NewMineOrderBlocks.BlockItems.BERYLLIUM_DEEPSLATE_ORE.get(),
            NewMineOrderBlocks.BlockItems.TUNGSTEN_ORE.get(),
            NewMineOrderItems.BERYLLIUM_NUGGET.get(),
            NewMineOrderItems.TUNGSTEN_RAW.get(),
            NewMineOrderItems.TUNGSTEN_INGOT.get()
    };
}
