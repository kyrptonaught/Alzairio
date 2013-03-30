package Alzairio.common;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.server.MinecraftServer;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
public class AlzairioCMD extends CommandBase implements ICommand {
public static String msg;
	@Override
	public int compareTo(Object arg0) {

		return 0;
	}

	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}
	@Override
	public String getCommandName() {

		return "alzairio";
	}

	@Override
	public String getCommandUsage(ICommandSender var1) {

		return "/" + this.getCommandName() + " <variable>";
	}

	@Override
	public List getCommandAliases() {

		return null;
	}

	@Override
	public void processCommand(ICommandSender var1, String[] var2) {
		if(var2[0].equals("")){
			var1.sendChatToPlayer("Proper usage is version,message");
		}
		
		if(var2[0].equals("version")){
			var1.sendChatToPlayer("The current Version is: "+Alzairio.MVersion);
		}
		else if (var2[0].equals("message")) {
			Side side = FMLCommonHandler.instance().getSide();
			
			AlzairioCMD.PacketSend(side, var1);
			
		}
	
	}
	public static String ReadMessage(){
		  try {
			    URL url = new URL("http://mc-brikbroz.webs.com/Alzairio%20Mod/test.txt");
			   
			    BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			    br.read();
			    msg =  br.readLine();
			    AlzairioLogger.log(Level.INFO, "Message: "+ msg);
			    }
			    catch (IOException e) {
					  
				  }
	return msg;
	}
	public static void PacketSend(Side side, ICommandSender var1){
		 ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
	     DataOutputStream outputStream = new DataOutputStream(bos);
	     try {
	         
	    	     outputStream.writeChars(ReadMessage());
	    	    outputStream.writeUTF(var1.toString());
	            
	     } catch (Exception ex) {
	             ex.printStackTrace();
	     }
	     
	     Packet250CustomPayload packet = new Packet250CustomPayload();
	     packet.channel = "Alzairio3";
	     packet.data = bos.toByteArray();
	     packet.length = bos.size();
	     
	    
	     if (side == Side.SERVER) {
	             // We are on the server side.
	          
	             PacketDispatcher.sendPacketToAllPlayers(packet);
	     } else if (side == Side.CLIENT) {
	             // We are on the client side.
	
	     } else {
	             // We are on the Bukkit server.
	     }
	}
	@Override
	public boolean canCommandSenderUseCommand(ICommandSender var1) {

		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender var1, String[] var2) {

		return null;
	}

	public boolean isUsernameIndex(int var1) {

		return false;
	}
	 protected String[] getListOfPlayers()
	    {
	        return MinecraftServer.getServer().getAllUsernames();
	    }
}
