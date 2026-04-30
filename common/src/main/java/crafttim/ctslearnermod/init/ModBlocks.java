package crafttim.ctslearnermod.init;

import crafttim.ctslearnermod.services.Services;
import crafttim.ctslearnermod.services.util.BlockWithItemRegistryHandle;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    private ModBlocks() {

    }

    public static void load() {
    }

    public static final BlockWithItemRegistryHandle<Block> EXAMPLE_BLOCK = Services.REGISTRY.registerBlockWithItem("example_block",
            properties -> new Block(properties.requiresCorrectToolForDrops()),
            (block, properties) -> new BlockItem(block, properties.stacksTo(16)));
}
