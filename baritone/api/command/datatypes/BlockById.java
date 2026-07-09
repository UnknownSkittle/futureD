/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  aox
 *  nf
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.stream.Stream;

public enum BlockById implements IDatatypeFor<aow>
{
    INSTANCE;


    @Override
    public final aow get(IDatatypeContext iDatatypeContext) {
        iDatatypeContext = new nf(iDatatypeContext.getConsumer().getString());
        if ((iDatatypeContext = (aow)aow.h.c((Object)iDatatypeContext)) == aox.a) {
            throw new IllegalArgumentException("no block found by that id");
        }
        return iDatatypeContext;
    }

    @Override
    public final Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        return new TabCompleteHelper().append(aow.h.c().stream().map(Object::toString)).filterPrefixNamespaced(iDatatypeContext.getConsumer().getString()).sortAlphabetically().stream();
    }
}

