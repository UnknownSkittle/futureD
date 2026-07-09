/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;

public class GoalInverted
implements Goal {
    public final Goal origin;

    public GoalInverted(Goal goal) {
        this.origin = goal;
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        return false;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        return -this.origin.heuristic(n2, n3, n4);
    }

    public String toString() {
        return String.format("GoalInverted{%s}", this.origin.toString());
    }
}

