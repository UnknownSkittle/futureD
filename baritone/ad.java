/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package baritone;

import baritone.api.command.argparser.IArgParser$Stateless;
import baritone.api.command.argument.ICommandArgument;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ad
extends Enum<ad>
implements IArgParser$Stateless<Float> {
    public static final /* enum */ ad a = new ad("INSTANCE");
    private static final /* synthetic */ ad[] a;

    public static ad[] values() {
        return (ad[])a.clone();
    }

    public static ad valueOf(String string) {
        return Enum.valueOf(ad.class, string);
    }

    @Override
    public final Class<Float> getTarget() {
        return Float.class;
    }

    @Override
    public final /* synthetic */ Object parseArg(ICommandArgument object) {
        if (!((String)(object = object.getValue())).matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
            throw new IllegalArgumentException("failed float format check");
        }
        return Float.valueOf(Float.parseFloat((String)object));
    }

    static {
        a = new ad[]{a};
    }
}

