/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  amu
 *  bib
 *  blk
 *  bua
 *  bub
 *  bud
 *  com.mojang.authlib.GameProfile
 */
package me.zero.clarinet.hook.mixin;

import com.mojang.authlib.GameProfile;
import net.impactclient.0ay;
import net.impactclient.0rX;
import net.impactclient.3a;
import net.impactclient.4t;
import net.impactclient.7X;
import net.impactclient.8N;
import net.impactclient.8b;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={bud.class})
public abstract class MixinEntityPlayerSP
extends bua {
    @Shadow
    protected bib f;
    @Shadow
    public bub e;

    public MixinEntityPlayerSP(amu amu2, GameProfile gameProfile) {
        super(amu2, gameProfile);
    }

    @Inject(method={"onLivingUpdate"}, slice={@Slice(from=@At(value="INVOKE", target="net/minecraft/client/entity/EntityPlayerSP.isHandActive()Z", ordinal=0), to=@At(value="FIELD", opcode=180, target="net/minecraft/client/entity/EntityPlayerSP.autoJumpTime:I", ordinal=0))}, at={@At(value="FIELD", opcode=181, target="net/minecraft/client/entity/EntityPlayerSP.sprintToggleTimer:I")})
    private void onLivingUpdate$updatePlayerMoveState(CallbackInfo callbackInfo) {
        callbackInfo = (bud)this;
        if (callbackInfo != this.f.h) {
            return;
        }
        8b b2 = 0ay.3().5.0(8b.class);
        if (b2.4() && b2.3.0) {
            float f2 = (100.0f - (float)b2.8.2) / 100.0f * 4.0f;
            ((bud)callbackInfo).e.a *= f2 + 1.0f;
            ((bud)callbackInfo).e.b *= f2 + 1.0f;
        }
    }

    @ModifyArg(method={"setSprinting"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/AbstractClientPlayer.setSprinting(Z)V"))
    private boolean setSprinting$setSprinting(boolean bl2) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            3a a2 = new 3a(bl2);
            4t.1.post(a2);
            return a2.0;
        }
        return bl2;
    }

    @Redirect(method={"onLivingUpdate"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/GuiScreen.doesGuiPauseGame()Z"))
    private boolean onLivingUpdate$doesGuiPauseGame(blk blk2) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            7X x2 = 0ay.3().5.0(7X.class);
            return x2.4() && x2.0.0 || blk2.d();
        }
        return blk2.d();
    }

    @Inject(method={"isCurrentViewEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void isCurrentViewEntity(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (8N.6.4()) {
            MixinEntityPlayerSP mixinEntityPlayerSP = this;
            if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
                callbackInfoReturnable.setReturnValue(Boolean.TRUE);
            }
        }
    }

    @Inject(method={"isUser"}, at={@At(value="HEAD")}, cancellable=true)
    private void isUser(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (8N.6.4()) {
            MixinEntityPlayerSP mixinEntityPlayerSP = this;
            if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
                callbackInfoReturnable.setReturnValue(Boolean.FALSE);
            }
        }
    }

    @Inject(method={"onLivingUpdate"}, at={@At(value="INVOKE", target="net/minecraft/util/MovementInput.updatePlayerMoveState()V", shift=At.Shift.AFTER)})
    private void postUpdateMoveState(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            4t.1.post(new 0rX(this.e));
        }
    }
}

