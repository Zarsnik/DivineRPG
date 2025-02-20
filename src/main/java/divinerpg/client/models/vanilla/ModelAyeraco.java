package divinerpg.client.models.vanilla;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelAyeraco<T extends Entity> extends SegmentedModel<T> {
    // fields
    ModelRenderer BodyLower;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Tail;
    ModelRenderer WingLB;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Shape1;
    ModelRenderer WingRB;
    ModelRenderer WingRF;
    ModelRenderer WingLF;
    ModelRenderer WingRExtB;
    ModelRenderer WingLExtB;
    ModelRenderer WingLExtF;
    ModelRenderer WingRExtF;
    ModelRenderer WingRExt;
    ModelRenderer WingRM;
    ModelRenderer WingLM;
    ModelRenderer WingLExtM;
    ModelRenderer Mouth1;
    ModelRenderer Butt;
    ModelRenderer Head2;
    ModelRenderer Mouth2;
    ModelRenderer Body;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;

    public ModelAyeraco() {
        texWidth = 64;
        texHeight = 32;

        BodyLower = new ModelRenderer(this, 0, 0);
        BodyLower.addBox(0F, -1F, 0F, 10, 1, 12);
        BodyLower.setPos(-5F, 18F, -6F);
        BodyLower.setTexSize(64, 32);
        BodyLower.mirror = true;
        setRotation(BodyLower, 0F, 0F, 0F);
        Neck = new ModelRenderer(this, 13, 16);
        Neck.addBox(0F, -1F, 0F, 12, 4, 2);
        Neck.setPos(-6F, 13F, -10F);
        Neck.setTexSize(64, 32);
        Neck.mirror = true;
        setRotation(Neck, 0F, 0F, 0F);
        Head = new ModelRenderer(this, 0, 19);
        Head.addBox(0F, -1F, 0F, 6, 6, 7);
        Head.setPos(3F, 12F, -17F);
        Head.setTexSize(64, 32);
        Head.mirror = true;
        setRotation(Head, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 40, 0);
        Tail.addBox(-1F, 0F, 0F, 2, 1, 10);
        Tail.setPos(3F, 14F, 14F);
        Tail.setTexSize(64, 32);
        Tail.mirror = true;
        setRotation(Tail, 0F, 0F, 0F);
        WingLB = new ModelRenderer(this, 28, 27);
        WingLB.addBox(0F, 0F, 2F, 8, 1, 4);
        WingLB.setPos(5F, 13F, 1F);
        WingLB.setTexSize(64, 32);
        WingLB.mirror = true;
        setRotation(WingLB, 0F, 0F, 0F);
        Tail2 = new ModelRenderer(this, 40, 0);
        Tail2.addBox(-1F, 0F, 0F, 2, 1, 10);
        Tail2.setPos(0F, 14F, 14F);
        Tail2.setTexSize(64, 32);
        Tail2.mirror = true;
        setRotation(Tail2, 0F, 0F, 0F);
        Tail3 = new ModelRenderer(this, 40, 0);
        Tail3.addBox(-1F, 0F, 0F, 2, 1, 10);
        Tail3.setPos(-3F, 14F, 14F);
        Tail3.setTexSize(64, 32);
        Tail3.mirror = true;
        setRotation(Tail3, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 44, 20);
        Shape1.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape1.setPos(-2F, 9F, 14F);
        Shape1.setTexSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0.4089647F, 0F, 0F);
        WingRB = new ModelRenderer(this, 28, 27);
        WingRB.addBox(-7F, 0F, 2F, 8, 1, 4);
        WingRB.setPos(-6F, 13F, 1F);
        WingRB.setTexSize(64, 32);
        WingRB.mirror = true;
        setRotation(WingRB, 0F, 0F, 0F);
        WingRF = new ModelRenderer(this, 28, 27);
        WingRF.addBox(-7F, 0F, -2F, 8, 1, 4);
        WingRF.setPos(-6F, 13F, -3F);
        WingRF.setTexSize(64, 32);
        WingRF.mirror = true;
        setRotation(WingRF, 0F, 0F, 0F);
        WingLF = new ModelRenderer(this, 28, 27);
        WingLF.addBox(0F, 0F, -2F, 8, 1, 4);
        WingLF.setPos(5F, 13F, -3F);
        WingLF.setTexSize(64, 32);
        WingLF.mirror = true;
        setRotation(WingLF, 0F, 0F, 0F);
        WingRExtB = new ModelRenderer(this, 28, 27);
        WingRExtB.addBox(-15F, 0F, 3F, 8, 1, 2);
        WingRExtB.setPos(-6F, 13F, 1F);
        WingRExtB.setTexSize(64, 32);
        WingRExtB.mirror = true;
        setRotation(WingRExtB, 0F, 0F, 0F);
        WingLExtB = new ModelRenderer(this, 28, 27);
        WingLExtB.addBox(8F, 0F, 3F, 8, 1, 2);
        WingLExtB.setPos(5F, 13F, 1F);
        WingLExtB.setTexSize(64, 32);
        WingLExtB.mirror = true;
        setRotation(WingLExtB, 0F, 0F, 0F);
        WingLExtF = new ModelRenderer(this, 28, 27);
        WingLExtF.addBox(8F, 0F, -1F, 8, 1, 2);
        WingLExtF.setPos(5F, 13F, -3F);
        WingLExtF.setTexSize(64, 32);
        WingLExtF.mirror = true;
        setRotation(WingLExtF, 0F, 0F, 0F);
        WingRExtF = new ModelRenderer(this, 28, 27);
        WingRExtF.addBox(-15F, 0F, -1F, 8, 1, 2);
        WingRExtF.setPos(-6F, 13F, -3F);
        WingRExtF.setTexSize(64, 32);
        WingRExtF.mirror = true;
        setRotation(WingRExtF, 0F, 0F, 0F);
        WingRExt = new ModelRenderer(this, 28, 27);
        WingRExt.addBox(-15F, 0F, 3F, 8, 1, 2);
        WingRExt.setPos(-6F, 13F, -3F);
        WingRExt.setTexSize(64, 32);
        WingRExt.mirror = true;
        setRotation(WingRExt, 0F, 0F, 0F);
        WingRM = new ModelRenderer(this, 28, 27);
        WingRM.addBox(-7F, 0F, 2F, 8, 1, 4);
        WingRM.setPos(-6F, 13F, -3F);
        WingRM.setTexSize(64, 32);
        WingRM.mirror = true;
        setRotation(WingRM, 0F, 0F, 0F);
        WingLM = new ModelRenderer(this, 28, 27);
        WingLM.addBox(0F, 0F, 2F, 8, 1, 4);
        WingLM.setPos(5F, 13F, -3F);
        WingLM.setTexSize(64, 32);
        WingLM.mirror = true;
        setRotation(WingLM, 0F, 0F, 0F);
        WingLExtM = new ModelRenderer(this, 28, 27);
        WingLExtM.addBox(8F, 0F, 3F, 8, 1, 2);
        WingLExtM.setPos(5F, 13F, -3F);
        WingLExtM.setTexSize(64, 32);
        WingLExtM.mirror = true;
        setRotation(WingLExtM, 0F, 0F, 0F);
        Mouth1 = new ModelRenderer(this, 0, 19);
        Mouth1.addBox(0F, -1F, -7F, 6, 1, 7);
        Mouth1.setPos(3F, 18F, -10F);
        Mouth1.setTexSize(64, 32);
        Mouth1.mirror = true;
        setRotation(Mouth1, 0.0743572F, 0F, 0F);
        Butt = new ModelRenderer(this, 10, 12);
        Butt.addBox(0F, -1F, 0F, 10, 4, 6);
        Butt.setPos(-5F, 13F, 8F);
        Butt.setTexSize(64, 32);
        Butt.mirror = true;
        setRotation(Butt, 0F, 0F, 0F);
        Head2 = new ModelRenderer(this, 0, 19);
        Head2.addBox(0F, -1F, 0F, 6, 6, 7);
        Head2.setPos(-9F, 12F, -17F);
        Head2.setTexSize(64, 32);
        Head2.mirror = true;
        setRotation(Head2, 0F, 0F, 0F);
        Mouth2 = new ModelRenderer(this, 0, 19);
        Mouth2.addBox(0F, -1F, -7F, 6, 1, 7);
        Mouth2.setPos(-9F, 18F, -10F);
        Mouth2.setTexSize(64, 32);
        Mouth2.mirror = true;
        setRotation(Mouth2, 0.0743572F, 0F, 0F);
        Body = new ModelRenderer(this, 0, 0);
        Body.addBox(0F, -1F, 0F, 10, 6, 16);
        Body.setPos(-5F, 12F, -8F);
        Body.setTexSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 44, 20);
        Shape2.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape2.setPos(-2F, 13F, 10F);
        Shape2.setTexSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0.7807508F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 46, 20);
        Shape3.addBox(0F, -1F, 0F, 2, 1, 6);
        Shape3.setPos(5F, 12F, -16F);
        Shape3.setTexSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0.7807508F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 46, 20);
        Shape4.addBox(0F, -1F, 0F, 2, 1, 6);
        Shape4.setPos(5F, 8F, -12F);
        Shape4.setTexSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, 0.4089647F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 44, 20);
        Shape5.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape5.setPos(-2F, 12F, -2F);
        Shape5.setTexSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, 0.7807508F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 44, 20);
        Shape6.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape6.setPos(-2F, 8F, 2F);
        Shape6.setTexSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, 0.4089647F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 44, 20);
        Shape7.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape7.setPos(-2F, 12F, 3F);
        Shape7.setTexSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, 0.7807508F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 44, 20);
        Shape8.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape8.setPos(-2F, 8F, 7F);
        Shape8.setTexSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, 0.4089647F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 44, 20);
        Shape9.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape9.setPos(-2F, 12F, 7F);
        Shape9.setTexSize(64, 32);
        Shape9.mirror = true;
        setRotation(Shape9, 0.7807508F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 44, 20);
        Shape10.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape10.setPos(-2F, 8F, 11F);
        Shape10.setTexSize(64, 32);
        Shape10.mirror = true;
        setRotation(Shape10, 0.4089647F, 0F, 0F);
        Shape11 = new ModelRenderer(this, 44, 20);
        Shape11.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape11.setPos(-2F, 12F, -7F);
        Shape11.setTexSize(64, 32);
        Shape11.mirror = true;
        setRotation(Shape11, 0.7807508F, 0F, 0F);
        Shape12 = new ModelRenderer(this, 44, 20);
        Shape12.addBox(0F, -1F, 0F, 4, 1, 6);
        Shape12.setPos(-2F, 8F, -3F);
        Shape12.setTexSize(64, 32);
        Shape12.mirror = true;
        setRotation(Shape12, 0.4089647F, 0F, 0F);
        Shape13 = new ModelRenderer(this, 46, 20);
        Shape13.addBox(0F, -1F, 0F, 2, 1, 6);
        Shape13.setPos(-7F, 12F, -16F);
        Shape13.setTexSize(64, 32);
        Shape13.mirror = true;
        setRotation(Shape13, 0.7807508F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 46, 20);
        Shape14.addBox(0F, -1F, 0F, 2, 1, 6);
        Shape14.setPos(-7F, 8F, -12F);
        Shape14.setTexSize(64, 32);
        Shape14.mirror = true;
        setRotation(Shape14, 0.4089647F, 0F, 0F);
    }

    @Override
    public void setupAnim(T entityIn, float par1, float par2, float par3, float par4, float par5) {
        this.WingRF.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.WingRM.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.WingRB.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.WingRExtF.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.WingRExt.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.WingRExtB.zRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;

        this.WingLF.zRot = -this.WingRF.zRot;
        this.WingLM.zRot = -this.WingRF.zRot;
        this.WingLB.zRot = -this.WingRF.zRot;
        this.WingLExtF.zRot = -this.WingRF.zRot;
        this.WingLExtM.zRot = -this.WingRF.zRot;
        this.WingLExtB.zRot = -this.WingRF.zRot;

        this.Tail.xRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.Tail2.xRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
        this.Tail3.xRot = MathHelper.cos(par4 * 0.1F) * (float) Math.PI * 0.15F;
    }

    @Override
    public Iterable<ModelRenderer> parts() {
        return ImmutableList.of(BodyLower, Neck, Head, Tail, WingLB, Tail2, Tail3, Shape1, WingRB, WingRF, WingLF, WingRExtB, WingLExtB, WingLExtF,
                WingRExtF, WingRExt, WingRM, WingLM, WingLExtM, Mouth1, Butt, Head2, Mouth2, Body, Shape2, Shape3, Shape4, Shape5,
                Shape6, Shape7, Shape8, Shape9, Shape10, Shape11, Shape12, Shape13, Shape14);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.xRot = x;
        model.yRot = y;
        model.zRot = z;
    }


}
