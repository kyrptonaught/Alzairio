package Alzairio.common.Models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAlzaT extends ModelBase
{
	//fields
	ModelRenderer Body;
	ModelRenderer Head;
	ModelRenderer ArmR;
	ModelRenderer ArmL;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape6;
	ModelRenderer Shape7;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape10;
	ModelRenderer Shape11;
	ModelRenderer Shape12;
	ModelRenderer Shape13;
	ModelRenderer Shape5;

	public ModelAlzaT()
	{
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this, 0, 0);
		Body.addBox(-5.5F, 1F, -6F, 11, 11, 6);
		Body.setRotationPoint(-0.5F, -5F, -1.5F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0.4537856F, 0F, 0F);
		Head = new ModelRenderer(this, 0, 0);
		Head.addBox(-3F, -5F, -2F, 5, 5, 5);
		Head.setRotationPoint(0F, -3F, -3F);
		Head.setTextureSize(64, 32);
		Head.mirror = true;
		setRotation(Head, -0.0349066F, 0F, 0F);
		ArmR = new ModelRenderer(this, 0, 0);
		ArmR.addBox(0F, 0F, -2F, 4, 4, 4);
		ArmR.setRotationPoint(4F, -3F, -3F);
		ArmR.setTextureSize(64, 32);
		ArmR.mirror = true;
		setRotation(ArmR, 0F, 0F, 0F);
		ArmL = new ModelRenderer(this, 0, 0);
		ArmL.addBox(-4F, 0F, -2F, 4, 4, 4);
		ArmL.setRotationPoint(-5F, -3F, -3F);
		ArmL.setTextureSize(64, 32);
		ArmL.mirror = true;
		setRotation(ArmL, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(-2F, -1F, -1F, 2, 2, 2);
		Shape3.setRotationPoint(-9F, -1F, -3F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 0);
		Shape4.addBox(0F, -1F, -1F, 2, 2, 2);
		Shape4.setRotationPoint(8F, -1F, -3F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape1.setRotationPoint(0F, -7F, -5.5F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 1, 1, 1);
		Shape2.setRotationPoint(-2F, -7F, -5.5F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 0, 0);
		Shape6.addBox(0F, -1F, -4F, 2, 2, 5);
		Shape6.setRotationPoint(9F, -1F, -4F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 0, 0);
		Shape7.addBox(-2F, -1F, -4F, 2, 2, 5);
		Shape7.setRotationPoint(-10F, -1F, -4F);
		Shape7.setTextureSize(64, 32);
		Shape7.mirror = true;
		setRotation(Shape7, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 0, 0);
		Shape8.addBox(-2F, 0F, -1F, 4, 5, 4);
		Shape8.setRotationPoint(3F, 7F, -1F);
		Shape8.setTextureSize(64, 32);
		Shape8.mirror = true;
		setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 0, 0);
		Shape9.addBox(-2F, 0F, -1F, 4, 5, 4);
		Shape9.setRotationPoint(-4F, 7F, -1F);
		Shape9.setTextureSize(64, 32);
		Shape9.mirror = true;
		setRotation(Shape9, 0F, 0F, 0F);
		Shape10 = new ModelRenderer(this, 0, 0);
		Shape10.addBox(-2F, 0F, 0F, 4, 3, 4);
		Shape10.setRotationPoint(3F, 11F, -2F);
		Shape10.setTextureSize(64, 32);
		Shape10.mirror = true;
		setRotation(Shape10, -0.2974289F, 0F, 0F);
		Shape11 = new ModelRenderer(this, 0, 0);
		Shape11.addBox(-2F, 0F, 0F, 4, 3, 4);
		Shape11.setRotationPoint(-4F, 11F, -2F);
		Shape11.setTextureSize(64, 32);
		Shape11.mirror = true;
		setRotation(Shape11, -0.2974289F, 0F, 0F);
		Shape12 = new ModelRenderer(this, 0, 0);
		Shape12.addBox(-2F, 0F, -4F, 4, 5, 4);
		Shape12.setRotationPoint(3F, 14F, 1F);
		Shape12.setTextureSize(64, 32);
		Shape12.mirror = true;
		setRotation(Shape12, 0F, 0F, 0F);
		Shape13 = new ModelRenderer(this, 0, 0);
		Shape13.addBox(-2F, 0F, -4F, 4, 5, 4);
		Shape13.setRotationPoint(-4F, 14F, 1F);
		Shape13.setTextureSize(64, 32);
		Shape13.mirror = true;
		setRotation(Shape13, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 0, 0);
		Shape5.addBox(0F, 0F, 0F, 2, 3, 2);
		Shape5.setRotationPoint(9F, -1F, -8F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0.0174533F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Body.render(f5);
		Head.render(f5);
		ArmR.render(f5);
		ArmL.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape6.render(f5);
		Shape7.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape10.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape5.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	public void renderModel(float f1)
	{
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		Body.renderWithRotation(f1);
		Head.render(f1);
		ArmR.render(f1);
		ArmL.render(f1);
		Shape3.render(f1);
		Shape4.render(f1);
		Shape1.render(f1);
		Shape2.render(f1);
		Shape6.render(f1);
		Shape7.render(f1);
		Shape8.render(f1);
		Shape9.render(f1);
		Shape10.render(f1);
		Shape11.render(f1);
		Shape12.render(f1);
		Shape13.render(f1);
		Shape5.render(f1);  
		GL11.glScalef(1.0F, 1.0F, 1.0F);
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
	}

}
