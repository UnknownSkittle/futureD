/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  aox
 *  awt
 *  et
 *  fa
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.api.utils.input.Input;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cn;
import baritone.fn;
import baritone.gj;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class do
extends ck {
    private static final double a = Math.sqrt(2.0);

    public do(IBaritone iBaritone, BetterBlockPos betterBlockPos, fa fa2, fa fa3, int n2) {
        BetterBlockPos betterBlockPos2 = betterBlockPos;
        this(iBaritone, betterBlockPos2, betterBlockPos2.offset(fa2), betterBlockPos.offset(fa3), fa3, n2);
    }

    private do(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos betterBlockPos3, fa fa2, int n2) {
        this(iBaritone, betterBlockPos, betterBlockPos2.offset(fa2).up(n2), betterBlockPos2, betterBlockPos3);
    }

    private do(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2, BetterBlockPos betterBlockPos3, BetterBlockPos betterBlockPos4) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos3, betterBlockPos3.up(), betterBlockPos4, betterBlockPos4.up(), betterBlockPos2, betterBlockPos2.up()});
    }

    @Override
    public final double a(cj cj2) {
        gj gj2 = new gj();
        do.a(cj2, this.a.a, this.a.b, this.a.c, this.b.a, this.b.c, gj2);
        if (gj2.b != this.b.b) {
            return 1000000.0;
        }
        return gj2.a;
    }

    @Override
    public final Set<BetterBlockPos> a() {
        BetterBlockPos betterBlockPos = new BetterBlockPos(this.a.a, this.a.b, this.b.c);
        BetterBlockPos betterBlockPos2 = new BetterBlockPos(this.b.a, this.a.b, this.a.c);
        if (this.b.b < this.a.b) {
            return ImmutableSet.of(this.a, this.b.up(), betterBlockPos, betterBlockPos2, this.b, betterBlockPos.down(), new BetterBlockPos[]{betterBlockPos2.down()});
        }
        if (this.b.b > this.a.b) {
            return ImmutableSet.of(this.a, this.a.up(), betterBlockPos, betterBlockPos2, this.b, betterBlockPos.up(), new BetterBlockPos[]{betterBlockPos2.up()});
        }
        return ImmutableSet.of(this.a, this.b, betterBlockPos, betterBlockPos2);
    }

    public static void a(cj cj2, int n2, int n3, int n4, int n5, int n6, gj gj2) {
        awt awt2;
        if (!cl.a(cj2.a, n5, n3 + 1, n6)) {
            return;
        }
        awt awt3 = cj2.a(n5, n3, n6);
        boolean bl2 = false;
        boolean bl3 = false;
        if (!cl.b(cj2.a, n5, n3, n6, awt3)) {
            bl2 = true;
            if (!(cj2.l && cl.a(cj2.a, n2, n3 + 2, n4) && cl.c(cj2.a, n5, n3, n6, awt3) && cl.a(cj2.a, n5, n3 + 2, n6))) {
                return;
            }
            awt2 = awt3;
        } else {
            awt2 = cj2.a(n5, n3 - 1, n6);
            if (!cl.c(cj2.a, n5, n3 - 1, n6, awt2)) {
                bl3 = true;
                if (!(cj2.k && cl.b(cj2.a, n5, n3 - 2, n6) && cl.b(cj2.a, n5, n3 - 1, n6, awt2))) {
                    return;
                }
            }
        }
        double d2 = 4.63284688441047;
        if (awt2.u() == aox.aW) {
            d2 = 6.949270326615705;
        } else if (awt2.u() == aox.j) {
            d2 = 4.63284688441047 + cj2.f * a;
        }
        awt2 = cj2.a(n2, n3 - 1, n4).u();
        if (awt2 == aox.au || awt2 == aox.bn) {
            return;
        }
        if (awt2 == aox.aW) {
            d2 += 2.316423442205235;
        }
        if ((awt2 = cj2.a(n2, n3 - 1, n6).u()) == aox.df || cl.c((aow)awt2)) {
            return;
        }
        awt2 = cj2.a(n5, n3 - 1, n4).u();
        if (awt2 == aox.df || cl.c((aow)awt2)) {
            return;
        }
        awt2 = cj2.a(n2, n3, n4);
        boolean bl4 = false;
        if (cl.b((aow)awt2) || cl.b(awt3.u())) {
            if (bl2) {
                return;
            }
            d2 = cj2.b;
            bl4 = true;
        }
        awt3 = cj2.a(n2, n3, n6);
        awt awt4 = cj2.a(n5, n3, n4);
        if (bl2) {
            boolean bl5 = cl.a(cj2.a, n2, n3 + 2, n6);
            boolean bl6 = cl.a(cj2.a, n2, n3 + 1, n6);
            boolean bl7 = cl.b(cj2.a, n2, n3, n6, awt3);
            boolean bl8 = cl.a(cj2.a, n5, n3 + 2, n4);
            bl2 = cl.a(cj2.a, n5, n3 + 1, n4);
            boolean bl9 = cl.b(cj2.a, n5, n3, n4, awt4);
            if ((!bl5 || !bl6 || !bl7) && (!bl8 || !bl2 || !bl9) || cl.a(awt3.u()) || cl.a(awt4.u()) || bl5 && bl6 && cl.c(cj2.a, n2, n3, n6, awt3) || bl8 && bl2 && cl.c(cj2.a, n5, n3, n4, awt4) || !bl5 && bl6 && bl7 || !bl8 && bl2 && bl9) {
                return;
            }
            gj2.a = d2 * a + JUMP_ONE_BLOCK_COST;
            gj2.a = n5;
            gj2.c = n6;
            gj2.b = n3 + 1;
            return;
        }
        double d3 = cl.a(cj2, n2, n3, n6, awt3, false);
        double d4 = cl.a(cj2, n5, n3, n4, awt4, false);
        if (d3 != 0.0 && d4 != 0.0) {
            return;
        }
        awt awt5 = cj2.a(n2, n3 + 1, n6);
        if ((d3 += cl.a(cj2, n2, n3 + 1, n6, awt5, true)) != 0.0 && d4 != 0.0) {
            return;
        }
        awt awt6 = cj2.a(n5, n3 + 1, n4);
        if (d3 == 0.0 && (cl.a(awt4.u()) && awt4.u() != aox.j || cl.a(awt6.u()))) {
            return;
        }
        if (d3 != 0.0 && (d4 += cl.a(cj2, n5, n3 + 1, n4, awt6, true)) != 0.0) {
            return;
        }
        if (d4 == 0.0 && (cl.a(awt3.u()) && awt3.u() != aox.j || cl.a(awt5.u()))) {
            return;
        }
        if (d3 != 0.0 || d4 != 0.0) {
            d2 *= a - 0.001;
            if (awt2 == aox.au || awt2 == aox.bn) {
                return;
            }
        } else if (cj2.d && !bl4) {
            d2 *= 0.7692444761225944;
        }
        gj2.a = d2 * a;
        if (bl3) {
            gj2.a += Math.max(FALL_N_BLOCKS_COST[1], 0.9265693768820937);
            gj2.b = n3 - 1;
        } else {
            gj2.b = n3;
        }
        gj2.a = n5;
        gj2.c = n6;
    }

    @Override
    public final cn a(cn object) {
        boolean bl2;
        block8: {
            super.a((cn)object);
            if (((cn)object).a != MovementStatus.RUNNING) {
                return object;
            }
            if (this.a.playerFeet().equals((Object)this.b)) {
                cn cn2 = object;
                object = MovementStatus.SUCCESS;
                cn cn3 = cn2;
                cn2.a = object;
                return cn3;
            }
            if (!(this.a() || cl.e((IPlayerContext)this.a, (et)this.a) && this.b().contains((Object)this.a.playerFeet().up()))) {
                Object object2 = object;
                object = MovementStatus.UNREACHABLE;
                Object object3 = object2;
                object2.a = object;
                return object3;
            }
            if (this.b.b > this.a.b && this.a.player().q < (double)this.a.b + 0.1 && this.a.player().A) {
                ((cn)object).a(Input.JUMP, true);
            }
            do do_ = this;
            if (cl.e((IPlayerContext)do_.a, do_.a.playerFeet()) && !((Boolean)baritone.a.a().sprintInWater.value).booleanValue()) {
                bl2 = false;
            } else {
                for (int i2 = 0; i2 < 4; ++i2) {
                    if (cl.a((IPlayerContext)do_.a, (BetterBlockPos)do_.a[i2])) continue;
                    bl2 = false;
                    break block8;
                }
                bl2 = true;
            }
        }
        if (bl2) {
            ((cn)object).a(Input.SPRINT, true);
        }
        cl.a((IPlayerContext)this.a, (cn)object, (et)this.b);
        return object;
    }

    @Override
    public final boolean a(cn cn2) {
        return true;
    }

    @Override
    public final List<et> a(fn fn2) {
        if (this.a != null) {
            return this.a;
        }
        ArrayList<et> arrayList = new ArrayList<et>();
        for (int i2 = 4; i2 < 6; ++i2) {
            if (cl.a(fn2, this.a[i2].a, this.a[i2].b, this.a[i2].c)) continue;
            arrayList.add((et)this.a[i2]);
        }
        this.a = (double)arrayList;
        return arrayList;
    }

    @Override
    public final List<et> c(fn fn2) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        ArrayList<void> arrayList = new ArrayList<void>();
        for (int i2 = 0; i2 < 4; ++i2) {
            if (cl.a(fn2, this.a[i2].a, this.a[i2].b, this.a[i2].c)) continue;
            arrayList.add(this.a[i2]);
        }
        this.b = arrayList;
        return this.b;
    }
}

