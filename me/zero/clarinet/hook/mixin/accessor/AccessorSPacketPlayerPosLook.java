/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  jq
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={jq.class})
public interface AccessorSPacketPlayerPosLook {
    @Accessor
    public void setYaw(float var1);

    @Accessor
    public void setPitch(float var1);
}

