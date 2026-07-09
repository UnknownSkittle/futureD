/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.dp;

final class cq
extends cp {
    @Override
    public final ck a(cj cj2, BetterBlockPos betterBlockPos) {
        BetterBlockPos betterBlockPos2 = betterBlockPos;
        return new dp(cj2.a, betterBlockPos2, betterBlockPos2.down());
    }

    @Override
    public final double a(cj cj2, int n2, int n3, int n4) {
        return dp.a(cj2, n2, n3, n4);
    }
}

