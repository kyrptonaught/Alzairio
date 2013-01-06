package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blocktrampoline extends Block{
	public Blocktrampoline(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
			
	}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	 @Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        float var5 = 0.125F;
	        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool(par2, par3, par4, par2 + 1, par3 + 1 - var5, par4 + 1);
	    }
	 public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity, Minecraft minecraft)
	    {
		 entity.fallDistance = 0;
 
		 entity.motionY += 2.0;
	    }
	
	@Override
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
		entity.fallDistance = 0;
            
		entity.motionY += 2.0;
                   
   ((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.jump.getId(), 60, 5));
     
   }
}
