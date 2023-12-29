
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import fan.teamchery.hollowknight.block.PaleOreBlock;
import fan.teamchery.hollowknight.block.ChestHollowBlock;
import fan.teamchery.hollowknight.HollowknightMod;

public class HollowknightModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HollowknightMod.MODID);
	public static final RegistryObject<Block> PALE_ORE = REGISTRY.register("pale_ore", () -> new PaleOreBlock());
	public static final RegistryObject<Block> CHEST_HOLLOW = REGISTRY.register("chest_hollow", () -> new ChestHollowBlock());
}
