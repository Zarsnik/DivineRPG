package divinerpg.client.models.twilight;

import com.google.common.collect.*;
import net.minecraft.client.renderer.entity.model.*;
import net.minecraft.client.renderer.model.*;
import net.minecraft.entity.*;
import net.minecraftforge.api.distmarker.*;

@OnlyIn(Dist.CLIENT)
public class ModelExperiencedCori<T extends Entity> extends SegmentedModel<T> {
  //fields
    ModelRenderer Head;
    ModelRenderer Tentacle1;
    ModelRenderer Tentacle2;
    ModelRenderer Tentacle3;
    ModelRenderer Tentacle4;
    ModelRenderer Tentacle5;
    ModelRenderer Tentacle6;
    ModelRenderer Tentacle7;
    ModelRenderer Tentacle8;
    ModelRenderer Tentacle9;
    ModelRenderer Tentacle10;
    ModelRenderer Tentacle11;
    ModelRenderer Tentacle12;
    ModelRenderer Tentacle13;
    ModelRenderer Tentacle14;
    ModelRenderer Tentacle15;
    ModelRenderer Tentacle16;
    ModelRenderer Tentacle17;
    ModelRenderer Tentacle18;
    ModelRenderer Tentacle19;
    ModelRenderer Tentacle20;
    ModelRenderer Tentacle21;
    ModelRenderer Tentacle22;
    ModelRenderer Tentacle23;
    ModelRenderer Tentacle24;
    ModelRenderer Tentacle25;
    ModelRenderer Tentacle26;
    ModelRenderer Tentacle27;
    ModelRenderer Tentacle28;
    ModelRenderer Tentacle29;
    ModelRenderer Tentacle30;
    ModelRenderer Tentacle31;
    ModelRenderer Tentacle32;
    ModelRenderer Tentacle33;
    ModelRenderer Tentacle34;
    ModelRenderer Tentacle35;
    ModelRenderer Tentacle36;
    ModelRenderer Tentacle37;
    ModelRenderer Tentacle38;
    ModelRenderer Tentacle39;
    ModelRenderer Tentacle40;
    ModelRenderer Tentacle41;
    ModelRenderer Tentacle42;
    ModelRenderer Tentacle43;
    ModelRenderer Tentacle44;
    ModelRenderer Tentacle45;
    ModelRenderer Tentacle46;
    ModelRenderer Tentacle47;
    ModelRenderer Tentacle48;
  
