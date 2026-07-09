/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import java.lang.reflect.Type;
import java.util.Arrays;
import net.impactclient.1i;
import net.impactclient.3j;
import net.impactclient.5_;
import net.impactclient.6f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 00
implements 1i<6f> {
    private final 3j<6f> 0;
    public static final boolean \u200e;

    private static /* synthetic */ boolean 0(String string, 6f f2) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) {
            return true;
        }
        return Arrays.stream(f2.4).anyMatch(string2 -> {
            boolean bl2 = \u200e;
            if (bl2 || bl2) {
                return true;
            }
            return string2.equalsIgnoreCase(string);
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    public 00(3j<6f> j2) {
        block3: {
            block2: {
                boolean bl2 = \u200e;
                if (bl2 || bl2) break block2;
                this.0 = j2;
                if (!bl2 && !bl2) break block3;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean 0(Type type) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) return true;
        if (type instanceof Class) {
            if (bl2) return true;
            if (6f.class.isAssignableFrom((Class)type)) {
                if (bl2) return true;
                return (int)((long)-42262224 ^ (long)-42262223) != 0;
            }
        }
        if (!bl2) return (int)((long)1157332434 ^ (long)1157332434) != 0;
        return true;
    }

    @Override
    public final /* synthetic */ Object 0(5_ _, Type object, String string) {
        boolean bl2 = \u200e;
        if (bl2 || bl2) {
            return null;
        }
        object = string;
        return this.0.stream().filter(arg_0 -> 00.0((String)object, arg_0)).findFirst().orElse(null);
    }
}

