package Alzairio.common.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
public class WorldProviderAlzairio extends WorldProvider{

	@Override
	public String getDimensionName() {
		
		return "20";
	}
	 public void registerWorldChunkManager()
	    {
	        worldChunkMgr = new WorldChunkManagerHell(Alzairio.common.Alzairio.AlzairioBiome, 0.8F, 0.1F);
	    }
	 
	    public IChunkProvider getChunkProvider()
	    {
	        return new ChunkProviderAlzairio(worldObj, worldObj.getSeed(), true);
	    }
	 
	    public float setSunSize()
	    {
	        return 2.0F;
	    }
	 
	    public float setMoonSize()
	    {
	        return 0.5F;
	    }
	    public boolean canRespawnHere()
	    {
	        return true;
	    }
	 
	 public String func_80007_l() 
	 {
	  return null;
	 }
	}

