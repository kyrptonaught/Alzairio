package Alzairio.common.Block;


import java.util.Iterator;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import Alzairio.common.Models.CrumReducerRender;
import Alzairio.common.Models.TileEntityReducer;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class BlockReducer extends BlockContainer {
	private Class TileEntityReducer;
	private static final ForgeDirection DOWN = null;
	private Random random = new Random();
	public static int x = 1;
	public static int y=1;
	public static int z=1;
	public BlockReducer(int id, int texture, Class tile) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio);	
		TileEntityReducer = tile;
			}
	public TileEntity getBlockEntity() {

		try{

		return (TileEntity)TileEntityReducer.newInstance();


		}
		catch(Exception exception){

		throw new RuntimeException(exception);

		}
	}
		public int quantityDropped(Random par1Random)
		{
		return 0;
		}


		public int getRenderType()
		{
		return -1;
		}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}
	public boolean isOpaqueCube()
	{
	    return false;
	}

	
	
	public boolean renderAsNormalBlock()
	{
	    return false;
	}
	@Override
	public TileEntity createNewTileEntity(World var1) {
	
	return new TileEntityReducer();
	}

	public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5)
	{
    x=1;
	}
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		  Object var10 = (TileEntityReducer)par1World.getBlockTileEntity(par2, par3, par4);
	         if (var10 == null)
	         {
	                 return true;
	         }
	         else if (par1World.isBlockSolidOnSide(par2, par3 + 1, par4, DOWN))
	         {
	                 return true;
	         }
	         else if (isOcelotBlockingChest(par1World, par2, par3, par4))
	         {
	                 return true;
	         }
	         else if (par1World.getBlockId(par2 - 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 - 1, par3 + 1, par4, DOWN) || isOcelotBlockingChest(par1World, par2 - 1, par3, par4)))
	         {
	                 return true;
	         }
	         else if (par1World.getBlockId(par2 + 1, par3, par4) == this.blockID && (par1World.isBlockSolidOnSide(par2 + 1, par3 + 1, par4, DOWN) || isOcelotBlockingChest(par1World, par2 + 1, par3, par4)))
	         {
	                 return true;
	         }
	         else if (par1World.getBlockId(par2, par3, par4 - 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 - 1, DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 - 1)))
	         {
	                 return true;
	         }
	         else if (par1World.getBlockId(par2, par3, par4 + 1) == this.blockID && (par1World.isBlockSolidOnSide(par2, par3 + 1, par4 + 1, DOWN) || isOcelotBlockingChest(par1World, par2, par3, par4 + 1)))
	         {
	                 return true;
	         }
	         else
	         {
	                 
	                 if (!par5EntityPlayer.isSneaking())
	{
	x = par2;
	y = par3;
	z = par4;
	                	 TileEntityReducer var101 = (TileEntityReducer) par1World.getBlockTileEntity(par2, par3, par4);
	if (var101 != null)
	{
	        par5EntityPlayer.openGui(Alzairio.common.Alzairio.instance, 3, par1World, par2, par3, par4);
	
	}
	return true;
	}
	else
	{
	return false;
	}
	}
	
	}
	public static boolean isOcelotBlockingChest(World par0World, int par1, int par2, int par3)
	{
	         Iterator var4 = par0World.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)par1, (double)(par2 + 1), (double)par3, (double)(par1 + 1), (double)(par2 + 2), (double)(par3 + 1))).iterator();
	         EntityOcelot var6;
	         do
	         {
	                 if (!var4.hasNext())
	                 {
	                         return false;
	                 }
	                 EntityOcelot var5 = (EntityOcelot)var4.next();
	                 var6 = (EntityOcelot)var5;
	         }
	         while (!var6.isSitting());
	         return true;
	}
}
