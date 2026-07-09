/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  awt
 *  buk
 *  bvn
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.9p;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={bvn.class})
public class MixinBlockFluidRenderer {
    @Inject(method={"renderFluid"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderFluid(amy amy2, awt awt2, et et2, buk buk2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (9p.0.4() && !9p.0(awt2.u())) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }
}

