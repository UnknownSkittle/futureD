/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp.b;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.d.b;
import org.bouncycastle.asn1.n;
import org.bouncycastle.b.aa;
import org.bouncycastle.b.l;
import org.bouncycastle.e.a.f;
import org.bouncycastle.openpgp.b.a;
import org.bouncycastle.openpgp.m;

public final class t {
    private static final byte[] a = f.a("416E6F6E796D6F75732053656E64657220202020");

    public static String a(aa object) {
        object = (l)((aa)object).d();
        switch (((l)object).b()) {
            case 8: {
                return "ECCDHwithSHA256CKDF";
            }
            case 9: {
                return "ECCDHwithSHA384CKDF";
            }
            case 10: {
                return "ECCDHwithSHA512CKDF";
            }
        }
        throw new IllegalArgumentException("Unknown hash algorithm specified: " + ((l)object).b());
    }

    public static n a(int n2) {
        switch (n2) {
            case 7: {
                return b.p;
            }
            case 8: {
                return b.q;
            }
            case 9: {
                return b.r;
            }
        }
        throw new m("unknown symmetric algorithm ID: ".concat(String.valueOf(n2)));
    }

    public static byte[] a(aa aa2, a a2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l l2 = (l)aa2.d();
        byte[] byArray = l2.e().j();
        byteArrayOutputStream.write(byArray, 1, byArray.length - 1);
        byteArrayOutputStream.write(aa2.b());
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(l2.b());
        byteArrayOutputStream.write(l2.c());
        byteArrayOutputStream.write(a);
        byteArrayOutputStream.write(a2.a(aa2));
        return byteArrayOutputStream.toByteArray();
    }
}

