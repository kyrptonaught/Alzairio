package com.kyrptonaught.Alzairio.common.dimension;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;

import com.kyrptonaught.Alzairio.common.Alzairio;
import com.kyrptonaught.Alzairio.common.Init.Blocks;
import com.kyrptonaught.Alzairio.common.Proxys.ClientProxyAlzairio;
import com.kyrptonaught.Alzairio.common.dimension.WorldGenAlzTree;

import net.minecraft.block.Block;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;


public class BiomeGenAlzairio extends BiomeGenBase{

	private WorldGenerator WorldGenAlzTree;
	private WorldGenerator theWorldGenerator;
	public BiomeGenAlzairio(int par1)
	{
		super(par1);
		this.theWorldGenerator = new WorldGenMinable(Block.silverfish.blockID, 8);
		this.setBiomeName("Alzario Dimension");
		this.topBlock=(byte) Blocks.alzadirt.blockID;
		this.fillerBlock=(byte) Blocks.alzastone.blockID;
		this.setColor(0xE42D17);
		this.setEnableSnow();
		this.color = 0xE42D17;
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
		//double d0 = (double)this.getFloatTemperature();
		//double d1 = (double)this.getFloatRainfall();
		return 0x004C99;//((ColorizerGrass.getGrassColor(d0, d1) & 16711422) + 5115470) / 2;
	}
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.WorldGenAlzTree : this.worldGeneratorTrees));
	}
	public void decorate(World par1World, Random par2Random, int par3, int par4)
	{
		super.decorate(par1World, par2Random, par3, par4);

		int k = 3 + par2Random.nextInt(6);
		int l;
		int i1;
		int j1;
		for (l = 0; l < k; ++l)
		{
			i1 = par3 + par2Random.nextInt(16);
			j1 = par2Random.nextInt(28) + 4;
			int k1 = par4 + par2Random.nextInt(16);
			int l1 = par1World.getBlockId(i1, j1, k1);
			;
			if (l1 == Blocks.alzastone.blockID)
			{
				par1World.setBlock(i1, j1, k1, Blocks.alzairianOre.blockID, 0, 2);
			}
			int y = j1+par2Random.nextInt(150);
			if(par1World.getBlockId(i1, y, k1) == Blocks.alzadirt.blockID){
				par1World.setBlock(i1, y, k1, Blocks.aconitum.blockID);
			}
		}
		for (k = 0; k < 7; ++k)
		{
			l = par3 + par2Random.nextInt(16);
			i1 = par2Random.nextInt(64);
			j1 = par4 + par2Random.nextInt(16);
			this.theWorldGenerator.generate(par1World, par2Random, l, i1, j1);
		}
	}
}
