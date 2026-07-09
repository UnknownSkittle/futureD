/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.b;

import java.io.IOException;
import org.bouncycastle.asn1.ba;
import org.bouncycastle.asn1.p;
import org.bouncycastle.d.a.e;
import org.bouncycastle.d.c.a.b;

public final class a
implements b {
    private final org.bouncycastle.d.b.b.a a;

    public a(org.bouncycastle.asn1.f.b b2) {
        this.a = new org.bouncycastle.d.b.b.a(org.bouncycastle.d.c.b.b.a.a(p.a(b2.b()).c()));
    }

    public final boolean equals(Object object) {
        if (object == null || !(object instanceof a)) {
            return false;
        }
        object = (a)object;
        short[] sArray = this.a.b();
        short[] sArray2 = ((a)object).a.b();
        object = sArray;
        if (sArray != sArray2) {
            if (object == null || sArray2 == null) {
                return false;
            }
            if (((Object)object).length != sArray2.length) {
                return false;
            }
            for (int i2 = 0; i2 != ((Object)object).length; ++i2) {
                if (object[i2] == sArray2[i2]) continue;
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return org.bouncycastle.e.a.a(this.a.b());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            org.bouncycastle.asn1.j.a a2 = new org.bouncycastle.asn1.j.a(e.f);
            short[] sArray = this.a.b();
            byte[] byArray = new byte[sArray.length << 1];
            for (int i2 = 0; i2 != sArray.length; ++i2) {
                int n2 = i2 << 1;
                byte[] byArray2 = byArray;
                short s2 = sArray[i2];
                byArray2[n2] = (byte)s2;
                byArray2[++n2] = (byte)(s2 >>> 8);
            }
            return new org.bouncycastle.asn1.f.b(a2, new ba(byArray)).j();
        } catch (IOException iOException) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    private static short[] a(byte[] byArray) {
        short[] sArray = new short[byArray.length / 2];
        for (int i2 = 0; i2 != sArray.length; ++i2) {
            int n2 = i2 << 1;
            byte[] byArray2 = byArray;
            sArray[i2] = (short)(byArray[n2] & 0xFF | (byArray2[++n2] & 0xFF) << 8);
        }
        return sArray;
    }
}

