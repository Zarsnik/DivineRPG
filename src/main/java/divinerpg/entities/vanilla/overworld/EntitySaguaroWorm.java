package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.base.EntityDivineMob;
import divinerpg.registries.*;
import divinerpg.util.EntityStats;
import net.minecraft.block.Blocks;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.*;
import net.minecraft.pathfinding.*;
import net.minecraft.util.*;
import net.minecraft.world.*;


public class EntitySaguaroWorm extends EntityDivineMob {
    private static final DataParameter<Boolean> PROVOKED = EntityDataManager.defineId(EntitySaguaroWorm.class, DataSerializers.BOOLEAN);
    public EntitySaguaroWorm(EntityType<? extends EntitySaguaroWorm> type, World worldIn) {
        super(type, worldIn);
    }
    @Override
    public boolean needsSpecialAI() {
        return true;
    }

    public double getMyRidingOffset() {return (double)(2.5F);
    }

    protected PathNavigator createNavigation(World worldIn) {
        return new ClimberPathNavigator(this, worldIn);
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        entityData.define(PROVOKED, Boolean.valueOf(false));
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        addAttackingAI();
    }
    public boolean getProvoked() {
        return this.entityData.get(PROVOKED).booleanValue();
    }

    public void setProvoked(boolean provoked) {
        entityData.set(PROVOKED, Boolean.valueOf(provoked));
    }
    public void tick() {
        super.tick();
        if (!this.level.isClientSide) {
            PlayerEntity player = this.level.getNearestPlayer(this, 10.0D);
            this.setTarget(player);
            if (player == null) {
                this.setProvoked(false);
            } else {
                this.setProvoked(true);
                if (this.tickCount % 50 == 0) {
                    this.attack(player);
                }
            }
        }
        if (!this.getProvoked()) {
            this.xRotO = 0;
        }
    }
    public void attack(LivingEntity e) {
        double y = this.getBoundingBox().minY + 2.7D;
        double tx = e.getX() - getX();
        double ty = e.getBoundingBox().minY - y;
        double tz = e.getZ() - getZ();

        for (double h = -1.5; h < 1.5; h += 0.5) {
            for (double r = 0; r < 1.5 - Math.abs(h); r += 0.5) {
                for (double theta = 0; theta < Math.PI * 2; theta += Math.PI / 2) {
                    //TODO - add saguaro worm shot
//                    EntitySaguaroWormShot shot = new EntitySaguaroWormShot(this.world, this);
//                    shot.posX = this.posX + r * Math.cos(theta);
//                    shot.posY = this.posY + 5 + h;
//                    shot.posZ = this.posZ + r * Math.sin(theta);
//                    shot.shoot(tx, ty, tz, 0.9f, 5);
//                    world.spawnEntity(shot);
                }
            }
        }
    }
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.saguaroWormHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.saguaroWormDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.saguaroWormSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.saguaroWormFollowRange);
    }
    public void readAdditionalSaveData(CompoundNBT tag) {
        super.readAdditionalSaveData(tag);
            setProvoked(tag.getBoolean("Provoked"));
    }

    public void addAdditionalSaveData(CompoundNBT tag) {
        super.addAdditionalSaveData(tag);
        tag.putBoolean("Provoked", this.getProvoked());
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.SAGUARO_WORM;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.SAGUARO_WORM;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_SAGUARO_WORM;
    }

    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return level.dimension() == World.OVERWORLD && level.getBlockState(blockPosition().below()).getBlock() == Blocks.SAND && super.canSpawn(worldIn, spawnReasonIn);
    }
}
