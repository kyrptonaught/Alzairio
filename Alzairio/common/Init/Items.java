package Alzairio.common.Init;

import net.minecraft.item.Item;
import Alzairio.common.Items.ItemIscaffold;
import Alzairio.common.Items.Itemchecker;
import Alzairio.common.Items.Itemdirtwand;
import Alzairio.common.Items.Itemlightning;
import Alzairio.common.LandBoat.ItemLandBoat;
import Alzairio.common.dimension.Itemteleporter;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	public static Item dirtwand;
    public static Item Iscaffold;
    public static Item checker; 
    public static Item lightning;
    public static int dimension = 20;
    public static Item teleporter;
    public static Item LandBoat;
public static void init(){
	
	Iscaffold = new ItemIscaffold(3013).setItemName("Iscaffold").setIconIndex(1);
	GameRegistry.registerItem(Iscaffold,"Iscaffold");
	LanguageRegistry.addName(Iscaffold, "Scaffold");
	
	dirtwand = new Itemdirtwand(3011).setItemName("dirtwand").setIconIndex(2);
	GameRegistry.registerItem(dirtwand, "dirtwand");
	LanguageRegistry.addName(dirtwand, "-{buggy}- Test Item (spawns Alzadirt on right click)");
	
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
	LanguageRegistry.addName(LandBoat, "LandBoat");
}


}
