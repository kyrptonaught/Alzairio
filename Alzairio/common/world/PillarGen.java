package Alzairio.common.world;

import java.util.Random;
import java.util.logging.Level;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import Alzairio.common.AlzairioLogger;
import Alzairio.common.Init.Blocks;

public class PillarGen extends WorldGenerator implements IWorldGenerator{
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
	public void generateAlzairio(World world, Random rand, int y , int z)
	{
		for(int a = 0; a < 90; a++)
		{
			int RandPosX = y + rand.nextInt(16);
			int RandPosY = rand.nextInt(150);
			int RandPosZ = z + rand.nextInt(16);
			(new PillarGen()).generate(world, rand, RandPosX, RandPosY, RandPosZ);
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

	public PillarGen() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 3, j, k) || !LocationIsValidSpawn(world, i + 3, j, k + 3) || !LocationIsValidSpawn(world, i, j, k + 3))
		{
			return false;
		}

		//AlzairioLogger.log(Level.INFO, "Coords are "+ i +", "+ j +", "+k);

		world.setBlock(i + 0, j + 0, k + 0, Blocks.launcher.blockID);
		world.setBlock(i + 0, j + 0, k + 1, Blocks.launcher.blockID);
		world.setBlock(i + 0, j + 0, k + 2, Blocks.launcher.blockID);
		world.setBlockAndMetadata(i + 0, j + 0, k + 3, Blocks.launcher.blockID, 3);
		world.setBlockAndMetadata(i + 1, j + 0, k + 0, Blocks.launcher.blockID, 2);
		world.setBlock(i + 1, j + 0, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 0, k + 2, Blocks.speedy.blockID);
		world.setBlockAndMetadata(i + 1, j + 0, k + 3, Blocks.launcher.blockID, 3);
		world.setBlock(i + 1, j + 1, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 1, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 2, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 2, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 3, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 3, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 4, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 4, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 5, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 5, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 6, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 6, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 1, j + 7, k + 1, Blocks.speedyS.blockID);
		world.setBlockAndMetadata(i + 1, j + 7, k + 2, Blocks.speedyS.blockID, 3);
		world.setBlockAndMetadata(i + 2, j + 0, k + 0, Blocks.launcher.blockID, 2);
		world.setBlock(i + 2, j + 0, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 0, k + 2, Blocks.speedy.blockID);
		world.setBlockAndMetadata(i + 2, j + 0, k + 3, Blocks.launcher.blockID, 3);
		world.setBlock(i + 2, j + 1, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 1, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 2, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 2, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 3, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 3, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 4, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 4, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 5, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 5, k + 2, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 6, k + 1, Blocks.speedy.blockID);
		world.setBlock(i + 2, j + 6, k + 2, Blocks.speedy.blockID);
		world.setBlockAndMetadata(i + 2, j + 7, k + 1, Blocks.speedyS.blockID, 2);
		world.setBlockAndMetadata(i + 2, j + 7, k + 2, Blocks.speedyS.blockID, 1);
		world.setBlockAndMetadata(i + 3, j + 0, k + 0, Blocks.launcher.blockID, 2);
		world.setBlockAndMetadata(i + 3, j + 0, k + 1, Blocks.launcher.blockID, 1);
		world.setBlockAndMetadata(i + 3, j + 0, k + 2, Blocks.launcher.blockID, 1);
		world.setBlockAndMetadata(i + 3, j + 0, k + 3, Blocks.launcher.blockID, 1);

		return true;
	}

}
