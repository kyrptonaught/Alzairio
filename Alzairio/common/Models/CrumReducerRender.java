package Alzairio.common.Models;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import Alzairio.common.Proxys.CommonProxyAlzairio;


import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class CrumReducerRender extends TileEntitySpecialRenderer {
	public CrumReducerRender()
	{
	aModel = new ModelCrumReducer();
	bModel = new ModelCrumReducerBottom();
	}

	public void renderAModelAt(TileEntityReducer tileentity1, double d, double d1, double d2, float f)
	{
	GL11.glPushMatrix();
	GL11.glTranslatef((float)d + 0.5F, (float)d1 + 0.5F, (float)d2 + 0.5F);
	bindTextureByName(CommonProxyAlzairio.alzairio_png);
	GL11.glPushMatrix();
	bModel.renderModel(0.0625F);
	aModel.renderModel(0.085F);
	//aModel.rotateY(0.0625F,160);
	//GL11.glRotatef(1, 1, 1, 1);
	GL11.glPopMatrix();
	GL11.glPopMatrix();
	}

	public void renderTileEntityAt(TileEntity tileentity, double d, double d1, double d2,
	float f)
	{
	renderAModelAt((TileEntityReducer)tileentity, d, d1, d2, f);
	}

	private ModelCrumReducer aModel;
    private ModelCrumReducerBottom bModel;	
}