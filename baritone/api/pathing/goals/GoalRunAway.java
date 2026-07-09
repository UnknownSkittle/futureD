/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalXZ;
import baritone.api.pathing.goals.GoalYLevel;
import baritone.api.utils.SettingsUtil;
import java.util.Arrays;

public class GoalRunAway
implements Goal {
    private final et[] from;
    private final double distanceSq;
    private final Integer maintainY;

    public GoalRunAway(double d2, et ... etArray) {
        this(d2, (Integer)null, etArray);
    }

    public GoalRunAway(double d2, Integer n2, et ... etArray) {
        if (etArray.length == 0) {
            throw new IllegalArgumentException();
        }
        this.from = etArray;
        double d3 = d2;
        this.distanceSq = d3 * d3;
        this.maintainY = n2;
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        if (this.maintainY != null && this.maintainY != n3) {
            return false;
        }
        et[] etArray = this.from;
        int n5 = this.from.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            et et2 = etArray[i2];
            int n6 = n2 - et2.p();
            int n7 = n4 - et2.r();
            int n8 = n6;
            int n9 = n7;
            if (!((double)(n8 * n8 + n9 * n9) < this.distanceSq)) continue;
            return false;
        }
        return true;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        double d2 = Double.MAX_VALUE;
        et[] etArray = this.from;
        int n5 = this.from.length;
        for (int i2 = 0; i2 < n5; ++i2) {
            double d3;
            et et2 = etArray[i2];
            double d4 = GoalXZ.calculate(et2.p() - n2, et2.r() - n4);
            if (!(d3 < d2)) continue;
            d2 = d4;
        }
        d2 = -d2;
        if (this.maintainY != null) {
            d2 = d2 * 0.6 + GoalYLevel.calculate(this.maintainY, n3) * 1.5;
        }
        return d2;
    }

    public String toString() {
        if (this.maintainY != null) {
            return String.format("GoalRunAwayFromMaintainY y=%s, %s", SettingsUtil.maybeCensor(this.maintainY), Arrays.asList(this.from));
        }
        return "GoalRunAwayFrom" + Arrays.asList(this.from);
    }
}

