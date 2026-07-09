/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  biz
 */
package clientapi.load.mixin;

import net.impactclient.0r_;
import net.impactclient.4H;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={biz.class})
public class MixinGuiBossOverlay {
    @Inject(method={"renderBossHealth"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderBossHealth(CallbackInfo callbackInfo) {
        4H h2 = new 4H(0r_.l);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

