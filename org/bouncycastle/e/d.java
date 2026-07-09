/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.e;

import org.bouncycastle.crypto.b.k;
import org.bouncycastle.e.a;

public final class d {
    private static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] b;

    public d(byte[] byArray) {
        k k2 = new k(160);
        k2.a(byArray, 0, byArray.length);
        byArray = new byte[k2.b()];
        k2.a(byArray, 0);
        this.b = byArray;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 != this.b.length; ++i2) {
            if (i2 > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(a[this.b[i2] >>> 4 & 0xF]);
            stringBuffer.append(a[this.b[i2] & 0xF]);
        }
        return stringBuffer.toString();
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof d) {
            return org.bouncycastle.e.a.a(((d)object).b, this.b);
        }
        return false;
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.b);
    }
}

