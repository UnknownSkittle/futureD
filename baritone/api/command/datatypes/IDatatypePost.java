/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatype;
import baritone.api.command.datatypes.IDatatypeContext;

public interface IDatatypePost<T, O>
extends IDatatype {
    public T apply(IDatatypeContext var1, O var2);
}

