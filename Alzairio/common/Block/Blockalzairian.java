package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Init.Blocks;
import Alzairio.common.Proxys.ClientProxyAlzairio;
public class Blockalzairian extends Block
{
	public Blockalzairian(int id) {
		super(id, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
	}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	@Override
	public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
	{
		if(par1World.getBlockId(par2+1, par3+1, par4+1) == Blocks.AlzTorch.blockID && par1World.getBlockId(par2+1, par3+1, par4-1) == Blocks.AlzTorch.blockID && par1World.getBlockId(par2-1, par3+1, par4+1) == Blocks.AlzTorch.blockID && par1World.getBlockId(par2-1, par3+1, par4-1) == Blocks.AlzTorch.blockID){
			par1World.setBlock(par2, par3+1, par4, Blocks.Teleporter.blockID,1,1);
			par1World.setBlock(par2, par3+2, par4, Blocks.Teleporter.blockID,1,1);
			
			//ClientProxyAlzairio.printMessageToPlayer("Portal Recongnized...");
		}
		return blockID;
	}
}

