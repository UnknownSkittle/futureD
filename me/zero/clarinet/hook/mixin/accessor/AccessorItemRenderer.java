/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  buu
 *  vo
 */
package me.zero.clarinet.hook.mixin.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(value={buu.class})
public interface AccessorItemRenderer {
    @Invoker
    public void callTransformSideFirstPerson(vo var1, float var2);

    @Invoker
    public void callTransformFirstPerson(vo var1, float var2);
}

