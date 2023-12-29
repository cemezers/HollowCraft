
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import fan.teamchery.hollowknight.block.entity.ChestHollowTileEntity;
import fan.teamchery.hollowknight.HollowknightMod;

public class HollowknightModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HollowknightMod.MODID);
	public static final RegistryObject<BlockEntityType<ChestHollowTileEntity>> CHEST_HOLLOW = REGISTRY.register("chest_hollow", () -> BlockEntityType.Builder.of(ChestHollowTileEntity::new, HollowknightModBlocks.CHEST_HOLLOW.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
