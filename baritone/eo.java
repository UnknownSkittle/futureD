/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;

final class eo
extends GoalXZ {
    eo(int n2, int n3) {
        super(n2, n3);
    }

    @Override
    public final double heuristic(int n2, int n3, int n4) {
        return super.heuristic(n2, n3, n4) + GoalYLevel.calculate((Integer)a.a().exploreMaintainY.value, n3);
    }
}

