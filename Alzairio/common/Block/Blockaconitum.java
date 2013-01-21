package Alzairio.common.Block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blockaconitum extends Block{
	
	public Blockaconitum(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
	@Override
	public String getTextureFile() {
		return CommonProxyAlzairio.alzairio_png;
	}


	@Override
	@SideOnly(Side.CLIENT)
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityLiving) {
		par5Entity.attackEntityFrom(DamageSource.generic, 4);
		
		//((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 40, 1));

}
}
}