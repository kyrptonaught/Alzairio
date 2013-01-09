package Alzairio.common.Block;

import java.util.Random;

import net.minecraft.block.BlockGrass;
import Alzairio.common.Alzairio;

public class Blockalzadirt extends BlockGrass{

	public Blockalzadirt(int id, int texture) {
		super(id);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	
	 
	 public int idDropped(int par1, Random par2Random, int par3)
	    {
	        return Alzairio.alzadirt.idDropped(0, par2Random, par3);
	    }
	 /*	@Override
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		double var6 = par2 + par5Random.nextFloat();
	    double var8 = par3 + 0.8F;
	    double var10 = par4 + par5Random.nextFloat();
	    double var12 = 0.0D;
	    double var14 = 0.0D;
	    double var16 = 0.0D;
		par1World.spawnParticle("magicCrit", var6+1, var8+1, var10+1, var12+1, var14+1, var16+1);
	    par1World.spawnParticle("portal", var6+1, var8+1, var10+1, var12+1, var14+1, var16+1);
}
*/
}