package Alzairio.common;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.Property;
import Alzairio.common.Block.Blockaconitum;
import Alzairio.common.Block.Blockalzadirt;
import Alzairio.common.Block.Blockalzairian;
import Alzairio.common.Block.BlockalzairianOre;
import Alzairio.common.Block.Blockalzastone;
import Alzairio.common.Block.Blockcloudus;
import Alzairio.common.Block.Blocklauncher;
import Alzairio.common.Block.Blockscaffold;
import Alzairio.common.Block.Blockspeedy;
import Alzairio.common.Block.BlockspeedyS;
import Alzairio.common.Block.Blocktrampoline;
import Alzairio.common.Handlers.PacketHandler;
import Alzairio.common.Items.ItemIscaffold;
import Alzairio.common.Items.Itemchecker;
import Alzairio.common.Items.Itemdirtwand;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.Tabs.Tabalzairio;
import Alzairio.common.dimension.Blockalzairio_portal;
import Alzairio.common.dimension.Itemteleporter;
import Alzairio.common.dimension.WorldProviderAlzairio;
import Alzairio.common.world.BiomeGenAlzairio;
import Alzairio.common.world.WorldTypeAlzairio;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
@Mod(modid = "Alzairio", name = "Alzairio", version =  "Beta 1.2"  )
@NetworkMod(clientSideRequired = true, serverSideRequired = true, 
channels={"Alzairio"}, packetHandler = PacketHandler.class)
public class Alzairio {
	 @Instance("Alzairio") public static Alzairio instance;
	@SidedProxy(clientSide = "Alzairio.common.Proxys.ClientProxyAlzairio", serverSide = "Alzairio.common.Proxys.CommonProxyAlzairio") public static CommonProxyAlzairio proxy;
	public static CreativeTabs tabalzairio = new Tabalzairio(CreativeTabs.getNextID(), "alzairio");
	public String MVersion = "Beta 1.2";
	public static Block alzairio_portal;
	public static Block alzadirt;
	public static Block alzairian;
	public static Block alzastone;
    public static Block cloudus;
    public static Block aconitum;
    public static Block speedy;
    public static Block speedyS;
    public static Block trampoline;
    public static Item dirtwand;
    public static Block scaffold;
    public static Item Iscaffold;
    public static Block launcher;
    public static int dimension = 20;
    public static Item teleporter;
  //public static final Achievement cloudusAchieve = new Achievement(2001, "Cloudus", 1, -2, cloudus, AchievementList.openInventory).registerAchievement();
     public static Block alzairianOre;
     public static BiomeGenBase AlzairioBiome;
     public static final WorldType AlzairioWorld = new WorldTypeAlzairio(3, "Alzairio");
     public static int Crum;
     public static Item checker;
     @PreInit
	public void preInit(FMLPreInitializationEvent event) {
    	 File dir = new File("Alzairio"); 
    	 dir.mkdir();
    	 ClientProxyAlzairio.ReadCrumValue();
    	 Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
		config.load();
		Property Version = config.get(Configuration.CATEGORY_GENERAL, "version", MVersion );
		String CrumLevel = Integer.toString(Crum);
		//Property Crum = config.get(Configuration.CATEGORY_GENERAL, "Crum level", CrumLevel );
		Version.comment = "This is the config file for the Alzairio Dimmension mod for minecarft";
		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderThings();
		
		alzadirt = new Blockalzadirt(151, 0).setBlockName("alzadirt");
		GameRegistry.registerBlock(alzadirt, "alzadirt");
		LanguageRegistry.addName(alzadirt, "Alzairio Dirt");

		alzairio_portal = new Blockalzairio_portal(3001, 0).setBlockName("alzairio_portal");
		GameRegistry.registerBlock(alzairio_portal, "alzairio_portal");
		LanguageRegistry.addName(alzairio_portal, "Alzairio Portal");

		alzairianOre = new BlockalzairianOre(150, 1).setBlockName("alzairianOre");
		GameRegistry.registerBlock(alzairianOre, "alzairianOre");
		LanguageRegistry.addName(alzairianOre, "Alzairian Ore");
			
		 alzastone = new Blockalzastone(152, 2).setBlockName("alzastone");
		GameRegistry.registerBlock(alzastone, "alzastone");
		LanguageRegistry.addName(alzastone, "Alzairio Stone");

	cloudus = new Blockcloudus(3004, 3).setBlockName("cloudus");
	GameRegistry.registerBlock(cloudus, "cloudus");
	LanguageRegistry.addName(cloudus, "Cloudus");

	aconitum = new Blockaconitum(3005, 4).setBlockName("aconitum");
	GameRegistry.registerBlock(aconitum, "aconitum");
	LanguageRegistry.addName(aconitum, "Aconitum");
	
	alzairian = new Blockalzairian(3007, 6).setBlockName("alzairian");
		GameRegistry.registerBlock(alzairian, "alzairian");
		LanguageRegistry.addName(alzairian, "Alzairian");
		
	speedy = new Blockspeedy(3008,5).setBlockName("speedy");
	GameRegistry.registerBlock(speedy, "speedy");
	LanguageRegistry.addName(speedy,"Name Pending...");
	
	speedyS = (new BlockspeedyS(3009, speedy, 5)).setBlockName("speedyS").setRequiresSelfNotify();	
	GameRegistry.registerBlock(speedyS, "speedyS");
	LanguageRegistry.addName(speedyS,"Name Also Pending...");
	
	launcher = (new Blocklauncher(3014, speedy, 5)).setBlockName("launcher").setRequiresSelfNotify();
	GameRegistry.registerBlock(launcher,"launcher");
	LanguageRegistry.addName(launcher, "Launcher");
	
	trampoline = new Blocktrampoline(3010,6).setBlockName("trampoline");
	GameRegistry.registerBlock(trampoline,"trampoline");
	LanguageRegistry.addName(trampoline,"Trampoline");
	
	Iscaffold = new ItemIscaffold(3013).setItemName("Iscaffold");
	GameRegistry.registerItem(Iscaffold,"Iscaffold");
	LanguageRegistry.addName(Iscaffold, "Scaffold");
	
	scaffold = new Blockscaffold(3012,8).setBlockName("scaffold");
	GameRegistry.registerBlock(scaffold,"scaffold");
	LanguageRegistry.addName(scaffold,"Scaffold");
	
	dirtwand = new Itemdirtwand(3011).setItemName("dirtwand").setIconIndex(8);
	GameRegistry.registerItem(dirtwand, "dirtwand");
	LanguageRegistry.addName(dirtwand, "-{buggy}- Test Item (spawns Alzadirt on right click)");
	
	teleporter = new Itemteleporter(3014).setItemName("teleporter").setIconIndex(9);
	GameRegistry.registerItem(teleporter,"teleporter");
	LanguageRegistry.addName(teleporter,"Teleporter");
		
	checker = new Itemchecker(3016).setItemName("checker ").setIconIndex(10);
	GameRegistry.registerItem(checker ,"checker ");
	LanguageRegistry.addName(checker ,"Crum Checker");
	DimensionManager.registerProviderType(dimension, WorldProviderAlzairio.class, false); 
	  DimensionManager.registerDimension(dimension, dimension); 
	 
	  AlzairioBiome = new BiomeGenAlzairio(30).setColor(0x2F4F4F).setBiomeName("Alzairio Biome").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.1F, 0.6F);
      GameRegistry.addBiome(AlzairioBiome);
	   }
}
