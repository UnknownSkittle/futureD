/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;

public final class ap
extends u {
    private final char[] a;

    ap(char[] cArray) {
        this.a = cArray;
    }

    public final String b() {
        return new String(this.a);
    }

    public final String toString() {
        return this.b();
    }

    public final int hashCode() {
        char[] cArray = this.a;
        if (this.a == null) {
            return 0;
        }
        int n2 = cArray.length;
        int n3 = n2 + 1;
        while (--n2 >= 0) {
            n3 = n3 * 257 ^ cArray[n2];
        }
        return n3;
    }

    protected final boolean a(u object) {
        if (!(object instanceof ap)) {
            return false;
        }
        object = (ap)object;
        char[] cArray = ((ap)object).a;
        object = this.a;
        if (this.a != cArray) {
            if (object == null || cArray == null) {
                return false;
            }
            if (((Object)object).length != cArray.length) {
                return false;
            }
            for (int i2 = 0; i2 != ((Object)object).length; ++i2) {
                if (object[i2] == cArray[i2]) continue;
                return false;
            }
        }
        return true;
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.a.length << 1) + (this.a.length << 1);
    }

    final void a(r r2) {
        r2.b(30);
        r2.a(this.a.length << 1);
        for (int i2 = 0; i2 != this.a.length; ++i2) {
            char c2 = this.a[i2];
            r2.b((byte)(c2 >> 8));
            r2.b((byte)c2);
        }
    }
}

