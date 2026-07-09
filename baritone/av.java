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
final class av
extends Command {
    private /* synthetic */ boolean[] a;
    private /* synthetic */ ar a;

    av(ar ar2, IBaritone iBaritone, String[] stringArray, boolean ... blArray) {
        this.a = ar2;
        this.a = blArray;
        super(iBaritone, stringArray);
    }

    @Override
    public final void execute(String string, IArgConsumer iArgConsumer) {
        iArgConsumer.requireMax(0);
        this.logDirect(String.format("Baritone is %spaused", this.a[0] ? "" : "not "));
    }

    @Override
    public final Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) {
        return Stream.empty();
    }

    @Override
    public final String getShortDesc() {
        return "Tells you if Baritone is paused";
    }

    @Override
    public final List<String> getLongDesc() {
        return Arrays.asList("The paused command tells you if Baritone is currently paused by use of the pause command.", "", "Usage:", "> paused");
    }
}

