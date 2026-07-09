/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.bz;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.t;
import org.bouncycastle.asn1.u;
import org.bouncycastle.e.a;

public final class bl
extends u {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final byte[] b;

    public bl(byte[] byArray) {
        this.b = org.bouncycastle.e.a.d(byArray);
    }

    private String b() {
        StringBuffer stringBuffer = new StringBuffer("#");
        Object object = new ByteArrayOutputStream();
        r r2 = new r((OutputStream)object);
        try {
            r2.a((f)this);
        } catch (IOException iOException) {
            throw new t("internal error encoding UniversalString");
        }
        object = ((ByteArrayOutputStream)object).toByteArray();
        for (int i2 = 0; i2 != ((Object)object).length; ++i2) {
            stringBuffer.append(a[object[i2] >>> 4 & 0xF]);
            stringBuffer.append(a[object[i2] & 0xF]);
        }
        return stringBuffer.toString();
    }

    public final String toString() {
        return this.b();
    }

    final boolean a() {
        return false;
    }

    final int e() {
        return 1 + bz.a(this.b.length) + this.b.length;
    }

    final void a(r r2) {
        r2.a(28, org.bouncycastle.e.a.d(this.b));
    }

    final boolean a(u u2) {
        if (!(u2 instanceof bl)) {
            return false;
        }
        return org.bouncycastle.e.a.a(this.b, ((bl)u2).b);
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.c(this.b);
    }
}

