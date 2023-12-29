
package fan.teamchery.hollowknight.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import fan.teamchery.hollowknight.init.HollowknightModTabs;

public class PaleOreItemItem extends Item {
	public PaleOreItemItem() {
		super(new Item.Properties().tab(HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
