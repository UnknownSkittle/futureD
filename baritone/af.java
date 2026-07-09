/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class af
extends Enum<af>
implements IArgParser$Stateless<Long> {
    public static final /* enum */ af a = new af("INSTANCE");
    private static final /* synthetic */ af[] a;

    public static af[] values() {
        return (af[])a.clone();
    }

    public static af valueOf(String string) {
        return Enum.valueOf(af.class, string);
    }

    @Override
    public final Class<Long> getTarget() {
        return Long.class;
    }

    @Override
    public final /* synthetic */ Object parseArg(ICommandArgument iCommandArgument) {
        return Long.parseLong(iCommandArgument.getValue());
    }

    static {
        a = new af[]{a};
    }
}

