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

public class GoalTwoBlocks
implements Goal,
IGoalRenderPos {
    protected final int x;
    protected final int y;
    protected final int z;

    public GoalTwoBlocks(et et2) {
        this(et2.p(), et2.q(), et2.r());
    }

    public GoalTwoBlocks(int n2, int n3, int n4) {
        this.x = n2;
        this.y = n3;
        this.z = n4;
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        return n2 == this.x && (n3 == this.y || n3 == this.y - 1) && n4 == this.z;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        return GoalBlock.calculate(n2 -= this.x, (n3 -= this.y) < 0 ? n3 + 1 : n3, n4 -= this.z);
    }

    @Override
    public et getGoalPos() {
        return new et(this.x, this.y, this.z);
    }

    public String toString() {
        return String.format("GoalTwoBlocks{x=%s,y=%s,z=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z));
    }
}

