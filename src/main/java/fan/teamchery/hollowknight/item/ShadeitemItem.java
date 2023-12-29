
package fan.teamchery.hollowknight.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import fan.teamchery.hollowknight.init.HollowknightModTabs;

public class ShadeitemItem extends Item {
	public ShadeitemItem() {
		super(new Item.Properties().tab(HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
