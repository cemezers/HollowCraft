
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package fan.teamchery.hollowknight.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import fan.teamchery.hollowknight.potion.EffectPlagueMobEffect;
import fan.teamchery.hollowknight.HollowknightMod;

public class HollowknightModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, HollowknightMod.MODID);
	public static final RegistryObject<MobEffect> EFFECT_PLAGUE = REGISTRY.register("effect_plague", () -> new EffectPlagueMobEffect());
}
