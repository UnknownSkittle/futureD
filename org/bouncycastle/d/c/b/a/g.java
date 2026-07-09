/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.a;

import org.bouncycastle.asn1.ay;
import org.bouncycastle.asn1.d.b;
import org.bouncycastle.asn1.e.a;
import org.bouncycastle.crypto.b.e;
import org.bouncycastle.crypto.b.f;
import org.bouncycastle.crypto.b.h;
import org.bouncycastle.crypto.b.j;

final class g {
    static org.bouncycastle.asn1.j.a a(String string) {
        if (string.equals("SHA-1")) {
            return new org.bouncycastle.asn1.j.a(a.a, ay.a);
        }
        if (string.equals("SHA-224")) {
            return new org.bouncycastle.asn1.j.a(b.f, ay.a);
        }
        if (string.equals("SHA-256")) {
            return new org.bouncycastle.asn1.j.a(b.c, ay.a);
        }
        if (string.equals("SHA-384")) {
            return new org.bouncycastle.asn1.j.a(b.d, ay.a);
        }
        if (string.equals("SHA-512")) {
            return new org.bouncycastle.asn1.j.a(b.e, ay.a);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(String.valueOf(string)));
    }

    static org.bouncycastle.crypto.j a(org.bouncycastle.asn1.j.a a2) {
        if (a2.a().equals(a.a)) {
            return new e();
        }
        if (a2.a().equals(b.f)) {
            return new f();
        }
        if (a2.a().equals(b.c)) {
            return new org.bouncycastle.crypto.b.g();
        }
        if (a2.a().equals(b.d)) {
            return new h();
        }
        if (a2.a().equals(b.e)) {
            return new j();
        }
        throw new IllegalArgumentException("unrecognised OID in digest algorithm identifier: " + a2.a());
    }
}

