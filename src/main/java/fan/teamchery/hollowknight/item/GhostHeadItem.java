
package fan.teamchery.hollowknight.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import fan.teamchery.hollowknight.procedures.GhostHeadPriShchielchkiePKMProcedure;
import fan.teamchery.hollowknight.init.HollowknightModTabs;

public class GhostHeadItem extends Item {
	public GhostHeadItem() {
		super(new Item.Properties().tab(HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB).durability(1).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GhostHeadPriShchielchkiePKMProcedure.execute(world, x, y, z, itemstack);
		return ar;
	}
}
