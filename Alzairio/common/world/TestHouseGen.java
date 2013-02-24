package Alzairio.common.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TestHouseGen {
	protected static int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}

	public static boolean LocationIsValidSpawn(World world, int i, int j, int k){
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

	public TestHouseGen() { }

	public static boolean generate(World world, int i, int j, int k) {
		

		world.setBlock(i + 0, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 0, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 0, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 0, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 0, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 0, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 0, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 1, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 2, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 3, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 4, Block.planks.blockID);
		world.setBlock(i + 0, j + 1, k + 5, Block.planks.blockID);
		world.setBlock(i + 0, j + 2, k + 0, Block.planks.blockID);
		world.setBlock(i + 0, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 0, j + 2, k + 2, Block.glass.blockID);
		world.setBlock(i + 0, j + 2, k + 3, Block.glass.blockID);
		world.setBlock(i + 0, j + 2, k + 4, Block.planks.blockID);
		world.setBlock(i + 0, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 0, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 1, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 1, k + 0, Block.planks.blockID);
		world.setBlock(i + 1, j + 1, k + 3, Block.bed.blockID);
		world.setBlockAndMetadata(i + 1, j + 1, k + 4, Block.bed.blockID, 8);
		world.setBlock(i + 1, j + 1, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 2, k + 0, Block.glass.blockID);
		world.setBlock(i + 1, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 1, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 2, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 2, j + 1, k + 0, Block.planks.blockID);
		
		world.setBlock(i + 2, j + 1, k + 5, Block.planks.blockID);
		world.setBlock(i + 2, j + 2, k + 0, Block.glass.blockID);
		world.setBlock(i + 2, j + 2, k + 5, Block.glass.blockID);
		world.setBlock(i + 2, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 2, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 3, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 3, j + 1, k + 0, Block.planks.blockID);
		world.setBlock(i + 3, j + 1, k + 5, Block.planks.blockID);
		world.setBlock(i + 3, j + 2, k + 0, Block.planks.blockID);
		world.setBlock(i + 3, j + 2, k + 5, Block.glass.blockID);
		world.setBlock(i + 3, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 3, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 4, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 4, j + 1, k + 4, Block.workbench.blockID);
		world.setBlock(i + 4, j + 1, k + 5, Block.planks.blockID);
		world.setBlockAndMetadata(i + 4, j + 2, k + 4, Block.stoneOvenIdle.blockID, 2);
		world.setBlock(i + 4, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 4, j + 3, k + 5, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 0, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 2, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 3, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 4, Block.planks.blockID);
		world.setBlock(i + 5, j + 0, k + 5, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 0, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 2, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 3, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 4, Block.planks.blockID);
		world.setBlock(i + 5, j + 1, k + 5, Block.planks.blockID);
		world.setBlock(i + 5, j + 2, k + 0, Block.planks.blockID);
		world.setBlock(i + 5, j + 2, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 2, k + 2, Block.glass.blockID);
		world.setBlock(i + 5, j + 2, k + 3, Block.glass.blockID);
		world.setBlock(i + 5, j + 2, k + 4, Block.planks.blockID);
		world.setBlock(i + 5, j + 2, k + 5, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 0, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 1, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 2, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 3, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 4, Block.planks.blockID);
		world.setBlock(i + 5, j + 3, k + 5, Block.planks.blockID);
		world.setBlockAndMetadataWithNotify(i + 3, j + 2, k + 1, Block.torchWood.blockID, 3);
		world.setBlockAndMetadataWithNotify(i + 4, j + 1, k + 0, Block.doorWood.blockID, 5);
		world.setBlockAndMetadataWithNotify(i + 4, j + 2, k + 0, Block.doorWood.blockID, 8);

		return true;
	}
}
