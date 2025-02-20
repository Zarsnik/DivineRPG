package divinerpg.entities.wildwood;

import divinerpg.entities.base.EntityPeacefulUntilAttacked;
import divinerpg.registries.*;
import divinerpg.util.EntityStats;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class EntityEpiphite extends EntityPeacefulUntilAttacked {
    public EntityEpiphite(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
        xpReward=40;
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
    return 1.1F;
}
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.epiphiteHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.epiphiteDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.epiphiteSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.epiphiteFollowRange);
    }
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return level.dimension() == KeyRegistry.WILDWOOD_WORLD;
    }

    @Override
    public boolean fireImmune() {
        return true;
    }

    @Override
    public boolean doHurtTarget(Entity entity) {
        LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, level);
        if (this.random.nextInt(5) == 0)
            bolt.setPos(entity.getX(), entity.getY(), entity.getZ());
        if(level.isClientSide) {
            level.addFreshEntity(bolt);
        }
        return super.doHurtTarget(entity);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.GROWL;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.GROWL_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.GROWL_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_EPIPHITE;
    }
}