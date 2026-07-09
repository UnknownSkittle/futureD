/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  aor
 *  awt
 *  bhb
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.8t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aor.class})
public class MixinBlockBasePressurePlate {
    @Inject(method={"getCollisionBoundingBox"}, at={@At(value="HEAD")}, cancellable=true)
    private void getCollisionBoundingBox(awt awt2, amy amy2, et et2, CallbackInfoReturnable<bhb> callbackInfoReturnable) {
        if (8t.8.4() && 8t.8.0a.0) {
            callbackInfoReturnable.setReturnValue(8t.7);
        }
    }
}

