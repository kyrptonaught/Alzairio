package Alzairio.common.Block;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
public class Blockspeedy extends Block {
	public Blockspeedy(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
			
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
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
		  Side side = FMLCommonHandler.instance().getEffectiveSide();
	    	 if (side == Side.CLIENT) {
			ClientProxyAlzairio.IncreaseSpeed(0.3f);
	    }
   }
			
       

}

