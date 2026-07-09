/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.dn;
import baritone.dq;
import baritone.gj;

final class cu
extends cp {
    @Override
    public final ck a(cj cj2, BetterBlockPos betterBlockPos) {
        gj gj2 = new gj();
        this.a(cj2, betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, gj2);
        if (gj2.b == betterBlockPos.b - 1) {
            return new dn(cj2.a, betterBlockPos, new BetterBlockPos(gj2.a, gj2.b, gj2.c));
        }
        return new dq(cj2.a, betterBlockPos, new BetterBlockPos(gj2.a, gj2.b, gj2.c));
    }

    @Override
    public final void a(cj cj2, int n2, int n3, int n4, gj gj2) {
        dn.a(cj2, n2, n3, n4, n2, n4 - 1, gj2);
    }
}

