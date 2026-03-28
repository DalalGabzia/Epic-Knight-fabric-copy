
package com.magistuarmory.block;

import com.magistuarmory.EpicKnights;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(EpicKnights.ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<PaviseBlockEntity>> PAVISE = BLOCK_ENTITY_TYPES.register(
        "pavise",
        () -> BlockEntityType.create(
            PaviseBlockEntity::new,
            ModBlocks.WOOD_PAVISE.get(),
            ModBlocks.GOLD_PAVISE.get(),
            ModBlocks.STONE_PAVISE.get(),
            ModBlocks.IRON_PAVISE.get(),
            ModBlocks.DIAMOND_PAVISE.get(),
            ModBlocks.NETHERITE_PAVISE.get(),
            ModBlocks.TIN_PAVISE.get(),
            ModBlocks.COPPER_PAVISE.get(),
            ModBlocks.SILVER_PAVISE.get(),
            ModBlocks.BRONZE_PAVISE.get(),
            ModBlocks.STEEL_PAVISE.get()
        )
    );

    public static void register() {
        BLOCK_ENTITY_TYPES.register();
    }
}
