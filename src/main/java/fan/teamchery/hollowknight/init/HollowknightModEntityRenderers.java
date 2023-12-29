
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import fan.teamchery.hollowknight.client.renderer.RadianceRenderer;
import fan.teamchery.hollowknight.client.renderer.GhostRenderer;
import fan.teamchery.hollowknight.client.renderer.EntityPlagueRenderer;
import fan.teamchery.hollowknight.client.renderer.DarkRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HollowknightModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HollowknightModEntities.GHOST.get(), GhostRenderer::new);
		event.registerEntityRenderer(HollowknightModEntities.SHADE.get(), DarkRenderer::new);
		event.registerEntityRenderer(HollowknightModEntities.RADIANCE.get(), RadianceRenderer::new);
		event.registerEntityRenderer(HollowknightModEntities.ENTITY_PLAGUE.get(), EntityPlagueRenderer::new);
	}
}
