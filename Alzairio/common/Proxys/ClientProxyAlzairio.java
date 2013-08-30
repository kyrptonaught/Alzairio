package Alzairio.common.Proxys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import Alzairio.common.Alzairio;
import Alzairio.common.entity.EntityBeam;
import Alzairio.common.entity.RenderBeam;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ClientProxyAlzairio extends CommonProxyAlzairio {
	public static String msg;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerRenderEntitys(){

		RenderingRegistry.registerEntityRenderingHandler(EntityBeam.class, new RenderBeam());
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

	@Override
	public int addArmor(String armorName){
		return RenderingRegistry.addNewArmourRendererPrefix(armorName);
	}
	public static void IncreaseSpeed(float F,EntityPlayer thePlayer){
		thePlayer.capabilities.setPlayerWalkSpeed(F);
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
