package com.coreworldy.NewMineOrder.regi;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.block.BlockBerylliumDeepslateOre;
import com.coreworldy.NewMineOrder.block.BlockBerylliumOre;
import com.coreworldy.NewMineOrder.block.BlockTungstenOre;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NewMineOrderBlocks {
    public static class Blocks{

        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NewMineOrder.MOD_ID);
        public static final RegistryObject<Block> TUNGSTEN_ORE = BLOCKS.register("tungsten_ore", BlockTungstenOre::new);
        public static final RegistryObject<Block> BERYLLIUM_ORE = BLOCKS.register("beryllium_ore", BlockBerylliumOre::new);
        public static final RegistryObject<Block> BERYLLIUM_DEEPSLATE_ORE = BLOCKS.register("beryllium_deepslate_ore", BlockBerylliumDeepslateOre::new);

    }
    public static class BlockItems{
        public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NewMineOrder.MOD_ID);
        public static final RegistryObject<Item> TUNGSTEN_ORE = BLOCK_ITEMS.register("tungsten_ore"
                , ()-> new BlockItem(Blocks.TUNGSTEN_ORE.get(), new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM_ORE = BLOCK_ITEMS.register("beryllium_ore"
                , ()-> new BlockItem(Blocks.BERYLLIUM_ORE.get(), new Item.Properties()));

        public static final RegistryObject<Item> BERYLLIUM_DEEPSLATE_ORE = BLOCK_ITEMS.register("beryllium_deepslate_ore"
                , ()-> new BlockItem(Blocks.BERYLLIUM_DEEPSLATE_ORE.get(), new Item.Properties()));
    }
}
