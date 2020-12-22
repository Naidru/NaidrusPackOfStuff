
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.procedures.CloudCowMeatFoodEatenProcedure;
import net.naidru.packofstuff.itemgroup.CTabFoodItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

@NaidruPackostuffModElements.ModElement.Tag
public class CloudCowMeatItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:cloud_cow_meat")
	public static final Item block = null;
	public CloudCowMeatItem(NaidruPackostuffModElements instance) {
		super(instance, 342);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CTabFoodItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(9).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("cloud_cow_meat");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				CloudCowMeatFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
