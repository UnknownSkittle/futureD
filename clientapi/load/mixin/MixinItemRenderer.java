/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  bua
 *  buu
 *  ub
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0r_;
import net.impactclient.4H;
import net.impactclient.4t;
import net.impactclient.6_;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={buu.class})
public abstract class MixinItemRenderer {
    @Inject(method={"renderItemInFirstPerson(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderItemInFirstPerson(bua object, float f2, float f3, ub ub2, float f4, aip aip2, float f5, CallbackInfo callbackInfo) {
        object = new 6_((buu)this, f2, ub2, f4, aip2, f5);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderFireInFirstPerson"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderFireInFirstPerson(CallbackInfo callbackInfo) {
        4H h2 = new 4H(0r_.f);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

