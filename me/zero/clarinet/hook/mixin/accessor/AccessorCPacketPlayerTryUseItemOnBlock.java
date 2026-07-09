/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  fa
 *  ma
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={ma.class})
public interface AccessorCPacketPlayerTryUseItemOnBlock {
    @Accessor(value="placedBlockDirection")
    public void setDirection(fa var1);
}

