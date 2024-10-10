package net.mcreator.terefereagd.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.terefereagd.init.TerefereagdModMobEffects;

public class MicroPickaxeLivingEntityIsHitWithToolProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(TerefereagdModMobEffects.RADIOACTIVE_DECAY.get(), 35, 1, false, false));
	}
}
