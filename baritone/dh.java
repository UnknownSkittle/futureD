/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.dt;

final class dh
extends cp {
    @Override
    public final ck a(cj cj2, BetterBlockPos betterBlockPos) {
        BetterBlockPos betterBlockPos2 = betterBlockPos;
        return new dt(cj2.a, betterBlockPos2, betterBlockPos2.east());
    }

    @Override
    public final double a(cj cj2, int n2, int n3, int n4) {
        return dt.a(cj2, n2, n3, n4, n2 + 1, n4);
    }
}

