package Alzairio.common.Models;

import org.lwjgl.opengl.GL11;

import Alzairio.common.Proxys.CommonProxyAlzairio;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.IItemRenderer;

public class RenderLightning implements IItemRenderer 
{
	protected ModelLightningWand lightningWand;
    protected ModelBiped player;
	public RenderLightning()
	{
    lightningWand = new ModelLightningWand();
	player = new ModelBiped();
	}
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED: return true;
		default:return false;

		}

	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) 
	{

		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		switch(type)
		{
		case EQUIPPED:
		{
		GL11.glPushMatrix();
		ForgeHooksClient.bindTexture(CommonProxyAlzairio.Lightning, 0);
		GL11.glScalef(0.2F, 0.2F, 0.2F);
		GL11.glRotatef(250, 0, 0, 1);
		GL11.glTranslatef(-3, -4, 1);
		Entity entity = (Entity)data[1];
		player.bipedLeftArm.rotateAngleX = 10;
		lightningWand.render((Entity)data[1], 0F, 0F, 0F, 0F, 0F, 0.625F);
		ForgeHooksClient.unbindTexture();
		
		GL11.glPopMatrix();
		}
		default:
			break;
		}

	}

}
