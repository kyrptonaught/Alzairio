package Alzairio.common.Models;

import org.lwjgl.opengl.GL11;

import Alzairio.common.entity.EntityAlza;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;

public class RenderAlza extends RenderBiped
{
 protected ModelBiped model;
 
 public RenderAlza (ModelBiped modelAlzaT, float f)
 {
  super(modelAlzaT, f);
  
  model = ((ModelBiped)mainModel);
 }
 
 public void renderAlza(EntityAlza entity, double par2, double par4, double par6, float par8, float par9)
    {  
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 protected void func_82428_a(EntityAlza entity, float par2)
 {
   
     super.renderEquippedItems(entity, par2);
 }
 

public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderAlza((EntityAlza)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderAlza((EntityAlza)par1Entity, par2, par4, par6, par8, par9);
    }
}
