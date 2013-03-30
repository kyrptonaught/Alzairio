package Alzairio.common.Handlers;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class TickHandler implements ITickHandler{
	private Minecraft mc;
	String str;
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData)
	{
		if (type.equals(EnumSet.of(TickType.RENDER)))
		{
			onRenderTick();
		}
		else if (type.equals(EnumSet.of(TickType.WORLD))){

			onWorldTick();

		}
		else if (type.equals(EnumSet.of(TickType.CLIENT)))
		{   
			GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
			if (guiscreen != null)
			{
				onTickInGUI(guiscreen);
			} else {
				onTickInGame();
			}
		}
	}
	@Override
	public EnumSet<TickType> ticks() {

		return EnumSet.of(TickType.CLIENT, TickType.PLAYER, TickType.RENDER,TickType.WORLD); 

	}

	@Override
	public String getLabel() {
		return "Alzairio tick handler";
	}

	public void onRenderTick()
	{
		/*FMLClientHandler.instance().getClient();
		Minecraft par1Minecraft = Minecraft.getMinecraft(); 

		GuiIngame gig = new GuiIngame(par1Minecraft);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, par1Minecraft.renderEngine.getTexture(CommonProxyAlzairio.CrumMeter));
		FontRenderer fr = par1Minecraft.fontRenderer;
		if(par1Minecraft.isFullScreen()){ 
			gig.drawTexturedModalRect(5, 265, 0, 0, 47, 47); // Fullscreen
			gig.drawString(fr,"C: "+Alzairio.common.Alzairio.Crum , 27, 285, 3);

		}else if (par1Minecraft.displayHeight > 481){
			gig.drawTexturedModalRect(5, 250, 0, 0, 47, 47); // Maximized Screen
			gig.drawString(fr,"C: "+Alzairio.common.Alzairio.Crum , 27, 270, 3);

		}else{ 
			gig.drawTexturedModalRect(5, 200, 0, 0, 47, 47); // Smaller Screen
			//fr.drawString("C: "+Alzairio.common.Alzairio.Crum, 15, 200,2);
			gig.drawString(fr,"C: "+Alzairio.common.Alzairio.Crum , 27, 220, 3);
		
		}
		//AlzairioLogger.log(Level.INFO, "Size :"+ par1Minecraft.displayHeight);
		/* FontRenderer var1 = this.mc.fontRenderer;
         ScaledResolution var2 = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
         int var3 = var2.getScaledWidth();
         short var4 = 182;
         int var5 = var3 / 2 - var4 / 2;
         byte var7 = 12;

         String var8 = "Crum: "+Integer.toString(Alzairio.common.Alzairio.Crum);
         var1.drawStringWithShadow(var8, var3 / 2 - var1.getStringWidth(var8) / 2, var7 - 10, 16777215);
		 */  
	}
	public void onTickInGUI(GuiScreen guiscreen)
	{

	}

	public void onTickInGame()
	{
		/*	try {
	        // Create a URL for the desired page
	        URL url = new URL("http://mc-brikbroz.webs.com/Alzairio%20Mod/test.txt");       

	        // Read all the text returned by the server
	        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
	        String str;
	        while ((str = in.readLine()) != null) {
	            str = in.readLine().toString();
	            System.out.println(str);
	            // str is one line of text; readLine() strips the newline character(s)
	        }
	     //   in.close();
	    } catch (MalformedURLException e) {
	    } catch (IOException e) {
	    } catch (NullPointerException e){

	    }
		 */
		EntityPlayer thePlayer = FMLClientHandler.instance().getClient().thePlayer;
		World theWorld = FMLClientHandler.instance().getClient().theWorld;

		ItemStack itemstack = thePlayer.inventory.armorItemInSlot(2);//Chest
		ItemStack itemstack2 = thePlayer.inventory.armorItemInSlot(0);//Boots
		ItemStack itemstack3 = thePlayer.inventory.armorItemInSlot(1);//Legs
		ItemStack itemstack4 = thePlayer.inventory.armorItemInSlot(3);//Helm
		if(itemstack2 != null && itemstack2.itemID == Alzairio.common.Init.Items.Boots.itemID){
		}else 
			thePlayer.capabilities.setPlayerWalkSpeed(0.1F);
	}

	public void onWorldTick()  {

	}
}
