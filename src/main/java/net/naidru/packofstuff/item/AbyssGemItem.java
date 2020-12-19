
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabItemsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@NaidruPackostuffModElements.ModElement.Tag
public class AbyssGemItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:abyss_gem")
	public static final Item block = null;
	public AbyssGemItem(NaidruPackostuffModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CTabItemsItemGroup.tab).maxStackSize(64));
			setRegistryName("abyss_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
