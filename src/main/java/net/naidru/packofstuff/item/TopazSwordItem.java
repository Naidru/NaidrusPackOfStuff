
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabToolsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@NaidruPackostuffModElements.ModElement.Tag
public class TopazSwordItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:topaz_sword")
	public static final Item block = null;
	public TopazSwordItem(NaidruPackostuffModElements instance) {
		super(instance, 129);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(CTabToolsItemGroup.tab)) {
		}.setRegistryName("topaz_sword"));
	}
}
