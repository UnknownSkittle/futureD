/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ur
 *  vp
 */
package clientapi.load.mixin;

import clientapi.load.mixin.MixinEntity;
import me.zero.alpine.event.EventState;
import net.impactclient.0rC;
import net.impactclient.4U;
import net.impactclient.4t;
import net.impactclient.6C;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={vp.class})
public abstract class MixinEntityLivingBase
extends MixinEntity {
    @Inject(method={"onDeath"}, at={@At(value="HEAD")})
    private void onDeath(ur ur2, CallbackInfo callbackInfo) {
        callbackInfo = (vp)this;
        4t.1.post(new 0rC((vp)callbackInfo, ur2));
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/entity/EntityLivingBase.travel(FFF)V"))
    private void onLivingUpdate$travel(vp vp2, float f2, float f3, float f4) {
        6C c2 = new 6C(EventState.PRE, vp2, f2, f3, f4);
        4t.1.post(c2);
        if (!c2.isCancelled()) {
            vp2.a(c2.2, c2.1, c2.3);
        }
        4t.1.post(new 6C(EventState.POST, vp2, f2, f3, f4));
    }

    @Inject(method={"jump"}, at={@At(value="HEAD")}, cancellable=true)
    private void preJump(CallbackInfo callbackInfo) {
        4U u2 = new 4U(EventState.PRE, (vp)this);
        4t.1.post(u2);
        if (u2.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"jump"}, at={@At(value="RETURN")})
    private void postJump(CallbackInfo callbackInfo) {
        4t.1.post(new 4U(EventState.POST, (vp)this));
    }
}

