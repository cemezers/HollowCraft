package fan.teamchery.hollowknight.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import fan.teamchery.hollowknight.block.display.ChestHollowDisplayItem;

public class ChestHollowDisplayModel extends AnimatedGeoModel<ChestHollowDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ChestHollowDisplayItem animatable) {
		return new ResourceLocation("hollowknight", "animations/chest.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChestHollowDisplayItem animatable) {
		return new ResourceLocation("hollowknight", "geo/chest.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChestHollowDisplayItem entity) {
		return new ResourceLocation("hollowknight", "textures/blocks/chest.png");
	}
}
