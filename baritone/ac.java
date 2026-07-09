/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ac
extends Enum<ac>
implements IArgParser$Stateless<Double> {
    public static final /* enum */ ac a = new ac("INSTANCE");
    private static final /* synthetic */ ac[] a;

    public static ac[] values() {
        return (ac[])a.clone();
    }

    public static ac valueOf(String string) {
        return Enum.valueOf(ac.class, string);
    }

    @Override
    public final Class<Double> getTarget() {
        return Double.class;
    }

    @Override
    public final /* synthetic */ Object parseArg(ICommandArgument object) {
        if (!((String)(object = object.getValue())).matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
            throw new IllegalArgumentException("failed double format check");
        }
        return Double.parseDouble((String)object);
    }

    static {
        a = new ac[]{a};
    }
}

