/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ain
 */
package net.impactclient;

import java.lang.reflect.Type;
import java.util.function.Function;
import java.util.regex.Matcher;
import net.impactclient.1i;
import net.impactclient.5_;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 6N
implements 1i<ain> {
    public static final boolean \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;

    private static /* synthetic */ String 0(int n2, Matcher matcher) {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return matcher.group(n2);
    }

    public static Function<Matcher, String> 0() {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return arg_0 -> 6N.0((int)((long)982025845 ^ (long)982025844), arg_0);
    }

    public static Function<String, String> 0(String string) {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return string2 -> {
            boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
            if (bl2 || bl2) {
                return null;
            }
            return string + string2;
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(Type type) {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2 || bl2) return true;
        if (type instanceof Class) {
            if (bl2) return true;
            if (ain.class.isAssignableFrom((Class)type)) {
                if (bl2) return true;
                return (int)((long)1870302246 ^ (long)1870302247) != 0;
            }
        }
        if (!bl2) return (int)((long)546082136 ^ (long)546082136) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 6N() {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2) {
            return;
        }
    }

    @Override
    public final /* synthetic */ Object 0(5_ _, Type type, String string) {
        boolean bl2 = \u200b\u2005\u2002\u2006\u2007\u2001\u2009\u200a\u200e;
        if (bl2 || bl2) {
            return null;
        }
        return ain.b((String)string);
    }
}

