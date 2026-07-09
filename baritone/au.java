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
final class au
extends Command {
    private /* synthetic */ boolean[] a;
    private /* synthetic */ ar a;

    au(ar ar2, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.a = ar2;
        this.a = blArray;
        super(iBaritone, stringArray);
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        this.baritone.getBuilderProcess().resume();
        if (!this.a[0]) {
            throw new CommandInvalidStateException("Not paused");
        }
        this.a[0] = false;
        this.logDirect("Resumed");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Resumes Baritone after a pause";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The resume command tells Baritone to resume whatever it was doing when you last used pause.", "", "Usage:", "> resume");
    }
}

