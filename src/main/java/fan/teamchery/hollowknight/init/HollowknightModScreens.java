
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import fan.teamchery.hollowknight.client.gui.ChestHollowGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HollowknightModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HollowknightModMenus.CHEST_HOLLOW_GUI.get(), ChestHollowGuiScreen::new);
		});
	}
}
