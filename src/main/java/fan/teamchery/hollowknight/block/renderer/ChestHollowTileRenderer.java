package fan.teamchery.hollowknight.block.renderer;

import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import fan.teamchery.hollowknight.block.model.ChestHollowBlockModel;
import fan.teamchery.hollowknight.block.entity.ChestHollowTileEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ChestHollowTileRenderer extends GeoBlockRenderer<ChestHollowTileEntity> {
	public ChestHollowTileRenderer(BlockEntityRendererProvider.Context rendererDispatcherIn) {
		super(rendererDispatcherIn, new ChestHollowBlockModel());
	}

	@Override
	public RenderType getRenderType(ChestHollowTileEntity animatable, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, ResourceLocation texture) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
