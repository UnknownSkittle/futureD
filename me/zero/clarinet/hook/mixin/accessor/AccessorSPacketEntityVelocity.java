/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  kf
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={kf.class})
public interface AccessorSPacketEntityVelocity {
    @Accessor
    public int getEntityID();

    @Accessor
    public int getMotionX();

    @Accessor
    public int getMotionY();

    @Accessor
    public int getMotionZ();

    @Accessor
    public void setMotionX(int var1);

    @Accessor
    public void setMotionY(int var1);

    @Accessor
    public void setMotionZ(int var1);
}

