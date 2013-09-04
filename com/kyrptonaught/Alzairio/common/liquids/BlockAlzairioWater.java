package com.kyrptonaught.Alzairio.common.liquids;

import java.util.Random;

import com.kyrptonaught.Alzairio.common.Alzairio;
import com.kyrptonaught.Alzairio.common.Init.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlowing;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;

public class BlockAlzairioWater extends BlockFluidClassic{

	public BlockAlzairioWater(int Id) {
		super(Id, com.kyrptonaught.Alzairio.common.Init.Blocks.AlzFluid, Material.water);
		com.kyrptonaught.Alzairio.common.Init.Blocks.AlzFluid.setBlockID(Id); // Set the fluids block ID to this block.
	}

	// Use Register Icon as usual to get the block's icon.
	// If you want you can reuse the water texture and change the color of it by doing as I have below:

	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}
	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z)
	{
		return 0x66FF00; // HEX color code as indicated by the 0x infront. This is a greenish color.
	}
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand)
	{
		int quantaRemaining = quantaPerBlock - world.getBlockMetadata(x, y, z);
		int expQuanta = -101;

		// check adjacent block levels if non-source
		if (quantaRemaining < quantaPerBlock)
		{
			int y2 = y - densityDir;

			if (world.getBlockId(x,     y2, z    ) == blockID ||
					world.getBlockId(x - 1, y2, z    ) == blockID ||
					world.getBlockId(x + 1, y2, z    ) == blockID ||
					world.getBlockId(x,     y2, z - 1) == blockID ||
					world.getBlockId(x,     y2, z + 1) == blockID)
			{
				expQuanta = quantaPerBlock - 1;
			}
			else
			{
				int maxQuanta = -100;
				maxQuanta = getLargerQuanta(world, x - 1, y, z,     maxQuanta);
				maxQuanta = getLargerQuanta(world, x + 1, y, z,     maxQuanta);
				maxQuanta = getLargerQuanta(world, x,     y, z - 1, maxQuanta);
				maxQuanta = getLargerQuanta(world, x,     y, z + 1, maxQuanta);

				expQuanta = maxQuanta - 1;
			}

			// decay calculation
			if (expQuanta != quantaRemaining)
			{
				quantaRemaining = expQuanta;

				if (expQuanta <= 0)
				{
					world.setBlockToAir(x, y, z);
				}
				else
				{
					world.setBlockMetadataWithNotify(x, y, z, quantaPerBlock - expQuanta, 3);
					world.scheduleBlockUpdate(x, y, z, blockID, tickRate);
					world.notifyBlocksOfNeighborChange(x, y, z, blockID);
				}
			}
		}
		// This is a "source" block, set meta to zero, and send a server only update
		else if (quantaRemaining >= quantaPerBlock)
		{
			world.setBlockMetadataWithNotify(x, y, z, 0, 2);
		}

		// Flow vertically if possible
		if (canDisplace(world, x, y + densityDir, z))
		{
			flowIntoBlock(world, x, y + densityDir, z, 1);
			return;
		}

		// Flow outward if possible
		int flowMeta = quantaPerBlock - quantaRemaining + 1;
		if (flowMeta >= quantaPerBlock)
		{
			return;
		}

		if (isSourceBlock(world, x, y, z) || !isFlowingVertically(world, x, y, z))
		{
			if (world.getBlockId(x, y - densityDir, z) == blockID)
			{
				flowMeta = 1;
			}
			boolean flowTo[] = getOptimalFlowDirections(world, x, y, z);

			if (flowTo[0]) flowIntoBlock(world, x - 1, y, z,     flowMeta);
			if (flowTo[1]) flowIntoBlock(world, x + 1, y, z,     flowMeta);
			if (flowTo[2]) flowIntoBlock(world, x,     y, z - 1, flowMeta);
			if (flowTo[3]) flowIntoBlock(world, x,     y, z + 1, flowMeta);
		}
		if(world.getBlockId(x, y-1, z)== Blocks.alzadirt.blockID || world.getBlockId(x, y-1, z)== Blocks.alzastone.blockID){
			world.setBlock(x, y-1, z, this.blockID);
		}
	}
}