
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabToolsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import java.util.List;

@NaidruPackostuffModElements.ModElement.Tag
public class SwordOfTheSkyThingItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:sword_of_the_sky_thing")
	public static final Item block = null;
	public SwordOfTheSkyThingItem(NaidruPackostuffModElements instance) {
		super(instance, 348);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2999;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4.8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OBSIDIAN, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(CTabToolsItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("HOLY YOU GOT THE SWORD OF THE SKY THING!? !? !? !?"));
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("sword_of_the_sky_thing"));
	}
}
