/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bit
 *  bjw
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0r_;
import net.impactclient.4H;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bjw.class})
public class MixinGuiSpectator {
    @Inject(method={"renderSelectedItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderSelectedItem(bit object, CallbackInfo callbackInfo) {
        object = new 4H(0r_.s);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

