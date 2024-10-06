
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.terefereagd.TerefereagdMod;

public class TerefereagdModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TerefereagdMod.MODID);
	public static final RegistryObject<SimpleParticleType> RADIAN_PARTICLES = REGISTRY.register("radian_particles", () -> new SimpleParticleType(false));
}
