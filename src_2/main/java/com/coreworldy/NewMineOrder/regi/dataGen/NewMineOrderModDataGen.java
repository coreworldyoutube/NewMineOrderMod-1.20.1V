package com.coreworldy.NewMineOrder.regi.dataGen;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.block.ore.NewMineOrderOreGenSettings;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = NewMineOrder.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewMineOrderModDataGen {
    @SubscribeEvent
    public static void dataGen(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new NewMineOrderOreGenSettings(packOutput, lookupProvider));
    }
}
