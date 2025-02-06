
package net.mcreator.valleymanbeans.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;

import net.mcreator.valleymanbeans.procedures.BeansswordRightClickedInAirProcedure;
import net.mcreator.valleymanbeans.init.ValleymanBeansModItems;

import java.util.List;

public class BeansTIswordItem extends SwordItem {
	public BeansTIswordItem() {
		super(new Tier() {
			public int getUses() {
				return 10000;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 30;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ValleymanBeansModItems.BEANSWIP.get()));
			}
		}, 3, 1f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.valleyman_beans.beans_t_isword.description_0"));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		BeansswordRightClickedInAirProcedure.execute(world, itemstack);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
