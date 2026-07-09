/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aow
 *  nf
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.BlockById;
import baritone.api.utils.BetterBlockPos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class ba
extends Command {
    public ba(IBaritone iBaritone) {
        super(iBaritone, "find");
    }

    @Override
    public final void execute(String object, IArgConsumer object2) {
        object = new ArrayList();
        while (object2.hasAny()) {
            object.add(object2.getDatatypeFor(BlockById.INSTANCE));
        }
        object2 = this.ctx.playerFeet();
        object.stream().flatMap(arg_0 -> this.a((BetterBlockPos)((Object)object2), arg_0)).map(BetterBlockPos::new).map(BetterBlockPos::toString).forEach(this::logDirect);
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return iArgConsumer.tabCompleteDatatype(BlockById.INSTANCE);
    }

    @Override
    public final String getShortDesc() {
        return "Find positions of a certain block";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("", "", "Usage:", "> ");
    }

    private /* synthetic */ Stream a(BetterBlockPos betterBlockPos, aow aow2) {
        return this.ctx.worldData().getCachedWorld().getLocationsOf(((nf)aow.h.b((Object)aow2)).a(), Integer.MAX_VALUE, betterBlockPos.a, betterBlockPos.b, 4).stream();
    }
}

