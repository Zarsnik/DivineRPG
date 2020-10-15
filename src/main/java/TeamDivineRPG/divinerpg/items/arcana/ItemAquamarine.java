package TeamDivineRPG.divinerpg.items.arcana;

import TeamDivineRPG.divinerpg.DivineRPG;
import TeamDivineRPG.divinerpg.items.base.ItemMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class ItemAquamarine extends ItemMod {

    private final Fluid containedBlock = Fluids.FLOWING_WATER;
    public ItemAquamarine(String name) {
        super(name, new Item.Properties().group(DivineRPG.tabs.utilities).maxDamage(10));
    }

    @Override
    public ActionResultType onItemUse(ItemUseContext context){
        PlayerEntity playerIn = context.getPlayer();
        World worldIn = context.getWorld();
        ItemStack itemstack = playerIn.getHeldItem(context.getHand());
        RayTraceResult raytraceresult = rayTrace(worldIn, playerIn, this.containedBlock == Fluids.EMPTY ? RayTraceContext.FluidMode.SOURCE_ONLY : RayTraceContext.FluidMode.NONE);
        BlockPos pos = new BlockPos(raytraceresult.getHitVec());
        Direction facing = null;
        int i = pos.getX(), j = pos.getY(), k = pos.getZ();
        Block block = worldIn.getBlockState(new BlockPos(i, j, k)).getBlock();

        if (block == Blocks.SNOW)
            facing = Direction.DOWN;

        else {
            if (facing == Direction.UP)
                --j;
            else if (facing == Direction.DOWN)
                ++j;
            else if (facing == Direction.EAST)
                --k;
            else if (facing == Direction.WEST)
                ++k;
            else if (facing == Direction.NORTH)
                --i;
            else if (facing == Direction.SOUTH)
                ++i;
        }
        ItemStack stack = new ItemStack(this);
        if (!playerIn.canPlayerEdit(new BlockPos(i, j, k), facing, stack) || stack.getCount() == 0)
            return ActionResultType.FAIL;

        if (!worldIn.isRemote)
            worldIn.setBlockState(new BlockPos(i, j, k), Fluids.WATER.getDefaultState().getBlockState(), 3);
        if (!playerIn.isCreative())
            stack.setDamage(getDamage(stack)-1);
                return ActionResultType.FAIL;

        }
    protected static BlockRayTraceResult rayTrace(World worldIn, PlayerEntity player, RayTraceContext.FluidMode fluidMode) {
        float f = player.rotationPitch;
        float f1 = player.rotationYaw;
        Vector3d vector3d = player.getEyePosition(1.0F);
        float f2 = MathHelper.cos(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f3 = MathHelper.sin(-f1 * ((float)Math.PI / 180F) - (float)Math.PI);
        float f4 = -MathHelper.cos(-f * ((float)Math.PI / 180F));
        float f5 = MathHelper.sin(-f * ((float)Math.PI / 180F));
        float f6 = f3 * f4;
        float f7 = f2 * f4;
        double d0 = player.getAttribute(net.minecraftforge.common.ForgeMod.REACH_DISTANCE.get()).getValue();
        Vector3d vector3d1 = vector3d.add((double)f6 * d0, (double)f5 * d0, (double)f7 * d0);
        return worldIn.rayTraceBlocks(new RayTraceContext(vector3d, vector3d1, RayTraceContext.BlockMode.OUTLINE, fluidMode, player));
    }
}