package com.hijackster99.core;

import com.hijackster99.block.IndBlock;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(References.MODID)
public class Industrialization {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			//Iron
			IndBlock hematite = new IndBlock("ore_hematite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock magnetite = new IndBlock("ore_magnetite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock limonite = new IndBlock("ore_limonite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock siderite = new IndBlock("ore_siderite", Material.STONE, 1.5f, 6.0f, true);
			//Copper
			IndBlock nativeCopper = new IndBlock("ore_native_copper", Material.STONE, 1.5f, 6.0f, true);
			IndBlock malachite = new IndBlock("ore_malachite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock azurite = new IndBlock("ore_azurite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock cuprite = new IndBlock("ore_cuprite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock chalcocite = new IndBlock("ore_chalcocite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock chalcopyrite = new IndBlock("ore_chalcopyrite", Material.STONE, 1.5f, 6.0f, true);
			//Tin
			IndBlock cassiterite = new IndBlock("ore_cassiterite", Material.STONE, 1.5f, 6.0f, true);
			//Zinc
			IndBlock calamine = new IndBlock("ore_calamine", Material.STONE, 1.5f, 6.0f, true);
			IndBlock sphalerite = new IndBlock("ore_sphalerite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock zincite = new IndBlock("ore_zincite", Material.STONE, 1.5f, 6.0f, true);
			//Gold
			IndBlock nativeGold = new IndBlock("ore_native_gold", Material.STONE, 1.5f, 6.0f, true);
			//Silver
			IndBlock nativeSilver = new IndBlock("ore_native_silver", Material.STONE, 1.5f, 6.0f, true);
			IndBlock argentite = new IndBlock("ore_argentite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock tetrahedrite = new IndBlock("ore_tetrahedrite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock argentiferousGalena = new IndBlock("ore_argentiferous_galena", Material.STONE, 1.5f, 6.0f, true);
			//Lead
			IndBlock galena = new IndBlock("ore_galena", Material.STONE, 1.5f, 6.0f, true);
			IndBlock cerrusite = new IndBlock("ore_cerrusite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock anglesite = new IndBlock("ore_anglesite", Material.STONE, 1.5f, 6.0f, true);
			//Aluminum
			IndBlock bauxite = new IndBlock("ore_bauxite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock kaolinite = new IndBlock("ore_kaolinite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock alunite = new IndBlock("ore_alunite", Material.STONE, 1.5f, 6.0f, true);
			//Coal
			IndBlock anthracite = new IndBlock("ore_anthracite", Material.STONE, 1.5f, 6.0f, true);
			IndBlock bituminous = new IndBlock("ore_bituminous", Material.STONE, 1.5f, 6.0f, true);
			IndBlock subbituminous = new IndBlock("ore_subbituminous", Material.STONE, 1.5f, 6.0f, true);
			IndBlock lignite = new IndBlock("ore_lignite", Material.STONE, 1.5f, 6.0f, true);
			//Uranium
			IndBlock uraninite = new IndBlock("ore_uraninite", Material.STONE, 1.5f, 6.0f, true);
			
			
			
			event.getRegistry().registerAll(hematite, magnetite, limonite, siderite, nativeCopper, malachite, azurite, cuprite, chalcocite,
											chalcopyrite, cassiterite, calamine, sphalerite, zincite, nativeGold, nativeSilver, argentite,
											tetrahedrite, argentiferousGalena, galena, cerrusite, anglesite, bauxite, kaolinite, alunite,
											anthracite, bituminous, subbituminous, lignite, uraninite);
		}
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			
		}
		
	}
	
}
