
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.terefereagd.item.RadianItem;
import net.mcreator.terefereagd.TerefereagdMod;

public class TerefereagdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TerefereagdMod.MODID);
	public static final RegistryObject<Item> RADIAN = REGISTRY.register("radian", () -> new RadianItem());
	// Start of user code block custom items
	// End of user code block custom items
}
