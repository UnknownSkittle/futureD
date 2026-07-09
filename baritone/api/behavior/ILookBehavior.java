/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.behavior;

import baritone.api.behavior.IBehavior;
import baritone.api.utils.Rotation;

public interface ILookBehavior
extends IBehavior {
    public void updateTarget(Rotation var1, boolean var2);
}

