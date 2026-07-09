/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 *  fa
 */
package baritone.api.pathing.goals;

import baritone.api.pathing.goals.Goal;
import baritone.api.utils.SettingsUtil;

public class GoalStrictDirection
implements Goal {
    public final int x;
    public final int y;
    public final int z;
    public final int dx;
    public final int dz;

    public GoalStrictDirection(et et2, fa fa2) {
        this.x = et2.p();
        this.y = et2.q();
        this.z = et2.r();
        this.dx = fa2.g();
        this.dz = fa2.i();
        if (this.dx == 0 && this.dz == 0) {
            throw new IllegalArgumentException(String.valueOf(fa2));
        }
    }

    @Override
    public boolean isInGoal(int n2, int n3, int n4) {
        return false;
    }

    @Override
    public double heuristic(int n2, int n3, int n4) {
        int n5 = (n2 - this.x) * this.dx + (n4 - this.z) * this.dz;
        n2 = Math.abs((n2 - this.x) * this.dz) + Math.abs((n4 - this.z) * this.dx);
        n3 = Math.abs(n3 - this.y);
        return (double)(-n5 * 100) + (double)(n2 * 1000) + (double)(n3 * 1000);
    }

    public String toString() {
        return String.format("GoalStrictDirection{x=%s, y=%s, z=%s, dx=%s, dz=%s}", SettingsUtil.maybeCensor(this.x), SettingsUtil.maybeCensor(this.y), SettingsUtil.maybeCensor(this.z), SettingsUtil.maybeCensor(this.dx), SettingsUtil.maybeCensor(this.dz));
    }
}

