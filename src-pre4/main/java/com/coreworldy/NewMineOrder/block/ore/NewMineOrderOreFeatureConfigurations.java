package com.coreworldy.NewMineOrder.block.ore;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.regi.NewMineOrderBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class NewMineOrderOreFeatureConfigurations {
    public static final ResourceKey<ConfiguredFeature<?,?>> NEWMINEORDER_ORE_KEY = createKey("newmineorder_ore");
    public static void bootstrap(BootstapContext<ConfiguredFeature<?,?>> context){
        RuleTest stone = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslate = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> newmineorder_ore_list = List.of(
                OreConfiguration.target(stone, NewMineOrderBlocks.Blocks.BERYLLIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslate, NewMineOrderBlocks.Blocks.BERYLLIUM_DEEPSLATE_ORE.get().defaultBlockState())
        );

        FeatureUtils.register(context, NEWMINEORDER_ORE_KEY, Feature.ORE, new OreConfiguration(newmineorder_ore_list, 9, 0.75F));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(NewMineOrder.MOD_ID, name));
    }
}
