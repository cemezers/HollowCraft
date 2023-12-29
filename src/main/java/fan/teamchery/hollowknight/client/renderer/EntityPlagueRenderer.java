
package fan.teamchery.hollowknight.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import fan.teamchery.hollowknight.entity.model.EntityPlagueModel;
import fan.teamchery.hollowknight.entity.EntityPlagueEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class EntityPlagueRenderer extends GeoEntityRenderer<EntityPlagueEntity> {
	public EntityPlagueRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EntityPlagueModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(EntityPlagueEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}

	@Override
	protected float getDeathMaxRotation(EntityPlagueEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
