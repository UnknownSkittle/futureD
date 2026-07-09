/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.ar;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class at
extends Command {
    private /* synthetic */ boolean[] a;
    private /* synthetic */ ar a;

    at(ar ar2, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.a = ar2;
        this.a = blArray;
        super(iBaritone, stringArray);
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        if (this.a[0]) {
            throw new CommandInvalidStateException("Already paused");
        }
        this.a[0] = true;
        this.logDirect("Paused");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Pauses Baritone until you use resume";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The pause command tells Baritone to temporarily stop whatever it's doing.", "", "This can be used to pause pathing, building, following, whatever. A single use of the resume command will start it right back up again!", "", "Usage:", "> pause");
    }
}

