
package net.mcreator.valleymanbeans.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.valleymanbeans.procedures.ValleymansbeansAustraliadefinitiveeditionFoodEatenProcedure;
import net.mcreator.valleymanbeans.init.ValleymanBeansModTabs;

import java.util.List;

public class ValleymansbeansaustraliaItem extends Item {
	public ValleymansbeansaustraliaItem() {
		super(new Item.Properties().tab(ValleymanBeansModTabs.TAB_BEANS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(1f).alwaysEat()

				.build()));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Valleymans beans Australia"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ValleymansbeansAustraliadefinitiveeditionFoodEatenProcedure.execute(entity);
		return retval;
	}
}
