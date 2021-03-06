package net.tslat.aoa3.item.weapon.blaster;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.tslat.aoa3.common.registration.SoundsRegister;
import net.tslat.aoa3.entity.projectiles.blaster.*;
import net.tslat.aoa3.entity.projectiles.staff.BaseEnergyShot;

public class SynthSoundCannon extends BaseBlaster {
	public SynthSoundCannon(double dmg, SoundEvent sound, int durability, int fireDelayTicks, float energyCost) {
		super(dmg, sound, durability, fireDelayTicks, energyCost);
		setUnlocalizedName("SynthSoundCannon");
		setRegistryName("aoa3:synth_sound_cannon");
	}

	@Override
	public void fire(ItemStack blaster, EntityLivingBase shooter) {
		BaseEnergyShot shot;
		SoundEvent sound;

		switch (itemRand.nextInt(5)) {
			case 0:
				shot = new EntitySoundCannonBlue(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon1;
				break;
			case 1:
				shot = new EntitySoundCannonPurple(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon2;
				break;
			case 2:
				shot = new EntitySoundCannonGreen(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon3;
				break;
			case 3:
				shot = new EntitySoundCannonRed(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon4;
				break;
			case 4:
				shot = new EntitySoundCannonOrange(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon5;
				break;
			default:
				shot = new EntitySoundCannonBlue(shooter, this, 30);
				sound = SoundsRegister.gunSynthCannon1;
				break;
		}

		shooter.world.spawnEntity(shot);
		shooter.world.playSound(null, shooter.posX, shooter.posY, shooter.posZ, sound, SoundCategory.PLAYERS, 1.0f, 1.0f);
	}
}
