//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2018 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GermanAssaultHat
// Model Creator: 
// Created on: 29.02.2016 - 21:46:43
// Last changed on: 29.02.2016 - 21:46:43

package com.flansmod.client.model.mineworld; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGermanFeldmuetzeM43 extends ModelCustomArmour //Same as Filename
{
	int textureX = 2048;
	int textureY = 2048;

	public ModelGermanFeldmuetzeM43() //Same as Filename
	{
		headModel = new ModelRendererTurbo[18];
		headModel[0] = new ModelRendererTurbo(this, 1, 5, textureX, textureY); // Import 
		headModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Import 
		headModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Import 
		headModel[3] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Import 
		headModel[4] = new ModelRendererTurbo(this, 1689, 1, textureX, textureY); // Import 
		headModel[5] = new ModelRendererTurbo(this, 1817, 9, textureX, textureY); // Import 
		headModel[6] = new ModelRendererTurbo(this, 1769, 1, textureX, textureY); // Import 
		headModel[7] = new ModelRendererTurbo(this, 1793, 1, textureX, textureY); // Box 9
		headModel[8] = new ModelRendererTurbo(this, 1809, 1, textureX, textureY); // Box 10
		headModel[9] = new ModelRendererTurbo(this, 1833, 1, textureX, textureY); // Box 11
		headModel[10] = new ModelRendererTurbo(this, 1801, 1, textureX, textureY); // Box 12
		headModel[11] = new ModelRendererTurbo(this, 1849, 1, textureX, textureY); // Box 13
		headModel[12] = new ModelRendererTurbo(this, 1865, 1, textureX, textureY); // Box 14
		headModel[13] = new ModelRendererTurbo(this, 1897, 1, textureX, textureY); // Box 15
		headModel[14] = new ModelRendererTurbo(this, 1817, 9, textureX, textureY); // Box 17
		headModel[15] = new ModelRendererTurbo(this, 1705, 1, textureX, textureY); // Box 18
		headModel[16] = new ModelRendererTurbo(this, 97, 867, textureX, textureY); // Box 16
		headModel[17] = new ModelRendererTurbo(this, 447, 1095, textureX, textureY); // Box 15

		headModel[0].addShapeBox(-4F, -6F, -6F, 8, 1, 2, 0F, 0F, -0.8F, 1F, 0.0F, -0.8F, 1F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addShapeBox(-4F, -7F, -4F, 16, 2, 16, 0F, 0.1F, 0.5F, 0.1F, -7.9F, 0.5F, 0.1F, -7.9F, 0.5F, -7.9F, 0.1F, 0.5F, -7.9F, 0.1F, 0.0F, 0.1F, -7.9F, 0.0F, 0.1F, -7.9F, 0.0F, -7.9F, 0.1F, 0.0F, -7.9F); // Import 
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addShapeBox(-11.75F, -8.5F, -4.3F, 800, 800, 1, 0F, -10.5F, 0F, 0.2F, -787F, 0F, 0.2F, -787F, 0.0F, 0.0F, -10.5F, 0.0F, 0.0F, -10.5F, -799F, 0.0F, -787F, -799F, 0.0F, -787F, -799F, 0.0F, -10.5F, -799F, 0.0F); // Import 
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addShapeBox(0F, -7.26F, -4.7F, 4, 2, 1, 0F, 0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.4F, 0.3F, -0.5F, -0.3F, 0.7F, -0.5F, -0.3F, 0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.4F, 0.3F, 0.0F, -0.3F, 0.8F, 0.0F, -0.3F); // Import 
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addShapeBox(-4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Import 
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addShapeBox(-0.5F, -6.4F, -4.4F, 30, 30, 1, 0F, -0.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -0.3F, -29.3F, 0.0F); // Import 
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addShapeBox(-4F, -9F, 0F, 8, 1, 4, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F); // Import 
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addShapeBox(-4F, -7.26F, -4.5F, 3, 2, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 9
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addShapeBox(-4F, -8.26F, 3.5F, 8, 3, 1, 0F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 10
		headModel[8].setRotationPoint(0F, 0F, 0F);

		headModel[9].addShapeBox(-4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 11
		headModel[9].setRotationPoint(0F, 0F, 0F);

		headModel[10].addShapeBox(4F, -8.26F, -0.9F, 1, 3, 5, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, 0.3F, -0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 12
		headModel[10].setRotationPoint(0F, 0F, 0F);

		headModel[11].addShapeBox(4F, -7.26F, -4.3F, 1, 2, 4, 0F, 0.3F, -0.5F, -0.3F, -0.7F, -0.5F, -0.3F, -0.7F, 0.5F, -0.3F, 0.3F, 0.5F, -0.3F, 0.3F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F); // Box 13
		headModel[11].setRotationPoint(0F, 0F, 0F);

		headModel[12].addShapeBox(-4F, -9F, -4F, 8, 1, 4, 0F, 0.1F, -0.3F, 0.4F, 0.1F, -0.3F, 0.4F, 0.1F, -0.5F, 0F, 0.1F, -0.5F, 0F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0.1F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F); // Box 14
		headModel[12].setRotationPoint(0F, 0F, 0F);

		headModel[13].addShapeBox(-4F, -9.25F, 0F, 8, 1, 4, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, -1.25F, 0.1F, 0.1F, -1.25F, 0.1F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F); // Box 15
		headModel[13].setRotationPoint(0F, 0F, 0F);

		headModel[14].addShapeBox(-0.5F, -6.9F, -4.4F, 30, 30, 1, 0F, -0.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -29.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -29.3F, -29.3F, 0.0F, -0.3F, -29.3F, 0.0F); // Box 17
		headModel[14].setRotationPoint(0F, 0F, 0F);

		headModel[15].addShapeBox(-0.5F, -7.6F, -4.2F, 30, 30, 1, 0F, -0.2F, -0.2F, 0.0F, -29.2F, -0.2F, 0.0F, -29.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -29.2F, 0.0F, -29.2F, -29.2F, 0.0F, -29.2F, -29.2F, 0.0F, -0.2F, -29.2F, 0.0F); // Box 18
		headModel[15].setRotationPoint(0F, 0F, 0F);

		headModel[16].addShapeBox(-1F, -7.6F, -4.2F, 781, 471, 1, 0F, 0F, 0F, 0F, -779F, 0F, 0F, -779F, 0F, 0F, 0F, 0F, 0F, 0F, -470F, 0F, -779F, -470F, 0F, -779F, -470F, 0F, 0F, -470F, 0F); // Box 16
		headModel[16].setRotationPoint(0F, 0F, 0F);

		headModel[17].addShapeBox(7.3F, 3F, -18.25F, 10, 400, 400, 0F, 0F, -0.25F, -17.5F, -9F, -0.25F, -17.5F, -9F, -0.25F, -381F, 0F, -0.25F, -381F, 0F, -398.5F, -17.5F, -9F, -398.5F, -17.5F, -9F, -398.5F, -381F, 0F, -398.5F, -381F); // Box 15
		headModel[17].setRotationPoint(0F, 0F, 0F);


	}
}