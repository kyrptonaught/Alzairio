package Alzairio.common.Handlers;

import Alzairio.common.Models.ConatainerReducer;
import Alzairio.common.Models.GUIReducer;
import Alzairio.common.Models.TileEntityReducer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class ReducerGUIHandler implements IGuiHandler{
	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
	switch(id)
	{
	case 3: return new ConatainerReducer(player.inventory, (TileEntityReducer) tile_entity);
	}
	return null;
	}
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
	{
	TileEntity tile_entity = world.getBlockTileEntity(x, y, z);
	switch(id)
	{
	case 3: return new GUIReducer(player.inventory, (TileEntityReducer) tile_entity);
	}
	return null;
	}
	}