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

public class GoalGetToBlock
implements Goal,
IGoalRenderPos {
    public final int x;
    public final int y;
    public final int z;

    public GoalGetToBlock(et et2) {
        this.x = et2.p();
        this.y = et2.q();
        this.z = et2.r();
    }

    @Override
    public et getGoalPos() {
        return new et(this.x, this.y, this.z);
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        return Math.abs(n2 -= this.x) + Math.abs((n3 -= this.y) < 0 ? n3 + 1 : n3) + Math.abs(n4 -= this.z) <= 1;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        return GoalBlock.calculate(n2 -= this.x, (n3 -= this.y) < 0 ? n3 + 1 : n3, n4 -= this.z);
    }

    public String toString() {
        return String.format("GoalGetToBlock{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }
}

