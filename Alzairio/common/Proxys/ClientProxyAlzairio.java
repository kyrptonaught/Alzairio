package Alzairio.common.Proxys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import Alzairio.common.Alzairio;
import Alzairio.common.Handlers.FakeWallKeyHandler;
import Alzairio.common.Handlers.JetPackKeyHandler;
import Alzairio.common.LandBoat.EntityLandBoat;
import Alzairio.common.LandBoat.RenderLandBoat;
import Alzairio.common.Models.CrumReducerRender;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxyAlzairio extends CommonProxyAlzairio {
public static String file = "Alzairio/Crum.txt";
public static int CrumLevel;
@Override
public void registerRenderThings()
{
MinecraftForgeClient.preloadTexture(alzairio_png);
MinecraftForgeClient.preloadTexture(LandBoat_png);
MinecraftForgeClient.preloadTexture(Items_png);
MinecraftForgeClient.preloadTexture(Grass_png);
MinecraftForgeClient.preloadTexture(AlzaWool);
MinecraftForgeClient.preloadTexture(JetPack_png);
}
@SideOnly(Side.CLIENT)

public static void registerRenderEntitys(){
	Side side = FMLCommonHandler.instance().getEffectiveSide();
	if (side == Side.CLIENT){
	RenderingRegistry.registerEntityRenderingHandler(EntityLandBoat.class, new RenderLandBoat());
	 RenderingRegistry.registerBlockHandler(new CrumReducerRender()); // Or 'this' if your proxy happens to be the one that implements the block render interface.
    CrumReducerRender.renderID = RenderingRegistry.getNextAvailableRenderId();
    
    RenderingRegistry.registerEntityRenderingHandler(EntityLandBoat.class, new RenderLandBoat());
	EntityRegistry.registerModEntity(EntityLandBoat.class, "Land Boat", 180, Alzairio.class, 40, 1, true);
   
	}
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
public static void SaveCrumValue() {
	try {
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write(Integer.toString(Alzairio.Crum));
        out.close();
    } catch (IOException e) {
    }	
	
}
@SideOnly(Side.CLIENT)
public static void RenderPic(String text){
	RenderManager renderManager = RenderManager.instance;
	FontRenderer fontrenderer = renderManager.getFontRenderer();
	float f1 = 1.6F;
	float f2 = 0.01666667F * f1;
	        
	GL11.glPushMatrix();
	GL11.glDisable(GL11.GL_DEPTH_TEST);
	GL11.glDisable(GL11.GL_NORMALIZE);
	GL11.glEnable(GL11.GL_LIGHTING);
	//GL11.glTranslatef((float)posX + 0.0F, (float)posY, (float)posZ);
	//GL11.glNormal3f(-11103301230.0F, 0.0F, 0.0F);
	GL11.glRotatef(-renderManager.playerViewY, 0.0F, 1.0F, 0.0F);
	GL11.glRotatef(renderManager.playerViewX, 1.0F, 0.0F, 0.0F);
	GL11.glScalef(-f2, -f2, f2);
	fontrenderer.drawString(text, -fontrenderer.getStringWidth(text) / 2, 0, 0xFFffffff);
	GL11.glEnable(GL11.GL_DEPTH_TEST);
	GL11.glEnable(GL11.GL_NORMALIZE);
	GL11.glDisable(GL11.GL_LIGHTING);
	GL11.glPopMatrix();
}

@Override
public int addArmor(String armorName){
return RenderingRegistry.addNewArmourRendererPrefix(armorName);
}
}
