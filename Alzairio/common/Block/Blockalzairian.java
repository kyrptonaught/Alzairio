package Alzairio.common.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Alzairio.common.Alzairio;
import Alzairio.common.Proxys.CommonProxyAlzairio;

public class Blockalzairian extends Block
{
	public Blockalzairian(int id, int texture) {
		super(id, texture, Material.ground);
		this.setCreativeTab(Alzairio.tabalzairio);	
		}
@Override
public String getTextureFile() {
	return CommonProxyAlzairio.alzairio_png;
}
}

