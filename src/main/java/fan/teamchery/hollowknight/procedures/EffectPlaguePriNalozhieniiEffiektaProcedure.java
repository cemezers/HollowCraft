package fan.teamchery.hollowknight.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

import fan.teamchery.hollowknight.init.HollowknightModEntities;
import fan.teamchery.hollowknight.entity.EntityPlagueEntity;

public class EffectPlaguePriNalozhieniiEffiektaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new EntityPlagueEntity(HollowknightModEntities.ENTITY_PLAGUE.get(), _level);
			entityToSpawn.moveTo((x + Mth.nextDouble(RandomSource.create(), -1, 1)), (y + 2), (z + Mth.nextDouble(RandomSource.create(), -1, 1)), world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
