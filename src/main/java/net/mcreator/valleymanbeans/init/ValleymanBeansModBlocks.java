
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.valleymanbeans.block.LuckybeansblockBlock;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ValleymanBeansMod.MODID);
	public static final DeferredBlock<Block> LUCKYBEANSBLOCK = REGISTRY.registerBlock("luckybeansblock", LuckybeansblockBlock::new, BlockBehaviour.Properties.of());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
