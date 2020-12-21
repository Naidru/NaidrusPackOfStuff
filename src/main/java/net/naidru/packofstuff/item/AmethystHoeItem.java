
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

@NaidruPackostuffModElements.ModElement.Tag
public class AmethystHoeItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:amethyst_hoe")
	public static final Item block = null;
	public AmethystHoeItem(NaidruPackostuffModElements instance) {
		super(instance, 325);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1680;
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
				return 55;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("amethyst_hoe"));
	}
}
