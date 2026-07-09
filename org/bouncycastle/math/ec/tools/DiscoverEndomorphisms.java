/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec.tools;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.math.ec.b;
import org.bouncycastle.math.ec.c;
import org.bouncycastle.math.ec.d;
import org.bouncycastle.math.ec.j;
import org.bouncycastle.math.ec.n;
import org.bouncycastle.math.ec.p;

public class DiscoverEndomorphisms {
    public static void main(String[] stringArray) {
        if (stringArray.length <= 0) {
            System.err.println("Expected a list of curve names as arguments");
            return;
        }
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            Object object = stringArray[i2];
            Object object2 = a.a((String)object);
            if (object2 == null) {
                System.err.println("Unknown curve: ".concat(String.valueOf(object)));
                continue;
            }
            Object object3 = object2.a();
            if (!b.b(object3.f())) continue;
            BigInteger bigInteger = object3.f().a();
            if (!object3.g().j() || !bigInteger.mod(c.d).equals(c.b)) continue;
            System.out.println("Curve '" + (String)object + "' has a 'GLV Type B' endomorphism with these parameters:");
            object = object2;
            bigInteger = c.b;
            object3 = bigInteger;
            object2 = ((aa)object).c();
            object3 = object3.multiply((BigInteger)object3).subtract(bigInteger.shiftLeft(2)).mod((BigInteger)object2);
            object3 = new n((BigInteger)object2, (BigInteger)object3).g().a();
            bigInteger = object2.subtract((BigInteger)object3);
            if (object3.testBit(0)) {
                bigInteger = bigInteger.add((BigInteger)object2);
            } else {
                object3 = object3.add((BigInteger)object2);
            }
            object2 = new BigInteger[]{object3.shiftRight(1), bigInteger.shiftRight(1)};
            object3 = DiscoverEndomorphisms.a(((aa)object).a());
            DiscoverEndomorphisms.a((aa)object, object2[0], object3);
            System.out.println("OR");
            DiscoverEndomorphisms.a((aa)object, object2[1], object3);
        }
    }

    private static void a(aa object, BigInteger bigInteger, j[] objectArray) {
        Object object2;
        BigInteger bigInteger2;
        BigInteger[] bigIntegerArray = ((aa)object).b().m();
        Object object3 = bigIntegerArray.a(bigInteger).m();
        if (!bigIntegerArray.h().equals(((p)object3).h())) {
            throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
        }
        j j2 = objectArray[0];
        if (!bigIntegerArray.g().c(j2).equals(((p)object3).g())) {
            j2 = objectArray[1];
            if (!bigIntegerArray.g().c(j2).equals(((p)object3).g())) {
                throw new IllegalStateException("Derivation of GLV Type B parameters failed unexpectedly");
            }
        }
        object = ((aa)object).c();
        bigIntegerArray = DiscoverEndomorphisms.a((BigInteger)object, bigInteger);
        objectArray = new BigInteger[]{bigIntegerArray[2], bigIntegerArray[3].negate()};
        Object object4 = new BigInteger[]{bigIntegerArray[4], bigIntegerArray[5].negate()};
        Object object5 = new BigInteger[]{bigIntegerArray[0], bigIntegerArray[1].negate()};
        bigIntegerArray = DiscoverEndomorphisms.a((BigInteger[])object5, (BigInteger[])object4) ? object5 : object4;
        object4 = object;
        object5 = bigIntegerArray;
        if (!DiscoverEndomorphisms.b(bigIntegerArray[0].abs().max(object5[1].abs()), (BigInteger)object4) && ((BigInteger)objectArray[0]).gcd((BigInteger)objectArray[1]).equals(c.b) && (object5 = DiscoverEndomorphisms.a(new BigInteger[]{(bigInteger2 = ((BigInteger)(object3 = objectArray[0])).add(((BigInteger)(object2 = objectArray[1])).multiply(bigInteger)).divide((BigInteger)object)).abs(), ((BigInteger)object2).abs()})) != null) {
            BigInteger[] bigIntegerArray2;
            BigInteger bigInteger3 = object5[0];
            object5 = object5[1];
            if (bigInteger2.signum() < 0) {
                bigInteger3 = bigInteger3.negate();
            }
            if (((BigInteger)object2).signum() > 0) {
                object5 = ((BigInteger)object5).negate();
            }
            if (!bigInteger2.multiply(bigInteger3).subtract(((BigInteger)object2).multiply((BigInteger)object5)).equals(c.b)) {
                throw new IllegalStateException();
            }
            bigInteger2 = ((BigInteger)object5).multiply((BigInteger)object).subtract(bigInteger3.multiply(bigInteger));
            object5 = bigInteger3.negate();
            object4 = bigInteger2.negate();
            BigInteger[] bigIntegerArray3 = DiscoverEndomorphisms.a(((BigInteger)object).subtract(c.b)).add(c.b);
            object5 = DiscoverEndomorphisms.a((BigInteger)object5, (BigInteger)bigIntegerArray3, (BigInteger)object2);
            if ((bigIntegerArray3 = ((BigInteger)object5[0]).max((object4 = DiscoverEndomorphisms.a((BigInteger)object4, (BigInteger)bigIntegerArray3, (BigInteger)object3))[0])).compareTo((BigInteger)(object5 = ((BigInteger)object5[1]).min(object4[1]))) > 0) {
                bigIntegerArray2 = null;
            } else {
                BigInteger[] bigIntegerArray4 = new BigInteger[2];
                bigIntegerArray4[0] = bigIntegerArray3;
                bigIntegerArray2 = bigIntegerArray4;
                bigIntegerArray4[1] = object5;
            }
            object5 = bigIntegerArray2;
            if (bigIntegerArray2 != null) {
                object4 = object5[0];
                while (((BigInteger)object4).compareTo((BigInteger)object5[1]) <= 0) {
                    bigIntegerArray3 = new BigInteger[]{bigInteger2.add(((BigInteger)object4).multiply((BigInteger)object3)), bigInteger3.add(((BigInteger)object4).multiply((BigInteger)object2))};
                    if (DiscoverEndomorphisms.a(bigIntegerArray3, bigIntegerArray)) {
                        bigIntegerArray = bigIntegerArray3;
                    }
                    object4 = ((BigInteger)object4).add(c.b);
                }
            }
        }
        object3 = ((BigInteger)objectArray[0]).multiply(bigIntegerArray[1]).subtract(((BigInteger)objectArray[1]).multiply(bigIntegerArray[0]));
        int n2 = ((BigInteger)object).bitLength() + 16 - (((BigInteger)object).bitLength() & 7);
        bigInteger2 = DiscoverEndomorphisms.d(bigIntegerArray[1].shiftLeft(n2), (BigInteger)object3);
        object5 = DiscoverEndomorphisms.d(((BigInteger)objectArray[1]).shiftLeft(n2), (BigInteger)object3).negate();
        DiscoverEndomorphisms.a("Beta", j2.a().toString(16));
        DiscoverEndomorphisms.a("Lambda", bigInteger.toString(16));
        DiscoverEndomorphisms.a("v1", "{ " + ((BigInteger)objectArray[0]).toString(16) + ", " + ((BigInteger)objectArray[1]).toString(16) + " }");
        DiscoverEndomorphisms.a("v2", "{ " + bigIntegerArray[0].toString(16) + ", " + bigIntegerArray[1].toString(16) + " }");
        DiscoverEndomorphisms.a("d", ((BigInteger)object3).toString(16));
        DiscoverEndomorphisms.a("(OPT) g1", bigInteger2.toString(16));
        DiscoverEndomorphisms.a("(OPT) g2", ((BigInteger)object5).toString(16));
        DiscoverEndomorphisms.a("(OPT) bits", Integer.toString(n2));
    }

    private static void a(String string, Object object) {
        StringBuffer stringBuffer = new StringBuffer("  ");
        stringBuffer.append(string);
        while (stringBuffer.length() < 20) {
            stringBuffer.append(' ');
        }
        stringBuffer.append("= ");
        stringBuffer.append(object.toString());
        System.out.println(stringBuffer.toString());
    }

    private static BigInteger[] a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        BigInteger bigInteger4 = bigInteger.subtract(bigInteger2).divide(bigInteger3);
        bigInteger = bigInteger.add(bigInteger2).divide(bigInteger3);
        return DiscoverEndomorphisms.c(bigInteger4, bigInteger);
    }

    private static BigInteger[] a(BigInteger[] object) {
        boolean bl2 = object[0].compareTo(object[1]) < 0;
        if (bl2) {
            DiscoverEndomorphisms.b((BigInteger[])object);
        }
        Object object2 = object[0];
        object = object[1];
        BigInteger bigInteger = c.b;
        BigInteger bigInteger2 = c.a;
        BigInteger bigInteger3 = c.a;
        BigInteger bigInteger4 = c.b;
        while (((BigInteger)object).compareTo(c.b) > 0) {
            object2 = object2.divideAndRemainder((BigInteger)object);
            BigInteger bigInteger5 = object2[0];
            BigInteger bigInteger6 = object2[1];
            BigInteger bigInteger7 = bigInteger.subtract(bigInteger5.multiply(bigInteger2));
            bigInteger5 = bigInteger3.subtract(bigInteger5.multiply(bigInteger4));
            object2 = object;
            object = bigInteger6;
            bigInteger = bigInteger2;
            bigInteger2 = bigInteger7;
            bigInteger3 = bigInteger4;
            bigInteger4 = bigInteger5;
        }
        if (((BigInteger)object).signum() <= 0) {
            return null;
        }
        object2 = new BigInteger[]{bigInteger2, bigInteger4};
        if (bl2) {
            DiscoverEndomorphisms.b(object2);
        }
        return object2;
    }

    private static BigInteger[] a(BigInteger bigInteger, BigInteger object) {
        BigInteger bigInteger2 = bigInteger;
        BigInteger bigInteger3 = c.a;
        BigInteger bigInteger4 = c.b;
        while (true) {
            Object object2 = bigInteger2.divideAndRemainder((BigInteger)object);
            BigInteger bigInteger5 = object2[0];
            object2 = object2[1];
            bigInteger5 = bigInteger3.subtract(bigInteger5.multiply(bigInteger4));
            if (DiscoverEndomorphisms.b((BigInteger)object, bigInteger)) {
                return new BigInteger[]{bigInteger2, bigInteger3, object, bigInteger4, object2, bigInteger5};
            }
            bigInteger2 = object;
            object = object2;
            bigInteger3 = bigInteger4;
            bigInteger4 = bigInteger5;
        }
    }

    private static boolean b(BigInteger bigInteger, BigInteger bigInteger2) {
        block2: {
            block3: {
                bigInteger = bigInteger.abs();
                bigInteger2 = bigInteger2.abs();
                int n2 = bigInteger2.bitLength();
                int n3 = bigInteger.bitLength() << 1;
                if (n3 - 1 > n2) break block2;
                if (n3 < n2) break block3;
                BigInteger bigInteger3 = bigInteger;
                if (bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0) break block2;
            }
            return true;
        }
        return false;
    }

    private static boolean a(BigInteger[] object, BigInteger[] object2) {
        boolean bl2;
        BigInteger bigInteger = object[0].abs();
        object = object[1].abs();
        BigInteger bigInteger2 = object2[0].abs();
        object2 = object2[1].abs();
        boolean bl3 = bigInteger.compareTo(bigInteger2) < 0;
        boolean bl4 = bl2 = ((BigInteger)object).compareTo((BigInteger)object2) < 0;
        if (bl3 == bl2) {
            return bl3;
        }
        BigInteger bigInteger3 = bigInteger;
        Object object3 = object;
        object = bigInteger3.multiply(bigInteger3).add(((BigInteger)object3).multiply((BigInteger)object3));
        BigInteger bigInteger4 = bigInteger2;
        Object object4 = object2;
        object2 = bigInteger4.multiply(bigInteger4).add(((BigInteger)object4).multiply((BigInteger)object4));
        return ((BigInteger)object).compareTo((BigInteger)object2) < 0;
    }

    private static BigInteger[] c(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return new BigInteger[]{bigInteger, bigInteger2};
        }
        return new BigInteger[]{bigInteger2, bigInteger};
    }

    private static BigInteger d(BigInteger bigInteger, BigInteger bigInteger2) {
        boolean bl2 = bigInteger.signum() != bigInteger2.signum();
        bigInteger = bigInteger.abs();
        bigInteger2 = bigInteger2.abs();
        bigInteger = bigInteger.add(bigInteger2.shiftRight(1)).divide(bigInteger2);
        if (bl2) {
            return bigInteger.negate();
        }
        return bigInteger;
    }

    private static j[] a(d d2) {
        Object object;
        BigInteger bigInteger = d2.f().a();
        BigInteger bigInteger2 = bigInteger.divide(c.d);
        SecureRandom secureRandom = new SecureRandom();
        while (((BigInteger)(object = org.bouncycastle.e.c.a(c.c, bigInteger.subtract(c.c), secureRandom).modPow(bigInteger2, bigInteger))).equals(c.b)) {
        }
        object = d2.a((BigInteger)object);
        return new j[]{object, ((j)object).e()};
    }

    private static BigInteger a(BigInteger bigInteger) {
        BigInteger bigInteger2 = bigInteger;
        BigInteger bigInteger3 = bigInteger2.shiftRight(bigInteger2.bitLength() / 2);
        BigInteger bigInteger4;
        while (!(bigInteger4 = bigInteger3.add(bigInteger.divide(bigInteger3)).shiftRight(1)).equals(bigInteger3)) {
            bigInteger3 = bigInteger4;
        }
        return bigInteger4;
    }

    private static void b(BigInteger[] bigIntegerArray) {
        BigInteger bigInteger = bigIntegerArray[0];
        bigIntegerArray[0] = bigIntegerArray[1];
        bigIntegerArray[1] = bigInteger;
    }
}

