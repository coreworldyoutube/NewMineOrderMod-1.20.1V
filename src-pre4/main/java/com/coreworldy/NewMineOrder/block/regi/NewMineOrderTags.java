package com.coreworldy.NewMineOrder.block.regi;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class NewMineOrderTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MINEABLE_IRON = tag("needs_mineable_iron");

        private static TagKey<Block> tag(String inubashiri_momiji){
            return BlockTags.create(new ResourceLocation(NewMineOrder.MOD_ID,inubashiri_momiji));
        }

    }
    public static class Items{
        private static TagKey<Item> tag(String teraria){
            return ItemTags.create(new ResourceLocation(NewMineOrder.MOD_ID,teraria));
        }
    }
}

