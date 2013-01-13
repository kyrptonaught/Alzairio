package Alzairio.common.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
public class WorldProviderAlzairio extends WorldProvider{

	 public void registerWorldChunkManager()
	 {
	  this.worldChunkMgr = new WorldChunkManagerHell(Alzairio.common.Alzairio.AlzairioBiome, 0.8F, 0.1F);
	  this.dimensionId = Alzairio.common.Alzairio.dimension;
	 }
	 
	 public String getDimensionName() 
	 {
	  return "Alzairio";
	 }
	 
	 public boolean canRespawnHere()
	 {
	  return true;
	 }
	 public String getSaveFolder()
	    {
	        return "Alzairio Dimension";
	    }
 
	 public double getMovementFactor()
	    {
	  return 2.0;
	    } 
	 @Override
	 public IChunkProvider createChunkGenerator()
	 {
	  return new ChunkProviderAlzairio(worldObj, worldObj.getSeed(), true);
	 }
	}