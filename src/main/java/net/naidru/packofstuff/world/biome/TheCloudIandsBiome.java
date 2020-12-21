
package net.naidru.packofstuff.world.biome;

import net.naidru.packofstuff.block.CloudBlockBlock;
import net.naidru.packofstuff.NaidruPackostuffModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

@NaidruPackostuffModElements.ModElement.Tag
public class TheCloudIandsBiome extends NaidruPackostuffModElements.ModElement {
	@ObjectHolder("naidru_packostuff:the_cloud_iands")
	public static final CustomBiome biome = null;
	public TheCloudIandsBiome(NaidruPackostuffModElements instance) {
		super(instance, 265);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0.2f).temperature(0.3f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(CloudBlockBlock.block.getDefaultState(),
							CloudBlockBlock.block.getDefaultState(), CloudBlockBlock.block.getDefaultState())));
			setRegistryName("the_cloud_iands");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
		}
	}
}
