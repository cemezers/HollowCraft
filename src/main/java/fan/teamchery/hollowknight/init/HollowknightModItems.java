
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import fan.teamchery.hollowknight.item.ShadeitemItem;
import fan.teamchery.hollowknight.item.PlagueItem;
import fan.teamchery.hollowknight.item.PaleOreItemItem;
import fan.teamchery.hollowknight.item.NailItem;
import fan.teamchery.hollowknight.item.GhostHeadItem;
import fan.teamchery.hollowknight.item.GeoItem;
import fan.teamchery.hollowknight.item.BrokenGhostHeadItem;
import fan.teamchery.hollowknight.block.display.ChestHollowDisplayItem;
import fan.teamchery.hollowknight.HollowknightMod;

public class HollowknightModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HollowknightMod.MODID);
	public static final RegistryObject<Item> NAIL = REGISTRY.register("nail", () -> new NailItem());
	public static final RegistryObject<Item> GEO = REGISTRY.register("geo", () -> new GeoItem());
	public static final RegistryObject<Item> BROKEN_GHOST_HEAD = REGISTRY.register("broken_ghost_head", () -> new BrokenGhostHeadItem());
	public static final RegistryObject<Item> GHOST_HEAD = REGISTRY.register("ghost_head", () -> new GhostHeadItem());
	public static final RegistryObject<Item> SHADEITEM = REGISTRY.register("shadeitem", () -> new ShadeitemItem());
	public static final RegistryObject<Item> PALE_ORE_ITEM = REGISTRY.register("pale_ore_item", () -> new PaleOreItemItem());
	public static final RegistryObject<Item> PALE_ORE = block(HollowknightModBlocks.PALE_ORE, HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB);
	public static final RegistryObject<Item> PLAGUE = REGISTRY.register("plague", () -> new PlagueItem());
	public static final RegistryObject<Item> CHEST_HOLLOW = REGISTRY.register(HollowknightModBlocks.CHEST_HOLLOW.getId().getPath(),
			() -> new ChestHollowDisplayItem(HollowknightModBlocks.CHEST_HOLLOW.get(), new Item.Properties().tab(HollowknightModTabs.TAB_HOLLOW_KNIGHT_TAB)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