  public ModelExperiencedCori()
  {
    texWidth = 64;
    texHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-5F, -5F, -5F, 10, 10, 10);
      Head.setPos(0F, 11F, 0F);
      Head.setTexSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, -1.570796F, 0F);
      Tentacle1 = new ModelRenderer(this, 40, 0);
      Tentacle1.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle1.setPos(7F, 7F, 5F);
      Tentacle1.setTexSize(64, 32);
      Tentacle1.mirror = true;
      setRotation(Tentacle1, 0F, 1.570796F, 0F);
      Tentacle2 = new ModelRenderer(this, 11, 0);
      Tentacle2.addBox(-1F, -3F, -1F, 2, 5, 2);
      Tentacle2.setPos(6F, 17F, 5F);
      Tentacle2.setTexSize(64, 32);
      Tentacle2.mirror = true;
      setRotation(Tentacle2, 0F, 0F, 0F);
      Tentacle3 = new ModelRenderer(this, 40, 6);
      Tentacle3.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle3.setPos(3F, 2F, 0F);
      Tentacle3.setTexSize(64, 32);
      Tentacle3.mirror = true;
      setRotation(Tentacle3, 0F, 4.712389F, 0F);
      Tentacle4 = new ModelRenderer(this, 40, 6);
      Tentacle4.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle4.setPos(9F, 14F, 0F);
      Tentacle4.setTexSize(64, 32);
      Tentacle4.mirror = true;
      setRotation(Tentacle4, 0F, 4.712389F, 0F);
      Tentacle5 = new ModelRenderer(this, 40, 0);
      Tentacle5.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle5.setPos(-7F, 7F, 5F);
      Tentacle5.setTexSize(64, 32);
      Tentacle5.mirror = true;
      setRotation(Tentacle5, 0F, 4.712389F, 0F);
      Tentacle6 = new ModelRenderer(this, 40, 6);
      Tentacle6.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle6.setPos(11F, 7F, 5F);
      Tentacle6.setTexSize(64, 32);
      Tentacle6.mirror = true;
      setRotation(Tentacle6, 0F, 4.712389F, 0F);
      Tentacle7 = new ModelRenderer(this, 40, 6);
      Tentacle7.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle7.setPos(11F, 15F, 5F);
      Tentacle7.setTexSize(64, 32);
      Tentacle7.mirror = true;
      setRotation(Tentacle7, 0F, 4.712389F, 0F);
      Tentacle8 = new ModelRenderer(this, 40, 6);
      Tentacle8.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle8.setPos(-11F, 15F, 5F);
      Tentacle8.setTexSize(64, 32);
      Tentacle8.mirror = true;
      setRotation(Tentacle8, 0F, 4.712389F, 0F);
      Tentacle9 = new ModelRenderer(this, 40, 6);
      Tentacle9.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle9.setPos(-11F, 7F, 5F);
      Tentacle9.setTexSize(64, 32);
      Tentacle9.mirror = true;
      setRotation(Tentacle9, 0F, 4.712389F, 0F);
      Tentacle10 = new ModelRenderer(this, 40, 0);
      Tentacle10.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle10.setPos(5F, 14F, 0F);
      Tentacle10.setTexSize(64, 32);
      Tentacle10.mirror = true;
      setRotation(Tentacle10, 0F, 1.570796F, 0F);
      Tentacle11 = new ModelRenderer(this, 40, 0);
      Tentacle11.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle11.setPos(-7F, 15F, 5F);
      Tentacle11.setTexSize(64, 32);
      Tentacle11.mirror = true;
      setRotation(Tentacle11, 0F, 4.712389F, 0F);
      Tentacle12 = new ModelRenderer(this, 40, 0);
      Tentacle12.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle12.setPos(7F, 15F, 5F);
      Tentacle12.setTexSize(64, 32);
      Tentacle12.mirror = true;
      setRotation(Tentacle12, 0F, 1.570796F, 0F);
      Tentacle13 = new ModelRenderer(this, 52, 0);
      Tentacle13.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle13.setPos(3F, 6F, 0F);
      Tentacle13.setTexSize(64, 32);
      Tentacle13.mirror = true;
      setRotation(Tentacle13, 0F, 0F, 0F);
      Tentacle14 = new ModelRenderer(this, 11, 0);
      Tentacle14.addBox(-1F, -3F, -1F, 2, 5, 2);
      Tentacle14.setPos(-6F, 17F, 5F);
      Tentacle14.setTexSize(64, 32);
      Tentacle14.mirror = true;
      setRotation(Tentacle14, 0F, 0F, 0F);
      Tentacle15 = new ModelRenderer(this, 11, 0);
      Tentacle15.addBox(-1F, -3F, -1F, 2, 5, 2);
      Tentacle15.setPos(6F, 6F, 5F);
      Tentacle15.setTexSize(64, 32);
      Tentacle15.mirror = true;
      setRotation(Tentacle15, 0F, 0F, 0F);
      Tentacle16 = new ModelRenderer(this, 11, 0);
      Tentacle16.addBox(-1F, -3F, -1F, 2, 5, 2);
      Tentacle16.setPos(-6F, 6F, 5F);
      Tentacle16.setTexSize(64, 32);
      Tentacle16.mirror = true;
      setRotation(Tentacle16, 0F, 0F, 0F);
      Tentacle17 = new ModelRenderer(this, 40, 6);
      Tentacle17.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle17.setPos(0F, 2F, 0F);
      Tentacle17.setTexSize(64, 32);
      Tentacle17.mirror = true;
      setRotation(Tentacle17, 0F, 4.712389F, 0F);
      Tentacle18 = new ModelRenderer(this, 52, 0);
      Tentacle18.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle18.setPos(0F, 6F, 0F);
      Tentacle18.setTexSize(64, 32);
      Tentacle18.mirror = true;
      setRotation(Tentacle18, 0F, 0F, 0F);
      Tentacle19 = new ModelRenderer(this, 40, 6);
      Tentacle19.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle19.setPos(-3F, 2F, 0F);
      Tentacle19.setTexSize(64, 32);
      Tentacle19.mirror = true;
      setRotation(Tentacle19, 0F, 4.712389F, 0F);
      Tentacle20 = new ModelRenderer(this, 52, 0);
      Tentacle20.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle20.setPos(-3F, 6F, 0F);
      Tentacle20.setTexSize(64, 32);
      Tentacle20.mirror = true;
      setRotation(Tentacle20, 0F, 0F, 0F);
      Tentacle21 = new ModelRenderer(this, 40, 6);
      Tentacle21.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle21.setPos(3F, 20F, 0F);
      Tentacle21.setTexSize(64, 32);
      Tentacle21.mirror = true;
      setRotation(Tentacle21, 0F, 4.712389F, 0F);
      Tentacle22 = new ModelRenderer(this, 52, 0);
      Tentacle22.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle22.setPos(3F, 19F, 0F);
      Tentacle22.setTexSize(64, 32);
      Tentacle22.mirror = true;
      setRotation(Tentacle22, 0F, 0F, 0F);
      Tentacle23 = new ModelRenderer(this, 40, 6);
      Tentacle23.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle23.setPos(-3F, 20F, 0F);
      Tentacle23.setTexSize(64, 32);
      Tentacle23.mirror = true;
      setRotation(Tentacle23, 0F, 4.712389F, 0F);
      Tentacle24 = new ModelRenderer(this, 52, 0);
      Tentacle24.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle24.setPos(-3F, 19F, 0F);
      Tentacle24.setTexSize(64, 32);
      Tentacle24.mirror = true;
      setRotation(Tentacle24, 0F, 0F, 0F);
      Tentacle25 = new ModelRenderer(this, 40, 6);
      Tentacle25.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle25.setPos(0F, 20F, 0F);
      Tentacle25.setTexSize(64, 32);
      Tentacle25.mirror = true;
      setRotation(Tentacle25, 0F, 4.712389F, 0F);
      Tentacle26 = new ModelRenderer(this, 52, 0);
      Tentacle26.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle26.setPos(0F, 19F, 0F);
      Tentacle26.setTexSize(64, 32);
      Tentacle26.mirror = true;
      setRotation(Tentacle26, 0F, 0F, 0F);
      Tentacle27 = new ModelRenderer(this, 40, 0);
      Tentacle27.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle27.setPos(-5F, 14F, 0F);
      Tentacle27.setTexSize(64, 32);
      Tentacle27.mirror = true;
      setRotation(Tentacle27, 0F, 4.712389F, 0F);
      Tentacle28 = new ModelRenderer(this, 40, 6);
      Tentacle28.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle28.setPos(-9F, 14F, 0F);
      Tentacle28.setTexSize(64, 32);
      Tentacle28.mirror = true;
      setRotation(Tentacle28, 0F, 4.712389F, 0F);
      Tentacle29 = new ModelRenderer(this, 40, 0);
      Tentacle29.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle29.setPos(-5F, 2F, 5F);
      Tentacle29.setTexSize(64, 32);
      Tentacle29.mirror = true;
      setRotation(Tentacle29, 0F, 4.712389F, 0F);
      Tentacle30 = new ModelRenderer(this, 40, 6);
      Tentacle30.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle30.setPos(-9F, 2F, 5F);
      Tentacle30.setTexSize(64, 32);
      Tentacle30.mirror = true;
      setRotation(Tentacle30, 0F, 4.712389F, 0F);
      Tentacle31 = new ModelRenderer(this, 40, 6);
      Tentacle31.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle31.setPos(-9F, 20F, 5F);
      Tentacle31.setTexSize(64, 32);
      Tentacle31.mirror = true;
      setRotation(Tentacle31, 0F, 4.712389F, 0F);
      Tentacle32 = new ModelRenderer(this, 40, 0);
      Tentacle32.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle32.setPos(-5F, 20F, 5F);
      Tentacle32.setTexSize(64, 32);
      Tentacle32.mirror = true;
      setRotation(Tentacle32, 0F, 4.712389F, 0F);
      Tentacle33 = new ModelRenderer(this, 40, 6);
      Tentacle33.addBox(-4F, -1F, -1F, 3, 2, 2);
      Tentacle33.setPos(-6F, 2F, 5F);
      Tentacle33.setTexSize(64, 32);
      Tentacle33.mirror = true;
      setRotation(Tentacle33, 0F, 4.712389F, 0F);
      Tentacle34 = new ModelRenderer(this, 40, 0);
      Tentacle34.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle34.setPos(5F, 2F, 5F);
      Tentacle34.setTexSize(64, 32);
      Tentacle34.mirror = true;
      setRotation(Tentacle34, 0F, 1.570796F, 0F);
      Tentacle35 = new ModelRenderer(this, 40, 6);
      Tentacle35.addBox(-4F, -1F, -1F, 3, 2, 2);
      Tentacle35.setPos(-6F, 20F, 5F);
      Tentacle35.setTexSize(64, 32);
      Tentacle35.mirror = true;
      setRotation(Tentacle35, 0F, 4.712389F, 0F);
      Tentacle36 = new ModelRenderer(this, 40, 0);
      Tentacle36.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle36.setPos(5F, 20F, 5F);
      Tentacle36.setTexSize(64, 32);
      Tentacle36.mirror = true;
      setRotation(Tentacle36, 0F, 1.570796F, 0F);
      Tentacle37 = new ModelRenderer(this, 40, 6);
      Tentacle37.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle37.setPos(-9F, 11F, 0F);
      Tentacle37.setTexSize(64, 32);
      Tentacle37.mirror = true;
      setRotation(Tentacle37, 0F, 4.712389F, 0F);
      Tentacle38 = new ModelRenderer(this, 40, 0);
      Tentacle38.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle38.setPos(-5F, 11F, 0F);
      Tentacle38.setTexSize(64, 32);
      Tentacle38.mirror = true;
      setRotation(Tentacle38, 0F, 4.712389F, 0F);
      Tentacle39 = new ModelRenderer(this, 40, 0);
      Tentacle39.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle39.setPos(5F, 11F, 0F);
      Tentacle39.setTexSize(64, 32);
      Tentacle39.mirror = true;
      setRotation(Tentacle39, 0F, 1.570796F, 0F);
      Tentacle40 = new ModelRenderer(this, 40, 6);
      Tentacle40.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle40.setPos(9F, 11F, 0F);
      Tentacle40.setTexSize(64, 32);
      Tentacle40.mirror = true;
      setRotation(Tentacle40, 0F, 4.712389F, 0F);
      Tentacle41 = new ModelRenderer(this, 40, 6);
      Tentacle41.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle41.setPos(-9F, 8F, 0F);
      Tentacle41.setTexSize(64, 32);
      Tentacle41.mirror = true;
      setRotation(Tentacle41, 0F, 4.712389F, 0F);
      Tentacle42 = new ModelRenderer(this, 40, 0);
      Tentacle42.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle42.setPos(-5F, 8F, 0F);
      Tentacle42.setTexSize(64, 32);
      Tentacle42.mirror = true;
      setRotation(Tentacle42, 0F, 4.712389F, 0F);
      Tentacle43 = new ModelRenderer(this, 40, 0);
      Tentacle43.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle43.setPos(5F, 8F, 0F);
      Tentacle43.setTexSize(64, 32);
      Tentacle43.mirror = true;
      setRotation(Tentacle43, 0F, 1.570796F, 0F);
      Tentacle44 = new ModelRenderer(this, 40, 6);
      Tentacle44.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle44.setPos(9F, 8F, 0F);
      Tentacle44.setTexSize(64, 32);
      Tentacle44.mirror = true;
      setRotation(Tentacle44, 0F, 4.712389F, 0F);
      Tentacle45 = new ModelRenderer(this, 40, 6);
      Tentacle45.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle45.setPos(9F, 2F, 5F);
      Tentacle45.setTexSize(64, 32);
      Tentacle45.mirror = true;
      setRotation(Tentacle45, 0F, 4.712389F, 0F);
      Tentacle46 = new ModelRenderer(this, 40, 6);
      Tentacle46.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle46.setPos(9F, 20F, 5F);
      Tentacle46.setTexSize(64, 32);
      Tentacle46.mirror = true;
      setRotation(Tentacle46, 0F, 4.712389F, 0F);
      Tentacle47 = new ModelRenderer(this, 40, 6);
      Tentacle47.addBox(-4F, -1F, -1F, 3, 2, 2);
      Tentacle47.setPos(6F, 2F, 5F);
      Tentacle47.setTexSize(64, 32);
      Tentacle47.mirror = true;
      setRotation(Tentacle47, 0F, 4.712389F, 0F);
      Tentacle48 = new ModelRenderer(this, 40, 6);
      Tentacle48.addBox(-4F, -1F, -1F, 3, 2, 2);
      Tentacle48.setPos(6F, 20F, 5F);
      Tentacle48.setTexSize(64, 32);
      Tentacle48.mirror = true;
      setRotation(Tentacle48, 0F, 4.712389F, 0F);
  }

  @Override
  public void setupAnim(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

  }

  @Override
  public Iterable<ModelRenderer> parts() {
    return ImmutableList.of(Head, Tentacle1, Tentacle2, Tentacle3, Tentacle4, Tentacle5, Tentacle6, Tentacle7, Tentacle8, Tentacle9, Tentacle10, Tentacle11, Tentacle12, Tentacle13, Tentacle14, Tentacle15, Tentacle16, Tentacle17,
            Tentacle18, Tentacle19, Tentacle20, Tentacle21, Tentacle22, Tentacle23, Tentacle24, Tentacle25, Tentacle26, Tentacle27, Tentacle28, Tentacle29, Tentacle30, Tentacle31, Tentacle32, Tentacle33, Tentacle34, Tentacle35,
            Tentacle36, Tentacle37, Tentacle38, Tentacle39, Tentacle40, Tentacle41, Tentacle42, Tentacle43, Tentacle44, Tentacle45, Tentacle46, Tentacle47, Tentacle48);
  }

  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.xRot = x;
    model.yRot = y;
    model.zRot = z;
  }

}
