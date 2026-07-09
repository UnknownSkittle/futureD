/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.apache.commons.compress.archivers.g;

import java.io.Serializable;
import java.math.BigInteger;
import org.apache.commons.compress.archivers.g.au;
import org.apache.commons.compress.archivers.g.ax;
import org.apache.commons.compress.archivers.g.ay;

public class af
implements Serializable,
Cloneable,
au {
    private static final ax a = new ax(30837);
    private static final ax b = new ax(0);
    private static final BigInteger c = BigInteger.valueOf(1000L);
    private int d = 1;
    private BigInteger e;
    private BigInteger f;

    public af() {
        this.b();
    }

    @Override
    public final ax a() {
        return a;
    }

    @Override
    public final ax f() {
        byte[] byArray = af.a(this.e.toByteArray());
        int n2 = byArray == null ? 0 : byArray.length;
        byArray = af.a(this.f.toByteArray());
        int n3 = byArray == null ? 0 : byArray.length;
        return new ax(n2 + 3 + n3);
    }

    @Override
    public final ax d() {
        return b;
    }

    @Override
    public final byte[] e() {
        byte[] byArray = this.e.toByteArray();
        byte[] byArray2 = this.f.toByteArray();
        int n2 = (byArray = af.a(byArray)) != null ? byArray.length : 0;
        byArray2 = af.a(byArray2);
        int n3 = byArray2 != null ? byArray2.length : 0;
        byte[] byArray3 = new byte[n2 + 3 + n3];
        if (byArray != null) {
            ay.a(byArray);
        }
        if (byArray2 != null) {
            ay.a(byArray2);
        }
        byArray3[0] = ay.a(this.d);
        byArray3[1] = ay.a(n2);
        if (byArray != null) {
            System.arraycopy(byArray, 0, byArray3, 2, n2);
        }
        int n4 = n2 + 2;
        byArray3[n4++] = ay.a(n3);
        if (byArray2 != null) {
            System.arraycopy(byArray2, 0, byArray3, n4, n3);
        }
        return byArray3;
    }

    @Override
    public final byte[] c() {
        return new byte[0];
    }

    @Override
    public final void a(byte[] byArray, int n2, int n3) {
        this.b();
        this.d = ay.a(byArray[n2++]);
        n3 = ay.a(byArray[n2++]);
        byte[] byArray2 = new byte[n3];
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        n2 += n3;
        this.e = new BigInteger(1, ay.a(byArray2));
        n3 = ay.a(byArray[n2++]);
        byArray2 = new byte[n3];
        System.arraycopy(byArray, n2, byArray2, 0, n3);
        this.f = new BigInteger(1, ay.a(byArray2));
    }

    private void b() {
        this.e = c;
        this.f = c;
    }

    public String toString() {
        return "0x7875 Zip Extra Field: UID=" + this.e + " GID=" + this.f;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object object) {
        if (object instanceof af) {
            object = (af)object;
            return this.d == ((af)object).d && this.e.equals(((af)object).e) && this.f.equals(((af)object).f);
        }
        return false;
    }

    public int hashCode() {
        return -1234567 * this.d ^ Integer.rotateLeft(this.e.hashCode(), 16) ^ this.f.hashCode();
    }

    private static byte[] a(byte[] byArray) {
        int n2;
        if (byArray == null) {
            return byArray;
        }
        int n3 = 0;
        byte[] byArray2 = byArray;
        int n4 = byArray.length;
        for (n2 = 0; n2 < n4 && byArray2[n2] == 0; ++n2) {
            ++n3;
        }
        byte[] byArray3 = new byte[Math.max(1, byArray.length - n3)];
        n2 = byArray3.length - (byArray.length - n3);
        System.arraycopy(byArray, n3, byArray3, n2, byArray3.length - n2);
        return byArray3;
    }
}

