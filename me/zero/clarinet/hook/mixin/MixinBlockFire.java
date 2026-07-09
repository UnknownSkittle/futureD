/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  aow
 *  aqq
 *  awt
 *  bhb
 *  bib
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aqq.class})
public class MixinBlockFire {
    @Inject(method={"getCollisionBoundingBox"}, at={@At(value="HEAD")}, cancellable=true)
    private void getCollisionBoundingBox(awt awt2, amy amy2, et et2, CallbackInfoReturnable<bhb> callbackInfoReturnable) {
        awt2 = bib.z();
        if (8t.8.4() && 8t.8.0.0 && awt2.f == amy2 && awt2.h != null && awt2.h.q == (double)et2.q()) {
            callbackInfoReturnable.setReturnValue(aow.j);
        }
    }
}

