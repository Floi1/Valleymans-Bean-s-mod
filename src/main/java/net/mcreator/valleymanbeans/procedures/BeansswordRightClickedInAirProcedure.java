package net.mcreator.valleymanbeans.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class BeansswordRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, ItemStack itemstack) {
		itemstack.enchant(Enchantments.SHARPNESS, 1);
	}
}
