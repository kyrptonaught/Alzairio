package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockspeedyS extends BlockStairs{
	 private  Block modelBlock;
     public BlockspeedyS(int par1,Block modelBlockx,int par2)
     {
             super(par1, modelBlockx, par2);
             blockIndexInTexture = par2;
             this.modelBlock = modelBlockx;
             this.setLightOpacity(0);
             this.setCreativeTab(Alzairio.tabalzairio);
     }
     //this deals with the block texture. 
     @Override
     public int getBlockTextureFromSideAndMetadata(int par1, int par2)
     {
             return blockIndexInTexture;
     }
             @Override
			public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	 @Override
	public int getRenderType()
	    {
	        return 10;
	    }
	 @Override
	public boolean isOpaqueCube()
	    {
	        return false;
	    }

	   @Override
	public boolean renderAsNormalBlock()
	    {
	        return false;
	    }
	  
	   
	  
	@Override
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityLiving) {
			((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 5));
			//par5Entity.motionY += 2.0;
			((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.jump.getId(), 20, 5));

}
}
}


