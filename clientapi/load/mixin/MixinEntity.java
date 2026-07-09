/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 *  vv
 */
package clientapi.load.mixin;

import me.zero.alpine.event.Cancellable;
import net.impactclient.1s;
import net.impactclient.3Z;
import net.impactclient.4t;
import net.impactclient.50;
import net.impactclient.5X;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={vg.class})
public abstract class MixinEntity
implements 50 {
    @Shadow
    public double p;
    @Shadow
    public double q;
    @Shadow
    public double r;
    @Shadow
    public double s;
    @Shadow
    public double t;
    @Shadow
    public double u;
    @Shadow
    public double m;
    @Shadow
    public double n;
    @Shadow
    public double o;
    @Shadow
    public double M;
    @Shadow
    public double N;
    @Shadow
    public double O;
    @Shadow
    public float v;
    @Shadow
    public float w;
    @Shadow
    public float x;
    @Shadow
    public float y;
    private 3Z pos;
    private 3Z prevPos;
    private 3Z lastTickPos;
    private 3Z headPos;
    private 3Z motion;
    private 1s rotation;
    private 1s prevRotation;

    @Shadow
    public void a(vv vv2, double d2, double d3, double d4) {
    }

    @Shadow
    public abstract float by();

    @Shadow
    public abstract boolean equals(Object var1);

    @Inject(method={"applyEntityCollision"}, at={@At(value="HEAD")}, cancellable=true)
    private void applyEntityCollision(vg object, CallbackInfo callbackInfo) {
        object = new 5X((vg)this, (vg)object);
        4t.1.post(object);
        if (((Cancellable)object).isCancelled()) {
            callbackInfo.cancel();
        }
    }

    @Override
    public final void setPos(3Z z2) {
        this.p = z2.2;
        this.q = z2.0;
        this.r = z2.1;
    }

    public final void setPrevPos(3Z z2) {
        this.m = z2.2;
        this.n = z2.0;
        this.o = z2.1;
    }

    @Override
    public final void setLastTickPos(3Z z2) {
        this.M = z2.2;
        this.N = z2.0;
        this.O = z2.1;
    }

    @Override
    public final void setRotations(1s s2) {
        this.v = s2.1;
        this.w = s2.0;
    }

    @Override
    public final void setPrevRotations(1s s2) {
        this.x = s2.1;
        this.y = s2.0;
    }

    public final void setMotion(3Z z2) {
        this.s = this.pos.2;
        this.t = this.pos.0;
        this.u = this.pos.1;
    }

    @Override
    public final 3Z getPos() {
        if (this.pos == null) {
            this.pos = new 3Z();
        }
        double d2 = this.p;
        3Z z2 = this.pos;
        this.pos.2 = d2;
        v0.0 = d2 = this.q;
        v1.1 = d2 = this.r;
        return z2;
    }

    @Override
    public final 3Z getPrevPos() {
        if (this.prevPos == null) {
            this.prevPos = new 3Z();
        }
        double d2 = this.m;
        3Z z2 = this.prevPos;
        this.prevPos.2 = d2;
        v0.0 = d2 = this.n;
        v1.1 = d2 = this.o;
        return z2;
    }

    public final 3Z getLastTickPos() {
        if (this.lastTickPos == null) {
            this.lastTickPos = new 3Z();
        }
        double d2 = this.M;
        3Z z2 = this.lastTickPos;
        this.lastTickPos.2 = d2;
        v0.0 = d2 = this.N;
        v1.1 = d2 = this.O;
        return z2;
    }

    public final 3Z getHeadPos() {
        if (this.headPos == null) {
            this.headPos = new 3Z();
        }
        double d2 = this.p;
        3Z z2 = this.headPos;
        this.headPos.2 = d2;
        v0.0 = d2 = this.q + (double)this.by();
        v1.1 = d2 = this.r;
        return z2;
    }

    @Override
    public final 1s getRotations() {
        if (this.rotation == null) {
            this.rotation = new 1s();
        }
        float f2 = this.v;
        1s s2 = this.rotation;
        this.rotation.1 = f2;
        v0.0 = f2 = this.w;
        return s2;
    }

    public final 1s getPrevRotations() {
        if (this.prevRotation == null) {
            this.prevRotation = new 1s();
        }
        float f2 = this.x;
        1s s2 = this.prevRotation;
        this.prevRotation.1 = f2;
        v0.0 = f2 = this.y;
        return s2;
    }

    public final 3Z getMotion() {
        if (this.motion == null) {
            this.motion = new 3Z();
        }
        double d2 = this.s;
        3Z z2 = this.motion;
        this.motion.2 = d2;
        v0.0 = d2 = this.t;
        v1.1 = d2 = this.u;
        return z2;
    }

    @Override
    public final 3Z interpolate(float f2) {
        if (this.M == 0.0 && this.N == 0.0 && this.O == 0.0) {
            return this.getPos();
        }
        return this.getLastTickPos().1(this.getPos().3(this.getLastTickPos()).0(f2));
    }
}

