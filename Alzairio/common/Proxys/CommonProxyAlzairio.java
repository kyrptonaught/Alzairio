package Alzairio.common.Proxys;


import net.minecraftforge.oredict.OreDictionary;

public class CommonProxyAlzairio {

	public static String Entity =       "/Alzairio/textures/Entity.png";
	public static String Armour_png =   "/Alzairio/textures/armour.png";
	public static String Armour2_png =   "/Alzairio/textures/armour2.png";
	public static String alzairio_png = "/Alzairio/textures/alzairio.png";
	public static String LandBoat_png = "/Alzairio/textures/LandBoat.png";
	public static String JetPack_png =  "%blur%/Alzairio/textures/Jetpack.png";
	public static String Logo_png =     "/Alzairio/textures/Logo.png";
	public static String CrumMeter =    "/Alzairio/textures/Crum.png";
	public static String container =    "/Alzairio/textures/container.png";
	public  void registerRenderThings()
	{
	}



	public void registerOre(){ //Ore dictionary
		OreDictionary.registerOre("AlzairianOre", Alzairio.common.Init.Blocks.alzairianOre); //Basic item registration

	}
	public int addArmor(String armorName){
		return 0;
	}



	public void registerRenderEntitys() {


	}
}
