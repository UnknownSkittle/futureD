/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import org.bouncycastle.asn1.be;
import org.bouncycastle.asn1.bg;
import org.bouncycastle.asn1.bq;
import org.bouncycastle.asn1.br;
import org.bouncycastle.asn1.util.a;
import org.bouncycastle.asn1.v;
import org.bouncycastle.asn1.x;

final class at {
    private static v a = new be();
    private static x b = new bg();

    static v a(a a2) {
        if (a2.a() <= 0) {
            return a;
        }
        return new bq(a2);
    }

    static x b(a a2) {
        if (a2.a() <= 0) {
            return b;
        }
        return new br(a2);
    }
}

