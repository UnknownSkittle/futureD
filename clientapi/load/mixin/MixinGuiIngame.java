/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aed
 *  bcz
 *  bhg
 *  bid
 *  biq
 *  bit
 *  rk
 *  vg
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.0r_;
import net.impactclient.4H;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={biq.class})
public class MixinGuiIngame {
    @Inject(method={"renderPumpkinOverlay"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPumpkinOverlay(bit object, CallbackInfo callbackInfo) {
        object = new 4H(0r_.c);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderScoreboard"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderScoreboard(bhg object, bit bit2, CallbackInfo callbackInfo) {
        object = new 4H(0r_.e);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderPlayerStats"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPlayerStats(bit object, CallbackInfo callbackInfo) {
        object = new 4H(0r_.g);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"renderPlayerStats"}, at=@At(value="INVOKE", target="net/minecraft/entity/player/EntityPlayer.getTotalArmorValue()I"))
    private int renderPlayerStats$getTotalArmorValue(aed aed2) {
        4H h2 = new 4H(0r_.j);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return 0;
        }
        return aed2.cg();
    }

    @Redirect(method={"renderPlayerStats"}, at=@At(value="INVOKE", target="net/minecraft/util/math/MathHelper.ceil(F)I", ordinal=4))
    private int renderPlayerStats$ceil$4(float f2) {
        4H h2 = new 4H(0r_.h);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return 0;
        }
        return rk.f((float)f2);
    }

    @Redirect(method={"renderPlayerStats"}, at=@At(value="INVOKE", target="net/minecraft/entity/player/EntityPlayer.getRidingEntity()Lnet/minecraft/entity/Entity;"))
    private vg renderPlayerStats$getRidingEntity(aed aed2) {
        4H h2 = new 4H(0r_.i);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return aed2;
        }
        return aed2.bJ();
    }

    @Redirect(method={"renderPlayerStats"}, at=@At(value="INVOKE", target="net/minecraft/entity/player/EntityPlayer.isInsideOfMaterial(Lnet/minecraft/block/material/Material;)Z"))
    private boolean renderPlayerStats$isInsideOfMaterial(aed aed2, bcz bcz2) {
        4H h2 = new 4H(0r_.k);
        4t.1.post(h2);
        return !h2.isCancelled() && aed2.a(bcz2);
    }

    @Inject(method={"renderExpBar"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderExpBar(bit object, int n2, CallbackInfo callbackInfo) {
        object = new 4H(0r_.m);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderVignette"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderVignette(float f2, bit bit2, CallbackInfo callbackInfo) {
        4H h2 = new 4H(0r_.n);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Redirect(method={"renderAttackIndicator"}, at=@At(value="INVOKE", target="net/minecraft/client/gui/GuiIngame.drawTexturedModalRect(IIIIII)V", ordinal=0))
    private void renderAttackIndicator(biq biq2, int n2, int n3, int n4, int n5, int n6, int n7) {
        4H h2 = new 4H(0r_.o);
        4t.1.post(h2);
        if (!h2.isCancelled()) {
            biq2.b(n2, n3, n4, n5, n6, n7);
        }
    }

    @Redirect(method={"renderAttackIndicator"}, at=@At(value="FIELD", target="net/minecraft/client/settings/GameSettings.attackIndicator:I", opcode=180))
    private int renderAttackIndicator$attackIndicator(bid bid2) {
        4H h2 = new 4H(0r_.p);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return 0;
        }
        return bid2.N;
    }

    @Redirect(method={"renderHotbar"}, at=@At(value="FIELD", target="net/minecraft/client/settings/GameSettings.attackIndicator:I", opcode=180))
    private int renderHotbar$attackIndicator(bid bid2) {
        4H h2 = new 4H(0r_.p);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            return 0;
        }
        return bid2.N;
    }

    @Inject(method={"renderHorseJumpBar"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderHorseJumpBar(bit object, int n2, CallbackInfo callbackInfo) {
        object = new 4H(0r_.q);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderPortal"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPortal(float f2, bit bit2, CallbackInfo callbackInfo) {
        4H h2 = new 4H(0r_.r);
        4t.1.post(h2);
        if (h2.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderSelectedItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderSelectedItem(bit object, CallbackInfo callbackInfo) {
        object = new 4H(0r_.s);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"renderPotionEffects"}, at={@At(value="HEAD")}, cancellable=true)
    private void renderPotionEffects(bit object, CallbackInfo callbackInfo) {
        object = new 4H(0r_.t);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }
}

