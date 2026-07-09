/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.crypto;

import org.bouncycastle.asn1.k.aa;
import org.bouncycastle.crypto.i.c;
import org.bouncycastle.crypto.i.e;

public final class h {
    public static final h a;
    public static final h b;
    private final String c;
    private final Class d;

    private h(String string, Class clazz) {
        this.c = string;
        this.d = clazz;
    }

    static /* synthetic */ String a(h h2) {
        return h2.c;
    }

    static /* synthetic */ Class b(h h2) {
        return h2.d;
    }

    static {
        new h("ecImplicitlyCA", aa.class);
        a = new h("dhDefaultParams", c.class);
        b = new h("dsaDefaultParams", e.class);
    }
}

