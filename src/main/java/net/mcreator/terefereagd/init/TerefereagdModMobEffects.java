
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.terefereagd.potion.RadioactiveDecayMobEffect;
import net.mcreator.terefereagd.TerefereagdMod;

public class TerefereagdModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TerefereagdMod.MODID);
	public static final RegistryObject<MobEffect> RADIOACTIVE_DECAY = REGISTRY.register("radioactive_decay", () -> new RadioactiveDecayMobEffect());
}
