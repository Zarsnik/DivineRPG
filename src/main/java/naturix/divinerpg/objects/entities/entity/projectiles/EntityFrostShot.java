package naturix.divinerpg.objects.entities.entity.projectiles;

import java.util.List;

import naturix.divinerpg.objects.entities.entity.EntityFrostCloud;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.util.DamageSource;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityFrostShot extends EntityFireball {
    public EntityFrostShot(World worldIn) {
        super(worldIn);
        this.setSize(1.0F, 1.0F);
    }

    @SideOnly(Side.CLIENT)
    public EntityFrostShot(World worldIn, double x, double y, double z, double accelX, double accelY, double accelZ) {
        super(worldIn, x, y, z, accelX, accelY, accelZ);
        this.setSize(1.0F, 1.0F);
    }

    public EntityFrostShot(World worldIn, EntityLivingBase shooter, double accelX, double accelY, double accelZ) {
        super(worldIn, shooter, accelX, accelY, accelZ);
        this.setSize(1.0F, 1.0F);
    }

    public static void registerFixesDragonFireball(DataFixer fixer) {
        EntityFireball.registerFixesFireball(fixer, "FrostShot");
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onImpact(RayTraceResult result) {
        if (result.entityHit == null || !result.entityHit.isEntityEqual(this.shootingEntity)) {
            if (!this.world.isRemote) {
                List<EntityLivingBase> list = this.world.<EntityLivingBase>getEntitiesWithinAABB(EntityLivingBase.class,
                        this.getEntityBoundingBox().grow(4.0D, 2.0D, 4.0D));
                EntityFrostCloud frostCloud = new EntityFrostCloud(this.world, this.posX, this.posY, this.posZ);

                // frostCloud.setParticle(EnumParticleTypes.SNOWBALL);
                // frostCloud.setWaitTime(0);
                frostCloud.setOwner(this.shootingEntity);
                frostCloud.setRadius(3.0F);
                frostCloud.setDuration(50);
                frostCloud.setRadiusPerTick((0.0F - frostCloud.getRadius()) / (float) frostCloud.getDuration());

                if (!list.isEmpty()) {
                    for (EntityLivingBase entitylivingbase : list) {
                        double d0 = this.getDistanceSq(entitylivingbase);

                        if (d0 < 16.0D) {
                            frostCloud.setPosition(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ);
                            break;
                        }
                    }
                }

                this.world.playEvent(2006, new BlockPos(this.posX, this.posY, this.posZ), 0);
                this.world.spawnEntity(frostCloud);
                this.setDead();
            }
        }
    }

    public boolean canBeCollidedWith() {
        return false;
    }

    public boolean attackEntityFrom(DamageSource source, float amount) {
        return false;
    }

    protected boolean isFireballFiery() {
        return false;
    }
}
