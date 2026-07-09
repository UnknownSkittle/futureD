/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  aip
 *  et
 *  hh
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.cache.IRememberedInventory;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.utils.BetterBlockPos;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public final class an
extends Command {
    public an(IBaritone iBaritone) {
        super(iBaritone, "chests");
    }

    @Override
    public final void execute(String iterator, IArgConsumer iterator2) {
        iterator2.requireMax(0);
        iterator = this.ctx.worldData().getContainerMemory().getRememberedInventories().entrySet();
        if (iterator.isEmpty()) {
            throw new CommandInvalidStateException("No remembered inventories");
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            iterator2 = (Map.Entry)iterator.next();
            BetterBlockPos betterBlockPos = new BetterBlockPos((et)iterator2.getKey());
            iterator2 = (IRememberedInventory)iterator2.getValue();
            this.logDirect(betterBlockPos.toString());
            for (aip aip2 : iterator2.getContents()) {
                hh hh2 = aip2.C();
                hh2.a(String.format(" x %d", aip2.E()));
                this.logDirect(hh2);
            }
        }
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Display remembered inventories";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The chests command lists remembered inventories, I guess?", "", "Usage:", "> chests");
    }
}

