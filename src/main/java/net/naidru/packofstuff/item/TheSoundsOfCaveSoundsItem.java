
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabItemsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@NaidruPackostuffModElements.ModElement.Tag
public class TheSoundsOfCaveSoundsItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:the_sounds_of_cave_sounds")
	public static final Item block = null;
	public TheSoundsOfCaveSoundsItem(NaidruPackostuffModElements instance) {
		super(instance, 347);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
					new Item.Properties().group(CTabItemsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("the_sounds_of_cave_sounds");
		}
	}
}
