package net.naidru.packofstuff.procedures;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@NaidruPackostuffModElements.ModElement.Tag
public class AbyssLogBlockDestroyedByPlayerProcedure extends NaidruPackostuffModElements.ModElement {
	public AbyssLogBlockDestroyedByPlayerProcedure(NaidruPackostuffModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AbyssLogBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AbyssLogBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("The wood lets out a high pitch noise when you break it."), (false));
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 5);
	}
}
