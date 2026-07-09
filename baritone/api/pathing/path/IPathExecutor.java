/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.pathing.path;

import baritone.api.pathing.calc.IPath;

public interface IPathExecutor {
    public IPath getPath();

    public int getPosition();
}

