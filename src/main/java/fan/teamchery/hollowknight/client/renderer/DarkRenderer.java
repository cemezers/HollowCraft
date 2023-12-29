
package fan.teamchery.hollowknight.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import fan.teamchery.hollowknight.entity.DarkEntity;
import fan.teamchery.hollowknight.client.model.Modelcustom_model;

public class DarkRenderer extends MobRenderer<DarkEntity, Modelcustom_model<DarkEntity>> {
	public DarkRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DarkEntity entity) {
		return new ResourceLocation("hollowknight:textures/entities/shade.png");
	}
}
