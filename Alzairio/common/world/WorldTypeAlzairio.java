package Alzairio.common.world;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import Alzairio.common.Alzairio;

public class WorldTypeAlzairio extends WorldType
{
public WorldTypeAlzairio(int par1, String par2Str)
{
super(par1, par2Str);
}

@Override
public String getTranslateName()
{
return "Alzairio";
}
@Override
public WorldChunkManager getChunkManager(World var1)
{
return new WorldChunkManagerHell(Alzairio.AlzairioBiome, 0.5F, 0.5F);
}
}