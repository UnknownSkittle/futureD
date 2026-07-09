/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.a;
import baritone.api.IBaritone;
import baritone.api.IBaritoneProvider;
import baritone.api.cache.IWorldScanner;
import baritone.api.command.ICommandSystem;
import baritone.api.schematic.ISchematicSystem;
import baritone.gp;
import baritone.w;
import baritone.x;
import baritone.y;
import java.util.Collections;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class BaritoneProvider
implements IBaritoneProvider {
    private final a a;
    private final List<IBaritone> a = Collections.singletonList(this.a);

    public BaritoneProvider() {
        new x(this.a);
    }

    @Override
    public final IBaritone getPrimaryBaritone() {
        return this.a;
    }

    @Override
    public final List<IBaritone> getAllBaritones() {
        return this.a;
    }

    @Override
    public final IWorldScanner getWorldScanner() {
        return w.a;
    }

    @Override
    public final ICommandSystem getCommandSystem() {
        return y.a;
    }

    @Override
    public final ISchematicSystem getSchematicSystem() {
        return gp.a;
    }
}

