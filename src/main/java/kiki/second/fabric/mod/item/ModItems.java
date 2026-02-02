package kiki.second.fabric.mod.item;

import kiki.second.fabric.mod.KikiSecondFabricMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item MANGUITO = registerItem("manguito", new Item(new Item.Settings()));
    public static final Item GOLDEN_MANGUITO = registerItem("golden_manguito", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KikiSecondFabricMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        KikiSecondFabricMod.LOGGER.info("Registering Mod Items for " + KikiSecondFabricMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
//            fabricItemGroupEntries.add(MANGUITO);
//            fabricItemGroupEntries.add(GOLDEN_MANGUITO);
//        });
    }
}
