package com.coreworldy.NewMineOrder.item.crafting;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;

public class NewMinerOrderRecipeType {
    RecipeType<Chokkin> CRAFTING = register("chokkin");
    static <T extends Recipe<?>> RecipeType<T> register(final String recipenames) {
        return (RecipeType) Registry.register(BuiltInRegistries.RECIPE_TYPE, new ResourceLocation(recipenames), new RecipeType<T>() {
            public String toString() {
                return recipenames;
            }
        });
    }

}
