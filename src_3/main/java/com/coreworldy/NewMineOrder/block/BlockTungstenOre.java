package com.coreworldy.NewMineOrder.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;

public class BlockTungstenOre extends DropExperienceBlock {
    public BlockTungstenOre() {

        super(Properties.of().requiresCorrectToolForDrops().strength(4.0F, 1250F).lightLevel((a)->6), UniformInt.of(7,14));
    }

}
