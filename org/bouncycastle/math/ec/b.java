/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.a.a;
import org.bouncycastle.math.a.f;
import org.bouncycastle.math.ec.af;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.v;

public final class b {
    public static boolean a(a a2) {
        return a2.b() > 1 && a2.a().equals(c.c) && a2 instanceof f;
    }

    public static boolean b(a a2) {
        return a2.b() == 1;
    }

    public static void a(j[] jArray, int n2, j j2) {
        j[] jArray2 = new j[n2];
        j[] jArray3 = jArray2;
        jArray2[0] = jArray[0];
        int n3 = 0;
        while (++n3 < n2) {
            jArray3[n3] = jArray3[n3 - 1].c(jArray[n3]);
        }
        --n3;
        if (j2 != null) {
            jArray3[n3] = jArray3[n3].c(j2);
        }
        j j3 = jArray3[n3].f();
        while (n3 > 0) {
            int n4 = 0 + n3--;
            j j4 = jArray[n4];
            jArray[n4] = jArray3[n3].c(j3);
            j3 = j3.c(j4);
        }
        jArray[0] = j3;
    }

    static p a(p pArray, BigInteger pArray2, v pArray3, BigInteger pArray4) {
        boolean bl2 = pArray2.signum() < 0;
        boolean bl3 = pArray4.signum() < 0;
        pArray2 = pArray2.abs();
        pArray4 = pArray4.abs();
        int n2 = Math.max(2, Math.min(16, af.a(Math.max(pArray2.bitLength(), pArray4.bitLength()))));
        pArray3 = af.a((p)pArray, n2, (v)pArray3);
        pArray = af.a((p)pArray);
        pArray3 = af.a((p)pArray3);
        Object object = bl2 ? pArray.b() : pArray.a();
        Object object2 = bl3 ? pArray3.b() : pArray3.a();
        pArray = bl2 ? pArray.a() : pArray.b();
        pArray3 = bl3 ? pArray3.a() : pArray3.b();
        pArray2 = (p[])af.b(n2, (BigInteger)pArray2);
        p[] pArray5 = pArray4 = (p[])af.b(n2, (BigInteger)pArray4);
        p[] pArray6 = pArray3;
        pArray4 = object2;
        pArray3 = pArray2;
        pArray2 = pArray;
        pArray = object;
        n2 = Math.max(pArray3.length, pArray5.length);
        object2 = object = pArray[0].c().e();
        int n3 = 0;
        --n2;
        while (n2 >= 0) {
            int n4;
            int n5 = (int)(n2 < pArray3.length ? pArray3[n2] : 0);
            Object object3 = n4 = (Object)(n2 < pArray5.length ? pArray5[n2] : 0);
            if (!(n5 | n4)) {
                ++n3;
            } else {
                int n6;
                Object object4 = object;
                if (n5 != 0) {
                    n6 = Math.abs(n5);
                    p[] pArray7 = n5 < 0 ? pArray2 : pArray;
                    object4 = ((p)object4).b(pArray7[n6 >>> 1]);
                }
                if (n4 != 0) {
                    n6 = Math.abs(n4);
                    p[] pArray8 = n4 < 0 ? pArray6 : pArray4;
                    object4 = ((p)object4).b(pArray8[n6 >>> 1]);
                }
                if (n3 > 0) {
                    object2 = ((p)object2).b(n3);
                    n3 = 0;
                }
                object2 = ((p)object2).c((p)object4);
            }
            --n2;
        }
        if (n3 > 0) {
            object2 = ((p)object2).b(n3);
        }
        return object2;
    }
}

