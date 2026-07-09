/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  ht
 */
package net.impactclient;

import net.impactclient.1J;
import net.impactclient.4N;
import net.impactclient.7b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class 41<T extends 1J>
extends 4N<T> {
    public static final boolean \u2005\u200a\u200e;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ boolean test(Object classArray) {
        int n2;
        block4: {
            boolean bl2 = \u2005\u200a\u200e;
            if (bl2) return true;
            1J j2 = (1J)classArray;
            classArray = this.0;
            int n3 = this.0.length;
            String[] stringArray = 7b.0();
            if (bl2) return true;
            int n4 = (int)((long)-959971403 ^ (long)-959971403);
            if (bl2) return true;
            while (!bl2) {
                if (n4 < n3) {
                    if (bl2) return true;
                    n2 = classArray[n4].equals(j2.0.getClass()) ? 1 : 0;
                    if (stringArray == null) return n2 != 0;
                    if (n2 != 0) {
                        if (bl2 || bl2) return true;
                        return (int)((long)-725511786 ^ (long)-725511785) != 0;
                    }
                    if (bl2) return true;
                    ++n4;
                    if (bl2) return true;
                    if (stringArray != null) continue;
                    if (bl2) return true;
                }
                if (!bl2) break block4;
            }
            return true;
        }
        n2 = (int)((long)-1015350468 ^ (long)-1015350468);
        return n2 != 0;
    }

    @SafeVarargs
    public 41(Class<? extends ht<?>> ... classArray) {
        boolean bl2 = \u2005\u200a\u200e;
        super(classArray);
    }
}

