package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.base.*;
import divinerpg.registries.*;
import divinerpg.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.monster.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class EntityCyclops extends EntityPeacefulUntilAttacked {


    public EntityCyclops(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
        xpReward = 40;
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 3.5F;
    }
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.cyclopsHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.cyclopsDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.cyclopsSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.cyclopsFollowRange);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.CYCLOPS;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.CYCLOPS_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.CYCLOPS_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_CYCLOPS;
    }


    @Override
    public boolean checkSpawnRules(IWorld world, SpawnReason reason) {
        if (world.getBrightness(LightType.SKY, blockPosition()) > random.nextInt(32)) {
            return false;
        } else {
            int i = world.getLightEmission(blockPosition());

            if (level.isThundering()) {
                int j = world.getSkyDarken();
                world.getLightEngine().onBlockEmissionIncrease(blockPosition(), 10);
                i = world.getLightEmission(blockPosition());
                world.getLightEngine().onBlockEmissionIncrease(blockPosition(), j);
            }

            return i <= random.nextInt(8);
        }
    }


    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return level.dimension() == World.OVERWORLD && getY() > level.getSeaLevel();
    }
}