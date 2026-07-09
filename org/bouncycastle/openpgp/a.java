/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.openpgp;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Inflater;
import org.bouncycastle.b.h;
import org.bouncycastle.openpgp.b;
import org.bouncycastle.openpgp.c;
import org.bouncycastle.openpgp.m;

public final class a {
    private h a;

    public a(org.bouncycastle.b.c c2) {
        this.a = (h)c2.b();
    }

    public final InputStream a() {
        if (this.a.a() == 0) {
            return this.a.b();
        }
        if (this.a.a() == 1) {
            a a2 = this;
            return new b(a2, a2.a.b(), new Inflater(true));
        }
        if (this.a.a() == 2) {
            a a3 = this;
            return new c(a3, a3.a.b());
        }
        if (this.a.a() == 3) {
            try {
                return new org.bouncycastle.a.a.b(this.a.b());
            } catch (IOException iOException) {
                throw new m("I/O problem with stream: ".concat(String.valueOf(iOException)), iOException);
            }
        }
        throw new m("can't recognise compression algorithm: " + this.a.a());
    }
}

