package kiki.second.fabric.mod.item.custom;

import kiki.second.fabric.mod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class KeyItem extends Item {
    public static final Map<Block, Block> KEY_MAP =
            Map.of(
                    ModBlocks.KEY_BLOCK, Blocks.AIR
            );

    public KeyItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if(KEY_MAP.containsKey(clickedBlock)) {
            if(!world.isClient()){
                world.setBlockState(context.getBlockPos(), KEY_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

//                context.getStack().use(((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
//                        item -> context.getPlayer().getActiveHand());

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_VAULT_OPEN_SHUTTER, SoundCategory.BLOCKS);
            }
        }

        return ActionResult.SUCCESS;
    }
}
