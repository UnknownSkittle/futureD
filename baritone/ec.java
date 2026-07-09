/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalGetToBlock;
import baritone.ea;

final class ec
extends GoalGetToBlock {
    private /* synthetic */ ea a;

    ec(ea ea2, et et2) {
        this.a = ea2;
        super(et2);
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        if (n3 > this.y || n2 == this.x && n3 == this.y && n4 == this.z) {
            return false;
        }
        return super.isInGoal(n2, n3, n4);
    }
}

