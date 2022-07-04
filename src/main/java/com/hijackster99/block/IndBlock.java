package com.hijackster99.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class IndBlock extends Block {

	public IndBlock(String name, Material mat, float strength, float hardness, boolean requiresTool) {
		super(requiresTool ? Properties.of(mat).strength(strength, hardness).requiresCorrectToolForDrops() : Properties.of(mat).strength(strength, hardness));
		setRegistryName(name);
	}
	
	protected IndBlock(Properties prop)
	{
		super(prop);
	}

}
