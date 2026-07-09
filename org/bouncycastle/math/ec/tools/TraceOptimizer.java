/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.tools;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;

public class TraceOptimizer {
    private static final BigInteger a = BigInteger.valueOf(1L);
    private static final SecureRandom b = new SecureRandom();

    public static void main(String[] object) {
        object = new TreeSet(TraceOptimizer.a(org.bouncycastle.asn1.util.a.b()));
        object.addAll(TraceOptimizer.a(org.bouncycastle.crypto.c.a.a()));
        object = object.iterator();
        while (object.hasNext()) {
            String string = (String)object.next();
            aa aa2 = org.bouncycastle.crypto.c.a.a(string);
            if (aa2 == null) {
                aa2 = org.bouncycastle.asn1.util.a.a(string);
            }
            if (aa2 == null || !org.bouncycastle.math.ec.b.a(aa2.a().f())) continue;
            System.out.print(string + ":");
            TraceOptimizer.a(aa2);
        }
    }

    private static void a(aa object) {
        BigInteger bigInteger;
        int n2;
        object = ((aa)object).a();
        int n3 = ((d)object).a();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (n2 = 0; n2 < n3; ++n2) {
            bigInteger = a.shiftLeft(n2);
            if (TraceOptimizer.a(((d)object).a(bigInteger)) == 0) continue;
            arrayList.add(n2);
            System.out.print(" ".concat(String.valueOf(n2)));
        }
        System.out.println();
        for (n2 = 0; n2 < 1000; ++n2) {
            bigInteger = new BigInteger(n3, b);
            int n4 = TraceOptimizer.a(((d)object).a(bigInteger));
            int n5 = 0;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                int n6 = (Integer)arrayList.get(i2);
                if (!bigInteger.testBit(n6)) continue;
                n5 ^= 1;
            }
            if (n4 == n5) continue;
            throw new IllegalStateException("Optimized-trace sanity check failed");
        }
    }

    private static int a(j j2) {
        int n2 = j2.b();
        j j3 = j2;
        for (int i2 = 1; i2 < n2; ++i2) {
            j2 = j2.e();
            j3 = j3.a(j2);
        }
        BigInteger bigInteger = j3.a();
        if (bigInteger.bitLength() > 1) {
            throw new IllegalStateException();
        }
        return bigInteger.intValue();
    }

    private static ArrayList a(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }
}

