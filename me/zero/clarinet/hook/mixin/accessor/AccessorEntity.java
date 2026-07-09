/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={vg.class})
public interface AccessorEntity {
    @Accessor(value="isInWeb")
    public void setInWeb(boolean var1);

    @Accessor(value="inWater")
    public void setInWater(boolean var1);
}

