/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  aox
 *  aqm
 *  awt
 *  bhe
 *  bud
 *  et
 *  fq
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.Rotation;
import baritone.api.utils.RotationUtils;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cn;
import baritone.co;
import baritone.fn;
import baritone.gj;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class dn
extends ck {
    private int a = 0;

    public dn(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2.up(2), betterBlockPos2.up(), betterBlockPos2}, betterBlockPos2.down());
    }

    @Override
    public final void reset() {
        super.reset();
        this.a = 0;
    }

    @Override
    public final double a(cj cj2) {
        gj gj2 = new gj();
        dn.a(cj2, this.a.a, this.a.b, this.a.c, this.b.a, this.b.c, gj2);
        if (gj2.b != this.b.b) {
            return 1000000.0;
        }
        return gj2.a;
    }

    @Override
    public final Set<BetterBlockPos> a() {
        return ImmutableSet.of(this.a, this.b.up(), this.b);
    }

    public static void a(cj cj2, int n2, int n3, int n4, int n5, int n6, gj gj2) {
        double d2;
        double d3;
        double d4;
        awt awt2 = cj2.a(n5, n3 - 1, n6);
        double d5 = 0.0 + cl.a(cj2, n5, n3 - 1, n6, awt2, false);
        if (d4 >= 1000000.0) {
            return;
        }
        d5 += cl.a(cj2, n5, n3, n6, false);
        if (d3 >= 1000000.0) {
            return;
        }
        d5 += cl.a(cj2, n5, n3 + 1, n6, true);
        if (d2 >= 1000000.0) {
            return;
        }
        aow aow2 = cj2.a(n2, n3 - 1, n4).u();
        if (aow2 == aox.au || aow2 == aox.bn) {
            return;
        }
        awt awt3 = cj2.a(n5, n3 - 2, n6);
        if (!cl.c(cj2.a, n5, n3 - 2, n6, awt3)) {
            dn.a(cj2, n3, n5, n6, d5, awt3, gj2);
            return;
        }
        if (awt2.u() == aox.au || awt2.u() == aox.bn) {
            return;
        }
        double d6 = 3.7062775075283763;
        if (aow2 == aox.aW) {
            d6 = 7.4125550150567525;
        }
        gj2.a = n5;
        gj2.b = n3 - 1;
        gj2.c = n6;
        gj2.a = d5 += d6 + Math.max(FALL_N_BLOCKS_COST[1], 0.9265693768820937);
    }

    public static boolean a(cj cj2, int n2, int n3, int n4, double d2, awt awt2, gj gj2) {
        if (d2 != 0.0 && cj2.a(n3, n2 + 2, n4).u() instanceof aqm) {
            return false;
        }
        if (!cl.b(cj2.a, n3, n2 - 2, n4, awt2)) {
            return false;
        }
        double d3 = 0.0;
        int n5 = n2;
        int n6 = 3;
        int n7;
        while ((n7 = n2 - n6) >= 0) {
            awt awt3 = cj2.a(n3, n7, n4);
            int n8 = n6 - (n2 - n5);
            double d4 = 3.7062775075283763 + FALL_N_BLOCKS_COST[n8] + d2 + d3;
            if (cl.b(awt3.u())) {
                if (!cl.b(cj2.a, n3, n7, n4, awt3)) {
                    return false;
                }
                if (cj2.j) {
                    return false;
                }
                if (cl.a(n3, n7, n4, awt3, cj2.a)) {
                    return false;
                }
                if (!cl.b(cj2.a, n3, n7 - 1, n4)) {
                    return false;
                }
                gj2.a = n3;
                gj2.b = n7;
                gj2.c = n4;
                gj2.a = d4;
                return false;
            }
            if (n8 <= 11 && (awt3.u() == aox.bn || awt3.u() == aox.au)) {
                d3 = d3 + FALL_N_BLOCKS_COST[n8 - 1] + 6.666666666666667;
                n5 = n7;
            } else if (!cl.b(cj2.a, n3, n7, n4, awt3)) {
                if (!cl.c(cj2.a, n3, n7, n4, awt3)) {
                    return false;
                }
                if (cl.a(awt3)) {
                    return false;
                }
                if (n8 <= cj2.a + 1) {
                    gj2.a = n3;
                    gj2.b = n7 + 1;
                    gj2.c = n4;
                    gj2.a = d4;
                    return false;
                }
                if (cj2.b && n8 <= cj2.b + 1) {
                    gj2.a = n3;
                    gj2.b = n7 + 1;
                    gj2.c = n4;
                    gj2.a = d4 + cj2.a();
                    return true;
                }
                return false;
            }
            ++n6;
        }
        return false;
    }

    @Override
    public final cn a(cn object) {
        super.a((cn)object);
        if (((cn)object).a != MovementStatus.RUNNING) {
            return object;
        }
        Object object2 = this.a.playerFeet();
        et et2 = new et((this.b.p() << 1) - this.a.p(), this.b.q(), (this.b.r() << 1) - this.a.r());
        if ((object2.equals((Object)this.b) || object2.equals(et2)) && (cl.e((IPlayerContext)this.a, this.b) || this.a.player().q - (double)this.b.q() < 0.5)) {
            cn cn2 = object;
            object = MovementStatus.SUCCESS;
            object2 = cn2;
            cn2.a = object;
            return object2;
        }
        if (this.b()) {
            double d2 = ((double)this.a.p() + 0.5) * 0.17 + ((double)this.b.p() + 0.5) * 0.83;
            double d3 = ((double)this.a.r() + 0.5) * 0.17 + ((double)this.b.r() + 0.5) * 0.83;
            bud bud2 = this.a.player();
            ((cn)object).a(new co(new Rotation(RotationUtils.calcRotationFromVec3d(this.a.playerHead(), new bhe(d2, (double)this.b.q(), d3), new Rotation(bud2.v, bud2.w)).getYaw(), bud2.w), false)).a(Input.MOVE_FORWARD, true);
            return object;
        }
        double d4 = this.a.player().p - ((double)this.b.p() + 0.5);
        double d5 = this.a.player().r - ((double)this.b.r() + 0.5);
        double d6 = d4;
        double d7 = d5;
        double d8 = Math.sqrt(d6 * d6 + d7 * d7);
        double d9 = this.a.player().p - ((double)this.a.p() + 0.5);
        double d10 = this.a.player().r - ((double)this.a.r() + 0.5);
        double d11 = d9;
        double d12 = d10;
        double d13 = Math.sqrt(d11 * d11 + d12 * d12);
        if (!object2.equals((Object)this.b) || d8 > 0.25) {
            if (this.a++ < 20 && d13 < 1.25) {
                cl.a((IPlayerContext)this.a, (cn)object, et2);
            } else {
                cl.a((IPlayerContext)this.a, (cn)object, (et)this.b);
            }
        }
        return object;
    }

    public final boolean b() {
        et et2 = this.b.b((fq)this.a.down()).a((fq)this.b);
        if (this.c()) {
            return true;
        }
        for (int i2 = 0; i2 <= 2; ++i2) {
            if (!cl.a(fn.a((IPlayerContext)this.a, et2.b(i2)))) continue;
            return true;
        }
        return false;
    }

    public final boolean c() {
        et et2 = this.b.b((fq)this.a.down()).a((fq)this.b);
        return !cl.a((IPlayerContext)this.a, new BetterBlockPos(et2)) && cl.a((IPlayerContext)this.a, new BetterBlockPos(et2).up()) && cl.a((IPlayerContext)this.a, new BetterBlockPos(et2).up(2));
    }
}

