package Alzairio.common.Proxys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.src.ModLoader;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import Alzairio.common.Alzairio;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ClientProxyAlzairio extends CommonProxyAlzairio {
public static String file = "Alzairio/Crum.txt";
public static int CrumLevel;
@Override
public void registerRenderThings()
{
MinecraftForgeClient.preloadTexture(alzairio_png);
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
public static void RenderPic() {

	//FMLCommonHandler.instance().onRenderTickStart(this.timer.renderPartialTicks);
	Minecraft minecraft = ModLoader.getMinecraftInstance();
	GuiIngame gig = new GuiIngame(minecraft);
	GL11.glBindTexture(GL11.GL_TEXTURE_2D, minecraft.renderEngine.getTexture(CommonProxyAlzairio.alzairio_png));
	gig.drawTexturedModalRect(5, 5, 0, 0, 5, 102);
//	FMLCommonHandler.instance().onRenderTickEnd(this.timer.renderPartialTicks);
		
}

@Override
public int addArmor(String armorName){
return RenderingRegistry.addNewArmourRendererPrefix(armorName);
}
}
