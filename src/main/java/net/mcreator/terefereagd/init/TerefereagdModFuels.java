
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TerefereagdModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TerefereagdModItems.RADIAN.get())
			event.setBurnTime(1600);
	}
}
