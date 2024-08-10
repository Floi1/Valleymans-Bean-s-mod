
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.valleymanbeans.procedures.ValleymanbeanspoitionPotionExpiresProcedure;
import net.mcreator.valleymanbeans.potion.ValleymanbeanspoitionPotionEffectMobEffect;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

@EventBusSubscriber
public class ValleymanBeansModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, ValleymanBeansMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> VALLEYMAN_BEANS_POITION = REGISTRY.register("valleyman_beans_poition", () -> new ValleymanbeanspoitionPotionEffectMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(VALLEYMAN_BEANS_POITION)) {
			ValleymanbeanspoitionPotionExpiresProcedure.execute(entity);
		}
	}
}
