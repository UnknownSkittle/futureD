/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.ICommandSystem;
import baritone.api.command.argparser.IArgParserManager;
import baritone.z;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class y
extends Enum<y>
implements ICommandSystem {
    public static final /* enum */ y a = new y("INSTANCE");
    private static final /* synthetic */ y[] a;

    public static y[] values() {
        return (y[])a.clone();
    }

    public static y valueOf(String string) {
        return Enum.valueOf(y.class, string);
    }

    @Override
    public final IArgParserManager getParserManager() {
        return z.a;
    }

    static {
        a = new y[]{a};
    }
}

