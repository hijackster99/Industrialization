package com.hijackster99.block;

import net.minecraft.world.level.material.Material;

public class IndOreBlock extends IndBlock {

	private float rarity;
	private int veinSize;
	
	public IndOreBlock(String name, Material mat, float strength, float hardness, boolean requiresTool, float rarity, int veinSize) {
		super(name, mat, strength, hardness, requiresTool);
		this.rarity = rarity;
		this.veinSize = veinSize;
	}
	
	protected IndOreBlock(Properties prop)
	{
		super(prop);
	}

	public int getVeinSize() {
		return veinSize;
	}

	public float getRarity() {
		return rarity;
	}

}
