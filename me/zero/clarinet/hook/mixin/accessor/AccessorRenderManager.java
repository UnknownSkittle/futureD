/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bzf
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={bzf.class})
public interface AccessorRenderManager {
    @Accessor
    public double getRenderPosX();

    @Accessor
    public double getRenderPosY();

    @Accessor
    public double getRenderPosZ();
}

