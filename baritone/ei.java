/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.pathing.goals.Goal;

public final class ei
implements Goal {
    private final Goal a;
    private final Goal b;

    public ei(Goal goal, Goal goal2) {
        this.a = goal;
        this.b = goal2;
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        return this.a.isInGoal(n2, n3, n4) || this.b.isInGoal(n2, n3, n4);
    }

    @Override
    public final double heuristic(int n2, int n3, int n4) {
        return this.a.heuristic(n2, n3, n4);
    }

    public final String toString() {
        return "JankyComposite Primary: " + this.a + " Fallback: " + this.b;
    }
}

