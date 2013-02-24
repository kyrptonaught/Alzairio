package Alzairio.common.world;

import java.util.Random;

import Alzairio.common.entity.EntityAlza;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;


public class BiomeGenAlzairio extends BiomeGenBase
{
    public BiomeGenAlzairio(int par1)
    {
        super(par1);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Alzairio.common.Init.Blocks.alzadirt.blockID;
        this.fillerBlock = (byte)Alzairio.common.Init.Blocks.alzastone.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 1;
        this.theBiomeDecorator.reedsPerChunk = 1;
        this.waterColorMultiplier = 14745518;
        this.theBiomeDecorator.cactiPerChunk = 1;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityAlza.class, 10, 4, 4));
          }
    @Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
      super.decorate(par1World, par2Random, par3, par4);
    }
    public int getBiomeGrassColor()
    {
       return -9999991;
    }
}

