/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  fa
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.do;
import baritone.gj;

final class cw
extends cp {
    @Override
    public final ck a(cj cj2, BetterBlockPos betterBlockPos) {
        gj gj2 = new gj();
        this.a(cj2, betterBlockPos.a, betterBlockPos.b, betterBlockPos.c, gj2);
        return new do(cj2.a, betterBlockPos, fa.c, fa.f, gj2.b - betterBlockPos.b);
    }

    @Override
    public final void a(cj cj2, int n2, int n3, int n4, gj gj2) {
        do.a(cj2, n2, n3, n4, n2 + 1, n4 - 1, gj2);
    }
}

