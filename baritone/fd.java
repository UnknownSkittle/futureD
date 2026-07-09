/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone;

import baritone.api.pathing.goals.GoalRunAway;
import baritone.fc;

final class fd
extends GoalRunAway {
    private /* synthetic */ fc a;

    fd(fc fc2, Integer n2, et ... etArray) {
        this.a = fc2;
        super(1.0, n2, etArray);
    }

    @Override
    public final boolean isInGoal(int n2, int n3, int n4) {
        return false;
    }
}

