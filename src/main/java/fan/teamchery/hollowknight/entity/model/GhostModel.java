package fan.teamchery.hollowknight.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import fan.teamchery.hollowknight.entity.GhostEntity;

public class GhostModel extends AnimatedGeoModel<GhostEntity> {
	@Override
	public ResourceLocation getAnimationResource(GhostEntity entity) {
		return new ResourceLocation("hollowknight", "animations/model.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GhostEntity entity) {
		return new ResourceLocation("hollowknight", "geo/model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GhostEntity entity) {
		return new ResourceLocation("hollowknight", "textures/entities/" + entity.getTexture() + ".png");
	}

}
