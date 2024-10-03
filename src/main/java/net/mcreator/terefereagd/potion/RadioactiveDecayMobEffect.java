
package net.mcreator.terefereagd.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.terefereagd.procedures.RadioactiveDecayEffectStartedappliedProcedure;

public class RadioactiveDecayMobEffect extends MobEffect {
	public RadioactiveDecayMobEffect() {
		super(MobEffectCategory.HARMFUL, -15048701);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RadioactiveDecayEffectStartedappliedProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
