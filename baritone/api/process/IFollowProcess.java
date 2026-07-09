/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  vg
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import java.util.List;
import java.util.function.Predicate;

public interface IFollowProcess
extends IBaritoneProcess {
    public void follow(Predicate<vg> var1);

    public List<vg> following();

    public Predicate<vg> currentFilter();

    default public void cancel() {
        this.onLostControl();
    }
}

