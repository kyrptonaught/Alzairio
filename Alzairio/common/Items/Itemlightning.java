package Alzairio.common.Items;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.List;
import java.util.Random;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import Alzairio.common.Alzairio;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Itemlightning extends Item {
	public Itemlightning(int id) {
		super(id);
		maxStackSize = 1;
		this.setCreativeTab(Alzairio.tabalzairio2);	
	    this.setMaxDamage(20);
	    this.bFull3D = true;
	   
	}	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer playerEntity, List par3List, boolean par4)
	{
	par3List.add("Lightning Wand. Increases Crum by 2");//the color code trick works here aswell 
	}
	
	 public void updateIcons(IconRegister iconRegister)
	   {
      this.iconIndex = iconRegister.registerIcon(Alzairio.modid + ":" + this.getUnlocalizedName());
  }	
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer Entityplayer, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	 {	
	par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
		 if(par1ItemStack.getItemDamage() == 20){
			 par1ItemStack.stackSize--;
		 }
		
	  Side side = FMLCommonHandler.instance().getEffectiveSide();
	
	  
	  EntityLightningBolt Lightning = new EntityLightningBolt(world,1,1,1);
      Lightning.setPosition(par4,par5,par6);
      world.spawnEntityInWorld(Lightning);
	
	
	  double posX =  par4;
      double posy =  par5;
      double posz =  par6; 
	   Alzairio.Crum++;
	  //ClientProxyAlzairio.SaveCrumValue();
	 
	 
	   Random random = new Random();
	     double PosX = posX;
	     double PosY = posy;
	     double PosZ = posz;
	     
	     ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
	     DataOutputStream outputStream = new DataOutputStream(bos);
	     try {
	         
	    	     outputStream.writeDouble(PosX);
	    	     outputStream.writeDouble(PosY);
	    	     outputStream.writeDouble(PosZ);
	            
	     } catch (Exception ex) {
	             ex.printStackTrace();
	     }
	     
	     Packet250CustomPayload packet = new Packet250CustomPayload();
	     packet.channel = "Alzairio2";
	     packet.data = bos.toByteArray();
	     packet.length = bos.size();
	     
	    
	     if (side == Side.SERVER) {
	             // We are on the server side.
	             EntityPlayerMP player = (EntityPlayerMP) Entityplayer;
	             PacketDispatcher.sendPacketToAllPlayers(packet);
	     } else if (side == Side.CLIENT) {
	             // We are on the client side.
	             EntityClientPlayerMP player = (EntityClientPlayerMP) Entityplayer;
	            
	     } else {
	             // We are on the Bukkit server.
	     }
		return true;
	     
	  }  
	 }

