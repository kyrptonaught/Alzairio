package Alzairio.common;

import java.io.File;
import java.util.Random;
import java.util.logging.Level;

import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;
import net.minecraft.stats.Achievement;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecartRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import Alzairio.common.Handlers.AlzairioWorldGenHandler;
import Alzairio.common.Handlers.FakeWallKeyHandler;
import Alzairio.common.Handlers.JetPackKeyHandler;
import Alzairio.common.Handlers.PacketHandler;
import Alzairio.common.Handlers.ReducerGUIHandler;
import Alzairio.common.Handlers.TickHandler;
import Alzairio.common.Init.Blocks;
import Alzairio.common.Init.Items;
import Alzairio.common.LandBoat.EntityLandBoat;
import Alzairio.common.Models.ModelCrumReducer;
import Alzairio.common.Models.RenderLightning;
import Alzairio.common.Models.TileEntityFakeWall;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.Tabs.Tabalzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Tabs.Tabalzairio2;
import Alzairio.common.dimension.WorldProviderAlzairio;
import Alzairio.common.entity.EntityAlzCart;
import Alzairio.common.entity.EntityAlza;
import Alzairio.common.entity.EntityBeam;
import Alzairio.common.world.AlzairioDungeonGen;
import Alzairio.common.world.BiomeGenAlzairio;
import Alzairio.common.world.PillarGen;
import Alzairio.common.world.WorldTypeAlzairio;
import cpw.mods.fml.client.FMLClientHandler;
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
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
@Mod(modid = "Alzairio", name = "Alzairio", version =  Alzairio.MVersion  )
@NetworkMod(clientSideRequired = true, serverSideRequired = true, 
channels={"Alzairio","Alzairio2","JetPack","JetPack2","Alzairio3"}, packetHandler = PacketHandler.class)
public class Alzairio {
	@Instance("Alzairio") public static Alzairio instance;
	@SidedProxy(clientSide = "Alzairio.common.Proxys.ClientProxyAlzairio", serverSide = "Alzairio.common.Proxys.CommonProxyAlzairio") public static CommonProxyAlzairio proxy;
	public static CreativeTabs tabalzairio = new Tabalzairio(CreativeTabs.getNextID(), "alzairio");
	public static CreativeTabs tabalzairio2 = new Tabalzairio2(CreativeTabs.getNextID(), "alzairio2"); 
	public final static String MVersion = "Beta 2.3.2";
	public static BiomeGenBase AlzairioBiome;
	public static final WorldType AlzairioWorld = new WorldTypeAlzairio(3, "Alzairio");
	public static int Crum;
	public static int dimension = 20;
	public static ModelCrumReducer CrumReducer;
	public static AchievementPage AlzairioPage;
	public static Achievement CloudusAchieve;
	public static Achievement AlzairioDimEnter;
	public static int startEntityId = 300;
	public static MinecraftServer server = null ;
	public ReducerGUIHandler guiHandlerReducer = new ReducerGUIHandler();
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		AlzairioLogger.init();

		File dir = new File("Alzairio"); 
		dir.mkdir();
		// ClientProxyAlzairio.ReadCrumValue();
		Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
		config.load();
		Property Version = config.get(Configuration.CATEGORY_GENERAL, "version", MVersion );

