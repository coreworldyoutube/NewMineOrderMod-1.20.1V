package com.coreworldy.NewMineOrder.regi.tab;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.regi.NewMineOrderItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class NewMineOrderTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewMineOrder.MOD_ID);
    public static final RegistryObject<CreativeModeTab> NEWMINEORDER = MOD_TABS.register("newmineorder_tab",
            ()-> {return CreativeModeTab.builder()
                    .icon(()->new ItemStack(NewMineOrderItems.BERYLLIUM_RAW.get()))
                    .title(Component.translatable("newmineorder_group.newmineorder"))
                    //.withTabsBefore(NewMineOrderTabs.NEWMINEORDER.getId())
                    //邪魔とかしらねぇよ
                    .displayItems((param,output)->{
                        for(Item item:NewMineOrderMain.items){
                            output.accept(item);
                        }
                    })
                    .build();
    });
}
