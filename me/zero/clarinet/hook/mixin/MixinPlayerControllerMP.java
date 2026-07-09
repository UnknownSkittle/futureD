/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  bsa
 *  et
 *  vg
 */
package me.zero.clarinet.hook.mixin;

import me.zero.alpine.event.Cancellable;
import me.zero.alpine.event.EventState;
import net.impactclient.0ac;
import net.impactclient.0ay;
import net.impactclient.4t;
import net.impactclient.4y;
import net.impactclient.7b;
import net.impactclient.8y;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={bsa.class})
public class MixinPlayerControllerMP {
    @Shadow
    private int g;

    @Inject(method={"onPlayerDestroyBlock"}, at={@At(value="INVOKE", target="net/minecraft/world/World.setBlockState(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;I)Z")}, cancellable=true)
    private void onPlayerDestroyBlock$setBlockState(et object, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        object = new 0ac((et)object);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfoReturnable.setReturnValue(Boolean.FALSE);
        }
    }

    @Redirect(method={"clickBlock"}, at=@At(value="FIELD", target="net/minecraft/client/multiplayer/PlayerControllerMP.blockHitDelay:I", opcode=181))
    private void clickBlock$blockHitDelay(bsa object, int n2) {
        object = 0ay.3().5.0(8y.class);
        this.g = ((7b)object).4() && ((8y)object).6.0 ? ((8y)object).3.2 : n2;
    }

    @Redirect(method={"onPlayerDamageBlock"}, at=@At(value="FIELD", target="net/minecraft/client/multiplayer/PlayerControllerMP.blockHitDelay:I", opcode=181))
    private void onPlayerDamageBlock$blockHitDelay(bsa object, int n2) {
        object = 0ay.3().5.0(8y.class);
        this.g = ((7b)object).4() && ((8y)object).6.0 ? ((8y)object).3.2 : n2;
    }

    @Inject(method={"attackEntity"}, at={@At(value="HEAD")})
    private void onPreAttackEntity(aed aed2, vg vg2, CallbackInfo callbackInfo) {
        4t.1.post(new 4y(EventState.PRE, aed2, vg2));
    }

    @Inject(method={"attackEntity"}, at={@At(value="RETURN")})
    private void onPostAttackEntity(aed aed2, vg vg2, CallbackInfo callbackInfo) {
        4t.1.post(new 4y(EventState.POST, aed2, vg2));
    }
}

