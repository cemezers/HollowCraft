package fan.teamchery.hollowknight.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import fan.teamchery.hollowknight.entity.EntityPlagueEntity;

public class EntityPlagueModel extends AnimatedGeoModel<EntityPlagueEntity> {
	@Override
	public ResourceLocation getAnimationResource(EntityPlagueEntity entity) {
		return new ResourceLocation("hollowknight", "animations/plague.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EntityPlagueEntity entity) {
		return new ResourceLocation("hollowknight", "geo/plague.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EntityPlagueEntity entity) {
		return new ResourceLocation("hollowknight", "textures/entities/" + entity.getTexture() + ".png");
	}

}
