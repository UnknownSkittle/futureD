/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aom
 *  aow
 *  aox
 *  aqa
 *  aqp
 *  arf
 *  arq
 *  awt
 *  axj
 *  bhe
 *  et
 *  fa
 *  fq
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cm;
import baritone.cn;
import baritone.co;
import baritone.ds;
import baritone.du;
import baritone.fn;
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dt
extends ck {
    private boolean a = true;

    public dt(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2.up(), betterBlockPos2}, betterBlockPos2.down());
    }

    @Override
    public final void reset() {
        super.reset();
        this.a = true;
    }

    @Override
    public final double a(cj cj2) {
        return dt.a(cj2, this.a.a, this.a.b, this.a.c, this.b.a, this.b.c);
    }

    @Override
    public final Set<BetterBlockPos> a() {
        return ImmutableSet.of(this.a, this.b);
    }

    public static double a(cj cj2, int n2, int n3, int n4, int n5, int n6) {
        awt awt2 = cj2.a(n5, n3 + 1, n6);
        awt awt3 = cj2.a(n5, n3, n6);
        awt awt4 = cj2.a(n5, n3 - 1, n6);
        aow aow2 = cj2.a(n2, n3 - 1, n4);
        if (cl.c(cj2.a, n5, n3 - 1, n6, awt4)) {
            double d2;
            double d3 = 4.63284688441047;
            boolean bl2 = false;
            if (cl.b(awt2.u()) || cl.b(awt3.u())) {
                d3 = cj2.b;
                bl2 = true;
            } else {
                if (awt4.u() == aox.aW) {
                    d3 = 6.949270326615705;
                } else if (awt4.u() == aox.j) {
                    d3 = 4.63284688441047 + cj2.f;
                }
                if (aow2 == aox.aW) {
                    d3 += 2.316423442205235;
                }
            }
            double d4 = cl.a(cj2, n5, n3, n6, awt3, false);
            if (d2 >= 1000000.0) {
                return 1000000.0;
            }
            double d5 = cl.a(cj2, n5, n3 + 1, n6, awt2, true);
            if (d4 == 0.0 && d5 == 0.0) {
                if (!bl2 && cj2.d) {
                    d3 *= 0.7692444761225944;
                }
                return d3;
            }
            if (aow2 == aox.au || aow2 == aox.bn) {
                d4 *= 5.0;
                d5 *= 5.0;
            }
            return d3 + d4 + d5;
        }
        if (aow2 == aox.au || aow2 == aox.bn) {
            return 1000000.0;
        }
        if (cl.a(n5, n6, awt4, cj2.a)) {
            double d6;
            double d7;
            int n7;
            int n8 = n7 = cl.b(awt2.u()) || cl.b(awt3.u()) ? 1 : 0;
            if (cl.b(awt4.u()) && n7 != 0) {
                return 1000000.0;
            }
            double d8 = cj2.a(n5, n3 - 1, n6, awt4);
            if (d7 >= 1000000.0) {
                return 1000000.0;
            }
            double d9 = cl.a(cj2, n5, n3, n6, awt3, false);
            if (d6 >= 1000000.0) {
                return 1000000.0;
            }
            double d10 = cl.a(cj2, n5, n3 + 1, n6, awt2, true);
            double d11 = n7 != 0 ? cj2.b : 4.63284688441047;
            for (int i2 = 0; i2 < 5; ++i2) {
                int n9 = n5 + a[i2].g();
                int n10 = n3 - 1 + a[i2].h();
                n7 = n6 + a[i2].i();
                if (n9 == n2 && n7 == n4 || !cl.c(cj2.a, n9, n10, n7)) continue;
                return d11 + d8 + d9 + d10;
            }
            if (aow2 == aox.aW || aow2 instanceof arf && !((arf)aow2).e()) {
                return 1000000.0;
            }
            if (aow2 == aox.i || aow2 == aox.j) {
                return 1000000.0;
            }
            return d11 * 3.3207692307692307 + d8 + d9 + d10;
        }
        return 1000000.0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public final cn a(cn object) {
        Optional<Rotation> optional;
        void var4_10;
        boolean bl2;
        super.a((cn)object);
        awt awt2 = fn.a((IPlayerContext)this.a, (et)this.a[0]);
        Object object2 = fn.a((IPlayerContext)this.a, (et)this.a[1]);
        if (((cn)object).a != MovementStatus.RUNNING) {
            if (!((Boolean)baritone.a.a().walkWhileBreaking.value).booleanValue()) {
                return object;
            }
            if (((cn)object).a != MovementStatus.PREPPING) {
                return object;
            }
            if (cl.a(awt2.u())) {
                return object;
            }
            if (cl.a(object2.u())) {
                return object;
            }
            if (Math.max(Math.abs(this.a.player().p - ((double)this.b.p() + 0.5)), Math.abs(this.a.player().r - ((double)this.b.r() + 0.5))) < 0.83) {
                return object;
            }
            if (!Optional.ofNullable(((cn)object).a.a).isPresent()) {
                return object;
            }
            float f2 = RotationUtils.calcRotationFromVec3d(this.a.playerHead(), VecUtils.calculateBlockCenter(this.a.world(), this.b), this.a.playerRotations()).getYaw();
            float f3 = Optional.ofNullable(((cn)object).a.a).get().getPitch();
            if (awt2.g() || awt2.u() instanceof aom && (object2.g() || object2.u() instanceof aom)) {
                f3 = 26.0f;
            }
            return ((cn)object).a(new co(new Rotation(f2, f3), true)).a(Input.MOVE_FORWARD, true).a(Input.SPRINT, true);
        }
        ((cn)object).a(Input.SNEAK, false);
        aow aow2 = fn.a((IPlayerContext)this.a, this.a.down()).u();
        boolean bl3 = bl2 = aow2 == aox.au || aow2 == aox.bn;
        if (awt2.u() instanceof aqa || object2.u() instanceof aqa) {
            boolean bl4;
            boolean bl5 = awt2.u() instanceof aqa && !cl.a((IPlayerContext)this.a, (et)this.a, (et)this.b) || object2.u() instanceof aqa && !cl.a((IPlayerContext)this.a, (et)this.b, (et)this.a);
            boolean bl6 = bl4 = !aox.aA.equals(awt2.u()) && !aox.aA.equals(object2.u());
            if (bl5 && bl4) {
                return ((cn)object).a(new co(RotationUtils.calcRotationFromVec3d(this.a.playerHead(), VecUtils.calculateBlockCenter(this.a.world(), (et)this.a[0]), this.a.playerRotations()), true)).a(Input.CLICK_RIGHT, true);
            }
        }
        if ((awt2.u() instanceof aqp || object2.u() instanceof aqp) && (!cl.b((IPlayerContext)this.a, (et)this.a[0], this.a.up()) ? this.a[0] : (var4_10 = !cl.b((IPlayerContext)this.a, (et)this.a[1], (et)this.a) ? this.a[1] : null)) != null && (optional = RotationUtils.reachable((IPlayerContext)this.a, (et)var4_10)).isPresent()) {
            return ((cn)object).a(new co(optional.get(), true)).a(Input.CLICK_RIGHT, true);
        }
        boolean bl7 = cl.b((IPlayerContext)this.a, this.c) || bl2;
        BetterBlockPos betterBlockPos = this.a.playerFeet();
        if (betterBlockPos.q() != this.b.q() && !bl2) {
            this.logDebug("Wrong Y coordinate");
            if (betterBlockPos.q() < this.b.q()) {
                return ((cn)object).a(Input.JUMP, true);
            }
            return object;
        }
        if (bl7) {
            if (betterBlockPos.equals((Object)this.b)) {
                cn cn2 = object;
                object = MovementStatus.SUCCESS;
                cn cn3 = cn2;
                cn2.a = object;
                return cn3;
            }
            if (((Boolean)baritone.a.a().overshootTraverse.value).booleanValue() && (betterBlockPos.equals(this.b.a((fq)this.getDirection())) || betterBlockPos.equals(this.b.a((fq)this.getDirection()).a((fq)this.getDirection())))) {
                Object object3 = object;
                object = MovementStatus.SUCCESS;
                Object object4 = object3;
                ((cn)object3).a = object;
                return object4;
            }
            awt2 = fn.a((IPlayerContext)this.a, (et)this.a).u();
            aow aow3 = fn.a((IPlayerContext)this.a, this.a.up()).u();
            if (this.a.player().q > (double)this.a.b + 0.1 && !this.a.player().z && (awt2 == aox.bn || awt2 == aox.au || aow3 == aox.bn || aow3 == aox.au)) {
                return object;
            }
            et et2 = this.b.b((fq)this.a).a((fq)this.b);
            awt2 = fn.a((IPlayerContext)this.a, et2).u();
            aow aow4 = fn.a((IPlayerContext)this.a, et2.a()).u();
            if (!(!this.a || cl.e((IPlayerContext)this.a, betterBlockPos) && !((Boolean)baritone.a.a().sprintInWater.value).booleanValue() || cl.a((aow)awt2) && !cl.b((aow)awt2) || cl.a(aow4))) {
                ((cn)object).a(Input.SPRINT, true);
            }
            awt awt3 = fn.a((IPlayerContext)this.a, this.b.down());
            BetterBlockPos betterBlockPos2 = this.a[0];
            if (betterBlockPos.q() != this.b.q() && bl2 && (awt3.u() == aox.bn || awt3.u() == aox.au) && (betterBlockPos2 = awt3.u() == aox.bn ? ds.a(new cj((IBaritone)this.a), this.b.down()) : this.b.offset(((fa)awt3.c((axj)arq.a)).d())) == null) {
                this.logDirect("Unable to climb vines. Consider disabling allowVines.");
                Object object5 = object;
                object = MovementStatus.UNREACHABLE;
                Object object6 = object5;
                ((cn)object5).a = object;
                return object6;
            }
            cl.a((IPlayerContext)this.a, (cn)object, (et)betterBlockPos2);
            return object;
        }
        this.a = false;
        awt2 = fn.a((IPlayerContext)this.a, betterBlockPos.b()).u();
        if ((awt2.equals(aox.aW) || awt2 instanceof arf) && Math.max(Math.abs((double)this.b.p() + 0.5 - this.a.player().p), Math.abs((double)this.b.r() + 0.5 - this.a.player().r)) < 0.85) {
            cl.a((IPlayerContext)this.a, (cn)object, (et)this.b);
            return ((cn)object).a(Input.MOVE_FORWARD, false).a(Input.MOVE_BACK, true);
        }
        double d2 = Math.max(Math.abs(this.a.player().p - ((double)this.b.p() + 0.5)), Math.abs(this.a.player().r - ((double)this.b.r() + 0.5)));
        int n2 = cl.a((cn)object, (IBaritone)this.a, this.b.down(), false, true);
        if ((n2 == cm.a || d2 < 0.6) && !((Boolean)baritone.a.a().assumeSafeWalk.value).booleanValue()) {
            ((cn)object).a(Input.SNEAK, true);
        }
        switch (du.a[n2 - 1]) {
            case 1: {
                if (this.a.player().aU() || ((Boolean)baritone.a.a().assumeSafeWalk.value).booleanValue()) {
                    ((cn)object).a(Input.CLICK_RIGHT, true);
                }
                return object;
            }
            case 2: {
                if (d2 > 0.83) {
                    float f4 = RotationUtils.calcRotationFromVec3d(this.a.playerHead(), VecUtils.getBlockPosCenter(this.b), this.a.playerRotations()).getYaw();
                    if ((double)Math.abs(((cn)object).a.a.getYaw() - f4) < 0.1) {
                        return ((cn)object).a(Input.MOVE_FORWARD, true);
                    }
                } else if (this.a.playerRotations().isReallyCloseTo(((cn)object).a.a)) {
                    return ((cn)object).a(Input.CLICK_LEFT, true);
                }
                return object;
            }
        }
        if (betterBlockPos.equals((Object)this.b)) {
            double d3 = ((double)(this.b.p() + this.a.p()) + 1.0) * 0.5;
            double d4 = ((double)(this.b.q() + this.a.q()) - 1.0) * 0.5;
            double d5 = ((double)(this.b.r() + this.a.r()) + 1.0) * 0.5;
            BetterBlockPos betterBlockPos3 = this.a.down();
            object2 = RotationUtils.calcRotationFromVec3d(this.a.playerHead(), new bhe(d3, d4, d5), this.a.playerRotations());
            float f5 = object2.getPitch();
            if (Math.max(Math.abs(this.a.player().p - d3), Math.abs(this.a.player().r - d5)) < 0.29) {
                float f6 = RotationUtils.calcRotationFromVec3d(VecUtils.getBlockPosCenter(this.b), this.a.playerHead(), this.a.playerRotations()).getYaw();
                ((cn)object).a(new co(new Rotation(f6, f5), true));
                ((cn)object).a(Input.MOVE_BACK, true);
            } else {
                ((cn)object).a(new co((Rotation)object2, true));
            }
            if (this.a.isLookingAt(betterBlockPos3)) {
                return ((cn)object).a(Input.CLICK_RIGHT, true);
            }
            if (this.a.playerRotations().isReallyCloseTo(((cn)object).a.a)) {
                ((cn)object).a(Input.CLICK_LEFT, true);
            }
            return object;
        }
        cl.a((IPlayerContext)this.a, (cn)object, (et)this.a[0]);
        return object;
    }

    @Override
    public final boolean b(cn cn2) {
        return cn2.a != MovementStatus.RUNNING || cl.b((IPlayerContext)this.a, this.b.down());
    }

    @Override
    public final boolean a(cn cn2) {
        aow aow2;
        if ((this.a.playerFeet().equals(this.a) || this.a.playerFeet().equals((Object)this.a.down())) && ((aow2 = fn.a((IPlayerContext)this.a, this.a.down())) == aox.au || aow2 == aox.bn)) {
            cn2.a(Input.SNEAK, true);
        }
        return super.a(cn2);
    }
}

