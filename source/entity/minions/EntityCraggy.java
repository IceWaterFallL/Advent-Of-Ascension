package net.tslat.aoa3.entity.minions;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.SoundsRegister;

import javax.annotation.Nullable;

public class EntityCraggy extends AoAMinion {
	public static final float entityWidth = 1.0f;

	public EntityCraggy(final World world){
		super(world, -1, entityWidth, 0.9375f);
	}

	@Override
	public float getEyeHeight() {
		return 0.8f;
	}

	@Override
	protected double getBaseMoveSpeed() {
		return 0.3d;
	}

	@Override
	protected double getBaseMaxHealth() {
		return 180;
	}

	@Override
	protected boolean isHostile() {
		return true;
	}

	@Override
	protected double getBaseMeleeDamage() {
		return 10.0d;
	}

	@Override
	public boolean attackEntityAsMob(Entity entity) {
		if (super.attackEntityAsMob(entity)) {
			entity.setFire(5);

			return true;
		}
		else {
			return false;
		}
	}

	@Nullable
	@Override
	protected SoundEvent getAmbientSound() {
		return SoundsRegister.mobDraggyLiving;
	}

	@Nullable
	@Override
	protected SoundEvent getHurtSound(DamageSource source) {
		return SoundsRegister.mobDraggyHit;
	}

	@Nullable
	@Override
	protected SoundEvent getDeathSound() {
		return SoundsRegister.mobDraggyDeath;
	}
}
