/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bouncycastle.asn1.aq;
import org.bouncycastle.asn1.bo;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;

public abstract class c
extends u {
    private static final char[] c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected final byte[] a;
    protected final int b;

    public c(byte[] byArray, int n2) {
        if (byArray == null) {
            throw new NullPointerException("data cannot be null");
        }
        if (byArray.length == 0 && n2 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (n2 > 7 || n2 < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.a = org.bouncycastle.e.a.d(byArray);
        this.b = n2;
    }

    private String i() {
        StringBuffer stringBuffer = new StringBuffer("#");
        Object object = new ByteArrayOutputStream();
        r r2 = new r((OutputStream)object);
        try {
            r2.a((f)this);
        } catch (IOException iOException) {
            throw new t("Internal error encoding BitString: " + iOException.getMessage(), iOException);
        }
        object = ((ByteArrayOutputStream)object).toByteArray();
        for (int i2 = 0; i2 != ((Object)object).length; ++i2) {
            stringBuffer.append(c[object[i2] >>> 4 & 0xF]);
            stringBuffer.append(c[object[i2] & 0xF]);
        }
        return stringBuffer.toString();
    }

    public final byte[] b() {
        if (this.b != 0) {
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        }
        return org.bouncycastle.e.a.d(this.a);
    }

    public final byte[] c() {
        return org.bouncycastle.asn1.c.a(this.a, this.b);
    }

    public final int d() {
        return this.b;
    }

    public String toString() {
        return this.i();
    }

    public int hashCode() {
        return this.b ^ org.bouncycastle.e.a.c(this.c());
    }

    protected final boolean a(u u2) {
        if (!(u2 instanceof c)) {
            return false;
        }
        u2 = (c)u2;
        return this.b == ((c)u2).b && org.bouncycastle.e.a.a(this.c(), ((c)u2).c());
    }

    protected static byte[] a(byte[] byArray, int n2) {
        byte[] byArray2 = org.bouncycastle.e.a.d(byArray);
        if (n2 > 0) {
            int n3 = byArray.length - 1;
            byArray2[n3] = (byte)(byArray2[n3] & 255 << n2);
        }
        return byArray2;
    }

    static c a(int n2, InputStream inputStream) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int n3 = inputStream.read();
        byte[] byArray = new byte[n2 - 1];
        if (byArray.length != 0) {
            if (org.bouncycastle.e.b.a.a(inputStream, byArray) != byArray.length) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (n3 > 0 && n3 < 8 && byArray[byArray.length - 1] != (byte)(byArray[byArray.length - 1] & 255 << n3)) {
                return new bo(byArray, n3);
            }
        }
        return new aq(byArray, n3);
    }

    final u f() {
        return new aq(this.a, this.b);
    }

    final u g() {
        return new bo(this.a, this.b);
    }

    abstract void a(r var1);
}

