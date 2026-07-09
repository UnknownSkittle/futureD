/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.b.e;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.d.b.e.a;
import org.bouncycastle.d.b.e.ad;
import org.bouncycastle.d.b.e.k;
import org.bouncycastle.d.b.e.l;
import org.bouncycastle.d.b.e.r;
import org.bouncycastle.d.b.e.y;

public class b
implements Serializable {
    private final Map<Integer, a> a = new TreeMap<Integer, a>();

    b() {
    }

    b(r r2, long l2, byte[] byArray, byte[] byArray2) {
        for (long i2 = 0L; i2 < l2; ++i2) {
            this.a(r2, i2, byArray, byArray2);
        }
    }

    private void a(r r2, long l2, byte[] byArray, byte[] byArray2) {
        y y2 = r2.c();
        int n2 = y2.c();
        long l3 = l2 >> n2;
        int n3 = ad.b(l2, n2);
        k k2 = (k)((l)new l().a(l3)).a(n3).a();
        if (n3 < (1 << n2) - 1) {
            if (this.a(0) == null || n3 == 0) {
                this.a(0, new a(y2, byArray, byArray2, k2));
            }
            this.a(0, byArray, byArray2, k2);
        }
        for (int i2 = 1; i2 < r2.b(); ++i2) {
            n3 = ad.b(l3, n2);
            k2 = (k)((l)((l)new l().d(i2)).a(l3 >>= n2)).a(n3).a();
            if (n3 >= (1 << n2) - 1) continue;
            int n4 = i2;
            n3 = n2;
            long l4 = l2;
            if (!(l4 != 0L && (l4 + 1L) % (long)Math.pow(1 << n3, n4) == 0L)) continue;
            if (this.a(i2) == null) {
                this.a(i2, new a(r2.c(), byArray, byArray2, k2));
            }
            this.a(i2, byArray, byArray2, k2);
        }
    }

    private a a(int n2) {
        return this.a.get(n2);
    }

    private a a(int n2, byte[] byArray, byte[] byArray2, k k2) {
        return this.a.put(n2, this.a.get(n2).a(byArray, byArray2, k2));
    }

    private void a(int n2, a a2) {
        this.a.put(n2, a2);
    }
}

