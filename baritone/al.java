/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandInvalidStateException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class al
extends Command {
    public al(IBaritone iBaritone) {
        super(iBaritone, "blacklist");
    }

    @Override
    public final void execute(String object, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        object = this.baritone.getGetToBlockProcess();
        if (!object.isActive()) {
            throw new CommandInvalidStateException("GetToBlockProcess is not currently active");
        }
        if (object.blacklistClosest()) {
            this.logDirect("Blacklisted closest instances");
            return;
        }
        throw new CommandInvalidStateException("No known locations, unable to blacklist");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Blacklist closest block";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it.", "", "Usage:", "> blacklist");
    }
}

