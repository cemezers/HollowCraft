package fan.teamchery.hollowknight.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import fan.teamchery.hollowknight.entity.RadianceEntity;

public class RadianceModel extends AnimatedGeoModel<RadianceEntity> {
	@Override
	public ResourceLocation getAnimationResource(RadianceEntity entity) {
		return new ResourceLocation("hollowknight", "animations/radiance.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RadianceEntity entity) {
		return new ResourceLocation("hollowknight", "geo/radiance.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RadianceEntity entity) {
		return new ResourceLocation("hollowknight", "textures/entities/" + entity.getTexture() + ".png");
	}

}
