/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import java.util.stream.Stream;

public interface IDatatype {
    public Stream<String> tabComplete(IDatatypeContext var1);
}

