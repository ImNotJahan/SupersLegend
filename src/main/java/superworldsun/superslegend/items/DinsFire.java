package superworldsun.superslegend.items;

import java.util.List;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.*;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class DinsFire extends Item {
   public DinsFire(Item.Properties builder) {
      super(builder);
   }

   /**
    * Called when this item is used when targetting a Block
    */
   public ActionResultType onItemUse(ItemUseContext context) {
      PlayerEntity playerentity = context.getPlayer();
      World world = context.getWorld();
      BlockPos blockpos = context.getPos();
      BlockState blockstate = world.getBlockState(blockpos);
      if (CampfireBlock.canBeLit(blockstate) && playerentity.getFoodStats().getFoodLevel()>= 1) {
         world.playSound(playerentity, blockpos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
         world.setBlockState(blockpos, blockstate.with(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
         if (playerentity != null) {
            context.getItem().damageItem(1, playerentity, (p_219999_1_) -> {
               p_219999_1_.sendBreakAnimation(context.getHand());
            });
         }

         return ActionResultType.func_233537_a_(world.isRemote());
      } else {
         BlockPos blockpos1 = blockpos.offset(context.getFace());
         if (AbstractFireBlock.canLightBlock(world, blockpos1, context.getPlacementHorizontalFacing() ) && playerentity.getFoodStats().getFoodLevel()>= 1) {
            world.playSound(playerentity, blockpos1, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
            BlockState blockstate1 = AbstractFireBlock.getFireForPlacement(world, blockpos1);
            playerentity.addExhaustion(4f);
            world.setBlockState(blockpos1, blockstate1, 11);
            ItemStack itemstack = context.getItem();
            if (playerentity instanceof ServerPlayerEntity) {
               CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity)playerentity, blockpos1, itemstack);
               itemstack.damageItem(1, playerentity, (p_219998_1_) -> {
                  p_219998_1_.sendBreakAnimation(context.getHand());
               });
            }

            return ActionResultType.func_233537_a_(world.isRemote());
         } else {
            return ActionResultType.FAIL;
         }
      }
   }

   /**
    * Checks the passed blockstate for a campfire block, if it is not waterlogged and not lit.
    */
   public static boolean isUnlitCampfire(BlockState state) {
      return state.getBlock() == Blocks.CAMPFIRE && !state.get(BlockStateProperties.WATERLOGGED) && !state.get(BlockStateProperties.LIT);
   }


   @Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.RED + "Through Din, you can set the world ablaze"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Right-click to use"));
		list.add(new StringTextComponent(TextFormatting.GRAY + "Uses Stamina on use"));
	}
}