/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.bc;
import org.bouncycastle.asn1.bp;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.j.a;
import org.bouncycastle.asn1.j.c;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.u;

public class r {
    private OutputStream a;

    public r(OutputStream outputStream) {
        this.a = outputStream;
    }

    final void a(int n2) {
        if (n2 > 127) {
            int n3 = 1;
            int n4 = n2;
            while ((n4 >>>= 8) != 0) {
                ++n3;
            }
            this.b((byte)(n3 | 0x80));
            for (n3 = n3 - 1 << 3; n3 >= 0; n3 -= 8) {
                this.b((byte)(n2 >> n3));
            }
            return;
        }
        this.b((byte)n2);
    }

    void b(int n2) {
        this.a.write(n2);
    }

    final void a(byte[] byArray) {
        this.a.write(byArray);
    }

    final void a(int n2, byte[] byArray) {
        this.b(n2);
        this.a(byArray.length);
        this.a(byArray);
    }

    final void a(int n2, int n3) {
        if (n3 < 31) {
            this.b(n2 | n3);
            return;
        }
        this.b(n2 | 0x1F);
        if (n3 < 128) {
            this.b(n3);
            return;
        }
        byte[] byArray = new byte[5];
        int n4 = 5;
        --n4;
        byArray[4] = (byte)(n3 & 0x7F);
        do {
            byArray[--n4] = (byte)((n3 >>= 7) & 0x7F | 0x80);
        } while (n3 > 127);
        int n5 = 5 - n4;
        byte[] byArray2 = byArray;
        this.a.write(byArray2, n4, n5);
    }

    final void a(int n2, int n3, byte[] byArray) {
        this.a(n2, n3);
        this.a(byArray.length);
        this.a(byArray);
    }

    public void a(f f2) {
        if (f2 != null) {
            f2.h().a(this);
            return;
        }
        throw new IOException("null object detected");
    }

    final void a(u u2) {
        if (u2 != null) {
            r r2 = this;
            u2.a(new s(r2, r2.a));
            return;
        }
        throw new IOException("null object detected");
    }

    r a() {
        return new bc(this.a);
    }

    r b() {
        return new bp(this.a);
    }

    public static byte[] a(a a2, f f2) {
        try {
            return r.a(new c(a2, f2));
        } catch (Exception exception) {
            return null;
        }
    }

    private static byte[] a(c c2) {
        try {
            return c2.a("DER");
        } catch (Exception exception) {
            return null;
        }
    }
}

