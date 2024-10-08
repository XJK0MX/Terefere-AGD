
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.terefereagd.item.RadianItem;
import net.mcreator.terefereagd.item.OilItem;
import net.mcreator.terefereagd.item.MicroPickaxeItem;
import net.mcreator.terefereagd.TerefereagdMod;

public class TerefereagdModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TerefereagdMod.MODID);
	public static final RegistryObject<Item> RADIAN = REGISTRY.register("radian", () -> new RadianItem());
	public static final RegistryObject<Item> RADIAN_ORE = block(TerefereagdModBlocks.RADIAN_ORE);
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());
	public static final RegistryObject<Item> MICROGUY_SPAWN_EGG = REGISTRY.register("microguy_spawn_egg", () -> new ForgeSpawnEggItem(TerefereagdModEntities.MICROGUY, -16711936, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> BLACK_DIRT = block(TerefereagdModBlocks.BLACK_DIRT);
	public static final RegistryObject<Item> RADIAN_PICKAXE = REGISTRY.register("radian_pickaxe", () -> new MicroPickaxeItem());
	public static final RegistryObject<Item> APOCALYPSE_GRASS_BLOCK = block(TerefereagdModBlocks.APOCALYPSE_GRASS_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
