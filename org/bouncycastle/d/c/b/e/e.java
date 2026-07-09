/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.d.c.b.e;

import org.bouncycastle.asn1.d.b;
import org.bouncycastle.asn1.n;
import org.bouncycastle.crypto.b.g;
import org.bouncycastle.crypto.b.l;
import org.bouncycastle.crypto.j;

final class e {
    static j a(n n2) {
        if (n2.equals(b.c)) {
            return new g();
        }
        if (n2.equals(b.e)) {
            return new org.bouncycastle.crypto.b.j();
        }
        if (n2.equals(b.m)) {
            return new l(128);
        }
        if (n2.equals(b.n)) {
            return new l(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: ".concat(String.valueOf(n2)));
    }
}

