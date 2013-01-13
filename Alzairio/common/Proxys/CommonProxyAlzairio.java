package Alzairio.common.Proxys;

import net.minecraftforge.oredict.OreDictionary;

public class CommonProxyAlzairio {
	
	public static String alzairio_png = "/Alzairio/textures/alzairio.png";
	public static String LandBoat_png = "/Alzairio/textures/LandBoat.png";
	public static String Items_png = "/Alzairio/textures/Items.png";
	public static String Grass_png = "/Alzairio/textures/Grass.png";
	
	public void registerRenderThings()
{

}
	
	

	public void registerOre(){ //Ore dictionary
		OreDictionary.registerOre("AlzairianOre", Alzairio.common.Init.Blocks.alzairianOre); //Basic item registration

	}
	public int addArmor(String armorName){
		return 0;
		}
}
