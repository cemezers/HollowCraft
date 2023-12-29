
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import fan.teamchery.hollowknight.world.inventory.ChestHollowGuiMenu;
import fan.teamchery.hollowknight.HollowknightMod;

public class HollowknightModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HollowknightMod.MODID);
	public static final RegistryObject<MenuType<ChestHollowGuiMenu>> CHEST_HOLLOW_GUI = REGISTRY.register("chest_hollow_gui", () -> IForgeMenuType.create(ChestHollowGuiMenu::new));
}
