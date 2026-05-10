package crafttim.ctslearnermod;

import crafttim.ctslearnermod.datagen.CtsLearnerModEnglishLanguageProvider;
import crafttim.ctslearnermod.datagen.CtsLearnerModLootTableProvider;
import crafttim.ctslearnermod.datagen.CtsLearnerModModelProvider;
import crafttim.ctslearnermod.datagen.CtsLearnerModBlockTagProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

final public class CtsLearnerModDatagen {
    private CtsLearnerModDatagen() {
    }

    public static void onGatherClientData(GatherDataEvent.Client event) {
        event.createProvider(CtsLearnerModModelProvider::new);
        event.createProvider(CtsLearnerModEnglishLanguageProvider::new);
        event.createProvider(CtsLearnerModBlockTagProvider::new);
        event.createProvider(CtsLearnerModLootTableProvider::new);
    }
}
