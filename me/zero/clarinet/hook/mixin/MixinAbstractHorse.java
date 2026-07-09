/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aao
 */
package me.zero.clarinet.hook.mixin;

import net.impactclient.0ay;
import net.impactclient.7b;
import net.impactclient.8R;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={aao.class})
public abstract class MixinAbstractHorse {
    @Shadow
    protected float bE;

    @Inject(method={"setJumpPower"}, at={@At(value="RETURN")})
    private void setJumpPower(CallbackInfo object) {
        object = 0ay.3().5.0(8R.class);
        if (((7b)object).4() && ((8R)object).9.0) {
            this.bE = 1.0f;
        }
    }

    @Inject(method={"canBeSteered"}, at={@At(value="RETURN")}, cancellable=true)
    private void canBeSteered(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        8R r2 = 0ay.3().5.0(8R.class);
        if (r2.4() && r2.0.0) {
            callbackInfoReturnable.setReturnValue(Boolean.TRUE);
        }
    }

    @Inject(method={"canJump"}, at={@At(value="RETURN")}, cancellable=true)
    private void canJump(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        8R r2 = 0ay.3().5.0(8R.class);
        if (r2.4() && r2.0.0) {
            callbackInfoReturnable.setReturnValue(Boolean.TRUE);
        }
    }

    @Redirect(method={"travel"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/passive/AbstractHorse;isHorseSaddled()Z"))
    private boolean travel$isHorseSaddled(aao aao2) {
        8R r2 = 0ay.3().5.0(8R.class);
        return r2.4() && r2.0.0 || aao2.dG();
    }
}

