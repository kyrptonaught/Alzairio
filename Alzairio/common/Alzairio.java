package Alzairio.common;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.ModLoader;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.Property;
import net.minecraftforge.event.ForgeSubscribe;
import Alzairio.common.Handlers.FakeWallKeyHandler;
import Alzairio.common.Handlers.JetPackKeyHandler;
import Alzairio.common.Handlers.PacketHandler;
import Alzairio.common.Handlers.TickHandler;
import Alzairio.common.Init.Blocks;
import Alzairio.common.Init.Items;
import Alzairio.common.LandBoat.EntityLandBoat;
import Alzairio.common.LandBoat.RenderLandBoat;
import Alzairio.common.Models.ModelCrumReducer;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.Tabs.Tabalzairio;
import Alzairio.common.Tabs.Tabalzairio2;
import Alzairio.common.dimension.WorldProviderAlzairio;
import Alzairio.common.world.BiomeGenAlzairio;
import Alzairio.common.world.WorldTypeAlzairio;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
@Mod(modid = "Alzairio", name = "Alzairio", version =  "Beta 1.5"  )
@NetworkMod(clientSideRequired = true, serverSideRequired = true, 
channels={"Alzairio"}, packetHandler = PacketHandler.class)
public class Alzairio {
	 @Instance("Alzairio") public static Alzairio instance;
	@SidedProxy(clientSide = "Alzairio.common.Proxys.ClientProxyAlzairio", serverSide = "Alzairio.common.Proxys.CommonProxyAlzairio") public static CommonProxyAlzairio proxy;
	public static CreativeTabs tabalzairio = new Tabalzairio(CreativeTabs.getNextID(), "alzairio");
	public static CreativeTabs tabalzairio2 = new Tabalzairio2(CreativeTabs.getNextID(), "alzairio2"); 
	public String MVersion = "Beta 1.5";
     public static BiomeGenBase AlzairioBiome;
     public static final WorldType AlzairioWorld = new WorldTypeAlzairio(3, "Alzairio");
     public static int Crum;
     public static int dimension = 20;
    public static ModelCrumReducer CrumReducer;
     @PreInit
	public void preInit(FMLPreInitializationEvent event) {
    	 File dir = new File("Alzairio"); 
    	 dir.mkdir();
    	 ClientProxyAlzairio.ReadCrumValue();
    	 Configuration config = new Configuration(
				event.getSuggestedConfigurationFile());
		config.load();
		Property Version = config.get(Configuration.CATEGORY_GENERAL, "version", MVersion );
		
		//Property Crum = config.get(Configuration.CATEGORY_GENERAL, "Crum level", CrumLevel );
		Version.comment = "This is the config file for the Alzairio Dimmension mod for minecarft";
		config.save();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderThings();
		
		//TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
		 Side side = FMLCommonHandler.instance().getEffectiveSide();
			if (side == Side.CLIENT)
			{
		KeyBindingRegistry.registerKeyBinding(new FakeWallKeyHandler());
	    KeyBindingRegistry.registerKeyBinding(new JetPackKeyHandler());
			}
	    Blocks.init();
		 Items.init();
	
			
			
	  CrumReducer = new  ModelCrumReducer();
	  DimensionManager.registerProviderType(dimension, WorldProviderAlzairio.class, false); 
	  DimensionManager.registerDimension(dimension, dimension); 
	 
	  AlzairioBiome = new BiomeGenAlzairio(30).setColor(0x2F4F4F).setBiomeName("Alzairio Biome").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.1F, 0.6F);
      
	  GameRegistry.addBiome(AlzairioBiome);
	 	}
	       
	

}
