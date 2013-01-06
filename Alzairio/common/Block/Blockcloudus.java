package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blockcloudus extends Block{

	public Blockcloudus(int id, int texture) {
		super(id, texture, Material.cloth);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	 @Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	    {
	        return null;
	    }
	
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, EntityPlayer entityplayer, Entity par5Entity)
	{
		//entityplayer.addStat(Alzairio.cloudusAchieve, 1);
		par5Entity.fallDistance = 0;

	}
}

