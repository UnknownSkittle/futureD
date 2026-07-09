/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalBlock;

public final class eh
extends GoalBlock {
    public eh(et et2) {
        super(et2.a());
    }

    @Override
    public final double heuristic(int n2, int n3, int n4) {
        return (double)(this.y * 100) + super.heuristic(n2, n3, n4);
    }
}

