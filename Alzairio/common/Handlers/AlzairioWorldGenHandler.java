package Alzairio.common.Handlers;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class AlzairioWorldGenHandler implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		generateSurface(random,chunkX*16,chunkZ*16,world);

	}

	public void generateSurface(Random random, int x, int z, World w){
		
		for(int ii=0;ii<20;ii++){ //This makes it gen multiple times in each chunk
		int posX = x + random.nextInt(16); //X coordinate to gen at
		int posY = random.nextInt(40); //Y coordinate less than 40 to gen at
		int posZ = z + random.nextInt(16); //Z coordinate to gen at
		new WorldGenMinable(Alzairio.common.Init.Blocks.alzairianOre.blockID,random.nextInt(9)).generate(w, random, posX, posY, posZ); //The gen call
		}
		
	}
		
}


