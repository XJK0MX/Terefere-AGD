
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.terefereagd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.terefereagd.TerefereagdMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TerefereagdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TerefereagdMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEREFERE_AGD = REGISTRY.register("terefere_agd",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.terefereagd.terefere_agd")).icon(() -> new ItemStack(TerefereagdModItems.RADIAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TerefereagdModItems.RADIAN.get());
				tabData.accept(TerefereagdModBlocks.RADIAN_ORE.get().asItem());
				tabData.accept(TerefereagdModItems.OIL_BUCKET.get());
				tabData.accept(TerefereagdModItems.MICROGUY_SPAWN_EGG.get());
				tabData.accept(TerefereagdModBlocks.BLACK_DIRT.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TerefereagdModItems.RADIAN_PICKAXE.get());
		}
	}
}
