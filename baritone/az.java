/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class az
extends Command {
    public az(IBaritone iBaritone) {
        super(iBaritone, "farm");
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        this.baritone.getFarmProcess().farm();
        this.logDirect("Farming");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Farm nearby crops";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The farm command starts farming nearby plants. It harvests mature crops and plants new ones.", "", "Usage:", "> farm");
    }
}

