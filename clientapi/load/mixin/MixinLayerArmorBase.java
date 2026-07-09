/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bqf
 *  caa
 *  cbp
 *  vp
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0r;
import net.impactclient.4t;
import net.impactclient.4z;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={cbp.class})
public class MixinLayerArmorBase {
    @Inject(method={"renderEnchantedGlint"}, at={@At(value="HEAD")}, cancellable=true)
    private static void renderEnchantedGlint(caa<?> object, vp vp2, bqf bqf2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, CallbackInfo callbackInfo) {
        object = new 0r(4z.a);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

