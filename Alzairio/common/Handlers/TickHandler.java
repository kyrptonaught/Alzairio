package Alzairio.common.Handlers;

import java.util.EnumSet;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import Alzairio.common.Proxys.ClientProxyAlzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler{
	 private Minecraft mc;
	 
	 public static Entity par5Entity;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		   
	}

	 @Override
	    public void tickEnd(EnumSet<TickType> type, Object... tickData)
	    {
	        if (type.equals(EnumSet.of(TickType.RENDER)))
	        {
	            onRenderTick();
	        }
	        else if (type.equals(EnumSet.of(TickType.CLIENT)))
	        {
	            GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
	            if (guiscreen != null)
	            {
	                onTickInGUI(guiscreen);
	            } else {
	                onTickInGame();
	            }
	        }
	    }
	@Override
	public EnumSet<TickType> ticks() {
		
		return EnumSet.of(TickType.CLIENT, TickType.PLAYER, TickType.RENDER); 
		
	}

	@Override
	public String getLabel() {
		return "Alzairio tick handler";
	}
	
	public void onRenderTick()
	    {
		Minecraft par1Minecraft = FMLClientHandler.instance().getClient().getMinecraft(); 
		this.mc = par1Minecraft;
		
		GuiIngame gig = new GuiIngame(par1Minecraft);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, par1Minecraft.renderEngine.getTexture(CommonProxyAlzairio.alzairio_png));
		gig.drawTexturedModalRect(5, 50, 0, 0, 15, 80);
		 
		/* FontRenderer var1 = this.mc.fontRenderer;
         ScaledResolution var2 = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
         int var3 = var2.getScaledWidth();
         short var4 = 182;
         int var5 = var3 / 2 - var4 / 2;
         byte var7 = 12;
        
         String var8 = "Crum: "+Integer.toString(Alzairio.common.Alzairio.Crum);
         var1.drawStringWithShadow(var8, var3 / 2 - var1.getStringWidth(var8) / 2, var7 - 10, 16777215);
       */  
	    }
	 public void onTickInGUI(GuiScreen guiscreen)
	    {
			
	    }

	    public void onTickInGame()
	    {
	       EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
			ItemStack itemstack = thePlayer.inventory.armorItemInSlot(2);
			if(itemstack != null && itemstack.itemID == Alzairio.common.Init.Items.JetPack.itemID){
				 thePlayer.fallDistance = 0;
			}
	    }
	
}
