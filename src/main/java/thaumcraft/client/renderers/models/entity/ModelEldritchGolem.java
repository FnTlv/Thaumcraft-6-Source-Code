// 
// Decompiled by Procyon v0.6.0
// 

package thaumcraft.client.renderers.models.entity;

import net.minecraft.entity.EntityLivingBase;
import thaumcraft.common.entities.monster.boss.EntityEldritchGolem;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelEldritchGolem extends ModelBase
{
    ModelRenderer Frontcloth1;
    ModelRenderer CollarL;
    ModelRenderer Cloak1;
    ModelRenderer CloakCL;
    ModelRenderer CloakCR;
    ModelRenderer Cloak3;
    ModelRenderer Cloak2;
    ModelRenderer Head;
    ModelRenderer Head2;
    ModelRenderer Frontcloth0;
    ModelRenderer CollarB;
    ModelRenderer Torso;
    ModelRenderer CollarR;
    ModelRenderer CollarF;
    ModelRenderer CollarBlack;
    ModelRenderer ShoulderR1;
    ModelRenderer ArmL;
    ModelRenderer ShoulderR;
    ModelRenderer ShoulderR2;
    ModelRenderer ShoulderR0;
    ModelRenderer ArmR;
    ModelRenderer ShoulderL1;
    ModelRenderer ShoulderL0;
    ModelRenderer ShoulderL;
    ModelRenderer ShoulderL2;
    ModelRenderer BackpanelR1;
    ModelRenderer WaistR1;
    ModelRenderer WaistR2;
    ModelRenderer WaistR3;
    ModelRenderer LegR;
    ModelRenderer WaistL1;
    ModelRenderer WaistL2;
    ModelRenderer WaistL3;
    ModelRenderer Frontcloth2;
    ModelRenderer BackpanelL1;
    ModelRenderer LegL;
    
    public ModelEldritchGolem() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        (this.Cloak1 = new ModelRenderer(this, 0, 47)).addBox(-5.0f, 1.5f, 4.0f, 10, 12, 1);
        this.Cloak1.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.Cloak1.setTextureSize(128, 64);
        this.setRotation(this.Cloak1, 0.1396263f, 0.0f, 0.0f);
        (this.Cloak3 = new ModelRenderer(this, 0, 37)).addBox(-5.0f, 17.5f, -0.8f, 10, 4, 1);
        this.Cloak3.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.Cloak3.setTextureSize(128, 64);
        this.setRotation(this.Cloak3, 0.4465716f, 0.0f, 0.0f);
        (this.Cloak2 = new ModelRenderer(this, 0, 59)).addBox(-5.0f, 13.5f, 1.7f, 10, 4, 1);
        this.Cloak2.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.Cloak2.setTextureSize(128, 64);
        this.setRotation(this.Cloak2, 0.3069452f, 0.0f, 0.0f);
        (this.CloakCL = new ModelRenderer(this, 0, 43)).addBox(3.0f, 0.5f, 2.0f, 2, 1, 3);
        this.CloakCL.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CloakCL.setTextureSize(128, 64);
        this.setRotation(this.CloakCL, 0.1396263f, 0.0f, 0.0f);
        (this.CloakCR = new ModelRenderer(this, 0, 43)).addBox(-5.0f, 0.5f, 2.0f, 2, 1, 3);
        this.CloakCR.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CloakCR.setTextureSize(128, 64);
        this.setRotation(this.CloakCR, 0.1396263f, 0.0f, 0.0f);
        (this.Head = new ModelRenderer(this, 47, 12)).addBox(-3.5f, -6.0f, -2.5f, 7, 7, 5);
        this.Head.setRotationPoint(0.0f, 4.5f, -3.8f);
        this.Head.setTextureSize(128, 64);
        this.setRotation(this.Head, -0.1047198f, 0.0f, 0.0f);
        (this.Head2 = new ModelRenderer(this, 26, 16)).addBox(-2.0f, -2.0f, -2.0f, 4, 4, 4);
        this.Head2.setRotationPoint(0.0f, 0.0f, -5.0f);
        this.Head2.setTextureSize(128, 64);
        this.setRotation(this.Head2, -0.1047198f, 0.0f, 0.0f);
        (this.CollarL = new ModelRenderer(this, 75, 50)).addBox(3.5f, -0.5f, -7.0f, 1, 4, 10);
        this.CollarL.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CollarL.setTextureSize(128, 64);
        this.setRotation(this.CollarL, 0.837758f, 0.0f, 0.0f);
        (this.CollarR = new ModelRenderer(this, 67, 50)).addBox(-4.5f, -0.5f, -7.0f, 1, 4, 10);
        this.CollarR.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CollarR.setTextureSize(128, 64);
        this.setRotation(this.CollarR, 0.837758f, 0.0f, 0.0f);
        (this.CollarB = new ModelRenderer(this, 77, 59)).addBox(-3.5f, -0.5f, 2.0f, 7, 4, 1);
        this.CollarB.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CollarB.setTextureSize(128, 64);
        this.setRotation(this.CollarB, 0.837758f, 0.0f, 0.0f);
        (this.CollarF = new ModelRenderer(this, 77, 59)).addBox(-3.5f, -0.5f, -7.0f, 7, 4, 1);
        this.CollarF.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CollarF.setTextureSize(128, 64);
        this.setRotation(this.CollarF, 0.837758f, 0.0f, 0.0f);
        (this.CollarBlack = new ModelRenderer(this, 22, 0)).addBox(-3.5f, 0.0f, -6.0f, 7, 1, 8);
        this.CollarBlack.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.CollarBlack.setTextureSize(128, 64);
        this.setRotation(this.CollarBlack, 0.837758f, 0.0f, 0.0f);
        (this.Frontcloth0 = new ModelRenderer(this, 114, 52)).addBox(-3.0f, 3.2f, -3.5f, 6, 10, 1);
        this.Frontcloth0.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.Frontcloth0.setTextureSize(114, 64);
        this.setRotation(this.Frontcloth0, 0.1745329f, 0.0f, 0.0f);
        (this.Frontcloth1 = new ModelRenderer(this, 114, 39)).addBox(-1.0f, 1.5f, -3.5f, 6, 6, 1);
        this.Frontcloth1.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.Frontcloth1.setTextureSize(114, 64);
        this.setRotation(this.Frontcloth1, -0.1047198f, 0.0f, 0.0f);
        (this.Frontcloth2 = new ModelRenderer(this, 114, 47)).addBox(-1.0f, 8.5f, -1.5f, 6, 3, 1);
        this.Frontcloth2.setRotationPoint(-2.0f, 11.0f, 0.0f);
        this.Frontcloth2.setTextureSize(114, 64);
        this.setRotation(this.Frontcloth2, -0.3316126f, 0.0f, 0.0f);
        (this.Torso = new ModelRenderer(this, 34, 45)).addBox(-5.0f, 2.5f, -3.0f, 10, 10, 6);
        this.Torso.setRotationPoint(0.0f, 0.0f, -2.5f);
        this.Torso.setTextureSize(128, 64);
        this.Torso.mirror = true;
        this.setRotation(this.Torso, 0.1745329f, 0.0f, 0.0f);
        (this.ArmR = new ModelRenderer(this, 78, 32)).addBox(-3.5f, 1.5f, -2.0f, 4, 13, 5);
        this.ArmR.setRotationPoint(-5.0f, 3.0f, -2.0f);
        this.ArmR.setTextureSize(128, 64);
        this.setRotation(this.ArmR, 0.0f, 0.0f, 0.1047198f);
        (this.ShoulderR1 = new ModelRenderer(this, 0, 23)).addBox(-3.3f, 4.0f, -2.5f, 1, 2, 6);
        this.ShoulderR1.setTextureSize(128, 64);
        this.setRotation(this.ShoulderR1, 0.0f, 0.0f, 1.186824f);
        (this.ShoulderR = new ModelRenderer(this, 0, 0)).addBox(-4.3f, -1.0f, -3.0f, 4, 5, 7);
        this.ShoulderR.setTextureSize(128, 64);
        this.setRotation(this.ShoulderR, 0.0f, 0.0f, 1.186824f);
        (this.ShoulderR2 = new ModelRenderer(this, 0, 12)).addBox(-2.3f, 4.0f, -3.0f, 2, 3, 7);
        this.ShoulderR2.setTextureSize(128, 64);
        this.setRotation(this.ShoulderR2, 0.0f, 0.0f, 1.186824f);
        (this.ShoulderR0 = new ModelRenderer(this, 56, 31)).addBox(-4.5f, -1.5f, -2.5f, 5, 6, 6);
        this.ShoulderR0.setTextureSize(128, 64);
        this.setRotation(this.ShoulderR0, 0.0f, 0.0f, 0.0f);
        this.ArmL = new ModelRenderer(this, 78, 32);
        this.ArmL.mirror = true;
        this.ArmL.addBox(-0.5f, 1.5f, -2.0f, 4, 13, 5);
        this.ArmL.setRotationPoint(5.0f, 3.0f, -2.0f);
        this.ArmL.setTextureSize(128, 64);
        this.setRotation(this.ArmL, 0.0f, 0.0f, -0.1047198f);
        this.ShoulderL1 = new ModelRenderer(this, 0, 23);
        this.ShoulderL1.mirror = true;
        this.ShoulderL1.addBox(2.3f, 4.0f, -2.5f, 1, 2, 6);
        this.ShoulderL1.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL1, 0.0f, 0.0f, -1.186824f);
        this.ShoulderL0 = new ModelRenderer(this, 56, 31);
        this.ShoulderL0.mirror = true;
        this.ShoulderL0.addBox(-0.5f, -1.5f, -2.5f, 5, 6, 6);
        this.ShoulderL0.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL0, 0.0f, 0.0f, 0.0f);
        this.ShoulderL = new ModelRenderer(this, 0, 0);
        this.ShoulderL.mirror = true;
        this.ShoulderL.addBox(0.3f, -1.0f, -3.0f, 4, 5, 7);
        this.ShoulderL.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL, 0.0f, 0.0f, -1.186824f);
        this.ShoulderL2 = new ModelRenderer(this, 0, 12);
        this.ShoulderL2.mirror = true;
        this.ShoulderL2.addBox(0.3f, 4.0f, -3.0f, 2, 3, 7);
        this.ShoulderL2.setTextureSize(128, 64);
        this.setRotation(this.ShoulderL2, 0.0f, 0.0f, -1.186824f);
        (this.BackpanelR1 = new ModelRenderer(this, 96, 7)).addBox(0.0f, 2.5f, -2.5f, 2, 2, 5);
        this.BackpanelR1.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.BackpanelR1.setTextureSize(128, 64);
        this.setRotation(this.BackpanelR1, 0.0f, 0.0f, 0.1396263f);
        (this.WaistR1 = new ModelRenderer(this, 96, 14)).addBox(-3.0f, -0.5f, -2.5f, 5, 3, 5);
        this.WaistR1.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.WaistR1.setTextureSize(128, 64);
        this.setRotation(this.WaistR1, 0.0f, 0.0f, 0.1396263f);
        (this.WaistR2 = new ModelRenderer(this, 116, 13)).addBox(-3.0f, 2.5f, -2.5f, 1, 4, 5);
        this.WaistR2.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.WaistR2.setTextureSize(128, 64);
        this.setRotation(this.WaistR2, 0.0f, 0.0f, 0.1396263f);
        this.WaistR3 = new ModelRenderer(this, 114, 5);
        this.WaistR3.mirror = true;
        this.WaistR3.addBox(-2.0f, 2.5f, -2.5f, 2, 3, 5);
        this.WaistR3.setRotationPoint(-2.0f, 12.0f, 0.0f);
        this.WaistR3.setTextureSize(128, 64);
        this.setRotation(this.WaistR3, 0.0f, 0.0f, 0.1396263f);
        (this.LegR = new ModelRenderer(this, 79, 19)).addBox(-2.5f, 2.5f, -2.0f, 4, 9, 4);
        this.LegR.setRotationPoint(-2.0f, 12.5f, 0.0f);
        this.LegR.setTextureSize(128, 64);
        this.setRotation(this.LegR, 0.0f, 0.0f, 0.0f);
        (this.WaistL1 = new ModelRenderer(this, 96, 14)).addBox(-2.0f, -0.5f, -2.5f, 5, 3, 5);
        this.WaistL1.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.WaistL1.setTextureSize(128, 64);
        this.WaistL1.mirror = true;
        this.setRotation(this.WaistL1, 0.0f, 0.0f, -0.1396263f);
        (this.WaistL2 = new ModelRenderer(this, 116, 13)).addBox(2.0f, 2.5f, -2.5f, 1, 4, 5);
        this.WaistL2.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.WaistL2.setTextureSize(128, 64);
        this.WaistL2.mirror = true;
        this.setRotation(this.WaistL2, 0.0f, 0.0f, -0.1396263f);
        (this.WaistL3 = new ModelRenderer(this, 114, 5)).addBox(0.0f, 2.5f, -2.5f, 2, 3, 5);
        this.WaistL3.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.WaistL3.setTextureSize(128, 64);
        this.WaistL3.mirror = true;
        this.setRotation(this.WaistL3, 0.0f, 0.0f, -0.1396263f);
        (this.BackpanelL1 = new ModelRenderer(this, 96, 7)).addBox(-2.0f, 2.5f, -2.5f, 2, 2, 5);
        this.BackpanelL1.setRotationPoint(2.0f, 12.0f, 0.0f);
        this.BackpanelL1.setTextureSize(128, 64);
        this.BackpanelL1.mirror = true;
        this.setRotation(this.BackpanelL1, 0.0f, 0.0f, -0.1396263f);
        (this.LegL = new ModelRenderer(this, 79, 19)).addBox(-1.5f, 2.5f, -2.0f, 4, 9, 4);
        this.LegL.setRotationPoint(2.0f, 12.5f, 0.0f);
        this.LegL.setTextureSize(128, 64);
        this.LegL.mirror = true;
        this.setRotation(this.LegL, 0.0f, 0.0f, 0.0f);
        this.ArmL.addChild(this.ShoulderL);
        this.ArmL.addChild(this.ShoulderL0);
        this.ArmL.addChild(this.ShoulderL1);
        this.ArmL.addChild(this.ShoulderL2);
        this.ArmR.addChild(this.ShoulderR);
        this.ArmR.addChild(this.ShoulderR0);
        this.ArmR.addChild(this.ShoulderR1);
        this.ArmR.addChild(this.ShoulderR2);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        final float a = MathHelper.cos(f * 0.44f) * 1.4f * f1;
        final float b = MathHelper.cos(f * 0.44f + 3.1415927f) * 1.4f * f1;
        final float c = Math.min(a, b);
        this.Frontcloth1.rotateAngleX = c - 0.1047198f;
        this.Frontcloth2.rotateAngleX = c - 0.3316126f;
        this.Cloak1.rotateAngleX = -c / 3.0f + 0.1396263f;
        this.Cloak2.rotateAngleX = -c / 3.0f + 0.3069452f;
        this.Cloak3.rotateAngleX = -c / 3.0f + 0.4465716f;
        this.Frontcloth1.render(f5);
        this.CollarL.render(f5);
        this.CollarBlack.render(f5);
        this.Cloak1.render(f5);
        this.CloakCL.render(f5);
        this.CloakCR.render(f5);
        this.Cloak3.render(f5);
        this.Cloak2.render(f5);
        if (entity instanceof EntityEldritchGolem && !((EntityEldritchGolem)entity).isHeadless()) {
            this.Head.render(f5);
        }
        else {
            this.Head2.render(f5);
        }
        this.Frontcloth0.render(f5);
        this.CollarB.render(f5);
        this.Torso.render(f5);
        this.CollarR.render(f5);
        this.CollarF.render(f5);
        this.Frontcloth1.render(f5);
        this.ArmL.render(f5);
        this.ArmR.render(f5);
        this.BackpanelR1.render(f5);
        this.WaistR1.render(f5);
        this.WaistR2.render(f5);
        this.WaistR3.render(f5);
        this.LegR.render(f5);
        this.WaistL1.render(f5);
        this.WaistL2.render(f5);
        this.WaistL3.render(f5);
        this.Frontcloth2.render(f5);
        this.BackpanelL1.render(f5);
        this.LegL.render(f5);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        if (entity instanceof EntityEldritchGolem && ((EntityEldritchGolem)entity).getSpawnTimer() > 0) {
            this.Head.rotateAngleY = 0.0f;
            this.Head.rotateAngleX = ((EntityEldritchGolem)entity).getSpawnTimer() / 2 / 57.295776f;
        }
        else {
            this.Head.rotateAngleY = par4 / 4.0f / 57.295776f;
            this.Head.rotateAngleX = par5 / 2.0f / 57.295776f;
            this.Head2.rotateAngleY = par4 / 57.295776f;
            this.Head2.rotateAngleX = par5 / 57.295776f;
        }
        this.LegR.rotateAngleX = MathHelper.cos(par1 * 0.4662f) * 1.4f * par2;
        this.LegL.rotateAngleX = MathHelper.cos(par1 * 0.4662f + 3.1415927f) * 1.4f * par2;
    }
    
    public void setLivingAnimations(final EntityLivingBase p_78086_1_, final float par1, final float par2, final float par3) {
        final EntityEldritchGolem golem = (EntityEldritchGolem)p_78086_1_;
        final int i = golem.getAttackTimer();
        if (i > 0) {
            this.ArmR.rotateAngleX = -2.0f + 1.5f * this.doAbs(i - par3, 10.0f);
            this.ArmL.rotateAngleX = -2.0f + 1.5f * this.doAbs(i - par3, 10.0f);
        }
        else {
            this.ArmR.rotateAngleX = MathHelper.cos(par1 * 0.4f + 3.1415927f) * 2.0f * par2 * 0.5f;
            this.ArmL.rotateAngleX = MathHelper.cos(par1 * 0.4f) * 2.0f * par2 * 0.5f;
        }
    }
    
    private float doAbs(final float p_78172_1_, final float p_78172_2_) {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5f) - p_78172_2_ * 0.25f) / (p_78172_2_ * 0.25f);
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
