package Alzairio.common.dimension;

import java.awt.Color;
import java.util.Random;
import Alzairio.common.dimension.WorldGenAlzTree;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;


public class BiomeGenAlzairio extends BiomeGenBase{

	private WorldGenerator WorldGenAlzTree;
	public BiomeGenAlzairio(int par1)
	{
		super(par1);
		this.setBiomeName("AlzaLand");
		this.topBlock=(byte) Alzairio.common.Init.Blocks.alzadirt.blockID;
		this.fillerBlock=(byte) Alzairio.common.Init.Blocks.alzastone.blockID;
		this.setColor(0xE42D17);
		this.setEnableSnow();
		this.color =  0xE42D17;
		this.waterColorMultiplier = 0xE42D17;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCaveCreatureList.clear();
		this.theBiomeDecorator.treesPerChunk = 5;
		this.WorldGenAlzTree = new WorldGenAlzTree(false);
	}
	public int getBiomeGrassColor()
	{
		double d0 = (double)this.getFloatTemperature();
		double d1 = (double)this.getFloatRainfall();
		return 0x004C99;//((ColorizerGrass.getGrassColor(d0, d1) & 16711422) + 5115470) / 2;
	}
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.WorldGenAlzTree : this.worldGeneratorTrees));
	}
}
