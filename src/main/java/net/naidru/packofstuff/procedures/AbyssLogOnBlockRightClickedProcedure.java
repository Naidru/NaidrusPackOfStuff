package net.naidru.packofstuff.procedures;

import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

@NaidruPackostuffModElements.ModElement.Tag
public class AbyssLogOnBlockRightClickedProcedure extends NaidruPackostuffModElements.ModElement {
	public AbyssLogOnBlockRightClickedProcedure(NaidruPackostuffModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AbyssLogOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure AbyssLogOnBlockRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		World world = (World) dependencies.get("world");
		if (entity instanceof PlayerEntity && !world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("The wood pricks your hand when you touch it."), (true));
		}
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
