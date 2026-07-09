/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ae
extends Enum<ae>
implements IArgParser$Stateless<Integer> {
    public static final /* enum */ ae a = new ae("INSTANCE");
    private static final /* synthetic */ ae[] a;

    public static ae[] values() {
        return (ae[])a.clone();
    }

    public static ae valueOf(String string) {
        return Enum.valueOf(ae.class, string);
    }

    @Override
    public final Class<Integer> getTarget() {
        return Integer.class;
    }

    @Override
    public final /* synthetic */ Object parseArg(ICommandArgument iCommandArgument) {
        return Integer.parseInt(iCommandArgument.getValue());
    }

    static {
        a = new ae[]{a};
    }
}

