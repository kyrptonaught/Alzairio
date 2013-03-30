package Alzairio.common.Handlers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import Alzairio.common.Proxys.ClientProxyAlzairio;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
public class PacketHandler implements IPacketHandler, IGuiHandler{

	public static int adjustMimic;
    public double PosX; 
    public double PosY;
	public double PosZ;
	public double posx;
	public double posy;
	public double posz;
	@Override
     public void onPacketData(INetworkManager manager,
                     Packet250CustomPayload packet,Player player) {
             
             if (packet.channel.equals("Alzairio")) {
                     handleRandom(packet);
             }
             else if(packet.channel.equals("Alzairio2")){
            	 handleRandom2(packet);
             }
             else if (packet.channel.equals("JetPack")){
            	 handleJetPack(packet);
             }
             else if (packet.channel.equals("JetPack2")){
              handleJetPack(packet);
             }
             else if (packet.channel.equals("Alzairio3")){
                 handleMessage(packet); 
                 } 
	}
     
     private void handleRandom(Packet250CustomPayload packet) {
             DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
             
           
             
             try {
            	   adjustMimic = inputStream.readInt();
            	   Alzairio.common.Block.BlockWall.Mimic= adjustMimic;
         
                        	 
             } catch (IOException e) {
                     e.printStackTrace();
                     return;
             }
           Mimicpacket(); 
     }
     private void handleMessage(Packet250CustomPayload packet) {
         DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
         
       
         
         try {
        	   String player = inputStream.readUTF();
        	   Side side = FMLCommonHandler.instance().getSide();
        	   if(side.isClient()){
        		   ClientProxyAlzairio.printMessageToPlayer(ClientProxyAlzairio.ReadMessage());
        	   }
        	 
     
                    	 
         } catch (IOException e) {
                 e.printStackTrace();
                 return;
         }
      
 }
     private void Mimicpacket() {
    	 ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
    	 DataOutputStream outputStream = new DataOutputStream(bos);
    	 try {
    	     outputStream.writeInt(adjustMimic);
    		    
    	 } catch (Exception ex) {
    	         ex.printStackTrace();
    	 }
    	 
    	 Packet250CustomPayload packet2 = new Packet250CustomPayload();
    	 packet2.channel = "Alzairio";
    	 packet2.data = bos.toByteArray();
    	 packet2.length = bos.size();
    	 
    	 Side side = FMLCommonHandler.instance().getEffectiveSide();
    	 if (side == Side.SERVER) {
    	         // We are on the server side.
    	          PacketDispatcher.sendPacketToAllPlayers(packet2);
    	 } else if (side == Side.CLIENT) {
    	         // We are on the client side.
    	         
    	    
    	 } else {
    	         // We are on the Bukkit server.
    	 }
	}

	private void handleJetPack(Packet250CustomPayload packet) {
         DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
         
       
         
         try {
        	  posx = inputStream.readDouble();
        	  posy = inputStream.readDouble();
        	  posz = inputStream.readDouble();
        	  
                    	 
         } catch (IOException e) {
                 e.printStackTrace();
                 return;
         }
         Side side = FMLCommonHandler.instance().getEffectiveSide();
         if (side == Side.CLIENT) {   
        	 ClientProxyAlzairio.SpawnParticle(posx, posy, posz);
        	     }
         JetPackpacket2();
	     }
	  
private void JetPackpacket2() {
 ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
 DataOutputStream outputStream = new DataOutputStream(bos);
 try {
     
	     outputStream.writeDouble(posx);
	     outputStream.writeDouble(posy);
	     outputStream.writeDouble(posz);
        
 } catch (Exception ex) {
         ex.printStackTrace();
 }
 
 Packet250CustomPayload packet2 = new Packet250CustomPayload();
 packet2.channel = "JetPack2";
 packet2.data = bos.toByteArray();
 packet2.length = bos.size();
 
 Side side = FMLCommonHandler.instance().getEffectiveSide();
 if (side == Side.SERVER) {
         // We are on the server side.
          PacketDispatcher.sendPacketToAllPlayers(packet2);
 } else if (side == Side.CLIENT) {
         // We are on the client side.
         
    
 } else {
         // We are on the Bukkit server.
 }
	} 

private void handleRandom2(Packet250CustomPayload packet) {
         DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
         
       
         
         try {
        	  PosX = inputStream.readDouble();
        	  PosY = inputStream.readDouble();
        	  PosZ = inputStream.readDouble();
        	  
                    	 
         } catch (IOException e) {
                 e.printStackTrace();
                 return;
         }
         Side side = FMLCommonHandler.instance().getEffectiveSide();
	     if (side == Side.CLIENT) {   
	 ClientProxyAlzairio.SpawnLightning(PosX, PosY, PosZ);
	     }
	   }	
     @Override
         	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
         			int x, int y, int z) {
         		return null;
         	}

         	@Override
         	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
         			int x, int y, int z) {
         		return null;
         	}
         	
}

