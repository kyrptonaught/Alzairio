package Alzairio.common.Block;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
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
		public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	    {
	            float f = 0.0625F;
	            return AxisAlignedBB.getBoundingBox((float)i + f, j, (float)k + f, (float)(i + 1) - f, (float)(j + 1) - f, (float)(k + 1) - f);
	   }
	  @Override
	    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k)
	    {
	            float f = 0.0625F;
	            return AxisAlignedBB.getBoundingBox((float)i + f, j, (float)k + f, (float)(i + 1) - f, j + 1, (float)(k + 1) - f);
	    }
	
	  @Override
		 public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
		    {
		 entity.motionY = 0.4;
		  Side side = FMLCommonHandler.instance().getEffectiveSide();
	    	 if (side == Side.CLIENT) {
		  ClientProxyAlzairio.IncreaseSpeed(0.3f);
  }   
		    
		    }  
	
}


