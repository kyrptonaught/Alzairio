package Alzairio.common.Init;

import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.client.EnumHelperClient;
import Alzairio.common.Items.ItemAlzBow;
import Alzairio.common.Items.ItemAlzCart;
import Alzairio.common.Items.ItemAlzairianIngot;
import Alzairio.common.Items.ItemAlzairioSword;
import Alzairio.common.Items.ItemBoots;
import Alzairio.common.Items.ItemChest;
import Alzairio.common.Items.ItemCrumIngot;
import Alzairio.common.Items.ItemDigWand;
import Alzairio.common.Items.ItemHelmet;
import Alzairio.common.Items.ItemIscaffold;
import Alzairio.common.Items.ItemJetPack;
import Alzairio.common.Items.ItemLeggings;
import Alzairio.common.Items.ItemZeroGrav;
import Alzairio.common.Items.Itemchecker;
import Alzairio.common.Items.Itemdirtwand;
import Alzairio.common.Items.Itemlightning;
import Alzairio.common.Items.ItemsMetaWand;
import Alzairio.common.LandBoat.ItemLandBoat;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.dimension.Itemteleporter;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
public class Items {
	
    public static Item dirtwand;
    public static Item Iscaffold;
    public static Item checker; 
    public static Item lightning;
    public static int  dimension = 20;
    public static Item teleporter;
    public static Item LandBoat;
    public static Item JetPack;
    public static Item Boots;
    public static Item Sword;
    public static Item Helmet;
    public static Item AlzairianIngot;
    public static Item CrumIngot;
    public static Item Leggings;
    public static Item Chest;
    public static Item ZeroGrav;
    public static Item DigWand;
    public static Item MetaWand;
    public static Item Sword2;
    public static Item AlzBow;
    public static Item AlzCart;
    public static EnumArmorMaterial Alzairio = EnumHelperClient.addArmorMaterial("Alzairio", 13, new int[]{10,10,10,10}, 15);
    public static EnumToolMaterial AlzairioTool =EnumHelperClient.addToolMaterial("Alzairio2", 5, 6, 2, 35, 2); 	
    public static EnumToolMaterial AlzarioSpecial = EnumHelperClient.addToolMaterial("Alzairio3", 5, 6, 2, 0, 2);
    public static void init(){
	 Iscaffold = new ItemIscaffold(3013).setItemName("Iscaffold").setIconIndex(1);
	GameRegistry.registerItem(Iscaffold,"Iscaffold");
	LanguageRegistry.addName(Iscaffold, "Scaffold WIP");
	
	dirtwand = new Itemdirtwand(3011).setItemName("dirtwand").setIconIndex(2);
	GameRegistry.registerItem(dirtwand, "dirtwand");
	LanguageRegistry.addName(dirtwand, "Test Item (spawns Alzadirt on right click)");
	
	teleporter = new Itemteleporter(3014).setItemName("teleporter").setIconIndex(3);
	GameRegistry.registerItem(teleporter,"teleporter");
	LanguageRegistry.addName(teleporter,"Teleporter");
		
	checker = new Itemchecker(3016).setItemName("checker ").setIconIndex(4);
	GameRegistry.registerItem(checker ,"checker ");
	LanguageRegistry.addName(checker ,"Crum Checker");
	
	lightning = new Itemlightning(3017).setItemName("lightning").setIconIndex(5);
	GameRegistry.registerItem(lightning,"lightning");
	LanguageRegistry.addName(lightning,"Lightning Wand");
	
	LandBoat = new ItemLandBoat(3018).setItemName("LandBoat").setIconIndex(6);
	GameRegistry.registerItem(LandBoat,"LandBoat");
	LanguageRegistry.addName(LandBoat, "LandBoat CRASHES");
   
	JetPack = new ItemJetPack(3019,Alzairio, 4, 1).setItemName("JetPack");
	GameRegistry.registerItem(JetPack,"JetPack");
	LanguageRegistry.addName(JetPack,"JetPack");
	
    Boots = new ItemBoots(3020,Alzairio,4,3).setItemName("Boots");
    GameRegistry.registerItem(Boots,"Boots");
    LanguageRegistry.addName(Boots, "Speedy Gonzalis Boots");
   
    Sword = new ItemAlzairioSword(3021, AlzairioTool, CommonProxyAlzairio.HD_Text, 1,1).setItemName("Sword");
    GameRegistry.registerItem(Sword, "Sword");
    LanguageRegistry.addName(Sword,"Alzairian Sword");
    
    Helmet = new ItemHelmet(3022,Alzairio,4,0).setItemName("Helmet");
    GameRegistry.registerItem(Helmet,"Helmet");
    LanguageRegistry.addName(Helmet, "Alzairian Helmet");
    
    AlzairianIngot = new ItemAlzairianIngot(3023).setItemName("AlzairianIngot").setIconIndex(12);
    GameRegistry.registerItem(AlzairianIngot,"AlzairianIngot");
    LanguageRegistry.addName(AlzairianIngot,"Alzairian Ingot");
    
    CrumIngot = new ItemCrumIngot(3024).setItemName("CrumIngot").setIconIndex(11);
    GameRegistry.registerItem(CrumIngot,"CrumIngot");
    LanguageRegistry.addName(CrumIngot, "Crum Ingot");
    
    Leggings = new ItemLeggings(3025,Alzairio,4,2).setItemName("Leggings");
    GameRegistry.registerItem(Leggings, "Leggings");
    LanguageRegistry.addName(Leggings,"Alzairian Leggings");
   
    Chest = new ItemChest(3026,Alzairio,4,1).setItemName("Chest");
    GameRegistry.registerItem(Chest,"Chest");
    LanguageRegistry.addName(Chest, "Alzairian Plate");
    
    ZeroGrav = new ItemZeroGrav(3027).setItemName("ZeroGrav").setIconIndex(15);
    GameRegistry.registerItem(ZeroGrav, "ZeroGrav");
    LanguageRegistry.addName(ZeroGrav, "ZeroGrav Wand");
    
    DigWand = new ItemDigWand(3028).setItemName("DigWand").setIconIndex(16);
    GameRegistry.registerItem(DigWand, "DigWand");
    LanguageRegistry.addName(DigWand, "Dig Wand (Name WIP)");
   
    MetaWand = new ItemsMetaWand(3029).setItemName("MetaWand").setIconIndex(17);
    GameRegistry.registerItem(MetaWand, "MetaWand");
    LanguageRegistry.addName(MetaWand, "Meta Wand");
    
    Sword2 = new ItemAlzairioSword(3030, AlzarioSpecial, CommonProxyAlzairio.HD_Text, 0,2).setItemName("Sword2");
    GameRegistry.registerItem(Sword2, "Sword2");
    LanguageRegistry.addName(Sword2, "Dagger of Flight");
    
    AlzBow = new ItemAlzBow(3031).setItemName("AlzBow").setIconIndex(19);
    GameRegistry.registerItem(AlzBow, "AlzBow");
    LanguageRegistry.addName(AlzBow, "AlzBow");
   
    AlzCart = new ItemAlzCart(3032,1).setItemName("AlzCart").setIconIndex(20);;
    GameRegistry.registerItem(AlzCart, "AlzCart");
    LanguageRegistry.addName(AlzCart, "AlzCart");
    }


}
