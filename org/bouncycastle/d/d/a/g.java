/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.d.a;

import org.bouncycastle.d.d.a.b;
import org.bouncycastle.d.d.a.f;

public final class g {
    private b a;
    private f b;
    private f[] c;
    private f[] d;

    public g(b b2, f f2) {
        this.a = b2;
        this.b = f2;
        this.b();
        this.c();
    }

    public final f[] a() {
        return this.d;
    }

    private void b() {
        Object object;
        int n2;
        int n3 = this.b.a();
        this.c = new f[n3];
        for (n2 = 0; n2 < n3 >> 1; ++n2) {
            int[] nArray = new int[(n2 << 1) + 1];
            object = nArray;
            nArray[n2 << 1] = 1;
            this.c[n2] = new f(this.a, (int[])object);
        }
        for (n2 = n3 >> 1; n2 < n3; ++n2) {
            int[] nArray = new int[(n2 << 1) + 1];
            object = nArray;
            nArray[n2 << 1] = 1;
            object = new f(this.a, (int[])object);
            this.c[n2] = ((f)object).b(this.b);
        }
    }

    private void c() {
        int n2;
        int n3 = this.b.a();
        f[] fArray = new f[n3];
        for (n2 = n3 - 1; n2 >= 0; --n2) {
            fArray[n2] = new f(this.c[n2]);
        }
        this.d = new f[n3];
        for (n2 = n3 - 1; n2 >= 0; --n2) {
            this.d[n2] = new f(this.a, n2);
        }
        for (n2 = 0; n2 < n3; ++n2) {
            int n4;
            int n5;
            if (fArray[n2].a(n2) == 0) {
                n5 = 0;
                for (n4 = n2 + 1; n4 < n3; ++n4) {
                    if (fArray[n4].a(n2) == 0) continue;
                    n5 = 1;
                    g.a(fArray, n2, n4);
                    g.a(this.d, n2, n4);
                    n4 = n3;
                }
                if (n5 == 0) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            n5 = fArray[n2].a(n2);
            n4 = this.a.a(n5);
            fArray[n2].d(n4);
            this.d[n2].d(n4);
            for (n4 = 0; n4 < n3; ++n4) {
                if (n4 == n2 || (n5 = fArray[n4].a(n2)) == 0) continue;
                f f2 = fArray[n2].c(n5);
                f f3 = this.d[n2].c(n5);
                fArray[n4].a(f2);
                this.d[n4].a(f3);
            }
        }
    }

    private static void a(f[] fArray, int n2, int n3) {
        f f2 = fArray[n2];
        fArray[n2] = fArray[n3];
        fArray[n3] = f2;
    }
}

