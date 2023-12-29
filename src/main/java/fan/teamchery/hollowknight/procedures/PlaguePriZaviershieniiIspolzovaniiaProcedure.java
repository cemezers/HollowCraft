package fan.teamchery.hollowknight.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import fan.teamchery.hollowknight.init.HollowknightModMobEffects;

public class PlaguePriZaviershieniiIspolzovaniiaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(HollowknightModMobEffects.EFFECT_PLAGUE.get(), 1, 1));
	}
}
