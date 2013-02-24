package Alzairio.common.Block;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;
import net.minecraft.block.BlockLadder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blockscaffold extends BlockLadder{
	public Blockscaffold(int id, int texture) 
	{
		super(id, texture);
		//this.setCreativeTab(Alzairio.tabalzairio);	
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
	public int getRenderType()
    {
        return 6;
    } 
	 @Override
	public void breakBlock(World par1World, int par2, int par3, int par4, int par5, int par6)
	    {
		  int var6 = par1World.getBlockMetadata(par2, par3, par4);
	        boolean var7 = false;

	        if (var6 == 2 && par1World.isBlockSolidOnSide(par2, par3, par4 + 1, NORTH))
	        {
	            var7 = true;
	        }

	        if (var6 == 3 && par1World.isBlockSolidOnSide(par2, par3, par4 - 1, SOUTH))
	        {
	            var7 = true;
	        }

	        if (var6 == 4 && par1World.isBlockSolidOnSide(par2 + 1, par3, par4, WEST))
	        {
	            var7 = true;
	        }

	        if (var6 == 5 && par1World.isBlockSolidOnSide(par2 - 1, par3, par4, EAST))
	        {
	            var7 = true;
	        }

	        if (!var7)
	        {
	           // this.dropBlockAsItem(par1World, par2, par3, par4, var6, 0);
	            par1World.setBlockWithNotify(par2, par3, par4, 0);
	        }

	        super.onNeighborBlockChange(par1World, par2, par3, par4, par5);
	    }
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
		
    }

	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	    {
	        return false;
	    }
	    @Override
		public boolean isLadder(World world, int x, int y, int z)
	    {
	        return true;
	    }
	 
}
