/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bzw
 *  cfy
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

@Mixin(value={bzw.class})
public class MixinRenderItem {
    @Inject(method={"renderEffect"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderEffect(cfy object, CallbackInfo callbackInfo) {
        object = new 0r(4z.b);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

