package com.magistuarmory.block;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.item.ModItemTier;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;


import net.minecraft.core.registries.Registries;
import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(EpicKnights.ID, Registries.BLOCK);

	private static BlockBehaviour.Properties bannerProperties() {
		return BlockBehaviour.Properties.of()
				.mapColor(MapColor.WOOD)
				.noOcclusion()
				.dynamicShape()
				.noTerrainParticles()
				.sound(SoundType.WOOD)
				.strength(2.0f, 3.0f)
				.ignitedByLava();
	}

	public static final RegistrySupplier<Block> WOOD_PAVISE = BLOCKS.register("wood_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "wood_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> GOLD_PAVISE = BLOCKS.register("gold_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "gold_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> STONE_PAVISE = BLOCKS.register("stone_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "stone_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> IRON_PAVISE = BLOCKS.register("iron_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "iron_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> DIAMOND_PAVISE = BLOCKS.register("diamond_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "diamond_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> NETHERITE_PAVISE = BLOCKS.register("netherite_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "netherite_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> TIN_PAVISE = BLOCKS.register("tin_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "tin_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> COPPER_PAVISE = BLOCKS.register("copper_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "copper_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> SILVER_PAVISE = BLOCKS.register("silver_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "silver_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> BRONZE_PAVISE = BLOCKS.register("bronze_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "bronze_pavise", ModBlockEntityTypes.PAVISE));
	public static final RegistrySupplier<Block> STEEL_PAVISE = BLOCKS.register("steel_pavise", () -> new PaviseBlock(DyeColor.WHITE, bannerProperties(), "steel_pavise", ModBlockEntityTypes.PAVISE));

	public static final RegistrySupplier<Block> PAVISE_UPPER_COLLISION = BLOCKS.register("pavise_upper_collision", PaviseUpperCollisionBlock::new);

	public static void register() {
		BLOCKS.register();
	}

	public static PaviseBlock getPaviseByMaterialName(ModItemTier material)
	{
		switch (material.getMaterialName())
		{
			case "wood" ->
			{
				return (PaviseBlock) WOOD_PAVISE;
			}
			case "gold" ->
			{
				return (PaviseBlock) GOLD_PAVISE;
			}
			case "stone" ->
			{
				return (PaviseBlock) STONE_PAVISE;
			}
			case "iron" ->
			{
				return (PaviseBlock) IRON_PAVISE;
			}
			case "diamond" ->
			{
				return (PaviseBlock) DIAMOND_PAVISE;
			}
			case "netherite" ->
			{
				return (PaviseBlock) NETHERITE_PAVISE;
			}
			case "tin" ->
			{
				return (PaviseBlock) TIN_PAVISE;
			}
			case "copper" ->
			{
				return (PaviseBlock) COPPER_PAVISE;
			}
			case "silver" ->
			{
				return (PaviseBlock) SILVER_PAVISE;
			}
			case "bronze" ->
			{
				return (PaviseBlock) BRONZE_PAVISE;
			}
			case "steel" ->
			{
				return (PaviseBlock) STEEL_PAVISE;
			}
		}
		throw new IllegalArgumentException("unknown material " + material.getMaterialName());
	}
}
