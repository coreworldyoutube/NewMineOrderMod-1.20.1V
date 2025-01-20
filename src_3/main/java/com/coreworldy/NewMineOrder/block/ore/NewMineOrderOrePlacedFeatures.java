package com.coreworldy.NewMineOrder.block.ore;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class NewMineOrderOrePlacedFeatures {

    public static final ResourceKey<PlacedFeature> NEWMINEORDER_ORE_KEY = createKey("beryllium_ore");

    public static void bootStrap(BootstapContext<PlacedFeature> context){
        HolderGetter<ConfiguredFeature<?,?>> holderGetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?,?>> beryllium_ore = holderGetter.getOrThrow(NewMineOrderOreFeatureConfigurations.NEWMINEORDER_ORE_KEY);

        PlacementUtils.register(context, NEWMINEORDER_ORE_KEY, beryllium_ore, commonOrePlacement(12, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-64), VerticalAnchor.aboveBottom(80))));
    }
    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(NewMineOrder.MOD_ID, name));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
