package kiki.second.fabric.mod;

import kiki.second.fabric.mod.block.ModBlocks;
import kiki.second.fabric.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KikiSecondFabricMod implements ModInitializer {

	public static final String MOD_ID = "kiki_second_fabric_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}