package Alzairio.common;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import Alzairio.common.Handlers.JetPackKeyHandler;
import Alzairio.common.Handlers.PacketHandler;
import Alzairio.common.Handlers.TickHandler;
import Alzairio.common.Init.Blocks;
import Alzairio.common.Init.Items;
import Alzairio.common.Init.Recipes;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.Tabs.Tabalzairio;
import Alzairio.common.Tabs.Tabalzairio2;
import Alzairio.common.dimension.BiomeGenAlzairio;
import Alzairio.common.dimension.WorldGenAlzTree;
import Alzairio.common.dimension.WorldProviderAlzairio;
import Alzairio.common.entity.EntityBeam;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
@Mod(modid = Alzairio.modid, name = "Alzairio", version =  Alzairio.MVersion  )
@NetworkMod(clientSideRequired = true, serverSideRequired = true, 
channels={"Alzairio2","JetPack","JetPack2"}, packetHandler = PacketHandler.class)
public class Alzairio {
	@Instance("Alzairio") public static Alzairio instance;
	public static final String modid = "alzairio";
	@SidedProxy(clientSide = "Alzairio.common.Proxys.ClientProxyAlzairio", serverSide = "Alzairio.common.Proxys.CommonProxyAlzairio") public static CommonProxyAlzairio proxy;
	public static CreativeTabs tabalzairio = new Tabalzairio(CreativeTabs.getNextID(), "alzairio");
	public static CreativeTabs tabalzairio2 = new Tabalzairio2(CreativeTabs.getNextID(), "alzairio2"); 
	public final static String MVersion = "Beta 4";
	public static BiomeGenBase AlzairioBiome;
	public static int DimID = 2;
	public static Achievement CloudusAchieve;
	public static Achievement AlzairioDimEnter;
	public static int startEntityId = 300;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {

		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		Property Version = config.get(Configuration.CATEGORY_GENERAL, "version", MVersion );
		Version.comment = "This is the config file for the Alzairio Dimmension mod for minecarft";
		config.save();

		event.getModMetadata().autogenerated = false;
		event.getModMetadata().url = "mc-brikbroz.webs.com";
		event.getModMetadata().credits = "CPW/LexManos for creating Forge/FML, And mojang for Minecraft";
		event.getModMetadata().logoFile = CommonProxyAlzairio.Logo_png;
		event.getModMetadata().name = "Alzairio";
		event.getModMetadata().modId = "alzairio";
		event.getModMetadata().version = MVersion;
		event.getModMetadata().authorList.add("Coded by: Kyrptonaught, Textured by: KingOfCool199, Tested by: Rockinrussomano");
		event.getModMetadata().description = "A Mod that adds a Dimmension called the Alzairio dimension.";


	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderEntitys();
		proxy.addArmor("Alzairian");
		Blocks.init();
		Items.init();
		Recipes.init();
		proxy.registerOre();
		instance = this;
		EntityRegistry.registerModEntity(EntityBeam.class,"EntityBeam", 180, this, 40, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.alzairio.Alza.name", "Alza");

		Side side = FMLCommonHandler.instance().getEffectiveSide();
		if (side == Side.CLIENT)
		{   TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		KeyBindingRegistry.registerKeyBinding(new JetPackKeyHandler());
		}

		AlzairioBiome = new BiomeGenAlzairio(150);
		GameRegistry.addBiome(AlzairioBiome);
		DimensionManager.registerProviderType(DimID, WorldProviderAlzairio.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		GameRegistry.registerWorldGenerator(new WorldGenAlzTree(false));
		MinecraftForge.EVENT_BUS.register(new AlzEventClass());
		AlzairioDimEnter = new Achievement(27, "AlzairioDimEnter",0,2,Blocks.alzadirt, AchievementList.mineWood).registerAchievement();
		CloudusAchieve = new Achievement(28, "CloudusAchieve", -2, 2, Blocks.cloudus, AlzairioDimEnter).registerAchievement();	
		this.addAchievementName("AlzairioDimEnter", "Alzairioian");
		this.addAchievementDesc("AlzairioDimEnter", "Enter the Alzairio dimmension");
		this.addAchievementName("CloudusAchieve", "Saved by the Block!");
		this.addAchievementDesc("CloudusAchieve", "Survive a fall by landing in the cloudus block"); 
	}

	@PostInit
	public void Postload(FMLPostInitializationEvent event)   {

	}
	public static int getUniqueEntityId() 
	{
		do 
		{
			startEntityId++;
		} 
		while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}
	@ServerStarting
	public void ServerStart(FMLServerStartingEvent event){

	}
	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}
	private void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}


}
