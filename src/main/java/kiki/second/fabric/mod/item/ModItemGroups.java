package kiki.second.fabric.mod.item;

import kiki.second.fabric.mod.KikiSecondFabricMod;
import kiki.second.fabric.mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AUTISM_STUFF_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(KikiSecondFabricMod.MOD_ID, "autism_stuff"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MANGUITO))
                    .displayName(Text.translatable("itemgroup.kiki_second_fabric_mod.autism_stuff"))
                    .entries((displayContext, entries) -> {

                        entries.add(ModItems.GOLDEN_MANGUITO);
                        entries.add(ModItems.MANGUITO);
                        entries.add(ModBlocks.KEY_BLOCK);
                        entries.add(ModItems.KEY);

                    }).build());

    public static void registerItemGroups() {
        KikiSecondFabricMod.LOGGER.info("Registering Item Groups for " + KikiSecondFabricMod.MOD_ID);
    }
}
