
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HollowknightModTabs {
	public static CreativeModeTab TAB_HOLLOW_KNIGHT_TAB;

	public static void load() {
		TAB_HOLLOW_KNIGHT_TAB = new CreativeModeTab("tabhollow_knight_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HollowknightModItems.GHOST_HEAD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
