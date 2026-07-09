/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aad
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8R;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aad.class})
public abstract class MixinEntityPig {
    @Inject(method={"canBeSteered"}, at={@At(value="RETURN")}, cancellable=true)
    private void canBeSteered(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        8R r2 = 0ay.3().5.0(8R.class);
        if (r2.4() && r2.0.0) {
            callbackInfoReturnable.setReturnValue(Boolean.TRUE);
        }
    }
}

