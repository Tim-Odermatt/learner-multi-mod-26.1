package crafttim.ctslearnermod.datagen;

import crafttim.ctslearnermod.Constants;
import crafttim.ctslearnermod.init.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class CtsLearnerModBlockTagProvider extends BlockTagsProvider {
    public CtsLearnerModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add((Block) ModBlocks.EXAMPLE_BLOCK.block().get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add((Block) ModBlocks.EXAMPLE_BLOCK.block().get());
    }
}
