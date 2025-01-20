package com.coreworldy.NewMineOrder.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;

public class BlockMagnetiteOre extends DropExperienceBlock {
    public BlockMagnetiteOre() {
        super(Properties.of().requiresCorrectToolForDrops().strength(3.0F, 700F).sound(SoundType.NETHER_GOLD_ORE).lightLevel((a)->3), UniformInt.of(12,15));
    }

}
