package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

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
	public void onEntityWalking(World world, int x, int y, int z, Entity par5Entity)
    {
		    par5Entity.motionX *= 2.0D;
	        par5Entity.motionZ *= 2.0D;        
   ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 5));
     
   }
			
       

}

