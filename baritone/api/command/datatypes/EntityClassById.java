/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  nf
 *  vg
 *  vi
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.stream.Stream;

public enum EntityClassById implements IDatatypeFor<Class<? extends vg>>
{
    INSTANCE;


    @Override
    public final Class<? extends vg> get(IDatatypeContext object) {
        object = new nf(object.getConsumer().getString());
        if ((object = (Class)vi.b.c(object)) == null) {
            throw new IllegalArgumentException("no entity found by that id");
        }
        return object;
    }

    @Override
    public final Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        return new TabCompleteHelper().append(vi.a().stream().map(Object::toString)).filterPrefixNamespaced(iDatatypeContext.getConsumer().getString()).sortAlphabetically().stream();
    }
}

