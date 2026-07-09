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
public final class 4n<T extends 1J>
extends 4N<T> {
    public static final boolean \u2001\u2008\u2008\u2003\u2008\u2002\u200d;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final /* synthetic */ boolean test(Object classArray) {
        int n2;
        block4: {
            boolean bl2 = \u2001\u2008\u2008\u2003\u2008\u2002\u200d;
            if (bl2 || bl2) return true;
            1J j2 = (1J)classArray;
            classArray = this.0;
            int n3 = this.0.length;
            if (bl2) return true;
            int n4 = (int)((long)-1352387421 ^ (long)-1352387421);
            String[] stringArray = 7b.0();
            if (bl2) return true;
            while (!bl2) {
                if (n4 < n3) {
                    if (bl2) return true;
                    n2 = classArray[n4].isAssignableFrom(j2.0.getClass()) ? 1 : 0;
                    if (stringArray == null) return n2 != 0;
                    if (n2 != 0) {
                        if (bl2 || bl2) return true;
                        return (int)((long)1924795792 ^ (long)1924795793) != 0;
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
        n2 = (int)((long)1873020690 ^ (long)1873020690);
        return n2 != 0;
    }

    @SafeVarargs
    public 4n(Class<? extends ht<?>> ... classArray) {
        boolean bl2 = \u2001\u2008\u2008\u2003\u2008\u2002\u200d;
        super(classArray);
    }
}

