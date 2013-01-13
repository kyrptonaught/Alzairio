package Alzairio.common.LandBoat;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelLandBoat2 extends ModelBase
{
	  //fields
	    ModelRenderer front;
	    ModelRenderer back;
	    ModelRenderer side1;
	    ModelRenderer side2;
	    ModelRenderer Shape1;
	    ModelRenderer Shape2;
	    ModelRenderer Shape3;
	    ModelRenderer Shape4;
	    ModelRenderer side3;
	    ModelRenderer side4;
	  
	  public ModelLandBoat2()
	  {
	    textureWidth = 64;
	    textureHeight = 32;
	    
	      front = new ModelRenderer(this, 0, 0);
	      front.addBox(0F, 0F, 0F, 16, 1, 17);
	      front.setRotationPoint(-8F, 5F, -7F);
	      front.setTextureSize(64, 32);
	      front.mirror = true;
	      setRotation(front, 0F, 0F, 0F);
	      back = new ModelRenderer(this, 0, 0);
	      back.addBox(0F, 0F, 0F, 16, 1, 1);
	      back.setRotationPoint(-8F, 5F, 9F);
	      back.setTextureSize(64, 32);
	      back.mirror = true;
	      setRotation(back, 0F, 0F, 0F);
	      side1 = new ModelRenderer(this, 0, 0);
	      side1.addBox(0F, 0F, 0F, 1, 2, 18);
	      side1.setRotationPoint(7F, 5F, -8F);
	      side1.setTextureSize(64, 32);
	      side1.mirror = true;
	      setRotation(side1, 0F, 0F, 0F);
	      side2 = new ModelRenderer(this, 0, 0);
	      side2.addBox(0F, 0F, 0F, 1, 2, 18);
	      side2.setRotationPoint(-8F, 5F, -8F);
	      side2.setTextureSize(64, 32);
	      side2.mirror = true;
	      setRotation(side2, 0F, 0F, 0F);
	      Shape1 = new ModelRenderer(this, 0, 0);
	      Shape1.addBox(0F, 0F, 0F, 16, 1, 5);
	      Shape1.setRotationPoint(7F, 5F, -6F);
	      Shape1.setTextureSize(64, 32);
	      Shape1.mirror = true;
	      setRotation(Shape1, 0F, -0.3490659F, 0F);
	      Shape2 = new ModelRenderer(this, 0, 0);
	      Shape2.addBox(-16F, 0F, 0F, 16, 1, 5);
	      Shape2.setRotationPoint(-7F, 5F, -6F);
	      Shape2.setTextureSize(64, 32);
	      Shape2.mirror = true;
	      setRotation(Shape2, 0F, 0.3490659F, 0F);
	      Shape3 = new ModelRenderer(this, 0, 0);
	      Shape3.addBox(0F, 0F, 0F, 15, 1, 9);
	      Shape3.setRotationPoint(7F, 5F, -1F);
	      Shape3.setTextureSize(64, 32);
	      Shape3.mirror = true;
	      setRotation(Shape3, 0F, 0F, 0F);
	      Shape4 = new ModelRenderer(this, 0, 0);
	      Shape4.addBox(0F, 0F, 0F, 15, 1, 9);
	      Shape4.setRotationPoint(-22F, 5F, -1F);
	      Shape4.setTextureSize(64, 32);
	      Shape4.mirror = true;
	      setRotation(Shape4, 0F, 0F, 0F);
	      side3 = new ModelRenderer(this, 0, 0);
	      side3.addBox(0F, 0F, 0F, 1, 2, 9);
	      side3.setRotationPoint(21F, 4F, -1F);
	      side3.setTextureSize(64, 32);
	      side3.mirror = true;
	      setRotation(side3, 0F, 0F, 0F);
	      side4 = new ModelRenderer(this, 0, 0);
	      side4.addBox(0F, 0F, 0F, 1, 2, 9);
	      side4.setRotationPoint(-22F, 4F, -1F);
	      side4.setTextureSize(64, 32);
	      side4.mirror = true;
	      setRotation(side4, 0F, 0F, 0F);
	  }
	  
	  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	  {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    front.render(f5);
	    back.render(f5);
	    side1.render(f5);
	    side2.render(f5);
	    Shape1.render(f5);
	    Shape2.render(f5);
	    Shape3.render(f5);
	    Shape4.render(f5);
	    side3.render(f5);
	    side4.render(f5);
	  }
	  
	  private void setRotation(ModelRenderer model, float x, float y, float z)
	  {
	    model.rotateAngleX = x;
	    model.rotateAngleY = y;
	    model.rotateAngleZ = z;
	  }
	  
	  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
	  {
	    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
	  }


	}
