package Alzairio.common.Items;

import Alzairio.common.Proxys.CommonProxyAlzairio;
import Alzairio.common.entity.EntityBeam;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;

public class ItemAlzBow extends ItemBow{

	public ItemAlzBow(int par1) {
		super(par1);
		this.setCreativeTab(Alzairio.common.Alzairio.tabalzairio2);
		  this.bFull3D = true;
		 
	}
	@Override
    public String getTextureFile() {

        return CommonProxyAlzairio.Items_png;
    } 
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	    {
	        int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;

	        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, var6);
	        MinecraftForge.EVENT_BUS.post(event);
	        if (event.isCanceled())
	        {
	            return;
	        }
	        var6 = event.charge;

	        boolean var5 = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

	        if (var5 || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
	        {
	            float var7 = (float)var6 / 20.0F;
	            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

	            if ((double)var7 < 0.1D)
	            {
	                return;
	            }

	            if (var7 > 1.0F)
	            {
	                var7 = 1.0F;
	            }

	            EntityBeam var8 = new EntityBeam(par2World, par3EntityPlayer, var7 * 2.0F);

	            if (var7 == 1.0F)
	            {
	                var8.setIsCritical(true);
	            }

	            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

	            if (var9 > 0)
	            {
	                var8.setDamage(var8.getDamage() + (double)var9 * 0.5D + 0.5D);
	            }

	            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

	            if (var10 > 0)
	            {
	                var8.setKnockbackStrength(var10);
	            }

	            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
	            {
	                var8.setFire(100);
	            }

	            par1ItemStack.damageItem(1, par3EntityPlayer);
	            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

	            if (var5)
	            {
	                var8.canBePickedUp = 2;
	            }
	            else
	            {
	                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
	            }

	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(var8);
	            }
	        }
	    }
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
        {
            return event.result;
        }

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Alzairio.common.Init.Items.AlzairianIngot.itemID))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }
}