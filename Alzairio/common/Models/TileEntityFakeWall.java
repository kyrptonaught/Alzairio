package Alzairio.common.Models;

import Alzairio.common.Block.BlockWall;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntityFakeWall extends TileEntity {

	public void processActivate(EntityPlayer par5EntityPlayer, World world) {
              world.notifyBlockChange(xCoord, yCoord, zCoord, 2);
}
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		super.readFromNBT(nbt);

		BlockWall.Mimic = nbt.getInteger("Mimic");
	}
@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		super.writeToNBT(nbt);
		nbt.setInteger("Mimic", BlockWall.Mimic);

	}
	@Override
	public void updateEntity()
	{  NBTTagCompound nbt = new NBTTagCompound();
		this.writeToNBT(nbt);
	}
}
