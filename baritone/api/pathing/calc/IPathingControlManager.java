/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.pathing.calc;

import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import java.util.Optional;

public interface IPathingControlManager {
    public void registerProcess(IBaritoneProcess var1);

    public Optional<IBaritoneProcess> mostRecentInControl();

    public Optional<PathingCommand> mostRecentCommand();
}

