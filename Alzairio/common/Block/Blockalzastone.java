package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import Alzairio.common.Alzairio;

public class Blockalzastone extends Block{

	public Blockalzastone(int id) {
		super(id, Material.rock);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override 
	public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.blockIcon = par1IconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
	    }	
}
