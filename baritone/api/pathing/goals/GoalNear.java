/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.interfaces.IGoalRenderPos;

public class GoalNear
implements Goal,
IGoalRenderPos {
    private final int x;
    private final int y;
    private final int z;
    private final int rangeSq;

    public GoalNear(et et2, int n2) {
        this.x = et2.p();
        this.y = et2.q();
        this.z = et2.r();
        int n3 = n2;
        this.rangeSq = n3 * n3;
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        int n5 = n2 -= this.x;
        int n6 = n3 -= this.y;
        int n7 = n4 -= this.z;
        return n5 * n5 + n6 * n6 + n7 * n7 <= this.rangeSq;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        return GoalBlock.calculate(n2 -= this.x, n3 -= this.y, n4 -= this.z);
    }

    @Override
    public et getGoalPos() {
        return new et(this.x, this.y, this.z);
    }

    public String toString() {
        return String.format("GoalNear{x=%s, y=%s, z=%s, rangeSq=%d}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z), this.rangeSq);
    }
}

