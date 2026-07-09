/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ja
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ja.class})
public interface AccessorSPacketExplosion {
    @Accessor
    public float getMotionX();

    @Accessor
    public float getMotionY();

    @Accessor
    public float getMotionZ();

    @Accessor
    public void setMotionX(float var1);

    @Accessor
    public void setMotionY(float var1);

    @Accessor
    public void setMotionZ(float var1);
}

