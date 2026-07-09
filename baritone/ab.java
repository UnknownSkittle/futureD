/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ab
implements IArgParser$Stateless<Boolean> {
    public static final ab a = new ab();
    private static List<String> a;
    private static List<String> b;

    @Override
    public final Class<Boolean> getTarget() {
        return Boolean.class;
    }

    @Override
    public final /* synthetic */ Object parseArg(ICommandArgument object) {
        if (a.contains(((String)(object = object.getValue())).toLowerCase(Locale.US))) {
            return Boolean.TRUE;
        }
        if (b.contains(((String)object).toLowerCase(Locale.US))) {
            return Boolean.FALSE;
        }
        throw new IllegalArgumentException("invalid boolean");
    }

    static {
        a = Arrays.asList("1", "true", "yes", "t", "y", "on", "enable");
        b = Arrays.asList("0", "false", "no", "f", "n", "off", "disable");
    }
}

