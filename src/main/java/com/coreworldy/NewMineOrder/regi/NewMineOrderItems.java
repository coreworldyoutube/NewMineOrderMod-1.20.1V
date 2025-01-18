package com.coreworldy.NewMineOrder.regi;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.item.ItemBerylliumRaw;
import com.coreworldy.NewMineOrder.item.ItemTungstenIngot;
import com.coreworldy.NewMineOrder.item.ItemTungstenRaw;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewMineOrderItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NewMineOrder.MOD_ID);

    public static final RegistryObject<Item> BERYLLIUM_RAW = ITEMS.register("beryllium_raw", ItemBerylliumRaw::new);
    public static final RegistryObject<Item> BERYLLIUM_NUGGET = ITEMS.register("beryllium_nugget", ItemBerylliumRaw::new);
    public static final RegistryObject<Item> TUNGSTEN_RAW = ITEMS.register("tungsten_raw", ItemTungstenRaw::new);
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemTungstenIngot::new);

}
