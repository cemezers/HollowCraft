package fan.teamchery.hollowknight.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import fan.teamchery.hollowknight.init.HollowknightModBlockEntities;
import fan.teamchery.hollowknight.block.renderer.ChestHollowTileRenderer;
import fan.teamchery.hollowknight.HollowknightMod;

@Mod.EventBusSubscriber(modid = HollowknightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(HollowknightModBlockEntities.CHEST_HOLLOW.get(), ChestHollowTileRenderer::new);
	}
}
