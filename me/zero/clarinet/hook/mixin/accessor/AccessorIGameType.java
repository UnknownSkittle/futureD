/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ams
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ams.class})
public interface AccessorIGameType {
    @Accessor
    public String getShortName();
}

