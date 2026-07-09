/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  atx
 *  awt
 *  bib
 *  et
 *  vg
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.8b;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={atx.class})
public class MixinBlockSoulSand {
    @Inject(method={"onEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPreEntityWalk(amu object, et et2, awt awt2, vg vg2, CallbackInfo callbackInfo) {
        if (vg2 == bib.z().h && (object = 0ay.3().5.0(8b.class)).4() && object.7.0) {
            callbackInfo.cancel();
        }
    }
}

