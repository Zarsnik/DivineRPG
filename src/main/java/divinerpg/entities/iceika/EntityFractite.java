package divinerpg.entities.iceika;

import divinerpg.entities.base.EntityDivineFlyingMob;
import divinerpg.registries.*;
import divinerpg.util.EntityStats;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class EntityFractite extends EntityDivineFlyingMob {
    public EntityFractite(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
    }
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 0.7F;
    }
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.fractiteHealth).add(Attributes.MOVEMENT_SPEED, EntityStats.fractiteSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.fractiteFollowRange);
    }
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return level.getBiome(blockPosition()).shouldSnow(worldIn, blockPosition());
    }

    //TODO - Fractite shot
//    @Nullable
//    @Override
//    protected AIDivineFireballAttack createShootAI() {

//        return new AIDivineFireballAttack(this,
//                (world1, parent, x, y, z, fireballStrength) ->
//                        new EntityFractiteShot(world1, this, x, y, z),
//                SoundRegistry.FRACTITE_ATTACK);
//    }


    @Override
    public int getMaxSpawnClusterSize() {
        return 1;
    }

    @Override
    public SoundEvent getAmbientSound() {
        return SoundRegistry.FRACTITE;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.FRACTITE_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.FRACTITE_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_FRACTITE;
    }
}
