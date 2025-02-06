
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.valleymanbeans.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.valleymanbeans.item.ValleymansbeanstoothpasteandorangejuiceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansthattasteItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansstrawberryandchocolateItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssourgummywormsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssmokedonionsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanssmartiiesandskeettlesItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansseasonedcheeseItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansraspberryItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumhohoholidayspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumdihydrogenmonoxideItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanspremiumItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmintandlicoriceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmilkdurianItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansmilkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansgreenteakitkatandwagyubeeftallowItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansfermentedsharkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansextraspicyraisinsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansextradietItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansexoticmeatsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansdreamfishItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscreamandlemonItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscottoncandyItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscokeandliquidcheeseItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansclassicradiummintItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanscherryItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansblueberryjamItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansbananaItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansavocadoandchocolatechipsItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansaustraliaItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansappleandtangerineItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansVeteransDayspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansStPatricksDayItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansSeafoodpizzaandchocomilkItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansHalloweenspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansEasterspecialItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansCubancigarsmokedItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansBraziliansushiItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansBlackteaandsoysauceItem;
import net.mcreator.valleymanbeans.item.ValleymansbeansAustraliadefinitiveeditionItem;
import net.mcreator.valleymanbeans.item.ValleymansbeanChristmas2023Item;
import net.mcreator.valleymanbeans.item.BowbeansItem;
import net.mcreator.valleymanbeans.item.BeanswipItem;
import net.mcreator.valleymanbeans.item.BeansswordItem;
import net.mcreator.valleymanbeans.item.BeansTIswordItem;
import net.mcreator.valleymanbeans.ValleymanBeansMod;

