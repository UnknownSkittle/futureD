/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.datatypes;

import baritone.api.IBaritone;
import baritone.api.command.argument.IArgConsumer;

public interface IDatatypeContext {
    public IBaritone getBaritone();

    public IArgConsumer getConsumer();
}

