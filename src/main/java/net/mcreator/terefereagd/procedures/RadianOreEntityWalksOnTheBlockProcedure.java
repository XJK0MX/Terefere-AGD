package net.mcreator.terefereagd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.terefereagd.init.TerefereagdModMobEffects;
import net.mcreator.terefereagd.TerefereagdMod;

public class RadianOreEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TerefereagdMod.queueServerWork(100, () -> {
			if (entity.onGround()) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(TerefereagdModMobEffects.RADIOACTIVE_DECAY.get(), 60, 0));
			}
		});
	}
}
