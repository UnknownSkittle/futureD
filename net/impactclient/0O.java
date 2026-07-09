/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package net.impactclient;

import net.impactclient.5L;
import net.impactclient.5m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@FunctionalInterface
public interface 0O {
    public static final boolean \u2004;

    public 5m 0(5L var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    default public String 1(String string) {
        boolean bl2 = \u2004;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return this.0(5L.a).0(string);
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return string;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    default public String 0(String string) {
        boolean bl2 = \u2004;
        if (bl2) return null;
        try {
            if (bl2) return null;
            return this.0(5L.b).1(string);
        } catch (Exception exception) {
            exception.printStackTrace();
            if (bl2 || bl2) return null;
            return null;
        }
    }
}

