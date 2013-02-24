package Alzairio.common.world;
import java.util.Random;
import java.util.logging.Level;

import cpw.mods.fml.common.IWorldGenerator;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import Alzairio.common.AlzairioLogger;
import Alzairio.common.Init.Blocks;
import Alzairio.common.*;
public class AlzairioDungeonGen extends WorldGenerator implements IWorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
				Blocks.alzadirt.blockID
		};
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.dimensionId)
		{
		case 20:
			generateAlzairio(world,random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	public boolean LocationIsValidSpawn(World world, int i, int j, int k){
		int distanceToAir = 0;
		int checkID = world.getBlockId(i, j, k);

		while (checkID != 0){
			distanceToAir++;
			checkID = world.getBlockId(i, j + distanceToAir, k);
		}

		if (distanceToAir > 3){
			return false;
		}
		j += distanceToAir - 1;

		int blockID = world.getBlockId(i, j, k);
		int blockIDAbove = world.getBlockId(i, j+1, k);
		int blockIDBelow = world.getBlockId(i, j-1, k);
		for (int x : GetValidSpawnBlocks()){
			if (blockIDAbove != 0){
				return false;
			}
			if (blockID == x){
				return true;
			}else if (blockID == Block.snow.blockID && blockIDBelow == x){
				return true;
			}
		}
		return false;
	}

	public AlzairioDungeonGen() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 12, j, k) || !LocationIsValidSpawn(world, i + 12, j, k + 10) || !LocationIsValidSpawn(world, i, j, k + 10))
		{
			return false;
		}

		
			
			AlzairioLogger.log(Level.INFO, "Coord are "+ i +", "+ j +", "+k);
			world.setBlockAndMetadata(i + 0, j + 0, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockWithNotify(i + 0, j + 0, k + 4, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 0, j + 0, k + 5, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 0, j + 0, k + 6, Block.stoneSingleSlab.blockID);
			world.setBlockAndMetadata(i + 0, j + 0, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 1, j + 0, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 1, j + 0, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 1, j + 0, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 1, j + 0, k + 6, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 1, j + 0, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 1, j + 1, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 1, j + 1, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 2, j + 0, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 2, j + 0, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 2, j + 0, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 2, j + 0, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 2, j + 0, k + 7, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 2, j + 1, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 2, j + 1, k + 4, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 2, j + 1, k + 5, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 2, j + 1, k + 6, Block.stoneSingleSlab.blockID);
			world.setBlockAndMetadata(i + 2, j + 1, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 2, j + 2, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 2, j + 2, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 3, j + 0, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 0, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 0, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 0, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 0, k + 7, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 3, j + 1, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 3, j + 1, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 1, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 3, j + 1, k + 6, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 3, j + 1, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 3, j + 2, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 3, j + 2, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 3, j + 3, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 3, j + 3, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 4, j + 0, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 0, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 0, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 0, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 0, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 1, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 1, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 1, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 1, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 4, j + 1, k + 7, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 4, j + 2, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 4, j + 2, k + 4, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 4, j + 2, k + 5, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 4, j + 2, k + 6, Block.stoneSingleSlab.blockID);
			world.setBlockAndMetadata(i + 4, j + 2, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 4, j + 3, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 4, j + 3, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 4, j + 4, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 4, j + 4, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 5, j + 0, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 0, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 0, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 0, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 0, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 1, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 1, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 1, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 1, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 1, k + 7, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 5, j + 2, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 5, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 5, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 5, j + 2, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 3, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 3, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 4, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 4, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 5, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 5, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 6, k + 3, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 6, k + 4, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 6, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 6, k + 6, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 5, j + 6, k + 7, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 6, j + 1, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 6, j + 2, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 2, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 3, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 3, k + 4, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 6, j + 3, k + 5, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 6, j + 3, k + 6, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 6, j + 3, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 4, k + 3, Blocks.alzastone.blockID);

			world.setBlock(i + 6, j + 4, k + 4, Blocks.Cannon.blockID);
			world.setBlock(i + 6, j + 4, k + 5, Blocks.Cannon.blockID);
			world.setBlock(i + 6, j + 4, k + 6, Blocks.Cannon.blockID);
			world.setBlock(i + 6, j + 4, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 5, k + 3, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 6, j + 5, k + 4, Block.stoneSingleSlab.blockID, 8);
			world.setBlockAndMetadata(i + 6, j + 5, k + 5, Block.stoneSingleSlab.blockID, 8);
			world.setBlockAndMetadata(i + 6, j + 5, k + 6, Block.stoneSingleSlab.blockID, 8);
			world.setBlock(i + 6, j + 5, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 6, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 7, j + 0, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 0, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 0, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 1, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 4, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 6, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 9, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 7, j + 1, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 7, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 3, Block.stoneDoubleSlab.blockID);
			world.setBlock(i + 7, j + 3, k + 4, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 7, j + 3, k + 5, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 7, j + 3, k + 6, Block.stoneSingleSlab.blockID);
			world.setBlock(i + 7, j + 3, k + 7, Block.stoneDoubleSlab.blockID);
			world.setBlock(i + 7, j + 3, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 3, Block.stoneDoubleSlab.blockID);
			world.setBlock(i + 7, j + 4, k + 7, Block.stoneDoubleSlab.blockID);
			world.setBlock(i + 7, j + 4, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 3, Block.stoneDoubleSlab.blockID);
			world.setBlockAndMetadata(i + 7, j + 5, k + 4, Block.stoneSingleSlab.blockID, 8);
			world.setBlockAndMetadata(i + 7, j + 5, k + 5, Block.stoneSingleSlab.blockID, 8);
			world.setBlockAndMetadata(i + 7, j + 5, k + 6, Block.stoneSingleSlab.blockID, 8);
			world.setBlock(i + 7, j + 5, k + 7, Block.stoneDoubleSlab.blockID);
			world.setBlock(i + 7, j + 5, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 7, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 8, j + 1, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 8, j + 1, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 8, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 2, k + 3, Blocks.Wall.blockID);
			world.setBlock(i + 8, j + 2, k + 4, Blocks.Wall.blockID);
			world.setBlock(i + 8, j + 2, k + 5, Blocks.Wall.blockID);
			world.setBlock(i + 8, j + 2, k + 6, Blocks.Wall.blockID);
			world.setBlock(i + 8, j + 2, k + 7, Blocks.Wall.blockID);
			world.setBlock(i + 8, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 8, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 3, Blocks.Wall.blockID);
			world.setBlock(i + 9, j + 2, k + 4, Blocks.Wall.blockID);
			world.setBlock(i + 9, j + 2, k + 5, Blocks.Wall.blockID);
			world.setBlock(i + 9, j + 2, k + 6, Blocks.Wall.blockID);
			world.setBlock(i + 9, j + 2, k + 7, Blocks.Wall.blockID);
			world.setBlock(i + 9, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 9, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 10, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 11, j + 1, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 11, j + 1, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 11, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 3, k + 5, Block.workbench.blockID);
			world.setBlock(i + 11, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 11, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlockAndMetadata(i + 12, j + 0, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 0, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 0, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 0, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 1, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 4, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 5, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 6, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 9, Block.cobblestoneMossy.blockID, 1);
			world.setBlockAndMetadata(i + 12, j + 1, k + 10, Block.cobblestoneMossy.blockID, 1);
			world.setBlock(i + 12, j + 2, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 2, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 3, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 4, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 5, k + 10, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 0, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 1, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 2, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 3, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 4, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 5, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 6, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 7, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 8, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 9, Blocks.alzastone.blockID);
			world.setBlock(i + 12, j + 6, k + 10, Blocks.alzastone.blockID);
			world.setBlockAndMetadataWithNotify(i + 9, j + 4, k + 1, Blocks.AlzTorch.blockID, 3);
			world.setBlockAndMetadataWithNotify(i + 9, j + 4, k + 9, Blocks.AlzTorch.blockID, 4);
			world.setBlockAndMetadataWithNotify(i + 10, j + 4, k + 1,Blocks.AlzTorch.blockID, 3);
			world.setBlockAndMetadataWithNotify(i + 10, j + 4, k + 9,Blocks.AlzTorch.blockID, 4);
            
			return true;
		
	}
	public void generateAlzairio(World world, Random rand, int y , int z)
	{
		for(int a = 0; a < 90; a++)
		{
			int RandPosX = y + rand.nextInt(16);
			int RandPosY = rand.nextInt(150);
			int RandPosZ = z + rand.nextInt(16);
			(new AlzairioDungeonGen()).generate(world, rand, RandPosX, RandPosY, RandPosZ);
		}
	}


}