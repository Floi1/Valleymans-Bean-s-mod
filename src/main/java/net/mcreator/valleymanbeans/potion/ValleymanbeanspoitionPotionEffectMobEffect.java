
package net.mcreator.valleymanbeans.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionStartedappliedProcedure;
import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionExpiresProcedure;

public class ValleymanbeanspoitionPotionEffectMobEffect extends MobEffect {
	public ValleymanbeanspoitionPotionEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.addAttributeModifiers(entity, attributeMap, amplifier);
		ValleymanbeanspoitionPotionStartedappliedProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ValleymanbeanspoitionPotionExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
