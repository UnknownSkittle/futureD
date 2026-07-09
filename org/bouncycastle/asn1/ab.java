/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.m;
import org.bouncycastle.asn1.r;
import org.bouncycastle.asn1.t;

public final class ab
extends a {
    public ab(int n2, org.bouncycastle.asn1.util.a a2) {
        super(true, n2, ab.a(a2));
    }

    private static byte[] a(org.bouncycastle.asn1.util.a a2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != a2.a(); ++i2) {
            try {
                byteArrayOutputStream.write(((m)a2.a(i2)).a("BER"));
                continue;
            } catch (IOException iOException) {
                throw new t("malformed object: ".concat(String.valueOf(iOException)), iOException);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    final void a(r r2) {
        int n2 = 64;
        if (this.a) {
            n2 = 96;
        }
        r2.a(n2, this.b);
        r2.b(128);
        r2.a(this.c);
        r2.b(0);
        r2.b(0);
    }
}

