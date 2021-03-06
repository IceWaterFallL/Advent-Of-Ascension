package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.entity.projectiles.staff.BaseEnergyShot;
import net.tslat.aoa3.entity.projectiles.staff.EntityGhoulShot;
import net.tslat.aoa3.utils.StringUtil;

import java.util.List;

public class GhoulGasser extends BaseBlaster {
	public GhoulGasser(double dmg, SoundEvent sound, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, sound, durability, fireDelayTicks, energyCost);
		setUnlocalizedName("GhoulGasser");
		setRegistryName("aoa3:ghoul_gasser");
	}

	@Override
	public void fire(ItemStack blaster, EntityLivingBase shooter) {
		shooter.world.spawnEntity(new EntityGhoulShot(shooter, this, 60));
	}

	@Override
	public void doEntityImpact(BaseEnergyShot shot, Entity target, EntityLivingBase shooter) {
		super.doEntityImpact(shot, target, shooter);

		if (target instanceof EntityLivingBase)
			((EntityLivingBase)target).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 100, 1, true, true));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag flag) {
		tooltip.add(StringUtil.getColourLocaleString("items.description.damage.weak", TextFormatting.DARK_GREEN));
		super.addInformation(stack, world, tooltip, flag);
	}
}
