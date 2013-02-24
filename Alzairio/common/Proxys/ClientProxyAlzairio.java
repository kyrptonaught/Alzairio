package Alzairio.common.Proxys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import Alzairio.common.Init.Items;
import Alzairio.common.Init.Items.*;
import Alzairio.common.Alzairio;
import Alzairio.common.LandBoat.EntityLandBoat;
import Alzairio.common.LandBoat.RenderLandBoat;
import Alzairio.common.Models.CrumReducerRender;
import Alzairio.common.Models.ModelAlzaT;
import Alzairio.common.Models.ModelLightningWand;
import Alzairio.common.Models.RenderAlza;
import Alzairio.common.Models.RenderLightning;
import Alzairio.common.Models.TileEntityReducer;
import Alzairio.common.entity.EntityAlza;
import Alzairio.common.entity.EntityBeam;
import Alzairio.common.entity.RenderBeam;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Alzairio.common.AlzairioLogger;
public class ClientProxyAlzairio extends CommonProxyAlzairio {
public static String file = "Alzairio/Crum.txt";
public static int CrumLevel;
public static String msg;
@Override
public void registerRenderThings()
{
MinecraftForgeClient.preloadTexture(alzairio_png);
MinecraftForgeClient.preloadTexture(LandBoat_png);
MinecraftForgeClient.preloadTexture(Items_png);
MinecraftForgeClient.preloadTexture(Grass_png);
MinecraftForgeClient.preloadTexture(AlzaWool);
MinecraftForgeClient.preloadTexture(JetPack_png);
MinecraftForgeClient.preloadTexture(Armour_png);
MinecraftForgeClient.preloadTexture(Armour2_png);
MinecraftForgeClient.preloadTexture(Logo_png);
MinecraftForgeClient.preloadTexture(CrumMeter);
MinecraftForgeClient.preloadTexture(Entity);
MinecraftForgeClient.preloadTexture(container);
MinecraftForgeClient.preloadTexture(Lightning);
MinecraftForgeClient.preloadTexture(HD_Text);
ClientRegistry.registerTileEntity(TileEntityReducer.class, "Reducer", new CrumReducerRender());

}
@SideOnly(Side.CLIENT)
@Override
public void registerRenderEntitys(){
	
	RenderingRegistry.registerEntityRenderingHandler(EntityLandBoat.class, new RenderLandBoat());
	RenderingRegistry.registerEntityRenderingHandler(EntityBeam.class, new RenderBeam());
	RenderingRegistry.registerEntityRenderingHandler(EntityAlza.class, new RenderAlza(new ModelBiped(), 1.0F));
	}

public static void SpawnLightning(double PosX, double PosY, double PosZ) {
	 World theWorld = FMLClientHandler.instance().getClient().theWorld;
	 EntityLightningBolt Lightning = new EntityLightningBolt(theWorld, 1, 1, 1);
     Lightning.setPosition(PosX,PosY,PosZ);
     theWorld.spawnEntityInWorld(Lightning);
}
public static void printMessageToPlayer(String msg) {
	Side side = FMLCommonHandler.instance().getEffectiveSide();
	if (side == Side.SERVER)
	{
	
	}
	else if (side == Side.CLIENT)
	{
	 FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage((msg));
    }	
  }

@SideOnly(Side.CLIENT)
public static void ReadCrumValue(){
	  try {
    BufferedReader br = new BufferedReader(new FileReader(file));
    br.read();
	int Value = br.read();
	Value++;
	Value++;
    Alzairio.Crum = Value;
    br.close();
	  } 
	catch (IOException e) {
		  
	  }
  
}
public static String ReadMessage(){
	  try {
		    URL url = new URL("http://mc-brikbroz.webs.com/Alzairio%20Mod/test.txt");
		   
		    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		    br.read();
		    msg =  br.readLine();
		    AlzairioLogger.log(Level.INFO, "Message: "+ msg);
		    }
		    catch (IOException e) {
				  
			  }
return msg;
}
public static void SaveCrumValue() {
	try {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(Integer.toString(Alzairio.Crum));
        out.close();
    } catch (IOException e) {
    }	
	
}

@Override
public int addArmor(String armorName){
return RenderingRegistry.addNewArmourRendererPrefix(armorName);
}
public static void IncreaseSpeed(float f){
	EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
	thePlayer.capabilities.func_82877_b(f);
}

public static void SpawnParticle(double posx, double posy, double posz) {
	World theWorld = FMLClientHandler.instance().getClient().theWorld;
	theWorld.spawnParticle("largesmoke", posx, posy, posz,0,-2,0);
     theWorld.spawnParticle("lava", posx, posy, posz,0,-2,0);
     theWorld.spawnParticle("dripLava", posx, posy, posz,0,-2,0);
     theWorld.spawnParticle("townaura", posx, posy, posz,0,-2,0);
     theWorld.spawnParticle("spell", posx, posy, posz,0,-2,0);
}

}
