
package net.mcreator.valleymanbeans.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionStartedappliedProcedure;

public class ValleymanbeanspoitionPotionEffectMobEffect extends MobEffect {
	public ValleymanbeanspoitionPotionEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		ValleymanbeanspoitionPotionStartedappliedProcedure.execute(entity);
	}
}
