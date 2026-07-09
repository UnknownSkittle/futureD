/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  et
 */
package baritone.api.pathing.goals;

public interface Goal {
    public boolean isInGoal(int var1, int var2, int var3);

    public double heuristic(int var1, int var2, int var3);

    default public boolean isInGoal(et et2) {
        return this.isInGoal(et2.p(), et2.q(), et2.r());
    }

    default public double heuristic(et et2) {
        return this.heuristic(et2.p(), et2.q(), et2.r());
    }
}

