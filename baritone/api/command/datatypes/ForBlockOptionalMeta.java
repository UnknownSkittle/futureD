/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone.api.command.datatypes;

import baritone.api.command.datatypes.BlockById;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.utils.BlockOptionalMeta;
import java.util.stream.Stream;

public enum ForBlockOptionalMeta implements IDatatypeFor<BlockOptionalMeta>
{
    INSTANCE;


    @Override
    public final BlockOptionalMeta get(IDatatypeContext iDatatypeContext) {
        return new BlockOptionalMeta(iDatatypeContext.getConsumer().getString());
    }

    @Override
    public final Stream<String> tabComplete(IDatatypeContext iDatatypeContext) {
        return iDatatypeContext.getConsumer().tabCompleteDatatype(BlockById.INSTANCE);
    }
}

