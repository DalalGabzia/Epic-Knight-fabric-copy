package com.magistuarmory.misc;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.item.ArmorDecoration;
import com.magistuarmory.item.ModItems;
import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ModCreativeTabs
{
	static Supplier<ItemStack> ARMET_WITH_PLUME_SUPPLIER = () -> ModItems.getDecoratedStack(ModItems.ARMET.get(), ModItems.BIG_PLUME_DECORATION.get());
	static Supplier<ItemStack> CEREMONIAL_ARMET_WITH_PLUME_SUPPLIER = () -> ModItems.getDecoratedStack(ModItems.CEREMONIAL_ARMET.get(), ModItems.BIG_PLUME_DECORATION.get());

	static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(EpicKnights.ID, Registries.CREATIVE_MODE_TAB);

	public static final ResourceKey<CreativeModeTab> ARMOR = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "armor"));
	public static final ResourceKey<CreativeModeTab> WEAPONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "weapons"));
	public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "particular_weapons"));
	public static final ResourceKey<CreativeModeTab> SHIELDS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "shields"));
	public static final ResourceKey<CreativeModeTab> RUSTED = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "rusted"));
	public static final ResourceKey<CreativeModeTab> ARMOR_DECORATIONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "armor_decorations"));

	public static final ResourceKey<CreativeModeTab> ARMOR_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "armor"));
	public static final ResourceKey<CreativeModeTab> WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "weapons"));
	public static final ResourceKey<CreativeModeTab> PARTICULAR_WEAPONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "particular_weapons"));
	public static final ResourceKey<CreativeModeTab> SHIELDS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "shields"));
	public static final ResourceKey<CreativeModeTab> RUSTED_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "rusted"));
	public static final ResourceKey<CreativeModeTab> ARMOR_DECORATIONS_RESOURCE_KEY = ResourceKey.create(Registries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(EpicKnights.ID, "armor_decorations"));
	public static final ResourceKey<CreativeModeTab> INGRIDIENTS_RESOURCE_KEY = CreativeModeTabs.INGREDIENTS;

	// Removed createTab, tabs are now referenced by ResourceKey only

	// Removed getIconItem, not needed with ResourceKey

	public static void init()
	{
		// TABS.register(); removed, tabs are now ResourceKey
		
		// Removed appendStack, icon is already the stack
        append(ARMOR, ModItems.ARMET.get());
        append(ARMOR, ModItems.KNIGHT_CHESTPLATE.get());
        append(ARMOR, ModItems.KNIGHT_LEGGINGS.get());
        append(ARMOR, ModItems.KNIGHT_BOOTS.get());
        append(ARMOR, ModItems.STECHHELM.get());
		append(ARMOR, ModItems.JOUSTING_CHESTPLATE.get());
		append(ARMOR, ModItems.JOUSTING_LEGGINGS.get());
		append(ARMOR, ModItems.JOUSTING_BOOTS.get());
		append(ARMOR, ModItems.SALLET.get());
		append(ARMOR, ModItems.GOTHIC_CHESTPLATE.get());
		append(ARMOR, ModItems.GOTHIC_LEGGINGS.get());
		append(ARMOR, ModItems.GOTHIC_BOOTS.get());
		append(ARMOR, ModItems.MAXIMILIAN_HELMET.get());
		append(ARMOR, ModItems.MAXIMILIAN_CHESTPLATE.get());
		append(ARMOR, ModItems.MAXIMILIAN_LEGGINGS.get());
		append(ARMOR, ModItems.MAXIMILIAN_BOOTS.get());
		append(ARMOR, ModItems.CHAINMAIL_HELMET.get());
		append(ARMOR, ModItems.CHAINMAIL_CHESTPLATE.get());
		append(ARMOR, ModItems.CHAINMAIL_LEGGINGS.get());
		append(ARMOR, ModItems.CHAINMAIL_BOOTS.get());
		append(ARMOR, ModItems.KETTLEHAT.get());
		append(ARMOR, ModItems.PLATEMAIL_CHESTPLATE.get());
		append(ARMOR, ModItems.PLATEMAIL_LEGGINGS.get());
		append(ARMOR, ModItems.PLATEMAIL_BOOTS.get());
		append(ARMOR, ModItems.BARBUTE.get());
		append(ARMOR, ModItems.HALFARMOR_CHESTPLATE.get());
		append(ARMOR, ModItems.GREATHELM.get());
		append(ARMOR, ModItems.CRUSADER_CHESTPLATE.get());
		append(ARMOR, ModItems.CRUSADER_LEGGINGS.get());
		append(ARMOR, ModItems.CRUSADER_BOOTS.get());
				// if (Platform.isFabric())
				//     append(ARMOR, CEREMONIAL_ARMET_WITH_PLUME_SUPPLIER.get());
				append(ARMOR, ModItems.CEREMONIAL_ARMET.get());
		append(ARMOR, ModItems.CEREMONIAL_CHESTPLATE.get());
		append(ARMOR, ModItems.CEREMONIAL_BOOTS.get());
		append(ARMOR, ModItems.COIF.get());
		append(ARMOR, ModItems.GAMBESON.get());
		append(ARMOR, ModItems.PANTYHOSE.get());
		append(ARMOR, ModItems.GAMBESON_BOOTS.get());
		append(ARMOR, ModItems.BRIGANDINE.get());
		append(ARMOR, ModItems.NORMAN_HELMET.get());
		append(ARMOR, ModItems.SHISHAK.get());
		append(ARMOR, ModItems.BASCINET.get());
		append(ARMOR, ModItems.XIV_CENTURY_KNIGHT_CHESTPLATE.get());
		append(ARMOR, ModItems.XIV_CENTURY_KNIGHT_LEGGINGS.get());
		append(ARMOR, ModItems.XIV_CENTURY_KNIGHT_BOOTS.get());
		append(ARMOR, ModItems.WINGED_HUSSAR_CHESTPLATE.get());
		append(ARMOR, ModItems.BURGONET.get());
		append(ARMOR, ModItems.CUIRASSIER_CHESTPLATE.get());
		append(ARMOR, ModItems.CUIRASSIER_LEGGINGS.get());
		append(ARMOR, ModItems.CUIRASSIER_BOOTS.get());
		append(ARMOR, ModItems.GRAND_BASCINET.get());
		append(ARMOR, ModItems.KASTENBRUST_CHESTPLATE.get());
		append(ARMOR, ModItems.KASTENBRUST_LEGGINGS.get());
		append(ARMOR, ModItems.KASTENBRUST_BOOTS.get());
		append(ARMOR, ModItems.FACE_HELMET.get());
		append(ARMOR, ModItems.LAMELLAR_CHESTPLATE.get());
		append(ARMOR, ModItems.LAMELLAR_BOOTS.get());
		append(ARMOR, ModItems.BARDING.get());
		append(ARMOR, ModItems.CHAINMAIL_HORSE_ARMOR.get());

		if (ModItems.BLACKSMITH_HAMMER != null) append(PARTICULAR_WEAPONS, ModItems.BLACKSMITH_HAMMER.get());
		if (ModItems.BARBED_CLUB != null) append(PARTICULAR_WEAPONS, ModItems.BARBED_CLUB.get());
		if (ModItems.PITCHFORK != null) append(PARTICULAR_WEAPONS, ModItems.PITCHFORK.get());
		if (ModItems.NOBLE_SWORD != null) append(PARTICULAR_WEAPONS, ModItems.NOBLE_SWORD.get());
		if (ModItems.CLUB != null) append(PARTICULAR_WEAPONS, ModItems.CLUB.get());
		if (ModItems.MESSER_SWORD != null) append(PARTICULAR_WEAPONS, ModItems.MESSER_SWORD.get());
		if (ModItems.LONGBOW != null) append(PARTICULAR_WEAPONS, ModItems.LONGBOW.get());
		if (ModItems.HEAVY_CROSSBOW != null) append(PARTICULAR_WEAPONS, ModItems.HEAVY_CROSSBOW.get());

		append(RUSTED, ModItems.RUSTED_BASTARD_SWORD.get());
		append(RUSTED, ModItems.RUSTED_HEAVY_MACE.get());
		append(RUSTED, ModItems.CORRUPTED_ROUND_SHIELD.get());
		append(RUSTED, ModItems.RUSTED_BARBUTE.get());
		append(RUSTED, ModItems.RUSTED_HALFARMOR_CHESTPLATE.get());
		append(RUSTED, ModItems.RUSTED_GREATHELM.get());
		append(RUSTED, ModItems.RUSTED_CRUSADER_CHESTPLATE.get());
		append(RUSTED, ModItems.RUSTED_CRUSADER_BOOTS.get());
		append(RUSTED, ModItems.RUSTED_NORMAN_HELMET.get());
		append(RUSTED, ModItems.RUSTED_CHAINMAIL_HELMET.get());
		append(RUSTED, ModItems.RUSTED_CHAINMAIL_CHESTPLATE.get());
		append(RUSTED, ModItems.RUSTED_CHAINMAIL_LEGGINGS.get());
		append(RUSTED, ModItems.RUSTED_CHAINMAIL_BOOTS.get());
		append(RUSTED, ModItems.RUSTED_KETTLEHAT.get());
		
		for (RegistrySupplier<? extends Item> item : ModItems.INSTANCE.ingredientItems)
			append(INGRIDIENTS_RESOURCE_KEY, item.get());

		for (RegistrySupplier<? extends Item> supplier : ModItems.STILETTOS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.SHORT_SWORDS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.KATZBALGERS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.PIKES.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.RANSEURS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.AHLSPIESSES.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.GIANT_LANCES.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.BASTARD_SWORDS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.ESTOCS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.CLAYMORS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.ZWEIHANDERS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.FLAME_BLADED_SWORDS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.LOCHABER_AXES.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.CONCAVE_EDGED_HALBERDS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.HEAVY_MACES.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.HEAVY_WAR_HAMMERS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.LUCERNE_HAMMERS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.MORNINGSTARS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.FLAILS.get())
			append(WEAPONS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.GUISARMES.get())
			append(WEAPONS, supplier.get());

		for (RegistrySupplier<? extends Item> supplier : ModItems.HEATER_SHIELDS.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.TARGETS.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.BUCKLERS.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.RONDACHES.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.TARTSCHES.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.ELLIPTICAL_SHIELDS.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.ROUND_SHIELDS.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.PAVISES.get())
			append(SHIELDS, supplier.get());
		for (RegistrySupplier<? extends Item> supplier : ModItems.KITE_SHIELDS.get())
			append(SHIELDS, supplier.get());
		
		for (RegistrySupplier<? extends ArmorDecoration> supplier : ModItems.INSTANCE.armorDecorationItems) {
			if (supplier == ModItems.CAT_EARS_DECORATION) {
				continue;
			}
			append(ARMOR_DECORATIONS, () -> supplier.get().asItem());
		}
	}

	// Removed appendStack for DeferredSupplier, not needed

	@SafeVarargs
	public static <I extends ItemLike> void append(ResourceKey<CreativeModeTab> tab, I... items)
	{
		CreativeTabRegistry.append(tab, items);
	}
	
	// Removed append for DeferredSupplier, not needed
}
