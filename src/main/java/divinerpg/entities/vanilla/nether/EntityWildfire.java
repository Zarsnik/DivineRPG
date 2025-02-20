package divinerpg.entities.vanilla.nether;

import divinerpg.entities.base.*;
import divinerpg.registries.*;
import divinerpg.util.*;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.projectile.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class EntityWildfire extends EntityDivineMob implements IRangedAttackMob {

    public EntityWildfire(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }
    public static AttributeModifierMap.MutableAttribute attributes() {
        return MonsterEntity.createMonsterAttributes().add(Attributes.MAX_HEALTH, EntityStats.wildFireHealth).add(Attributes.ATTACK_DAMAGE, EntityStats.wildFireDamage).add(Attributes.MOVEMENT_SPEED, EntityStats.wildFireSpeed).add(Attributes.FOLLOW_RANGE, EntityStats.wildFireFollowRange);
    }
    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
        return 1.75F;
    }
    @Override
    protected void registerGoals() {
        addAttackingAI();
        goalSelector.addGoal(0, new RangedAttackGoal(this, this.getAttribute(Attributes.MOVEMENT_SPEED).getBaseValue(), 1, (float)getAttribute(Attributes.FOLLOW_RANGE).getBaseValue()));
    }
    @Override
    public void performRangedAttack(LivingEntity target, float distanceFactor) {
        //TODO - Wildfire arrow
        ArrowEntity arrow = new ArrowEntity(level, this);
        arrow.setSecondsOnFire(100);
        double d0 = target.getX() - this.getX();
        double d1 = target.getBoundingBox().minY + target.getBbHeight() / 3.0F - this.getY();
        double d2 = target.getZ() - this.getZ();
        double d3 = MathHelper.sqrt(d0 * d0 + d2 * d2);
        arrow.shoot(d0, d1 + d3 * 0.20000000298023224D, d2, 1.6F, 12.0F);
        this.level.addFreshEntity(arrow);
    }
    public boolean canSpawn(IWorld worldIn, SpawnReason spawnReasonIn) {
        return level.dimension() == World.NETHER;
    }
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.WILDFIRE;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundRegistry.WILDFIRE_HURT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundRegistry.WILDFIRE_HURT;
    }

    @Override
    protected ResourceLocation getDefaultLootTable() {
        return LootTableRegistry.ENTITIES_WILDFIRE;
    }

}
