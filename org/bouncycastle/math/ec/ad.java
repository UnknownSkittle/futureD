/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.a;
import org.bouncycastle.math.ec.af;
import org.bouncycastle.math.ec.p;
import org.bouncycastle.math.ec.x;

public final class ad
extends a {
    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected final p b(p p2, BigInteger object) {
        int n2 = Math.max(2, Math.min(16, af.a(((BigInteger)object).bitLength())));
        p[] pArray = af.a(p2, n2);
        p[] pArray2 = pArray.a();
        pArray = pArray.b();
        object = af.a(n2, (BigInteger)object);
        p2 = p2.c().e();
        boolean bl2 = true;
        while (true) {
            Object object2;
            int n3;
            int n4;
            block6: {
                block5: {
                    p[] pArray3;
                    if (!bl2 || (bl2 = false)) break block5;
                    n4 = ((Object)object).length;
                    if (n4 <= 1) break block6;
                    Object object3 = object[--n4];
                    reference var8_12 = object3 >> 16;
                    int n5 = object3 & 0xFFFF;
                    n3 = Math.abs((int)var8_12);
                    p[] pArray4 = pArray3 = var8_12 < 0 ? pArray : pArray2;
                    if (n3 << 2 < 1 << n2) {
                        byte by2 = x.a[n3];
                        int n6 = n2 - by2;
                        int n7 = n3 ^ 1 << by2 - 1;
                        n2 = (1 << n2 - 1) - 1;
                        n7 = (n7 << n6) + 1;
                        p2 = pArray3[n2 >>> 1].b(pArray3[n7 >>> 1]);
                        int n8 = n5 - n6;
                    } else {
                        p2 = pArray3[n3 >>> 1];
                    }
                }
                p2 = p2.b((int)object2);
            }
            if (n4 <= 0) {
                return p2;
            }
            object2 = object[--n4];
            reference var8_14 = object2 >> 16;
            object2 = object2 & 0xFFFF;
            n3 = Math.abs((int)var8_14);
            p p3 = (var8_14 < 0 ? pArray : pArray2)[n3 >>> 1];
            p2 = p2.c(p3);
        }
    }
}

