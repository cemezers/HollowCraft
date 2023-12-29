
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import fan.teamchery.hollowknight.entity.RadianceEntity;
import fan.teamchery.hollowknight.entity.GhostEntity;
import fan.teamchery.hollowknight.entity.EntityPlagueEntity;
import fan.teamchery.hollowknight.entity.DarkEntity;
import fan.teamchery.hollowknight.HollowknightMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HollowknightModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HollowknightMod.MODID);
	public static final RegistryObject<EntityType<GhostEntity>> GHOST = register("ghost",
			EntityType.Builder.<GhostEntity>of(GhostEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhostEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DarkEntity>> SHADE = register("shade",
			EntityType.Builder.<DarkEntity>of(DarkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DarkEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RadianceEntity>> RADIANCE = register("radiance",
			EntityType.Builder.<RadianceEntity>of(RadianceEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RadianceEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EntityPlagueEntity>> ENTITY_PLAGUE = register("entity_plague",
			EntityType.Builder.<EntityPlagueEntity>of(EntityPlagueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EntityPlagueEntity::new)

					.sized(0.6f, 0.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GhostEntity.init();
			DarkEntity.init();
			RadianceEntity.init();
			EntityPlagueEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GHOST.get(), GhostEntity.createAttributes().build());
		event.put(SHADE.get(), DarkEntity.createAttributes().build());
		event.put(RADIANCE.get(), RadianceEntity.createAttributes().build());
		event.put(ENTITY_PLAGUE.get(), EntityPlagueEntity.createAttributes().build());
	}
}
