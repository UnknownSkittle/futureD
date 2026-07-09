/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  bud
 */
package baritone.api;

import baritone.api.IBaritone;
import baritone.api.cache.IWorldScanner;
import baritone.api.command.ICommandSystem;
import baritone.api.schematic.ISchematicSystem;
import java.util.List;
import java.util.Objects;

public interface IBaritoneProvider {
    public IBaritone getPrimaryBaritone();

    public List<IBaritone> getAllBaritones();

    default public IBaritone getBaritoneForPlayer(bud bud2) {
        for (IBaritone iBaritone : this.getAllBaritones()) {
            if (!Objects.equals(bud2, iBaritone.getPlayerContext().player())) continue;
            return iBaritone;
        }
        return null;
    }

    public IWorldScanner getWorldScanner();

    public ICommandSystem getCommandSystem();

    public ISchematicSystem getSchematicSystem();
}

