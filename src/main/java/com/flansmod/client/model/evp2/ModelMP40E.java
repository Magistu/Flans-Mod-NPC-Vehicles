/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 */
package com.flansmod.client.model.evp2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;

public class ModelMP40E
extends ModelGun {
    int textureX = 64;
    int textureY = 64;

    public ModelMP40E() {
        this.gunModel = new ModelRendererTurbo[46];
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.gunModel[31] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
        this.gunModel[32] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
        this.gunModel[33] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
        this.gunModel[34] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
        this.gunModel[35] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.gunModel[36] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[37] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[38] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[39] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[40] = new ModelRendererTurbo(this, 32, 41, this.textureX, this.textureY);
        this.gunModel[41] = new ModelRendererTurbo(this, 32, 41, this.textureX, this.textureY);
        this.gunModel[42] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[43] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[44] = new ModelRendererTurbo(this, 52, 41, this.textureX, this.textureY);
        this.gunModel[45] = new ModelRendererTurbo(this, 47, 41, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-2.0f, 0.0f, -0.5f, 2, 2, 1, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.6f, -0.3f, 0.0f, -1.5f, 0.3f, 0.0f, -1.5f, 0.3f, 0.0f, 0.6f, -0.3f, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -2.0f, 0.0f);
        this.gunModel[1].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.4f, -0.3f, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -2.7f, 0.0f);
        this.gunModel[2].addShapeBox(-6.0f, 0.0f, -0.5f, 6, 1, 1, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f);
        this.gunModel[2].setRotationPoint(7.3f, -4.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, 0.4f, -0.7f, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[5].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.gunModel[5].setRotationPoint(8.3f, -4.0f, 0.0f);
        this.gunModel[6].addShapeBox(-5.0f, 0.0f, -0.5f, 5, 1, 1, 0.0f, 0.7f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, 0.7f, 0.0f, 0.1f, 0.7f, -0.2f, 0.1f, -0.3f, -0.2f, 0.1f, -0.3f, -0.2f, 0.1f, 0.7f, -0.2f, 0.1f);
        this.gunModel[6].setRotationPoint(6.3f, -4.6f, 0.0f);
        this.gunModel[7].addShapeBox(-2.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f);
        this.gunModel[7].setRotationPoint(8.3f, -4.6f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.7f, -0.3f, 0.1f, -1.0f, 0.0f, 0.1f, -1.0f, 0.0f, 0.1f, 0.7f, -0.3f, 0.1f, 0.7f, -0.3f, 0.1f, -1.0f, -0.2f, 0.1f, -1.0f, -0.2f, 0.1f, 0.7f, -0.3f, 0.1f);
        this.gunModel[8].setRotationPoint(0.6f, -4.6f, 0.0f);
        this.gunModel[9].addShapeBox(-1.0f, -0.75f, -0.5f, 1, 1, 1, 0.0f, 0.0f, -0.5f, 0.05f, 0.0f, -0.5f, 0.05f, 0.0f, -0.5f, 0.05f, 0.0f, -0.5f, 0.05f, 0.0f, 0.25f, 0.05f, 0.0f, 0.25f, 0.05f, 0.0f, 0.25f, 0.05f, 0.0f, 0.25f, 0.05f);
        this.gunModel[9].setRotationPoint(1.5f, -5.0f, 0.0f);
        this.gunModel[10].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.6f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, -0.25f, -0.25f, -0.6f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, -0.25f, -0.25f);
        this.gunModel[10].setRotationPoint(0.3f, -5.2f, 0.0f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.2f, -0.6f, -0.3f, -0.2f, 0.2f, -0.3f, -0.2f, 0.2f, -0.3f, 0.2f, -0.6f, -0.3f, 0.2f, 1.0f, -0.3f, -0.2f, 1.5f, -0.3f, -0.2f, 1.5f, -0.3f, 0.2f, 1.0f, -0.3f);
        this.gunModel[11].setRotationPoint(-0.7f, -4.8f, 0.0f);
        this.gunModel[12].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.7f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.7f, 0.0f, 0.1f, -0.7f, -0.2f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, -0.7f, -0.2f, 0.1f);
        this.gunModel[12].setRotationPoint(6.3f, -4.6f, 0.0f);
        this.gunModel[13].addShapeBox(-11.0f, 0.0f, -0.5f, 11, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[13].setRotationPoint(11.3f, -5.2f, 0.0f);
        this.gunModel[14].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.8f, 0.05f, 0.05f, 0.0f, 0.05f, 0.05f, 0.0f, 0.05f, 0.05f, -0.8f, 0.05f, 0.05f, -0.8f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.8f, 0.0f, 0.05f);
        this.gunModel[14].setRotationPoint(8.5f, -5.2f, 0.0f);
        this.gunModel[15].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.8f, 0.05f, 0.05f, 0.0f, 0.05f, 0.05f, 0.0f, 0.05f, 0.05f, -0.8f, 0.05f, 0.05f, -0.8f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.8f, 0.0f, 0.05f);
        this.gunModel[15].setRotationPoint(10.5f, -5.2f, 0.0f);
        this.gunModel[16].addShapeBox(-2.6f, 0.0f, -0.5f, 2, 1, 1, 0.0f, -0.6f, 0.05f, 0.05f, 0.4f, 0.05f, 0.05f, 0.4f, 0.05f, 0.05f, -0.6f, 0.05f, 0.05f, -0.6f, -0.7f, 0.05f, 0.4f, -0.7f, 0.05f, 0.4f, -0.7f, 0.05f, -0.6f, -0.7f, 0.05f);
        this.gunModel[16].setRotationPoint(10.5f, -4.5f, 0.0f);
        this.gunModel[17].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 2, 1, 0.0f, 0.4f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.4f, 0.0f, 0.05f, 0.4f, -0.3f, 0.05f, 0.0f, -0.3f, 0.05f, 0.0f, -0.3f, 0.05f, 0.4f, -0.3f, 0.05f);
        this.gunModel[17].setRotationPoint(10.3f, -4.2f, 0.0f);
        this.gunModel[18].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.4f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.4f, 0.0f, 0.05f, -0.5f, -0.2f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.5f, -0.2f, 0.05f);
        this.gunModel[18].setRotationPoint(8.9f, -4.2f, 0.0f);
        this.gunModel[19].addShapeBox(-3.0f, 0.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.2f, -0.2f);
        this.gunModel[19].setRotationPoint(13.8f, -5.2f, 0.0f);
        this.gunModel[20].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.7f, 0.0f, 0.0f);
        this.gunModel[20].setRotationPoint(11.6f, -5.2f, 0.0f);
        this.gunModel[21].addShapeBox(-2.0f, 0.0f, -0.5f, 2, 1, 1, 0.0f, 0.0f, -0.25f, -0.2f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.2f, 0.0f, -0.25f, -0.2f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.2f);
        this.gunModel[21].setRotationPoint(15.8f, -5.2f, 0.0f);
        this.gunModel[22].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, -0.5f, -0.2f, -0.2f);
        this.gunModel[22].setRotationPoint(16.3f, -5.2f, 0.0f);
        this.gunModel[23].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, -0.7f, -0.35f, 0.0f, -0.7f, -0.35f, 0.0f, -0.7f, -0.35f, -0.5f, -0.7f, -0.35f, 0.5f, -0.05f, -0.35f, 0.0f, -0.05f, -0.35f, 0.0f, -0.05f, -0.35f, 0.5f, -0.05f, -0.35f);
        this.gunModel[23].setRotationPoint(15.8f, -5.9f, 0.0f);
        this.gunModel[24].addShapeBox(-1.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.9f, 0.0f, 0.0f, -0.9f, 0.0f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.3f, -0.9f, 0.0f, -0.3f, -0.9f, 0.0f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f);
        this.gunModel[24].setRotationPoint(15.8f, -5.9f, 0.0f);
        this.gunModel[25].addShapeBox(-1.0f, 0.0f, -1.15f, 1, 1, 1, 0.0f, -0.5f, -0.1f, -0.9f, 0.0f, -0.1f, -0.9f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.4f, -0.9f, 0.0f, -0.4f, -0.9f, 0.0f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f);
        this.gunModel[25].setRotationPoint(15.8f, -5.9f, -0.1f);
        this.gunModel[26].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, -0.5f, -0.9f, -0.25f, 0.0f, -0.9f, -0.25f, 0.0f, -0.9f, -0.25f, -0.5f, -0.9f, -0.25f);
        this.gunModel[26].setRotationPoint(15.8f, -5.9f, 0.0f);
        this.gunModel[27].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, -0.5f, -0.9f, -0.25f, 0.0f, -0.9f, -0.25f, 0.0f, -0.9f, -0.25f, -0.5f, -0.9f, -0.25f);
        this.gunModel[27].setRotationPoint(15.8f, -5.3f, 0.0f);
        this.gunModel[28].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, 0.05f, -0.45f, 0.0f, 0.05f, -0.45f, 0.0f, 0.05f, -0.45f, -0.5f, 0.05f, -0.45f, -0.5f, -0.8f, -0.45f, 0.0f, -0.8f, -0.45f, 0.0f, -0.8f, -0.45f, -0.5f, -0.8f, -0.45f);
        this.gunModel[28].setRotationPoint(15.8f, -5.5f, 0.0f);
        this.gunModel[29].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, -0.7f, -0.1f, 0.0f, -0.7f, -0.1f, 0.0f, -0.7f, -0.1f, -0.5f, -0.7f, -0.1f, -0.5f, -0.05f, -0.1f, 0.0f, -0.05f, -0.1f, 0.0f, -0.05f, -0.1f, -0.5f, -0.05f, -0.1f);
        this.gunModel[29].setRotationPoint(4.8f, -6.1f, 0.0f);
        this.gunModel[30].addShapeBox(-1.0f, 0.0f, -0.6f, 1, 1, 1, 0.0f, -0.7f, 0.05f, -0.25f, 0.0f, 0.05f, -0.25f, 0.0f, 0.05f, -0.5f, -0.7f, 0.05f, -0.5f, -0.7f, -0.8f, -0.25f, 0.0f, -0.8f, -0.25f, 0.0f, -0.8f, -0.45f, -0.7f, -0.8f, -0.45f);
        this.gunModel[30].setRotationPoint(4.7f, -5.5f, 0.0f);
        this.gunModel[31].addShapeBox(-1.0f, 0.0f, -0.4f, 1, 1, 1, 0.0f, -0.7f, 0.05f, -0.5f, 0.0f, 0.05f, -0.5f, 0.0f, 0.05f, -0.25f, -0.7f, 0.05f, -0.25f, -0.7f, -0.8f, -0.45f, 0.0f, -0.8f, -0.45f, 0.0f, -0.8f, -0.25f, -0.7f, -0.8f, -0.25f);
        this.gunModel[31].setRotationPoint(4.7f, -5.5f, 0.0f);
        this.gunModel[32].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.8f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, -0.8f, 0.0f, 0.05f, -0.8f, -0.8f, 0.05f, 0.0f, -0.9f, 0.05f, 0.0f, -0.9f, 0.05f, -0.8f, -0.8f, 0.05f);
        this.gunModel[32].setRotationPoint(10.5f, -4.2f, 0.0f);
        this.gunModel[33].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.8f, 0.0f, 0.05f, 0.0f, -0.1f, 0.05f, 0.0f, -0.1f, 0.05f, -0.8f, 0.0f, 0.05f, -0.8f, -0.8f, 0.05f, 0.0f, -0.8f, 0.05f, 0.0f, -0.8f, 0.05f, -0.8f, -0.8f, 0.05f);
        this.gunModel[33].setRotationPoint(10.5f, -2.7f, 0.0f);
        this.gunModel[34].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, 0.4f, -0.6f, -0.25f, 0.0f, -0.6f, -0.25f, 0.0f, -0.6f, -0.25f, 0.4f, -0.6f, -0.25f, 0.4f, -0.3f, -0.25f, -0.1f, -0.3f, -0.25f, -0.1f, -0.3f, -0.25f, 0.4f, -0.3f, -0.25f);
        this.gunModel[34].setRotationPoint(2.4f, -2.7f, 0.0f);
        this.gunModel[35].addShapeBox(-1.0f, 0.0f, -0.5f, 1, 1, 1, 0.0f, -0.9f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.9f, 0.0f, -0.25f, -0.9f, -0.4f, -0.25f, 0.0f, -0.4f, -0.25f, 0.0f, -0.4f, -0.25f, -0.9f, -0.4f, -0.25f);
        this.gunModel[35].setRotationPoint(2.4f, -2.7f, 0.0f);
        this.gunModel[36].addShapeBox(-1.0f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.35f, 0.0f, -0.5f, -0.35f, 0.0f, -0.5f, -0.35f, 0.0f, -0.5f, -0.35f, 0.0f, 0.0f, -0.35f, -0.7f, 0.0f, -0.35f, -0.7f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f);
        this.gunModel[36].setRotationPoint(14.8f, -4.5f, 0.0f);
        this.gunModel[37].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f, -0.25f, -0.25f, -0.1f);
        this.gunModel[37].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[37].rotateAngleZ = 0.08726646f;
        this.gunModel[38].addShapeBox(-1.0f, -0.5f, -0.2f, 1, 1, 1, 0.0f, -0.25f, -0.3f, -0.7f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f, -0.1f, -0.25f, -0.3f, -0.7f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f, -0.4f, -0.25f, -0.3f, -0.1f);
        this.gunModel[38].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[38].rotateAngleZ = 0.08726646f;
        this.gunModel[39].addShapeBox(-1.0f, -0.5f, -1.0f, 1, 1, 1, 0.0f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.6f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.5f, -0.25f, -0.3f, -0.3f, -0.25f, -0.3f, -0.6f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.5f);
        this.gunModel[39].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[39].rotateAngleZ = 0.08726646f;
        this.gunModel[40].addShapeBox(-7.0f, -0.5f, -0.2f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f);
        this.gunModel[40].setRotationPoint(-0.25f, -3.5f, 0.0f);
        this.gunModel[40].rotateAngleZ = 0.08726646f;
        this.gunModel[41].addShapeBox(-7.0f, -0.5f, -1.4f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.7f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f);
        this.gunModel[41].setRotationPoint(-0.25f, -3.5f, 0.0f);
        this.gunModel[41].rotateAngleZ = 0.08726646f;
        this.gunModel[42].addShapeBox(-7.5f, -1.5f, -0.5f, 1, 1, 1, 0.0f, -0.5f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.4f, 0.2f, -0.25f, -0.4f, 0.2f, -0.25f, -0.4f, 0.2f, -0.5f, -0.4f, 0.2f);
        this.gunModel[42].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[42].rotateAngleZ = 0.08726646f;
        this.gunModel[43].addShapeBox(-7.5f, 1.0f, -0.5f, 1, 1, 1, 0.0f, -0.5f, -0.25f, 0.2f, -0.25f, -0.25f, 0.2f, -0.25f, -0.25f, 0.2f, -0.5f, -0.25f, 0.2f, -0.5f, -0.4f, 0.0f, -0.25f, -0.4f, 0.0f, -0.25f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f);
        this.gunModel[43].setRotationPoint(-0.5f, -3.5f, 0.0f);
        this.gunModel[43].rotateAngleZ = 0.08726646f;
        this.gunModel[44].addShapeBox(-8.0f, -0.92f, -0.2f, 1, 2, 1, 0.0f, -0.75f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.1f, -0.75f, 0.0f, -0.1f, -0.75f, 0.14f, -0.7f, 0.0f, 0.14f, -0.7f, 0.0f, 0.14f, -0.1f, -0.75f, 0.14f, -0.1f);
        this.gunModel[44].setRotationPoint(-0.25f, -3.5f, 0.0f);
        this.gunModel[44].rotateAngleZ = 0.08726646f;
        this.gunModel[45].addShapeBox(-8.0f, -0.92f, -1.4f, 1, 2, 1, 0.0f, -0.75f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.1f, -0.75f, 0.0f, -0.1f, -0.75f, 0.14f, -0.7f, 0.0f, 0.14f, -0.7f, 0.0f, 0.14f, -0.1f, -0.75f, 0.14f, -0.1f);
        this.gunModel[45].setRotationPoint(-0.25f, -3.5f, 0.0f);
        this.gunModel[45].rotateAngleZ = 0.08726646f;
        this.ammoModel = new ModelRendererTurbo[1];
        this.ammoModel[0] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 5, 1, 0.0f, 0.35f, 0.0f, -0.1f, -0.05f, 0.0f, -0.1f, -0.05f, 0.0f, -0.1f, 0.35f, 0.0f, -0.1f, 0.35f, 0.0f, -0.1f, -0.05f, 0.0f, -0.1f, -0.05f, 0.0f, -0.1f, 0.35f, 0.0f, -0.1f);
        this.ammoModel[0].setRotationPoint(9.8f, -2.5f, 0.0f);
        this.slideModel = new ModelRendererTurbo[1];
        this.slideModel[0] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.slideModel[0].addShapeBox(-1.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.5f, 0.05f, 0.05f, 0.0f, 0.05f, 0.05f, 0.0f, 0.05f, 0.5f, -0.5f, 0.05f, 0.5f, -0.5f, -0.7f, 0.05f, 0.0f, -0.7f, 0.05f, 0.0f, -0.7f, 0.5f, -0.5f, -0.7f, 0.5f);
        this.slideModel[0].setRotationPoint(8.0f, -4.9f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.2f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.translateAll(0.0f, -1.0f, -0.03f);
        this.thirdPersonOffset = new Vector3f(0.0f, -0.1f, 0.0f);
        this.flipAll();
    }
}
