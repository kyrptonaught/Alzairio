package Alzairio.common.world;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import Alzairio.common.Alzairio;

public class BiomeGenAlzairio2  extends BiomeGenBase
{
    public BiomeGenAlzairio2(int par1)
    {
        super(par1);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.topBlock = (byte)Alzairio.cloudus.blockID;
        this.fillerBlock = (byte)Alzairio.speedy.blockID;
        this.theBiomeDecorator.treesPerChunk = 1;
        this.theBiomeDecorator.deadBushPerChunk = 1;
        this.theBiomeDecorator.reedsPerChunk = 1;
        this.theBiomeDecorator.cactiPerChunk = 1;
    }
    @Override
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
      super.decorate(par1World, par2Random, par3, par4);
    }
}
