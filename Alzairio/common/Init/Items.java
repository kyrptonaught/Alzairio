package Alzairio.common.Init;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import Alzairio.common.Items.ItemAlzairianIngot;
import Alzairio.common.Items.ItemAlzairioSword;
import Alzairio.common.Items.ItemBoots;
import Alzairio.common.Items.ItemChest;
import Alzairio.common.Items.ItemCrumIngot;
import Alzairio.common.Items.ItemDigWand;
import Alzairio.common.Items.ItemHelmet;
import Alzairio.common.Items.ItemJetPack;
import Alzairio.common.Items.ItemLeggings;
import Alzairio.common.Items.Itemlightning;
import Alzairio.common.Items.ItemsMetaWand;
import Alzairio.common.LandBoat.ItemLandBoat;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
public class Items {

	
	public static Item lightning;
	public static Item LandBoat;
	public static Item JetPack;
	public static Item Boots;
	public static Item Sword;
	public static Item Helmet;
	public static Item AlzairianIngot;
	public static Item CrumIngot;
	public static Item Leggings;
	public static Item Chest;
	public static Item DigWand;
	public static Item MetaWand;
	public static Item Sword2;
	
	public static EnumArmorMaterial Alzairio = EnumArmorMaterial.DIAMOND;
	public static EnumToolMaterial AlzairioTool = EnumToolMaterial.EMERALD;
	public static EnumToolMaterial AlzarioSpecial = EnumToolMaterial.EMERALD;

	/*public static EnumArmorMaterial Alzairio = EnumHelperClient.addArmorMaterial("Alzairio", 13, new int[]{10,10,10,10}, 15);
	public static EnumToolMaterial AlzairioTool =EnumHelperClient.addToolMaterial("Alzairio2", 5, 6, 2, 35, 2); 	
	public static EnumToolMaterial AlzarioSpecial = EnumHelperClient.addToolMaterial("Alzairio3", 5, 6, 2, 0, 2);
	 */	public static void init(){
		
		 lightning = new Itemlightning(3017).setUnlocalizedName("lightning");
		 GameRegistry.registerItem(lightning,"lightning");
		 LanguageRegistry.addName(lightning,"Lightning Wand");

		 LandBoat = new ItemLandBoat(3018).setUnlocalizedName("LandBoat");
		 GameRegistry.registerItem(LandBoat,"LandBoat");
		 LanguageRegistry.addName(LandBoat, "LandBoat CRASHES");

		 JetPack = new ItemJetPack(3019, Alzairio, 4, 1).setUnlocalizedName("JetPack");
		 GameRegistry.registerItem(JetPack,"JetPack");
		 LanguageRegistry.addName(JetPack,"JetPack");

		 Boots = new ItemBoots(3020,Alzairio,4,3).setUnlocalizedName("Boots");
		 GameRegistry.registerItem(Boots,"Boots");
		 LanguageRegistry.addName(Boots, "Speedy Gonzalis Boots");

		 Sword = new ItemAlzairioSword(3021, AlzairioTool, 1).setUnlocalizedName("Sword");
		 GameRegistry.registerItem(Sword, "Sword");
		 LanguageRegistry.addName(Sword,"Alzairian Sword");

		 Helmet = new ItemHelmet(3022,Alzairio,4,0).setUnlocalizedName("Helmet");
		 GameRegistry.registerItem(Helmet,"Helmet");
		 LanguageRegistry.addName(Helmet, "Alzairian Helmet");

		 AlzairianIngot = new ItemAlzairianIngot(3023).setUnlocalizedName("AlzairianIngot");
		 GameRegistry.registerItem(AlzairianIngot,"AlzairianIngot");
		 LanguageRegistry.addName(AlzairianIngot,"Alzairian Ingot");

		 CrumIngot = new ItemCrumIngot(3024).setUnlocalizedName("CrumIngot");
		 GameRegistry.registerItem(CrumIngot,"CrumIngot");
		 LanguageRegistry.addName(CrumIngot, "Crum Ingot");

		 Leggings = new ItemLeggings(3025,Alzairio,4,2).setUnlocalizedName("Leggings");
		 GameRegistry.registerItem(Leggings, "Leggings");
		 LanguageRegistry.addName(Leggings,"Alzairian Leggings");

		 Chest = new ItemChest(3026,Alzairio,4,1).setUnlocalizedName("Chest");
		 GameRegistry.registerItem(Chest,"Chest");
		 LanguageRegistry.addName(Chest, "Alzairian Plate");

		
		 DigWand = new ItemDigWand(3028).setUnlocalizedName("DigWand");
		 GameRegistry.registerItem(DigWand, "DigWand");
		 LanguageRegistry.addName(DigWand, "Dig Wand (Name WIP)");

		 MetaWand = new ItemsMetaWand(3029).setUnlocalizedName("MetaWand");
		 GameRegistry.registerItem(MetaWand, "MetaWand");
		 LanguageRegistry.addName(MetaWand, "Meta Wand");

		 Sword2 = new ItemAlzairioSword(3030, AlzarioSpecial,2).setUnlocalizedName("Sword2");
		 GameRegistry.registerItem(Sword2, "Sword2");
		 LanguageRegistry.addName(Sword2, "Dagger of Flight");

		

	 }


}
