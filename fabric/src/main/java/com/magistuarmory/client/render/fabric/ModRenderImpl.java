package com.magistuarmory.client.render.fabric;

import com.magistuarmory.EpicKnights;
import com.magistuarmory.api.item.ModItemsProvider;
import com.magistuarmory.block.ModBlockEntityTypes;
import com.magistuarmory.client.render.ModRender;
import com.magistuarmory.client.render.entity.layer.ArmorDecorationLayer;
import com.magistuarmory.client.render.entity.layer.HorseArmorDecorationLayer;
import com.magistuarmory.client.render.model.decoration.ArmorDecorationModelSet;
import com.magistuarmory.client.render.tileentity.HeraldryItemStackRenderer;
import com.magistuarmory.client.render.tileentity.PaviseBlockRenderer;
import com.magistuarmory.fabric.client.render.entity.layer.MedievalArmorLayer;
import com.magistuarmory.fabric.client.render.tileentity.HeraldryItemStackRendererFabric;
import com.magistuarmory.item.MedievalShieldItem;
import com.magistuarmory.item.ModItems;
import com.magistuarmory.item.PaviseItem;
import dev.architectury.registry.client.rendering.BlockEntityRendererRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.fabricmc.fabric.api.client.rendering.v1.LivingEntityFeatureRendererRegistrationCallback;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HorseRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

@Environment(EnvType.CLIENT)
public class ModRenderImpl
{
	static void addLayers(ModItemsProvider content, EntityType<? extends LivingEntity> entitytype, LivingEntityRenderer<?, ?, ?> renderer, LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper helper, EntityRendererProvider.Context context)
	{
		// Custom armor decoration layers are disabled for Fabric 1.21.4 compatibility.
	}

	public static void addArmorDecorationLayer(LivingEntityRenderer<?, ?, ?> renderer, ModItemsProvider content, EntityRendererProvider.Context context, LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper helper) {
		// Disabled for Fabric 1.21.4 compatibility.
	}

	public static void addHorseArmorDecorationLayer(HorseRenderer renderer, ModItemsProvider content, EntityRendererProvider.Context context, LivingEntityFeatureRendererRegistrationCallback.RegistrationHelper helper) {
		// Disabled for Fabric 1.21.4 compatibility.
	}

	public static void setupPlatform(ModItemsProvider content)
	{
		MedievalArmorLayer layer = new MedievalArmorLayer();
		for (RegistrySupplier<? extends Item> supplier : content.armorItems)
			ArmorRenderer.register(layer, supplier.get());
	}

	public static void registerModelsLoadListener(ModItemsProvider content)
	{
		LivingEntityFeatureRendererRegistrationCallback.EVENT.register((entitytype, renderer, helper, context) -> {
			ModRender.loadModels(content, context);
		});
	}

	public static HeraldryItemStackRenderer createHeraldryItemStackRenderer(String id, ResourceLocation location)
	{
		return new HeraldryItemStackRendererFabric(id, location);
	}
}
