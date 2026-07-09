/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.pathing.goals.Goal;
import baritone.api.utils.BetterBlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class g {
    public final int a;
    public final int b;
    public final int c;
    public final double a;
    public double b = 1000000.0;
    public double c;
    public g a = null;
    public int d;

    public g(int n2, int n3, int n4, Goal goal) {
        this.a = goal.heuristic(n2, n3, n4);
        if (Double.isNaN(this.a)) {
            throw new IllegalStateException(goal + " calculated implausible heuristic");
        }
        this.d = -1;
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    public final int hashCode() {
        return (int)BetterBlockPos.longHash(this.a, this.b, this.c);
    }

    public final boolean equals(Object object) {
        object = (g)object;
        return this.a == ((g)object).a && this.b == ((g)object).b && this.c == ((g)object).c;
    }
}

