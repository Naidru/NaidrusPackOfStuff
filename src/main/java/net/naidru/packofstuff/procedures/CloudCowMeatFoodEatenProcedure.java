package net.naidru.packofstuff.procedures;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@NaidruPackostuffModElements.ModElement.Tag
public class CloudCowMeatFoodEatenProcedure extends NaidruPackostuffModElements.ModElement {
	public CloudCowMeatFoodEatenProcedure(NaidruPackostuffModElements instance) {
		super(instance, 342);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CloudCowMeatFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 60, (int) 1));
	}
}
