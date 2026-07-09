/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhh
 *  bzg
 *  vg
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.3M;
import net.impactclient.4t;
import net.impactclient.5G;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={bzg.class})
public class MixinRender {
    @Inject(method={"getTeamColor"}, at={@At(value="RETURN")}, cancellable=true, locals=LocalCapture.CAPTURE_FAILHARD)
    private void getTeamColor(vg object, CallbackInfoReturnable<Integer> callbackInfoReturnable, int n2, bhh bhh2) {
        object = new 5G((vg)object, n2);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfoReturnable.setReturnValue(((5G)object).0);
        }
    }

    @Inject(method={"renderLivingLabel"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderLivingLabel(vg object, String string, double d2, double d3, double d4, int n2, CallbackInfo callbackInfo) {
        object = new 3M((vg)object, string);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

