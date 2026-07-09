/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bry
 *  mi
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0U;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bry.class})
public abstract class MixinNetHandlerLoginClient {
    @Inject(method={"handleEncryptionRequest"}, at={@At(value="HEAD")}, cancellable=true)
    private void onLoginEncryptionRequest(mi object, CallbackInfo callbackInfo) {
        object = new 0U((bry)this, (mi)object);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

