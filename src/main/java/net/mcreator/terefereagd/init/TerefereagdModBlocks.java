
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.terefereagd.block.RadianOreBlock;
import net.mcreator.terefereagd.block.OilBlock;
import net.mcreator.terefereagd.TerefereagdMod;

public class TerefereagdModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TerefereagdMod.MODID);
	public static final RegistryObject<Block> RADIAN_ORE = REGISTRY.register("radian_ore", () -> new RadianOreBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
