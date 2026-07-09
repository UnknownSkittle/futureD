/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.reflect.Type;
import net.impactclient.0rB$1f;
import net.impactclient.1i;
import net.impactclient.3j;
import net.impactclient.5_;
import net.impactclient.73;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 5K
implements 1i<73> {
    private final 3j<73> 0;
    public static final boolean \u2008\u200c\u2001\u2001\u200d\u2006;

    @Override
    public final /* synthetic */ Object 0(5_ object, Type object2, String string) {
        boolean bl2 = \u2008\u200c\u2001\u2001\u200d\u2006;
        if (bl2 || bl2) {
            return null;
        }
        object2 = string;
        object = this;
        return ((5K)object).0.stream().filter(arg_0 -> ((5K)object).0((String)object2, arg_0)).findFirst().orElse(null);
    }

    private /* synthetic */ boolean 0(String string, 73 var2_2) {
        boolean bl2 = \u2008\u200c\u2001\u2001\u200d\u2006;
        if (bl2 || bl2) {
            return true;
        }
        return 5K.0(var2_2.2()).equals(5K.0(string));
    }

    private static String 0(String string) {
        boolean bl2 = \u2008\u200c\u2001\u2001\u200d\u2006;
        if (bl2 || bl2) {
            return null;
        }
        return string.replace(0rB$1f.XNZw("\u3795", -541519529), 0rB$1f.XNZw("", -1087520535)).replace(0rB$1f.XNZw("\u3865", -590733608), 0rB$1f.XNZw("", -935703901)).toLowerCase();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(Type type) {
        boolean bl2 = \u2008\u200c\u2001\u2001\u200d\u2006;
        if (bl2 || bl2) return true;
        if (type instanceof Class) {
            if (bl2) return true;
            if (73.class.isAssignableFrom((Class)type)) {
                if (bl2) return true;
                return (int)((long)-984984946 ^ (long)-984984945) != 0;
            }
        }
        if (!bl2) return (int)((long)-1019619384 ^ (long)-1019619384) != 0;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public 5K(3j<73> j2) {
        block3: {
            block2: {
                boolean bl2 = \u2008\u200c\u2001\u2001\u200d\u2006;
                if (bl2 || bl2) break block2;
                this.0 = j2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }
}

