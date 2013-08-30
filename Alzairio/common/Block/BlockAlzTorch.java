package Alzairio.common.Block;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.ClientProxyAlzairio;

public class BlockAlzTorch extends BlockTorch{

	public String par = "flame";
	public BlockAlzTorch(int par1) {
		super(par1);
		this.setCreativeTab(Alzairio.tabalzairio);
		this.setLightValue(1.0F);
		this.setTickRandomly(true);
	}

	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	@Override
	public int getRenderType()
	{
		return 2;
	}
	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		int var6 = par1World.getBlockMetadata(par2, par3, par4);
		double var7 = par2 + 0.5F;
		double var9 = par3 + 0.7F;
		double var11 = par4 + 0.5F;
		double var13 = 0.2199999988079071D;
		double var15 = 0.27000001072883606D;

/*		if (var6 == 1)
		{
			par1World.spawnParticle(par, var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("magicCrit", var7 - var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
		}
		else if (var6 == 2)
		{
			par1World.spawnParticle(par, var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("flame", var7 + var15, var9 + var13, var11, 0.0D, 0.0D, 0.0D);
		}
		else if (var6 == 3)
		{
			par1World.spawnParticle(par, var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("magicCrit", var7, var9 + var13, var11 - var15, 0.0D, 0.0D, 0.0D);
		}
		else if (var6 == 4)
		{
			par1World.spawnParticle(par, var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("magicCrit", var7, var9 + var13, var11 + var15, 0.0D, 0.0D, 0.0D);
		}
		else
		{*/
			par1World.spawnParticle(par, var7, var9, var11, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("magicCrit", var7, var9, var11, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("magicCrit", var7, var9+1, var11, 0.0D, 0.0D, 0.0D);
			par1World.spawnParticle("enchantmenttable", var7, var9+2, var11, 0.0D, 0.0D, 0.0D);
			
			//}
	}
}
