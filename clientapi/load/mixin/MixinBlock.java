/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  awt
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.2h;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aow.class})
public abstract class MixinBlock {
    @Inject(method={"canCollideCheck"}, at={@At(value="HEAD")}, cancellable=true)
    private void canCollideCheck(awt object, boolean bl2, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        object = new 2h((aow)this);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }
}

