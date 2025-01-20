package com.coreworldy.NewMineOrder.block.entity;

import com.coreworldy.NewMineOrder.Main.NewMineOrder;
import com.coreworldy.NewMineOrder.regi.NewMineOrderBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CrusherBlockEntityTypes {


    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, NewMineOrder.MOD_ID);
    public static final RegistryObject<BlockEntityType<EntityCrusher>> CRUSHER_BLOCK = BLOCK_ENTITY_TYPES.register("crusher_block", ()->set(EntityCrusher::new, NewMineOrderBlocks.Blocks.CRUSHER_BLOCK.get()));
    private static <T extends BlockEntity> BlockEntityType<T> set (BlockEntityType.BlockEntitySupplier<T> entity, Block block){
        return BlockEntityType.Builder.of(entity, block).build(null);
    }

}
