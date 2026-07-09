/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.ag;
import baritone.api.command.ICommand;
import java.util.stream.Stream;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
final class ce {
    ICommand a;
    String a;
    ag a;

    private ce(ICommand iCommand, String string, ag ag2) {
        this.a = iCommand;
        this.a = string;
        this.a = ag2;
    }

    final Stream<String> a() {
        try {
            return this.a.tabComplete(this.a, this.a);
        } catch (Throwable throwable) {
            return Stream.empty();
        }
    }

    /* synthetic */ ce(ICommand iCommand, String string, ag ag2, byte by2) {
        this(iCommand, string, ag2);
    }
}

