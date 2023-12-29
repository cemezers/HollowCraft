
package fan.teamchery.hollowknight.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import fan.teamchery.hollowknight.procedures.PlaguePriZaviershieniiIspolzovaniiaProcedure;
import fan.teamchery.hollowknight.init.HollowknightModTabs;

public class PlagueItem extends Item {
	public PlagueItem() {
		super(new Item.Properties().tab(HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

				.build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		PlaguePriZaviershieniiIspolzovaniiaProcedure.execute(entity);
		return retval;
	}
}
