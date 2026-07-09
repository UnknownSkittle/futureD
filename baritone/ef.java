/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalGetToBlock;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ef
extends GoalGetToBlock {
    private boolean a;
    private et a;

    public ef(et et2, et et3, boolean bl2) {
        super(et2);
        this.a = et3;
        this.a = bl2;
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        if (n2 == this.x && n3 == this.y && n4 == this.z) {
            return false;
        }
        if (n2 == this.a.p() && n3 == this.a.q() && n4 == this.a.r()) {
            return false;
        }
        if (!this.a && n3 == this.y - 1) {
            return false;
        }
        if (n3 < this.y - 1) {
            return false;
        }
        return super.isInGoal(n2, n3, n4);
    }

    @Override
    public final double heuristic(int n2, int n3, int n4) {
        return (double)(this.y * 100) + super.heuristic(n2, n3, n4);
    }
}

