package com.coreworldy.NewMineOrder.block.ore;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class NewMineOrderOreBiomeModifier {
    public static final ResourceKey<BiomeModifier> NEWMINEORDER_ORE_KEY = createKey("beryllium_ore");
    public static void bootStrap(BootstapContext<BiomeModifier> context){
        HolderGetter<Biome> biome = context.lookup(Registries.BIOME);
        HolderGetter<PlacedFeature> placedFeature = context.lookup(Registries.PLACED_FEATURE);

        context.register(NEWMINEORDER_ORE_KEY, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biome.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeature.getOrThrow(NewMineOrderOrePlacedFeatures.NEWMINEORDER_ORE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
    public static ResourceKey<BiomeModifier> createKey(String name){
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(NewMineOrder.MOD_ID, name));
    }
}