		//Property Crum = config.get(Configuration.CATEGORY_GENERAL, "Crum level", CrumLevel );
		Version.comment = "This is the config file for the Alzairio Dimmension mod for minecarft";
		config.save();
		event.getModMetadata().autogenerated = false;
		event.getModMetadata().url = "mc-brikbroz.webs.com";
		event.getModMetadata().credits = "CPW/LexManos for creating Forge/FML, And mojang for Minecraft";
		event.getModMetadata().logoFile = CommonProxyAlzairio.Logo_png;
		event.getModMetadata().name = "Alzairio";
		event.getModMetadata().modId = "Alzairio";
		event.getModMetadata().version = MVersion;
		event.getModMetadata().authorList.add("Coded by: Kyrptonaught, Textured by: KingOfCool199, Tested by: Rockinrussomano");
		event.getModMetadata().description = "A Mod that adds a Dimmension called the Alzairio dimension. It also adds a bunch of items and blocks with cool features.";
		AlzairioLogger.log(Level.INFO, "Starting Loading");
		AlzairioLogger.log(Level.INFO, event.getModMetadata().getAuthorList());
	}

	@Init
	public void load(FMLInitializationEvent event) {
		AlzairioLogger.log(Level.INFO, "Halfway Loaded");
		proxy.registerRenderThings();
		proxy.registerRenderEntitys();
		proxy.addArmor("Alzairian");
		Blocks.init();
		Items.init();
		NetworkRegistry.instance().registerGuiHandler(this, guiHandlerReducer);
		instance = this;
		GameRegistry.registerWorldGenerator(new AlzairioWorldGenHandler());
		EntityRegistry.registerModEntity(EntityAlza.class, "Alza", 301, this, 40, 1, true);
		EntityRegistry.registerModEntity(EntityLandBoat.class, "Land Boat", 300, this, 40, 1, true);
		EntityRegistry.registerModEntity(EntityBeam.class,"EntityBeam", 180, this, 40, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.Alzairio.Alza.name", "Alza");
		registerEntityEgg(EntityAlza.class, 0xffffff, 0x000000);
		Side side = FMLCommonHandler.instance().getEffectiveSide();

		if (side == Side.CLIENT)
		{
			TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
			KeyBindingRegistry.registerKeyBinding(new FakeWallKeyHandler());
			KeyBindingRegistry.registerKeyBinding(new JetPackKeyHandler());
			MinecraftForgeClient.registerItemRenderer(Items.lightning.itemID, (IItemRenderer)new RenderLightning());
			CommandHandler cmd = new CommandHandler();
			cmd.registerCommand(new AlzairioCMD());

		}else{
			ServerCommandManager Scmd = new ServerCommandManager();

			Scmd.registerCommand(new AlzairioCMD());

		}

		// Recipes.init();
		AlzairioDimEnter = new Achievement(27,"AlzairioDimEnter",0,0, Blocks.alzairio_portal,null).registerAchievement();
		CloudusAchieve = new Achievement(28, "CloudusAchieve", 0, 2, Blocks.cloudus, AlzairioDimEnter).registerAchievement();	
		this.addAchievementName("AlzairioDimEnter", "Alzairioian");
		this.addAchievementDesc("AlzairioDimEnter", "Enter the Alzairio dimmension");
		this.addAchievementName("CloudusAchieve", "Saved by the Block!");
		this.addAchievementDesc("CloudusAchieve", "Survive a fall by landing in the cloudus block"); 
		AlzairioPage = new AchievementPage("AlzairioPage", AlzairioDimEnter, CloudusAchieve);
		AchievementPage.registerAchievementPage(AlzairioPage);

		CrumReducer = new  ModelCrumReducer();

		DimensionManager.registerProviderType(dimension, WorldProviderAlzairio.class, false); 
		DimensionManager.registerDimension(dimension, dimension); 
		AlzairioBiome = new BiomeGenAlzairio(30).setColor(0x2F4F4F).setBiomeName("Alzairio Biome").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.1F, 0.6F);
		GameRegistry.addBiome(AlzairioBiome);
		GameRegistry.registerTileEntity(TileEntityFakeWall.class,"FakeWall");

		GameRegistry.registerWorldGenerator(new PillarGen());
		//GameRegistry.registerWorldGenerator(new AlzairioDungeonGen());
		MinecartRegistry.registerMinecart(EntityAlzCart.class, new ItemStack(Items.AlzCart));
	}

	@PostInit
	public void Postload(FMLPostInitializationEvent event)   {
		AlzairioLogger.log(Level.INFO, "Sucessfully loaded");	

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
		server = FMLCommonHandler.instance().getMinecraftServerInstance();
		ICommandManager commandManager = server.getCommandManager() ;
		ServerCommandManager serverCommandManager = ((ServerCommandManager) commandManager);
		serverCommandManager.registerCommand(new AlzairioCMD());
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
