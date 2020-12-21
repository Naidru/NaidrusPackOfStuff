
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabItemsItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@NaidruPackostuffModElements.ModElement.Tag
public class SkyBlockFragmentItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:sky_block_fragment")
	public static final Item block = null;
	public SkyBlockFragmentItem(NaidruPackostuffModElements instance) {
		super(instance, 266);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CTabItemsItemGroup.tab).maxStackSize(64));
			setRegistryName("sky_block_fragment");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("\"You Are Making Good Progress"));
		}
	}
}
