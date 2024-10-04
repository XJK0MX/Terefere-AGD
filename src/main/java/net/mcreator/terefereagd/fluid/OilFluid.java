
package net.mcreator.terefereagd.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.terefereagd.init.TerefereagdModItems;
import net.mcreator.terefereagd.init.TerefereagdModFluids;
import net.mcreator.terefereagd.init.TerefereagdModFluidTypes;
import net.mcreator.terefereagd.init.TerefereagdModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> TerefereagdModFluidTypes.OIL_TYPE.get(), () -> TerefereagdModFluids.OIL.get(), () -> TerefereagdModFluids.FLOWING_OIL.get())
			.explosionResistance(100f).tickRate(40).bucket(() -> TerefereagdModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) TerefereagdModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
