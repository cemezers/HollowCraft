
package fan.teamchery.hollowknight.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import fan.teamchery.hollowknight.procedures.EffectPlaguePriNalozhieniiEffiektaProcedure;

public class EffectPlagueMobEffect extends MobEffect {
	public EffectPlagueMobEffect() {
		super(MobEffectCategory.HARMFUL, -3381760);
	}

	@Override
	public String getDescriptionId() {
		return "effect.hollowknight.effect_plague";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EffectPlaguePriNalozhieniiEffiektaProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
