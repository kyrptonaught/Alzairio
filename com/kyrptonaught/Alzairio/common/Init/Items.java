package com.kyrptonaught.Alzairio.common.Init;

import com.kyrptonaught.Alzairio.common.Items.ItemAlzairianIngot;
import com.kyrptonaught.Alzairio.common.Items.ItemAlzairioSword;
import com.kyrptonaught.Alzairio.common.Items.ItemBoots;
import com.kyrptonaught.Alzairio.common.Items.ItemBucketAcid;
import com.kyrptonaught.Alzairio.common.Items.ItemChest;
import com.kyrptonaught.Alzairio.common.Items.ItemDigWand;
import com.kyrptonaught.Alzairio.common.Items.ItemHelmet;
import com.kyrptonaught.Alzairio.common.Items.ItemJetPack;
import com.kyrptonaught.Alzairio.common.Items.ItemLeggings;
import com.kyrptonaught.Alzairio.common.Items.Itemlightning;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.client.EnumHelperClient;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
public class Items {


	public static Item lightning;
	public static Item JetPack;
	public static Item Boots;
	public static Item Sword;
	public static Item Helmet;
	public static Item AlzairianIngot;
	public static Item Leggings;
	public static Item Chest;
	public static Item DigWand;
	public static Item Sword2;
	public static Item Bow;
	public static Item Arrow;
	public static Item Bucket;
	public static EnumArmorMaterial Alzairio =EnumHelperClient.addArmorMaterial("Alzairio", 13, new int[]{10,10,10,10}, 15);
	public static EnumToolMaterial AlzairioTool =EnumHelperClient.addToolMaterial("Alzairio2", 5, 6, 2, 35, 2); 	
	public static EnumToolMaterial AlzarioSpecial = EnumHelperClient.addToolMaterial("Alzairio3", 5, 6, 2, 0, 2);

	public static void init(){

		lightning = new Itemlightning(3017).setUnlocalizedName("lightning");
		GameRegistry.registerItem(lightning,"lightning");
		LanguageRegistry.addName(lightning,"Lightning Wand");

		JetPack = new ItemJetPack(3019, Alzairio, 4, 1).setUnlocalizedName("JetPack");
		GameRegistry.registerItem(JetPack,"JetPack");
		LanguageRegistry.addName(JetPack,"JetPack");

		Sword = new ItemAlzairioSword(3021, AlzairioTool, 1).setUnlocalizedName("Sword");
		GameRegistry.registerItem(Sword, "Sword");
		LanguageRegistry.addName(Sword,"Alzairian Sword");

		AlzairianIngot = new ItemAlzairianIngot(3023).setUnlocalizedName("AlzairianIngot");
		GameRegistry.registerItem(AlzairianIngot,"AlzairianIngot");
		LanguageRegistry.addName(AlzairianIngot,"Alzairian Ingot");

		Boots = new ItemBoots(3031,Alzairio,4,3).setUnlocalizedName("Boots");
		GameRegistry.registerItem(Boots,"Boots");
		LanguageRegistry.addName(Boots, "Speedy Gonzalis Boots");

		Helmet = new ItemHelmet(3032,Alzairio,4,0).setUnlocalizedName("Helmet");
		GameRegistry.registerItem(Helmet,"Helmet");
		LanguageRegistry.addName(Helmet, "Alzairian Helmet");

		Leggings = new ItemLeggings(3033,Alzairio,4,2).setUnlocalizedName("Leggings");
		GameRegistry.registerItem(Leggings, "Leggings");
		LanguageRegistry.addName(Leggings,"Alzairian Leggings");

		Chest = new ItemChest(3034,Alzairio,4,1).setUnlocalizedName("Chest");
		GameRegistry.registerItem(Chest,"Chest");
		LanguageRegistry.addName(Chest, "Alzairian Plate");

		DigWand = new ItemDigWand(3028, AlzarioSpecial).setUnlocalizedName("DigWand");
		GameRegistry.registerItem(DigWand, "DigWand");
		LanguageRegistry.addName(DigWand, "Alzairian Shovel");

		Bucket = new ItemBucketAcid(3029).setUnlocalizedName("Bucket");
		GameRegistry.registerItem(Bucket, "Bucket");
		LanguageRegistry.addName(Bucket, "Bucket of Acid");

		Sword2 = new ItemAlzairioSword(3030, AlzarioSpecial,2).setUnlocalizedName("Sword2");
		GameRegistry.registerItem(Sword2, "Sword2");
		LanguageRegistry.addName(Sword2, "Dagger of Flight");
	}
}
