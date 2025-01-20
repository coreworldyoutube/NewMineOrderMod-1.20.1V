package com.coreworldy.NewMineOrder.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;


public class BlockBerylliumOre extends DropExperienceBlock {
    public BlockBerylliumOre() {

        super(Properties.of().requiresCorrectToolForDrops().strength(3.0F, 650F).lightLevel((a)->6), UniformInt.of(7,14));
    }

}
