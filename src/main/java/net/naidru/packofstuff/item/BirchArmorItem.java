
package net.naidru.packofstuff.item;

import net.naidru.packofstuff.itemgroup.CTabArmorItemGroup;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

@NaidruPackostuffModElements.ModElement.Tag
public class BirchArmorItem extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:birch_armorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("naidru_packostuff:birch_armorbody")
	public static final Item body = null;
	@ObjectHolder("naidru_packostuff:birch_armorlegs")
	public static final Item legs = null;
	@ObjectHolder("naidru_packostuff:birch_armorboots")
	public static final Item boots = null;
	public BirchArmorItem(NaidruPackostuffModElements instance) {
		super(instance, 44);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 2;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{0, 1, 1, 0}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 1;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "birch_armor";
			}

			public float getToughness() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(CTabArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naidru_packostuff:textures/models/armor/birch_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("birch_armorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(CTabArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naidru_packostuff:textures/models/armor/birch_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("birch_armorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(CTabArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naidru_packostuff:textures/models/armor/birch_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("birch_armorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(CTabArmorItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "naidru_packostuff:textures/models/armor/birch_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("birch_armorboots"));
	}
}
