/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalTwoBlocks;

final class fe
extends GoalTwoBlocks {
    public fe(et et2) {
        super(et2);
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        return n2 == this.x && (n3 == this.y || n3 == this.y - 1 || n3 == this.y - 2) && n4 == this.z;
    }

    @Override
    public final double heuristic(int n2, int n3, int n4) {
        return GoalBlock.calculate(n2 -= this.x, (n3 -= this.y) < -1 ? n3 + 2 : (n3 == -1 ? 0 : n3), n4 -= this.z);
    }
}

