package net.mcreator.terefereagd.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.terefereagd.entity.MicroguyEntity;

public class MicroguyModel extends GeoModel<MicroguyEntity> {
	@Override
	public ResourceLocation getAnimationResource(MicroguyEntity entity) {
		return new ResourceLocation("terefereagd", "animations/emmo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MicroguyEntity entity) {
		return new ResourceLocation("terefereagd", "geo/emmo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MicroguyEntity entity) {
		return new ResourceLocation("terefereagd", "textures/entities/" + entity.getTexture() + ".png");
	}

}
