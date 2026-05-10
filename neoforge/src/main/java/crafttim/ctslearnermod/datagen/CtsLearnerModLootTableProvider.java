package crafttim.ctslearnermod.datagen;

import crafttim.ctslearnermod.init.ModBlocks;
import crafttim.ctslearnermod.services.NeoForgeRegistryHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class CtsLearnerModLootTableProvider extends LootTableProvider {
    public CtsLearnerModLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output,
                Set.of(),
                List.of(
                        new SubProviderEntry(CtsLearnerModLootSubProvider::new, LootContextParamSets.BLOCK)
                ),
                registries
        );
    }

    private static final class CtsLearnerModLootSubProvider extends BlockLootSubProvider {
        CtsLearnerModLootSubProvider(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected void generate() {
            dropSelf(ModBlocks.EXAMPLE_BLOCK.block().get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return NeoForgeRegistryHelper.BLOCKS.getEntries()
                    .stream()
                    .map(entry -> (Block) entry.value())
                    .toList();
        }
    }
}
