/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bzf
 *  bzg
 *  vg
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import me.zero.alpine.event.EventState;
import net.impactclient.0aO;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={bzf.class})
public class MixinRenderManager {
    @Inject(method={"renderEntity"}, at={@At(value="INVOKE", target="net/minecraft/client/renderer/entity/Render.setRenderOutlines(Z)V")}, locals=LocalCapture.CAPTURE_FAILHARD, cancellable=true)
    private void preRenderEntity(vg object, double d2, double d3, double d4, float f2, float f3, boolean bl2, CallbackInfo callbackInfo, bzg bzg2) {
        object = new 0aO(EventState.PRE, bzg2, (vg)object, d2, d3, d4, f2, f3);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderEntity"}, at={@At(value="RETURN")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void postRenderEntity(vg vg2, double d2, double d3, double d4, float f2, float f3, boolean bl2, CallbackInfo callbackInfo, bzg bzg2) {
        4t.1.post(new 0aO(EventState.POST, bzg2, vg2, d2, d3, d4, f2, f3));
    }
}

