/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;
import org.bouncycastle.e.k;

public final class aa
extends u {
    private byte[] a;

    aa(byte[] byArray) {
        this.a = byArray;
    }

    public final String b() {
        String string = k.b(this.a);
        if (string.indexOf(45) < 0 && string.indexOf(43) < 0) {
            if (string.length() == 11) {
                return string.substring(0, 10) + "00GMT+00:00";
            }
            return string.substring(0, 12) + "GMT+00:00";
        }
        int n2 = string.indexOf(45);
        if (n2 < 0) {
            n2 = string.indexOf(43);
        }
        String string2 = string;
        if (n2 == string.length() - 3) {
            string2 = string2 + "00";
        }
        if (n2 == 10) {
            return string2.substring(0, 10) + "00GMT" + string2.substring(10, 13) + ":" + string2.substring(13, 15);
        }
        return string2.substring(0, 12) + "GMT" + string2.substring(12, 15) + ":" + string2.substring(15, 17);
    }

    final boolean a() {
        return false;
    }

    final int e() {
        int n2 = this.a.length;
        return 1 + bz.a(n2) + n2;
    }

    final void a(r r2) {
        r2.b(23);
        int n2 = this.a.length;
        r2.a(n2);
        for (int i2 = 0; i2 != n2; ++i2) {
            r2.b(this.a[i2]);
        }
    }

    final boolean a(u u2) {
        if (!(u2 instanceof aa)) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.a, ((aa)u2).a);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.a);
    }

    public final String toString() {
        return k.b(this.a);
    }
}

