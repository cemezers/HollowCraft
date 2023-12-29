package fan.teamchery.hollowknight.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import fan.teamchery.hollowknight.block.entity.ChestHollowTileEntity;

public class ChestHollowBlockModel extends AnimatedGeoModel<ChestHollowTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ChestHollowTileEntity animatable) {
		return new ResourceLocation("hollowknight", "animations/chest.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChestHollowTileEntity animatable) {
		return new ResourceLocation("hollowknight", "geo/chest.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChestHollowTileEntity entity) {
		return new ResourceLocation("hollowknight", "textures/blocks/chest.png");
	}
}
