/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  awt
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.9p;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aow.class})
public class MixinBlock {
    @Inject(method={"isFullBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void isFullBlock(awt awt2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (9p.0.4()) {
            if (9p.0((aow)this)) {
                callbackInfoReturnable.setReturnValue(Boolean.TRUE);
            }
        }
    }
}

