/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalGetToBlock;

public final class eg
extends GoalGetToBlock {
    public eg(et et2) {
        super(et2);
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        if (n3 > this.y) {
            return false;
        }
        return super.isInGoal(n2, n3, n4);
    }
}

