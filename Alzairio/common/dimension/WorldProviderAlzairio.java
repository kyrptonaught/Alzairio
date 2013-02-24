package Alzairio.common.dimension;

import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class WorldProviderAlzairio extends WorldProvider{

	 public void registerWorldChunkManager()
	 {
	  this.worldChunkMgr = new WorldChunkManagerHell(Alzairio.common.Alzairio.AlzairioBiome, 0.8F, 0.1F);
	  this.dimensionId = Alzairio.common.Alzairio.dimension;
	 }
	 @Override
	 public String getDimensionName() 
	 {
	  return "Alzairio";
	 }
	 public boolean canDoLightning(Chunk chunk)
	    {
	        return true;
	    }
	 @SideOnly(Side.CLIENT)
	    public boolean isSkyColored()
	    {
	        return false;
	    }
	 @Override
	 public String getWelcomeMessage()
	    {
	            return "Entering the Alzairio dimension";
	    }
	 public ChunkCoordinates getEntrancePortalLocation()
	    {
	        return new ChunkCoordinates(1, 50, 1);
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