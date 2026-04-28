package crafttim.ctslearnermod;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {
	public static final String MOD_ID = "ctslearnermod"; //same as the id in gradle.properties
	public static final String MOD_NAME = "Crafttim Learner Mod";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);

	public static Identifier id(String name) {
		return  Identifier.fromNamespaceAndPath(MOD_ID, name);
	}
}