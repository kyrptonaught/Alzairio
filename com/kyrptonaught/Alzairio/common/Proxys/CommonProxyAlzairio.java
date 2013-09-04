package com.kyrptonaught.Alzairio.common.Proxys;


import net.minecraftforge.oredict.OreDictionary;

public class CommonProxyAlzairio {

	public static String Logo_png =     "/Alzairio/textures/Logo.png";
	
	public void registerOre(){ //Ore dictionary
		OreDictionary.registerOre("AlzairianOre", com.kyrptonaught.Alzairio.common.Init.Blocks.alzairianOre); //Basic item registration

	}
	public int addArmor(String armorName){
		return 0;
	}



	public void registerRenderEntitys() {


	}

}
