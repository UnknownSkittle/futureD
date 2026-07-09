/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aox
 *  aru
 *  aud
 *  awt
 *  et
 *  fa
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cm;
import baritone.cn;
import baritone.fn;
import baritone.gj;
import java.util.HashSet;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class dr
extends ck {
    private static final BetterBlockPos[] b = new BetterBlockPos[0];
    private final fa a;
    private final int a;
    private final boolean a;

    private dr(IBaritone iBaritone, BetterBlockPos betterBlockPos, int n2, fa fa2, boolean bl2) {
        BetterBlockPos betterBlockPos2 = betterBlockPos;
        super(iBaritone, betterBlockPos2, betterBlockPos2.offset(fa2, n2).up(bl2 ? 1 : 0), b, betterBlockPos.offset(fa2, n2).down(bl2 ? 0 : 1));
        this.a = fa2;
        this.a = n2;
        this.a = bl2;
    }

    public static dr a(cj cj2, BetterBlockPos betterBlockPos, fa fa2) {
        gj gj2 = new gj();
        dr.a(cj2, betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, fa2, gj2);
        int n2 = Math.abs(gj2.a - betterBlockPos.a) + Math.abs(gj2.c - betterBlockPos.c);
        return new dr(cj2.a, betterBlockPos, n2, fa2, gj2.b > betterBlockPos.b);
    }

    public static void a(cj cj2, int n2, int n3, int n4, fa fa2, gj gj2) {
        double d2;
        int n5;
        int n6;
        int n7;
        if (!cj2.f) {
            return;
        }
        if (n3 == 256 && !cj2.h) {
            return;
        }
        int n8 = fa2.g();
        if (!cl.a(cj2, n2 + n8, n3, n4 + (n7 = fa2.i()))) {
            return;
        }
        awt awt2 = cj2.a(n2 + n8, n3 - 1, n4 + n7);
        if (cl.c(cj2.a, n2 + n8, n3 - 1, n4 + n7, awt2)) {
            return;
        }
        if (cl.a(awt2.u()) && awt2.u() != aox.j && awt2.u() != aox.i) {
            return;
        }
        if (!cl.a(cj2, n2 + n8, n3 + 1, n4 + n7)) {
            return;
        }
        if (!cl.a(cj2, n2 + n8, n3 + 2, n4 + n7)) {
            return;
        }
        if (!cl.a(cj2, n2, n3 + 2, n4)) {
            return;
        }
        awt2 = cj2.a(n2, n3 - 1, n4);
        if (awt2.u() == aox.bn || awt2.u() == aox.au || awt2.u() instanceof aud || cl.a(awt2) || awt2.u() instanceof aru) {
            return;
        }
        int n9 = awt2.u() == aox.aW ? 2 : (cj2.d ? 4 : 3);
        for (n6 = 2; n6 <= n9; ++n6) {
            n5 = n2 + n8 * n6;
            int n10 = n4 + n7 * n6;
            if (!cl.a(cj2, n5, n3 + 1, n10)) {
                return;
            }
            if (!cl.a(cj2, n5, n3 + 2, n10)) {
                return;
            }
            awt awt3 = cj2.a.a(n5, n3, n10);
            if (!cl.a(cj2.a.b, (et)cj2.a.a.c(n5, n3, n10), awt3)) {
                if (n6 <= 3 && cj2.i && cj2.d && cl.c(cj2.a, n5, n3, n10, awt3) && dr.d(cj2.a, n5 + n8, n3 + 1, n10 + n7)) {
                    gj2.a = n5;
                    gj2.b = n3 + 1;
                    gj2.c = n10;
                    gj2.a = (double)n6 * 3.563791874554526 + cj2.e;
                }
                return;
            }
            awt awt4 = cj2.a.a(n5, n3 - 1, n10);
            if (awt4.u() != aox.ak && cl.c(cj2.a, n5, n3 - 1, n10, awt4)) {
                if (dr.d(cj2.a, n5 + n8, n3, n10 + n7)) {
                    gj2.a = n5;
                    gj2.b = n3;
                    gj2.c = n10;
                    gj2.a = dr.a(n6) + cj2.e;
                }
                return;
            }
            if (cl.a(cj2, n5, n3 + 3, n10)) continue;
            return;
        }
        if (n9 != 4) {
            return;
        }
        if (!cj2.g) {
            return;
        }
        n6 = n2 + 4 * n8;
        n5 = n4 + 4 * n7;
        awt awt5 = cj2.a(n6, n3 - 1, n5);
        double d3 = cj2.a(n6, n3 - 1, n5, awt5);
        if (d2 >= 1000000.0) {
            return;
        }
        if (!cl.a(n6, n5, awt5, cj2.a)) {
            return;
        }
        if (!dr.d(cj2.a, n6 + n8, n3, n5 + n7)) {
            return;
        }
        for (n9 = 0; n9 < 5; ++n9) {
            int n11 = n6 + a[n9].g();
            int n12 = n3 - 1 + a[n9].h();
            int n13 = n5 + a[n9].i();
            if (n11 == n2 + n8 * 3 && n13 == n4 + n7 * 3 || !cl.c(cj2.a, n11, n12, n13)) continue;
            gj2.a = n6;
            gj2.b = n3;
            gj2.c = n5;
            gj2.a = dr.a(4) + d3 + cj2.e;
            return;
        }
    }

    private static boolean d(fn fn2, int n2, int n3, int n4) {
        return !cl.a(fn2.a(n2, n3, n4).u()) && !cl.a(fn2.a(n2, n3 + 1, n4).u());
    }

    private static double a(int n2) {
        switch (n2) {
            case 2: {
                return 9.26569376882094;
            }
            case 3: {
                return 13.89854065323141;
            }
            case 4: {
                return 14.255167498218103;
            }
        }
        throw new IllegalStateException("LOL ".concat(String.valueOf(n2)));
    }

    @Override
    public final double a(cj cj2) {
        gj gj2 = new gj();
        dr.a(cj2, this.a.a, this.a.b, this.a.c, this.a, gj2);
        if (gj2.a != this.b.a || gj2.b != this.b.b || gj2.c != this.b.c) {
            return 1000000.0;
        }
        return gj2.a;
    }

    @Override
    public final Set<BetterBlockPos> a() {
        HashSet<BetterBlockPos> hashSet = new HashSet<BetterBlockPos>();
        for (int i2 = 0; i2 <= this.a; ++i2) {
            for (int i3 = 0; i3 < 2; ++i3) {
                hashSet.add(this.a.offset(this.a, i2).up(i3));
            }
        }
        return hashSet;
    }

    @Override
    public final boolean b(cn cn2) {
        return cn2.a != MovementStatus.RUNNING;
    }

    @Override
    public final cn a(cn cn2) {
        super.a(cn2);
        if (cn2.a != MovementStatus.RUNNING) {
            return cn2;
        }
        if (this.a.playerFeet().b < this.a.b) {
            this.logDebug("sorry");
            MovementStatus movementStatus = MovementStatus.UNREACHABLE;
            cn cn3 = cn2;
            cn2.a = movementStatus;
            return cn3;
        }
        if (this.a >= 4 || this.a) {
            cn2.a(Input.SPRINT, true);
        }
        cl.a((IPlayerContext)this.a, cn2, (et)this.b);
        if (this.a.playerFeet().equals(this.b)) {
            Object object = fn.a((IPlayerContext)this.a, (et)this.b);
            if (object == aox.bn || object == aox.au) {
                MovementStatus movementStatus = MovementStatus.SUCCESS;
                object = cn2;
                cn2.a = movementStatus;
                return object;
            }
            if (this.a.player().q - (double)this.a.playerFeet().q() < 0.094) {
                cn2.a = MovementStatus.SUCCESS;
            }
        } else if (!this.a.playerFeet().equals(this.a)) {
            if (this.a.playerFeet().equals((Object)this.a.offset(this.a)) || this.a.player().q - (double)this.a.b > 1.0E-4) {
                if (!cl.b((IPlayerContext)this.a, this.b.down()) && !this.a.player().z && cl.a(cn2, (IBaritone)this.a, this.b.down(), true, false) == cm.a) {
                    cn2.a(Input.CLICK_RIGHT, true);
                }
                if (this.a == 3 && !this.a) {
                    double d2 = (double)this.a.a + 0.5 - this.a.player().p;
                    double d3 = (double)this.a.c + 0.5 - this.a.player().r;
                    if (Math.max(Math.abs(d2), Math.abs(d3)) < 0.7) {
                        return cn2;
                    }
                }
                cn2.a(Input.JUMP, true);
            } else if (!this.a.playerFeet().equals((Object)this.b.offset(this.a, -1))) {
                cn2.a(Input.SPRINT, false);
                if (this.a.playerFeet().equals((Object)this.a.offset(this.a, -1))) {
                    cl.a((IPlayerContext)this.a, cn2, (et)this.a);
                } else {
                    cl.a((IPlayerContext)this.a, cn2, (et)this.a.offset(this.a, -1));
                }
            }
        }
        return cn2;
    }
}

