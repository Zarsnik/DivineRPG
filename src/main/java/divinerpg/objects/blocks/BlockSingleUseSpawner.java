package divinerpg.objects.blocks;

import divinerpg.DivineRPG;
import divinerpg.enums.ParticleType;
import divinerpg.objects.blocks.tile.entity.TileEntitySingleUseSpawner;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;
import java.util.function.Supplier;

public class BlockSingleUseSpawner extends BlockMod implements ITileEntityProvider {
    private final Class<? extends Entity> entityClass;
    private final int delay;
    private String name;
    private int nearDistance;
    private BlockPos spawnOffset;

    protected Supplier<Item> activationItemSupplier;

    /**
     * @param name         - name of block
     * @param entityClass  - entity to spwan class
     * @param delay        - possible delay. Pass zero to remove
     * @param nearDistance - auto spawn when player is within distance. Pass zero to disable
     */
    public BlockSingleUseSpawner(String name, Class<? extends Entity> entityClass, Supplier<Item> activationItemSupplier, int delay, int nearDistance) {
        this(name, entityClass, activationItemSupplier, delay, nearDistance, BlockPos.ORIGIN);
    }

    /**
     * @param name         - name of block
     * @param entityClass  - entity to spwan class
     * @param delay        - possible delay. Pass zero to remove
     * @param nearDistance - auto spawn when player is within distance. Pass zero to disable
     * @param spawnOffset  - initial spawn offset for entity position
     */
    public BlockSingleUseSpawner(String name, Class<? extends Entity> entityClass, Supplier<Item> activationItemSupplier, int delay, int nearDistance, BlockPos spawnOffset) {
        super(name, 1, Material.IRON);
        this.entityClass = entityClass;
        this.activationItemSupplier = activationItemSupplier;
        this.delay = delay;
        this.name = name;
        this.nearDistance = nearDistance;
        this.spawnOffset = spawnOffset;
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntitySingleUseSpawner(entityClass, delay, nearDistance, spawnOffset);
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        ItemStack heldItem = player.getHeldItem(hand);
        Item activationItem = activationItemSupplier.get();

        if (heldItem.getItem() != activationItem && activationItem != null) {
            if (!world.isRemote && hand == EnumHand.MAIN_HAND)
                player.sendMessage(new TextComponentTranslation("message.spawner.item", String.format("%s", activationItem.getItemStackDisplayName(new ItemStack(activationItem)))));

            return false;
        }

        if (world.getDifficulty() == EnumDifficulty.PEACEFUL) {
            if (!world.isRemote && hand == EnumHand.MAIN_HAND)
                player.sendMessage(new TextComponentTranslation("message.spawner.peaceful"));

            return false;
        }

        TileEntity spawnerTile = world.getTileEntity(pos);

        if (spawnerTile instanceof TileEntitySingleUseSpawner) {
            if (!world.isRemote && hand == EnumHand.MAIN_HAND) {
                ((TileEntitySingleUseSpawner)spawnerTile).activate(player);

                if (!player.isCreative())
                    heldItem.shrink(1);
            }

            return true;
        }

        return false;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.AIR;
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        return 15 + RANDOM.nextInt(15) + RANDOM.nextInt(15);
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        return ItemStack.EMPTY;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        super.randomDisplayTick(stateIn, worldIn, pos, rand);

        TileEntity tileEntity = worldIn.getTileEntity(pos);
        if (!(tileEntity instanceof TileEntitySingleUseSpawner) || !((TileEntitySingleUseSpawner) tileEntity).isActivated())
            return;

        DivineRPG.proxy.spawnParticle(
                worldIn,
                ParticleType.BLACK_FLAME,
                pos.getY() + Math.random() - Math.random(),
                pos.getY() + Math.random(),
                pos.getZ() + Math.random() - Math.random(),
                Math.random(),
                Math.random(),
                Math.random());
    }
}
