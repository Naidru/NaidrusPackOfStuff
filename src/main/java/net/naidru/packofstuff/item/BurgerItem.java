
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabFoodItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@NaidruPackostuffModElements.ModElement.Tag
public class BurgerItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:burger")
	public static final Item block = null;
	public BurgerItem(NaidruPackostuffModElements instance) {
		super(instance, 343);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CTabFoodItemGroup.tab).maxStackSize(64).food((new Food.Builder()).hunger(30).saturation(0.3f).build()));
			setRegistryName("burger");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("The Best Food EVER!!!!!!"));
		}
	}
}
