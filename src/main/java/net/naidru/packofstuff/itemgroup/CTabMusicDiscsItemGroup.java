
package net.naidru.packofstuff.itemgroup;

import net.naidru.packofstuff.item.TheSoundsOfCaveSoundsItem;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@NaidruPackostuffModElements.ModElement.Tag
public class CTabMusicDiscsItemGroup extends NaidruPackostuffModElements.ModElement {
	public CTabMusicDiscsItemGroup(NaidruPackostuffModElements instance) {
		super(instance, 351);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabc_tab_music_discs") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TheSoundsOfCaveSoundsItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
