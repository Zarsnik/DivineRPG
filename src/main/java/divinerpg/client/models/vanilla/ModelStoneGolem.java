package divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import divinerpg.entities.IAttackTimer;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.*;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelStoneGolem<T extends Entity> extends SegmentedModel<T> {
    // fields
    ModelRenderer LShoulder;
    ModelRenderer crystal;
    ModelRenderer Ring3;
    ModelRenderer Ring1;
    ModelRenderer Ring2;
    ModelRenderer headF4;
    ModelRenderer Body;
    ModelRenderer RShoulder;
    ModelRenderer LBodyL;
    ModelRenderer crown2;
    ModelRenderer Jaw;
    ModelRenderer headF1;
    ModelRenderer headF3;
    ModelRenderer headF2;
    ModelRenderer headB;
    ModelRenderer crown1;
    ModelRenderer forehead;
    ModelRenderer LFinger2;
    ModelRenderer RArm1;
    ModelRenderer RArm2;
    ModelRenderer LArm1;
    ModelRenderer LArm3;
    ModelRenderer LArm2;
    ModelRenderer LBodyR;
    ModelRenderer RArm3;
    ModelRenderer LFinger1;
    ModelRenderer LFinger4;
    ModelRenderer LFinger3;
    ModelRenderer RFinger1;
    ModelRenderer RFinger2;
    ModelRenderer RFinger4;
    ModelRenderer RFinger3;

    public ModelStoneGolem() {
        textureWidth = 128;
        textureHeight = 128;

        LShoulder = new ModelRenderer(this, 0, 94);
        LShoulder.addBox(-6F, -6F, -7F, 12, 12, 14);
        LShoulder.setRotationPoint(18F, -16F, -0.5F);
        LShoulder.setTextureSize(128, 128);
        LShoulder.mirror = true;
        setRotation(LShoulder, 0F, 0F, 0F);
        crystal = new ModelRenderer(this, 104, 94);
        crystal.addBox(0F, 0F, 0F, 5, 5, 5);
        crystal.setRotationPoint(-3F, 0F, -3F);
        crystal.setTextureSize(128, 128);
        crystal.mirror = true;
        setRotation(crystal, 0.7853982F, 0.4363323F, 0.6108652F);
        Ring3 = new ModelRenderer(this, 52, 117);
        Ring3.addBox(0F, 0F, 0F, 7, 0, 7);
        Ring3.setRotationPoint(-2.5F, 16F, -3F);
        Ring3.setTextureSize(128, 128);
        Ring3.mirror = true;
        setRotation(Ring3, 0F, 0F, 0F);
        Ring1 = new ModelRenderer(this, 52, 94);
        Ring1.addBox(0F, 0F, 0F, 13, 0, 13);
        Ring1.setRotationPoint(-5.5F, 8F, -7F);
        Ring1.setTextureSize(128, 128);
        Ring1.mirror = true;
        setRotation(Ring1, 0F, 0F, 0F);
        Ring2 = new ModelRenderer(this, 52, 107);
        Ring2.addBox(0F, 0F, 0F, 10, 0, 10);
        Ring2.setRotationPoint(-4F, 12F, -5F);
        Ring2.setTextureSize(128, 128);
        Ring2.mirror = true;
        setRotation(Ring2, 0F, 0F, 0F);
        headF4 = new ModelRenderer(this, 82, 7);
        headF4.addBox(-4F, -8F, -4F, 1, 2, 1);
        headF4.setRotationPoint(8F, -20F, -1F);
        headF4.setTextureSize(128, 128);
        headF4.mirror = true;
        setRotation(headF4, 0F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 68);
        Body.addBox(-4F, 0F, -2F, 28, 13, 13);
        Body.setRotationPoint(-10F, -20F, -5F);
        Body.setTextureSize(128, 128);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        RShoulder = new ModelRenderer(this, 0, 94);
        RShoulder.addBox(-6F, -6F, -7F, 12, 12, 14);
        RShoulder.setRotationPoint(-18F, -16F, -0.5F);
        RShoulder.setTextureSize(128, 128);
        RShoulder.mirror = true;
        setRotation(RShoulder, 0F, 0F, 0F);
        LBodyL = new ModelRenderer(this, 0, 18);
        LBodyL.addBox(-2F, 0F, -2F, 10, 10, 11);
        LBodyL.setRotationPoint(8F, -13.5F, -4F);
        LBodyL.setTextureSize(128, 128);
        LBodyL.mirror = true;
        setRotation(LBodyL, 0F, 0F, 0.7853982F);
        crown2 = new ModelRenderer(this, 90, 16);
        crown2.addBox(-4F, -8F, -4F, 10, 3, 4);
        crown2.setRotationPoint(-1F, -25F, 5F);
        crown2.setTextureSize(128, 128);
        crown2.mirror = true;
        setRotation(crown2, 0F, 0F, 0F);
        Jaw = new ModelRenderer(this, 38, 0);
        Jaw.addBox(-4F, -8F, -4F, 11, 4, 11);
        Jaw.setRotationPoint(-1.5F, -16F, -2F);
        Jaw.setTextureSize(128, 128);
        Jaw.mirror = true;
        setRotation(Jaw, 0F, 0F, 0F);
        headF1 = new ModelRenderer(this, 82, 0);
        headF1.addBox(-4F, -8F, -4F, 10, 6, 1);
        headF1.setRotationPoint(-1F, -18F, -1F);
        headF1.setTextureSize(128, 128);
        headF1.mirror = true;
        setRotation(headF1, 0F, 0F, 0F);
        headF3 = new ModelRenderer(this, 86, 7);
        headF3.addBox(-4F, -8F, -4F, 4, 2, 1);
        headF3.setRotationPoint(2F, -20F, -1F);
        headF3.setTextureSize(128, 128);
        headF3.mirror = true;
        setRotation(headF3, 0F, 0F, 0F);
        headF2 = new ModelRenderer(this, 82, 7);
        headF2.addBox(-4F, -8F, -4F, 1, 2, 1);
        headF2.setRotationPoint(-1F, -20F, -1F);
        headF2.setTextureSize(128, 128);
        headF2.mirror = true;
        setRotation(headF2, 0F, 0F, 0F);
        headB = new ModelRenderer(this, 0, 0);
        headB.addBox(-4F, -8F, -4F, 10, 4, 9);
        headB.setRotationPoint(-1F, -20F, 0F);
        headB.setTextureSize(128, 128);
        headB.mirror = true;
        setRotation(headB, 0F, 0F, 0F);
        crown1 = new ModelRenderer(this, 56, 16);
        crown1.addBox(-4F, -8F, -4F, 8, 4, 7);
        crown1.setRotationPoint(0F, -24.5F, 2.1F);
        crown1.setTextureSize(128, 128);
        crown1.mirror = true;
        setRotation(crown1, 0.4537856F, 0F, 0F);
        forehead = new ModelRenderer(this, 0, 40);
        forehead.addBox(-4F, -8F, -4F, 10, 2, 10);
        forehead.setRotationPoint(-1F, -22F, -1F);
        forehead.setTextureSize(128, 128);
        forehead.mirror = true;
        setRotation(forehead, 0F, 0F, 0F);
        LFinger2 = new ModelRenderer(this, 82, 28);
        LFinger2.addBox(0.5F, 33F, 3.5F, 2, 3, 1);
        LFinger2.setRotationPoint(18F, -16F, -0.5F);
        LFinger2.setTextureSize(128, 128);
        LFinger2.mirror = true;
        setRotation(LFinger2, 0F, 0F, 0F);
        RArm1 = new ModelRenderer(this, 40, 42);
        RArm1.addBox(-5F, 5F, -4F, 8, 13, 8);
        RArm1.setRotationPoint(-18F, -16F, -0.5F);
        RArm1.setTextureSize(128, 128);
        RArm1.mirror = true;
        setRotation(RArm1, 0F, 0F, 0F);
        RArm2 = new ModelRenderer(this, 82, 69);
        RArm2.addBox(-6F, 18F, -5F, 9, 13, 10);
        RArm2.setRotationPoint(-18F, -16F, -0.5F);
        RArm2.setTextureSize(128, 128);
        RArm2.mirror = true;
        setRotation(RArm2, 0F, 0F, 0F);
        LArm1 = new ModelRenderer(this, 40, 42);
        LArm1.addBox(-3F, 5F, -4F, 8, 13, 8);
        LArm1.setRotationPoint(18F, -16F, -0.5F);
        LArm1.setTextureSize(128, 128);
        LArm1.mirror = true;
        setRotation(LArm1, 0F, 0F, 0F);
        LArm3 = new ModelRenderer(this, 82, 28);
        LArm3.addBox(-3.5F, 30F, -5.5F, 10, 3, 11);
        LArm3.setRotationPoint(18F, -16F, -0.5F);
        LArm3.setTextureSize(128, 128);
        LArm3.mirror = true;
        setRotation(LArm3, 0F, 0F, 0F);
        LArm2 = new ModelRenderer(this, 82, 69);
        LArm2.addBox(-3F, 18F, -5F, 9, 13, 10);
        LArm2.setRotationPoint(18F, -16F, -0.5F);
        LArm2.setTextureSize(128, 128);
        LArm2.mirror = true;
        setRotation(LArm2, 0F, 0F, 0F);
        LBodyR = new ModelRenderer(this, 0, 18);
        LBodyR.addBox(-2F, 0F, -2F, 10, 10, 11);
        LBodyR.setRotationPoint(-5F, -13.5F, -4F);
        LBodyR.setTextureSize(128, 128);
        LBodyR.mirror = true;
        setRotation(LBodyR, 0F, 0F, 0.7853982F);
        RArm3 = new ModelRenderer(this, 82, 28);
        RArm3.addBox(-6.5F, 30F, -5.5F, 10, 3, 11);
        RArm3.setRotationPoint(-18F, -16F, -0.5F);
        RArm3.setTextureSize(128, 128);
        RArm3.mirror = true;
        setRotation(RArm3, 0F, 0F, 0F);
        LFinger1 = new ModelRenderer(this, 82, 28);
        LFinger1.addBox(4.5F, 33F, -1F, 1, 3, 2);
        LFinger1.setRotationPoint(18F, -16F, -0.5F);
        LFinger1.setTextureSize(128, 128);
        LFinger1.mirror = true;
        setRotation(LFinger1, 0F, 0F, 0F);
        LFinger4 = new ModelRenderer(this, 82, 28);
        LFinger4.addBox(0.5F, 33F, -4.5F, 2, 3, 1);
        LFinger4.setRotationPoint(18F, -16F, -0.5F);
        LFinger4.setTextureSize(128, 128);
        LFinger4.mirror = true;
        setRotation(LFinger4, 0F, 0F, 0F);
        LFinger3 = new ModelRenderer(this, 82, 28);
        LFinger3.addBox(-2.5F, 33F, -1F, 1, 3, 2);
        LFinger3.setRotationPoint(18F, -16F, -0.5F);
        LFinger3.setTextureSize(128, 128);
        LFinger3.mirror = true;
        setRotation(LFinger3, 0F, 0F, 0F);
        RFinger1 = new ModelRenderer(this, 82, 28);
        RFinger1.addBox(1.5F, 33F, -1F, 1, 3, 2);
        RFinger1.setRotationPoint(-18F, -16F, -0.5F);
        RFinger1.setTextureSize(128, 128);
        RFinger1.mirror = true;
        setRotation(RFinger1, 0F, 0F, 0F);
        RFinger2 = new ModelRenderer(this, 82, 28);
        RFinger2.addBox(-2.5F, 33F, 3.5F, 2, 3, 1);
        RFinger2.setRotationPoint(-18F, -16F, -0.5F);
        RFinger2.setTextureSize(128, 128);
        RFinger2.mirror = true;
        setRotation(RFinger2, 0F, 0F, 0F);
        RFinger4 = new ModelRenderer(this, 82, 28);
        RFinger4.addBox(-2.5F, 33F, -4.5F, 2, 3, 1);
        RFinger4.setRotationPoint(-18F, -16F, -0.5F);
        RFinger4.setTextureSize(128, 128);
        RFinger4.mirror = true;
        setRotation(RFinger4, 0F, 0F, 0F);
        RFinger3 = new ModelRenderer(this, 82, 28);
        RFinger3.addBox(-5.5F, 33F, -1F, 1, 3, 2);
        RFinger3.setRotationPoint(-18F, -16F, -0.5F);
        RFinger3.setTextureSize(128, 128);
        RFinger3.mirror = true;
        setRotation(RFinger3, 0F, 0F, 0F);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public Iterable<ModelRenderer> getParts() {
        return ImmutableList.of(
        LShoulder, crystal, Ring3, Ring1, Ring2, headF4, Body, RShoulder, LBodyL, crown2, Jaw, headF1, headF3, headF2, headB, crown1, forehead, LFinger2, RArm1, RArm2,
        LArm1, LArm3, LArm2, LBodyR, RArm3, LFinger1, LFinger4,  LFinger3, RFinger1, RFinger2, RFinger4, RFinger3);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setLivingAnimations(T e, float par2, float par3, float par4) {
        double r = 0;
        float armR = MathHelper.cos(par2 * 0.6662F + (float) Math.PI) * par3 * 0.5F;
        float armL = MathHelper.cos(par2 * 0.6662F) * par3 * 0.5F;
        if (((IAttackTimer) e).getAttackTimer() > 0) {
            r = this.getSwingAngle((float) ((IAttackTimer) e).getAttackTimer() - par4, 10) - 1;
        }
        this.RArm1.rotateAngleX = this.RArm2.rotateAngleX = this.RArm3.rotateAngleX = this.RFinger1.rotateAngleX = this.RFinger2.rotateAngleX = this.RFinger3.rotateAngleX = this.RFinger4.rotateAngleX = (float) r
                + armR;
        this.LArm1.rotateAngleX = this.LArm2.rotateAngleX = this.LArm3.rotateAngleX = this.LFinger1.rotateAngleX = this.LFinger2.rotateAngleX = this.LFinger3.rotateAngleX = this.LFinger4.rotateAngleX = (float) r
                + armL;
    }

    private float getSwingAngle(float timer, float maxTimer) {
        return (Math.abs(timer - maxTimer / 2) - maxTimer * 0.25F) / (maxTimer * 0.25F);
    }

}