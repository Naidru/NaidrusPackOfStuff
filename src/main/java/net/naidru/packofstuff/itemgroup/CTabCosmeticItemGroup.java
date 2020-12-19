
package net.naidru.packofstuff.itemgroup;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

@NaidruPackostuffModElements.ModElement.Tag
public class CTabCosmeticItemGroup extends NaidruPackostuffModElements.ModElement {
	public CTabCosmeticItemGroup(NaidruPackostuffModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabc_tab_cosmetic") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.PLAYER_HEAD, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
