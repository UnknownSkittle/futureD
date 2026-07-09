/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;

public abstract class a
extends u {
    protected final boolean a;
    protected final int b;
    protected final byte[] c;

    a(boolean bl2, int n2, byte[] byArray) {
        this.a = bl2;
        this.b = n2;
        this.c = org.bouncycastle.e.a.d(byArray);
    }

    public final boolean a() {
        return this.a;
    }

    public final byte[] b() {
        return org.bouncycastle.e.a.d(this.c);
    }

    public final int c() {
        return this.b;
    }

    public final u d() {
        byte[] byArray;
        byte[] byArray2 = byArray = this.j();
        int n2 = byArray[0] & 0x1F;
        int n3 = 1;
        if (n2 == 31) {
            ++n3;
            n2 = byArray2[1] & 0xFF;
            if ((n2 & 0x7F) == 0) {
                throw new t("corrupted stream - invalid high tag number found");
            }
            while (n2 >= 0 && (n2 & 0x80) != 0) {
                n2 = byArray2[n3++] & 0xFF;
            }
        }
        byte[] byArray3 = new byte[byArray2.length - n3 + 1];
        System.arraycopy(byArray2, n3, byArray3, 1, byArray3.length - 1);
        byArray3[0] = 16;
        byArray2 = byArray3;
        if ((byArray[0] & 0x20) != 0) {
            byArray2[0] = (byte)(byArray2[0] | 0x20);
        }
        return u.b(byArray2);
    }

    final int e() {
        return bz.b(this.b) + bz.a(this.c.length) + this.c.length;
    }

    void a(r r2) {
        int n2 = 64;
        if (this.a) {
            n2 = 96;
        }
        r2.a(n2, this.b, this.c);
    }

    final boolean a(u u2) {
        if (!(u2 instanceof a)) {
            return false;
        }
        u2 = (a)u2;
        return this.a == ((a)u2).a && this.b == ((a)u2).b && org.bouncycastle.e.a.a(this.c, ((a)u2).c);
    }

    public int hashCode() {
        return (this.a ? 1 : 0) ^ this.b ^ org.bouncycastle.e.a.c(this.c);
    }
}

