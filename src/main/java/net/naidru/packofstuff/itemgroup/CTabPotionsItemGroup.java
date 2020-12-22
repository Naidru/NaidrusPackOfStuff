
package net.naidru.packofstuff.itemgroup;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruPackostuffModElements.ModElement.Tag
public class CTabPotionsItemGroup extends NaidruPackostuffModElements.ModElement {
	public CTabPotionsItemGroup(NaidruPackostuffModElements instance) {
		super(instance, 352);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabc_tab_potions") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.SPLASH_POTION, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
