/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.bouncycastle.asn1.af;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.f;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.r;

public final class ae
extends p {
    private final int b;
    private final p[] c;

    private static byte[] a(p[] pArray) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != pArray.length; ++i2) {
            try {
                ba ba2 = (ba)pArray[i2];
                byteArrayOutputStream.write(ba2.c());
                continue;
            } catch (ClassCastException classCastException) {
                throw new IllegalArgumentException(pArray[i2].getClass().getName() + " found in input should only contain DEROctetString");
            } catch (IOException iOException) {
                throw new IllegalArgumentException("exception converting octets " + iOException.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public ae(byte[] byArray) {
        this(byArray, 0);
    }

    public ae(p[] pArray) {
        this(pArray, 0);
    }

    private ae(byte[] byArray, byte by2) {
        this(byArray, null);
    }

    private ae(p[] pArray, byte by2) {
        this(ae.a(pArray), pArray);
    }

    private ae(byte[] byArray, p[] pArray) {
        super(byArray);
        this.c = pArray;
        this.b = 1000;
    }

    public final byte[] c() {
        return this.a;
    }

    public final Enumeration i() {
        if (this.c == null) {
            ae ae2 = this;
            Vector<ba> vector = new Vector<ba>();
            for (int i2 = 0; i2 < ae2.a.length; i2 += 1000) {
                int n2 = i2 + 1000 > ae2.a.length ? ae2.a.length : i2 + 1000;
                byte[] byArray = new byte[n2 - i2];
                System.arraycopy(ae2.a, i2, byArray, 0, byArray.length);
                vector.addElement(new ba(byArray));
            }
            return vector.elements();
        }
        return new af(this);
    }

    final boolean a() {
        return true;
    }

    final int e() {
        int n2 = 0;
        Enumeration enumeration = this.i();
        while (enumeration.hasMoreElements()) {
            n2 += ((f)enumeration.nextElement()).h().e();
        }
        return n2 + 2 + 2;
    }

    public final void a(r r2) {
        r2.b(36);
        r2.b(128);
        Enumeration enumeration = this.i();
        while (enumeration.hasMoreElements()) {
            r2.a((f)enumeration.nextElement());
        }
        r2.b(0);
        r2.b(0);
    }

    static /* synthetic */ p[] a(ae ae2) {
        return ae2.c;
    }
}

