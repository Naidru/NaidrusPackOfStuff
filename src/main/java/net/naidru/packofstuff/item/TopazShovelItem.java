
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabToolsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@NaidruPackostuffModElements.ModElement.Tag
public class TopazShovelItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:topaz_shovel")
	public static final Item block = null;
	public TopazShovelItem(NaidruPackostuffModElements instance) {
		super(instance, 130);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(CTabToolsItemGroup.tab)) {
		}.setRegistryName("topaz_shovel"));
	}
}
