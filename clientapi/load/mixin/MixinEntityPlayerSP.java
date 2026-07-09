/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhb
 *  bib
 *  brz
 *  bua
 *  bud
 *  ht
 *  la
 *  vv
 */
package clientapi.load.mixin;

import clientapi.load.mixin.MixinEntityLivingBase;
import me.zero.alpine.event.Cancellable;
import me.zero.alpine.event.EventState;
import net.impactclient.43;
import net.impactclient.4A;
import net.impactclient.4T;
import net.impactclient.4Z;
import net.impactclient.4b;
import net.impactclient.4i;
import net.impactclient.4p;
import net.impactclient.4t;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={bud.class})
public abstract class MixinEntityPlayerSP
extends MixinEntityLivingBase {
    @Shadow
    protected bib f;
    private 4Z preMotionUpdateEvent;

    @Inject(method={"onUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPreUpdate(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        43 var2_2 = new 43((bud)this, EventState.PRE);
        4t.1.post(var2_2);
        if (var2_2.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onUpdate"}, at={@At(value="RETURN")})
    private void onPostUpdate(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        4t.1.post(new 43((bud)this, EventState.POST));
    }

    @Inject(method={"onLivingUpdate"}, at={@At(value="HEAD")})
    private void onPreLivingUpdate(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        4t.1.post(new 4i((bud)this, EventState.PRE));
    }

    @Inject(method={"onLivingUpdate"}, at={@At(value="RETURN")})
    private void onPostLivingUpdate(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        4t.1.post(new 4i((bud)this, EventState.POST));
    }

    @Redirect(method={"move"}, at=@At(value="INVOKE", target="net/minecraft/client/entity/AbstractClientPlayer.move(Lnet/minecraft/entity/MoverType;DDD)V"))
    private void move$move(bua object, vv vv2, double d2, double d3, double d4) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            object = new 4b((bud)this, vv2, d2, d3, d4);
            4t.1.post(object);
            if (((4A)object).isCancelled()) {
                return;
            }
            d2 = ((4b)object).1;
            d3 = ((4b)object).2;
            d4 = ((4b)object).0;
        }
        super.a(vv2, d2, d3, d4);
    }

    @Redirect(method={"sendChatMessage"}, at=@At(value="INVOKE", target="Lnet/minecraft/client/network/NetHandlerPlayClient;sendPacket(Lnet/minecraft/network/Packet;)V"))
    private void sendChatPacket(brz brz2, ht<?> object) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            object = new 4p(((la)object).a());
            4t.1.post(object);
            if (((Cancellable)object).isCancelled()) {
                return;
            }
            object = new la(((4T)object).0());
        }
        brz2.a(object);
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="HEAD")}, cancellable=true)
    private void onPreUpdateWalking(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        this.preMotionUpdateEvent = new 4Z((bud)this, EventState.PRE);
        4t.1.post(this.preMotionUpdateEvent);
        if (this.preMotionUpdateEvent.isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onUpdateWalkingPlayer"}, at={@At(value="RETURN")})
    private void onPostUpdateWalking(CallbackInfo callbackInfo) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return;
        }
        4t.1.post(new 4Z((bud)this, EventState.POST));
        this.preMotionUpdateEvent = null;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/client/entity/EntityPlayerSP;posX:D"))
    private double injectPosX(bud bud2) {
        if (bud2 != this.f.h) {
            return bud2.p;
        }
        return this.preMotionUpdateEvent.1.2;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/util/math/AxisAlignedBB;minY:D"))
    private double injectPosY(bhb bhb2) {
        MixinEntityPlayerSP mixinEntityPlayerSP = this;
        if (!mixinEntityPlayerSP.equals(mixinEntityPlayerSP.f.h)) {
            return bhb2.b;
        }
        return this.preMotionUpdateEvent.1.0;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/client/entity/EntityPlayerSP;posZ:D"))
    private double injectPosZ(bud bud2) {
        if (bud2 != this.f.h) {
            return bud2.r;
        }
        return this.preMotionUpdateEvent.1.1;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/client/entity/EntityPlayerSP;rotationYaw:F"))
    private float injectYaw(bud bud2) {
        if (bud2 != this.f.h) {
            return bud2.v;
        }
        return this.preMotionUpdateEvent.2.1;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/client/entity/EntityPlayerSP;rotationPitch:F"))
    private float injectPitch(bud bud2) {
        if (bud2 != this.f.h) {
            return bud2.w;
        }
        return this.preMotionUpdateEvent.2.0;
    }

    @Redirect(method={"onUpdateWalkingPlayer"}, at=@At(value="FIELD", target="Lnet/minecraft/client/entity/EntityPlayerSP;onGround:Z"))
    private boolean injectOnGround(bud bud2) {
        if (bud2 != this.f.h) {
            return bud2.z;
        }
        return this.preMotionUpdateEvent.3;
    }
}

