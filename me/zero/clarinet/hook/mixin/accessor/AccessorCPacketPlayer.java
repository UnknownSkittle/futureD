/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  lk
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={lk.class})
public interface AccessorCPacketPlayer {
    @Accessor
    public void setX(double var1);

    @Accessor
    public void setY(double var1);

    @Accessor
    public void setZ(double var1);

    @Accessor
    public void setYaw(float var1);

    @Accessor
    public void setPitch(float var1);

    @Accessor
    public void setOnGround(boolean var1);
}

