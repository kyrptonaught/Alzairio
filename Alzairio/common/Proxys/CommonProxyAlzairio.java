package Alzairio.common.Proxys;

import net.minecraftforge.oredict.OreDictionary;
import Alzairio.common.Alzairio;

public class CommonProxyAlzairio {
	
	public static String alzairio_png = "/Alzairio/textures/alzairio.png";
	public void registerRenderThings()
{

}
	public void registerOre(){ //Ore dictionary
		OreDictionary.registerOre("AlzairianOre", Alzairio.alzairianOre); //Basic item registration

	}
	public int addArmor(String armorName){
		return 0;
		}
}
