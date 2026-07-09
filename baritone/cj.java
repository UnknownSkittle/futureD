/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aec
 *  aip
 *  air
 *  alm
 *  amu
 *  aow
 *  awt
 *  bud
 *  et
 *  vp
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.fn;
import baritone.fs;
import baritone.fz;
import baritone.u;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cj {
    private static final aip a = new aip(air.aA);
    public final boolean a;
    public final IBaritone a;
    public final amu a;
    public final u a;
    public final fn a;
    public final fz a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    protected final double a;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int a;
    public final int b;
    public final double b;
    public final double c;
    public double d;
    public double e;
    public final double f;
    public final fs a;

    public cj(IBaritone iBaritone) {
        this(iBaritone, false);
    }

    public cj(IBaritone iBaritone, boolean bl2) {
        this.a = bl2;
        this.a = iBaritone;
        bud bud2 = iBaritone.getPlayerContext().player();
        this.a = iBaritone.getPlayerContext().world();
        this.a = (u)iBaritone.getWorldProvider().getCurrentWorld();
        this.a = new fn(this.a, this.a, bl2);
        this.a = new fz(bud2);
        this.c = (Boolean)baritone.a.a().allowPlace.value != false && ((a)iBaritone).a.a();
        this.b = (Boolean)baritone.a.a().allowWaterBucketFall.value != false && aec.e((int)bud2.bv.b(a)) && !this.a.s.n();
        this.d = (Boolean)baritone.a.a().allowSprint.value != false && bud2.di().a() > 6;
        this.a = (Double)baritone.a.a().blockPlacementPenalty.value;
        this.e = (Boolean)baritone.a.a().allowBreak.value;
        this.f = (Boolean)baritone.a.a().allowParkour.value;
        this.g = (Boolean)baritone.a.a().allowParkourPlace.value;
        this.h = (Boolean)baritone.a.a().allowJumpAt256.value;
        this.i = (Boolean)baritone.a.a().allowParkourAscend.value;
        this.j = (Boolean)baritone.a.a().assumeWalkOnWater.value;
        this.k = (Boolean)baritone.a.a().allowDiagonalDescend.value;
        this.l = (Boolean)baritone.a.a().allowDiagonalAscend.value;
        this.m = (Boolean)baritone.a.a().allowDownward.value;
        this.a = (Integer)baritone.a.a().maxFallHeightNoWater.value;
        this.b = (Integer)baritone.a.a().maxFallHeightBucket.value;
        int n2 = alm.e((vp)bud2);
        if (n2 > 3) {
            n2 = 3;
        }
        float f2 = (float)n2 / 3.0f;
        this.b = 9.09090909090909 * (double)(1.0f - f2) + 4.63284688441047 * (double)f2;
        this.c = (Double)baritone.a.a().blockBreakAdditionalPenalty.value;
        this.d = (Double)baritone.a.a().backtrackCostFavoringCoefficient.value;
        this.e = (Double)baritone.a.a().jumpPenalty.value;
        this.f = (Double)baritone.a.a().walkOnWaterOnePenalty.value;
        this.a = new fs(this.a.al());
    }

    public final awt a(int n2, int n3, int n4) {
        return this.a.a(n2, n3, n4);
    }

    public final awt a(et et2) {
        return this.a(et2.p(), et2.q(), et2.r());
    }

    public final aow a(int n2, int n3, int n4) {
        return this.a(n2, n3, n4).u();
    }

    public double a(int n2, int n3, int n4, awt awt2) {
        if (!this.c) {
            return 1000000.0;
        }
        if (!this.a.b(n2, n4)) {
            return 1000000.0;
        }
        return this.a;
    }

    public double b(int n2, int n3, int n4, awt awt2) {
        if (!this.e) {
            return 1000000.0;
        }
        return 1.0;
    }

    public final double a() {
        return this.a;
    }
}

