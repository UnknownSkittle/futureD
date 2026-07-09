/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  aox
 *  awt
 *  et
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.pathing.movement.MovementStatus;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.IPlayerContext;
import baritone.cj;
import baritone.ck;
import baritone.cl;
import baritone.cn;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public final class dp
extends ck {
    private int a = 0;

    public dp(IBaritone iBaritone, BetterBlockPos betterBlockPos, BetterBlockPos betterBlockPos2) {
        super(iBaritone, betterBlockPos, betterBlockPos2, new BetterBlockPos[]{betterBlockPos2});
    }

    @Override
    public final void reset() {
        super.reset();
        this.a = 0;
    }

    @Override
    public final double a(cj cj2) {
        return dp.a(cj2, this.a.a, this.a.b, this.a.c);
    }

    @Override
    public final Set<BetterBlockPos> a() {
        return ImmutableSet.of(this.a, this.b);
    }

    public static double a(cj cj2, int n2, int n3, int n4) {
        if (!cj2.m) {
            return 1000000.0;
        }
        if (!cl.b(cj2.a, n2, n3 - 2, n4)) {
            return 1000000.0;
        }
        awt awt2 = cj2.a(n2, n3 - 1, n4);
        aow aow2 = awt2.u();
        if (aow2 == aox.au || aow2 == aox.bn) {
            return 6.666666666666667;
        }
        return FALL_N_BLOCKS_COST[1] + cl.a(cj2, n2, n3 - 1, n4, awt2, false);
    }

    @Override
    public final cn a(cn object) {
        super.a((cn)object);
        if (object.a != MovementStatus.RUNNING) {
            return object;
        }
        if (this.a.playerFeet().equals((Object)this.b)) {
            cn cn2 = object;
            object = MovementStatus.SUCCESS;
            cn cn3 = cn2;
            cn2.a = object;
            return cn3;
        }
        if (!this.a()) {
            Object object2 = object;
            object = MovementStatus.UNREACHABLE;
            Object object3 = object2;
            object2.a = object;
            return object3;
        }
        double d2 = this.a.player().p - ((double)this.b.p() + 0.5);
        double d3 = this.a.player().r - ((double)this.b.r() + 0.5);
        double d4 = d2;
        double d5 = d3;
        double d6 = Math.sqrt(d4 * d4 + d5 * d5);
        if (this.a++ < 10 && d6 < 0.2) {
            return object;
        }
        cl.a((IPlayerContext)this.a, object, (et)this.a[0]);
        return object;
    }
}

