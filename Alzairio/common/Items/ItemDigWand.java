package Alzairio.common.Items;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Init.Blocks;

public class ItemDigWand extends ItemTool{
	public static final Block[] blocksEffectiveAgainst = {Blocks.alzadirt, Block.grass,Block.dirt  };
	public ItemDigWand(int id, EnumToolMaterial par2EnumToolMaterial) {
		super(id , 8F, par2EnumToolMaterial, blocksEffectiveAgainst);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
		this.setMaxDamage(20);
		this.bFull3D = true;

	}	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	}	
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{	
		par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
		if(par1ItemStack.getItemDamage() == 20){
			par1ItemStack.stackSize--;
		}
		while(par5 >3) {
			world.setBlock(par4,par5,par6, 0);
			world.spawnParticle("portal", par4, par5, par6, 0, -1, 0);
			world.spawnParticle("largesmoke", par4, par5+1, par6, 0, -1, 0);
			par5--;
		}


		return true; 

	}
}
