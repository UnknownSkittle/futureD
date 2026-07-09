/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.c;

final class aa {
    private final BigInteger a;
    private final int b;

    public aa(BigInteger bigInteger, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.a = bigInteger;
        this.b = n2;
    }

    public final aa a(aa aa2) {
        aa aa3 = aa2;
        if (this.b != aa3.b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
        return new aa(this.a.add(aa2.a), this.b);
    }

    public final aa b(aa aa2) {
        return this.a(new aa(aa2.a.negate(), aa2.b));
    }

    public final aa a(BigInteger bigInteger) {
        return new aa(this.a.subtract(bigInteger.shiftLeft(this.b)), this.b);
    }

    public final int b(BigInteger bigInteger) {
        return this.a.compareTo(bigInteger.shiftLeft(this.b));
    }

    private BigInteger c() {
        return this.a.shiftRight(this.b);
    }

    public final BigInteger a() {
        aa aa2 = new aa(c.b, 1);
        int n2 = this.b;
        if (n2 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        return this.a(n2 == aa2.b ? aa2 : new aa(aa2.a.shiftLeft(n2 - aa2.b), n2)).c();
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        int n2;
        if (this.b == 0) {
            return this.a.toString();
        }
        Object object = this.c();
        Object object2 = this.a.subtract(((BigInteger)object).shiftLeft(this.b));
        if (this.a.signum() == -1) {
            object2 = c.b.shiftLeft(this.b).subtract((BigInteger)object2);
        }
        if (((BigInteger)object).signum() == -1 && !((BigInteger)object2).equals(c.a)) {
            object = ((BigInteger)object).add(c.b);
        }
        object = ((BigInteger)object).toString();
        char[] cArray = new char[this.b];
        object2 = ((BigInteger)object2).toString(2);
        int n3 = ((String)object2).length();
        int n4 = this.b - n3;
        for (n2 = 0; n2 < n4; ++n2) {
            cArray[n2] = 48;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            cArray[n4 + n2] = ((String)object2).charAt(n2);
        }
        String string = new String(cArray);
        object = new StringBuffer((String)object);
        ((StringBuffer)object).append(".");
        ((StringBuffer)object).append(string);
        return ((StringBuffer)object).toString();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof aa)) {
            return false;
        }
        object = (aa)object;
        return this.a.equals(((aa)object).a) && this.b == ((aa)object).b;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b;
    }
}

