package crafttim.ctslearnermod.datagen;

import crafttim.ctslearnermod.Constants;
import crafttim.ctslearnermod.init.ModBlocks;
import crafttim.ctslearnermod.init.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CtsLearnerModModelProvider extends ModelProvider {
    public CtsLearnerModModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem((Item) ModItems.EXAMPLE_ITEM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem((Item) ModItems.EXAMPLE_ITEM2.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube((Block) ModBlocks.EXAMPLE_BLOCK.block().get());
    }
}
