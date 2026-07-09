/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.tools;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.j;

public class F2mSqrtOptimizer {
    public static void main(String[] object) {
        object = new TreeSet(F2mSqrtOptimizer.a(a.b()));
        object.addAll(F2mSqrtOptimizer.a(org.bouncycastle.crypto.c.a.a()));
        object = object.iterator();
        while (object.hasNext()) {
            Object object2 = (String)object.next();
            Object object3 = org.bouncycastle.crypto.c.a.a((String)object2);
            if (object3 == null) {
                object3 = a.a((String)object2);
            }
            if (object3 == null || !b.a(((aa)object3).a().f())) continue;
            System.out.print((String)object2 + ":");
            object2 = ((aa)object3).a().a(BigInteger.valueOf(2L));
            object3 = ((j)object2).g();
            System.out.println(((j)object3).a().toString(16).toUpperCase());
            if (((j)object3).e().equals(object2)) continue;
            throw new IllegalStateException("Optimized-sqrt sanity check failed");
        }
    }

    private static ArrayList a(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }
}

