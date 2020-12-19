
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabToolsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@NaidruPackostuffModElements.ModElement.Tag
public class SkyHoeItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:sky_hoe")
	public static final Item block = null;
	public SkyHoeItem(NaidruPackostuffModElements instance) {
		super(instance, 152);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3072;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(CTabToolsItemGroup.tab)) {
		}.setRegistryName("sky_hoe"));
	}
}
