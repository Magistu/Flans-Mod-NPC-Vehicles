// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity.old;

import net.minecraft.entity.Entity;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;

public class EntityNpcMonsterMale extends EntityNPCInterface
{
    public EntityNpcMonsterMale(final World world) {
        super(world);
        this.display.texture = "customnpcs:textures/entity/monstermale/ZombieSteve.png";
    }
    
    @Override
    public void onUpdate() {
        this.isDead = true;
        if (!this.worldObj.isRemote) {
            final NBTTagCompound compound = new NBTTagCompound();
            this.writeToNBT(compound);
            final EntityCustomNpc npc = new EntityCustomNpc(this.worldObj);
            npc.readFromNBT(compound);
            npc.ai.animationType = EnumAnimation.HUG;
            this.worldObj.spawnEntityInWorld((Entity)npc);
        }
        super.onUpdate();
    }
}
