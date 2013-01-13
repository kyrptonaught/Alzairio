package Alzairio.common.Handlers;

import java.util.EnumSet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import Alzairio.common.Proxys.ClientProxyAlzairio;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler{

	public static Entity par5Entity;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		   
	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		 
	}

	@Override
	public EnumSet<TickType> ticks() {
		Alzairio.common.Proxys.ClientProxyAlzairio.SaveCrumValue(); 
		onTickInGame(FMLClientHandler.instance().getClient().thePlayer);
		return EnumSet.of(TickType.CLIENT, TickType.PLAYER); 
		
	}

	@Override
	public String getLabel() {
		return "Alzairio tick handler";
	}
	public void onTickInGame(EntityPlayer par5Entity)
    {
     if (Alzairio.common.Alzairio.Crum > 100) {
    	  ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.confusion.getId(), 40, 2));
    	   
     }
     if (Alzairio.common.Alzairio.Crum > 125) {
   	  ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.weakness.getId(), 40, 2));
   	   
    }
     if (Alzairio.common.Alzairio.Crum > 150) {
   	  ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), 40, 2));
   	 ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 40, 2));
  	   
    }
     if (Alzairio.common.Alzairio.Crum > 175) {
      	  ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.blindness.getId(), 40, 2));
      	   
       }
     if (Alzairio.common.Alzairio.Crum > 200) {
     	  ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 40, 2));
     	   
      }
    }
}
