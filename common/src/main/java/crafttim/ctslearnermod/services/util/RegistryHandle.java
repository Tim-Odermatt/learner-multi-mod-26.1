package crafttim.ctslearnermod.services.util;

import net.minecraft.resources.Identifier;

import java.util.function.Supplier;

public interface RegistryHandle<T> extends Supplier {
    Identifier id();
}
