/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amy
 *  aru
 *  awt
 *  bhb
 *  et
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8X;
import net.impactclient.9_;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aru.class})
public class MixinBlockLiquid {
    @Inject(method={"canCollideCheck"}, at={@At(value="HEAD")}, cancellable=true)
    private void canCollideCheck(awt awt2, boolean bl2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (0ay.3().5.0(8X.class).4()) {
            callbackInfoReturnable.setReturnValue(Boolean.TRUE);
        }
    }

    @Inject(method={"getCollisionBoundingBox"}, at={@At(value="HEAD")}, cancellable=true)
    private void getCollisionBoundingBox(awt awt2, amy amy2, et et2, CallbackInfoReturnable<bhb> callbackInfoReturnable) {
        if (9_.1.7) {
            callbackInfoReturnable.setReturnValue(9_.3);
        }
    }
}

