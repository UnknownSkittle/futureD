/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.asn1;

import java.io.InputStream;
import org.bouncycastle.asn1.bv;

abstract class by
extends InputStream {
    protected final InputStream a;
    private int b;

    by(InputStream inputStream, int n2) {
        this.a = inputStream;
        this.b = n2;
    }

    int a() {
        return this.b;
    }

    protected final void c() {
        if (this.a instanceof bv) {
            ((bv)this.a).a(true);
        }
    }
}

