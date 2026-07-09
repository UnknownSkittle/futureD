/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.k.ab;
import org.bouncycastle.b.ah;
import org.bouncycastle.b.an;
import org.bouncycastle.b.ar;
import org.bouncycastle.b.c;
import org.bouncycastle.math.ec.a.c.bo;
import org.bouncycastle.openpgp.aj;
import org.bouncycastle.openpgp.ao;
import org.bouncycastle.openpgp.h;
import org.bouncycastle.openpgp.m;

public abstract class p {
    p() {
    }

    static c a(InputStream inputStream) {
        if (inputStream instanceof c) {
            return (c)inputStream;
        }
        return new c(inputStream);
    }

    static an a(c c2) {
        if (c2.a() == 12) {
            return (an)c2.b();
        }
        return null;
    }

    static List b(c c2) {
        try {
            ArrayList<aj> arrayList = new ArrayList<aj>();
            while (c2.a() == 2) {
                ah ah2 = (ah)c2.b();
                an an2 = p.a(c2);
                arrayList.add(new aj(ah2, an2));
            }
            return arrayList;
        } catch (m m2) {
            throw new IOException("can't create signature object: " + m2.getMessage() + ", cause: " + m2.a.toString());
        }
    }

    static void a(c c2, List list, List list2, List list3) {
        while (c2.a() == 13 || c2.a() == 17) {
            bo bo2 = c2.b();
            if (bo2 instanceof ar) {
                bo2 = (ar)bo2;
                list.add(bo2);
            } else {
                bo2 = (org.bouncycastle.b.ao)bo2;
                list.add(new ao(((org.bouncycastle.b.ao)bo2).a()));
            }
            list2.add(p.a(c2));
            list3.add(p.b(c2));
        }
    }

    public static void a(int[] nArray, int[] nArray2) {
        h.f(nArray, nArray2);
        h.g(nArray, nArray2);
        int n2 = h.b(nArray2, nArray2);
        int n3 = n2 + h.a(nArray2, 0, nArray2, 8, 0);
        n2 += h.a(nArray2, 24, nArray2, 16, n3);
        int[] nArray3 = new int[8];
        h.c(nArray, nArray, nArray3);
        nArray = new int[16];
        h.f(nArray3, nArray);
        ab.a(32, n2 += ab.b(16, nArray, nArray2, 8), nArray2, 24);
    }
}

