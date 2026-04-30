package crafttim.ctslearnermod.services.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public record BlockWithItemRegistryHandle<T extends Block>(
        RegistryHandle<T> block,
        RegistryHandle<? extends Item> item
) {
}
