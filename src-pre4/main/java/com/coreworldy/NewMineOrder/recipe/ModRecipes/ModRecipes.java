package com.coreworldy.NewMineOrder.recipe.ModRecipes;


import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.block.BlockCrusher;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, NewMineOrder.MOD_ID);

    public static final RegistryObject<RecipeSerializer<BlockCrusher>> GEM_POLISHING_SERIALIZER =
            SERIALIZERS.register("gem_polishing", () -> BlockCrusher.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}