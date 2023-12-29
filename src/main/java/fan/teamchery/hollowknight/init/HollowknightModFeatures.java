
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import fan.teamchery.hollowknight.world.features.ores.PaleOreFeature;
import fan.teamchery.hollowknight.HollowknightMod;

@Mod.EventBusSubscriber
public class HollowknightModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HollowknightMod.MODID);
	public static final RegistryObject<Feature<?>> PALE_ORE = REGISTRY.register("pale_ore", PaleOreFeature::feature);
}
