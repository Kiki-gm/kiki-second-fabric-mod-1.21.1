package kiki.second.fabric.mod.block;

import kiki.second.fabric.mod.KikiSecondFabricMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block KEY_BLOCK = registerBlock("key_block",
            new Block(AbstractBlock.Settings.create()
                    .hardness(-1f).requiresTool().sounds(BlockSoundGroup.WOOD)));

    private static Block registerBlock(String name, Block block) {
         registerBlockItem(name, block);
         return Registry.register(Registries.BLOCK, Identifier.of(KikiSecondFabricMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(KikiSecondFabricMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks() {
        KikiSecondFabricMod.LOGGER.info("Registering Mod Blocks for " + KikiSecondFabricMod.MOD_ID);
    }
}
