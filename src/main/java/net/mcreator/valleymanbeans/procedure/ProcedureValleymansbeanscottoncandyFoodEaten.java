package net.mcreator.valleymanbeans.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.valleymanbeans.ElementsValleymanBeansMod;

import java.util.Map;

@ElementsValleymanBeansMod.ModElement.Tag
public class ProcedureValleymansbeanscottoncandyFoodEaten extends ElementsValleymanBeansMod.ModElement {
	public ProcedureValleymansbeanscottoncandyFoodEaten(ElementsValleymanBeansMod instance) {
		super(instance, 87);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ValleymansbeanscottoncandyFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ValleymansbeanscottoncandyFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ValleymansbeanscottoncandyFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ValleymansbeanscottoncandyFoodEaten!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ValleymansbeanscottoncandyFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.REGENERATION, (int) 600, (int) 233));
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, (int) 600, (int) 233));
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(Blocks.WOOL, (int) (1), 6);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).setHealth((float) 20);
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.WOOL.getStateFromMeta(6), 3);
		for (int index0 = 0; index0 < (int) (10); index0++) {
			if (!world.isRemote) {
				Entity entityToSpawn = new EntitySnowman(world);
				if (entityToSpawn != null) {
					entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0.0F);
					world.spawnEntity(entityToSpawn);
				}
			}
		}
	}
}
