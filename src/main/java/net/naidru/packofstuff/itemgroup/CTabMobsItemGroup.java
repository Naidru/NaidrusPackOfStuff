
package net.naidru.packofstuff.itemgroup;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruPackostuffModElements.ModElement.Tag
public class CTabMobsItemGroup extends NaidruPackostuffModElements.ModElement {
	public CTabMobsItemGroup(NaidruPackostuffModElements instance) {
		super(instance, 270);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabc_tab_mobs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.GHAST_SPAWN_EGG, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
