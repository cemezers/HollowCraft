package fan.teamchery.hollowknight.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import fan.teamchery.hollowknight.block.model.ChestHollowDisplayModel;
import fan.teamchery.hollowknight.block.display.ChestHollowDisplayItem;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChestHollowDisplayItemRenderer extends GeoItemRenderer<ChestHollowDisplayItem> {
	public ChestHollowDisplayItemRenderer() {
		super(new ChestHollowDisplayModel());
	}

	@Override
	public RenderType getRenderType(ChestHollowDisplayItem animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
