package Alzairio.common.Items;


import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;

public class ItemsMetaWand extends Item{

	public ItemsMetaWand(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
		this.setMaxDamage(50);
		this.bFull3D = true;

	}	
	public void updateIcons(IconRegister iconRegister)
	{
		this.iconIndex = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{	
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
		if(par1ItemStack.getItemDamage() == 50){
			par1ItemStack.stackSize--;
		}
		World w = world;
		int x = par4;
		int y = par5;
		int z = par6;
		int CurMeta = w.getBlockMetadata(x, y, z);

		if(w.getBlockId(x, y, z) == Block.planks.blockID){ //If blockId at x y z is planks:
			w.setBlock(x, y, z, w.getBlockMetadata(x, y, z)+1); //Increase the metadata

			if(w.getBlockMetadata(x, y, z) == 4){ //If metadata is 4
				w.setBlock(x, y, z, 0); //Reset to 0
			}

		}else if(w.getBlockId(x, y, z) == Block.plantRed.blockID){ //If block id is red plant
			w.setBlock(x, y, z, Block.plantYellow.blockID); //Changing block to yellow plant

		}else if(w.getBlockId(x, y, z) == Block.plantYellow.blockID){ //Vice Versa
			w.setBlock(x, y, z, Block.plantRed.blockID);
		}else if(w.getBlockId(x, y, z) == Block.cobblestone.blockID){ //If block is cobble
			w.setBlock(x, y, z, Block.cobblestoneMossy.blockID); //Set to mossy
		}else if(w.getBlockId(x, y, z) == Block.cobblestoneMossy.blockID){ //Vice versa
			w.setBlock(x, y, z, Block.cobblestone.blockID);
		}else if(w.getBlockId(x, y, z)== Block.wood.blockID){
			w.setBlock(x, y, z, w.getBlockMetadata(x, y, z)+1);	
			if(w.getBlockMetadata(x, y, z) == 4){ //If metadata is 4
				w.setBlock(x, y, z, 0); //Reset to 0
			}
		}else if(w.getBlockId(x, y, z)== Block.woodSingleSlab.blockID){
			w.setBlock(x, y, z, w.getBlockMetadata(x, y, z)+1);	
			if(w.getBlockMetadata(x, y, z) == 4){ //If metadata is 4
				w.setBlock(x, y, z, 0); //Reset to 0
			}
		}
		else  w.setBlock(x, y, z, CurMeta+1);
		return true;

	}
}
