package crafttim.ctslearnermod.datagen;

import crafttim.ctslearnermod.Constants;
import crafttim.ctslearnermod.init.ModBlocks;
import crafttim.ctslearnermod.init.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class CtsLearnerModEnglishLanguageProvider extends LanguageProvider {
    public CtsLearnerModEnglishLanguageProvider(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.EXAMPLE_ITEM.get(), "Example Item");
        add(ModItems.EXAMPLE_ITEM2.get(), "Example Item 2");
        add(ModBlocks.EXAMPLE_BLOCK.block().get(), "Example Block");
        add(ModBlocks.EXAMPLE_BLOCK.item().get(), "Example Block");
    }

    private void add(Component component, String value) {
        if (component.getContents() instanceof TranslatableContents translatableContents) {
            add(translatableContents.getKey(), value);
        }
    }
}
