/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.argument.IArgConsumer;
import baritone.ar;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class aw
extends Command {
    private /* synthetic */ boolean[] a;
    private /* synthetic */ ar a;

    aw(ar ar2, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.a = ar2;
        this.a = blArray;
        super(iBaritone, stringArray);
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        if (this.a[0]) {
            this.a[0] = false;
        }
        this.baritone.getPathingBehavior().cancelEverything();
        this.logDirect("ok canceled");
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Cancel what Baritone is currently doing";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The cancel command tells Baritone to stop whatever it's currently doing.", "", "Usage:", "> cancel");
    }
}

