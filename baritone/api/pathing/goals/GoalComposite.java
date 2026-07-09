/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import java.util.Arrays;

public class GoalComposite
implements Goal {
    private final Goal[] goals;

    public GoalComposite(Goal ... goalArray) {
        this.goals = goalArray;
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        Goal[] goalArray = this.goals;
        int n5 = this.goals.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            if (!goalArray[i2].isInGoal(n2, n3, n4)) continue;
            return true;
        }
        return false;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        double d2 = Double.MAX_VALUE;
        Goal[] goalArray = this.goals;
        int n5 = this.goals.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            Goal goal = goalArray[i2];
            d2 = Math.min(d2, goal.heuristic(n2, n3, n4));
        }
        return d2;
    }

    public String toString() {
        return "GoalComposite" + Arrays.toString(this.goals);
    }

    public Goal[] goals() {
        return this.goals;
    }
}

