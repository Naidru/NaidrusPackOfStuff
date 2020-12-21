
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@NaidruPackostuffModElements.ModElement.Tag
public class CheeseItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:cheese")
	public static final Item block = null;
	public CheeseItem(NaidruPackostuffModElements instance) {
		super(instance, 344);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("cheese");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
