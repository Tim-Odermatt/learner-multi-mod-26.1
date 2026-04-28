package crafttim.ctslearnermod.init;

import crafttim.ctslearnermod.services.Services;
import crafttim.ctslearnermod.services.util.RegistryHandle;
import net.minecraft.world.item.Item;

public final class ModItems {
    private ModItems() {
    }

    public static void load() {
    }

    public static final RegistryHandle<Item> EXAMPLE_ITEM = Services.REGISTRY.registerItem("example_item",
            properties -> new Item(properties.stacksTo(32)));

    public static final RegistryHandle<Item> EXAMPLE_ITEM2 = Services.REGISTRY.registerItem("example_item2",
            Item::new);
}

