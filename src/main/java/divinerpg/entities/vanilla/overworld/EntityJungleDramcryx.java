package divinerpg.entities.vanilla.overworld;

import divinerpg.entities.base.*;
import divinerpg.registries.*;
import divinerpg.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.monster.*;
import net.minecraft.util.*;
import net.minecraft.world.*;

public class EntityJungleDramcryx extends EntityDivineMob {

    public EntityJungleDramcryx(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }

    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 0.8F;
    }

    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.jungleDramcryxHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.jungleBatDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.jungleBatSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.jungleDramcryxFollowRange);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        addAttackingAI();
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.DRAMCRYX;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.DRAMCRYX_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.DRAMCRYX_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_JUNGLE_DRAMCRYX;
    }

}