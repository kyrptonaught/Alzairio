package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
public class Blockspeedy extends Block {
	public Blockspeedy(int id) {
		super(id, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	

	}

	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int i, int j, int k)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox(i + f, j, k + f, i + 1 - f, j + 1 - f, k + 1 - f);
	}
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int i, int j, int k)
	{
		float f = 0.0625F;
		return AxisAlignedBB.getBoundingBox(i + f, j, k + f, i + 1 - f, j + 1, k + 1 - f);
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity entity)
	{
			   entity.motionX *= 1.5D;
               entity.motionZ *= 1.5D;
	
	}



}

