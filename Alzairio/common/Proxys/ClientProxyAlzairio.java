package Alzairio.common.Proxys;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class ClientProxyAlzairio extends CommonProxyAlzairio {
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
@Override
public int addArmor(String armorName){
return RenderingRegistry.addNewArmourRendererPrefix(armorName);
}
}
