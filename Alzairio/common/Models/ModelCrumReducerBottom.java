package Alzairio.common.Models;

import net.minecraft.client.model.ModelRenderer;

public class ModelCrumReducerBottom extends ModelCrumReducer{
	 public ModelCrumReducerBottom()
	  {
	    textureWidth = 64;
	    textureHeight = 64;
	    
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(0F, 0F, 0F, 2, 4, 2);
	      Shape1.setRotationPoint(-1F, 20F, -1F);
	      Shape1.setTextureSize(64, 64);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, 0F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 0);
	      Shape2.addBox(0F, 0F, 0F, 2, 1, 1);
	      Shape2.setRotationPoint(1F, 19F, 0F);
	      Shape2.setTextureSize(64, 64);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(0F, 0F, 0F, 1, 1, 2);
	      Shape3.setRotationPoint(-1F, 19F, 1F);
	      Shape3.setTextureSize(64, 64);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 0, 0);
	      Shape4.addBox(0F, 0F, 0F, 1, 1, 2);
	      Shape4.setRotationPoint(0F, 19F, -3F);
	      Shape4.setTextureSize(64, 64);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 0F, 0F);
	      Shape5 = new ModelRenderer(this, 0, 0);
	      Shape5.addBox(0F, 0F, 0F, 2, 1, 1);
	      Shape5.setRotationPoint(-3F, 19F, -1F);
	      Shape5.setTextureSize(64, 64);
	      Shape5.mirror = true;
	      setRotation(Shape5, 0F, 0F, 0F);
	      Shape6 = new ModelRenderer(this, 0, 0);
	      Shape6.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape6.setRotationPoint(2F, 18F, 1F);
	      Shape6.setTextureSize(64, 64);
	      Shape6.mirror = true;
	      setRotation(Shape6, 0F, 0F, 0F);
	      Shape7 = new ModelRenderer(this, 0, 0);
	      Shape7.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape7.setRotationPoint(-2F, 18F, 2F);
	      Shape7.setTextureSize(64, 64);
	      Shape7.mirror = true;
	      setRotation(Shape7, 0F, 0F, 0F);
	      Shape8 = new ModelRenderer(this, 0, 0);
	      Shape8.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape8.setRotationPoint(1F, 18F, -3F);
	      Shape8.setTextureSize(64, 64);
	      Shape8.mirror = true;
	      setRotation(Shape8, 0F, 0F, 0F);
	      Shape9 = new ModelRenderer(this, 0, 0);
	      Shape9.addBox(0F, 0F, 0F, 1, 1, 1);
	      Shape9.setRotationPoint(-3F, 18F, -2F);
	      Shape9.setTextureSize(64, 64);
	      Shape9.mirror = true;
	      setRotation(Shape9, 0F, 0F, 0F);
	  }
	 private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
}
