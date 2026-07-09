/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.utils.BetterBlockPos;
import baritone.cj;
import baritone.ck;
import baritone.cp;
import baritone.dm;

final class dl
extends cp {
    @Override
    public final ck a(cj cj2, BetterBlockPos betterBlockPos) {
        return new dm(cj2.a, betterBlockPos, new BetterBlockPos(betterBlockPos.a + 1, betterBlockPos.b + 1, betterBlockPos.c));
    }

    @Override
    public final double a(cj cj2, int n2, int n3, int n4) {
        return dm.a(cj2, n2, n3, n4, n2 + 1, n4);
    }
}

