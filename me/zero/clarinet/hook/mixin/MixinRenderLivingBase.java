/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bib
 *  bzf
 *  bzg
 *  caa
 *  vp
 */
package me.zero.clarinet.hook.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={caa.class})
public abstract class MixinRenderLivingBase<T extends vp>
extends bzg<T> {
    protected MixinRenderLivingBase(bzf bzf2) {
        super(bzf2);
    }

    @Inject(method={"canRenderName"}, at={@At(value="HEAD")}, cancellable=true)
    private void canRenderName(T t2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (bib.z().h == null) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }
}

