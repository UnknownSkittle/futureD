/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bhe
 *  et
 *  fq
 *  rr
 *  vg
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.calc.IPath;
import baritone.api.pathing.movement.IMovement;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.pathing.path.IPathExecutor;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.Helper;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.VecUtils;
import baritone.api.utils.input.Input;
import baritone.ch;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.dm;
import baritone.dn;
import baritone.do;
import baritone.dq;
import baritone.dt;
import baritone.dv;
import baritone.dx;
import baritone.fn;
import baritone.j;
import java.util.HashSet;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dw
implements IPathExecutor,
Helper {
    public final IPath a;
    public int a;
    private int b;
    private int c;
    private Double a;
    private Integer a;
    public boolean a;
    private boolean c;
    public HashSet<et> a;
    public HashSet<et> b;
    public HashSet<et> c = true;
    private j a;
    public IPlayerContext a = new HashSet();
    public boolean b = (int)new HashSet();

    public dw(j j2, IPath iPath) {
        this.c = (int)new HashSet();
        this.a = j2;
        this.a = j2.a;
        this.a = iPath;
        this.a = 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean a() {
        block48: {
            block50: {
                block54: {
                    block53: {
                        block52: {
                            block51: {
                                block49: {
                                    block46: {
                                        block47: {
                                            if (this.a == this.a.length() - 1) {
                                                ++this.a;
                                            }
                                            if (this.a >= this.a.length()) {
                                                return true;
                                            }
                                            var1_1 = (rr<bhe, et>)this.a.movements().get(this.a);
                                            var2_2 = this.a.playerFeet();
                                            if (!var1_1.b().contains(var2_2)) {
                                                for (var3_4 = 0; var3_4 < this.a && var3_4 < this.a.length(); ++var3_4) {
                                                    if (!((ck)this.a.movements().get(var3_4)).b().contains(var2_2)) continue;
                                                    var2_3 = this.a;
                                                    for (var3_4 = this.a = var3_4; var3_4 <= var2_3; ++var3_4) {
                                                        this.a.movements().get(var3_4).reset();
                                                    }
                                                    this.b();
                                                    this.a();
                                                    return false;
                                                }
                                                for (var3_4 = this.a + 3; var3_4 < this.a.length() - 1; ++var3_4) {
                                                    if (!((ck)this.a.movements().get(var3_4)).b().contains(var2_2)) continue;
                                                    if (var3_4 - this.a > 2) {
                                                        this.logDebug("Skipping forward " + (var3_4 - this.a) + " steps, to " + var3_4);
                                                    }
                                                    this.a = var3_4 - 1;
                                                    this.b();
                                                    this.a();
                                                    return false;
                                                }
                                            }
                                            v0 = this;
                                            var3_5 = v0.a(v0.a);
                                            if (this.a(var3_5, 2.0)) {
                                                ++this.b;
                                                System.out.println("FAR AWAY FROM PATH FOR " + this.b + " TICKS. Current distance: " + var3_5.a() + ". Threshold: 2.0");
                                                if ((double)this.b > 200.0) {
                                                    this.logDebug("Too far away from path for too long, cancelling path");
                                                    this.c();
                                                    return false;
                                                }
                                            } else {
                                                this.b = 0;
                                            }
                                            if (this.a(var3_5, 3.0)) {
                                                this.logDebug("too far from path");
                                                this.c();
                                                return false;
                                            }
                                            var2_2 = new fn(this.a);
                                            for (var3_6 = this.a - 10; var3_6 < this.a + 10; ++var3_6) {
                                                if (var3_6 < 0 || var3_6 >= this.a.movements().size()) continue;
                                                var6_17 = (ck)this.a.movements().get(var3_6);
                                                var7_22 = var6_17.a((fn)var2_2);
                                                var4_10 = var6_17.b((fn)var2_2);
                                                var5_16 = var6_17.c((fn)var2_2);
                                                var6_17.resetBlockCache();
                                                if (!var7_22.equals(var6_17.a((fn)var2_2))) {
                                                    this.c = true;
                                                }
                                                if (!var4_10.equals(var6_17.b((fn)var2_2))) {
                                                    this.c = true;
                                                }
                                                if (var5_16.equals(var6_17.c((fn)var2_2))) continue;
                                                this.c = true;
                                            }
                                            if (this.c) {
                                                var3_7 = new HashSet<et>();
                                                var6_17 = new HashSet<E>();
                                                var7_22 = new HashSet<E>();
                                                for (var4_11 = this.a; var4_11 < this.a.movements().size(); ++var4_11) {
                                                    var5_16 = (ck)this.a.movements().get(var4_11);
                                                    var3_7.addAll(var5_16.a((fn)var2_2));
                                                    var6_17.addAll(var5_16.b((fn)var2_2));
                                                    var7_22.addAll(var5_16.c((fn)var2_2));
                                                }
                                                this.a = var3_7;
                                                this.b = (int)var6_17;
                                                this.c = (int)var7_22;
                                                this.c = false;
                                            }
                                            if (this.a < this.a.movements().size() - 1) {
                                                var3_8 = this.a.movements().get(this.a + 1);
                                                if (!this.a.a.a.a(var3_8.getDest().a, var3_8.getDest().c)) {
                                                    this.logDebug("Pausing since destination is at edge of loaded chunks");
                                                    this.a();
                                                    return true;
                                                }
                                            }
                                            var3_9 = var1_1.safeToCancel();
                                            if (this.a == null || this.a != this.a) {
                                                this.a = this.a;
                                                this.a = var1_1.getCost();
                                                for (var6_18 = 1; var6_18 < (Integer)baritone.a.a().costVerificationLookahead.value && this.a + var6_18 < this.a.length() - 1; ++var6_18) {
                                                    if (!(((ck)this.a.movements().get(this.a + var6_18)).a(this.a.a) >= 1000000.0) || !var3_9) continue;
                                                    this.logDebug("Something has changed in the world and a future movement has become impossible. Cancelling.");
                                                    this.c();
                                                    return true;
                                                }
                                            }
                                            var4_12 /* !! */  = this.a.a;
                                            var2_2 = var1_1;
                                            var1_1.a = null;
                                            var5_16 = var4_12 /* !! */ ;
                                            var4_12 /* !! */  = var2_2;
                                            if (var4_12 /* !! */ .a == null) {
                                                var4_12 /* !! */ .a = var4_12 /* !! */ .a((cj)var5_16);
                                            }
                                            var6_19 = var4_12 /* !! */ .a;
                                            if (v1 >= 1000000.0 && var3_9) {
                                                this.logDebug("Something has changed in the world and this movement has become impossible. Cancelling.");
                                                this.c();
                                                return true;
                                            }
                                            if (!var1_1.calculatedWhileLoaded() && var6_19 - this.a > (Double)baritone.a.a().maxCostIncrease.value && var3_9) {
                                                this.logDebug("Original cost " + this.a + " current cost " + var6_19 + ". Cancelling.");
                                                this.c();
                                                return true;
                                            }
                                            var2_2 = this;
                                            var4_12 /* !! */  = var2_2.a.getInProgress();
                                            if (var4_12 /* !! */ .isPresent() == false ? false : (var2_2.a.player().z == false ? false : (cl.b(var2_2.a, var2_2.a.playerFeet().down()) == false ? false : (cl.a(var2_2.a, var2_2.a.playerFeet()) == false || cl.a(var2_2.a, var2_2.a.playerFeet().up()) == false ? false : (var2_2.a.movements().get(var2_2.a).safeToCancel() == false ? false : ((var4_12 /* !! */  = ((ch)var4_12 /* !! */ .get()).bestPathSoFar()).isPresent() == false ? false : ((var4_12 /* !! */  = ((IPath)var4_12 /* !! */ .get()).positions()).size() < 3 ? false : var4_12 /* !! */ .subList(1, var4_12 /* !! */ .size()).contains((Object)var2_2.a.playerFeet())))))))) {
                                                this.logDebug("Pausing since current best path is a backtrack");
                                                this.a();
                                                return true;
                                            }
                                            var4_12 /* !! */  = var1_1.update();
                                            if (var4_12 /* !! */  == MovementStatus.UNREACHABLE || var4_12 /* !! */  == MovementStatus.FAILED) {
                                                this.logDebug("Movement returns status ".concat(String.valueOf(var4_12 /* !! */ )));
                                                this.c();
                                                return true;
                                            }
                                            if (var4_12 /* !! */  == MovementStatus.SUCCESS) {
                                                ++this.a;
                                                this.b();
                                                this.a();
                                                return true;
                                            }
                                            var2_2 = this;
                                            var4_13 = var2_2.a.a.a.isInputForcedDown(Input.SPRINT);
                                            var2_2.a.a.a.setInputForceState(Input.SPRINT, false);
                                            if (!new cj((IBaritone)var2_2.a.a).d) ** GOTO lbl-1000
                                            var5_16 = var2_2.a.movements().get(var2_2.a);
                                            if (!(var5_16 instanceof dt) || var2_2.a >= var2_2.a.length() - 3 || !((var1_1 = var2_2.a.movements().get(var2_2.a + 1)) instanceof dm) || !dw.a(var2_2.a, (dt)var5_16, (dm)var1_1, var2_2.a.movements().get(var2_2.a + 2))) break block46;
                                            var6_20 = var5_16;
                                            var1_1 = var2_2.a;
                                            if (Math.abs((double)var6_20.getDirection().p() * ((double)var6_20.getSrc().c + 0.5 - var1_1.player().r)) + Math.abs((double)var6_20.getDirection().r() * ((double)var6_20.getSrc().a + 0.5 - var1_1.player().p)) > 0.1) ** GOTO lbl-1000
                                            var7_22 = var6_20.getSrc().b((fq)var6_20.getDirection()).b(2);
                                            if (cl.a((IPlayerContext)var1_1, (et)var7_22)) {
                                                v2 = true;
                                            } else if (Math.abs((double)var6_20.getDirection().p() * ((double)var7_22.p() + 0.5 - var1_1.player().p)) + Math.abs((double)var6_20.getDirection().r() * ((double)var7_22.r() + 0.5 - var1_1.player().r)) > 0.8) {
                                                v2 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v2 = false;
                                            }
                                            if (!v2) break block47;
                                            var2_2.logDebug("Skipping traverse to straight ascend");
                                            ++var2_2.a;
                                            super.b();
                                            var2_2.a();
                                            var2_2.a.a.a.setInputForceState(Input.JUMP, true);
                                            v3 = true;
                                            break block48;
                                        }
                                        var2_2.logDebug("Too far to the side to safely sprint ascend");
                                    }
                                    if (!var4_13) break block49;
                                    v3 = true;
                                    break block48;
                                }
                                if (!(var5_16 instanceof dn)) break block50;
                                if (!((dn)var5_16).b() || ((dn)var5_16).c()) break block51;
                                var2_2.logDebug("Sprinting would be unsafe");
                                ** GOTO lbl-1000
                            }
                            if (var2_2.a >= var2_2.a.length() - 2) break block50;
                            var1_1 = var2_2.a.movements().get(var2_2.a + 1);
                            if (!(var1_1 instanceof dm) || !var5_16.getDirection().a().equals((Object)var1_1.getDirection().b())) break block52;
                            ++var2_2.a;
                            super.b();
                            var2_2.a();
                            var2_2.logDebug("Skipping descend to straight ascend");
                            v3 = true;
                            break block48;
                        }
                        var7_22 = var1_1;
                        var6_21 = var5_16;
                        var1_1 = var2_2.a;
                        if (!(var7_22 instanceof dn) || !var7_22.getDirection().equals((Object)var6_21.getDirection())) break block53;
                        v4 = true;
                        break block54;
                    }
                    if (!cl.b((IPlayerContext)var1_1, var6_21.getDest().a((fq)var6_21.getDirection()))) ** GOTO lbl-1000
                    if (var7_22 instanceof dt && var7_22.getDirection().b().equals((Object)var6_21.getDirection())) {
                        v4 = true;
                    } else if (var7_22 instanceof do && ((Boolean)baritone.a.a().allowOvershootDiagonalDescend.value).booleanValue()) {
                        v4 = true;
                    } else lbl-1000:
                    // 2 sources

                    {
                        v4 = false;
                    }
                }
                if (!v4) break block50;
                if (var2_2.a.playerFeet().equals((Object)var5_16.getDest())) {
                    ++var2_2.a;
                    super.b();
                    var2_2.a();
                }
                v3 = true;
                break block48;
            }
            if (!(var5_16 instanceof dm) || var2_2.a == 0) ** GOTO lbl-1000
            var1_1 = var2_2.a.movements().get(var2_2.a - 1);
            if (var1_1 instanceof dn && var1_1.getDirection().a().equals((Object)var5_16.getDirection().b()) && var2_2.a.player().q >= (double)(var4_14 = var5_16.getSrc().up()).q() - 0.07) {
                var2_2.a.a.a.setInputForceState(Input.JUMP, false);
                v3 = true;
            } else if (var2_2.a < var2_2.a.length() - 2 && var1_1 instanceof dt && dw.a(var2_2.a, (dt)var1_1, (dm)var5_16, var2_2.a.movements().get(var2_2.a + 1))) {
                v3 = true;
            } else if (var5_16 instanceof dq && (var1_1 = super.a((dq)var5_16)) != null) {
                var4_15 = new BetterBlockPos((et)var1_1.b());
                if (!var2_2.a.positions().contains((Object)var4_15)) {
                    throw new IllegalStateException();
                }
                if (var2_2.a.playerFeet().equals((Object)var4_15)) {
                    var2_2.a = var2_2.a.positions().indexOf((Object)var4_15);
                    super.b();
                    var2_2.a();
                    v3 = true;
                } else {
                    var2_2.a();
                    var2_2.a.a.a.updateTarget(RotationUtils.calcRotationFromVec3d(var2_2.a.playerHead(), (bhe)var1_1.a(), var2_2.a.playerRotations()), false);
                    var2_2.a.a.a.setInputForceState(Input.MOVE_FORWARD, true);
                    v3 = true;
                }
            } else lbl-1000:
            // 3 sources

            {
                v3 = var2_2.b = false;
            }
        }
        if (!this.b) {
            this.a.player().f(false);
        }
        ++this.c;
        if ((double)this.c > this.a + (double)((Integer)baritone.a.a().movementTimeoutTicks.value).intValue()) {
            this.logDebug("This movement has taken too long (" + this.c + " ticks, expected " + this.a + "). Cancelling.");
            this.c();
            return true;
        }
        return var3_9;
    }

    private rr<Double, et> a(IPath object) {
        double d2 = -1.0;
        et et2 = null;
        object = object.movements().iterator();
        while (object.hasNext()) {
            for (et et3 : ((ck)object.next()).b()) {
                double d3 = VecUtils.entityDistanceToCenter((vg)this.a.player(), et3);
                if (!(d3 < d2) && d2 != -1.0) continue;
                d2 = d3;
                et2 = et3;
            }
        }
        return new rr((Object)d2, et2);
    }

    private boolean a(rr<Double, et> et2, double d2) {
        if ((Double)et2.a() > d2) {
            if (this.a.movements().get(this.a) instanceof dq) {
                et2 = this.a.positions().get(this.a + 1);
                return VecUtils.entityFlatDistanceToCenter((vg)this.a.player(), et2) >= d2;
            }
            return true;
        }
        return false;
    }

    private rr<bhe, et> a(dq dq2) {
        IMovement iMovement;
        int n2;
        et et2 = dq2.getDirection();
        if (et2.q() < -3) {
            return null;
        }
        if (!dq2.a.isEmpty()) {
            return null;
        }
        et2 = new fq(et2.p(), 0, et2.r());
        block0: for (n2 = this.a + 1; n2 < this.a.length() - 1 && n2 < this.a + 3 && (iMovement = this.a.movements().get(n2)) instanceof dt && et2.equals((Object)iMovement.getDirection()); ++n2) {
            for (int i2 = iMovement.getDest().b; i2 <= dq2.getSrc().b + 1; ++i2) {
                et et3 = new et(iMovement.getDest().a, i2, iMovement.getDest().c);
                if (!cl.a(this.a, et3)) break block0;
            }
            if (!cl.b(this.a, iMovement.getDest().down())) break;
        }
        if (--n2 == this.a) {
            return null;
        }
        double d2 = (double)(n2 - this.a) - 0.4;
        return new rr((Object)new bhe((double)et2.p() * d2 + (double)dq2.getDest().a + 0.5, (double)dq2.getDest().b, (double)et2.r() * d2 + (double)dq2.getDest().c + 0.5), (Object)dq2.getDest().a(et2.p() * (n2 - this.a), 0, et2.r() * (n2 - this.a)));
    }

    private static boolean a(IPlayerContext iPlayerContext, dt dt2, dm dm2, IMovement iMovement) {
        if (!((Boolean)baritone.a.a().sprintAscends.value).booleanValue()) {
            return false;
        }
        if (!dt2.getDirection().equals((Object)dm2.getDirection().b())) {
            return false;
        }
        if (iMovement.getDirection().p() != dm2.getDirection().p() || iMovement.getDirection().r() != dm2.getDirection().r()) {
            return false;
        }
        if (!cl.b(iPlayerContext, dt2.getDest().down())) {
            return false;
        }
        if (!cl.b(iPlayerContext, dm2.getDest().down())) {
            return false;
        }
        if (!dm2.a.isEmpty()) {
            return false;
        }
        for (int i2 = 0; i2 < 2; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                BetterBlockPos betterBlockPos = dt2.getSrc().up(i3);
                if (i2 == 1) {
                    betterBlockPos = betterBlockPos.a((fq)dt2.getDirection());
                }
                if (cl.a(iPlayerContext, (et)betterBlockPos)) continue;
                return false;
            }
        }
        if (cl.a(iPlayerContext.world().o((et)dt2.getSrc().up(3)).u())) {
            return false;
        }
        return !cl.a(iPlayerContext.world().o((et)dm2.getDest().up(2)).u());
    }

    private void b() {
        this.a();
        this.c = 0;
    }

    public final void a() {
        ((a)((Object)this.a.a)).a.clearAllKeys();
    }

    private void c() {
        this.a();
        ((a)((Object)this.a.a)).a.a.a();
        this.a = this.a.length() + 3;
        this.a = true;
    }

    @Override
    public final int getPosition() {
        return this.a;
    }

    public final dw a(dw dw2) {
        if (dw2 == null) {
            return this.a();
        }
        return dx.a(this.a, dw2.a).map(dx2 -> {
            if (!dx2.getDest().equals((Object)dw2.getPath().getDest())) {
                throw new IllegalStateException();
            }
            dw2 = new dw(this.a, (IPath)dx2);
            new dw(this.a, (IPath)dx2).a = this.a;
            dw2.a = this.a;
            dw2.a = this.a;
            dw2.c = this.c;
            return dw2;
        }).orElseGet(this::a);
    }

    private dw a() {
        if (this.a > (Integer)baritone.a.a().maxPathHistoryLength.value) {
            int n2 = (Integer)baritone.a.a().pathHistoryCutoffAmount.value;
            IPath iPath = this.a;
            Object object = new dv(iPath, n2, iPath.length() - 1);
            if (!object.getDest().equals((Object)this.a.getDest())) {
                throw new IllegalStateException();
            }
            this.logDebug("Discarding earliest segment movements, length cut from " + this.a.length() + " to " + object.length());
            object = new dw(this.a, (IPath)object);
            v1.a = this.a - n2;
            ((dw)object).a = this.a;
            if (this.a != null) {
                ((dw)object).a = this.a - n2;
            }
            ((dw)object).c = this.c;
            return object;
        }
        return this;
    }

    @Override
    public final IPath getPath() {
        return this.a;
    }

    public final boolean b() {
        return this.a >= this.a.length();
    }
}

