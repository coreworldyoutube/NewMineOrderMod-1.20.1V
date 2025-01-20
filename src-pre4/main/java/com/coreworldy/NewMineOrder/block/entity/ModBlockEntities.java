package com.coreworldy.NewMineOrder.block.entity;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NewMineOrder.MOD_ID);

    public static final RegistryObject<BlockEntityType<BlockCrusherBlockEntity>> BLOCK_CRUSHER_BE =
            BLOCK_ENTITIES.register("block_crusher_be", () ->
                    BlockEntityType.Builder.of(BlockCrusherBlockEntity::new,
                            NewMineOrder.BLOCK_CRUSHER.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            NewMineOrder.PINE_SIGN.get(), ModBlocks.PINE_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            NewMineOrder.PINE_HANGING_SIGN.get(), NewMineOrder.PINE_WALL_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
