package com.coreworldy.NewMineOrder.regi;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.item.*;
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
    public static final RegistryObject<Item> BERYLLIUM_COPPER_ALLOY = ITEMS.register("beryllium_copper_alloy", ItemBerylliumCopperAlloy::new);
    public static final RegistryObject<Item> COPPER_MIXING_BERYLLIUM_ITEM = ITEMS.register("copper_mixing_beryllium_item", ItemCopperMixingBerylliumItem::new);
    public static final RegistryObject<Item> CARBON_TUNGSTEN_ALLOY = ITEMS.register("carbon_tungsten_alloy", ItemCarbonTungstenAlloy::new);
    public static final RegistryObject<Item> TITANIUM_RAW = ITEMS.register("titanium_raw", ItemTitaniumRaw::new);
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", ItemTitaniumRaw::new);



}