public class ValleymanBeansModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ValleymanBeansMod.MODID);
	public static final DeferredItem<Item> BEANSSWORD = REGISTRY.registerItem("beanssword", BeansswordItem::new, new Item.Properties());
	public static final DeferredItem<Item> BEANS_T_ISWORD = REGISTRY.registerItem("beans_t_isword", BeansTIswordItem::new, new Item.Properties());
	public static final DeferredItem<Item> LUCKYBEANSBLOCK = block(ValleymanBeansModBlocks.LUCKYBEANSBLOCK);
	public static final DeferredItem<Item> BEANSWIP = REGISTRY.registerItem("beanswip", BeanswipItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSCLASSICRADIUMMINT = REGISTRY.registerItem("valleymansbeansclassicradiummint", ValleymansbeansclassicradiummintItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUM = REGISTRY.registerItem("valleymansbeanspremium", ValleymansbeanspremiumItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSEXTRADIET = REGISTRY.registerItem("valleymansbeansextradiet", ValleymansbeansextradietItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSSMOKEDONIONS = REGISTRY.registerItem("valleymansbeanssmokedonions", ValleymansbeanssmokedonionsItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSDREAMFISH = REGISTRY.registerItem("valleymansbeansdreamfish", ValleymansbeansdreamfishItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUMHOHOHOLIDAYSPECIAL = REGISTRY.registerItem("valleymansbeanspremiumhohoholidayspecial", ValleymansbeanspremiumhohoholidayspecialItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_ST_PATRICKS_DAY = REGISTRY.registerItem("valleymansbeans_st_patricks_day", ValleymansbeansStPatricksDayItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSTHATTASTE = REGISTRY.registerItem("valleymansbeansthattaste", ValleymansbeansthattasteItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSBLUEBERRYJAM = REGISTRY.registerItem("valleymansbeansblueberryjam", ValleymansbeansblueberryjamItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSRASPBERRY = REGISTRY.registerItem("valleymansbeansraspberry", ValleymansbeansraspberryItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSPREMIUMDIHYDROGENMONOXIDE = REGISTRY.registerItem("valleymansbeanspremiumdihydrogenmonoxide", ValleymansbeanspremiumdihydrogenmonoxideItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_AUSTRALIADEFINITIVEEDITION = REGISTRY.registerItem("valleymansbeans_australiadefinitiveedition", ValleymansbeansAustraliadefinitiveeditionItem::new, new Item.Properties());
	public static final DeferredItem<Item> BOWBEANS = REGISTRY.registerItem("bowbeans", BowbeansItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_SEAFOODPIZZAANDCHOCOMILK = REGISTRY.registerItem("valleymansbeans_seafoodpizzaandchocomilk", ValleymansbeansSeafoodpizzaandchocomilkItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_BLACKTEAANDSOYSAUCE = REGISTRY.registerItem("valleymansbeans_blackteaandsoysauce", ValleymansbeansBlackteaandsoysauceItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSAPPLEANDTANGERINE = REGISTRY.registerItem("valleymansbeansappleandtangerine", ValleymansbeansappleandtangerineItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSEXOTICMEATS = REGISTRY.registerItem("valleymansbeansexoticmeats", ValleymansbeansexoticmeatsItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_CUBANCIGARSMOKED = REGISTRY.registerItem("valleymansbeans_cubancigarsmoked", ValleymansbeansCubancigarsmokedItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSBANANA = REGISTRY.registerItem("valleymansbeansbanana", ValleymansbeansbananaItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_BRAZILIANSUSHI = REGISTRY.registerItem("valleymansbeans_braziliansushi", ValleymansbeansBraziliansushiItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSCHERRY = REGISTRY.registerItem("valleymansbeanscherry", ValleymansbeanscherryItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSEXTRASPICYRAISINS = REGISTRY.registerItem("valleymansbeansextraspicyraisins", ValleymansbeansextraspicyraisinsItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSFERMENTEDSHARK = REGISTRY.registerItem("valleymansbeansfermentedshark", ValleymansbeansfermentedsharkItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSMILKDURIAN = REGISTRY.registerItem("valleymansbeansmilkdurian", ValleymansbeansmilkdurianItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSCOKEANDLIQUIDCHEESE = REGISTRY.registerItem("valleymansbeanscokeandliquidcheese", ValleymansbeanscokeandliquidcheeseItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSAUSTRALIA = REGISTRY.registerItem("valleymansbeansaustralia", ValleymansbeansaustraliaItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSAVOCADOANDCHOCOLATECHIPS = REGISTRY.registerItem("valleymansbeansavocadoandchocolatechips", ValleymansbeansavocadoandchocolatechipsItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSSMARTIIESANDSKEETTLES = REGISTRY.registerItem("valleymansbeanssmartiiesandskeettles", ValleymansbeanssmartiiesandskeettlesItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSGREENTEAKITKATANDWAGYUBEEFTALLOW = REGISTRY.registerItem("valleymansbeansgreenteakitkatandwagyubeeftallow", ValleymansbeansgreenteakitkatandwagyubeeftallowItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSSOURGUMMYWORMS = REGISTRY.registerItem("valleymansbeanssourgummyworms", ValleymansbeanssourgummywormsItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSMILK = REGISTRY.registerItem("valleymansbeansmilk", ValleymansbeansmilkItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSMINTANDLICORICE = REGISTRY.registerItem("valleymansbeansmintandlicorice", ValleymansbeansmintandlicoriceItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSCOTTONCANDY = REGISTRY.registerItem("valleymansbeanscottoncandy", ValleymansbeanscottoncandyItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSTOOTHPASTEANDORANGEJUICE = REGISTRY.registerItem("valleymansbeanstoothpasteandorangejuice", ValleymansbeanstoothpasteandorangejuiceItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSCREAMANDLEMON = REGISTRY.registerItem("valleymansbeanscreamandlemon", ValleymansbeanscreamandlemonItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSSEASONEDCHEESE = REGISTRY.registerItem("valleymansbeansseasonedcheese", ValleymansbeansseasonedcheeseItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANSSTRAWBERRYANDCHOCOLATE = REGISTRY.registerItem("valleymansbeansstrawberryandchocolate", ValleymansbeansstrawberryandchocolateItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEAN_CHRISTMAS_2023 = REGISTRY.registerItem("valleymansbean_christmas_2023", ValleymansbeanChristmas2023Item::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_VETERANS_DAYSPECIAL = REGISTRY.registerItem("valleymansbeans_veterans_dayspecial", ValleymansbeansVeteransDayspecialItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_HALLOWEENSPECIAL = REGISTRY.registerItem("valleymansbeans_halloweenspecial", ValleymansbeansHalloweenspecialItem::new, new Item.Properties());
	public static final DeferredItem<Item> VALLEYMANSBEANS_EASTERSPECIAL = REGISTRY.registerItem("valleymansbeans_easterspecial", ValleymansbeansEasterspecialItem::new, new Item.Properties());

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
