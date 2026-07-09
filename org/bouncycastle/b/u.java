/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package org.bouncycastle.b;

import org.bouncycastle.b.c;
import org.bouncycastle.b.t;
import org.bouncycastle.e.k;

public final class u
extends t {
    private int a;
    private byte[] b;
    private long c;

    u(c c2) {
        super(c2);
        this.a = c2.read();
        int n2 = c2.read();
        this.b = new byte[n2];
        for (n2 = 0; n2 != this.b.length; ++n2) {
            this.b[n2] = (byte)c2.read();
        }
        this.c = (long)c2.read() << 24 | (long)(c2.read() << 16) | (long)(c2.read() << 8) | (long)c2.read();
    }

    public final String a() {
        return k.a(this.b);
    }
}

